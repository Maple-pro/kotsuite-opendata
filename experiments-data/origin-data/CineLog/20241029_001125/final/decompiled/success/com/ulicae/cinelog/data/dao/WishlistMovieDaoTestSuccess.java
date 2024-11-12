package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class WishlistMovieDaoTestSuccess {
   @Test
   public void test_createTable_Database_boolean_1_1869() {
      WishlistMovieDao.createTable((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropTable_Database_boolean_1_1877() {
      WishlistMovieDao.dropTable((Database)JMockK.mockk(Database.class, true), false);
   }
}
