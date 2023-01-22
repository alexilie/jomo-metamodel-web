package com.jomo.eorganism.metamodel.web.service;

import com.jomo.eorganism.metamodel.web.entity.DatabaseEntity;
import com.jomo.eorganism.metamodel.web.util.TransactionalReadOnly;

public interface DatabaseService {
    @TransactionalReadOnly
    Iterable<DatabaseEntity> listDatabases();

    @TransactionalReadOnly
    DatabaseEntity findDatabase(long id);
}


