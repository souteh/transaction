package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Clientglentity;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Clientglentity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClientglentityRepository extends JpaRepository<Clientglentity, Long>, JpaSpecificationExecutor<Clientglentity> {
}
