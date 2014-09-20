/*  1:   */ public class crs
/*  2:   */   extends cpu
/*  3:   */ {
/*  4:   */   public crs(cpt paramcpt)
/*  5:   */   {
/*  6:17 */     super(paramcpt);
/*  7:18 */     this.c = 0.5F;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public void a(aek paramaek, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 11:   */   {
/* 12:23 */     cll localcll = bsu.z().ab();
/* 13:   */     
/* 14:25 */     cjm.E();
/* 15:26 */     cjm.b((float)paramDouble1, (float)paramDouble2 + 0.5F, (float)paramDouble3);
/* 16:27 */     if (paramaek.a - paramFloat2 + 1.0F < 10.0F)
/* 17:   */     {
/* 18:28 */       f1 = 1.0F - (paramaek.a - paramFloat2 + 1.0F) / 10.0F;
/* 19:29 */       f1 = uv.a(f1, 0.0F, 1.0F);
/* 20:30 */       f1 *= f1;
/* 21:31 */       f1 *= f1;
/* 22:32 */       float f2 = 1.0F + f1 * 0.3F;
/* 23:33 */       cjm.a(f2, f2, f2);
/* 24:   */     }
/* 25:36 */     float f1 = (1.0F - (paramaek.a - paramFloat2 + 1.0F) / 100.0F) * 0.8F;
/* 26:37 */     c(paramaek);
/* 27:38 */     cjm.b(-0.5F, -0.5F, 0.5F);
/* 28:39 */     localcll.a(aty.W.P(), paramaek.c(paramFloat2));
/* 29:40 */     cjm.b(0.0F, 0.0F, 1.0F);
/* 30:41 */     if (paramaek.a / 5 % 2 == 0)
/* 31:   */     {
/* 32:42 */       cjm.x();
/* 33:43 */       cjm.f();
/* 34:44 */       cjm.l();
/* 35:45 */       cjm.b(770, 772);
/* 36:46 */       cjm.c(1.0F, 1.0F, 1.0F, f1);
/* 37:47 */       cjm.a(-3.0F, -3.0F);
/* 38:48 */       cjm.q();
/* 39:49 */       localcll.a(aty.W.P(), 1.0F);
/* 40:50 */       cjm.a(0.0F, 0.0F);
/* 41:51 */       cjm.r();
/* 42:52 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 43:53 */       cjm.k();
/* 44:54 */       cjm.e();
/* 45:55 */       cjm.w();
/* 46:   */     }
/* 47:57 */     cjm.F();
/* 48:   */     
/* 49:59 */     super.a(paramaek, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 50:   */   }
/* 51:   */   
/* 52:   */   protected oa a(aek paramaek)
/* 53:   */   {
/* 54:64 */     return cua.g;
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     crs
 * JD-Core Version:    0.7.0.1
 */