package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class TmdbSerieDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_1685() {
      TmdbSerieDao.createTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_1_1693() {
      TmdbSerieDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_2_1696() {
      TmdbSerieDao.dropTable((Database)JMockK.mockk(Database.class, true), true);
   }
}
