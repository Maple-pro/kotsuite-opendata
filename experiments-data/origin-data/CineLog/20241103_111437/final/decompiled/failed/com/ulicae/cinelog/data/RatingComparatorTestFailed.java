package com.ulicae.cinelog.data;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class RatingComparatorTestFailed {
   @Test
   public void test_compare_Object_Object_1_4365() {
      int var1 = ((RatingComparator)JMockK.spyk(new RatingComparator())).compare((Object)JMockK.mockk(Object.class, true), (Object)JMockK.mockk(Object.class, true));
   }
}
