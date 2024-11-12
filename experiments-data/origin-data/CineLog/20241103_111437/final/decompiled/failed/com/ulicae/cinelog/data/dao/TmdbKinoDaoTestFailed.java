package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class TmdbKinoDaoTestFailed {
   @Test
   public void test_getKey_Object_1_145() {
      Object var1 = ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_getKey_TmdbKino_1_97() {
      Long var1 = ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((TmdbKino)JMockK.mockk(TmdbKino.class, true));
   }

   @Test
   public void test_hasKey_Object_1_129() {
      boolean var1 = ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_TmdbKino_1_113() {
      boolean var1 = ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((TmdbKino)JMockK.mockk(TmdbKino.class, true));
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_161() {
      ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), 85);
   }

   @Test
   public void test_readEntity_Cursor_TmdbKino_int_1_77() {
      ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (TmdbKino)JMockK.mockk(TmdbKino.class, true), 7);
   }

   @Test
   public void test_readEntity_Cursor_int_1_197() {
      Object var1 = ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -45);
   }

   @Test
   public void test_readEntity_Cursor_int_1_61() {
      TmdbKino var1 = ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -54);
   }

   @Test
   public void test_readKey_Cursor_int_1_181() {
      Object var1 = ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 7);
   }

   @Test
   public void test_readKey_Cursor_int_1_45() {
      Long var1 = ((TmdbKinoDao)JMockK.spyk(new TmdbKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -5);
   }
}
