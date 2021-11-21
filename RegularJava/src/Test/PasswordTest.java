package Test;

import Main.Task;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordTest {

    @Test
    public void trueCheckPassword1()
    {
        assertTrue(Task.Password("C00l_Pass"));
    }

    @Test
    public void trueCheckPassword2()
    {
        assertTrue(Task.Password("SupperPas1"));
    }

    @Test
    public void trueCheckPassword3()
    {
        assertTrue(Task.Password("1Yul6E_mt"));
    }

    @Test
    public void trueCheckPassword4()
    {
        assertTrue(Task.Password("BGuk3ZktSFtsUUk2"));
    }

    @Test
    public void trueCheckPassword5()
    {
        assertTrue(Task.Password("NOxd4Th_m3_Ud9"));
    }

    @Test
    public void falseCheckPassword1()
    {
        assertFalse(Task.Password("Cool_pass"));
    }

    @Test
    public void falseCheckPassword2()
    {
        assertFalse(Task.Password("C00l"));
    }

    @Test
    public void falseCheckPassword3()
    {
        assertFalse(Task.Password("RTYUI"));
    }


    @Test
    public void falseCheckPassword4()
    {
        assertFalse(Task.Password("89394____"));
    }

    @Test
    public void falseCheckPassword5()
    {
        assertFalse(Task.Password("fjdjhfh2"));
    }
}