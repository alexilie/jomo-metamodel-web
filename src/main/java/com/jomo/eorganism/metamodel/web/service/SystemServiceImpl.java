package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.SystemEntity;
import com.jomo.eorganism.metamodel.web.exception.SystemNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SystemServiceImpl implements SystemService {
    @Autowired
    private SystemRepository systemRepository;

    @Override
    public Iterable<SystemEntity> listSystems() {
        return systemRepository.findAll();
    }

    @Override
    public SystemEntity findSystem(int id)  {
        Optional<SystemEntity> optionalSystem = systemRepository.findById(id);

        if(optionalSystem.isPresent())
            return optionalSystem.get();
        else
            throw new SystemNotFoundException("System Not Found");
    }

}
