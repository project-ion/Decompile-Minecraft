/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class yx
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private xu a;
/*  7:   */   private double b;
/*  8:   */   private double c;
/*  9:   */   private double d;
/* 10:   */   private double e;
/* 11:   */   private aqu f;
/* 12:   */   
/* 13:   */   public yx(xu paramxu, double paramDouble)
/* 14:   */   {
/* 15:18 */     this.a = paramxu;
/* 16:19 */     this.e = paramDouble;
/* 17:20 */     this.f = paramxu.o;
/* 18:21 */     a(1);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public boolean a()
/* 22:   */   {
/* 23:26 */     if (!this.f.w()) {
/* 24:27 */       return false;
/* 25:   */     }
/* 26:29 */     if (!this.a.au()) {
/* 27:30 */       return false;
/* 28:   */     }
/* 29:32 */     if (!this.f.i(new dt(this.a.s, this.a.aQ().b, this.a.u))) {
/* 30:33 */       return false;
/* 31:   */     }
/* 32:36 */     brw localbrw = f();
/* 33:37 */     if (localbrw == null) {
/* 34:38 */       return false;
/* 35:   */     }
/* 36:40 */     this.b = localbrw.a;
/* 37:41 */     this.c = localbrw.b;
/* 38:42 */     this.d = localbrw.c;
/* 39:43 */     return true;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean b()
/* 43:   */   {
/* 44:48 */     return !this.a.s().m();
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void c()
/* 48:   */   {
/* 49:53 */     this.a.s().a(this.b, this.c, this.d, this.e);
/* 50:   */   }
/* 51:   */   
/* 52:   */   private brw f()
/* 53:   */   {
/* 54:57 */     Random localRandom = this.a.bb();
/* 55:58 */     dt localdt1 = new dt(this.a.s, this.a.aQ().b, this.a.u);
/* 56:60 */     for (int i = 0; i < 10; i++)
/* 57:   */     {
/* 58:61 */       dt localdt2 = localdt1.a(localRandom.nextInt(20) - 10, localRandom.nextInt(6) - 3, localRandom.nextInt(20) - 10);
/* 59:63 */       if ((!this.f.i(localdt2)) && (this.a.a(localdt2) < 0.0F)) {
/* 60:64 */         return new brw(localdt2.n(), localdt2.o(), localdt2.p());
/* 61:   */       }
/* 62:   */     }
/* 63:67 */     return null;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     yx
 * JD-Core Version:    0.7.0.1
 */