package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class SerieEpisodeDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_1013() {
      SerieEpisodeDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_1_1021() {
      SerieEpisodeDao.dropTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_2_1024() {
      SerieEpisodeDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
