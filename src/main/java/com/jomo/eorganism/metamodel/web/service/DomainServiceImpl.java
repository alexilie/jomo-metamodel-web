package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.DomainEntity;
import com.jomo.eorganism.metamodel.web.exception.DomainNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DomainServiceImpl implements DomainService {
    @Autowired
    private DomainRepository domainRepository;

    @Override
    public Iterable<DomainEntity> listDomains() {
        return domainRepository.findAll();
    }

    @Override
    public DomainEntity findDomain(int id)  {
        Optional<DomainEntity> optionalSystem = domainRepository.findById(id);

        if(optionalSystem.isPresent())
            return optionalSystem.get();
        else
            throw new DomainNotFoundException("Domain Not Found");
    }

}
