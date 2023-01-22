package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.ReleaseEntity;
import com.jomo.eorganism.metamodel.web.exception.ReleaseNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<ReleaseEntity> listReleases() {
        return releaseRepository.findAll();
    }

    @Override
    public ReleaseEntity findRelease(long id)  {
        Optional<ReleaseEntity> optionalSystem = releaseRepository.findById(id);

        if(optionalSystem.isPresent())
            return optionalSystem.get();
        else
            throw new ReleaseNotFoundException("Releases Not Found");
    }

}
