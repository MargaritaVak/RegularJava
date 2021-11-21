package Test;

import Main.Task;
import org.junit.Test;

import static org.junit.Assert.*;

public class GUIDTest {
    @Test
    public  void  trueCheckGUID1()
    {
        assertTrue(Task.GUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public  void  trueCheckGUID2()
    {
        assertTrue(Task.GUID("657febb7-af59-4782-a8a6-506712897880"));
    }

    @Test
    public  void  trueCheckGUID3()
    {
        assertTrue(Task.GUID("8580ebd5-9e0b-4821-a384-b5fff48dd14e"));
    }

    @Test
    public  void  trueCheckGUID4()
    {
        assertTrue(Task.GUID("4c0611ae-a75a-4634-a5af-cc895662a7de"));
    }
    @Test
    public  void  trueCheckGUID5()
    {
        assertTrue(Task.GUID("d1c56ec7-2587-4b9b-ae9a-8092bfe226de"));
    }

    @Test
    public  void  trueCheckGUID6()
    {
        assertTrue(Task.GUID("7d7bc20d-e03f-42d1-8d4c-87dc43b3a3af"));
    }

    @Test
    public  void  trueCheckGUID7()
    {
        assertTrue(Task.GUID("fe8b2ba0-610c-4603-b1c5-a8515fdff7b1"));
    }

    @Test
    public  void  trueCheckGUID8()
    {
        assertTrue(Task.GUID("08465813-2b2c-4f40-9720-48a063869e1d"));
    }

    @Test
    public  void  trueCheckGUID9()
    {
        assertTrue(Task.GUID("{79E9F560-FD70-4807-BEED-50A87AA911B1}"));
    }

    @Test
    public  void  trueCheckGUID10()
    {
        assertTrue(Task.GUID("a291334c-370e-4cce-9125-e3d1f2c16c41"));
    }

    @Test
    public  void  falseCheckGUID1()
    {
        assertFalse(Task.GUID("a291334c-370e-4cce-9125-e3d1f2c161"));
    }

    @Test
    public  void  falseCheckGUID2()
    {
        assertFalse(Task.GUID("a2i2i3231334c370e4cce-9125-e3d1f2c161"));
    }

    @Test
    public  void  falseCheckGUID3()
    {
        assertFalse(Task.GUID("e02fd0e400fd090Aca300d00a0038ba0"));
    }

    @Test
    public  void  falseCheckGUID4()
    {
        assertFalse(Task.GUID("8f1c7c36-a9df-6cf099472a5a"));
    }

    @Test
    public  void  falseCheckGUID5()
    {
        assertFalse(Task.GUID("8f1c7c36-2d18-4202adf-6cf099472a5a"));
    }

    @Test
    public  void  falseCheckGUID6()
    {
        assertFalse(Task.GUID("00000000-0000-0000-0000-00000000000"));
    }

    @Test
    public  void  falseCheckGUID7()
    {
        assertFalse(Task.GUID("00000000-0000-0000-00000000000000"));
    }


    @Test
    public  void  falseCheckGUID8()
    {
        assertFalse(Task.GUID("RTYUIOP--OIUYTUIOP--OKJHGBJNK"));
    }

    @Test
    public  void  falseCheckGUID9()
    {
        assertFalse(Task.GUID("wrkerrw-rewii-888888-8854"));
    }

    @Test
    public  void  falseCheckGUID10()
    {
        assertFalse(Task.GUID("111111-8888-9999-0000-12121112"));
    }

}