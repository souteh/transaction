package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Typeoperationenum;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Typeoperationenum entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TypeoperationenumRepository extends JpaRepository<Typeoperationenum, Long>, JpaSpecificationExecutor<Typeoperationenum> {
}
