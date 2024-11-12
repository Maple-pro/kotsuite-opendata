package com.ulicae.cinelog.utils;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import java.io.FileWriter;
import org.junit.Test;

public class FileUtilsWrapperTestFailed {
   @Test
   public void test_getFileWriter_File_1_4952() {
      FileWriter var1 = ((FileUtilsWrapper)JMockK.spyk(new FileUtilsWrapper((File)JMockK.mockk(File.class, true)))).getFileWriter((File)JMockK.mockk(File.class, true));
   }
}
