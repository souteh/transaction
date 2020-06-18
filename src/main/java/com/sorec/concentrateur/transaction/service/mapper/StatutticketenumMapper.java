package com.sorec.concentrateur.transaction.service.mapper;


import com.sorec.concentrateur.transaction.domain.*;
import com.sorec.concentrateur.transaction.service.dto.StatutticketenumDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Statutticketenum} and its DTO {@link StatutticketenumDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface StatutticketenumMapper extends EntityMapper<StatutticketenumDTO, Statutticketenum> {



    default Statutticketenum fromId(Long id) {
        if (id == null) {
            return null;
        }
        Statutticketenum statutticketenum = new Statutticketenum();
        statutticketenum.setId(id);
        return statutticketenum;
    }
}
