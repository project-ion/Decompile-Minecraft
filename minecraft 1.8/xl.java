/*  1:   */ public abstract class xl
/*  2:   */   extends xn
/*  3:   */ {
/*  4:   */   public xl(aqu paramaqu)
/*  5:   */   {
/*  6:10 */     super(paramaqu);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public void e(float paramFloat1, float paramFloat2) {}
/* 10:   */   
/* 11:   */   protected void a(double paramDouble, boolean paramBoolean, atr paramatr, dt paramdt) {}
/* 12:   */   
/* 13:   */   public void g(float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:25 */     if (V())
/* 16:   */     {
/* 17:26 */       a(paramFloat1, paramFloat2, 0.02F);
/* 18:27 */       d(this.v, this.w, this.x);
/* 19:   */       
/* 20:29 */       this.v *= 0.800000011920929D;
/* 21:30 */       this.w *= 0.800000011920929D;
/* 22:31 */       this.x *= 0.800000011920929D;
/* 23:   */     }
/* 24:32 */     else if (ab())
/* 25:   */     {
/* 26:33 */       a(paramFloat1, paramFloat2, 0.02F);
/* 27:34 */       d(this.v, this.w, this.x);
/* 28:35 */       this.v *= 0.5D;
/* 29:36 */       this.w *= 0.5D;
/* 30:37 */       this.x *= 0.5D;
/* 31:   */     }
/* 32:   */     else
/* 33:   */     {
/* 34:39 */       float f1 = 0.91F;
/* 35:40 */       if (this.C) {
/* 36:41 */         f1 = this.o.p(new dt(uv.c(this.s), uv.c(aQ().b) - 1, uv.c(this.u))).c().K * 0.91F;
/* 37:   */       }
/* 38:44 */       float f2 = 0.1627714F / (f1 * f1 * f1);
/* 39:45 */       a(paramFloat1, paramFloat2, this.C ? 0.1F * f2 : 0.02F);
/* 40:   */       
/* 41:47 */       f1 = 0.91F;
/* 42:48 */       if (this.C) {
/* 43:49 */         f1 = this.o.p(new dt(uv.c(this.s), uv.c(aQ().b) - 1, uv.c(this.u))).c().K * 0.91F;
/* 44:   */       }
/* 45:52 */       d(this.v, this.w, this.x);
/* 46:   */       
/* 47:54 */       this.v *= f1;
/* 48:55 */       this.w *= f1;
/* 49:56 */       this.x *= f1;
/* 50:   */     }
/* 51:58 */     this.ay = this.az;
/* 52:59 */     double d1 = this.s - this.p;
/* 53:60 */     double d2 = this.u - this.r;
/* 54:61 */     float f3 = uv.a(d1 * d1 + d2 * d2) * 4.0F;
/* 55:62 */     if (f3 > 1.0F) {
/* 56:63 */       f3 = 1.0F;
/* 57:   */     }
/* 58:65 */     this.az += (f3 - this.az) * 0.4F;
/* 59:66 */     this.aA += this.az;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public boolean j_()
/* 63:   */   {
/* 64:71 */     return false;
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     xl
 * JD-Core Version:    0.7.0.1
 */