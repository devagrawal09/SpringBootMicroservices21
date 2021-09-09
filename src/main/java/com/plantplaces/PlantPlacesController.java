package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handle the index and start endpoints
 * @author Dev Agrawal
 * @return
 */
@Controller
public class PlantPlacesController {
	
	/**
	 * Handle the index endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	/**
	 * Handle the start endpoint
	 * @return
	 */
	@RequestMapping("/start")
	public String start() {
		
		return "start";
	}
}
