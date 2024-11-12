package com.ulicae.cinelog.io.importdb.builder;

import android.content.Context;
import com.ulicae.cinelog.data.dto.KinoDto;
import io.github.maples.jmockk.JMockK;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

public class KinoDtoFromRecordBuilderTestFailed {
   @Test
   public void test_doBuild_CSVRecord_1_5277() {
      KinoDto var1 = ((KinoDtoFromRecordBuilder)JMockK.spyk(new KinoDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).doBuild((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }

   @Test
   public void test_doBuild_CSVRecord_1_5309() {
      Object var1 = ((KinoDtoFromRecordBuilder)JMockK.spyk(new KinoDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).doBuild((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }
}
