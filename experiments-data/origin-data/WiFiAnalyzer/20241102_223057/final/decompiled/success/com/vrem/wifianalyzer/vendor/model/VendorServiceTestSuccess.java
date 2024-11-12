package com.vrem.wifianalyzer.vendor.model;

import android.content.res.Resources;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class VendorServiceTestSuccess {
   @Test
   public void test_findMacAddresses_String_1_1673() {
      List var1 = ((VendorService)JMockK.spyk(new VendorService((Resources)JMockK.mockk(Resources.class, true)))).findMacAddresses("Imu1lLqh");
   }

   @Test
   public void test_findVendorName_String_1_1661() {
      String var1 = ((VendorService)JMockK.spyk(new VendorService((Resources)JMockK.mockk(Resources.class, true)))).findVendorName("lYyELPgKS1DFmYxxMcgQHn32vEvLmufc");
   }

   @Test
   public void test_findVendors_String_1_1685() {
      List var1 = ((VendorService)JMockK.spyk(new VendorService((Resources)JMockK.mockk(Resources.class, true)))).findVendors("-N1zCmMPX3QjoAW3LKV+PPK7UdKQu0GZlStxvHg0MBs8zbBSLjcw+ZtGE94jw0NIOTlCaAwuhLEw0c");
   }
}
