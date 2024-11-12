package com.vrem.wifianalyzer.wifi.scanner;

import android.content.IntentFilter;
import com.vrem.wifianalyzer.MainActivity;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ScanResultsReceiverTestFailed {
   @Test
   public void test_makeIntentFilter_String_1_4472() {
      IntentFilter var1 = ((ScanResultsReceiver)JMockK.spyk(new ScanResultsReceiver((MainActivity)JMockK.mockk(MainActivity.class, true), (Callback)JMockK.mockk(Callback.class, true)))).makeIntentFilter("ex477d5OgNBUzw9kifTuUk0IjpyRLXHcrbQiFQs1b778MfdVZcNy+EVNu+uLEfbacp9ZO+elCC+M0z");
   }

   @Test
   public void test_register_1_4440() {
      ((ScanResultsReceiver)JMockK.spyk(new ScanResultsReceiver((MainActivity)JMockK.mockk(MainActivity.class, true), (Callback)JMockK.mockk(Callback.class, true)))).register();
   }

   @Test
   public void test_unregister_1_4456() {
      ((ScanResultsReceiver)JMockK.spyk(new ScanResultsReceiver((MainActivity)JMockK.mockk(MainActivity.class, true), (Callback)JMockK.mockk(Callback.class, true)))).unregister();
   }
}
