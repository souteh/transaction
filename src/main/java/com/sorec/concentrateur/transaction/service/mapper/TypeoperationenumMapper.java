package com.sorec.concentrateur.transaction.service.mapper;


import com.sorec.concentrateur.transaction.domain.*;
import com.sorec.concentrateur.transaction.service.dto.TypeoperationenumDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Typeoperationenum} and its DTO {@link TypeoperationenumDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TypeoperationenumMapper extends EntityMapper<TypeoperationenumDTO, Typeoperationenum> {



    default Typeoperationenum fromId(Long id) {
        if (id == null) {
            return null;
        }
        Typeoperationenum typeoperationenum = new Typeoperationenum();
        typeoperationenum.setId(id);
        return typeoperationenum;
    }
}
