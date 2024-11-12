package com.android.gpstest.map;

import android.location.Location;
import androidx.fragment.app.FragmentActivity;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MapViewModelControllerTestFailed {
   @Test
   public void test_getGroundTruthLocation_1_817() {
      Location var1 = ((MapViewModelController)JMockK.spyk(new MapViewModelController((FragmentActivity)JMockK.mockk(FragmentActivity.class, true), (MapViewModelController.MapInterface)JMockK.mockk(MapViewModelController.MapInterface.class, true)))).getGroundTruthLocation();
   }

   @Test
   public void test_isTestInProgress_1_833() {
      boolean var1 = ((MapViewModelController)JMockK.spyk(new MapViewModelController((FragmentActivity)JMockK.mockk(FragmentActivity.class, true), (MapViewModelController.MapInterface)JMockK.mockk(MapViewModelController.MapInterface.class, true)))).isTestInProgress();
   }
}
