package com.jomo.eorganism.metamodel.web;

import com.jomo.eorganism.metamodel.web.repository.ApplicationRepository;
import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.entity.ComponentEntity;
import com.jomo.eorganism.metamodel.web.entity.DatabaseEntity;
import com.jomo.eorganism.metamodel.web.entity.SystemEntity;
import com.jomo.eorganism.metamodel.web.entity.DomainEntity;
import com.jomo.eorganism.metamodel.web.repository.ComponentRepository;
import com.jomo.eorganism.metamodel.web.repository.DatabaseRepository;
import com.jomo.eorganism.metamodel.web.repository.SystemRepository;
import com.jomo.eorganism.metamodel.web.repository.DomainRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MetamodelWebApplication {
	private static final Logger log = LoggerFactory.getLogger(MetamodelWebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MetamodelWebApplication.class, args);
		java.lang.System.out.println("Hello MetamodelWebApplication!");
		java.lang.System.out.println("######Jomo MetamodelWebApplication is UP and RUNNING#####");
	}

	@Bean
	public CommandLineRunner loadApplications(ApplicationRepository applicationRepository, ComponentRepository componentRepository, DatabaseRepository databaseRepository, DomainRepository domainRepository, SystemRepository systemRepository) {

		return (args) -> {
			ApplicationEntity applicationEntityWorker;
			ComponentEntity componentEntityWorker;
			DatabaseEntity databaseEntityWorker;
			SystemEntity systemEntityWorker;
			DomainEntity domainEntityWorker;
			//1
			applicationEntityWorker = new ApplicationEntity("Jomo Trackzilla", "Defect Tracking", "Jomo Trackzilla Defect tracking Application for tracking bugs");

			componentEntityWorker = new ComponentEntity("Jomo Trackzilla Web", "Defect Tracking", "Jomo Trackzilla Web GUI Admin component");
			databaseEntityWorker = new DatabaseEntity("Jomo Trackzilla Database", "Oracle Cloud", "Jomo Trackzilla Database");
			domainEntityWorker = new DomainEntity("Billing Domain", "Billing", "Business Banking Billing Domain");
			systemEntityWorker = new SystemEntity("CRM", "Critical", "CRM Customer Relationship System");

			componentEntityWorker.setApplicationId(1L);
			systemEntityWorker.setDomainId(1L);

			applicationRepository.save(applicationEntityWorker);
			componentRepository.save(componentEntityWorker);
			databaseRepository.save(databaseEntityWorker);
			systemRepository.save(systemEntityWorker);
			systemRepository.save(systemEntityWorker);

			for (ApplicationEntity applicationEntity : applicationRepository.findAll()) {
				log.info("The application is: " + applicationEntity.toString());
			}

			for (ComponentEntity componentEntity : componentRepository.findAll()) {
				log.info("The component is: " + componentEntity.toString());
			}

			for (DatabaseEntity databaseEntity : databaseRepository.findAll()) {
				log.info("The database is: " + databaseEntity.toString());
			}

			for (SystemEntity systemEntity : systemRepository.findAll()) {
				log.info("The system is: " + systemEntity.toString());
			}
		};
	}//


}
