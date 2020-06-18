package com.sorec.concentrateur.transaction.service;

import java.util.List;

import javax.persistence.criteria.JoinType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.jhipster.service.QueryService;

import com.sorec.concentrateur.transaction.domain.Catonlinecanalenum;
import com.sorec.concentrateur.transaction.domain.*; // for static metamodels
import com.sorec.concentrateur.transaction.repository.CatonlinecanalenumRepository;
import com.sorec.concentrateur.transaction.service.dto.CatonlinecanalenumCriteria;
import com.sorec.concentrateur.transaction.service.dto.CatonlinecanalenumDTO;
import com.sorec.concentrateur.transaction.service.mapper.CatonlinecanalenumMapper;

/**
 * Service for executing complex queries for {@link Catonlinecanalenum} entities in the database.
 * The main input is a {@link CatonlinecanalenumCriteria} which gets converted to {@link Specification},
 * in a way that all the filters must apply.
 * It returns a {@link List} of {@link CatonlinecanalenumDTO} or a {@link Page} of {@link CatonlinecanalenumDTO} which fulfills the criteria.
 */
@Service
@Transactional(readOnly = true)
public class CatonlinecanalenumQueryService extends QueryService<Catonlinecanalenum> {

    private final Logger log = LoggerFactory.getLogger(CatonlinecanalenumQueryService.class);

    private final CatonlinecanalenumRepository catonlinecanalenumRepository;

    private final CatonlinecanalenumMapper catonlinecanalenumMapper;

    public CatonlinecanalenumQueryService(CatonlinecanalenumRepository catonlinecanalenumRepository, CatonlinecanalenumMapper catonlinecanalenumMapper) {
        this.catonlinecanalenumRepository = catonlinecanalenumRepository;
        this.catonlinecanalenumMapper = catonlinecanalenumMapper;
    }

    /**
     * Return a {@link List} of {@link CatonlinecanalenumDTO} which matches the criteria from the database.
     * @param criteria The object which holds all the filters, which the entities should match.
     * @return the matching entities.
     */
    @Transactional(readOnly = true)
    public List<CatonlinecanalenumDTO> findByCriteria(CatonlinecanalenumCriteria criteria) {
        log.debug("find by criteria : {}", criteria);
        final Specification<Catonlinecanalenum> specification = createSpecification(criteria);
        return catonlinecanalenumMapper.toDto(catonlinecanalenumRepository.findAll(specification));
    }

    /**
     * Return a {@link Page} of {@link CatonlinecanalenumDTO} which matches the criteria from the database.
     * @param criteria The object which holds all the filters, which the entities should match.
     * @param page The page, which should be returned.
     * @return the matching entities.
     */
    @Transactional(readOnly = true)
    public Page<CatonlinecanalenumDTO> findByCriteria(CatonlinecanalenumCriteria criteria, Pageable page) {
        log.debug("find by criteria : {}, page: {}", criteria, page);
        final Specification<Catonlinecanalenum> specification = createSpecification(criteria);
        return catonlinecanalenumRepository.findAll(specification, page)
            .map(catonlinecanalenumMapper::toDto);
    }

    /**
     * Return the number of matching entities in the database.
     * @param criteria The object which holds all the filters, which the entities should match.
     * @return the number of matching entities.
     */
    @Transactional(readOnly = true)
    public long countByCriteria(CatonlinecanalenumCriteria criteria) {
        log.debug("count by criteria : {}", criteria);
        final Specification<Catonlinecanalenum> specification = createSpecification(criteria);
        return catonlinecanalenumRepository.count(specification);
    }

    /**
     * Function to convert {@link CatonlinecanalenumCriteria} to a {@link Specification}
     * @param criteria The object which holds all the filters, which the entities should match.
     * @return the matching {@link Specification} of the entity.
     */
    protected Specification<Catonlinecanalenum> createSpecification(CatonlinecanalenumCriteria criteria) {
        Specification<Catonlinecanalenum> specification = Specification.where(null);
        if (criteria != null) {
            if (criteria.getId() != null) {
                specification = specification.and(buildRangeSpecification(criteria.getId(), Catonlinecanalenum_.id));
            }
            if (criteria.getPel() != null) {
                specification = specification.and(buildStringSpecification(criteria.getPel(), Catonlinecanalenum_.pel));
            }
            if (criteria.getPtel() != null) {
                specification = specification.and(buildStringSpecification(criteria.getPtel(), Catonlinecanalenum_.ptel));
            }
        }
        return specification;
    }
}
