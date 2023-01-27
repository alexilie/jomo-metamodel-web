package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.exception.ApplicationNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Iterable<ApplicationEntity> listApplications() {
        return applicationRepository.findAll();
    }

    @Override
    public ApplicationEntity findApplication(long id)  {
        Optional<ApplicationEntity> optionalApplication = applicationRepository.findById(id);

        if(optionalApplication.isPresent())
            return optionalApplication.get();
        else
            throw new ApplicationNotFoundException("Application Not Found");
    }

    @Override
    public ApplicationEntity addApplication(ApplicationEntity applicationEntity){
        applicationRepository.save(applicationEntity);
        return applicationEntity;
    }

    @Override
    public void deleteById(long id) {
        applicationRepository.findById(id).ifPresent(e -> applicationRepository.delete(e));
    }

}
