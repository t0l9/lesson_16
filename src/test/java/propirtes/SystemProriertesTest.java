package propirtes;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemProriertesTest {

    @Test
    void simpleProretyTest(){
        String browsername = System.getProperty("browser");
        System.out.println(browsername); // null
    }

    @Test
    void simpleProrety1Test(){
        System.setProperty("browser", "opera");
        String browsername = System.getProperty("browser");
        System.out.println(browsername); // null
    }

    @Test
    @Tag("one_property")
    void simpleProrety2Test(){
        String browsername = System.getProperty("browser", "firefox");
        System.out.println(browsername); // null
        //gradle clean one_property_test
    }


    @Test
    @Tag("hello_test")
    void simplePropertyTest5(){
        System.out.println("hello, "
                + System.getProperty("user name", "unknow student"));

    }
}
