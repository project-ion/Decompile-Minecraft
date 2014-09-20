/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ final class ou
/*   4:    */   extends eg
/*   5:    */ {
/*   6:    */   public amj b(dz paramdz, amj paramamj)
/*   7:    */   {
/*   8:152 */     ej localej = ave.b(paramdz.f());
/*   9:    */     
/*  10:154 */     ex localex = ave.a(paramdz);
/*  11:155 */     double d1 = localex.a() + localej.g() * 0.3F;
/*  12:156 */     double d2 = localex.b() + localej.g() * 0.3F;
/*  13:157 */     double d3 = localex.c() + localej.i() * 0.3F;
/*  14:    */     
/*  15:159 */     aqu localaqu = paramdz.i();
/*  16:160 */     Random localRandom = localaqu.s;
/*  17:    */     
/*  18:162 */     double d4 = localRandom.nextGaussian() * 0.05D + localej.g();
/*  19:163 */     double d5 = localRandom.nextGaussian() * 0.05D + localej.h();
/*  20:164 */     double d6 = localRandom.nextGaussian() * 0.05D + localej.i();
/*  21:    */     
/*  22:166 */     localaqu.d(new ahp(localaqu, d1, d2, d3, d4, d5, d6));
/*  23:    */     
/*  24:168 */     paramamj.a(1);
/*  25:169 */     return paramamj;
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected void a(dz paramdz)
/*  29:    */   {
/*  30:174 */     paramdz.i().b(1009, paramdz.d(), 0);
/*  31:    */   }
/*  32:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ou
 * JD-Core Version:    0.7.0.1
 */