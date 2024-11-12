package com.ulicae.cinelog.data.services.reviews;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.ItemDto;
import com.ulicae.cinelog.data.dto.KinoDto;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class KinoServiceTestFailed {
   @Test
   public void test_createOrUpdate_ItemDto_1_4281() {
      ItemDto var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((ItemDto)JMockK.mockk(ItemDto.class, true));
   }

   @Test
   public void test_createOrUpdate_KinoDto_1_4189() {
      KinoDto var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((KinoDto)JMockK.mockk(KinoDto.class, true));
   }

   @Test
   public void test_delete_ItemDto_1_4309() {
      ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).delete((ItemDto)JMockK.mockk(ItemDto.class, true));
   }

   @Test
   public void test_getKino_long_1_4149() {
      KinoDto var1 = ((KinoService)JMockK.spyk(new KinoService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getKino(70L);
   }
}
