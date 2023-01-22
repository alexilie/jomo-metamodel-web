package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.DomainEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;

public interface DomainService {
    @TransactionalReadOnly
    Iterable<DomainEntity> listDomains();

    @TransactionalReadOnly
    DomainEntity findDomain(long id);
}


