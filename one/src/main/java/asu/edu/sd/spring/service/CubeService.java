package asu.edu.sd.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import asu.edu.sd.spring.domain.Cube;
import asu.edu.sd.spring.domain.Dimension;
@Service
public class CubeService implements ICubeService{

	private static List<String> unitsList = new ArrayList<String>();
	
	@PostConstruct
	public void init(){
		unitsList.add("meters");
		unitsList.add("centimeters");
		unitsList.add("yards");
		unitsList.add("inches");
	}
	
	@Override
	public Cube getCube(Dimension dimension) {
		return null;
	}

	@Override
	public List<String> getUnits() {
		return unitsList;
	}
	
	

}
