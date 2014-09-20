/*  1:   */ public class crx
/*  2:   */   extends cpu
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/wither/wither_invulnerable.png");
/*  5:10 */   private static final oa e = new oa("textures/entity/wither/wither.png");
/*  6:   */   private final cdb f;
/*  7:   */   
/*  8:   */   public crx(cpt paramcpt)
/*  9:   */   {
/* 10:15 */     super(paramcpt);
/* 11:16 */     this.f = new cdb();
/* 12:   */   }
/* 13:   */   
/* 14:   */   private float a(float paramFloat1, float paramFloat2, float paramFloat3)
/* 15:   */   {
/* 16:20 */     float f1 = paramFloat2 - paramFloat1;
/* 17:21 */     while (f1 < -180.0F) {
/* 18:22 */       f1 += 360.0F;
/* 19:   */     }
/* 20:24 */     while (f1 >= 180.0F) {
/* 21:25 */       f1 -= 360.0F;
/* 22:   */     }
/* 23:27 */     return paramFloat1 + paramFloat3 * f1;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(ahw paramahw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 27:   */   {
/* 28:32 */     cjm.E();
/* 29:33 */     cjm.p();
/* 30:   */     
/* 31:35 */     float f1 = a(paramahw.A, paramahw.y, paramFloat2);
/* 32:36 */     float f2 = paramahw.B + (paramahw.z - paramahw.B) * paramFloat2;
/* 33:   */     
/* 34:38 */     cjm.b((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 35:   */     
/* 36:40 */     float f3 = 0.0625F;
/* 37:41 */     cjm.B();
/* 38:42 */     cjm.a(-1.0F, -1.0F, 1.0F);
/* 39:   */     
/* 40:44 */     cjm.d();
/* 41:   */     
/* 42:46 */     c(paramahw);
/* 43:   */     
/* 44:48 */     this.f.a(paramahw, 0.0F, 0.0F, 0.0F, f1, f2, f3);
/* 45:   */     
/* 46:50 */     cjm.F();
/* 47:   */     
/* 48:52 */     super.a(paramahw, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 49:   */   }
/* 50:   */   
/* 51:   */   protected oa a(ahw paramahw)
/* 52:   */   {
/* 53:57 */     return paramahw.l() ? a : e;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     crx
 * JD-Core Version:    0.7.0.1
 */