package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class ReviewDaoTestFailed {
   @Test
   public void test_getKey_Object_1_945() {
      Object var1 = ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_getKey_Review_1_897() {
      Long var1 = ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Review)JMockK.mockk(Review.class, true));
   }

   @Test
   public void test_hasKey_Object_1_929() {
      boolean var1 = ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_Review_1_913() {
      boolean var1 = ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Review)JMockK.mockk(Review.class, true));
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_961() {
      ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), 22);
   }

   @Test
   public void test_readEntity_Cursor_Review_int_1_877() {
      ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Review)JMockK.mockk(Review.class, true), 66);
   }

   @Test
   public void test_readEntity_Cursor_int_1_861() {
      Review var1 = ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 26);
   }

   @Test
   public void test_readEntity_Cursor_int_1_997() {
      Object var1 = ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 55);
   }

   @Test
   public void test_readKey_Cursor_int_1_845() {
      Long var1 = ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -10);
   }

   @Test
   public void test_readKey_Cursor_int_1_981() {
      Object var1 = ((ReviewDao)JMockK.spyk(new ReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -11);
   }
}
