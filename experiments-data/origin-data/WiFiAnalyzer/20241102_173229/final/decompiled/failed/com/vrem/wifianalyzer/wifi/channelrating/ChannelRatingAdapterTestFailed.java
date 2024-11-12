package com.vrem.wifianalyzer.wifi.channelrating;

import android.content.Context;
import android.widget.TextView;
import com.vrem.wifianalyzer.wifi.model.ChannelRating;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class ChannelRatingAdapterTestFailed {
   @Test
   public void test_update_WiFiData_1_4292() {
      ((ChannelRatingAdapter)JMockK.spyk(new ChannelRatingAdapter((Context)JMockK.mockk(Context.class, true), (TextView)JMockK.mockk(TextView.class, true), (ChannelRating)JMockK.mockk(ChannelRating.class, true)))).update((WiFiData)JMockK.mockk(WiFiData.class, true));
   }
}
