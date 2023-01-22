package com.jomo.eorganism.metamodel.web.service;


import com.jomo.eorganism.metamodel.web.entity.DatabaseEntity;
import com.jomo.eorganism.metamodel.web.exception.DatabaseNotFoundException;
import com.jomo.eorganism.metamodel.web.repository.DatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DatabaseServiceImpl implements DatabaseService {
    @Autowired
    private DatabaseRepository databaseRepository;

    @Override
    public Iterable<DatabaseEntity> listDatabases() {
        return databaseRepository.findAll();
    }

    @Override
    public DatabaseEntity findDatabase(long id)  {
        Optional<DatabaseEntity> optionalDatabase = databaseRepository.findById(id);

        if(optionalDatabase.isPresent())
            return optionalDatabase.get();
        else
            throw new DatabaseNotFoundException("Database Not Found");
    }
}
