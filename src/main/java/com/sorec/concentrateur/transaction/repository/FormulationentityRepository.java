package com.sorec.concentrateur.transaction.repository;

import com.sorec.concentrateur.transaction.domain.Formulationentity;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Formulationentity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FormulationentityRepository extends JpaRepository<Formulationentity, Long>, JpaSpecificationExecutor<Formulationentity> {
}
