package com.vrem.wifianalyzer.wifi.scanner;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class CacheTestSuccess {
   @Test
   public void test_scanResults_1_4316() {
      List var1 = ((Cache)JMockK.spyk(new Cache())).scanResults();
   }
}
