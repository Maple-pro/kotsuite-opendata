package com.vrem.wifianalyzer.wifi.scanner;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class CacheTestFailed {
   @Test
   public void test_add_List_1_4324() {
      ((Cache)JMockK.spyk(new Cache())).add((List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_first_1_4336() {
      List var1 = ((Cache)JMockK.spyk(new Cache())).first();
   }

   @Test
   public void test_last_1_4344() {
      List var1 = ((Cache)JMockK.spyk(new Cache())).last();
   }

   @Test
   public void test_size_1_4352() {
      int var1 = ((Cache)JMockK.spyk(new Cache())).size();
   }
}
