package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class JoinReviewWithTagDaoTestFailed {
   @Test
   public void test_getKey_JoinReviewWithTag_1_485() {
      Long var1 = ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((JoinReviewWithTag)JMockK.mockk(JoinReviewWithTag.class, true));
   }

   @Test
   public void test_getKey_Object_1_533() {
      Object var1 = ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_JoinReviewWithTag_1_501() {
      boolean var1 = ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((JoinReviewWithTag)JMockK.mockk(JoinReviewWithTag.class, true));
   }

   @Test
   public void test_hasKey_Object_1_517() {
      boolean var1 = ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_readEntity_Cursor_JoinReviewWithTag_int_1_465() {
      ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (JoinReviewWithTag)JMockK.mockk(JoinReviewWithTag.class, true), -44);
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_549() {
      ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), -30);
   }

   @Test
   public void test_readEntity_Cursor_int_1_449() {
      JoinReviewWithTag var1 = ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -97);
   }

   @Test
   public void test_readEntity_Cursor_int_1_585() {
      Object var1 = ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -85);
   }

   @Test
   public void test_readKey_Cursor_int_1_433() {
      Long var1 = ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 45);
   }

   @Test
   public void test_readKey_Cursor_int_1_569() {
      Object var1 = ((JoinReviewWithTagDao)JMockK.spyk(new JoinReviewWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 59);
   }
}
