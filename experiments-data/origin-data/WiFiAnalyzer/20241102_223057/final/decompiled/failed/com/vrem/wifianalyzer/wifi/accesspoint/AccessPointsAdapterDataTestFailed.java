package com.vrem.wifianalyzer.wifi.accesspoint;

import android.widget.ExpandableListView;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class AccessPointsAdapterDataTestFailed {
   @Test
   public void test_update_WiFiData_ExpandableListView_1_2920() {
      ((AccessPointsAdapterData)JMockK.spyk(new AccessPointsAdapterData((AccessPointsAdapterGroup)JMockK.mockk(AccessPointsAdapterGroup.class, true), (List)JMockK.mockk(List.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true), (ExpandableListView)JMockK.mockk(ExpandableListView.class, true));
   }
}
