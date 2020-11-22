package com.eamonventi.producer.Controller;

import com.eamonventi.producer.Entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author:YiMing
 * @create:2020/11/22,17:16
 * @version:1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable Long id){
        User user=new User();
        user.setId(id);
        user.setName("小名");
        user.setAge(2);
        return user;
    }
    @GetMapping(value = "/getName")
    public String getName(){
        return "小名";
    }
}
