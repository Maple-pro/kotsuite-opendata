package com.android.gpstest.ui;

import android.location.Location;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class BenchmarkControllerImplTestFailed {
   @Test
   public void test_hide_1_325() {
      ((BenchmarkControllerImpl)JMockK.spyk(new BenchmarkControllerImpl((AppCompatActivity)JMockK.mockk(AppCompatActivity.class, true), (View)JMockK.mockk(View.class, true)))).hide();
   }

   @Test
   public void test_onBackPressed_1_293() {
      boolean var1 = ((BenchmarkControllerImpl)JMockK.spyk(new BenchmarkControllerImpl((AppCompatActivity)JMockK.mockk(AppCompatActivity.class, true), (View)JMockK.mockk(View.class, true)))).onBackPressed();
   }

   @Test
   public void test_onLocationChanged_Location_1_341() {
      ((BenchmarkControllerImpl)JMockK.spyk(new BenchmarkControllerImpl((AppCompatActivity)JMockK.mockk(AppCompatActivity.class, true), (View)JMockK.mockk(View.class, true)))).onLocationChanged((Location)JMockK.mockk(Location.class, true));
   }

   @Test
   public void test_onMapClick_Location_1_361() {
      ((BenchmarkControllerImpl)JMockK.spyk(new BenchmarkControllerImpl((AppCompatActivity)JMockK.mockk(AppCompatActivity.class, true), (View)JMockK.mockk(View.class, true)))).onMapClick((Location)JMockK.mockk(Location.class, true));
   }

   @Test
   public void test_show_1_309() {
      ((BenchmarkControllerImpl)JMockK.spyk(new BenchmarkControllerImpl((AppCompatActivity)JMockK.mockk(AppCompatActivity.class, true), (View)JMockK.mockk(View.class, true)))).show();
   }
}
