package com.tap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String firstRequest() {
        return "index";  // This will resolve to static/index.html
    }

    @RequestMapping("/projects")
    public String showProjects() {
        return "projects";  // This will resolve to static/projects.html
    }

    @RequestMapping("/education")
    public String showEducation() {
        return "education";  // This will resolve to static/education.html
    }
}
