/*  1:   */ public class anp
/*  2:   */   extends ann
/*  3:   */ {
/*  4:   */   public anp(atr paramatr)
/*  5:   */   {
/*  6:16 */     super(paramatr, false);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 10:   */   {
/* 11:21 */     bru localbru = a(paramaqu, paramahd, true);
/* 12:22 */     if (localbru == null) {
/* 13:23 */       return paramamj;
/* 14:   */     }
/* 15:26 */     if (localbru.a == brv.b)
/* 16:   */     {
/* 17:27 */       dt localdt1 = localbru.a();
/* 18:29 */       if (!paramaqu.a(paramahd, localdt1)) {
/* 19:30 */         return paramamj;
/* 20:   */       }
/* 21:32 */       if (!paramahd.a(localdt1.a(localbru.b), localbru.b, paramamj)) {
/* 22:33 */         return paramamj;
/* 23:   */       }
/* 24:36 */       dt localdt2 = localdt1.a();
/* 25:37 */       bec localbec = paramaqu.p(localdt1);
/* 26:38 */       if ((localbec.c().r() == bof.h) && (((Integer)localbec.b(axl.b)).intValue() == 0) && (paramaqu.d(localdt2)))
/* 27:   */       {
/* 28:39 */         paramaqu.a(localdt2, aty.bx.P());
/* 29:40 */         if (!paramahd.by.d) {
/* 30:41 */           paramamj.b -= 1;
/* 31:   */         }
/* 32:43 */         paramahd.b(ty.J[alq.b(this)]);
/* 33:   */       }
/* 34:   */     }
/* 35:46 */     return paramamj;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public int a(amj paramamj, int paramInt)
/* 39:   */   {
/* 40:51 */     return aty.bx.h(aty.bx.a(paramamj.i()));
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     anp
 * JD-Core Version:    0.7.0.1
 */