package com.sorec.concentrateur.transaction.service.mapper;


import com.sorec.concentrateur.transaction.domain.*;
import com.sorec.concentrateur.transaction.service.dto.FormulationentityDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Formulationentity} and its DTO {@link FormulationentityDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FormulationentityMapper extends EntityMapper<FormulationentityDTO, Formulationentity> {



    default Formulationentity fromId(Long id) {
        if (id == null) {
            return null;
        }
        Formulationentity formulationentity = new Formulationentity();
        formulationentity.setId(id);
        return formulationentity;
    }
}
