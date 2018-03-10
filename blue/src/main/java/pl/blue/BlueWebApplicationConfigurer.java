package pl.blue;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BlueWebApplicationConfigurer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {BlueAppConfigurer.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {BlueWebConfigurer.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
