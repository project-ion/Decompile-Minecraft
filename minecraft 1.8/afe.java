/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class afe
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   private afa a;
/*   7:    */   
/*   8:    */   public afe(afa paramafa)
/*   9:    */   {
/*  10:221 */     this.a = paramafa;
/*  11:    */     
/*  12:223 */     a(1);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean a()
/*  16:    */   {
/*  17:228 */     yn localyn = this.a.q();
/*  18:229 */     if (!localyn.a()) {
/*  19:230 */       return true;
/*  20:    */     }
/*  21:233 */     double d1 = localyn.d() - this.a.s;
/*  22:234 */     double d2 = localyn.e() - this.a.t;
/*  23:235 */     double d3 = localyn.f() - this.a.u;
/*  24:    */     
/*  25:237 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  26:239 */     if ((d4 < 1.0D) || (d4 > 3600.0D)) {
/*  27:240 */       return true;
/*  28:    */     }
/*  29:243 */     return false;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public boolean b()
/*  33:    */   {
/*  34:248 */     return false;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void c()
/*  38:    */   {
/*  39:253 */     Random localRandom = this.a.bb();
/*  40:254 */     double d1 = this.a.s + (localRandom.nextFloat() * 2.0F - 1.0F) * 16.0F;
/*  41:255 */     double d2 = this.a.t + (localRandom.nextFloat() * 2.0F - 1.0F) * 16.0F;
/*  42:256 */     double d3 = this.a.u + (localRandom.nextFloat() * 2.0F - 1.0F) * 16.0F;
/*  43:257 */     this.a.q().a(d1, d2, d3, 1.0D);
/*  44:    */   }
/*  45:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afe
 * JD-Core Version:    0.7.0.1
 */