/*  1:   */ public class zp
/*  2:   */   extends zb
/*  3:   */ {
/*  4:   */   private xu a;
/*  5:   */   private xm b;
/*  6:   */   private double c;
/*  7:   */   private double d;
/*  8:   */   private double e;
/*  9:   */   private double f;
/* 10:   */   private float g;
/* 11:   */   
/* 12:   */   public zp(xu paramxu, double paramDouble, float paramFloat)
/* 13:   */   {
/* 14:17 */     this.a = paramxu;
/* 15:18 */     this.f = paramDouble;
/* 16:19 */     this.g = paramFloat;
/* 17:20 */     a(1);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a()
/* 21:   */   {
/* 22:25 */     this.b = this.a.u();
/* 23:26 */     if (this.b == null) {
/* 24:27 */       return false;
/* 25:   */     }
/* 26:29 */     if (this.b.h(this.a) > this.g * this.g) {
/* 27:30 */       return false;
/* 28:   */     }
/* 29:32 */     brw localbrw = abf.a(this.a, 16, 7, new brw(this.b.s, this.b.t, this.b.u));
/* 30:33 */     if (localbrw == null) {
/* 31:34 */       return false;
/* 32:   */     }
/* 33:36 */     this.c = localbrw.a;
/* 34:37 */     this.d = localbrw.b;
/* 35:38 */     this.e = localbrw.c;
/* 36:39 */     return true;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean b()
/* 40:   */   {
/* 41:44 */     return (!this.a.s().m()) && (this.b.ai()) && (this.b.h(this.a) < this.g * this.g);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void d()
/* 45:   */   {
/* 46:49 */     this.b = null;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void c()
/* 50:   */   {
/* 51:54 */     this.a.s().a(this.c, this.d, this.e, this.f);
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zp
 * JD-Core Version:    0.7.0.1
 */