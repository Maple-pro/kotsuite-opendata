package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class TagDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_1469() {
      TagDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_1_1477() {
      TagDao.dropTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_2_1480() {
      TagDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
