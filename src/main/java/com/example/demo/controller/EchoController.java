package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.annotation.Validated;

import com.example.demo.model.EchoModel;

@Controller
@RequestMapping("/echo")
public class EchoController {
	
	@ModelAttribute
	public EchoModel createEchoModel() {
		EchoModel form = new EchoModel();
		return form;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String echo(EchoModel form, Model model) {
		model.addAttribute("val", form.getVal());
		return "echo";
	}
}


