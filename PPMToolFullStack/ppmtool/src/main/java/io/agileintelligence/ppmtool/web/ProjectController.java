package io.agileintelligence.ppmtool.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.agileintelligence.ppmtool.services.ProjectService;

@RequestMapping("/api/project")
@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	//@PostMapping("")
	
}
