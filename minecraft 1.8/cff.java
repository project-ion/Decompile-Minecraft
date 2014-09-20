/*  1:   */ public class cff
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   protected cff(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, alq paramalq)
/*  5:   */   {
/*  6:12 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  7:13 */     a(bsu.z().af().a().a(paramalq));
/*  8:14 */     this.ap = (this.aq = this.ar = 1.0F);
/*  9:15 */     this.v = (this.w = this.x = 0.0D);
/* 10:16 */     this.i = 0.0F;
/* 11:17 */     this.g = 80;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public int a()
/* 15:   */   {
/* 16:22 */     return 1;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(civ paramciv, wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 20:   */   {
/* 21:27 */     float f1 = this.at.e();
/* 22:28 */     float f2 = this.at.f();
/* 23:29 */     float f3 = this.at.g();
/* 24:30 */     float f4 = this.at.h();
/* 25:   */     
/* 26:32 */     float f5 = (float)(this.p + (this.s - this.p) * paramFloat1 - au);
/* 27:33 */     float f6 = (float)(this.q + (this.t - this.q) * paramFloat1 - av);
/* 28:34 */     float f7 = (float)(this.r + (this.u - this.r) * paramFloat1 - aw);
/* 29:35 */     paramciv.b(this.ap, this.aq, this.ar);
/* 30:   */     
/* 31:37 */     float f8 = 0.5F;
/* 32:38 */     paramciv.a(f5 - paramFloat2 * f8 - paramFloat5 * f8, f6 - paramFloat3 * f8, f7 - paramFloat4 * f8 - paramFloat6 * f8, f2, f4);
/* 33:39 */     paramciv.a(f5 - paramFloat2 * f8 + paramFloat5 * f8, f6 + paramFloat3 * f8, f7 - paramFloat4 * f8 + paramFloat6 * f8, f2, f3);
/* 34:40 */     paramciv.a(f5 + paramFloat2 * f8 + paramFloat5 * f8, f6 + paramFloat3 * f8, f7 + paramFloat4 * f8 + paramFloat6 * f8, f1, f3);
/* 35:41 */     paramciv.a(f5 + paramFloat2 * f8 - paramFloat5 * f8, f6 - paramFloat3 * f8, f7 + paramFloat4 * f8 - paramFloat6 * f8, f1, f4);
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cff
 * JD-Core Version:    0.7.0.1
 */