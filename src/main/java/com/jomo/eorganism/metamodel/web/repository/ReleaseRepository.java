package com.jomo.eorganism.metamodel.web.repository;

import com.jomo.eorganism.metamodel.web.entity.ReleaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends JpaRepository<ReleaseEntity, Integer> {
}
