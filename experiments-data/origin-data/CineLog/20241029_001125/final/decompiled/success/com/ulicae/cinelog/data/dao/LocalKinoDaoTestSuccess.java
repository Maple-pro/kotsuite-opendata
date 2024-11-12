package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class LocalKinoDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_601() {
      LocalKinoDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_1_609() {
      LocalKinoDao.dropTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_2_612() {
      LocalKinoDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
