/*  1:   */ public class zq
/*  2:   */   extends zb
/*  3:   */ {
/*  4:   */   aqu a;
/*  5:   */   xn b;
/*  6:   */   xm c;
/*  7:   */   int d;
/*  8:   */   
/*  9:   */   public zq(xn paramxn)
/* 10:   */   {
/* 11:18 */     this.b = paramxn;
/* 12:19 */     this.a = paramxn.o;
/* 13:20 */     a(3);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean a()
/* 17:   */   {
/* 18:25 */     xm localxm = this.b.u();
/* 19:26 */     if (localxm == null) {
/* 20:27 */       return false;
/* 21:   */     }
/* 22:29 */     this.c = localxm;
/* 23:30 */     return true;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean b()
/* 27:   */   {
/* 28:35 */     if (!this.c.ai()) {
/* 29:36 */       return false;
/* 30:   */     }
/* 31:38 */     if (this.b.h(this.c) > 225.0D) {
/* 32:39 */       return false;
/* 33:   */     }
/* 34:41 */     return (!this.b.s().m()) || (a());
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void d()
/* 38:   */   {
/* 39:46 */     this.c = null;
/* 40:47 */     this.b.s().n();
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void e()
/* 44:   */   {
/* 45:52 */     this.b.p().a(this.c, 30.0F, 30.0F);
/* 46:   */     
/* 47:54 */     double d1 = this.b.J * 2.0F * (this.b.J * 2.0F);
/* 48:55 */     double d2 = this.b.e(this.c.s, this.c.aQ().b, this.c.u);
/* 49:   */     
/* 50:57 */     double d3 = 0.8D;
/* 51:58 */     if ((d2 > d1) && (d2 < 16.0D)) {
/* 52:59 */       d3 = 1.33D;
/* 53:60 */     } else if (d2 < 225.0D) {
/* 54:61 */       d3 = 0.6D;
/* 55:   */     }
/* 56:64 */     this.b.s().a(this.c, d3);
/* 57:   */     
/* 58:66 */     this.d = Math.max(this.d - 1, 0);
/* 59:68 */     if (d2 > d1) {
/* 60:69 */       return;
/* 61:   */     }
/* 62:71 */     if (this.d > 0) {
/* 63:72 */       return;
/* 64:   */     }
/* 65:74 */     this.d = 20;
/* 66:75 */     this.b.r(this.c);
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zq
 * JD-Core Version:    0.7.0.1
 */