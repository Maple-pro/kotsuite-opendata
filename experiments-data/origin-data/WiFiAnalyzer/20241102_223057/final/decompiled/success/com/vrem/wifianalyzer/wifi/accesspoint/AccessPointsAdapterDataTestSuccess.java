package com.vrem.wifianalyzer.wifi.accesspoint;

import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class AccessPointsAdapterDataTestSuccess {
   @Test
   public void test_child_int_int_1_2992() {
      WiFiDetail var1 = ((AccessPointsAdapterData)JMockK.spyk(new AccessPointsAdapterData((AccessPointsAdapterGroup)JMockK.mockk(AccessPointsAdapterGroup.class, true), (List)JMockK.mockk(List.class, true)))).child(35, 0);
   }

   @Test
   public void test_childrenCount_int_1_2976() {
      Object var1 = ((AccessPointsAdapterData)JMockK.spyk(new AccessPointsAdapterData((AccessPointsAdapterGroup)JMockK.mockk(AccessPointsAdapterGroup.class, true), (List)JMockK.mockk(List.class, true)))).childrenCount(-46);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_onGroupCollapsed_int_1_3008() {
      ((AccessPointsAdapterData)JMockK.spyk(new AccessPointsAdapterData((AccessPointsAdapterGroup)JMockK.mockk(AccessPointsAdapterGroup.class, true), (List)JMockK.mockk(List.class, true)))).onGroupCollapsed(-26);
   }

   @Test
   public void test_onGroupExpanded_int_1_3024() {
      ((AccessPointsAdapterData)JMockK.spyk(new AccessPointsAdapterData((AccessPointsAdapterGroup)JMockK.mockk(AccessPointsAdapterGroup.class, true), (List)JMockK.mockk(List.class, true)))).onGroupExpanded(-37);
   }

   @Test
   public void test_parent_int_1_2960() {
      WiFiDetail var1 = ((AccessPointsAdapterData)JMockK.spyk(new AccessPointsAdapterData((AccessPointsAdapterGroup)JMockK.mockk(AccessPointsAdapterGroup.class, true), (List)JMockK.mockk(List.class, true)))).parent(80);
   }

   @Test
   public void test_parentsCount_1_2944() {
      Object var1 = ((AccessPointsAdapterData)JMockK.spyk(new AccessPointsAdapterData((AccessPointsAdapterGroup)JMockK.mockk(AccessPointsAdapterGroup.class, true), (List)JMockK.mockk(List.class, true)))).parentsCount();
      Assert.assertEquals(new Integer(0), var1);
   }
}
