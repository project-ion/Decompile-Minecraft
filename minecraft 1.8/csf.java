/*  1:   */ public class csf
/*  2:   */   implements csq
/*  3:   */ {
/*  4:   */   private final cpr a;
/*  5:   */   
/*  6:   */   public csf(cpr paramcpr)
/*  7:   */   {
/*  8:17 */     this.a = paramcpr;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(aer paramaer, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:22 */     bec localbec = paramaer.ck();
/* 14:23 */     if (localbec.c().r() == bof.a) {
/* 15:24 */       return;
/* 16:   */     }
/* 17:27 */     cll localcll = bsu.z().ab();
/* 18:   */     
/* 19:29 */     cjm.B();
/* 20:30 */     cjm.E();
/* 21:   */     
/* 22:32 */     cjm.b(0.0F, 0.6875F, -0.75F);
/* 23:33 */     cjm.b(20.0F, 1.0F, 0.0F, 0.0F);
/* 24:34 */     cjm.b(45.0F, 0.0F, 1.0F, 0.0F);
/* 25:35 */     cjm.b(0.25F, 0.1875F, 0.25F);
/* 26:36 */     float f = 0.5F;
/* 27:37 */     cjm.a(-f, -f, f);
/* 28:   */     
/* 29:39 */     int i = paramaer.b(paramFloat3);
/* 30:40 */     int j = i % 65536;
/* 31:41 */     int k = i / 65536;
/* 32:   */     
/* 33:43 */     dax.a(dax.q, j / 1.0F, k / 1.0F);
/* 34:   */     
/* 35:45 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 36:46 */     this.a.a(cua.g);
/* 37:47 */     localcll.a(localbec, 1.0F);
/* 38:48 */     cjm.F();
/* 39:49 */     cjm.C();
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean b()
/* 43:   */   {
/* 44:54 */     return false;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     csf
 * JD-Core Version:    0.7.0.1
 */