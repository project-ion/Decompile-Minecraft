/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agf
/*   4:    */   extends zk
/*   5:    */ {
/*   6:    */   public agf(age paramage, Class paramClass)
/*   7:    */   {
/*   8:212 */     super(paramage, paramClass, 1.0D, true);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean b()
/*  12:    */   {
/*  13:217 */     float f = this.b.c(1.0F);
/*  14:218 */     if ((f >= 0.5F) && (this.b.bb().nextInt(100) == 0))
/*  15:    */     {
/*  16:219 */       this.b.d(null);
/*  17:220 */       return false;
/*  18:    */     }
/*  19:222 */     return super.b();
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected double a(xm paramxm)
/*  23:    */   {
/*  24:227 */     return 4.0F + paramxm.J;
/*  25:    */   }
/*  26:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     agf
 * JD-Core Version:    0.7.0.1
 */