package com.ulicae.cinelog.android.v2.fragments.wishlist.item;

import android.view.View;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class WishlistItemFragmentTestFailed {
   @Test
   public void test_onFabClick_View_1_6162() {
      ((WishlistItemFragment)JMockK.spyk(new WishlistItemFragment())).onFabClick((View)JMockK.mockk(View.class, true));
   }
}
