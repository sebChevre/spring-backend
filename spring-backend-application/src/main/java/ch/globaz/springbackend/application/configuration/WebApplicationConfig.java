package ch.globaz.springbackend.application.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Configuration pour le déploiement web en mode production
 */
@Configuration
@Profile("prod")
@PropertySource("file:/home/tomcat/avs4/conf/application-prod.properties")
public class WebApplicationConfig {
}
