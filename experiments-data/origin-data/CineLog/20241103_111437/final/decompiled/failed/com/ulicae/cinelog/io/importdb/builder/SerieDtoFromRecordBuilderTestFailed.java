package com.ulicae.cinelog.io.importdb.builder;

import android.content.Context;
import com.ulicae.cinelog.data.dto.SerieDto;
import io.github.maples.jmockk.JMockK;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

public class SerieDtoFromRecordBuilderTestFailed {
   @Test
   public void test_doBuild_CSVRecord_1_5229() {
      SerieDto var1 = ((SerieDtoFromRecordBuilder)JMockK.spyk(new SerieDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).doBuild((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }

   @Test
   public void test_doBuild_CSVRecord_1_5261() {
      Object var1 = ((SerieDtoFromRecordBuilder)JMockK.spyk(new SerieDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).doBuild((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }
}
