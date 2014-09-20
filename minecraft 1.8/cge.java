/*  1:   */ public class cge
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:17 */   private static final oa a = new oa("textures/particle/footprint.png");
/*  5:   */   private int ax;
/*  6:   */   private int ay;
/*  7:   */   private cug az;
/*  8:   */   
/*  9:   */   protected cge(cug paramcug, aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 10:   */   {
/* 11:23 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 12:24 */     this.az = paramcug;
/* 13:25 */     this.v = (this.w = this.x = 0.0D);
/* 14:26 */     this.ay = 200;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(civ paramciv, wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 18:   */   {
/* 19:31 */     float f1 = (this.ax + paramFloat1) / this.ay;
/* 20:32 */     f1 *= f1;
/* 21:   */     
/* 22:34 */     float f2 = 2.0F - f1 * 2.0F;
/* 23:35 */     if (f2 > 1.0F) {
/* 24:36 */       f2 = 1.0F;
/* 25:   */     }
/* 26:38 */     f2 *= 0.2F;
/* 27:   */     
/* 28:40 */     cjm.f();
/* 29:41 */     float f3 = 0.125F;
/* 30:   */     
/* 31:43 */     float f4 = (float)(this.s - au);
/* 32:44 */     float f5 = (float)(this.t - av);
/* 33:45 */     float f6 = (float)(this.u - aw);
/* 34:   */     
/* 35:47 */     float f7 = this.o.o(new dt(this));
/* 36:   */     
/* 37:49 */     this.az.a(a);
/* 38:50 */     cjm.l();
/* 39:51 */     cjm.b(770, 771);
/* 40:   */     
/* 41:53 */     paramciv.b();
/* 42:54 */     paramciv.a(f7, f7, f7, f2);
/* 43:55 */     paramciv.a(f4 - f3, f5, f6 + f3, 0.0D, 1.0D);
/* 44:56 */     paramciv.a(f4 + f3, f5, f6 + f3, 1.0D, 1.0D);
/* 45:57 */     paramciv.a(f4 + f3, f5, f6 - f3, 1.0D, 0.0D);
/* 46:58 */     paramciv.a(f4 - f3, f5, f6 - f3, 0.0D, 0.0D);
/* 47:59 */     ckx.a().b();
/* 48:   */     
/* 49:61 */     cjm.k();
/* 50:62 */     cjm.e();
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void s_()
/* 54:   */   {
/* 55:67 */     this.ax += 1;
/* 56:68 */     if (this.ax == this.ay) {
/* 57:69 */       J();
/* 58:   */     }
/* 59:   */   }
/* 60:   */   
/* 61:   */   public int a()
/* 62:   */   {
/* 63:75 */     return 3;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cge
 * JD-Core Version:    0.7.0.1
 */