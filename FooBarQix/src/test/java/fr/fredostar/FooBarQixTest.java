package fr.fredostar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooBarQixTest {

    private FooBarQix fooBarQix;

    @BeforeEach
    void beforeEachTest(){
         fooBarQix = new FooBarQix();
    }

    @Test void should1Return1(){
        assertThat("1").isEqualTo(fooBarQix.generate(1));
    }

    @Test void should2Return2(){
        assertThat("2").isEqualTo(fooBarQix.generate(2));
    }
    @Test void shouldNumberDivisible3ReturnFoo(){
        assertThat("Foo").isEqualTo(fooBarQix.generate(3));
    }
    

}
