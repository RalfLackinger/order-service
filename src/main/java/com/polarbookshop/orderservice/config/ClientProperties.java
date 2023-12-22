package com.polarbookshop.orderservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;
import javax.validation.constraints.NotNull;

@ConfigurationProperties(prefix = "polar")
public record ClientProperties(

		@NotNull
		URI catalogServiceUri

) {}
