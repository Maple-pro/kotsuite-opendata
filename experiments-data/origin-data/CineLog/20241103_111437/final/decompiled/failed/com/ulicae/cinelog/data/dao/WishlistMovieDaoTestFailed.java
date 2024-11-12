package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class WishlistMovieDaoTestFailed {
   @Test
   public void test_getKey_Object_1_2029() {
      Object var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_getKey_WishlistMovie_1_1937() {
      Long var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((WishlistMovie)JMockK.mockk(WishlistMovie.class, true));
   }

   @Test
   public void test_hasKey_Object_1_2013() {
      boolean var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_WishlistMovie_1_1953() {
      boolean var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((WishlistMovie)JMockK.mockk(WishlistMovie.class, true));
   }

   @Test
   public void test_loadAllDeepFromCursor_Cursor_1_1985() {
      List var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadAllDeepFromCursor((Cursor)JMockK.mockk(Cursor.class, true));
   }

   @Test
   public void test_loadDeep_Long_1_1969() {
      WishlistMovie var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadDeep((Long)JMockK.mockk(Long.class, true));
   }

   @Test
   public void test_queryDeep_String_String_1_2001() {
      List var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).queryDeep("WTULbq5XrJWgXGLlCGQqSaCCuXP8XKJPuCyTq5Gw5BsZHKV-nDzETYh4xMZlj5YhM6v1VQXZre", new String[]{""});
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_2045() {
      ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), -84);
   }

   @Test
   public void test_readEntity_Cursor_WishlistMovie_int_1_1917() {
      ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (WishlistMovie)JMockK.mockk(WishlistMovie.class, true), -96);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1901() {
      WishlistMovie var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -22);
   }

   @Test
   public void test_readEntity_Cursor_int_1_2081() {
      Object var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 96);
   }

   @Test
   public void test_readKey_Cursor_int_1_1885() {
      Long var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -74);
   }

   @Test
   public void test_readKey_Cursor_int_1_2065() {
      Object var1 = ((WishlistMovieDao)JMockK.spyk(new WishlistMovieDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 64);
   }
}
