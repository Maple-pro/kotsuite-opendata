package ch.abertschi.adfree.util;

import io.github.maples.jmockk.JMockK;
import org.junit.Test;

public class SerializerTestFailed {
   @Test
   public void test_prettyPrint_Object_1_45() {
      String var1 = ((Serializer)JMockK.spyk(new Serializer())).prettyPrint((Object)JMockK.mockk(Object.class, true));
   }
}
