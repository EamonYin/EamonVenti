package eamon.springcloud.account.mapper;

import eamon.springcloud.account.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
public interface AccountMapper extends BaseMapper<Account> {
    @Update("update account set money = money - ${money} where user_id = #{userId}")
    int debit(@Param("userId") String userId, @Param("money") int money);
}
