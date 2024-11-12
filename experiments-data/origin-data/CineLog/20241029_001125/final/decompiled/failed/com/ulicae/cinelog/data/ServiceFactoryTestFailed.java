package com.ulicae.cinelog.data;

import android.content.Context;
import com.ulicae.cinelog.data.dao.DaoSession;
import com.ulicae.cinelog.data.services.reviews.DataService;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ServiceFactoryTestFailed {
   @Test
   public void test_create_String_DaoSession_1_4405() {
      DataService var1 = ((ServiceFactory)JMockK.spyk(new ServiceFactory((Context)JMockK.mockk(Context.class, true)))).create("fMGCNgJutp87eqRMJriGPyfvHQZlUFoPSEgcQC", (DaoSession)JMockK.mockk(DaoSession.class, true));
   }
}
