package com.ulicae.cinelog.data.services.reviews;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.ItemDto;
import com.ulicae.cinelog.data.dto.KinoDto;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class KinoServiceTestSuccess {
   @Test
   public void test_createOrUpdateFromImport_List_1_4173() {
      ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdateFromImport((List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_delete_KinoDto_1_4265() {
      ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).delete((KinoDto)JMockK.mockk(KinoDto.class, true));
   }

   @Test
   public void test_getAll_1_4161() {
      List var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getAll();
   }

   @Test
   public void test_getKinosByRating_boolean_1_4217() {
      List var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getKinosByRating(false);
   }

   @Test
   public void test_getKinosByReviewDate_boolean_1_4241() {
      List var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getKinosByReviewDate(true);
   }

   @Test
   public void test_getKinosByTitle_boolean_1_4253() {
      List var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getKinosByTitle(false);
   }

   @Test
   public void test_getKinosByYear_boolean_1_4229() {
      List var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getKinosByYear(false);
   }

   @Test
   public void test_getWithTmdbId_long_1_4205() {
      KinoDto var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getWithTmdbId(54L);
   }

   @Test
   public void test_getWithTmdbId_long_1_4297() {
      ItemDto var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getWithTmdbId(19L);
   }
}
