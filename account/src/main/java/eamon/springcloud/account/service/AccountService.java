package eamon.springcloud.account.service;

import eamon.springcloud.account.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
public interface AccountService extends IService<Account> {
    /**
     * 从用户账户中借出
     */
    void debit(String userId, int money);
}
