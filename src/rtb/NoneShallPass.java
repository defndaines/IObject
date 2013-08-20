package rtb;

public class NoneShallPass implements IDontKnow, IMInvincible
{
   private final long id;
   private final String name;
   private final int limbs = 4;

   public NoneShallPass(String name, long id)
   {
      this.name = name;
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public long getID()
   {
      return id;
   }

   public int getLimbCount()
   {
      return limbs;
   }
}