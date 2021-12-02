package com.gui.wgui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class WguiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WguiApplication.class, args);
	}

	@RequestMapping("/index")
	public String index() {
		return "home";
	}

	@RequestMapping("/finish")
	public String finish() {
		return "finish";
	}

	@RequestMapping("/metadata")
	public String metadata() {
		return "metadata";
	}

	@RequestMapping("/sections")
	public String sections() {
		return "sections";
	}
}