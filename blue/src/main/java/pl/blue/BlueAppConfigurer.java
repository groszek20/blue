package pl.blue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.blue.services.AppIssueService;
import pl.blue.services.IssuesService;
import pl.blue.services.WebIssueService;

@Configuration
public class BlueAppConfigurer {

	@Bean
	public IssuesService issuesService() {
		return new AppIssueService();
	}
}
