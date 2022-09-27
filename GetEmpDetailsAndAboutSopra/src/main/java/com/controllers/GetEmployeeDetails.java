package com.controllers;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.storage.Employee;
import com.dboperations.CRUD;

@Controller
@RequestMapping("/task")
public class GetEmployeeDetails {
	
	CRUD crud=new CRUD();
	@RequestMapping("/empdet")
	public String empdetails(@RequestParam(name="empId",required=true,defaultValue="704771") int empId,Model m) {
		System.out.println(empId);
		Employee emp=crud.getDetails(empId);
//		System.out.println(emp.toString());
		m.addAttribute("emp",emp);
		
		return "empdetails";
	}
	@RequestMapping(value="/aboutSopra",method = RequestMethod.GET)
	public ModelAndView getAboutSopra() {
		return new ModelAndView("redirect:" + "https://www.soprasteria.com/about-us");
	}
}
