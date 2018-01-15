package ch.globaz.springbackend.application;

import ch.globaz.springbackend.application.configuration.DefaultProfileUtil;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

/**
 * Classe de configuration pour le déploiement en mode war.
 * Remplace la configuration web.xml
 */
@Configuration
public class ApplicationWebInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		DefaultProfileUtil.setProdProfile(application.application());
		return application.sources(Application.class);
	}
}
