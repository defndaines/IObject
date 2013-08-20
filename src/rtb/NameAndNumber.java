package rtb;

public class NameAndNumber implements IDontKnow
{
   private final long id;
   private final String name;
   private final String phone;

   public NameAndNumber(String name, long id, String phone)
   {
      this.name = name;
      this.id = id;
      this.phone = phone;
   }

   public String getName()
   {
      return name;
   }

   public long getID()
   {
      return id;
   }

   public String getPhone()
   {
      return phone;
   }
}
