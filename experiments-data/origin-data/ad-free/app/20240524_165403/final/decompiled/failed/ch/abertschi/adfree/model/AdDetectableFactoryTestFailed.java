package ch.abertschi.adfree.model;

import android.content.Context;
import ch.abertschi.adfree.detector.AdDetectable;
import io.github.maples.jmockk.JMockK;
import java.util.List;
import org.junit.Test;

public class AdDetectableFactoryTestFailed {
   @Test
   public void test_getAllDetectors_1_549() {
      List var1 = ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getAllDetectors();
   }

   @Test
   public void test_getDetectorsForCategory_String_1_565() {
      List var1 = ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getDetectorsForCategory("nWKExqg3ZCQ0E+MO48yG2e0ZtLlRTnEbZik-BnpKZj34AM3cBuTppjJSI+i6HSubOwd");
   }

   @Test
   public void test_getEnabledDetectors_1_533() {
      List var1 = ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getEnabledDetectors();
   }

   @Test
   public void test_getVisibleCategories_1_597() {
      List var1 = ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getVisibleCategories();
   }

   @Test
   public void test_getVisibleDetectors_1_581() {
      List var1 = ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).getVisibleDetectors();
   }

   @Test
   public void test_isAdfreeEnabled_1_461() {
      boolean var1 = ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).isAdfreeEnabled();
   }

   @Test
   public void test_isEnabled_AdDetectable_1_493() {
      boolean var1 = ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).isEnabled((AdDetectable)JMockK.mockk(AdDetectable.class, true));
   }

   @Test
   public void test_persistMeta_1_445() {
      ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).persistMeta();
   }

   @Test
   public void test_setAdfreeEnabled_boolean_1_477() {
      ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).setAdfreeEnabled(true);
   }

   @Test
   public void test_setEnable_boolean_AdDetectable_1_513() {
      ((AdDetectableFactory)JMockK.spyk(new AdDetectableFactory((Context)JMockK.mockk(Context.class, true), (PreferencesFactory)JMockK.mockk(PreferencesFactory.class, true)))).setEnable(false, (AdDetectable)JMockK.mockk(AdDetectable.class, true));
   }
}
