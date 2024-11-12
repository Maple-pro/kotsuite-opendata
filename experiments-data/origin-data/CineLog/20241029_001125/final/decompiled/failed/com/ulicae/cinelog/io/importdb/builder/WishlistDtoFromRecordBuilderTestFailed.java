package com.ulicae.cinelog.io.importdb.builder;

import android.content.Context;
import com.ulicae.cinelog.data.dto.data.WishlistDataDto;
import io.github.maples.jmockk.JMockK;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

public class WishlistDtoFromRecordBuilderTestFailed {
   @Test
   public void test_doBuild_CSVRecord_1_5178() {
      WishlistDataDto var1 = ((WishlistDtoFromRecordBuilder)JMockK.spyk(new WishlistDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).doBuild((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }

   @Test
   public void test_doBuild_CSVRecord_1_5210() {
      Object var1 = ((WishlistDtoFromRecordBuilder)JMockK.spyk(new WishlistDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).doBuild((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }
}
