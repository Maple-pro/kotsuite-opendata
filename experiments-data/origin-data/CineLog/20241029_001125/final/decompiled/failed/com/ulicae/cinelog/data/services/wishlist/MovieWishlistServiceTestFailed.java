package com.ulicae.cinelog.data.services.wishlist;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.ItemDto;
import com.ulicae.cinelog.data.dto.data.WishlistDataDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MovieWishlistServiceTestFailed {
   @Test
   public void test_createOrUpdate_ItemDto_1_3301() {
      ItemDto var1 = ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((ItemDto)JMockK.mockk(ItemDto.class, true));
   }

   @Test
   public void test_createOrUpdate_WishlistDataDto_1_3269() {
      WishlistDataDto var1 = ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((WishlistDataDto)JMockK.mockk(WishlistDataDto.class, true));
   }

   @Test
   public void test_delete_ItemDto_1_3329() {
      ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).delete((ItemDto)JMockK.mockk(ItemDto.class, true));
   }

   @Test
   public void test_getByTmdbId_Integer_1_3225() {
      WishlistDataDto var1 = ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getByTmdbId((Integer)JMockK.mockk(Integer.class, true));
   }
}
