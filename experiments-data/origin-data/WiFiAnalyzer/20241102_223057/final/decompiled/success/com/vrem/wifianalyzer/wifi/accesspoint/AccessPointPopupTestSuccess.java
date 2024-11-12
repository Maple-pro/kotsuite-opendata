package com.vrem.wifianalyzer.wifi.accesspoint;

import android.view.View;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AccessPointPopupTestSuccess {
   @Test
   public void test_attach_View_WiFiDetail_1_2888() {
      ((AccessPointPopup)JMockK.spyk(new AccessPointPopup())).attach((View)JMockK.mockk(View.class, true), (WiFiDetail)JMockK.mockk(WiFiDetail.class, true));
   }
}
