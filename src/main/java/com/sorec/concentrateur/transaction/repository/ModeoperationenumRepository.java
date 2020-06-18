package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Modeoperationenum;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Modeoperationenum entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ModeoperationenumRepository extends JpaRepository<Modeoperationenum, Long>, JpaSpecificationExecutor<Modeoperationenum> {
}
