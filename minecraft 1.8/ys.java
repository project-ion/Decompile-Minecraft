/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ys
/*  4:   */   extends yv
/*  5:   */ {
/*  6:   */   private int g;
/*  7:14 */   private int h = -1;
/*  8:   */   
/*  9:   */   public ys(xn paramxn)
/* 10:   */   {
/* 11:17 */     super(paramxn);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean a()
/* 15:   */   {
/* 16:22 */     if (!super.a()) {
/* 17:23 */       return false;
/* 18:   */     }
/* 19:25 */     if (!this.a.o.Q().b("mobGriefing")) {
/* 20:26 */       return false;
/* 21:   */     }
/* 22:28 */     return !avf.f(this.a.o, this.b);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void c()
/* 26:   */   {
/* 27:33 */     super.c();
/* 28:34 */     this.g = 0;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean b()
/* 32:   */   {
/* 33:39 */     double d = this.a.b(this.b);
/* 34:40 */     return (this.g <= 240) && (!avf.f(this.a.o, this.b)) && (d < 4.0D);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void d()
/* 38:   */   {
/* 39:45 */     super.d();
/* 40:46 */     this.a.o.c(this.a.F(), this.b, -1);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void e()
/* 44:   */   {
/* 45:51 */     super.e();
/* 46:52 */     if (this.a.bb().nextInt(20) == 0) {
/* 47:53 */       this.a.o.b(1010, this.b, 0);
/* 48:   */     }
/* 49:56 */     this.g += 1;
/* 50:   */     
/* 51:58 */     int i = (int)(this.g / 240.0F * 10.0F);
/* 52:59 */     if (i != this.h)
/* 53:   */     {
/* 54:60 */       this.a.o.c(this.a.F(), this.b, i);
/* 55:61 */       this.h = i;
/* 56:   */     }
/* 57:64 */     if ((this.g == 240) && 
/* 58:65 */       (this.a.o.aa() == vt.d))
/* 59:   */     {
/* 60:66 */       this.a.o.g(this.b);
/* 61:67 */       this.a.o.b(1012, this.b, 0);
/* 62:68 */       this.a.o.b(2001, this.b, atr.a(this.c));
/* 63:   */     }
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ys
 * JD-Core Version:    0.7.0.1
 */