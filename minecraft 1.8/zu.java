/*  1:   */ public class zu
/*  2:   */   extends zb
/*  3:   */ {
/*  4:   */   private xu b;
/*  5:   */   protected double a;
/*  6:   */   private double c;
/*  7:   */   private double d;
/*  8:   */   private double e;
/*  9:   */   
/* 10:   */   public zu(xu paramxu, double paramDouble)
/* 11:   */   {
/* 12:14 */     this.b = paramxu;
/* 13:15 */     this.a = paramDouble;
/* 14:16 */     a(1);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a()
/* 18:   */   {
/* 19:21 */     if ((this.b.bc() == null) && (!this.b.au())) {
/* 20:22 */       return false;
/* 21:   */     }
/* 22:24 */     brw localbrw = abf.a(this.b, 5, 4);
/* 23:25 */     if (localbrw == null) {
/* 24:26 */       return false;
/* 25:   */     }
/* 26:28 */     this.c = localbrw.a;
/* 27:29 */     this.d = localbrw.b;
/* 28:30 */     this.e = localbrw.c;
/* 29:31 */     return true;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void c()
/* 33:   */   {
/* 34:36 */     this.b.s().a(this.c, this.d, this.e, this.a);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public boolean b()
/* 38:   */   {
/* 39:41 */     return !this.b.s().m();
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zu
 * JD-Core Version:    0.7.0.1
 */