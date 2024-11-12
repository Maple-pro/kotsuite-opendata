package com.android.gpstest.ui.sky;

import dagger.MembersInjector;
import io.github.maples.jmockk.JMockK;
import javax.inject.Provider;
import org.junit.Test;

public class SkyFragment_MembersInjectorTestSuccess {
   @Test
   public void test_create_Provider_1_949() {
      MembersInjector var1 = SkyFragment_MembersInjector.create((Provider)JMockK.mockk(Provider.class, true));
   }
}
