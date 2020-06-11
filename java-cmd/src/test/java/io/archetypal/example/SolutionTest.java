package io.archetypal.example;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testEven() throws IOException {
    assertTrue("Expecting even", Solution.even(0));
    assertTrue("Expecting even", Solution.even(-2));
    assertTrue("Expecting even", Solution.even(2));
  }



}