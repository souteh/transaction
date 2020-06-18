package com.sorec.concentrateur.transaction.service.mapper;


import com.sorec.concentrateur.transaction.domain.*;
import com.sorec.concentrateur.transaction.service.dto.TypecanalenumDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Typecanalenum} and its DTO {@link TypecanalenumDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TypecanalenumMapper extends EntityMapper<TypecanalenumDTO, Typecanalenum> {



    default Typecanalenum fromId(Long id) {
        if (id == null) {
            return null;
        }
        Typecanalenum typecanalenum = new Typecanalenum();
        typecanalenum.setId(id);
        return typecanalenum;
    }
}
