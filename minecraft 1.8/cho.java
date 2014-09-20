/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cho
/*  4:   */   extends cgw
/*  5:   */ {
/*  6:11 */   private static final Random a = new Random();
/*  7:13 */   private int ax = 128;
/*  8:   */   
/*  9:   */   protected cho(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 10:   */   {
/* 11:16 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.5D - a.nextDouble(), paramDouble5, 0.5D - a.nextDouble());
/* 12:17 */     this.w *= 0.2000000029802322D;
/* 13:18 */     if ((paramDouble4 == 0.0D) && (paramDouble6 == 0.0D))
/* 14:   */     {
/* 15:19 */       this.v *= 0.1000000014901161D;
/* 16:20 */       this.x *= 0.1000000014901161D;
/* 17:   */     }
/* 18:23 */     this.h *= 0.75F;
/* 19:   */     
/* 20:25 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 21:26 */     this.T = false;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(civ paramciv, wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 25:   */   {
/* 26:31 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 27:32 */     f = uv.a(f, 0.0F, 1.0F);
/* 28:   */     
/* 29:34 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void s_()
/* 33:   */   {
/* 34:39 */     this.p = this.s;
/* 35:40 */     this.q = this.t;
/* 36:41 */     this.r = this.u;
/* 37:43 */     if (this.f++ >= this.g) {
/* 38:44 */       J();
/* 39:   */     }
/* 40:47 */     k(this.ax + (7 - this.f * 8 / this.g));
/* 41:   */     
/* 42:49 */     this.w += 0.004D;
/* 43:50 */     d(this.v, this.w, this.x);
/* 44:51 */     if (this.t == this.q)
/* 45:   */     {
/* 46:52 */       this.v *= 1.1D;
/* 47:53 */       this.x *= 1.1D;
/* 48:   */     }
/* 49:55 */     this.v *= 0.9599999785423279D;
/* 50:56 */     this.w *= 0.9599999785423279D;
/* 51:57 */     this.x *= 0.9599999785423279D;
/* 52:59 */     if (this.C)
/* 53:   */     {
/* 54:60 */       this.v *= 0.699999988079071D;
/* 55:61 */       this.x *= 0.699999988079071D;
/* 56:   */     }
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void a(int paramInt)
/* 60:   */   {
/* 61:66 */     this.ax = paramInt;
/* 62:   */   }
/* 63:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cho
 * JD-Core Version:    0.7.0.1
 */