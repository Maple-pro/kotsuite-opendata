package com.vrem.wifianalyzer.settings;

import android.content.SharedPreferences;
import com.vrem.wifianalyzer.wifi.accesspoint.AccessPointViewType;
import com.vrem.wifianalyzer.wifi.accesspoint.ConnectionViewType;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.graphutils.GraphLegend;
import com.vrem.wifianalyzer.wifi.model.GroupBy;
import com.vrem.wifianalyzer.wifi.model.SortBy;
import io.github.maples.jmockk.JMockK;
import java.util.Locale;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class SettingsTestSuccess {
   @Test
   public void test_accessPointView_1_1165() {
      AccessPointViewType var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).accessPointView();
   }

   @Test
   public void test_cacheOff_1_1077() {
      Object var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).cacheOff();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_channelGraphLegend_1_1189() {
      GraphLegend var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).channelGraphLegend();
   }

   @Test
   public void test_connectionViewType_1_1177() {
      ConnectionViewType var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).connectionViewType();
   }

   @Test
   public void test_countryCode_1_1117() {
      String var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).countryCode();
   }

   @Test
   public void test_findSSIDs_1_1289() {
      Set var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).findSSIDs();
   }

   @Test
   public void test_findSecurities_1_1373() {
      Set var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).findSecurities();
   }

   @Test
   public void test_findStrengths_1_1345() {
      Set var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).findStrengths();
   }

   @Test
   public void test_findWiFiBands_1_1317() {
      Set var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).findWiFiBands();
   }

   @Test
   public void test_graphMaximumY_1_1089() {
      Object var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).graphMaximumY();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_groupBy_1_1153() {
      GroupBy var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).groupBy();
   }

   @Test
   public void test_initializeDefaultValues_1_1037() {
      ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).initializeDefaultValues();
   }

   @Test
   public void test_keepScreenOn_1_1237() {
      Object var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).keepScreenOn();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_languageLocale_1_1129() {
      Locale var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).languageLocale();
   }

   @Test
   public void test_registerOnSharedPreferenceChangeListener_SharedPreferencesOnSharedPreferenceChangeListener_1_1049() {
      ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)JMockK.mockk(SharedPreferences.OnSharedPreferenceChangeListener.class, true));
   }

   @Test
   public void test_saveSSIDs_Set_1_1301() {
      ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).saveSSIDs((Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_saveSecurities_Set_1_1385() {
      ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).saveSecurities((Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_saveStrengths_Set_1_1357() {
      ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).saveStrengths((Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_saveWiFiBands_Set_1_1329() {
      ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).saveWiFiBands((Set)JMockK.mockk(Set.class, true));
   }

   @Test
   public void test_scanSpeed_1_1065() {
      Object var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).scanSpeed();
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_sortBy_1_1141() {
      SortBy var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).sortBy();
   }

   @Test
   public void test_themeStyle_1_1249() {
      ThemeStyle var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).themeStyle();
   }

   @Test
   public void test_timeGraphLegend_1_1201() {
      GraphLegend var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).timeGraphLegend();
   }

   @Test
   public void test_wiFiBand_1_1213() {
      WiFiBand var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).wiFiBand();
   }

   @Test
   public void test_wiFiBand_WiFiBand_1_1101() {
      ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).wiFiBand((WiFiBand)JMockK.mockk(WiFiBand.class, true));
   }

   @Test
   public void test_wiFiOffOnExit_1_1225() {
      Object var1 = ((Settings)JMockK.spyk(new Settings((Repository)JMockK.mockk(Repository.class, true)))).wiFiOffOnExit();
      Assert.assertEquals(new Integer(0), var1);
   }
}
