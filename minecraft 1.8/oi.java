/*   1:    */ final class oi
/*   2:    */   extends eg
/*   3:    */ {
/*   4:307 */   private boolean b = true;
/*   5:    */   
/*   6:    */   protected amj b(dz paramdz, amj paramamj)
/*   7:    */   {
/*   8:312 */     if (akv.a == akv.a(paramamj.i()))
/*   9:    */     {
/*  10:313 */       aqu localaqu = paramdz.i();
/*  11:    */       
/*  12:315 */       dt localdt = paramdz.d().a(ave.b(paramdz.f()));
/*  13:316 */       if (akw.a(paramamj, localaqu, localdt))
/*  14:    */       {
/*  15:317 */         if (!localaqu.D) {
/*  16:318 */           localaqu.b(2005, localdt, 0);
/*  17:    */         }
/*  18:    */       }
/*  19:    */       else {
/*  20:321 */         this.b = false;
/*  21:    */       }
/*  22:324 */       return paramamj;
/*  23:    */     }
/*  24:326 */     return super.b(paramdz, paramamj);
/*  25:    */   }
/*  26:    */   
/*  27:    */   protected void a(dz paramdz)
/*  28:    */   {
/*  29:332 */     if (this.b) {
/*  30:333 */       paramdz.i().b(1000, paramdz.d(), 0);
/*  31:    */     } else {
/*  32:335 */       paramdz.i().b(1001, paramdz.d(), 0);
/*  33:    */     }
/*  34:    */   }
/*  35:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     oi
 * JD-Core Version:    0.7.0.1
 */