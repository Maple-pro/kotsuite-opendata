package com.ulicae.cinelog.data.dao;

import io.github.maples.jmockk.JMockK;
import java.util.Map;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.junit.Test;

public class DaoSessionTestFailed {
   @Test
   public void test_clear_1_213() {
      ((DaoSession)JMockK.spyk(new DaoSession((Database)JMockK.mockk(Database.class, true), (IdentityScopeType)JMockK.mockk(IdentityScopeType.class, true), (Map)JMockK.mockk(Map.class, true)))).clear();
   }
}
