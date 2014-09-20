/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class chw
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   protected chw(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8: 9 */     super(paramaqu, paramDouble1, paramDouble2 - 0.125D, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  9:   */     
/* 10:11 */     this.ap = 0.4F;
/* 11:12 */     this.aq = 0.4F;
/* 12:13 */     this.ar = 0.7F;
/* 13:14 */     k(0);
/* 14:15 */     a(0.01F, 0.01F);
/* 15:   */     
/* 16:17 */     this.h *= (this.V.nextFloat() * 0.6F + 0.2F);
/* 17:   */     
/* 18:19 */     this.v = (paramDouble4 * 0.0D);
/* 19:20 */     this.w = (paramDouble5 * 0.0D);
/* 20:21 */     this.x = (paramDouble6 * 0.0D);
/* 21:   */     
/* 22:23 */     this.g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void s_()
/* 26:   */   {
/* 27:28 */     this.p = this.s;
/* 28:29 */     this.q = this.t;
/* 29:30 */     this.r = this.u;
/* 30:   */     
/* 31:32 */     d(this.v, this.w, this.x);
/* 32:34 */     if (this.o.p(new dt(this)).c().r() != bof.h) {
/* 33:35 */       J();
/* 34:   */     }
/* 35:38 */     if (this.g-- <= 0) {
/* 36:39 */       J();
/* 37:   */     }
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     chw
 * JD-Core Version:    0.7.0.1
 */