package ch.abertschi.adfree.model;

import io.github.maples.jmockk.JMockK;
import io.reactivex.Observable;
import org.junit.Test;

public class YamlRemoteConfigFactoryTestFailed {
   @Test
   public void test_downloadObservable_1_1469() {
      Observable var1 = ((YamlRemoteConfigFactory)JMockK.spyk(new YamlRemoteConfigFactory("t+h2WHBTh-V2APyb1Dm23MWdmM4LeO-Tg8sMndmP4SZWWs-CFrKbqzd4sZL6", (Class)JMockK.mockk(Class.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).downloadObservable();
   }

   @Test
   public void test_loadFromLocalStore_Object_1_1485() {
      Object var1 = ((YamlRemoteConfigFactory)JMockK.spyk(new YamlRemoteConfigFactory("E3uFa6956QIa-sNZb1-mX", (Class)JMockK.mockk(Class.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).loadFromLocalStore((Object)JMockK.mockk(Object.class, true));
   }

   @Test
   public void test_storeToLocalStore_Object_1_1505() {
      ((YamlRemoteConfigFactory)JMockK.spyk(new YamlRemoteConfigFactory("qgClY2v+VLUocOEMEklXeVAqCszRe1z+", (Class)JMockK.mockk(Class.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).storeToLocalStore((Object)JMockK.mockk(Object.class, true));
   }
}
