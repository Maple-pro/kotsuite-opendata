package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class TagDaoTestFailed {
   @Test
   public void test__queryLocalKino_Tags_Long_1_1569() {
      List var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true))))._queryLocalKino_Tags((Long)JMockK.mockk(Long.class, true));
   }

   @Test
   public void test__queryReview_Tags_Long_1_1585() {
      List var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true))))._queryReview_Tags((Long)JMockK.mockk(Long.class, true));
   }

   @Test
   public void test_getKey_Object_1_1617() {
      Object var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_getKey_Tag_1_1537() {
      Long var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Tag)JMockK.mockk(Tag.class, true));
   }

   @Test
   public void test_hasKey_Object_1_1601() {
      boolean var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_Tag_1_1553() {
      boolean var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Tag)JMockK.mockk(Tag.class, true));
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_1633() {
      ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), 52);
   }

   @Test
   public void test_readEntity_Cursor_Tag_int_1_1517() {
      ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Tag)JMockK.mockk(Tag.class, true), -46);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1501() {
      Tag var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 63);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1669() {
      Object var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 64);
   }

   @Test
   public void test_readKey_Cursor_int_1_1485() {
      Long var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -33);
   }

   @Test
   public void test_readKey_Cursor_int_1_1653() {
      Object var1 = ((TagDao)JMockK.spyk(new TagDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 72);
   }
}
