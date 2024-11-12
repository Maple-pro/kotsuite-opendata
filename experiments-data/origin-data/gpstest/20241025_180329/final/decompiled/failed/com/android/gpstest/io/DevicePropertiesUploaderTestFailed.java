package com.android.gpstest.io;

import android.os.Bundle;
import io.github.maples.jmockk.JMockK;
import kotlin.coroutines.Continuation;
import org.junit.Test;

public class DevicePropertiesUploaderTestFailed {
   @Test
   public void test_upload_Continuation_1_2037() {
      Object var1 = ((DevicePropertiesUploader)JMockK.spyk(new DevicePropertiesUploader((Bundle)JMockK.mockk(Bundle.class, true)))).upload((Continuation)JMockK.mockk(Continuation.class, true));
   }
}
