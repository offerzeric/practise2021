package com.eric.project.controller;


import com.eric.project.pojo.Person;
import com.eric.project.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author ericzhang 2021/11/12 12:56 下午
 */
@RestController
public class HelloController {
    @Autowired
    private Person person;
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public void helloController() throws ClassNotFoundException {
        helloService.Hello();
    }

    @RequestMapping("/mysql")
    public void mysqlController(){
        helloService.Mysql();
    }

}
