package com.android.gpstest.map;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import io.github.maples.jmockk.JMockK;
import org.junit.Assert;
import org.junit.Test;

public class MapViewModelControllerTestSuccess {
   @Test
   public void test_allowGroundTruthChange_1_801() {
      Object var1 = ((MapViewModelController)JMockK.spyk(new MapViewModelController((FragmentActivity)JMockK.mockk(FragmentActivity.class, true), (MapViewModelController.MapInterface)JMockK.mockk(MapViewModelController.MapInterface.class, true)))).allowGroundTruthChange();
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_getMode_1_785() {
      Assert.assertEquals("mode_map", ((MapViewModelController)JMockK.spyk(new MapViewModelController((FragmentActivity)JMockK.mockk(FragmentActivity.class, true), (MapViewModelController.MapInterface)JMockK.mockk(MapViewModelController.MapInterface.class, true)))).getMode());
   }

   @Test
   public void test_restoreState_Bundle_Bundle_boolean_1_761() {
      ((MapViewModelController)JMockK.spyk(new MapViewModelController((FragmentActivity)JMockK.mockk(FragmentActivity.class, true), (MapViewModelController.MapInterface)JMockK.mockk(MapViewModelController.MapInterface.class, true)))).restoreState((Bundle)JMockK.mockk(Bundle.class, true), (Bundle)JMockK.mockk(Bundle.class, true), true);
   }
}
