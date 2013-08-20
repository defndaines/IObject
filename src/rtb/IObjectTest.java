package rtb;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IObjectTest
{
   private static final long ID = 6655321L;
   private static final String NAME = "The Black Knight";

   @Test
   public void testEquals()
   {
      IDontKnow address = new NameAndAddress(NAME, ID, "Forest");
      IDontKnow number = new NameAndNumber(NAME, ID, "310-555-1212");
      assertTrue(IObject.equals(address, number));
   }

   @Test
   public void testInequality()
   {
      IDontKnow address = new NameAndAddress(NAME, ID, "Forest");
      IDontKnow number = new NameAndNumber("The Red Knight", ID, "310-555-1212");
      assertFalse(IObject.equals(address, number));
   }

   @Test
   public void testInequalityAtGrandparentInterface()
   {
      IDontKnow address = new NameAndAddress(NAME, ID, "Forest");
      IDontKnow number = new NameAndNumber(NAME, 6655320L, "310-555-1212");
      assertFalse(IObject.equals(address, number));
   }

   @Test
   public void testUnalignedInterfaces()
   {
      IDontKnow address = new NameAndAddress(NAME, ID, "Forest");
      IDontKnow invincible = new NoneShallPass(NAME, ID);
      assertTrue(IObject.equals(address, invincible));
   }
}