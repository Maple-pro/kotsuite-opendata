package com.android.gpstest.util;

import android.app.Activity;
import android.app.Dialog;
import android.location.Location;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.android.gpstest.io.CsvFileLogger;
import com.android.gpstest.io.JsonFileLogger;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class UIUtilsTestFailed {
   @Test
   public void test_createHelpDialog_Activity_1_917() {
      Dialog var1 = UIUtils.INSTANCE.createHelpDialog((Activity)JMockK.mockk(Activity.class, true));
   }

   @Test
   public void test_createQrCodeDialog_AppCompatActivity_1_885() {
      Dialog var1 = UIUtils.createQrCodeDialog((AppCompatActivity)JMockK.mockk(AppCompatActivity.class, true));
   }

   @Test
   public void test_createWhatsNewDialog_Activity_1_925() {
      Dialog var1 = UIUtils.INSTANCE.createWhatsNewDialog((Activity)JMockK.mockk(Activity.class, true));
   }

   @Test
   public void test_isValidLocationWithErrorDialog_AppCompatActivity_String_String_String_1_877() {
      boolean var1 = UIUtils.isValidLocationWithErrorDialog((AppCompatActivity)JMockK.mockk(AppCompatActivity.class, true), "lXxG21mx3ooLXmDIR8yNYJO9U50EEAjAQXQklsNTFstHuTmW21u7KuEm+nyV3ZQA+PoGYaCxHLf40", "KFzmWwq44d6Vl1P4XBAEns2y-eWEvLe", "l+VOijH7IUS3Clr1IeTuzZQakEaJ+4N25T-9Nrpbalr98qJO2kzg1WGGnfHmed8XV5cNEZPVhd");
   }

   @Test
   public void test_showFilterDialog_FragmentActivity_1_933() {
      UIUtils.INSTANCE.showFilterDialog((FragmentActivity)JMockK.mockk(FragmentActivity.class, true));
   }

   @Test
   public void test_showShareFragmentDialog_AppCompatActivity_Location_boolean_CsvFileLogger_JsonFileLogger_Uri_1_893() {
      UIUtils.INSTANCE.showShareFragmentDialog((AppCompatActivity)JMockK.mockk(AppCompatActivity.class, true), (Location)JMockK.mockk(Location.class, true), true, (CsvFileLogger)JMockK.mockk(CsvFileLogger.class, true), (JsonFileLogger)JMockK.mockk(JsonFileLogger.class, true), (Uri)JMockK.mockk(Uri.class, true));
   }

   @Test
   public void test_showSortByDialog_FragmentActivity_1_941() {
      UIUtils.INSTANCE.showSortByDialog((FragmentActivity)JMockK.mockk(FragmentActivity.class, true));
   }
}
