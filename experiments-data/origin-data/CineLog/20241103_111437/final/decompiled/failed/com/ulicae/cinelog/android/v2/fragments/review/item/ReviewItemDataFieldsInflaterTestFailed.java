package com.ulicae.cinelog.android.v2.fragments.review.item;

import android.app.Activity;
import android.view.View;
import com.ulicae.cinelog.data.dto.KinoDto;
import com.ulicae.cinelog.databinding.LayoutReviewItemKinoBinding;
import com.ulicae.cinelog.databinding.LayoutReviewItemReviewBinding;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ReviewItemDataFieldsInflaterTestFailed {
   @Test
   public void test_configureFields_1_6261() {
      ((ReviewItemDataFieldsInflater)JMockK.spyk(new ReviewItemDataFieldsInflater((KinoDto)JMockK.mockk(KinoDto.class, true), (Activity)JMockK.mockk(Activity.class, true), (LayoutReviewItemKinoBinding)JMockK.mockk(LayoutReviewItemKinoBinding.class, true), (LayoutReviewItemReviewBinding)JMockK.mockk(LayoutReviewItemReviewBinding.class, true)))).configureFields();
   }

   @Test
   public void test_onToggleOverview_View_1_6285() {
      ((ReviewItemDataFieldsInflater)JMockK.spyk(new ReviewItemDataFieldsInflater((KinoDto)JMockK.mockk(KinoDto.class, true), (Activity)JMockK.mockk(Activity.class, true), (LayoutReviewItemKinoBinding)JMockK.mockk(LayoutReviewItemKinoBinding.class, true), (LayoutReviewItemReviewBinding)JMockK.mockk(LayoutReviewItemReviewBinding.class, true)))).onToggleOverview((View)JMockK.mockk(View.class, true));
   }
}
