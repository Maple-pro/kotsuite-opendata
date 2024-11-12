package com.vrem.wifianalyzer.navigation.items;

import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.vrem.wifianalyzer.MainActivity;
import com.vrem.wifianalyzer.navigation.NavigationMenu;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class FragmentItemTestFailed {
   @Test
   public void test_activate_MainActivity_MenuItem_NavigationMenu_1_5004() {
      ((FragmentItem)JMockK.spyk(new FragmentItem((Fragment)JMockK.mockk(Fragment.class, true), false, 12))).activate((MainActivity)JMockK.mockk(MainActivity.class, true), (MenuItem)JMockK.mockk(MenuItem.class, true), (NavigationMenu)JMockK.mockk(NavigationMenu.class, true));
   }
}
