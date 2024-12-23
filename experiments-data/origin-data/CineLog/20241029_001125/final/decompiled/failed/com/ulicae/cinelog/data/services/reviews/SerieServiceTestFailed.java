package com.ulicae.cinelog.data.services.reviews;

import android.content.Context;
import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.SerieReview;
import com.ulicae.cinelog.data.dto.ItemDto;
import com.ulicae.cinelog.data.dto.SerieDto;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class SerieServiceTestFailed {
   @Test
   public void test_createOrUpdateFromImport_List_1_3617() {
      ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).createOrUpdateFromImport((List)JMockK.mockk(List.class, true));
   }

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
   public void test_delete_SerieDto_1_3577() {
      ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).delete((SerieDto)JMockK.mockk(SerieDto.class, true));
   }

   @Test
   public void test_getAllByRating_boolean_1_3693() {
      List var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).getAllByRating(false);
   }

   @Test
   public void test_getAllByTitle_boolean_1_3709() {
      List var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).getAllByTitle(true);
   }

   @Test
   public void test_getAll_1_3677() {
      List var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).getAll();
   }

   @Test
   public void test_getReview_long_1_3545() {
      SerieDto var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).getReview(-15L);
   }

   @Test
   public void test_getWithTmdbId_long_1_3561() {
      SerieDto var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).getWithTmdbId(66L);
   }

   @Test
   public void test_getWithTmdbId_long_1_3745() {
      ItemDto var1 = ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).getWithTmdbId(-87L);
   }

   @Test
   public void test_syncWithTmdb_long_1_3637() {
      ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).syncWithTmdb(-80L);
   }

   @Test
   public void test_updateTmdbInfo_SerieDto_SerieReview_1_3653() {
      ((SerieService)JMockK.spyk(new SerieService((DaoSession)JMockK.mockk(DaoSession.class, true), (Context)JMockK.mockk(Context.class, true)))).updateTmdbInfo((SerieDto)JMockK.mockk(SerieDto.class, true), (SerieReview)JMockK.mockk(SerieReview.class, true));
   }
}
