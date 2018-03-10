package pl.blue.services;

public class AppIssueService implements IssuesService {

	@Override
	public String getIssue() {
		return "Issue from app";
	}

}
