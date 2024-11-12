package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.JoinLocalKinoWithTag;
import com.ulicae.cinelog.data.dao.JoinWithTag;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class JoinLocalKinoWithTagRepositoryTestSuccess {
   @Test
   public void test_createJoin_long_long_1_4113() {
      ((JoinLocalKinoWithTagRepository)JMockK.spyk(new JoinLocalKinoWithTagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).createJoin(-94L, -20L);
   }

   @Test
   public void test_findAllByTag_long_1_4101() {
      List var1 = ((JoinLocalKinoWithTagRepository)JMockK.spyk(new JoinLocalKinoWithTagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByTag(-81L);
   }

   @Test
   public void test_findByTagAndEntityId_long_long_1_4089() {
      JoinLocalKinoWithTag var1 = ((JoinLocalKinoWithTagRepository)JMockK.spyk(new JoinLocalKinoWithTagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByTagAndEntityId(-2L, 89L);
   }

   @Test
   public void test_findByTagAndEntityId_long_long_1_4125() {
      JoinWithTag var1 = ((JoinLocalKinoWithTagRepository)JMockK.spyk(new JoinLocalKinoWithTagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByTagAndEntityId(-52L, 28L);
   }
}
