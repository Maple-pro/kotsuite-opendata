package com.android.gpstest.util;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MapUtilsTestFailed {
   @Test
   public void test_makeLocation_LatLng_1_285() {
      Location var1 = MapUtils.makeLocation((LatLng)JMockK.mockk(LatLng.class, true));
   }
}
