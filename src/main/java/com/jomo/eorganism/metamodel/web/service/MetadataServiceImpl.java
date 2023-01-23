package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.MetadataEntity;
import com.jomo.eorganism.metamodel.web.exception.MetadataNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.MetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MetadataServiceImpl implements MetadataService {
    @Autowired
    private MetadataRepository metadataRepository;

    @Override
    public Iterable<MetadataEntity> listMetadatas() {
        return metadataRepository.findAll();
    }

    @Override
    public MetadataEntity findMetadata(long id)  {
        Optional<MetadataEntity> optionalMetadata = metadataRepository.findById(id);

        if(optionalMetadata.isPresent())
            return optionalMetadata.get();
        else
            throw new MetadataNotFoundException("Metadata Not Found");
    }

}
