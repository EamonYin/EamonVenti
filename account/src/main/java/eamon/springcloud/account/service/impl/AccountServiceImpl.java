package eamon.springcloud.account.service.impl;

import eamon.springcloud.account.entity.Account;
import eamon.springcloud.account.mapper.AccountMapper;
import eamon.springcloud.account.service.AccountService;
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
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
