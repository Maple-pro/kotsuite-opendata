package com.ulicae.cinelog.utils;

import android.app.Application;
import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class UpgradeFixRunnerTestFailed {
   @Test
   public void test_runFixesIfNeeded_1_5413() {
      ((UpgradeFixRunner)JMockK.spyk(new UpgradeFixRunner((Context)JMockK.mockk(Context.class, true), (Application)JMockK.mockk(Application.class, true)))).runFixesIfNeeded();
   }
}
