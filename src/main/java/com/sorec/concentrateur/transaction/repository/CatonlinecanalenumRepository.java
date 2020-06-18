package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Catonlinecanalenum;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Catonlinecanalenum entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CatonlinecanalenumRepository extends JpaRepository<Catonlinecanalenum, Long>, JpaSpecificationExecutor<Catonlinecanalenum> {
}
