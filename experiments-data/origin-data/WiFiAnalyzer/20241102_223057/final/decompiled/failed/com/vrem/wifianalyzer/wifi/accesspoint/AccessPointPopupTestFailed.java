package com.vrem.wifianalyzer.wifi.accesspoint;

import android.app.AlertDialog;
import android.view.View;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class AccessPointPopupTestFailed {
   @Test
   public void test_show_View_1_2876() {
      AlertDialog var1 = ((AccessPointPopup)JMockK.spyk(new AccessPointPopup())).show((View)JMockK.mockk(View.class, true));
   }
}
