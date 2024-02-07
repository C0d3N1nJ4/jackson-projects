package com.naiomi.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TestJacksonAnnotations {

    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect()
            throws JsonProcessingException {

        ExtendableBean bean = new ExtendableBean("My bean");
        bean.add("attr1", "val1");
        bean.add("attr2", "val2");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);
        assertThat(result, containsString("attr1"));
        assertThat(result, containsString("val1"));
    }
}
