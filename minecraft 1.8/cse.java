/*  1:   */ public class cse
/*  2:   */   implements csq
/*  3:   */ {
/*  4:   */   private final ctc a;
/*  5:   */   
/*  6:   */   public cse(ctc paramctc)
/*  7:   */   {
/*  8:13 */     this.a = paramctc;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(cil paramcil, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:18 */     if ((!paramcil.a()) || (paramcil.ay()) || (!paramcil.a(ahh.a)) || (paramcil.k() == null)) {
/* 14:19 */       return;
/* 15:   */     }
/* 16:22 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 17:   */     
/* 18:24 */     this.a.a(paramcil.k());
/* 19:25 */     cjm.E();
/* 20:26 */     cjm.b(0.0F, 0.0F, 0.125F);
/* 21:   */     
/* 22:28 */     double d1 = paramcil.bo + (paramcil.br - paramcil.bo) * paramFloat3 - (paramcil.p + (paramcil.s - paramcil.p) * paramFloat3);
/* 23:29 */     double d2 = paramcil.bp + (paramcil.bs - paramcil.bp) * paramFloat3 - (paramcil.q + (paramcil.t - paramcil.q) * paramFloat3);
/* 24:30 */     double d3 = paramcil.bq + (paramcil.bt - paramcil.bq) * paramFloat3 - (paramcil.r + (paramcil.u - paramcil.r) * paramFloat3);
/* 25:   */     
/* 26:32 */     float f1 = paramcil.aH + (paramcil.aG - paramcil.aH) * paramFloat3;
/* 27:   */     
/* 28:34 */     double d4 = uv.a(f1 * 3.141593F / 180.0F);
/* 29:35 */     double d5 = -uv.b(f1 * 3.141593F / 180.0F);
/* 30:   */     
/* 31:37 */     float f2 = (float)d2 * 10.0F;
/* 32:38 */     f2 = uv.a(f2, -6.0F, 32.0F);
/* 33:39 */     float f3 = (float)(d1 * d4 + d3 * d5) * 100.0F;
/* 34:40 */     float f4 = (float)(d1 * d5 - d3 * d4) * 100.0F;
/* 35:41 */     if (f3 < 0.0F) {
/* 36:42 */       f3 = 0.0F;
/* 37:   */     }
/* 38:45 */     float f5 = paramcil.bl + (paramcil.bm - paramcil.bl) * paramFloat3;
/* 39:   */     
/* 40:47 */     f2 += uv.a((paramcil.L + (paramcil.M - paramcil.L) * paramFloat3) * 6.0F) * 32.0F * f5;
/* 41:48 */     if (paramcil.aw()) {
/* 42:49 */       f2 += 25.0F;
/* 43:   */     }
/* 44:52 */     cjm.b(6.0F + f3 / 2.0F + f2, 1.0F, 0.0F, 0.0F);
/* 45:53 */     cjm.b(f4 / 2.0F, 0.0F, 0.0F, 1.0F);
/* 46:54 */     cjm.b(-f4 / 2.0F, 0.0F, 1.0F, 0.0F);
/* 47:55 */     cjm.b(180.0F, 0.0F, 1.0F, 0.0F);
/* 48:56 */     this.a.g().c(0.0625F);
/* 49:57 */     cjm.F();
/* 50:   */   }
/* 51:   */   
/* 52:   */   public boolean b()
/* 53:   */   {
/* 54:62 */     return false;
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cse
 * JD-Core Version:    0.7.0.1
 */