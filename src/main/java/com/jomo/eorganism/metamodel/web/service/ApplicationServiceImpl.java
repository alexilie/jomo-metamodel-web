package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.MetamodelWebApplication;
import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.exception.ApplicationNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private static final Logger log = LoggerFactory.getLogger(ApplicationServiceImpl.class);

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Iterable<ApplicationEntity> listApplications() {
        log.info("listApplications");
        return applicationRepository.findAll();
    }

    @Override
    public ApplicationEntity findApplication(int id)  {
        Optional<ApplicationEntity> optionalApplication = applicationRepository.findById(id);
        log.info("findApplication id" + id);

        if(optionalApplication.isPresent()) {
            log.info("findApplication id" + optionalApplication.get().toString());
            return optionalApplication.get();
        }else {
            log.info("findApplication id"  + id + "::  Application Not Found");
            throw new ApplicationNotFoundException("Application Not Found");
        }
    }

    @Override
    public ApplicationEntity addApplication(ApplicationEntity applicationEntity){
        log.info("addApplication START ");
        applicationRepository.save(applicationEntity);
        log.info("addApplication SUCCESS - " + applicationEntity.toString());
        return applicationEntity;
    }

    /*
    @Override
    public void addApplicationArray(<ApplicationEntity> applicationEntityArray){

        for(ApplicationEntity applicationEntityWorker: applicationEntityArray) {
            addApplication(applicationEntityWorker);
        }
        return;
    }
    */

    @Override
    public void deleteById(int id) {
        log.info("deleteById id " + id);
        applicationRepository.findById(id).ifPresent(e -> applicationRepository.delete(e));
    }

    @Override
    public ApplicationEntity updateById(int id, ApplicationEntity applicationEntity) {
        log.info("updateById id " + id);
        log.info("updateById applicationEntity " + applicationEntity.toString());
        applicationRepository.findById(id).ifPresent(e -> applicationRepository.save(applicationEntity));
        return applicationEntity;
    }

}
