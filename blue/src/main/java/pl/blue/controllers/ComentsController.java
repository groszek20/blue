package pl.blue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.blue.services.IssuesService;

@Controller
@RequestMapping("/comments")
public class ComentsController {

	private IssuesService issuesService;

	@Autowired
	public ComentsController(IssuesService issuesService) {
		super();
		this.issuesService = issuesService;
	}

	@RequestMapping("/**")
	@ResponseBody
	public String test() {
		return "comment";
	}
}
