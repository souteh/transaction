package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Statutticketenum;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Statutticketenum entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StatutticketenumRepository extends JpaRepository<Statutticketenum, Long>, JpaSpecificationExecutor<Statutticketenum> {
}
