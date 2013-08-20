package rtb;

public class NameAndAddress implements IDontKnow
{
   private final long id;
   private final String name;
   private final String address;

   public NameAndAddress(String name, long id, String address)
   {
      this.name = name;
      this.id = id;
      this.address = address;
   }

   public String getName()
   {
      return name;
   }

   public long getID()
   {
      return id;
   }

   public String getAddress()
   {
      return address;
   }
}
