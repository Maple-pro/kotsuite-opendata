package com.vrem.wifianalyzer.wifi.model;

import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class WiFiDataTestSuccess {
   @Test
   public void test_connection_1_2656() {
      WiFiDetail var1 = ((WiFiData)JMockK.spyk(new WiFiData((List)JMockK.mockk(List.class, true), (WiFiConnection)JMockK.mockk(WiFiConnection.class, true)))).connection();
   }
}
