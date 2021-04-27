package eamon.springcloud.order.mapper;

import eamon.springcloud.order.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
public interface OrderMapper extends BaseMapper<Order> {
    @Insert("INSERT INTO `order` (`id`,`user_id`,`commodity_code`,`count`,`money`) VALUES(NULL, #{userId}, #{commodityode}, #{count}, #{money})")
    Long create(Order order);
}
