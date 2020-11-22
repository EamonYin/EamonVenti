package com.eamonventi.consumer.Controller;

import com.eamonventi.consumer.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author:YiMing
 * @create:2020/11/22,17:16
 * @version:1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable Long id){
        /*User user=new User();
        user.setId(id);
        user.setName("小名");
        user.setAge(2);
        return user;*/
        return restTemplate.getForObject("http://produce/user/getUser/"+id,User.class);
    }
    @GetMapping(value = "/getName")
    public String getName(){
        return "小名";
    }
}
