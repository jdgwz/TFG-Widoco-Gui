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
    public String index(){
        return "home";
    }
}