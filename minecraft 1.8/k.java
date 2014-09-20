/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ final class k
/*   4:    */   implements Callable
/*   5:    */ {
/*   6:    */   k(int paramInt, atr paramatr) {}
/*   7:    */   
/*   8:    */   public String a()
/*   9:    */   {
/*  10:    */     try
/*  11:    */     {
/*  12:170 */       return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(this.a), this.b.a(), this.b.getClass().getCanonicalName() });
/*  13:    */     }
/*  14:    */     catch (Throwable localThrowable) {}
/*  15:172 */     return "ID #" + this.a;
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     k
 * JD-Core Version:    0.7.0.1
 */