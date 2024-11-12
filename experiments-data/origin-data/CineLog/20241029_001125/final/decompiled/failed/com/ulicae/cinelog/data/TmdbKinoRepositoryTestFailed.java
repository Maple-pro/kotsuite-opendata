package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.TmdbKino;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TmdbKinoRepositoryTestFailed {
   @Test
   public void test_find_long_1_17() {
      TmdbKino var1 = ((TmdbKinoRepository)JMockK.spyk(new TmdbKinoRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).find(28L);
   }
}
