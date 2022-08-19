package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class TestController {

	@Get("/test")
	public String getIt() {
		return "Hello World !!!";
	}

}
