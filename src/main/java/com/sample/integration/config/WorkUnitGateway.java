package com.sample.integration.config;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.sample.integration.domain.WorkUnit;

@MessagingGateway
public interface WorkUnitGateway {
	@Gateway(requestChannel = "worksChannel")
	void generate(WorkUnit workUnit);

}
