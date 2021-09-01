package com.altimetrik.fundamentals;

public class ThreadExample3 {

  public static class MyRunnable implements Runnable {

    @Override
    public void run() {
      System.out.println("Runnable running");
      System.out.println("Runnable finished");
    }
  }


  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
  }
}
