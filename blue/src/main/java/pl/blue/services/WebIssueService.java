package pl.blue.services;

public class WebIssueService implements IssuesService {

	@Override
	public String getIssue() {
		return "Issue from web";
	}

}
