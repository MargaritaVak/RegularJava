package Test;

import Main.Task;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLTest {

    @Test
    public void trueCheckURL1()
    {
        assertTrue(Task.URL("http://www.example.com"));
    }

    @Test
    public void trueCheckURL2()
    {
        assertTrue(Task.URL("http://example.com"));
    }

    @Test
    public void trueCheckURL3()
    {
        assertTrue(Task.URL("https://develop.ury.org/r22#section-3.4"));
    }

    @Test
    public void trueCheckURL4()
    {
        assertTrue(Task.URL("https://www.vyatsu.ru/studentu-1.html"));
    }

    @Test
    public void trueCheckURL5()
    {
        assertTrue(Task.URL("www.vyatsu.ru/studentu-1.html"));
    }

    @Test
    public void falseCheckURL1()
    {
        assertFalse(Task.URL("Just Text"));
    }

    @Test
    public void falseCheckURL2()
    {
        assertFalse(Task.URL("http://a.com"));
    }

    @Test
    public void falseCheckURL3()
    {
        assertFalse(Task.URL("http://www.example. com"));
    }


    @Test
    public void falseCheckURL4()
    {
        assertFalse(Task.URL("http://www.e_xample.com"));
    }


    @Test
    public void falseCheckURL5()
    {
        assertFalse(Task.URL("http://www.-lib.com"));
    }

}