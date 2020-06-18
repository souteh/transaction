package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Typeannulationenum;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Typeannulationenum entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TypeannulationenumRepository extends JpaRepository<Typeannulationenum, Long>, JpaSpecificationExecutor<Typeannulationenum> {
}
