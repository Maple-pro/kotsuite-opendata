package com.vrem.wifianalyzer;

import android.content.res.Configuration;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class DrawerNavigationTestFailed {
   @Test
   public void test_createDrawerToggle_DrawerLayout_1_2156() {
      ActionBarDrawerToggle var1 = ((DrawerNavigation)JMockK.spyk(new DrawerNavigation((MainActivity)JMockK.mockk(MainActivity.class, true), (Toolbar)JMockK.mockk(Toolbar.class, true)))).createDrawerToggle((DrawerLayout)JMockK.mockk(DrawerLayout.class, true));
   }

   @Test
   public void test_create_1_2140() {
      ((DrawerNavigation)JMockK.spyk(new DrawerNavigation((MainActivity)JMockK.mockk(MainActivity.class, true), (Toolbar)JMockK.mockk(Toolbar.class, true)))).create();
   }

   @Test
   public void test_onConfigurationChanged_Configuration_1_2120() {
      ((DrawerNavigation)JMockK.spyk(new DrawerNavigation((MainActivity)JMockK.mockk(MainActivity.class, true), (Toolbar)JMockK.mockk(Toolbar.class, true)))).onConfigurationChanged((Configuration)JMockK.mockk(Configuration.class, true));
   }

   @Test
   public void test_syncState_1_2104() {
      ((DrawerNavigation)JMockK.spyk(new DrawerNavigation((MainActivity)JMockK.mockk(MainActivity.class, true), (Toolbar)JMockK.mockk(Toolbar.class, true)))).syncState();
   }
}
