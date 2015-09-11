package asu.edu.sd.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import asu.edu.sd.spring.service.IMoodService;



@Controller
public class HomeController {
	
	@Autowired
	private IMoodService service;
	
	@RequestMapping(value = "/")
	public String home(ModelMap map) {
	    return "index";
	}
	
	@RequestMapping(value = "/reason/{feeling}")
	public ModelAndView reason(@PathVariable("feeling") String feeling) {
	    
		ModelAndView model =  new ModelAndView("index2");
		
		model.getModelMap().put("reason", service.getReasonForMood(feeling));
		
		model.getModelMap().put("success", 0);
		
		return model;
		
	}
}