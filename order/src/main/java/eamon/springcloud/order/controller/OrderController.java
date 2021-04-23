package eamon.springcloud.order.controller;


import eamon.springcloud.order.entity.Order;
import eamon.springcloud.order.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Eamon
 * @since 2021-04-23
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    /*private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }*/

    @Resource
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Long> createOrder(Order order) {
        Long orderId = orderService.create(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderId);
    }
}

