package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.ComponentEntity;
import com.jomo.eorganism.metamodel.web.exception.ComponentNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComponentServiceImpl implements ComponentService {
    @Autowired
    private ComponentRepository componentRepository;

    @Override
    public Iterable<ComponentEntity> listComponents() {
        return componentRepository.findAll();
    }

    @Override
    public ComponentEntity findComponent(long id)  {
        Optional<ComponentEntity> optionalComponent = componentRepository.findById(id);

        if(optionalComponent.isPresent())
            return optionalComponent.get();
        else
            throw new ComponentNotFoundException("Component Not Found");
    }

}
