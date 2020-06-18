package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Pdventity;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Pdventity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PdventityRepository extends JpaRepository<Pdventity, Long>, JpaSpecificationExecutor<Pdventity> {
}
