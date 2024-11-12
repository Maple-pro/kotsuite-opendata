package com.ulicae.cinelog.data.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.github.maples.jmockk.JMockK;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.junit.Test;

public class DaoMasterTestFailed {
   @Test
   public void test_newDevSession_Context_String_1_2885() {
      DaoSession var1 = DaoMaster.newDevSession((Context)JMockK.mockk(Context.class, true), "gVFrEGr2iQ7jBORx1qlCF3QWL7TKH4Wl8sFU0DgArSK1V6QjgHL1E");
   }

   @Test
   public void test_newSession_IdentityScopeType_1_2905() {
      DaoSession var1 = ((DaoMaster)JMockK.spyk(new DaoMaster((SQLiteDatabase)JMockK.mockk(SQLiteDatabase.class, true)))).newSession((IdentityScopeType)JMockK.mockk(IdentityScopeType.class, true));
   }

   @Test
   public void test_newSession_IdentityScopeType_1_2921() {
      AbstractDaoSession var1 = ((DaoMaster)JMockK.spyk(new DaoMaster((SQLiteDatabase)JMockK.mockk(SQLiteDatabase.class, true)))).newSession((IdentityScopeType)JMockK.mockk(IdentityScopeType.class, true));
   }
}
