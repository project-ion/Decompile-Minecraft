/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cii
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:   */   protected cii(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  7:   */   {
/*  8:13 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  9:14 */     this.v *= 0.300000011920929D;
/* 10:15 */     this.w = (Math.random() * 0.2000000029802322D + 0.1000000014901161D);
/* 11:16 */     this.x *= 0.300000011920929D;
/* 12:   */     
/* 13:18 */     this.ap = 1.0F;
/* 14:19 */     this.aq = 1.0F;
/* 15:20 */     this.ar = 1.0F;
/* 16:21 */     k(19 + this.V.nextInt(4));
/* 17:22 */     a(0.01F, 0.01F);
/* 18:23 */     this.i = 0.06F;
/* 19:   */     
/* 20:25 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void s_()
/* 24:   */   {
/* 25:30 */     this.p = this.s;
/* 26:31 */     this.q = this.t;
/* 27:32 */     this.r = this.u;
/* 28:   */     
/* 29:34 */     this.w -= this.i;
/* 30:35 */     d(this.v, this.w, this.x);
/* 31:36 */     this.v *= 0.9800000190734863D;
/* 32:37 */     this.w *= 0.9800000190734863D;
/* 33:38 */     this.x *= 0.9800000190734863D;
/* 34:40 */     if (this.g-- <= 0) {
/* 35:41 */       J();
/* 36:   */     }
/* 37:44 */     if (this.C)
/* 38:   */     {
/* 39:45 */       if (Math.random() < 0.5D) {
/* 40:46 */         J();
/* 41:   */       }
/* 42:48 */       this.v *= 0.699999988079071D;
/* 43:49 */       this.x *= 0.699999988079071D;
/* 44:   */     }
/* 45:52 */     dt localdt = new dt(this);
/* 46:53 */     bec localbec = this.o.p(localdt);
/* 47:54 */     atr localatr = localbec.c();
/* 48:55 */     localatr.a(this.o, localdt);
/* 49:56 */     bof localbof = localbec.c().r();
/* 50:57 */     if ((localbof.d()) || (localbof.a()))
/* 51:   */     {
/* 52:58 */       double d1 = 0.0D;
/* 53:59 */       if ((localbec.c() instanceof axl)) {
/* 54:60 */         d1 = 1.0F - axl.b(((Integer)localbec.b(axl.b)).intValue());
/* 55:   */       } else {
/* 56:62 */         d1 = localatr.C();
/* 57:   */       }
/* 58:64 */       double d2 = uv.c(this.t) + d1;
/* 59:65 */       if (this.t < d2) {
/* 60:66 */         J();
/* 61:   */       }
/* 62:   */     }
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cii
 * JD-Core Version:    0.7.0.1
 */