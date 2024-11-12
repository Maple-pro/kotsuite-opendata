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
      Assert.assertEquals("-96", ((DistanceValueFormatter)JMockK.spyk(new DistanceValueFormatter("sBkJHl0VRtPGYIwjUODQF8VhJYG0vgSQf7DlFh74PNWGfvcRy"))).getFormattedValue(-95.922874F, (AxisBase)JMockK.mockk(AxisBase.class, true)));
   }

   @Test
   public void test_getFormattedValue_float_Entry_int_ViewPortHandler_1_849() {
      Assert.assertEquals("31 UTu", ((DistanceValueFormatter)JMockK.spyk(new DistanceValueFormatter("UTu"))).getFormattedValue(31.15355F, (Entry)JMockK.mockk(Entry.class, true), 11, (ViewPortHandler)JMockK.mockk(ViewPortHandler.class, true)));
   }
}
