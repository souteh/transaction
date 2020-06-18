package com.sorec.concentrateur.transaction.web.rest;

import com.sorec.concentrateur.transaction.service.CatonlinecanalenumService;
import com.sorec.concentrateur.transaction.web.rest.errors.BadRequestAlertException;
import com.sorec.concentrateur.transaction.service.dto.CatonlinecanalenumDTO;
import com.sorec.concentrateur.transaction.service.dto.CatonlinecanalenumCriteria;
import com.sorec.concentrateur.transaction.service.CatonlinecanalenumQueryService;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.sorec.concentrateur.transaction.domain.Catonlinecanalenum}.
 */
@RestController
@RequestMapping("/api")
public class CatonlinecanalenumResource {

    private final Logger log = LoggerFactory.getLogger(CatonlinecanalenumResource.class);

    private static final String ENTITY_NAME = "transactionCatonlinecanalenum";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final CatonlinecanalenumService catonlinecanalenumService;

    private final CatonlinecanalenumQueryService catonlinecanalenumQueryService;

    public CatonlinecanalenumResource(CatonlinecanalenumService catonlinecanalenumService, CatonlinecanalenumQueryService catonlinecanalenumQueryService) {
        this.catonlinecanalenumService = catonlinecanalenumService;
        this.catonlinecanalenumQueryService = catonlinecanalenumQueryService;
    }

    /**
     * {@code POST  /catonlinecanalenums} : Create a new catonlinecanalenum.
     *
     * @param catonlinecanalenumDTO the catonlinecanalenumDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new catonlinecanalenumDTO, or with status {@code 400 (Bad Request)} if the catonlinecanalenum has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/catonlinecanalenums")
    public ResponseEntity<CatonlinecanalenumDTO> createCatonlinecanalenum(@Valid @RequestBody CatonlinecanalenumDTO catonlinecanalenumDTO) throws URISyntaxException {
        log.debug("REST request to save Catonlinecanalenum : {}", catonlinecanalenumDTO);
        if (catonlinecanalenumDTO.getId() != null) {
            throw new BadRequestAlertException("A new catonlinecanalenum cannot already have an ID", ENTITY_NAME, "idexists");
        }
        CatonlinecanalenumDTO result = catonlinecanalenumService.save(catonlinecanalenumDTO);
        return ResponseEntity.created(new URI("/api/catonlinecanalenums/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /catonlinecanalenums} : Updates an existing catonlinecanalenum.
     *
     * @param catonlinecanalenumDTO the catonlinecanalenumDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated catonlinecanalenumDTO,
     * or with status {@code 400 (Bad Request)} if the catonlinecanalenumDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the catonlinecanalenumDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/catonlinecanalenums")
    public ResponseEntity<CatonlinecanalenumDTO> updateCatonlinecanalenum(@Valid @RequestBody CatonlinecanalenumDTO catonlinecanalenumDTO) throws URISyntaxException {
        log.debug("REST request to update Catonlinecanalenum : {}", catonlinecanalenumDTO);
        if (catonlinecanalenumDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        CatonlinecanalenumDTO result = catonlinecanalenumService.save(catonlinecanalenumDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, catonlinecanalenumDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /catonlinecanalenums} : get all the catonlinecanalenums.
     *
     * @param pageable the pagination information.
     * @param criteria the criteria which the requested entities should match.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of catonlinecanalenums in body.
     */
    @GetMapping("/catonlinecanalenums")
    public ResponseEntity<List<CatonlinecanalenumDTO>> getAllCatonlinecanalenums(CatonlinecanalenumCriteria criteria, Pageable pageable) {
        log.debug("REST request to get Catonlinecanalenums by criteria: {}", criteria);
        Page<CatonlinecanalenumDTO> page = catonlinecanalenumQueryService.findByCriteria(criteria, pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /catonlinecanalenums/count} : count all the catonlinecanalenums.
     *
     * @param criteria the criteria which the requested entities should match.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the count in body.
     */
    @GetMapping("/catonlinecanalenums/count")
    public ResponseEntity<Long> countCatonlinecanalenums(CatonlinecanalenumCriteria criteria) {
        log.debug("REST request to count Catonlinecanalenums by criteria: {}", criteria);
        return ResponseEntity.ok().body(catonlinecanalenumQueryService.countByCriteria(criteria));
    }

    /**
     * {@code GET  /catonlinecanalenums/:id} : get the "id" catonlinecanalenum.
     *
     * @param id the id of the catonlinecanalenumDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the catonlinecanalenumDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/catonlinecanalenums/{id}")
    public ResponseEntity<CatonlinecanalenumDTO> getCatonlinecanalenum(@PathVariable Long id) {
        log.debug("REST request to get Catonlinecanalenum : {}", id);
        Optional<CatonlinecanalenumDTO> catonlinecanalenumDTO = catonlinecanalenumService.findOne(id);
        return ResponseUtil.wrapOrNotFound(catonlinecanalenumDTO);
    }

    /**
     * {@code DELETE  /catonlinecanalenums/:id} : delete the "id" catonlinecanalenum.
     *
     * @param id the id of the catonlinecanalenumDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/catonlinecanalenums/{id}")
    public ResponseEntity<Void> deleteCatonlinecanalenum(@PathVariable Long id) {
        log.debug("REST request to delete Catonlinecanalenum : {}", id);
        catonlinecanalenumService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }
}