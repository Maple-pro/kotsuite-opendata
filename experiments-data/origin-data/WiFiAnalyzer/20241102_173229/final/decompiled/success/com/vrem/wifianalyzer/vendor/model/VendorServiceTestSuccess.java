package com.vrem.wifianalyzer.vendor.model;

import android.content.res.Resources;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class VendorServiceTestSuccess {
   @Test
   public void test_findMacAddresses_String_1_1673() {
      List var1 = ((VendorService)JMockK.spyk(new VendorService((Resources)JMockK.mockk(Resources.class, true)))).findMacAddresses("qFqJMn4K4+uOfHJuRM7KxjK9-yX");
   }

   @Test
   public void test_findVendorName_String_1_1661() {
      String var1 = ((VendorService)JMockK.spyk(new VendorService((Resources)JMockK.mockk(Resources.class, true)))).findVendorName("uBdil8CAfUUjuEuKp0t0vFyACZNJpxUwgBPQtNWFi8vnFWJky5ExYImTb62FDqp7ovmRpjQLxzLje1NkFkDt1fyL6eT43N");
   }

   @Test
   public void test_findVendors_String_1_1685() {
      List var1 = ((VendorService)JMockK.spyk(new VendorService((Resources)JMockK.mockk(Resources.class, true)))).findVendors("O9hP8Ogcq8z3XD3lHvS3risM6+KqU7BmOKXMWhrjQFx7+toPF6pRA6vdamgPmeNXPx6Kj9-q2Zz");
   }
}
