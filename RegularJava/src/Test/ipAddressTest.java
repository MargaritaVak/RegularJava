package Test;

import Main.Task;
import org.junit.Test;

import static org.junit.Assert.*;

public class ipAddressTest {
    @Test
    public void trueCheckIP1()
    {
        assertTrue(Task.ipAddress("219.156.1.18"));
    }

    @Test
    public void trueCheckIP2()
    {
        assertTrue(Task.ipAddress("127.0.0.1"));
    }

    @Test
    public void trueCheckIP3()
    {
        assertTrue(Task.ipAddress("255.255.255.0"));
    }

    @Test
    public void trueCheckIP4()
    {
        assertTrue(Task.ipAddress("255.224.0.0"));
    }

    @Test
    public void trueCheckIP5()
    {
        assertTrue(Task.ipAddress("255.224.0.0"));
    }

    @Test
    public void trueCheckIP6()
    {
        assertTrue(Task.ipAddress("0.0.0.0"));
    }

    @Test
    public void trueCheckIP7()
    {
        assertTrue(Task.ipAddress("172.16.0.0"));
    }

    @Test
    public void trueCheckIP8()
    {
        assertTrue(Task.ipAddress("239.255.255.255"));
    }

    @Test
    public void trueCheckIP9()
    {
        assertTrue(Task.ipAddress("169.254.255.255"));
    }

    @Test
    public void trueCheckIP10()
    {
        assertTrue(Task.ipAddress("2.0.123.0"));
    }

    @Test
    public void falseCheckIP1()
    {
        assertFalse(Task.ipAddress(" "));
    }

    @Test
    public void falseCheckIP2()
    {
        assertFalse(Task.ipAddress("250.255.25.257"));
    }

    @Test
    public void falseCheckIP3()
    {
        assertFalse(Task.ipAddress("122-312-34-3"));
    }

    @Test
    public void falseCheckIP4()
    {
        assertFalse(Task.ipAddress("1300.568.09"));
    }

    @Test
    public void falseCheckIP5()
    {
        assertFalse(Task.ipAddress("000.000.0000.00"));
    }
    @Test
    public void falseCheckIP6()
    {
        assertFalse(Task.ipAddress("127. 23.55.3"));
    }
    @Test
    public void falseCheckIP7()
    {
        assertFalse(Task.ipAddress("123 .43  .43 .43 "));
    }

    @Test
    public void falseCheckIP8()
    {
        assertFalse(Task.ipAddress("abc.def.gha.bcd"));
    }

    @Test
    public void falseCheckIP9()
    {
        assertFalse(Task.ipAddress("0"));
    }

    @Test
    public void falseCheckIP10()
    {
        assertFalse(Task.ipAddress("1.1.1.1.1"));
    }



}