package com.ulicae.cinelog.data.services.wishlist;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.ItemDto;
import com.ulicae.cinelog.data.dto.data.WishlistDataDto;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class MovieWishlistServiceTestSuccess {
   @Test
   public void test_createMovieData_WishlistDataDto_1_3181() {
      ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createMovieData((WishlistDataDto)JMockK.mockk(WishlistDataDto.class, true));
   }

   @Test
   public void test_createOrUpdateFromImport_List_1_3285() {
      ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdateFromImport((List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_delete_WishlistDataDto_1_3209() {
      ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).delete((WishlistDataDto)JMockK.mockk(WishlistDataDto.class, true));
   }

   @Test
   public void test_getAll_1_3197() {
      List var1 = ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getAll();
   }

   @Test
   public void test_getWithTmdbId_long_1_3257() {
      WishlistDataDto var1 = ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getWithTmdbId(34L);
   }

   @Test
   public void test_getWithTmdbId_long_1_3317() {
      ItemDto var1 = ((MovieWishlistService)JMockK.spyk(new MovieWishlistService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getWithTmdbId(-48L);
   }
}
