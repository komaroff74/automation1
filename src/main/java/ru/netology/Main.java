package ru.netology;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(800);
        System.out.println("остаток "+ result);
    }
}
