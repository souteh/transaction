package com.sorec.concentrateur.transaction.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.sorec.concentrateur.transaction.web.rest.TestUtil;

public class TypeannulationenumTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Typeannulationenum.class);
        Typeannulationenum typeannulationenum1 = new Typeannulationenum();
        typeannulationenum1.setId(1L);
        Typeannulationenum typeannulationenum2 = new Typeannulationenum();
        typeannulationenum2.setId(typeannulationenum1.getId());
        assertThat(typeannulationenum1).isEqualTo(typeannulationenum2);
        typeannulationenum2.setId(2L);
        assertThat(typeannulationenum1).isNotEqualTo(typeannulationenum2);
        typeannulationenum1.setId(null);
        assertThat(typeannulationenum1).isNotEqualTo(typeannulationenum2);
    }
}
