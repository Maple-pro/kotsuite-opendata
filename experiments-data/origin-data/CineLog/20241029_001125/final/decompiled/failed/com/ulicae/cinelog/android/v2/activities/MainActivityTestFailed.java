package com.ulicae.cinelog.android.v2.activities;

import androidx.appcompat.widget.SearchView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ulicae.cinelog.data.dto.KinoDto;
import com.ulicae.cinelog.data.dto.TagDto;
import com.ulicae.cinelog.data.dto.data.WishlistDataDto;
import com.ulicae.cinelog.data.dto.data.WishlistItemType;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class MainActivityTestFailed {
   @Test
   public void test_getFab_1_6105() {
      FloatingActionButton var1 = ((MainActivity)JMockK.spyk(new MainActivity())).getFab();
   }

   @Test
   public void test_getSearchView_1_6113() {
      SearchView var1 = ((MainActivity)JMockK.spyk(new MainActivity())).getSearchView();
   }

   @Test
   public void test_goToExport_1_6053() {
      ((MainActivity)JMockK.spyk(new MainActivity())).goToExport();
   }

   @Test
   public void test_goToImport_1_6045() {
      ((MainActivity)JMockK.spyk(new MainActivity())).goToImport();
   }

   @Test
   public void test_goToSettings_1_6061() {
      ((MainActivity)JMockK.spyk(new MainActivity())).goToSettings();
   }

   @Test
   public void test_goToTagEdition_TagDto_1_6033() {
      ((MainActivity)JMockK.spyk(new MainActivity())).goToTagEdition((TagDto)JMockK.mockk(TagDto.class, true));
   }

   @Test
   public void test_goToTmdbMovieSearch_boolean_1_6017() {
      ((MainActivity)JMockK.spyk(new MainActivity())).goToTmdbMovieSearch(true);
   }

   @Test
   public void test_goToTmdbSerieSearch_boolean_1_6025() {
      ((MainActivity)JMockK.spyk(new MainActivity())).goToTmdbSerieSearch(false);
   }

   @Test
   public void test_navigateBackToReviewList_KinoDto_1_6133() {
      ((MainActivity)JMockK.spyk(new MainActivity())).navigateBackToReviewList((KinoDto)JMockK.mockk(KinoDto.class, true));
   }

   @Test
   public void test_navigateBackToWishlist_WishlistItemType_1_6121() {
      ((MainActivity)JMockK.spyk(new MainActivity())).navigateBackToWishlist((WishlistItemType)JMockK.mockk(WishlistItemType.class, true));
   }

   @Test
   public void test_navigateBack_1_6145() {
      ((MainActivity)JMockK.spyk(new MainActivity())).navigateBack();
   }

   @Test
   public void test_navigateToItem_KinoDto_int_boolean_boolean_1_6069() {
      ((MainActivity)JMockK.spyk(new MainActivity())).navigateToItem((KinoDto)JMockK.mockk(KinoDto.class, true), -44, true, true);
   }

   @Test
   public void test_navigateToReview_KinoDto_boolean_int_1_6081() {
      ((MainActivity)JMockK.spyk(new MainActivity())).navigateToReview((KinoDto)JMockK.mockk(KinoDto.class, true), true, 24);
   }

   @Test
   public void test_navigateToWishlistItem_WishlistDataDto_int_1_6093() {
      ((MainActivity)JMockK.spyk(new MainActivity())).navigateToWishlistItem((WishlistDataDto)JMockK.mockk(WishlistDataDto.class, true), -26);
   }
}
