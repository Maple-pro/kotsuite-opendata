package com.android.gpstest.library.util;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTestSuccess {
   @Test
   public void test_clamp_double_double_double_1_21() {
      Object var1 = MathUtils.clamp(10.863355691397587, -82.72629876933888, 66.81851712933312);
      Assert.assertEquals(new Double(66.81851712933312), var1);
   }

   @Test
   public void test_fuzzyEquals_double_double_double_1_9() {
      Object var1 = MathUtils.fuzzyEquals(-8.422687196623542, -69.33599375294841, 52.84314708142915);
      Assert.assertEquals(new Integer(0), var1);
   }

   @Test
   public void test_isValidFloat_float_1_17() {
      Object var1 = MathUtils.isValidFloat(85.97888F);
      Assert.assertEquals(new Integer(1), var1);
   }

   @Test
   public void test_mapToRange_float_float_float_float_float_1_13() {
      Object var1 = MathUtils.mapToRange(0.012298584F, 45.781036F, -37.99412F, 11.174835F, 39.655197F);
      Assert.assertEquals(new Float(11.174835F), var1);
   }

   @Test
   public void test_mapToRange_float_float_float_float_float_2_15() {
      Object var1 = MathUtils.mapToRange(31.285385F, -68.43982F, 13.85759F, -7.3985596F, -10.188255F);
      Assert.assertEquals(new Float(-10.188255F), var1);
   }

   @Test
   public void test_mod_double_double_1_1() {
      Object var1 = MathUtils.mod(48.70160554550742, 51.838504190985134);
      Assert.assertEquals(new Double(48.70160554550742), var1);
   }

   @Test
   public void test_toDouble_String_1_29() {
      Double var1 = MathUtils.toDouble("9xpaXF1");
      Assert.assertEquals(new Double(9.0), var1);
   }

   @Test
   public void test_toMhz_double_1_5() {
      Object var1 = MathUtils.toMhz(71.27233048616296);
      Assert.assertEquals(new Double(7.127233048616296E-5), var1);
   }
}
