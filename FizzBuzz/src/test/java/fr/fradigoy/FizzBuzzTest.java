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
        assertThat("1").isEqualTo(fizzBuzz.generate(1));
    }

    @Test
    public void should2Return2(){
        assertThat("2").isEqualTo(fizzBuzz.generate(2));
    }

    @Test
    public void should3ReturnFizz(){
        assertThat("Fizz").isEqualTo(fizzBuzz.generate(3));
    }

    @Test
    public void should5ReturnBuzz(){
        assertThat("Buzz").isEqualTo(fizzBuzz.generate(5));
    }

    @Test void should9ReturnFizz(){
        assertThat("Fizz").isEqualTo(fizzBuzz.generate(9));
    }

    @Test void should10ReturnBuzz(){
        assertThat("Buzz").isEqualTo(fizzBuzz.generate(10));
    }
}
