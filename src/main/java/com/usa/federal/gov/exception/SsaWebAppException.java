package com.usa.federal.gov.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class SsaWebAppException {
	@ExceptionHandler(value = { HandleException.class })
	public String handleException(Model model) {
		model.addAttribute("ExceptionDetail", "something went wrong. Try after sometime........!");
		return "exception";
	}
}
