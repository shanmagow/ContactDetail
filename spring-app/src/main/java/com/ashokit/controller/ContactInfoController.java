package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.dto.ContactDto;
import com.ashokit.service.ContactService;

@Controller
public class ContactInfoController {
	@Autowired
	private ContactService contactservice;
	@GetMapping("/")
	public String index(Model model) {
		ContactDto contactdto = new ContactDto();
		model.addAttribute("c",contactdto);
		//model.addAttribute("contact",contactdto);
		return "index";
		}
	
	@PostMapping("/savecontact")
	public String handleSubbtn(@ModelAttribute("contact")ContactDto c,Model model) {
		boolean isBoolean=contactservice.saveContacts(c);
		
		if(isBoolean) {
			model.addAttribute("succMsg", "Saved");
		}
		else
			model.addAttribute("errMsg", "Unsaved");
		return "index";
		}
	
	public String handleViewHypLink(Model model) {
		return null;}

}
