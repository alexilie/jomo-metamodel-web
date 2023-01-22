package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.EnvironmentEntity;
import com.jomo.eorganism.metamodel.web.exception.EnvironmentNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.EnvironmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnvironmentServiceImpl implements EnvironmentService {
    @Autowired
    private EnvironmentRepository environmentRepository;

    @Override
    public Iterable<EnvironmentEntity> listEnvironments() {
        return environmentRepository.findAll();
    }

    @Override
    public EnvironmentEntity findEnvironment(long id)  {
        Optional<EnvironmentEntity> optionalEnvironment = environmentRepository.findById(id);

        if(optionalEnvironment.isPresent())
            return optionalEnvironment.get();
        else
            throw new EnvironmentNotFoundException("Environment Not Found");
    }

}
