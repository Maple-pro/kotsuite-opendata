package com.android.gpstest.chart;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class DistanceValueFormatterTestSuccess {
   @Test
   public void test_getFormattedValue_float_AxisBase_1_865() {
      Assert.assertEquals("-42", ((DistanceValueFormatter)JMockK.spyk(new DistanceValueFormatter("eakGeeFykj+ml+5+oDV9iVgJo8vHBWf95f3BcAPklz0"))).getFormattedValue(-41.528404F, (AxisBase)JMockK.mockk(AxisBase.class, true)));
   }

   @Test
   public void test_getFormattedValue_float_AxisBase_2_869() {
      Assert.assertEquals("54 ZqpaNcznfGXOU-H9Pa89DBMqVVFtZ78DCHJNkmEXSxHaORxnrMfLyyuMNOtrokyPA6yvjCCU4s3kwcImLPYpDs", ((DistanceValueFormatter)JMockK.spyk(new DistanceValueFormatter("ZqpaNcznfGXOU-H9Pa89DBMqVVFtZ78DCHJNkmEXSxHaORxnrMfLyyuMNOtrokyPA6yvjCCU4s3kwcImLPYpDs"))).getFormattedValue(53.845383F, (AxisBase)JMockK.mockk(AxisBase.class, true)));
   }

   @Test
   public void test_getFormattedValue_float_Entry_int_ViewPortHandler_1_849() {
      Assert.assertEquals("59 0C-gnI1AG7xJ", ((DistanceValueFormatter)JMockK.spyk(new DistanceValueFormatter("0C-gnI1AG7xJ"))).getFormattedValue(59.14647F, (Entry)JMockK.mockk(Entry.class, true), 33, (ViewPortHandler)JMockK.mockk(ViewPortHandler.class, true)));
   }
}
