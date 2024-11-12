package ch.abertschi.adfree.view.setting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class PluginSpinnerAdapterTestFailed {
   @Test
   public void test_getCustomView_int_View_ViewGroup_1_3813() {
      Context var4 = (Context)JMockK.mockk(Context.class, true);
      Spinner var1 = (Spinner)JMockK.mockk(Spinner.class, true);
      View var2 = (View)JMockK.mockk(View.class, true);
      String[] var3 = new String[]{""};
      View var5 = ((PluginSpinnerAdapter)JMockK.spyk(new PluginSpinnerAdapter(var4, 36, var3, var1, var2))).getCustomView(-91, (View)JMockK.mockk(View.class, true), (ViewGroup)JMockK.mockk(ViewGroup.class, true));
   }

   @Test
   public void test_getLoggerTag_1_3885() {
      Context var4 = (Context)JMockK.mockk(Context.class, true);
      Spinner var1 = (Spinner)JMockK.mockk(Spinner.class, true);
      View var2 = (View)JMockK.mockk(View.class, true);
      String[] var3 = new String[]{""};
      String var5 = ((PluginSpinnerAdapter)JMockK.spyk(new PluginSpinnerAdapter(var4, 70, var3, var1, var2))).getLoggerTag();
   }

   @Test
   public void test_hideSpinnerDropDown_Spinner_1_3861() {
      Context var4 = (Context)JMockK.mockk(Context.class, true);
      Spinner var1 = (Spinner)JMockK.mockk(Spinner.class, true);
      View var2 = (View)JMockK.mockk(View.class, true);
      String[] var3 = new String[]{""};
      ((PluginSpinnerAdapter)JMockK.spyk(new PluginSpinnerAdapter(var4, 10, var3, var1, var2))).hideSpinnerDropDown((Spinner)JMockK.mockk(Spinner.class, true));
   }

   @Test
   public void test_setModel_String_1_3841() {
      Context var4 = (Context)JMockK.mockk(Context.class, true);
      Spinner var1 = (Spinner)JMockK.mockk(Spinner.class, true);
      View var2 = (View)JMockK.mockk(View.class, true);
      String[] var3 = new String[]{""};
      ((PluginSpinnerAdapter)JMockK.spyk(new PluginSpinnerAdapter(var4, -10, var3, var1, var2))).setModel(new String[]{""});
   }
}
