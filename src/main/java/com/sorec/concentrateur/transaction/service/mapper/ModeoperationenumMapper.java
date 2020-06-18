package com.sorec.concentrateur.transaction.service.mapper;


import com.sorec.concentrateur.transaction.domain.*;
import com.sorec.concentrateur.transaction.service.dto.ModeoperationenumDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Modeoperationenum} and its DTO {@link ModeoperationenumDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ModeoperationenumMapper extends EntityMapper<ModeoperationenumDTO, Modeoperationenum> {



    default Modeoperationenum fromId(Long id) {
        if (id == null) {
            return null;
        }
        Modeoperationenum modeoperationenum = new Modeoperationenum();
        modeoperationenum.setId(id);
        return modeoperationenum;
    }
}
