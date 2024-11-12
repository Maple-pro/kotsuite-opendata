package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class ReviewDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_829() {
      ReviewDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_createTable_Database_boolean_2_832() {
      ReviewDao.createTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_1_837() {
      ReviewDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
