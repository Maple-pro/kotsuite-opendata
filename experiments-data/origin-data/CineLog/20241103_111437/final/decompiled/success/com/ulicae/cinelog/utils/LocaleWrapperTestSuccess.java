package com.ulicae.cinelog.utils;

import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class LocaleWrapperTestSuccess {
   @Test
   public void test_getLanguage_1_4505() {
      Assert.assertEquals("en", ((LocaleWrapper)JMockK.spyk(new LocaleWrapper())).getLanguage());
   }
}
