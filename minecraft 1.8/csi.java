/*  1:   */ public class csi
/*  2:   */   implements csq
/*  3:   */ {
/*  4:   */   private final ctc a;
/*  5:   */   
/*  6:   */   public csi(ctc paramctc)
/*  7:   */   {
/*  8:11 */     this.a = paramctc;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(cil paramcil, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:16 */     if ((!paramcil.d_().equals("deadmau5")) || (!paramcil.g()) || (paramcil.ay())) {
/* 14:17 */       return;
/* 15:   */     }
/* 16:20 */     this.a.a(paramcil.i());
/* 17:21 */     for (int i = 0; i < 2; i++)
/* 18:   */     {
/* 19:22 */       float f1 = paramcil.A + (paramcil.y - paramcil.A) * paramFloat3 - (paramcil.aH + (paramcil.aG - paramcil.aH) * paramFloat3);
/* 20:23 */       float f2 = paramcil.B + (paramcil.z - paramcil.B) * paramFloat3;
/* 21:24 */       cjm.E();
/* 22:25 */       cjm.b(f1, 0.0F, 1.0F, 0.0F);
/* 23:26 */       cjm.b(f2, 1.0F, 0.0F, 0.0F);
/* 24:27 */       cjm.b(0.375F * (i * 2 - 1), 0.0F, 0.0F);
/* 25:28 */       cjm.b(0.0F, -0.375F, 0.0F);
/* 26:29 */       cjm.b(-f2, 1.0F, 0.0F, 0.0F);
/* 27:30 */       cjm.b(-f1, 0.0F, 1.0F, 0.0F);
/* 28:   */       
/* 29:32 */       float f3 = 1.333333F;
/* 30:33 */       cjm.a(f3, f3, f3);
/* 31:34 */       this.a.g().b(0.0625F);
/* 32:35 */       cjm.F();
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public boolean b()
/* 37:   */   {
/* 38:41 */     return true;
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     csi
 * JD-Core Version:    0.7.0.1
 */