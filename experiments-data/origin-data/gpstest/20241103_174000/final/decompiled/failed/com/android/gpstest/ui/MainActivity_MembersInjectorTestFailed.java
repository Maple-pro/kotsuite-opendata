package com.android.gpstest.ui;

import com.android.gpstest.library.data.LocationRepository;
import io.github.maples.jmockk.JMockK;
import javax.inject.Provider;
import org.junit.Test;

public class MainActivity_MembersInjectorTestFailed {
   @Test
   public void test_injectMembers_MainActivity_1_581() {
      ((MainActivity_MembersInjector)JMockK.spyk(new MainActivity_MembersInjector((Provider)JMockK.mockk(Provider.class, true)))).injectMembers((MainActivity)JMockK.mockk(MainActivity.class, true));
   }

   @Test
   public void test_injectMembers_Object_1_609() {
      ((MainActivity_MembersInjector)JMockK.spyk(new MainActivity_MembersInjector((Provider)JMockK.mockk(Provider.class, true)))).injectMembers((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_injectRepository_MainActivity_LocationRepository_1_597() {
      MainActivity_MembersInjector.injectRepository((MainActivity)JMockK.mockk(MainActivity.class, true), (LocationRepository)JMockK.mockk(LocationRepository.class, true));
   }
}
