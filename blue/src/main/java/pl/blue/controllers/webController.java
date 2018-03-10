package pl.blue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.blue.services.IssuesService;

@Controller
public class webController {

	private IssuesService issuesService;

	@Autowired
	public webController(IssuesService issuesService) {
		super();
		this.issuesService = issuesService;
	}

	@RequestMapping("/issue")
	@ResponseBody
	public String test() {
		return issuesService.getIssue();
	}
}
