package com.vrem.wifianalyzer.navigation.options;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class OptionMenuTestSuccess {
   @Test
   public void test_create_Activity_Menu_1_2256() {
      ((OptionMenu)JMockK.spyk(new OptionMenu())).create((Activity)JMockK.mockk(Activity.class, true), (Menu)JMockK.mockk(Menu.class, true));
   }

   @Test
   public void test_select_MenuItem_1_2272() {
      ((OptionMenu)JMockK.spyk(new OptionMenu())).select((MenuItem)JMockK.mockk(MenuItem.class, true));
   }
}
