/*  1:   */ public class aba
/*  2:   */   extends aay
/*  3:   */ {
/*  4:   */   private dt f;
/*  5:   */   
/*  6:   */   public aba(xn paramxn, aqu paramaqu)
/*  7:   */   {
/*  8:24 */     super(paramxn, paramaqu);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public bpv a(dt paramdt)
/* 12:   */   {
/* 13:29 */     this.f = paramdt;
/* 14:30 */     return super.a(paramdt);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public bpv a(wv paramwv)
/* 18:   */   {
/* 19:35 */     this.f = new dt(paramwv);
/* 20:36 */     return super.a(paramwv);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean a(wv paramwv, double paramDouble)
/* 24:   */   {
/* 25:41 */     bpv localbpv = a(paramwv);
/* 26:42 */     if (localbpv != null) {
/* 27:43 */       return a(localbpv, paramDouble);
/* 28:   */     }
/* 29:45 */     this.f = new dt(paramwv);
/* 30:46 */     this.e = paramDouble;
/* 31:47 */     return true;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void k()
/* 35:   */   {
/* 36:53 */     if (m())
/* 37:   */     {
/* 38:54 */       if (this.f != null)
/* 39:   */       {
/* 40:55 */         double d = this.b.J * this.b.J;
/* 41:57 */         if ((this.b.c(this.f) < d) || ((this.b.t > this.f.o()) && (this.b.c(new dt(this.f.n(), uv.c(this.b.t), this.f.p())) < d))) {
/* 42:58 */           this.f = null;
/* 43:   */         } else {
/* 44:60 */           this.b.q().a(this.f.n(), this.f.o(), this.f.p(), this.e);
/* 45:   */         }
/* 46:   */       }
/* 47:63 */       return;
/* 48:   */     }
/* 49:65 */     super.k();
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aba
 * JD-Core Version:    0.7.0.1
 */