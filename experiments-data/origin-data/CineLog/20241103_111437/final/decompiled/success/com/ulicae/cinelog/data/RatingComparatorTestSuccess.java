package com.ulicae.cinelog.data;

import com.ulicae.cinelog.data.dao.SerieReview;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class RatingComparatorTestSuccess {
   @Test
   public void test_compare_SerieReview_SerieReview_1_4349() {
      Object var1 = ((RatingComparator)JMockK.spyk(new RatingComparator())).compare((SerieReview)JMockK.mockk(SerieReview.class, true), (SerieReview)JMockK.mockk(SerieReview.class, true));
      Assert.assertEquals(new Integer(1), var1);
   }
}
