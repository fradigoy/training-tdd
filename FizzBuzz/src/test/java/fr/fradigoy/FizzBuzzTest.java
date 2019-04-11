package fr.fradigoy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void beforeEachTest(){
         fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should1Return1(){
        assertThat("1").isEqualTo(fizzBuzz.genere(2));
    }

    @Test
    public void should2Return2(){
        assertThat("2").isEqualTo(fizzBuzz.genere(2));
    }
}
