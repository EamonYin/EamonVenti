package eamon.springcloud.account.service.impl;

import eamon.springcloud.account.entity.Account;
import eamon.springcloud.account.mapper.AccountMapper;
import eamon.springcloud.account.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
@Slf4j
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    @Transactional
    public void debit(String userId, int money) {
        log.info("开始扣款");
        try {
            accountMapper.debit(userId, money);
        } catch (Exception e) {
            throw new RuntimeException("扣款失败，可能是余额不足！");
        }
        log.info("扣款成功");
    }
}
