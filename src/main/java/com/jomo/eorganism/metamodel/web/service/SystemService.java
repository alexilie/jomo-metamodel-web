package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.SystemEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;

public interface SystemService {
    @TransactionalReadOnly
    Iterable<SystemEntity> listSystems();

    @TransactionalReadOnly
    SystemEntity findSystem(long id);
}


