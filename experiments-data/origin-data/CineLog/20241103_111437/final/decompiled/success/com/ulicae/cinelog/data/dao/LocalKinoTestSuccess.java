package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class LocalKinoTestSuccess {
   @Test
   public void test___setDaoSession_DaoSession_1_2497() {
      ((LocalKino)JMockK.spyk(new LocalKino())).__setDaoSession((DaoSession)JMockK.mockk(DaoSession.class, true));
   }

   @Test
   public void test_resetTags_1_2489() {
      ((LocalKino)JMockK.spyk(new LocalKino())).resetTags();
   }
}
