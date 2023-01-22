package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.EnvironmentEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;

public interface EnvironmentService {
    @TransactionalReadOnly
    Iterable<EnvironmentEntity> listEnvironments();

    @TransactionalReadOnly
    EnvironmentEntity findEnvironment(long id);
}


