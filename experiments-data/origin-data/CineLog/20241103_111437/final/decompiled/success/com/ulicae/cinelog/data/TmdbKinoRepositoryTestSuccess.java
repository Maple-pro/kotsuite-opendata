package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.dao.TmdbKino;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TmdbKinoRepositoryTestSuccess {
   @Test
   public void test_createOrUpdate_TmdbKino_1_1() {
      ((TmdbKinoRepository)JMockK.spyk(new TmdbKinoRepository((DaoSession)JMockK.mockk(DaoSession.class, true)))).createOrUpdate((TmdbKino)JMockK.mockk(TmdbKino.class, true));
   }
}
