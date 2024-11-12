package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class JoinLocalKinoWithTagDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_233() {
      JoinLocalKinoWithTagDao.createTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_createTable_Database_boolean_2_236() {
      JoinLocalKinoWithTagDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_1_241() {
      JoinLocalKinoWithTagDao.dropTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_2_244() {
      JoinLocalKinoWithTagDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
