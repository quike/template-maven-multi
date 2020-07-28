package io.quike.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.quike.app.module.b.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  @DisplayName("App - Should fail to count on null args.")
  void shouldFailCountAppNullArgs() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> App.main(null));
    assertEquals("No null args are allowed.", exception.getMessage());
  }

  @Test
  @DisplayName("App - Should count on empty args.")
  void shouldCountAppEmptyArgs() {
    App.main(new String[0]);
    assertEquals(0, App.getCounter());
  }

  @Test
  @DisplayName("App - Should count on args")
  void shouldCountAppWithArgs() {
    App.main(new String[] {"Hello", "World"});
    assertEquals(2, App.getCounter());
  }
}
