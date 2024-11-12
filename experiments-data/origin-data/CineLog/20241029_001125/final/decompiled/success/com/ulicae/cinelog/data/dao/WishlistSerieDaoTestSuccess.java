package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class WishlistSerieDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_2097() {
      WishlistSerieDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_createTable_Database_boolean_2_2100() {
      WishlistSerieDao.createTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_1_2105() {
      WishlistSerieDao.dropTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_2_2108() {
      WishlistSerieDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
