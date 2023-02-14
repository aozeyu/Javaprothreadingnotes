package com.example.javaprothreadingnotes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaprothreadingnotesApplicationTests {

  @Test
  void contextLoads() {

  }
  @Test
  @DisplayName("Should migrate a simple test")
  public void shouldMigrateASimpleTest() {
    Assertions.fail("Not implemented");
  }

  @Test
  public void displayNameForMyTest() {
    System.out.println(123);
  }

}
