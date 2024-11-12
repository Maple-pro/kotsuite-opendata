package com.ulicae.cinelog.data.dao;

import android.database.sqlite.SQLiteDatabase;
import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.junit.Test;

public class DaoMasterTestSuccess {
   @Test
   public void test_createAllTables_Database_boolean_1_2869() {
      DaoMaster.createAllTables((Database)JMockK.mockk(Database.class, true), false);
   }

   @Test
   public void test_dropAllTables_Database_boolean_1_2877() {
      DaoMaster.dropAllTables((Database)JMockK.mockk(Database.class, true), true);
   }

   @Test
   public void test_newSession_1_2893() {
      DaoSession var1 = ((DaoMaster)JMockK.spyk(new DaoMaster((SQLiteDatabase)JMockK.mockk(SQLiteDatabase.class, true)))).newSession();
   }

   @Test
   public void test_newSession_1_2937() {
      AbstractDaoSession var1 = ((DaoMaster)JMockK.spyk(new DaoMaster((SQLiteDatabase)JMockK.mockk(SQLiteDatabase.class, true)))).newSession();
   }
}
