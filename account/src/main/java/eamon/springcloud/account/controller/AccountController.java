package eamon.springcloud.account.controller;


import eamon.springcloud.account.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PutMapping("/{userId}/{money}")
    public ResponseEntity<Void> debit(@PathVariable("userId") String userId, @PathVariable("money") Integer money) {
        accountService.debit(userId, money);
        return ResponseEntity.noContent().build();
    }
}

