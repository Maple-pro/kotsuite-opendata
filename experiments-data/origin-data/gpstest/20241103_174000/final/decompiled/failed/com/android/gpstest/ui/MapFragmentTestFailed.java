package com.android.gpstest.ui;

import android.location.Location;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MapFragmentTestFailed {
   @Test
   public void test_activate_LocationSourceOnLocationChangedListener_1_661() {
      ((MapFragment)JMockK.spyk(new MapFragment())).activate((LocationSource.OnLocationChangedListener)JMockK.mockk(LocationSource.OnLocationChangedListener.class, true));
   }

   @Test
   public void test_addGroundTruthMarker_Location_1_705() {
      ((MapFragment)JMockK.spyk(new MapFragment())).addGroundTruthMarker((Location)JMockK.mockk(Location.class, true));
   }

   @Test
   public void test_deactivate_1_673() {
      ((MapFragment)JMockK.spyk(new MapFragment())).deactivate();
   }

   @Test
   public void test_drawPathLine_Location_Location_1_737() {
      boolean var1 = ((MapFragment)JMockK.spyk(new MapFragment())).drawPathLine((Location)JMockK.mockk(Location.class, true), (Location)JMockK.mockk(Location.class, true));
   }

   @Test
   public void test_onCameraChange_CameraPosition_1_681() {
      ((MapFragment)JMockK.spyk(new MapFragment())).onCameraChange((CameraPosition)JMockK.mockk(CameraPosition.class, true));
   }

   @Test
   public void test_onMapClick_LatLng_1_693() {
      ((MapFragment)JMockK.spyk(new MapFragment())).onMapClick((LatLng)JMockK.mockk(LatLng.class, true));
   }

   @Test
   public void test_onMapLongClick_LatLng_1_717() {
      ((MapFragment)JMockK.spyk(new MapFragment())).onMapLongClick((LatLng)JMockK.mockk(LatLng.class, true));
   }

   @Test
   public void test_onMyLocationButtonClick_1_729() {
      boolean var1 = ((MapFragment)JMockK.spyk(new MapFragment())).onMyLocationButtonClick();
   }

   @Test
   public void test_removePathLines_1_753() {
      ((MapFragment)JMockK.spyk(new MapFragment())).removePathLines();
   }
}
