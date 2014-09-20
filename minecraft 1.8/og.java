/*   1:    */ final class og
/*   2:    */   extends eg
/*   3:    */ {
/*   4:238 */   private final eg b = new eg();
/*   5:    */   
/*   6:    */   public amj b(dz paramdz, amj paramamj)
/*   7:    */   {
/*   8:242 */     aqu localaqu = paramdz.i();
/*   9:    */     
/*  10:244 */     dt localdt = paramdz.d().a(ave.b(paramdz.f()));
/*  11:    */     
/*  12:246 */     bec localbec = localaqu.p(localdt);
/*  13:247 */     atr localatr = localbec.c();
/*  14:248 */     bof localbof = localatr.r();
/*  15:    */     alq localalq;
/*  16:251 */     if ((bof.h.equals(localbof)) && ((localatr instanceof axl)) && (((Integer)localbec.b(axl.b)).intValue() == 0)) {
/*  17:252 */       localalq = amk.ax;
/*  18:253 */     } else if ((bof.i.equals(localbof)) && ((localatr instanceof axl)) && (((Integer)localbec.b(axl.b)).intValue() == 0)) {
/*  19:254 */       localalq = amk.ay;
/*  20:    */     } else {
/*  21:256 */       return super.b(paramdz, paramamj);
/*  22:    */     }
/*  23:259 */     localaqu.g(localdt);
/*  24:260 */     if (--paramamj.b == 0)
/*  25:    */     {
/*  26:261 */       paramamj.a(localalq);
/*  27:262 */       paramamj.b = 1;
/*  28:    */     }
/*  29:263 */     else if (((bcx)paramdz.h()).a(new amj(localalq)) < 0)
/*  30:    */     {
/*  31:264 */       this.b.a(paramdz, new amj(localalq));
/*  32:    */     }
/*  33:266 */     return paramamj;
/*  34:    */   }
/*  35:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     og
 * JD-Core Version:    0.7.0.1
 */