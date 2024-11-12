package ch.abertschi.adfree.model;

import io.github.maples.jmockk.JMockK;
import io.reactivex.Observable;
import org.junit.Test;

public class YamlRemoteConfigFactoryTestFailed {
   @Test
   public void test_downloadObservable_1_1469() {
      Observable var1 = ((YamlRemoteConfigFactory)JMockK.spyk(new YamlRemoteConfigFactory("Dir+N5oBau1rgeSncQ5fqAJf-hLYdkaA1irwYhpD-csvltA6Gi-PRXPj74R+6miFSRpZ", (Class)JMockK.mockk(Class.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).downloadObservable();
   }

   @Test
   public void test_loadFromLocalStore_Object_1_1485() {
      Object var1 = ((YamlRemoteConfigFactory)JMockK.spyk(new YamlRemoteConfigFactory("j1bbBrH11iaPc3yRca0A6i-nk0hrQNFYrR-3NQ4Uk8T-v2V", (Class)JMockK.mockk(Class.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).loadFromLocalStore((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_storeToLocalStore_Object_1_1505() {
      ((YamlRemoteConfigFactory)JMockK.spyk(new YamlRemoteConfigFactory("Yabnmv7l0UBfmpCijIdwDBPNhdn3f9tOx-nuz1Gqb2r1J8D7QvHLt", (Class)JMockK.mockk(Class.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).storeToLocalStore((Object)JMockK.mockk(Object.class, true));
   }
}
