package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.ComponentEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;

public interface ComponentService {
    @TransactionalReadOnly
    Iterable<ComponentEntity> listComponents();

    @TransactionalReadOnly
    ComponentEntity findComponent(long id);
}


