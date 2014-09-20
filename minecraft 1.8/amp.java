/*  1:   */ public class amp
/*  2:   */   extends alq
/*  3:   */ {
/*  4:14 */   private static final eo a = new amq();
/*  5:   */   private final adz b;
/*  6:   */   
/*  7:   */   public amp(adz paramadz)
/*  8:   */   {
/*  9:70 */     this.h = 1;
/* 10:71 */     this.b = paramadz;
/* 11:72 */     a(akf.e);
/* 12:73 */     ave.M.a(this, a);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 16:   */   {
/* 17:78 */     bec localbec = paramaqu.p(paramdt);
/* 18:79 */     if (ati.d(localbec))
/* 19:   */     {
/* 20:80 */       if (!paramaqu.D)
/* 21:   */       {
/* 22:81 */         atl localatl = (localbec.c() instanceof ati) ? (atl)localbec.b(((ati)localbec.c()).l()) : atl.a;
/* 23:82 */         double d = 0.0D;
/* 24:83 */         if (localatl.c()) {
/* 25:84 */           d = 0.5D;
/* 26:   */         }
/* 27:86 */         adx localadx = adx.a(paramaqu, paramdt.n() + 0.5D, paramdt.o() + 0.0625D + d, paramdt.p() + 0.5D, this.b);
/* 28:87 */         if (paramamj.s()) {
/* 29:88 */           localadx.a(paramamj.q());
/* 30:   */         }
/* 31:90 */         paramaqu.d(localadx);
/* 32:   */       }
/* 33:92 */       paramamj.b -= 1;
/* 34:93 */       return true;
/* 35:   */     }
/* 36:95 */     return false;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     amp
 * JD-Core Version:    0.7.0.1
 */