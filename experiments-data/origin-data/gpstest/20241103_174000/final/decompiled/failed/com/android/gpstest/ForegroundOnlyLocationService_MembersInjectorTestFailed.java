package com.android.gpstest;

import com.android.gpstest.library.data.LocationRepository;
import io.github.maples.jmockk.JMockK;
import javax.inject.Provider;
import org.junit.Test;

public class ForegroundOnlyLocationService_MembersInjectorTestFailed {
   @Test
   public void test_injectMembers_ForegroundOnlyLocationService_1_9() {
      ((ForegroundOnlyLocationService_MembersInjector)JMockK.spyk(new ForegroundOnlyLocationService_MembersInjector((Provider)JMockK.mockk(Provider.class, true)))).injectMembers((ForegroundOnlyLocationService)JMockK.mockk(ForegroundOnlyLocationService.class, true));
   }

   @Test
   public void test_injectMembers_Object_1_37() {
      ((ForegroundOnlyLocationService_MembersInjector)JMockK.spyk(new ForegroundOnlyLocationService_MembersInjector((Provider)JMockK.mockk(Provider.class, true)))).injectMembers((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_injectRepository_ForegroundOnlyLocationService_LocationRepository_1_25() {
      ForegroundOnlyLocationService_MembersInjector.injectRepository((ForegroundOnlyLocationService)JMockK.mockk(ForegroundOnlyLocationService.class, true), (LocationRepository)JMockK.mockk(LocationRepository.class, true));
   }
}
