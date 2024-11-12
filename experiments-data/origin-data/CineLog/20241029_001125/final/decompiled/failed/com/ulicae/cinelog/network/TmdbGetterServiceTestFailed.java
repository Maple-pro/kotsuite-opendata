package com.ulicae.cinelog.network;

import android.content.Context;
import com.ulicae.cinelog.data.dao.SerieReview;
import com.ulicae.cinelog.data.services.reviews.SerieService;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class TmdbGetterServiceTestFailed {
   @Test
   public void test_startSyncWithTmdb_SerieService_SerieReview_long_1_3817() {
      ((TmdbGetterService)JMockK.spyk(new TmdbGetterService((Context)JMockK.mockk(Context.class, true)))).startSyncWithTmdb((SerieService)JMockK.mockk(SerieService.class, true), (SerieReview)JMockK.mockk(SerieReview.class, true), -65L);
   }
}
