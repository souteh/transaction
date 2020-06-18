package com.sorec.concentrateur.transaction.service;

import com.sorec.concentrateur.transaction.domain.Typeterminalenum;
import com.sorec.concentrateur.transaction.repository.TypeterminalenumRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Typeterminalenum}.
 */
@Service
@Transactional
public class TypeterminalenumService {

    private final Logger log = LoggerFactory.getLogger(TypeterminalenumService.class);

    private final TypeterminalenumRepository typeterminalenumRepository;

    public TypeterminalenumService(TypeterminalenumRepository typeterminalenumRepository) {
        this.typeterminalenumRepository = typeterminalenumRepository;
    }

    /**
     * Save a typeterminalenum.
     *
     * @param typeterminalenum the entity to save.
     * @return the persisted entity.
     */
    public Typeterminalenum save(Typeterminalenum typeterminalenum) {
        log.debug("Request to save Typeterminalenum : {}", typeterminalenum);
        return typeterminalenumRepository.save(typeterminalenum);
    }

    /**
     * Get all the typeterminalenums.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Typeterminalenum> findAll(Pageable pageable) {
        log.debug("Request to get all Typeterminalenums");
        return typeterminalenumRepository.findAll(pageable);
    }


    /**
     * Get one typeterminalenum by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Typeterminalenum> findOne(Long id) {
        log.debug("Request to get Typeterminalenum : {}", id);
        return typeterminalenumRepository.findById(id);
    }

    /**
     * Delete the typeterminalenum by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Typeterminalenum : {}", id);
        typeterminalenumRepository.deleteById(id);
    }
}
