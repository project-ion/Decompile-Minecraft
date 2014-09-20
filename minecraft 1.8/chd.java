/*  1:   */ public class chd
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   float a;
/*  5:   */   
/*  6:   */   protected chd(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  7:   */   {
/*  8:13 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  9:   */     
/* 10:15 */     float f = 2.5F;
/* 11:16 */     this.v *= 0.1000000014901161D;
/* 12:17 */     this.w *= 0.1000000014901161D;
/* 13:18 */     this.x *= 0.1000000014901161D;
/* 14:19 */     this.v += paramDouble4;
/* 15:20 */     this.w += paramDouble5;
/* 16:21 */     this.x += paramDouble6;
/* 17:   */     
/* 18:23 */     this.ap = (this.aq = this.ar = 1.0F - (float)(Math.random() * 0.300000011920929D));
/* 19:24 */     this.h *= 0.75F;
/* 20:25 */     this.h *= f;
/* 21:26 */     this.a = this.h;
/* 22:   */     
/* 23:28 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.3D)));
/* 24:29 */     this.g = ((int)(this.g * f));
/* 25:30 */     this.T = false;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(civ paramciv, wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 29:   */   {
/* 30:35 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 31:36 */     f = uv.a(f, 0.0F, 1.0F);
/* 32:   */     
/* 33:38 */     this.h = (this.a * f);
/* 34:39 */     super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void s_()
/* 38:   */   {
/* 39:44 */     this.p = this.s;
/* 40:45 */     this.q = this.t;
/* 41:46 */     this.r = this.u;
/* 42:48 */     if (this.f++ >= this.g) {
/* 43:49 */       J();
/* 44:   */     }
/* 45:52 */     k(7 - this.f * 8 / this.g);
/* 46:   */     
/* 47:54 */     d(this.v, this.w, this.x);
/* 48:55 */     this.v *= 0.9599999785423279D;
/* 49:56 */     this.w *= 0.9599999785423279D;
/* 50:57 */     this.x *= 0.9599999785423279D;
/* 51:58 */     ahd localahd = this.o.a(this, 2.0D);
/* 52:59 */     if ((localahd != null) && 
/* 53:60 */       (this.t > localahd.aQ().b))
/* 54:   */     {
/* 55:61 */       this.t += (localahd.aQ().b - this.t) * 0.2D;
/* 56:62 */       this.w += (localahd.w - this.w) * 0.2D;
/* 57:63 */       b(this.s, this.t, this.u);
/* 58:   */     }
/* 59:67 */     if (this.C)
/* 60:   */     {
/* 61:68 */       this.v *= 0.699999988079071D;
/* 62:69 */       this.x *= 0.699999988079071D;
/* 63:   */     }
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     chd
 * JD-Core Version:    0.7.0.1
 */