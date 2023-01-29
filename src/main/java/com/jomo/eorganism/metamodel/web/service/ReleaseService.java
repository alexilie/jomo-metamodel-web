package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.ReleaseEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;

public interface ReleaseService {
    @TransactionalReadOnly
    Iterable<ReleaseEntity> listReleases();

    @TransactionalReadOnly
    ReleaseEntity findRelease(int id);
}


