package io.quike.app.module.a;

import lombok.Getter;

@Getter
public enum Type {
  WHATEVER("whatever"),
  WHOEVER("whoever");

  private String value;

  Type(String value) {
    this.value = value;
  }
}
