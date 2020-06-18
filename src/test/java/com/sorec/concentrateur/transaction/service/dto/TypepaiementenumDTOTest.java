package com.sorec.concentrateur.transaction.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.sorec.concentrateur.transaction.web.rest.TestUtil;

public class TypepaiementenumDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(TypepaiementenumDTO.class);
        TypepaiementenumDTO typepaiementenumDTO1 = new TypepaiementenumDTO();
        typepaiementenumDTO1.setId(1L);
        TypepaiementenumDTO typepaiementenumDTO2 = new TypepaiementenumDTO();
        assertThat(typepaiementenumDTO1).isNotEqualTo(typepaiementenumDTO2);
        typepaiementenumDTO2.setId(typepaiementenumDTO1.getId());
        assertThat(typepaiementenumDTO1).isEqualTo(typepaiementenumDTO2);
        typepaiementenumDTO2.setId(2L);
        assertThat(typepaiementenumDTO1).isNotEqualTo(typepaiementenumDTO2);
        typepaiementenumDTO1.setId(null);
        assertThat(typepaiementenumDTO1).isNotEqualTo(typepaiementenumDTO2);
    }
}
