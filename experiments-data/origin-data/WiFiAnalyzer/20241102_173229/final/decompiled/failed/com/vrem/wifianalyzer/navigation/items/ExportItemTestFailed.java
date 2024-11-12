package com.vrem.wifianalyzer.navigation.items;

import android.view.MenuItem;
import com.vrem.wifianalyzer.MainActivity;
import com.vrem.wifianalyzer.export.Export;
import com.vrem.wifianalyzer.navigation.NavigationMenu;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ExportItemTestFailed {
   @Test
   public void test_activate_MainActivity_MenuItem_NavigationMenu_1_5028() {
      ((ExportItem)JMockK.spyk(new ExportItem((Export)JMockK.mockk(Export.class, true)))).activate((MainActivity)JMockK.mockk(MainActivity.class, true), (MenuItem)JMockK.mockk(MenuItem.class, true), (NavigationMenu)JMockK.mockk(NavigationMenu.class, true));
   }
}
