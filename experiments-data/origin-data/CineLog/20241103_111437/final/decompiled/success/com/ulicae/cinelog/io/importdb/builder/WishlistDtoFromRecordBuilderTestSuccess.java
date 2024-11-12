package com.ulicae.cinelog.io.importdb.builder;

import android.content.Context;
import io.github.maples.jmockk.JMockK;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

public class WishlistDtoFromRecordBuilderTestSuccess {
   @Test
   public void test_getLineTitle_CSVRecord_1_5194() {
      String var1 = ((WishlistDtoFromRecordBuilder)JMockK.spyk(new WishlistDtoFromRecordBuilder((Context)JMockK.mockk(Context.class, true)))).getLineTitle((CSVRecord)JMockK.mockk(CSVRecord.class, true));
   }
}
