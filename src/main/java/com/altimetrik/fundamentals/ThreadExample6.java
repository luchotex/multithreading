package com.altimetrik.fundamentals;

public class ThreadExample6 {

  public static void main(String[] args) {
    Runnable runnable = () -> {
      String threadName = Thread.currentThread().getName();
      System.out.println(threadName + " running");

      try {
        Thread.sleep(2000);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }

      System.out.println(threadName + " finished");
    };

    Thread thread = new Thread(runnable, "The Thread 1");
    thread.start();
  }
}
