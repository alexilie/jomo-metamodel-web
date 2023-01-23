package com.jomo.eorganism.metamodel.web;

import com.jomo.eorganism.metamodel.web.repository.ApplicationRepository;
import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.entity.ComponentEntity;
import com.jomo.eorganism.metamodel.web.entity.DatabaseEntity;
import com.jomo.eorganism.metamodel.web.entity.SystemEntity;
import com.jomo.eorganism.metamodel.web.entity.DomainEntity;
import com.jomo.eorganism.metamodel.web.entity.ReleaseEntity;
import com.jomo.eorganism.metamodel.web.entity.EnvironmentEntity;
import com.jomo.eorganism.metamodel.web.entity.MetadataEntity;
import com.jomo.eorganism.metamodel.web.repository.ComponentRepository;
import com.jomo.eorganism.metamodel.web.repository.DatabaseRepository;
import com.jomo.eorganism.metamodel.web.repository.SystemRepository;
import com.jomo.eorganism.metamodel.web.repository.DomainRepository;
import com.jomo.eorganism.metamodel.web.repository.ReleaseRepository;
import com.jomo.eorganism.metamodel.web.repository.EnvironmentRepository;
import com.jomo.eorganism.metamodel.web.repository.MetadataRepository;
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
	public CommandLineRunner loadApplications(ApplicationRepository applicationRepository,
											  ComponentRepository componentRepository,
											  DatabaseRepository databaseRepository,
											  DomainRepository domainRepository,
											  SystemRepository systemRepository,
											  ReleaseRepository releaseRepository,
											  EnvironmentRepository environmentRepository,
											  MetadataRepository metadataRepository) {

		return (args) -> {
			ApplicationEntity applicationEntityWorker;
			ComponentEntity componentEntityWorker;
			DatabaseEntity databaseEntityWorker;
			SystemEntity systemEntityWorker;
			DomainEntity domainEntityWorker;
			ReleaseEntity releaseEntityWorker;
			EnvironmentEntity environmentEntityWorker;
			MetadataEntity metadataEntityWorker;
			//1
			applicationEntityWorker = new ApplicationEntity("Jomo Metamodel Web", "Defect Tracking", "Jomo Trackzilla Defect tracking Application for tracking bugs");

			componentEntityWorker = new ComponentEntity("Jomo Trackzilla Web", "Defect Tracking", "Jomo Trackzilla Web GUI Admin component");
			databaseEntityWorker = new DatabaseEntity("Jomo Trackzilla Database", "Oracle Cloud", "Jomo Trackzilla Database");
			domainEntityWorker = new DomainEntity("Billing Domain", "Billing", "Business Banking Billing Domain");
			systemEntityWorker = new SystemEntity("CRM", "Critical", "CRM Customer Relationship System");
			releaseEntityWorker = new ReleaseEntity("PROD-HEROKU Metamodel Web", "PROD", "CRM Customer Relationship System");
			environmentEntityWorker = new EnvironmentEntity("ENV-HEROKU", "PROD", "HEROKU Environment");
			metadataEntityWorker = new MetadataEntity("METADATA", "METADATA", "METADATA DESC");

			componentEntityWorker.setApplicationId(1L);
			systemEntityWorker.setDomainId(1L);
			environmentEntityWorker.setReleaseId(1L);

			releaseRepository.save(releaseEntityWorker);
			domainRepository.save(domainEntityWorker);
			environmentRepository.save(environmentEntityWorker);
			applicationRepository.save(applicationEntityWorker);
			componentRepository.save(componentEntityWorker);
			databaseRepository.save(databaseEntityWorker);
			systemRepository.save(systemEntityWorker);

			metadataEntityWorker.setName(releaseEntityWorker.getName());
			metadataEntityWorker.setType(releaseEntityWorker.getMetadataType());
			metadataEntityWorker.setDescription(releaseEntityWorker.getDescription());
			metadataEntityWorker.setOriginalId(releaseEntityWorker.getId());
			metadataEntityWorker.setLastUpdatedApplicationName(releaseEntityWorker.getLastUpdatedApplicationName());
			metadataEntityWorker.setLastUpdatedUserName(releaseEntityWorker.getLastUpdatedUserName());

			metadataRepository.save(metadataEntityWorker);
			//reset
			metadataEntityWorker = new MetadataEntity("METADATA", "METADATA", "METADATA DESC");

			metadataEntityWorker.setName(domainEntityWorker.getName());
			metadataEntityWorker.setType(domainEntityWorker.getMetadataType());
			metadataEntityWorker.setDescription(domainEntityWorker.getDescription());
			metadataEntityWorker.setOriginalId(domainEntityWorker.getId());
			metadataEntityWorker.setLastUpdatedApplicationName(domainEntityWorker.getLastUpdatedApplicationName());
			metadataEntityWorker.setLastUpdatedUserName(domainEntityWorker.getLastUpdatedUserName());

			metadataRepository.save(metadataEntityWorker);
			//reset
			metadataEntityWorker = new MetadataEntity("METADATA", "METADATA", "METADATA DESC");

			metadataEntityWorker.setName(environmentEntityWorker.getName());
			metadataEntityWorker.setType(environmentEntityWorker.getMetadataType());
			metadataEntityWorker.setDescription(environmentEntityWorker.getDescription());
			metadataEntityWorker.setOriginalId(environmentEntityWorker.getId());
			metadataEntityWorker.setLastUpdatedApplicationName(environmentEntityWorker.getLastUpdatedApplicationName());
			metadataEntityWorker.setLastUpdatedUserName(environmentEntityWorker.getLastUpdatedUserName());

			metadataRepository.save(metadataEntityWorker);
			//reset
			metadataEntityWorker = new MetadataEntity("METADATA", "METADATA", "METADATA DESC");

			metadataEntityWorker.setName(applicationEntityWorker.getName());
			metadataEntityWorker.setType(applicationEntityWorker.getMetadataType());
			metadataEntityWorker.setDescription(applicationEntityWorker.getDescription());
			metadataEntityWorker.setOriginalId(applicationEntityWorker.getId());
			metadataEntityWorker.setLastUpdatedApplicationName(applicationEntityWorker.getLastUpdatedApplicationName());
			metadataEntityWorker.setLastUpdatedUserName(applicationEntityWorker.getLastUpdatedUserName());

			for (ReleaseEntity releaseEntity : releaseRepository.findAll()) {
				log.info("The release is: " + releaseEntity.toString());
			}

			for (DomainEntity domainEntity : domainRepository.findAll()) {
				log.info("The domain is: " + domainEntity.toString());
			}

			for (EnvironmentEntity environmentEntity : environmentRepository.findAll()) {
				log.info("The environment is: " + environmentEntity.toString());
			}

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

			for (MetadataEntity metadataEntity : metadataRepository.findAll()) {
				log.info("The metadata is: " + metadataEntity.toString());
			}
		};
	}//


}
