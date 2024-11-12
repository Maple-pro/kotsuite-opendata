package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class LocalKinoTestFailed {
   @Test
   public void test_delete_1_2465() {
      ((LocalKino)JMockK.spyk(new LocalKino())).delete();
   }

   @Test
   public void test_refresh_1_2473() {
      ((LocalKino)JMockK.spyk(new LocalKino())).refresh();
   }

   @Test
   public void test_update_1_2481() {
      ((LocalKino)JMockK.spyk(new LocalKino())).update();
   }
}
