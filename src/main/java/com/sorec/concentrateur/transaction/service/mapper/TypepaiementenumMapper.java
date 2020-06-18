package com.sorec.concentrateur.transaction.service.mapper;


import com.sorec.concentrateur.transaction.domain.*;
import com.sorec.concentrateur.transaction.service.dto.TypepaiementenumDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Typepaiementenum} and its DTO {@link TypepaiementenumDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TypepaiementenumMapper extends EntityMapper<TypepaiementenumDTO, Typepaiementenum> {



    default Typepaiementenum fromId(Long id) {
        if (id == null) {
            return null;
        }
        Typepaiementenum typepaiementenum = new Typepaiementenum();
        typepaiementenum.setId(id);
        return typepaiementenum;
    }
}
