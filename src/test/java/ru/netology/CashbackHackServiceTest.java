package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void testRemain() {
        CashbackHackService serviceTest = new CashbackHackService();

        // тест при покупке менее 1000р
        int Test1 = serviceTest.remain(900);
        System.out.println("Вам следует докупить на " + Test1);
        assertEquals(Test1, 100);
    }

    @Test
    public void testRemainBad() {
        CashbackHackService serviceTest2 = new CashbackHackService();
        int Test2 = serviceTest2.remain(1000);
        assertEquals(Test2, 0);
        
    }
}
