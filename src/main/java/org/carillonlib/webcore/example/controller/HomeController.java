/*
 * This file is part of the Carillon Lib Project.
 * More information can be found at http://github.com/carillonlib
 * 
 * This source code has been released to the public domain.
 * For more details, see the exact release terms in the
 * UNLICENSE file, or at http://unlicense.org
 */

package org.carillonlib.webcore.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "default";
	}
}
