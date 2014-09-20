/*  1:   */ public class chm
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   float a;
/*  5:   */   
/*  6:   */   protected chm(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8:10 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 1.0F);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected chm(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat)
/* 12:   */   {
/* 13:16 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 14:17 */     this.v *= 0.1000000014901161D;
/* 15:18 */     this.w *= 0.1000000014901161D;
/* 16:19 */     this.x *= 0.1000000014901161D;
/* 17:20 */     this.v += paramDouble4;
/* 18:21 */     this.w += paramDouble5;
/* 19:22 */     this.x += paramDouble6;
/* 20:   */     
/* 21:24 */     this.ap = (this.aq = this.ar = 1.0F - (float)(Math.random() * 0.300000011920929D));
/* 22:25 */     this.h *= 0.75F;
/* 23:26 */     this.h *= paramFloat;
/* 24:27 */     this.a = this.h;
/* 25:   */     
/* 26:29 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 27:30 */     this.g = ((int)(this.g * paramFloat));
/* 28:31 */     this.T = false;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(civ paramciv, wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 32:   */   {
/* 33:36 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 34:37 */     f = uv.a(f, 0.0F, 1.0F);
/* 35:   */     
/* 36:39 */     this.h = (this.a * f);
/* 37:40 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void s_()
/* 41:   */   {
/* 42:45 */     this.p = this.s;
/* 43:46 */     this.q = this.t;
/* 44:47 */     this.r = this.u;
/* 45:49 */     if (this.f++ >= this.g) {
/* 46:50 */       J();
/* 47:   */     }
/* 48:53 */     k(7 - this.f * 8 / this.g);
/* 49:   */     
/* 50:55 */     this.w -= 0.03D;
/* 51:56 */     d(this.v, this.w, this.x);
/* 52:57 */     this.v *= 0.9900000095367432D;
/* 53:58 */     this.w *= 0.9900000095367432D;
/* 54:59 */     this.x *= 0.9900000095367432D;
/* 55:61 */     if (this.C)
/* 56:   */     {
/* 57:62 */       this.v *= 0.699999988079071D;
/* 58:63 */       this.x *= 0.699999988079071D;
/* 59:   */     }
/* 60:   */   }
/* 61:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     chm
 * JD-Core Version:    0.7.0.1
 */