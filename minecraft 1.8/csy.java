/*  1:   */ public class csy
/*  2:   */   implements csq
/*  3:   */ {
/*  4:13 */   private static final oa a = new oa("textures/entity/wither/wither_armor.png");
/*  5:   */   private final crw b;
/*  6:16 */   private final cdn c = new cdn(0.5F);
/*  7:   */   
/*  8:   */   public csy(crw paramcrw)
/*  9:   */   {
/* 10:19 */     this.b = paramcrw;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(adf paramadf, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 14:   */   {
/* 15:24 */     if (!paramadf.ck()) {
/* 16:25 */       return;
/* 17:   */     }
/* 18:28 */     cjm.a(!paramadf.ay());
/* 19:   */     
/* 20:30 */     this.b.a(a);
/* 21:   */     
/* 22:32 */     cjm.n(5890);
/* 23:33 */     cjm.D();
/* 24:   */     
/* 25:35 */     float f1 = paramadf.W + paramFloat3;
/* 26:36 */     float f2 = uv.b(f1 * 0.02F) * 3.0F;
/* 27:37 */     float f3 = f1 * 0.01F;
/* 28:38 */     cjm.b(f2, f3, 0.0F);
/* 29:   */     
/* 30:40 */     cjm.n(5888);
/* 31:41 */     cjm.l();
/* 32:   */     
/* 33:43 */     float f4 = 0.5F;
/* 34:44 */     cjm.c(f4, f4, f4, 1.0F);
/* 35:   */     
/* 36:46 */     cjm.f();
/* 37:47 */     cjm.b(1, 1);
/* 38:   */     
/* 39:49 */     this.c.a(paramadf, paramFloat1, paramFloat2, paramFloat3);
/* 40:50 */     this.c.a(this.b.b());
/* 41:51 */     this.c.a(paramadf, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 42:   */     
/* 43:53 */     cjm.n(5890);
/* 44:54 */     cjm.D();
/* 45:55 */     cjm.n(5888);
/* 46:56 */     cjm.e();
/* 47:57 */     cjm.k();
/* 48:   */   }
/* 49:   */   
/* 50:   */   public boolean b()
/* 51:   */   {
/* 52:62 */     return false;
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     csy
 * JD-Core Version:    0.7.0.1
 */