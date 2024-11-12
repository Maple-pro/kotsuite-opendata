package com.vrem.wifianalyzer.wifi.accesspoint;

import com.vrem.wifianalyzer.wifi.model.GroupBy;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class AccessPointsAdapterGroupTestSuccess {
   @Test
   public void test_onGroupCollapsed_List_int_1_3080() {
      ((AccessPointsAdapterGroup)JMockK.spyk(new AccessPointsAdapterGroup((Set)JMockK.mockk(Set.class, true), (GroupBy)JMockK.mockk(GroupBy.class, true)))).onGroupCollapsed((List)JMockK.mockk(List.class, true), -24);
   }

   @Test
   public void test_onGroupExpanded_List_int_1_3100() {
      ((AccessPointsAdapterGroup)JMockK.spyk(new AccessPointsAdapterGroup((Set)JMockK.mockk(Set.class, true), (GroupBy)JMockK.mockk(GroupBy.class, true)))).onGroupExpanded((List)JMockK.mockk(List.class, true), -69);
   }
}
