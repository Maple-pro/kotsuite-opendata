package com.ulicae.cinelog.io.importdb.builder;

import android.content.Context;
import com.ulicae.cinelog.data.dto.TagDto;
import io.github.maples.jmockk.JMockK;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

public class TagDtoFromRecordBuilderTestSuccess {
   @Test
   public void test_doBuild_CSVRecord_1_5325() {
      TagDto var1 = ((TagDtoFromRecordBuilder)JMockK.spyk(new TagDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).doBuild((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }

   @Test
   public void test_doBuild_CSVRecord_1_5357() {
      Object var1 = ((TagDtoFromRecordBuilder)JMockK.spyk(new TagDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).doBuild((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }

   @Test
   public void test_getLineTitle_CSVRecord_1_5341() {
      String var1 = ((TagDtoFromRecordBuilder)JMockK.spyk(new TagDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).getLineTitle((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }
}
