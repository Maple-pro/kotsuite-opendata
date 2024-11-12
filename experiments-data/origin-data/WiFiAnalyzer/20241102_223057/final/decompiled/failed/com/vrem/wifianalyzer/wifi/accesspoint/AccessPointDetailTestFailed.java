package com.vrem.wifianalyzer.wifi.accesspoint;

import android.view.View;
import android.view.ViewGroup;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AccessPointDetailTestFailed {
   @Test
   public void test_makeViewDetailed_WiFiDetail_1_2864() {
      View var1 = ((AccessPointDetail)JMockK.spyk(new AccessPointDetail())).makeViewDetailed((WiFiDetail)JMockK.mockk(WiFiDetail.class, true));
   }

   @Test
   public void test_makeView_View_ViewGroup_WiFiDetail_boolean_int_1_2844() {
      View var1 = ((AccessPointDetail)JMockK.spyk(new AccessPointDetail())).makeView((View)JMockK.mockk(View.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true), (WiFiDetail)JMockK.mockk(WiFiDetail.class, true), false, -19);
   }
}
