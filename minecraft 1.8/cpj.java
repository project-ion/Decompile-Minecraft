/*  1:   */ public class cpj
/*  2:   */   extends cpu
/*  3:   */ {
/*  4:11 */   private static final oa e = new oa("textures/entity/boat.png");
/*  5:12 */   protected ccq a = new cbz();
/*  6:   */   
/*  7:   */   public cpj(cpt paramcpt)
/*  8:   */   {
/*  9:15 */     super(paramcpt);
/* 10:16 */     this.c = 0.5F;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(adu paramadu, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:21 */     cjm.E();
/* 16:   */     
/* 17:23 */     cjm.b((float)paramDouble1, (float)paramDouble2 + 0.25F, (float)paramDouble3);
/* 18:   */     
/* 19:25 */     cjm.b(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
/* 20:26 */     float f1 = paramadu.l() - paramFloat2;
/* 21:27 */     float f2 = paramadu.j() - paramFloat2;
/* 22:28 */     if (f2 < 0.0F) {
/* 23:29 */       f2 = 0.0F;
/* 24:   */     }
/* 25:31 */     if (f1 > 0.0F) {
/* 26:32 */       cjm.b(uv.a(f1) * f1 * f2 / 10.0F * paramadu.m(), 1.0F, 0.0F, 0.0F);
/* 27:   */     }
/* 28:35 */     float f3 = 0.75F;
/* 29:36 */     cjm.a(f3, f3, f3);
/* 30:37 */     cjm.a(1.0F / f3, 1.0F / f3, 1.0F / f3);
/* 31:   */     
/* 32:39 */     c(paramadu);
/* 33:40 */     cjm.a(-1.0F, -1.0F, 1.0F);
/* 34:41 */     this.a.a(paramadu, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
/* 35:42 */     cjm.F();
/* 36:   */     
/* 37:44 */     super.a(paramadu, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 38:   */   }
/* 39:   */   
/* 40:   */   protected oa a(adu paramadu)
/* 41:   */   {
/* 42:49 */     return e;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cpj
 * JD-Core Version:    0.7.0.1
 */