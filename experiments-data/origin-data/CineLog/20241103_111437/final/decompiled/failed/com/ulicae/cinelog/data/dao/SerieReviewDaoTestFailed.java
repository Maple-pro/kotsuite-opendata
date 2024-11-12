package com.ulicae.cinelog.data.dao;

import android.database.Cursor;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.greenrobot.greendao.internal.DaoConfig;
import org.junit.Test;

public class SerieReviewDaoTestFailed {
   @Test
   public void test_getKey_Object_1_1401() {
      Object var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_getKey_SerieReview_1_1309() {
      Long var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).getKey((SerieReview)JMockK.mockk(SerieReview.class, true));
   }

   @Test
   public void test_hasKey_Object_1_1385() {
      boolean var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_hasKey_SerieReview_1_1325() {
      boolean var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).hasKey((SerieReview)JMockK.mockk(SerieReview.class, true));
   }

   @Test
   public void test_loadAllDeepFromCursor_Cursor_1_1357() {
      List var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadAllDeepFromCursor((Cursor)JMockK.mockk(Cursor.class, true));
   }

   @Test
   public void test_loadDeep_Long_1_1341() {
      SerieReview var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).loadDeep((Long)JMockK.mockk(Long.class, true));
   }

   @Test
   public void test_queryDeep_String_String_1_1373() {
      List var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).queryDeep("6ijqTYH9YEPF4p0qmJHnvDhTf-5PCFOl1", new String[]{""});
   }

   @Test
   public void test_readEntity_Cursor_Object_int_1_1417() {
      ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (Object)JMockK.mockk(Object.class, true), 17);
   }

   @Test
   public void test_readEntity_Cursor_SerieReview_int_1_1289() {
      ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), (SerieReview)JMockK.mockk(SerieReview.class, true), -52);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1273() {
      SerieReview var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), -54);
   }

   @Test
   public void test_readEntity_Cursor_int_1_1453() {
      Object var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readEntity((Cursor)JMockK.mockk(Cursor.class, true), 28);
   }

   @Test
   public void test_readKey_Cursor_int_1_1257() {
      Long var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), 93);
   }

   @Test
   public void test_readKey_Cursor_int_1_1437() {
      Object var1 = ((SerieReviewDao)JMockK.spyk(new SerieReviewDao((DaoConfig)JMockK.mockk(DaoConfig.class, true)))).readKey((Cursor)JMockK.mockk(Cursor.class, true), -12);
   }
}
