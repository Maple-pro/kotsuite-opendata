package com.ulicae.cinelog.utils.image;

import io.github.maples.jmockk.JMockK;
import java.io.File;
import org.junit.Test;

public class ImageCacheDownloaderTestFailed {
   @Test
   public void test_getPosterFinder_1_5401() {
      ImageFinder var1 = ((ImageCacheDownloader)JMockK.spyk(new ImageCacheDownloader((File)JMockK.mockk(File.class, true), "ur3LsRFEcyApxONaGe"))).getPosterFinder();
   }
}
