package com.sorec.concentrateur.transaction.service.mapper;


import com.sorec.concentrateur.transaction.domain.*;
import com.sorec.concentrateur.transaction.service.dto.CatonlinecanalenumDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Catonlinecanalenum} and its DTO {@link CatonlinecanalenumDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CatonlinecanalenumMapper extends EntityMapper<CatonlinecanalenumDTO, Catonlinecanalenum> {



    default Catonlinecanalenum fromId(Long id) {
        if (id == null) {
            return null;
        }
        Catonlinecanalenum catonlinecanalenum = new Catonlinecanalenum();
        catonlinecanalenum.setId(id);
        return catonlinecanalenum;
    }
}
