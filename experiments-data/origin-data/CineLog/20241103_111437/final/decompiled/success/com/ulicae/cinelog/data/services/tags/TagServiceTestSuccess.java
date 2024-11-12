package com.ulicae.cinelog.data.services.tags;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dto.KinoDto;
import com.ulicae.cinelog.data.dto.TagDto;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class TagServiceTestSuccess {
   @Test
   public void test_addTagToItemIfNotExists_TagDto_KinoDto_1_3917() {
      ((TagService)JMockK.spyk(new TagService((DaoSession)JMockK.mockk(DaoSession.class, true)))).addTagToItemIfNotExists((TagDto)JMockK.mockk(TagDto.class, true), (KinoDto)JMockK.mockk(KinoDto.class, true));
   }

   @Test
   public void test_createOrUpdateFromImport_List_1_3861() {
      ((TagService)JMockK.spyk(new TagService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdateFromImport((List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_createOrUpdate_TagDto_1_3901() {
      ((TagService)JMockK.spyk(new TagService((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((TagDto)JMockK.mockk(TagDto.class, true));
   }

   @Test
   public void test_getAll_1_3849() {
      List var1 = ((TagService)JMockK.spyk(new TagService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getAll();
   }

   @Test
   public void test_getMovieTags_1_3877() {
      List var1 = ((TagService)JMockK.spyk(new TagService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getMovieTags();
   }

   @Test
   public void test_getSeriesTags_1_3889() {
      List var1 = ((TagService)JMockK.spyk(new TagService((DaoSession)JMockK.mockk(DaoSession.class, true)))).getSeriesTags();
   }

   @Test
   public void test_removeTagFromItemIfExists_TagDto_KinoDto_1_3937() {
      ((TagService)JMockK.spyk(new TagService((DaoSession)JMockK.mockk(DaoSession.class, true)))).removeTagFromItemIfExists((TagDto)JMockK.mockk(TagDto.class, true), (KinoDto)JMockK.mockk(KinoDto.class, true));
   }

   @Test
   public void test_removeTag_TagDto_1_3957() {
      ((TagService)JMockK.spyk(new TagService((DaoSession)JMockK.mockk(DaoSession.class, true)))).removeTag((TagDto)JMockK.mockk(TagDto.class, true));
   }
}
