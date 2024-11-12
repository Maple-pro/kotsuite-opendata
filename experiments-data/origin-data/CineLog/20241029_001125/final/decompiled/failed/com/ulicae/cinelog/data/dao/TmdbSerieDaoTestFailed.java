package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class TmdbSerieDaoTestFailed {
   @Test
   public void test_getKey_Object_1_1801() {
      Object var1 = ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_getKey_TmdbSerie_1_1753() {
      Long var1 = ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((TmdbSerie)JMockK.mockk(TmdbSerie.class, true));
   }

   @Test
   public void test_hasKey_Object_1_1785() {
      boolean var1 = ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_TmdbSerie_1_1769() {
      boolean var1 = ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((TmdbSerie)JMockK.mockk(TmdbSerie.class, true));
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_1817() {
      ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), 11);
   }

   @Test
   public void test_readEntity_Cursor_TmdbSerie_int_1_1733() {
      ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (TmdbSerie)JMockK.mockk(TmdbSerie.class, true), 55);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1717() {
      TmdbSerie var1 = ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -63);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1853() {
      Object var1 = ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 59);
   }

   @Test
   public void test_readKey_Cursor_int_1_1701() {
      Long var1 = ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -76);
   }

   @Test
   public void test_readKey_Cursor_int_1_1837() {
      Object var1 = ((TmdbSerieDao)JMockK.spyk(new TmdbSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -32);
   }
}
