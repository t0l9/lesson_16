package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("tests/simple")
public class SkipTests {

    @Test
    @Disabled("Выключен")
    void test1(){
        assertTrue(true);
    }

    @Disabled("Причина")
    @Test
    void test2(){
        assertTrue(true);
    }
}
