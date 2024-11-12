package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class JoinReviewWithTagDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_417() {
      JoinReviewWithTagDao.createTable((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_dropTable_Database_boolean_1_425() {
      JoinReviewWithTagDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
