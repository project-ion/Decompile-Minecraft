/*  1:   */ final class atn
/*  2:   */   implements Runnable
/*  3:   */ {
/*  4:   */   atn(aqu paramaqu, dt paramdt) {}
/*  5:   */   
/*  6:   */   public void run()
/*  7:   */   {
/*  8:90 */     bfh localbfh = this.a.f(this.b);
/*  9:91 */     for (int i = this.b.o() - 1; i >= 0; i--)
/* 10:   */     {
/* 11:92 */       dt localdt = new dt(this.b.n(), i, this.b.p());
/* 12:93 */       if (!localbfh.d(localdt)) {
/* 13:   */         break;
/* 14:   */       }
/* 15:94 */       bec localbec = this.a.p(localdt);
/* 16:95 */       if (localbec.c() == aty.bY) {
/* 17:96 */         ((qt)this.a).a(new ato(this, localdt));
/* 18:   */       }
/* 19:   */     }
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     atn
 * JD-Core Version:    0.7.0.1
 */