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

import java.sql.SQLException;

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

			//insert some mockup data
			int i = 0;
			for (i = 1; i < 10000; i++) {

					try {
						//1
						applicationEntityWorker = new ApplicationEntity("Jomo Metamodel Web" + "ONE:" + i, "Defect Tracking" + "ONE:" + i, "Jomo Metamodel Defect tracking Application for tracking bugs" + "ONE:" + i);

						componentEntityWorker = new ComponentEntity("Jomo Metamodel Web" + "ONE:" + i, "Defect Tracking" + "ONE:" + i, "Jomo Metamodel Web GUI Admin component" + "ONE:" + i);
						databaseEntityWorker = new DatabaseEntity("Jomo Metamodel Database" + "ONE:" + i, "Oracle Cloud" + "ONE:" + i, "Jomo Metamodel Database" + "ONE:" + i);
						domainEntityWorker = new DomainEntity("Billing Domain", "Billing" + "ONE:" + i, "Business Banking Billing Domain" + "ONE:" + i);
						systemEntityWorker = new SystemEntity("CRM", "Critical" + "ONE:" + i, "CRM Customer Relationship System" + "ONE:" + i);
						releaseEntityWorker = new ReleaseEntity("PROD-HEROKU Metamodel Web"+ "ONE:" + i, "PROD" + "ONE:" + i, "CRM Customer Relationship System" + "ONE:" + i);
						environmentEntityWorker = new EnvironmentEntity("ENV-HEROKU" + "ONE:" + i, "PROD" + "ONE:" + i, "HEROKU Environment" + "ONE:" + i);
						metadataEntityWorker = new MetadataEntity("METADATA" + "ONE:" + i, "METADATA"+ "ONE:" + i, "METADATA DESC" + "ONE:" + i);

						componentEntityWorker.setApplicationId(1);
						systemEntityWorker.setDomainId(1);
						environmentEntityWorker.setReleaseId(1);

						releaseRepository.save(releaseEntityWorker);
						domainRepository.save(domainEntityWorker);
						environmentRepository.save(environmentEntityWorker);
						applicationRepository.save(applicationEntityWorker);
						componentRepository.save(componentEntityWorker);
						databaseRepository.save(databaseEntityWorker);
						systemRepository.save(systemEntityWorker);

						metadataEntityWorker.setName(releaseEntityWorker.getName() + "ONE:" + i);
						metadataEntityWorker.setType(releaseEntityWorker.getMetadataType() + "ONE:" + i);
						metadataEntityWorker.setDescription(releaseEntityWorker.getDescription() + "ONE:" + i);
						metadataEntityWorker.setOriginalId(releaseEntityWorker.getId());
						metadataEntityWorker.setLastUpdatedApplicationName(releaseEntityWorker.getLastUpdatedApplicationName() + "ONE:" + i);
						metadataEntityWorker.setLastUpdatedUserName(releaseEntityWorker.getLastUpdatedUserName() + "ONE:" + i);

						metadataRepository.save(metadataEntityWorker);

						//reset

						//2
						applicationEntityWorker = new ApplicationEntity("EOrganism Connector" + "TWO:" + i, "Code Generator" + "TWO:" + i, "EOrganism Connector Source Code Generator from Metamodel" + "TWO:" + i);

						componentEntityWorker = new ComponentEntity("EOrganism Connector Swing GUI" + "TWO:" + i, "Java Swing GUI App" + "TWO:" + i, "EOrganism Connector Swing GUI, Java Swing GUI App" + "TWO:" + i);
						databaseEntityWorker = new DatabaseEntity("EOrganism Connector Database" + "TWO:" + i, "My SQL" + "TWO:" + i, "Jomo Metamodel Database" + "TWO:" + i);
						domainEntityWorker = new DomainEntity("Digital Domain" + "TWO:" + i,"Digital Channels" + "TWO:" + i, "Digital Domain Channels - Mobile, Web Channels" + "TWO:" + i);
						systemEntityWorker = new SystemEntity("SAP" + "TWO:" + i, "Critical" + "TWO:" + i, "SAP System" + "TWO:" + i);
						releaseEntityWorker = new ReleaseEntity("PROD-AWS Metamodel Web" + "TWO:" + i, "PROD" + "TWO:" + i, "PROD-AWS Infrastructure" + "TWO:" + i);
						environmentEntityWorker = new EnvironmentEntity("ENV-AWS" + "TWO:" + i, "PROD" + "TWO:" + i, "AWS Cloud Environment" + "TWO:" + i);
						metadataEntityWorker = new MetadataEntity("METADATA" + "TWO:" + i, "METADATA" + "TWO:" + i, "METADATA DESC" + "TWO:" + i);

						componentEntityWorker.setApplicationId(2);
						systemEntityWorker.setDomainId(2);
						environmentEntityWorker.setReleaseId(2);

						releaseRepository.save(releaseEntityWorker);
						domainRepository.save(domainEntityWorker);
						environmentRepository.save(environmentEntityWorker);
						applicationRepository.save(applicationEntityWorker);
						componentRepository.save(componentEntityWorker);
						databaseRepository.save(databaseEntityWorker);
						systemRepository.save(systemEntityWorker);

						metadataEntityWorker.setName(releaseEntityWorker.getName() + "TWO:" + i);
						metadataEntityWorker.setType(releaseEntityWorker.getMetadataType() + "TWO:" + i);
						metadataEntityWorker.setDescription(releaseEntityWorker.getDescription() + "TWO:" + i);
						metadataEntityWorker.setOriginalId(releaseEntityWorker.getId());
						metadataEntityWorker.setLastUpdatedApplicationName(releaseEntityWorker.getLastUpdatedApplicationName() + "TWO:" + i);
						metadataEntityWorker.setLastUpdatedUserName(releaseEntityWorker.getLastUpdatedUserName() + "TWO:" + i);

						metadataRepository.save(metadataEntityWorker);


					} catch (Exception e) {
						log.info("CommandLineRunner Exception " + e.toString());

					}

				}// outer for i

					/*
					try {

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

					} catch (Exception e) {
						log.info("CommandLineRunner Exception:: for " + e.toString());

					}

				 	*/
		};
	}//


}
