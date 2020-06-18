package com.sorec.concentrateur.transaction.service;

import com.sorec.concentrateur.transaction.domain.Association12;
import com.sorec.concentrateur.transaction.repository.Association12Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Association12}.
 */
@Service
@Transactional
public class Association12Service {

    private final Logger log = LoggerFactory.getLogger(Association12Service.class);

    private final Association12Repository association12Repository;

    public Association12Service(Association12Repository association12Repository) {
        this.association12Repository = association12Repository;
    }

    /**
     * Save a association12.
     *
     * @param association12 the entity to save.
     * @return the persisted entity.
     */
    public Association12 save(Association12 association12) {
        log.debug("Request to save Association12 : {}", association12);
        return association12Repository.save(association12);
    }

    /**
     * Get all the association12s.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Association12> findAll(Pageable pageable) {
        log.debug("Request to get all Association12s");
        return association12Repository.findAll(pageable);
    }


    /**
     * Get one association12 by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Association12> findOne(Long id) {
        log.debug("Request to get Association12 : {}", id);
        return association12Repository.findById(id);
    }

    /**
     * Delete the association12 by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Association12 : {}", id);
        association12Repository.deleteById(id);
    }
}
