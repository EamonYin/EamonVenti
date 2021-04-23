package eamon.springcloud.order.service.impl;

import eamon.springcloud.order.client.AccountClient;
import eamon.springcloud.order.client.StorageClient;
import eamon.springcloud.order.entity.Order;
import eamon.springcloud.order.mapper.OrderMapper;
import eamon.springcloud.order.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {


    /*private final AccountClient accountClient;
    private final StorageClient storageClient;
    private final OrderMapper orderMapper;*/

    @Resource
    private AccountClient accountClient;
    @Resource
    private StorageClient storageClient;
    @Resource
    private OrderMapper orderMapper;

    /*public OrderServiceImpl(AccountClient accountClient, StorageClient storageClient, OrderMapper orderMapper) {
        this.accountClient = accountClient;
        this.storageClient = storageClient;
        this.orderMapper = orderMapper;
    }*/

    @Override
    @Transactional
    public Long create(Order order) {
        // 创建订单
        orderMapper.insert(order);
        try {
            // 扣库存
            storageClient.deduct(order.getCommodityCode(), order.getCount());
            // 扣款
            accountClient.debit(order.getUserId(), order.getMoney());
        } catch (FeignException e) {
            log.error("下单失败，原因:{}", e.contentUTF8());
            throw new RuntimeException(e.contentUTF8());
        }
        return order.getId();
    }

}
