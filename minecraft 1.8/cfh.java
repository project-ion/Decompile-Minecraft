/*  1:   */ public class cfh
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   protected cfh(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, alq paramalq)
/*  5:   */   {
/*  6:14 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramalq, 0);
/*  7:   */   }
/*  8:   */   
/*  9:   */   protected cfh(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, alq paramalq, int paramInt)
/* 10:   */   {
/* 11:18 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramalq, paramInt);
/* 12:19 */     this.v *= 0.1000000014901161D;
/* 13:20 */     this.w *= 0.1000000014901161D;
/* 14:21 */     this.x *= 0.1000000014901161D;
/* 15:22 */     this.v += paramDouble4;
/* 16:23 */     this.w += paramDouble5;
/* 17:24 */     this.x += paramDouble6;
/* 18:   */   }
/* 19:   */   
/* 20:   */   protected cfh(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, alq paramalq, int paramInt)
/* 21:   */   {
/* 22:28 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 23:29 */     a(bsu.z().af().a().a(paramalq, paramInt));
/* 24:30 */     this.ap = (this.aq = this.ar = 1.0F);
/* 25:31 */     this.i = aty.aJ.I;
/* 26:32 */     this.h /= 2.0F;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public int a()
/* 30:   */   {
/* 31:37 */     return 1;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a(civ paramciv, wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 35:   */   {
/* 36:42 */     float f1 = (this.b + this.d / 4.0F) / 16.0F;
/* 37:43 */     float f2 = f1 + 0.01560938F;
/* 38:44 */     float f3 = (this.c + this.e / 4.0F) / 16.0F;
/* 39:45 */     float f4 = f3 + 0.01560938F;
/* 40:46 */     float f5 = 0.1F * this.h;
/* 41:48 */     if (this.at != null)
/* 42:   */     {
/* 43:49 */       f1 = this.at.a(this.d / 4.0F * 16.0F);
/* 44:50 */       f2 = this.at.a((this.d + 1.0F) / 4.0F * 16.0F);
/* 45:51 */       f3 = this.at.b(this.e / 4.0F * 16.0F);
/* 46:52 */       f4 = this.at.b((this.e + 1.0F) / 4.0F * 16.0F);
/* 47:   */     }
/* 48:55 */     float f6 = (float)(this.p + (this.s - this.p) * paramFloat1 - au);
/* 49:56 */     float f7 = (float)(this.q + (this.t - this.q) * paramFloat1 - av);
/* 50:57 */     float f8 = (float)(this.r + (this.u - this.r) * paramFloat1 - aw);
/* 51:58 */     paramciv.b(this.ap, this.aq, this.ar);
/* 52:   */     
/* 53:60 */     paramciv.a(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/* 54:61 */     paramciv.a(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/* 55:62 */     paramciv.a(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/* 56:63 */     paramciv.a(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cfh
 * JD-Core Version:    0.7.0.1
 */