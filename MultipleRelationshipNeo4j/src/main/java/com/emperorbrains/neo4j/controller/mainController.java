package com.emperorbrains.neo4j.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emperorbrains.neo4j.model.Faculty;
import com.emperorbrains.neo4j.model.Publication;
import com.emperorbrains.neo4j.repo.FacultyRep;
import com.emperorbrains.neo4j.repo.PublicationRep;

@Controller
public class mainController {
	@Autowired
	private FacultyRep facultyRep;
	
	@Autowired
	private PublicationRep publicationRep;
	
	@GetMapping(value = "/")
	public String getMethodName() {
		return "addFaculty";
	}
	
	@PostMapping(value = "addFaculty")
	public ModelAndView postMethodName(@ModelAttribute Faculty entity) {
		facultyRep.save(entity);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping(value = "publication")
	public String getMethodpublication(Model model) {
		model.addAttribute("data",facultyRep.findAll());
		return "addPublication";
	}
	
	@PostMapping(value = "addPublicationSave")
	public ModelAndView postMethodName(@ModelAttribute Publication publication) {
		List<Faculty> list= Arrays.asList(facultyRep.findByEmail(publication.get(0)),facultyRep.findByEmail(publication.get(1)));
		publication.setFacultyName1(list);
		publicationRep.save(publication);
		return new ModelAndView("redirect:publication");
	}


}
