package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;
import com.jomo.eorganism.metamodel.web.util.TransactionalWrite;

public interface ApplicationService {
    @TransactionalReadOnly
    Iterable<ApplicationEntity> listApplications();

    @TransactionalReadOnly
    ApplicationEntity findApplication(int id);

    @TransactionalWrite
    ApplicationEntity addApplication(ApplicationEntity applicationEntity);

    //void addApplicationArray(<ApplicationEntity> applicationEntityArray);

    @TransactionalWrite
    void deleteById(int id);

    @TransactionalWrite
    ApplicationEntity updateById(int id, ApplicationEntity applicationEntity);
}


