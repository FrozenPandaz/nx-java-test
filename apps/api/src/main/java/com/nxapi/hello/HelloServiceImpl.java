package com.nxapi.app.hello;


import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String getGreeting() {
		return "Hello World2222";
	}
}
