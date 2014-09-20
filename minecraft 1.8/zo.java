/*  1:   */ public class zo
/*  2:   */   extends zb
/*  3:   */ {
/*  4:   */   private xu a;
/*  5:   */   private double b;
/*  6:   */   private double c;
/*  7:   */   private double d;
/*  8:   */   private double e;
/*  9:   */   
/* 10:   */   public zo(xu paramxu, double paramDouble)
/* 11:   */   {
/* 12:15 */     this.a = paramxu;
/* 13:16 */     this.e = paramDouble;
/* 14:17 */     a(1);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a()
/* 18:   */   {
/* 19:22 */     if (this.a.ce()) {
/* 20:23 */       return false;
/* 21:   */     }
/* 22:25 */     dt localdt = this.a.cf();
/* 23:26 */     brw localbrw = abf.a(this.a, 16, 7, new brw(localdt.n(), localdt.o(), localdt.p()));
/* 24:27 */     if (localbrw == null) {
/* 25:28 */       return false;
/* 26:   */     }
/* 27:30 */     this.b = localbrw.a;
/* 28:31 */     this.c = localbrw.b;
/* 29:32 */     this.d = localbrw.c;
/* 30:33 */     return true;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean b()
/* 34:   */   {
/* 35:38 */     return !this.a.s().m();
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void c()
/* 39:   */   {
/* 40:43 */     this.a.s().a(this.b, this.c, this.d, this.e);
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zo
 * JD-Core Version:    0.7.0.1
 */