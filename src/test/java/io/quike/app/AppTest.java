package io.quike.app;

import static org.junit.Assert.assertTrue;

import io.quike.app.module.b.App;
import org.junit.Test;

public class AppTest {

  @Test
  public void testApp() {
    io.quike.app.module.b.App.main(new String[0]);
    assertTrue(App.getCounter() == 1);
  }
}
