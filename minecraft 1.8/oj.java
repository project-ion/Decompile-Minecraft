/*   1:    */ final class oj
/*   2:    */   extends eg
/*   3:    */ {
/*   4:    */   protected amj b(dz paramdz, amj paramamj)
/*   5:    */   {
/*   6:343 */     aqu localaqu = paramdz.i();
/*   7:344 */     dt localdt = paramdz.d().a(ave.b(paramdz.f()));
/*   8:    */     
/*   9:346 */     aek localaek = new aek(localaqu, localdt.n() + 0.5D, localdt.o(), localdt.p() + 0.5D, null);
/*  10:347 */     localaqu.d(localaek);
/*  11:348 */     localaqu.a(localaek, "game.tnt.primed", 1.0F, 1.0F);
/*  12:    */     
/*  13:350 */     paramamj.b -= 1;
/*  14:351 */     return paramamj;
/*  15:    */   }
/*  16:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     oj
 * JD-Core Version:    0.7.0.1
 */