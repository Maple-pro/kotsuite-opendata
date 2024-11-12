package com.ulicae.cinelog.io.importdb.builder;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

public class KinoDtoFromRecordBuilderTestSuccess {
   @Test
   public void test_getLineTitle_CSVRecord_1_5293() {
      String var1 = ((KinoDtoFromRecordBuilder)JMockK.spyk(new KinoDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).getLineTitle((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }
}
