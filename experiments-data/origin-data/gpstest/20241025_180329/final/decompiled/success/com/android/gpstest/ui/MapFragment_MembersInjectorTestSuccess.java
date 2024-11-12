package com.android.gpstest.ui;

import dagger.MembersInjector;
import io.github.maples.jmockk.JMockK;
import javax.inject.Provider;
import org.junit.Test;

public class MapFragment_MembersInjectorTestSuccess {
   @Test
   public void test_create_Provider_1_1085() {
      MembersInjector var1 = MapFragment_MembersInjector.create((Provider)JMockK.mockk(Provider.class, true));
   }
}
