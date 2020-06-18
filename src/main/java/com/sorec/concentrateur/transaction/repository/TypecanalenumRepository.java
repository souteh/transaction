package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Typecanalenum;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Typecanalenum entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TypecanalenumRepository extends JpaRepository<Typecanalenum, Long>, JpaSpecificationExecutor<Typecanalenum> {
}
