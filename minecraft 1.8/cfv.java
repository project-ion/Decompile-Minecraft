/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cfv
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   protected cfv(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8: 7 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  9: 8 */     this.v = (paramDouble4 + (Math.random() * 2.0D - 1.0D) * 0.0500000007450581D);
/* 10: 9 */     this.w = (paramDouble5 + (Math.random() * 2.0D - 1.0D) * 0.0500000007450581D);
/* 11:10 */     this.x = (paramDouble6 + (Math.random() * 2.0D - 1.0D) * 0.0500000007450581D);
/* 12:   */     
/* 13:12 */     this.ap = (this.aq = this.ar = this.V.nextFloat() * 0.3F + 0.7F);
/* 14:13 */     this.h = (this.V.nextFloat() * this.V.nextFloat() * 6.0F + 1.0F);
/* 15:   */     
/* 16:15 */     this.g = ((int)(16.0D / (this.V.nextFloat() * 0.8D + 0.2D)) + 2);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void s_()
/* 20:   */   {
/* 21:20 */     this.p = this.s;
/* 22:21 */     this.q = this.t;
/* 23:22 */     this.r = this.u;
/* 24:24 */     if (this.f++ >= this.g) {
/* 25:25 */       J();
/* 26:   */     }
/* 27:28 */     k(7 - this.f * 8 / this.g);
/* 28:   */     
/* 29:30 */     this.w += 0.004D;
/* 30:31 */     d(this.v, this.w, this.x);
/* 31:32 */     this.v *= 0.8999999761581421D;
/* 32:33 */     this.w *= 0.8999999761581421D;
/* 33:34 */     this.x *= 0.8999999761581421D;
/* 34:36 */     if (this.C)
/* 35:   */     {
/* 36:37 */       this.v *= 0.699999988079071D;
/* 37:38 */       this.x *= 0.699999988079071D;
/* 38:   */     }
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cfv
 * JD-Core Version:    0.7.0.1
 */