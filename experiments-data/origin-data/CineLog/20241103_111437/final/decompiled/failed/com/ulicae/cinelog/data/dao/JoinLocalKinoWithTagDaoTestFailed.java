package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class JoinLocalKinoWithTagDaoTestFailed {
   @Test
   public void test_getKey_JoinLocalKinoWithTag_1_301() {
      Long var1 = ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((JoinLocalKinoWithTag)JMockK.mockk(JoinLocalKinoWithTag.class, true));
   }

   @Test
   public void test_getKey_Object_1_349() {
      Object var1 = ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_JoinLocalKinoWithTag_1_317() {
      boolean var1 = ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((JoinLocalKinoWithTag)JMockK.mockk(JoinLocalKinoWithTag.class, true));
   }

   @Test
   public void test_hasKey_Object_1_333() {
      boolean var1 = ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_readEntity_Cursor_JoinLocalKinoWithTag_int_1_281() {
      ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (JoinLocalKinoWithTag)JMockK.mockk(JoinLocalKinoWithTag.class, true), 61);
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_365() {
      ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), -11);
   }

   @Test
   public void test_readEntity_Cursor_int_1_265() {
      JoinLocalKinoWithTag var1 = ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -32);
   }

   @Test
   public void test_readEntity_Cursor_int_1_401() {
      Object var1 = ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -11);
   }

   @Test
   public void test_readKey_Cursor_int_1_249() {
      Long var1 = ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 24);
   }

   @Test
   public void test_readKey_Cursor_int_1_385() {
      Object var1 = ((JoinLocalKinoWithTagDao)JMockK.spyk(new JoinLocalKinoWithTagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 79);
   }
}
