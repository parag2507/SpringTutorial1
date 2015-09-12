package asu.edu.sd.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import asu.edu.sd.spring.domain.DimensionCube;
import asu.edu.sd.spring.service.ICubeService;

@Controller
public class HomeController {

	@Autowired
	private ICubeService cubeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView student() {
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("command", new DimensionCube());
		model.addObject("unitList", cubeService.getUnits());
		return model;
	}

	@RequestMapping(value = "/processDimension")
	public String processDimension(@ModelAttribute("SpringWeb") DimensionCube input,
			ModelMap model) {
		
		model.addAttribute("dimension", input.getDimension());
		model.addAttribute("cube", cubeService.getCube(input.getDimension()));

		return "index";
	}
	
	

	
}