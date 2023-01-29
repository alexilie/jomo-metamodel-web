package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.MetadataEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;

public interface MetadataService {
    @TransactionalReadOnly
    Iterable<MetadataEntity> listMetadatas();

    @TransactionalReadOnly
    MetadataEntity findMetadata(int id);
}


