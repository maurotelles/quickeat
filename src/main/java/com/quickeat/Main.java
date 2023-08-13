package com.quickeat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Main {

	@GetMapping("/main")
	@ResponseBody
	public String inicio() {

		return "inicio";
	}

}
