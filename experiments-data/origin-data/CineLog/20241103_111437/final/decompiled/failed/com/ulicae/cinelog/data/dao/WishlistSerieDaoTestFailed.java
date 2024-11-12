package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class WishlistSerieDaoTestFailed {
   @Test
   public void test_getKey_Object_1_2257() {
      Object var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_getKey_WishlistSerie_1_2165() {
      Long var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((WishlistSerie)JMockK.mockk(WishlistSerie.class, true));
   }

   @Test
   public void test_hasKey_Object_1_2241() {
      boolean var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_WishlistSerie_1_2181() {
      boolean var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((WishlistSerie)JMockK.mockk(WishlistSerie.class, true));
   }

   @Test
   public void test_loadAllDeepFromCursor_Cursor_1_2213() {
      List var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadAllDeepFromCursor((Cursor)JMockK.mockk(Cursor.class, true));
   }

   @Test
   public void test_loadDeep_Long_1_2197() {
      WishlistSerie var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadDeep((Long)JMockK.mockk(Long.class, true));
   }

   @Test
   public void test_queryDeep_String_String_1_2229() {
      List var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).queryDeep("YxRvbExle2MeRAYGY7l5fohUH1blpESBinh-LyViGvLpa0SHfPCb-oEnS8hbkv+wNWposJUj1AD10QPi", new String[]{""});
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_2273() {
      ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), -44);
   }

   @Test
   public void test_readEntity_Cursor_WishlistSerie_int_1_2145() {
      ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (WishlistSerie)JMockK.mockk(WishlistSerie.class, true), 89);
   }

   @Test
   public void test_readEntity_Cursor_int_1_2129() {
      WishlistSerie var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -53);
   }

   @Test
   public void test_readEntity_Cursor_int_1_2309() {
      Object var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -29);
   }

   @Test
   public void test_readKey_Cursor_int_1_2113() {
      Long var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 56);
   }

   @Test
   public void test_readKey_Cursor_int_1_2293() {
      Object var1 = ((WishlistSerieDao)JMockK.spyk(new WishlistSerieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -58);
   }
}
