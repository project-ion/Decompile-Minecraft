/*  1:   */ public class aai
/*  2:   */   extends zf
/*  3:   */ {
/*  4:   */   private int e;
/*  5:   */   private agp f;
/*  6:   */   
/*  7:   */   public aai(agp paramagp)
/*  8:   */   {
/*  9:16 */     super(paramagp, agp.class, 3.0F, 0.02F);
/* 10:17 */     this.f = paramagp;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void c()
/* 14:   */   {
/* 15:22 */     super.c();
/* 16:24 */     if ((this.f.cq()) && ((this.b instanceof agp)) && (((agp)this.b).cr())) {
/* 17:25 */       this.e = 10;
/* 18:   */     } else {
/* 19:27 */       this.e = 0;
/* 20:   */     }
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void e()
/* 24:   */   {
/* 25:33 */     super.e();
/* 26:35 */     if (this.e > 0)
/* 27:   */     {
/* 28:36 */       this.e -= 1;
/* 29:38 */       if (this.e == 0)
/* 30:   */       {
/* 31:40 */         wa localwa = this.f.co();
/* 32:41 */         for (int i = 0; i < localwa.n_(); i++)
/* 33:   */         {
/* 34:42 */           amj localamj1 = localwa.a(i);
/* 35:43 */           amj localamj2 = null;
/* 36:45 */           if (localamj1 != null)
/* 37:   */           {
/* 38:46 */             alq localalq = localamj1.b();
/* 39:   */             int j;
/* 40:48 */             if (((localalq == amk.P) || (localalq == amk.bS) || (localalq == amk.bR)) && (localamj1.b > 3))
/* 41:   */             {
/* 42:49 */               j = localamj1.b / 2;
/* 43:50 */               localamj1.b -= j;
/* 44:51 */               localamj2 = new amj(localalq, j, localamj1.i());
/* 45:   */             }
/* 46:52 */             else if ((localalq == amk.O) && (localamj1.b > 5))
/* 47:   */             {
/* 48:53 */               j = localamj1.b / 2 / 3 * 3;
/* 49:54 */               int k = j / 3;
/* 50:55 */               localamj1.b -= j;
/* 51:56 */               localamj2 = new amj(amk.P, k, 0);
/* 52:   */             }
/* 53:58 */             if (localamj1.b <= 0) {
/* 54:59 */               localwa.a(i, null);
/* 55:   */             }
/* 56:   */           }
/* 57:62 */           if (localamj2 != null)
/* 58:   */           {
/* 59:63 */             double d = this.f.t - 0.300000011920929D + this.f.aR();
/* 60:64 */             adw localadw = new adw(this.f.o, this.f.s, d, this.f.u, localamj2);
/* 61:65 */             float f1 = 0.3F;
/* 62:66 */             float f2 = this.f.aI;
/* 63:67 */             float f3 = this.f.z;
/* 64:68 */             localadw.v = (-uv.a(f2 / 180.0F * 3.141593F) * uv.b(f3 / 180.0F * 3.141593F) * f1);
/* 65:69 */             localadw.x = (uv.b(f2 / 180.0F * 3.141593F) * uv.b(f3 / 180.0F * 3.141593F) * f1);
/* 66:70 */             localadw.w = (-uv.a(f3 / 180.0F * 3.141593F) * f1 + 0.1F);
/* 67:71 */             localadw.p();
/* 68:   */             
/* 69:73 */             this.f.o.d(localadw);
/* 70:   */             
/* 71:75 */             break;
/* 72:   */           }
/* 73:   */         }
/* 74:   */       }
/* 75:   */     }
/* 76:   */   }
/* 77:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aai
 * JD-Core Version:    0.7.0.1
 */