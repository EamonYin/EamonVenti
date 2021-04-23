package eamon.springcloud.storage.mapper;

import eamon.springcloud.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
public interface StorageMapper extends BaseMapper<Storage> {
    @Update("update storage set `count` = `count` - #{count} where commodity_code = #{code}")
    int deduct(@Param("code") String commodityCode, @Param("count") int count);
}
