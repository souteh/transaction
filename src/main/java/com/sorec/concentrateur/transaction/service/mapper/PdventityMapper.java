package com.sorec.concentrateur.transaction.service.mapper;


import com.sorec.concentrateur.transaction.domain.*;
import com.sorec.concentrateur.transaction.service.dto.PdventityDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Pdventity} and its DTO {@link PdventityDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PdventityMapper extends EntityMapper<PdventityDTO, Pdventity> {



    default Pdventity fromId(Long id) {
        if (id == null) {
            return null;
        }
        Pdventity pdventity = new Pdventity();
        pdventity.setId(id);
        return pdventity;
    }
}
