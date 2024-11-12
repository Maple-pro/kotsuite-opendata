package com.vrem.wifianalyzer.wifi.accesspoint;

import android.widget.ExpandableListView;
import com.vrem.wifianalyzer.wifi.model.GroupBy;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class AccessPointsAdapterGroupTestFailed {
   @Test
   public void test_updateGroupBy_1_3064() {
      ((AccessPointsAdapterGroup)JMockK.spyk(new AccessPointsAdapterGroup((Set)JMockK.mockk(Set.class, true), (GroupBy)JMockK.mockk(GroupBy.class, true)))).updateGroupBy();
   }

   @Test
   public void test_update_List_ExpandableListView_1_3040() {
      ((AccessPointsAdapterGroup)JMockK.spyk(new AccessPointsAdapterGroup((Set)JMockK.mockk(Set.class, true), (GroupBy)JMockK.mockk(GroupBy.class, true)))).update((List)JMockK.mockk(List.class, true), (ExpandableListView)JMockK.mockk(ExpandableListView.class, true));
   }
}
