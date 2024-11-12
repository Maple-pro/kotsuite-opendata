package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class LocalKinoDaoTestFailed {
   @Test
   public void test_getKey_LocalKino_1_669() {
      Long var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((LocalKino)JMockK.mockk(LocalKino.class, true));
   }

   @Test
   public void test_getKey_Object_1_761() {
      Object var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_LocalKino_1_685() {
      boolean var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((LocalKino)JMockK.mockk(LocalKino.class, true));
   }

   @Test
   public void test_hasKey_Object_1_745() {
      boolean var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_loadAllDeepFromCursor_Cursor_1_717() {
      List var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadAllDeepFromCursor((Cursor)JMockK.mockk(Cursor.class, true));
   }

   @Test
   public void test_loadDeep_Long_1_701() {
      LocalKino var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadDeep((Long)JMockK.mockk(Long.class, true));
   }

   @Test
   public void test_queryDeep_String_String_1_733() {
      List var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).queryDeep("5VY8jM3Rg5fWbu743XqrnN3om+HAlfJWAkGgO03E0-FVP6dR5lweQJU+PVAX4YLuX6mND6tkp3ztYrUAvF80E+", new String[]{""});
   }

   @Test
   public void test_readEntity_Cursor_LocalKino_int_1_649() {
      ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (LocalKino)JMockK.mockk(LocalKino.class, true), 99);
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_777() {
      ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), -36);
   }

   @Test
   public void test_readEntity_Cursor_int_1_633() {
      LocalKino var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 33);
   }

   @Test
   public void test_readEntity_Cursor_int_1_813() {
      Object var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -24);
   }

   @Test
   public void test_readKey_Cursor_int_1_617() {
      Long var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -71);
   }

   @Test
   public void test_readKey_Cursor_int_1_797() {
      Object var1 = ((LocalKinoDao)JMockK.spyk(new LocalKinoDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 2);
   }
}
