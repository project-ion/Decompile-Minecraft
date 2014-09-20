/*  1:   */ public class abx
/*  2:   */   extends abs
/*  3:   */ {
/*  4:   */   public abx(aqu paramaqu)
/*  5:   */   {
/*  6:14 */     super(paramaqu);
/*  7:15 */     a(0.9F, 1.3F);
/*  8:16 */     this.bl = aty.bw;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean a(ahd paramahd)
/* 12:   */   {
/* 13:21 */     amj localamj = paramahd.bg.h();
/* 14:22 */     if ((localamj != null) && (localamj.b() == amk.z) && (l() >= 0))
/* 15:   */     {
/* 16:23 */       if (localamj.b == 1)
/* 17:   */       {
/* 18:24 */         paramahd.bg.a(paramahd.bg.c, new amj(amk.A));
/* 19:25 */         return true;
/* 20:   */       }
/* 21:28 */       if ((paramahd.bg.a(new amj(amk.A))) && (!paramahd.by.d))
/* 22:   */       {
/* 23:29 */         paramahd.bg.a(paramahd.bg.c, 1);
/* 24:30 */         return true;
/* 25:   */       }
/* 26:   */     }
/* 27:33 */     if ((localamj != null) && (localamj.b() == amk.be) && (l() >= 0))
/* 28:   */     {
/* 29:34 */       J();
/* 30:35 */       this.o.a(ew.b, this.s, this.t + this.K / 2.0F, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
/* 31:36 */       if (!this.o.D)
/* 32:   */       {
/* 33:37 */         abs localabs = new abs(this.o);
/* 34:38 */         localabs.b(this.s, this.t, this.u, this.y, this.z);
/* 35:39 */         localabs.h(bm());
/* 36:40 */         localabs.aG = this.aG;
/* 37:41 */         if (k_()) {
/* 38:42 */           localabs.a(aL());
/* 39:   */         }
/* 40:44 */         this.o.d(localabs);
/* 41:45 */         for (int i = 0; i < 5; i++) {
/* 42:46 */           this.o.d(new adw(this.o, this.s, this.t + this.K, this.u, new amj(aty.Q)));
/* 43:   */         }
/* 44:48 */         localamj.a(1, paramahd);
/* 45:49 */         a("mob.sheep.shear", 1.0F, 1.0F);
/* 46:   */       }
/* 47:51 */       return true;
/* 48:   */     }
/* 49:53 */     return super.a(paramahd);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public abx c(ws paramws)
/* 53:   */   {
/* 54:58 */     return new abx(this.o);
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     abx
 * JD-Core Version:    0.7.0.1
 */