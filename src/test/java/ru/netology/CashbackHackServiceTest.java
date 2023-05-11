package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
    int Test2 = serviceTest2.remain(800);
    assertEquals(Test2, 200);
        System.out.println("Вам следует докупить на " + Test2);
}
}