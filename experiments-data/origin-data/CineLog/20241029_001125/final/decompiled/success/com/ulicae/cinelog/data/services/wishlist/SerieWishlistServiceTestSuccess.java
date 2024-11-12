package com.ulicae.cinelog.data.services.wishlist;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.ItemDto;
import com.ulicae.cinelog.data.dto.data.WishlistDataDto;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class SerieWishlistServiceTestSuccess {
   @Test
   public void test_createOrUpdateFromImport_List_1_3109() {
      ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdateFromImport((List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_createSerieData_WishlistDataDto_1_3005() {
      ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createSerieData((WishlistDataDto)JMockK.mockk(WishlistDataDto.class, true));
   }

   @Test
   public void test_delete_WishlistDataDto_1_3033() {
      ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).delete((WishlistDataDto)JMockK.mockk(WishlistDataDto.class, true));
   }

   @Test
   public void test_getAll_1_3021() {
      List var1 = ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getAll();
   }

   @Test
   public void test_getWithTmdbId_long_1_3081() {
      WishlistDataDto var1 = ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getWithTmdbId(52L);
   }

   @Test
   public void test_getWithTmdbId_long_1_3141() {
      ItemDto var1 = ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getWithTmdbId(68L);
   }
}
