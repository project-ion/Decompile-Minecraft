/*  1:   */ public class csl
/*  2:   */   implements csq
/*  3:   */ {
/*  4:12 */   private static final oa a = new oa("textures/entity/enderman/enderman_eyes.png");
/*  5:   */   private final cpr b;
/*  6:   */   
/*  7:   */   public csl(cpr paramcpr)
/*  8:   */   {
/*  9:17 */     this.b = paramcpr;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(aer paramaer, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 13:   */   {
/* 14:22 */     this.b.a(a);
/* 15:   */     
/* 16:24 */     cjm.l();
/* 17:25 */     cjm.c();
/* 18:26 */     cjm.b(1, 1);
/* 19:27 */     cjm.f();
/* 20:28 */     if (paramaer.ay()) {
/* 21:29 */       cjm.a(false);
/* 22:   */     } else {
/* 23:31 */       cjm.a(true);
/* 24:   */     }
/* 25:34 */     int i = 61680;
/* 26:35 */     int j = i % 65536;
/* 27:36 */     int k = i / 65536;
/* 28:   */     
/* 29:38 */     dax.a(dax.q, j / 1.0F, k / 1.0F);
/* 30:   */     
/* 31:40 */     cjm.e();
/* 32:41 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 33:   */     
/* 34:43 */     this.b.b().a(paramaer, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 35:   */     
/* 36:45 */     this.b.a(paramaer, paramFloat3);
/* 37:   */     
/* 38:47 */     cjm.k();
/* 39:48 */     cjm.d();
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean b()
/* 43:   */   {
/* 44:53 */     return false;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     csl
 * JD-Core Version:    0.7.0.1
 */