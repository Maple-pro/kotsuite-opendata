package com.ulicae.cinelog.data.services.reviews;

import android.content.Context;
import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.ItemDto;
import com.ulicae.cinelog.data.dto.SerieDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerieServiceTestFailed {
   @Test
   public void test_createOrUpdate_ItemDto_1_3725() {
      ItemDto var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).createOrUpdate((ItemDto)JMockK.mockk(ItemDto.class, true));
   }

   @Test
   public void test_createOrUpdate_SerieDto_1_3597() {
      SerieDto var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).createOrUpdate((SerieDto)JMockK.mockk(SerieDto.class, true));
   }

   @Test
   public void test_delete_ItemDto_1_3761() {
      ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).delete((ItemDto)JMockK.mockk(ItemDto.class, true));
   }

   @Test
   public void test_getReview_long_1_3545() {
      SerieDto var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).getReview(40L);
   }

   @Test
   public void test_syncWithTmdb_long_1_3637() {
      ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).syncWithTmdb(14L);
   }
}
