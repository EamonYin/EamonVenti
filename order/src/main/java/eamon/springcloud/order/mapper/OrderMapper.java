package eamon.springcloud.order.mapper;

import eamon.springcloud.order.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
@Mapper
@Repository
public interface OrderMapper extends BaseMapper<Order> {
    @Insert("INSERT INTO `order` (`id`,`user_id`,`commodity_code`,`count`,`money`) VALUES(NULL, #{userId}, #{commodityode}, #{count}, #{money})")
    Long create(Order order);
}
