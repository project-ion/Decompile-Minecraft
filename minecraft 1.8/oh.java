/*   1:    */ final class oh
/*   2:    */   extends eg
/*   3:    */ {
/*   4:271 */   private boolean b = true;
/*   5:    */   
/*   6:    */   protected amj b(dz paramdz, amj paramamj)
/*   7:    */   {
/*   8:275 */     aqu localaqu = paramdz.i();
/*   9:    */     
/*  10:277 */     dt localdt = paramdz.d().a(ave.b(paramdz.f()));
/*  11:278 */     if (localaqu.d(localdt))
/*  12:    */     {
/*  13:279 */       localaqu.a(localdt, aty.ab.P());
/*  14:281 */       if (paramamj.a(1, localaqu.s)) {
/*  15:282 */         paramamj.b = 0;
/*  16:    */       }
/*  17:    */     }
/*  18:285 */     else if (localaqu.p(localdt).c() == aty.W)
/*  19:    */     {
/*  20:286 */       aty.W.d(localaqu, localdt, aty.W.P().a(bbk.a, Boolean.valueOf(true)));
/*  21:287 */       localaqu.g(localdt);
/*  22:    */     }
/*  23:    */     else
/*  24:    */     {
/*  25:289 */       this.b = false;
/*  26:    */     }
/*  27:293 */     return paramamj;
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void a(dz paramdz)
/*  31:    */   {
/*  32:298 */     if (this.b) {
/*  33:299 */       paramdz.i().b(1000, paramdz.d(), 0);
/*  34:    */     } else {
/*  35:301 */       paramdz.i().b(1001, paramdz.d(), 0);
/*  36:    */     }
/*  37:    */   }
/*  38:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     oh
 * JD-Core Version:    0.7.0.1
 */