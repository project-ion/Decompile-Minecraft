/*  1:   */ public abstract class yv
/*  2:   */   extends zb
/*  3:   */ {
/*  4:   */   protected xn a;
/*  5:14 */   protected dt b = dt.a;
/*  6:   */   protected avf c;
/*  7:   */   boolean d;
/*  8:   */   float e;
/*  9:   */   float f;
/* 10:   */   
/* 11:   */   public yv(xn paramxn)
/* 12:   */   {
/* 13:20 */     this.a = paramxn;
/* 14:21 */     if (!(paramxn.s() instanceof aay)) {
/* 15:22 */       throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
/* 16:   */     }
/* 17:   */   }
/* 18:   */   
/* 19:   */   public boolean a()
/* 20:   */   {
/* 21:28 */     if (!this.a.D) {
/* 22:29 */       return false;
/* 23:   */     }
/* 24:31 */     aay localaay = (aay)this.a.s();
/* 25:32 */     bpv localbpv = localaay.j();
/* 26:33 */     if ((localbpv == null) || (localbpv.b()) || (!localaay.g())) {
/* 27:34 */       return false;
/* 28:   */     }
/* 29:37 */     for (int i = 0; i < Math.min(localbpv.e() + 2, localbpv.d()); i++)
/* 30:   */     {
/* 31:38 */       bpt localbpt = localbpv.a(i);
/* 32:39 */       this.b = new dt(localbpt.a, localbpt.b + 1, localbpt.c);
/* 33:40 */       if (this.a.e(this.b.n(), this.a.t, this.b.p()) <= 2.25D)
/* 34:   */       {
/* 35:43 */         this.c = a(this.b);
/* 36:44 */         if (this.c != null) {
/* 37:47 */           return true;
/* 38:   */         }
/* 39:   */       }
/* 40:   */     }
/* 41:50 */     this.b = new dt(this.a).a();
/* 42:51 */     this.c = a(this.b);
/* 43:52 */     return this.c != null;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public boolean b()
/* 47:   */   {
/* 48:57 */     return !this.d;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void c()
/* 52:   */   {
/* 53:62 */     this.d = false;
/* 54:63 */     this.e = ((float)(this.b.n() + 0.5F - this.a.s));
/* 55:64 */     this.f = ((float)(this.b.p() + 0.5F - this.a.u));
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void e()
/* 59:   */   {
/* 60:69 */     float f1 = (float)(this.b.n() + 0.5F - this.a.s);
/* 61:70 */     float f2 = (float)(this.b.p() + 0.5F - this.a.u);
/* 62:71 */     float f3 = this.e * f1 + this.f * f2;
/* 63:72 */     if (f3 < 0.0F) {
/* 64:73 */       this.d = true;
/* 65:   */     }
/* 66:   */   }
/* 67:   */   
/* 68:   */   private avf a(dt paramdt)
/* 69:   */   {
/* 70:78 */     atr localatr = this.a.o.p(paramdt).c();
/* 71:79 */     if (((localatr instanceof avf)) && (localatr.r() == bof.d)) {
/* 72:80 */       return (avf)localatr;
/* 73:   */     }
/* 74:82 */     return null;
/* 75:   */   }
/* 76:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     yv
 * JD-Core Version:    0.7.0.1
 */