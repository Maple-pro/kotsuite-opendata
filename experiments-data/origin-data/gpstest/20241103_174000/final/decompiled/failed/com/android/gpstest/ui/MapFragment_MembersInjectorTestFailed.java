package com.android.gpstest.ui;

import com.android.gpstest.library.data.LocationRepository;
import io.github.maples.jmockk.JMockK;
import javax.inject.Provider;
import org.junit.Test;

public class MapFragment_MembersInjectorTestFailed {
   @Test
   public void test_injectMembers_MapFragment_1_1093() {
      ((MapFragment_MembersInjector)JMockK.spyk(new MapFragment_MembersInjector((Provider)JMockK.mockk(Provider.class, true)))).injectMembers((MapFragment)JMockK.mockk(MapFragment.class, true));
   }

   @Test
   public void test_injectMembers_Object_1_1121() {
      ((MapFragment_MembersInjector)JMockK.spyk(new MapFragment_MembersInjector((Provider)JMockK.mockk(Provider.class, true)))).injectMembers((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_injectRepository_MapFragment_LocationRepository_1_1109() {
      MapFragment_MembersInjector.injectRepository((MapFragment)JMockK.mockk(MapFragment.class, true), (LocationRepository)JMockK.mockk(LocationRepository.class, true));
   }
}
