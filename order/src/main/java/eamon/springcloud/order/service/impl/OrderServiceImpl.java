package eamon.springcloud.order.service.impl;

import eamon.springcloud.order.entity.Order;
import eamon.springcloud.order.mapper.OrderMapper;
import eamon.springcloud.order.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
