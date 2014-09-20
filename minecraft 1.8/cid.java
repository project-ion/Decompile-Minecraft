/*  1:   */ public class cid
/*  2:   */   extends cgw
/*  3:   */ {
/*  4:   */   private bec a;
/*  5:   */   
/*  6:   */   protected cid(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, bec parambec)
/*  7:   */   {
/*  8:17 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  9:18 */     this.a = parambec;
/* 10:19 */     a(bsu.z().ab().a().a(parambec));
/* 11:20 */     this.i = parambec.c().I;
/* 12:21 */     this.ap = (this.aq = this.ar = 0.6F);
/* 13:22 */     this.h /= 2.0F;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public cid a(dt paramdt)
/* 17:   */   {
/* 18:27 */     if (this.a.c() == aty.c) {
/* 19:28 */       return this;
/* 20:   */     }
/* 21:30 */     int i = this.a.c().d(this.o, paramdt);
/* 22:31 */     this.ap *= (i >> 16 & 0xFF) / 255.0F;
/* 23:32 */     this.aq *= (i >> 8 & 0xFF) / 255.0F;
/* 24:33 */     this.ar *= (i & 0xFF) / 255.0F;
/* 25:34 */     return this;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public cid l()
/* 29:   */   {
/* 30:39 */     atr localatr = this.a.c();
/* 31:40 */     if (localatr == aty.c) {
/* 32:41 */       return this;
/* 33:   */     }
/* 34:43 */     int i = localatr.h(this.a);
/* 35:44 */     this.ap *= (i >> 16 & 0xFF) / 255.0F;
/* 36:45 */     this.aq *= (i >> 8 & 0xFF) / 255.0F;
/* 37:46 */     this.ar *= (i & 0xFF) / 255.0F;
/* 38:47 */     return this;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int a()
/* 42:   */   {
/* 43:52 */     return 1;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void a(civ paramciv, wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 47:   */   {
/* 48:57 */     float f1 = (this.b + this.d / 4.0F) / 16.0F;
/* 49:58 */     float f2 = f1 + 0.01560938F;
/* 50:59 */     float f3 = (this.c + this.e / 4.0F) / 16.0F;
/* 51:60 */     float f4 = f3 + 0.01560938F;
/* 52:61 */     float f5 = 0.1F * this.h;
/* 53:63 */     if (this.at != null)
/* 54:   */     {
/* 55:64 */       f1 = this.at.a(this.d / 4.0F * 16.0F);
/* 56:65 */       f2 = this.at.a((this.d + 1.0F) / 4.0F * 16.0F);
/* 57:66 */       f3 = this.at.b(this.e / 4.0F * 16.0F);
/* 58:67 */       f4 = this.at.b((this.e + 1.0F) / 4.0F * 16.0F);
/* 59:   */     }
/* 60:70 */     float f6 = (float)(this.p + (this.s - this.p) * paramFloat1 - au);
/* 61:71 */     float f7 = (float)(this.q + (this.t - this.q) * paramFloat1 - av);
/* 62:72 */     float f8 = (float)(this.r + (this.u - this.r) * paramFloat1 - aw);
/* 63:73 */     paramciv.b(this.ap, this.aq, this.ar);
/* 64:   */     
/* 65:75 */     paramciv.a(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/* 66:76 */     paramciv.a(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/* 67:77 */     paramciv.a(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/* 68:78 */     paramciv.a(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cid
 * JD-Core Version:    0.7.0.1
 */