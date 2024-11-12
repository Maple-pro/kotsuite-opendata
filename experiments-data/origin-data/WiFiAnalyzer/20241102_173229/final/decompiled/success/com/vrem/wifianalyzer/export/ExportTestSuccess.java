package com.vrem.wifianalyzer.export;

import android.content.Intent;
import com.vrem.wifianalyzer.MainActivity;
import io.github.maples.jmockk.JMockK;
import java.util.Date;
import java.util.List;
import org.junit.Test;

public class ExportTestSuccess {
   @Test
   public void test_export_MainActivity_List_1_2312() {
      Intent var1 = ((Export)JMockK.spyk(new Export((ExportIntent)JMockK.mockk(ExportIntent.class, true)))).export((MainActivity)JMockK.mockk(MainActivity.class, true), (List)JMockK.mockk(List.class, true));
   }

   @Test
   public void test_export_MainActivity_List_Date_1_2332() {
      Intent var1 = ((Export)JMockK.spyk(new Export((ExportIntent)JMockK.mockk(ExportIntent.class, true)))).export((MainActivity)JMockK.mockk(MainActivity.class, true), (List)JMockK.mockk(List.class, true), (Date)JMockK.mockk(Date.class, true));
   }
}
