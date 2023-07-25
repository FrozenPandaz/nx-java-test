package com.nxapi.app.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

	@RequestMapping("/")
	public String hello() {
        return this.helloService.getGreeting();
	}

}
