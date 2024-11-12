package com.android.gpstest.ui.sky;

import com.android.gpstest.library.data.LocationRepository;
import io.github.maples.jmockk.JMockK;
import javax.inject.Provider;
import org.junit.Test;

public class SkyFragment_MembersInjectorTestFailed {
   @Test
   public void test_injectMembers_Object_1_985() {
      ((SkyFragment_MembersInjector)JMockK.spyk(new SkyFragment_MembersInjector((Provider)JMockK.mockk(Provider.class, true)))).injectMembers((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_injectMembers_SkyFragment_1_957() {
      ((SkyFragment_MembersInjector)JMockK.spyk(new SkyFragment_MembersInjector((Provider)JMockK.mockk(Provider.class, true)))).injectMembers((SkyFragment)JMockK.mockk(SkyFragment.class, true));
   }

   @Test
   public void test_injectRepository_SkyFragment_LocationRepository_1_973() {
      SkyFragment_MembersInjector.injectRepository((SkyFragment)JMockK.mockk(SkyFragment.class, true), (LocationRepository)JMockK.mockk(LocationRepository.class, true));
   }
}
