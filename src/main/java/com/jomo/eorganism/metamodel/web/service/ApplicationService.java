package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;
import com.jomo.eorganism.metamodel.web.util.TransactionalWrite;

public interface ApplicationService {
    @TransactionalReadOnly
    Iterable<ApplicationEntity> listApplications();

    @TransactionalReadOnly
    ApplicationEntity findApplication(long id);

    @TransactionalWrite
    ApplicationEntity addApplication(ApplicationEntity applicationEntity);

    @TransactionalWrite
    void deleteById(long id);

    @TransactionalWrite
    ApplicationEntity updateById(long id, ApplicationEntity applicationEntity);
}


