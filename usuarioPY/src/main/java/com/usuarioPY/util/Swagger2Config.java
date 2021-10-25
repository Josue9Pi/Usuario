package com.usuarioPY.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Especificación de la configuración
@Configuration
@EnableSwagger2
public class Swagger2Config {


	private static final Logger LOGGER = LoggerFactory.getLogger(Swagger2Config.class);

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.usuarioPy.controller"))
				.paths(PathSelectors.regex("/.*")).build().apiInfo(apiEndPointsInfo());
	}

	//Documentación del api de licencia Bdp 
	private static ApiInfo apiEndPointsInfo() {
		LOGGER.info("Iniciando...");
		return new ApiInfoBuilder().title("API ")
				.description("API REST de consulta ")
				.license("Apache GPLv3").licenseUrl("https://www.gnu.org/licenses/gpl-3.0.html").version("1.0.0")
				.build();
	}
}
