package io.quike.app.module.b;

public class App {

  private static int counter = 0;

  public static void main(String[] args) {
    counter++;
  }

  public static int getCounter() {
    return counter;
  }
}
