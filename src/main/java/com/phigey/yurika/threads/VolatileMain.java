package com.phigey.yurika.threads;

import java.util.concurrent.TimeUnit;

public class VolatileMain {

    volatile boolean running = true;

    public void doRunning() {
        System.out.println("===================== START =====================");
        while (running) {
        }
        System.out.println("===================== STOP =====================");
    }

    public static void main(String[] args) {
        VolatileMain volatileMain = new VolatileMain();
        new Thread(volatileMain::doRunning).start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(volatileMain.running);
        volatileMain.running = false;
        System.out.println(volatileMain.running);

    }
}
