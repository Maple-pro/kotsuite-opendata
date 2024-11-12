package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.JoinReviewWithTag;
import com.ulicae.cinelog.data.dao.JoinWithTag;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class JoinReviewWithTagRepositoryTestSuccess {
   @Test
   public void test_createJoin_long_long_1_2973() {
      ((JoinReviewWithTagRepository)JMockK.spyk(new JoinReviewWithTagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).createJoin(-93L, -65L);
   }

   @Test
   public void test_findAllByTag_long_1_2961() {
      List var1 = ((JoinReviewWithTagRepository)JMockK.spyk(new JoinReviewWithTagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findAllByTag(75L);
   }

   @Test
   public void test_findByTagAndEntityId_long_long_1_2949() {
      JoinReviewWithTag var1 = ((JoinReviewWithTagRepository)JMockK.spyk(new JoinReviewWithTagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByTagAndEntityId(-32L, 35L);
   }

   @Test
   public void test_findByTagAndEntityId_long_long_1_2985() {
      JoinWithTag var1 = ((JoinReviewWithTagRepository)JMockK.spyk(new JoinReviewWithTagRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).findByTagAndEntityId(-67L, 2L);
   }
}
