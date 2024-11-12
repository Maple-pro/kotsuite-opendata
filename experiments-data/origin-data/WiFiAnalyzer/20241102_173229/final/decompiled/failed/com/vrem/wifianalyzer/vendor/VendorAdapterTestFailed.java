package com.vrem.wifianalyzer.vendor;

import android.content.Context;
import com.vrem.wifianalyzer.vendor.model.VendorService;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class VendorAdapterTestFailed {
   @Test
   public void test_update_String_1_4976() {
      ((VendorAdapter)JMockK.spyk(new VendorAdapter((Context)JMockK.mockk(Context.class, true), (VendorService)JMockK.mockk(VendorService.class, true)))).update("Vxc3T+rtedxDixVGEnS5iEGEywzMPnqcoAUchgck7aMF5X9dqSmy1Dibh0I3AFi");
   }
}
