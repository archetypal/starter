package io.archetypal.example;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class ExampleTest {

  @Test
  public void testExampleNull() throws IOException {
    assertEquals(0, Example.Run(null));
  }

  @Test
  public void testHello() throws IOException {
    assertEquals("Hello, World", Example.hello(null));
    assertEquals("Hello, World!", Example.hello("World!"));
  }

}