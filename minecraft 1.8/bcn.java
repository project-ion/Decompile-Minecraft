/*   1:    */ import java.util.Map;
/*   2:    */ import java.util.concurrent.Callable;
/*   3:    */ 
/*   4:    */ class bcn
/*   5:    */   implements Callable
/*   6:    */ {
/*   7:    */   bcn(bcm parambcm) {}
/*   8:    */   
/*   9:    */   public String a()
/*  10:    */   {
/*  11:186 */     return (String)bcm.F().get(this.a.getClass()) + " // " + this.a.getClass().getCanonicalName();
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcn
 * JD-Core Version:    0.7.0.1
 */