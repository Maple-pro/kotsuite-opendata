package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class SerieReviewDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_1241() {
      SerieReviewDao.createTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_createTable_Database_boolean_2_1244() {
      SerieReviewDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_1_1249() {
      SerieReviewDao.dropTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_2_1252() {
      SerieReviewDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
