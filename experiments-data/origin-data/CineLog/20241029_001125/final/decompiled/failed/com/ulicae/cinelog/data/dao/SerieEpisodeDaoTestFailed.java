package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class SerieEpisodeDaoTestFailed {
   @Test
   public void test_getKey_Object_1_1173() {
      Object var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_getKey_SerieEpisode_1_1081() {
      Long var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((SerieEpisode)JMockK.mockk(SerieEpisode.class, true));
   }

   @Test
   public void test_hasKey_Object_1_1157() {
      boolean var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_SerieEpisode_1_1097() {
      boolean var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((SerieEpisode)JMockK.mockk(SerieEpisode.class, true));
   }

   @Test
   public void test_loadAllDeepFromCursor_Cursor_1_1129() {
      List var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadAllDeepFromCursor((Cursor)JMockK.mockk(Cursor.class, true));
   }

   @Test
   public void test_loadDeep_Long_1_1113() {
      SerieEpisode var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadDeep((Long)JMockK.mockk(Long.class, true));
   }

   @Test
   public void test_queryDeep_String_String_1_1145() {
      List var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).queryDeep("ps5vJdiiCv", new String[]{""});
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_1189() {
      ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), -35);
   }

   @Test
   public void test_readEntity_Cursor_SerieEpisode_int_1_1061() {
      ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (SerieEpisode)JMockK.mockk(SerieEpisode.class, true), -63);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1045() {
      SerieEpisode var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -13);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1225() {
      Object var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 14);
   }

   @Test
   public void test_readKey_Cursor_int_1_1029() {
      Long var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 56);
   }

   @Test
   public void test_readKey_Cursor_int_1_1209() {
      Object var1 = ((SerieEpisodeDao)JMockK.spyk(new SerieEpisodeDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -18);
   }
}
