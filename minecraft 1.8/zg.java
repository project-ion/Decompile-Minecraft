/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class zg
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   xn a;
/*  7:   */   xm b;
/*  8:   */   float c;
/*  9:   */   
/* 10:   */   public zg(xn paramxn, float paramFloat)
/* 11:   */   {
/* 12:14 */     this.a = paramxn;
/* 13:15 */     this.c = paramFloat;
/* 14:16 */     a(5);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a()
/* 18:   */   {
/* 19:21 */     this.b = this.a.u();
/* 20:22 */     if (this.b == null) {
/* 21:23 */       return false;
/* 22:   */     }
/* 23:25 */     double d = this.a.h(this.b);
/* 24:26 */     if ((d < 4.0D) || (d > 16.0D)) {
/* 25:27 */       return false;
/* 26:   */     }
/* 27:29 */     if (!this.a.C) {
/* 28:30 */       return false;
/* 29:   */     }
/* 30:32 */     if (this.a.bb().nextInt(5) != 0) {
/* 31:33 */       return false;
/* 32:   */     }
/* 33:35 */     return true;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public boolean b()
/* 37:   */   {
/* 38:40 */     return !this.a.C;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void c()
/* 42:   */   {
/* 43:46 */     double d1 = this.b.s - this.a.s;
/* 44:47 */     double d2 = this.b.u - this.a.u;
/* 45:48 */     float f = uv.a(d1 * d1 + d2 * d2);
/* 46:49 */     this.a.v += d1 / f * 0.5D * 0.800000011920929D + this.a.v * 0.2000000029802322D;
/* 47:50 */     this.a.x += d2 / f * 0.5D * 0.800000011920929D + this.a.x * 0.2000000029802322D;
/* 48:51 */     this.a.w = this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zg
 * JD-Core Version:    0.7.0.1
 */