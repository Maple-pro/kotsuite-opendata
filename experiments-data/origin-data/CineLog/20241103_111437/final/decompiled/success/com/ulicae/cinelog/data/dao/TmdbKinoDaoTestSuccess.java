package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class TmdbKinoDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_29() {
      TmdbKinoDao.createTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_createTable_Database_boolean_2_32() {
      TmdbKinoDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_1_37() {
      TmdbKinoDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_2_40() {
      TmdbKinoDao.dropTable((Database)JMockK.mockk(Database.class, true), true);
   }
}
