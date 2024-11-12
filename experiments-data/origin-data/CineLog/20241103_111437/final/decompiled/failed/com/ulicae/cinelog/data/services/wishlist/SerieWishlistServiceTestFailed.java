package com.ulicae.cinelog.data.services.wishlist;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.ItemDto;
import com.ulicae.cinelog.data.dto.data.WishlistDataDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieWishlistServiceTestFailed {
   @Test
   public void test_createOrUpdate_ItemDto_1_3125() {
      ItemDto var1 = ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((ItemDto)JMockK.mockk(ItemDto.class, true));
   }

   @Test
   public void test_createOrUpdate_WishlistDataDto_1_3093() {
      WishlistDataDto var1 = ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((WishlistDataDto)JMockK.mockk(WishlistDataDto.class, true));
   }

   @Test
   public void test_delete_ItemDto_1_3153() {
      ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).delete((ItemDto)JMockK.mockk(ItemDto.class, true));
   }

   @Test
   public void test_getByTmdbId_Integer_1_3049() {
      WishlistDataDto var1 = ((SerieWishlistService)JMockK.spyk(new SerieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getByTmdbId((Integer)JMockK.mockk(Integer.class, true));
   }
}
