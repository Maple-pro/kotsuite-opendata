package com.android.gpstest;

import dagger.MembersInjector;
import io.github.maples.jmockk.JMockK;
import javax.inject.Provider;
import org.junit.Test;

public class ForegroundOnlyLocationService_MembersInjectorTestSuccess {
   @Test
   public void test_create_Provider_1_1() {
      MembersInjector var1 = ForegroundOnlyLocationService_MembersInjector.create((Provider)JMockK.mockk(Provider.class, true));
   }
}
