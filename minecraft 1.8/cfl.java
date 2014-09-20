/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cfl
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   protected cfl(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8: 9 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  9:   */     
/* 10:11 */     this.ap = 1.0F;
/* 11:12 */     this.aq = 1.0F;
/* 12:13 */     this.ar = 1.0F;
/* 13:14 */     k(32);
/* 14:15 */     a(0.02F, 0.02F);
/* 15:   */     
/* 16:17 */     this.h *= (this.V.nextFloat() * 0.6F + 0.2F);
/* 17:   */     
/* 18:19 */     this.v = (paramDouble4 * 0.2000000029802322D + (Math.random() * 2.0D - 1.0D) * 0.01999999955296516D);
/* 19:20 */     this.w = (paramDouble5 * 0.2000000029802322D + (Math.random() * 2.0D - 1.0D) * 0.01999999955296516D);
/* 20:21 */     this.x = (paramDouble6 * 0.2000000029802322D + (Math.random() * 2.0D - 1.0D) * 0.01999999955296516D);
/* 21:   */     
/* 22:23 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void s_()
/* 26:   */   {
/* 27:28 */     this.p = this.s;
/* 28:29 */     this.q = this.t;
/* 29:30 */     this.r = this.u;
/* 30:   */     
/* 31:32 */     this.w += 0.002D;
/* 32:33 */     d(this.v, this.w, this.x);
/* 33:34 */     this.v *= 0.8500000238418579D;
/* 34:35 */     this.w *= 0.8500000238418579D;
/* 35:36 */     this.x *= 0.8500000238418579D;
/* 36:38 */     if (this.o.p(new dt(this)).c().r() != bof.h) {
/* 37:39 */       J();
/* 38:   */     }
/* 39:42 */     if (this.g-- <= 0) {
/* 40:43 */       J();
/* 41:   */     }
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cfl
 * JD-Core Version:    0.7.0.1
 */