package com.ulicae.cinelog.utils;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Test;

public class FileUtilsWrapperTestSuccess {
   @Test
   public void test_getFile_String_1_4940() {
      File var1 = ((FileUtilsWrapper)JMockK.spyk(new FileUtilsWrapper((File)JMockK.mockk(File.class, true)))).getFile("pG5nqy");
   }

   @Test
   public void test_getFilesDir_1_4928() {
      File var1 = ((FileUtilsWrapper)JMockK.spyk(new FileUtilsWrapper((File)JMockK.mockk(File.class, true)))).getFilesDir();
   }
}
