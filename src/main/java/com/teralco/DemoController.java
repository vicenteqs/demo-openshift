package com.teralco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping
	public String demo() {
		return "¡¡Desplegado en Openshift!!";
	}
}
