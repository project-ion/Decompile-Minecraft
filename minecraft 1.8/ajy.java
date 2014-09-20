/*  1:   */ public class ajy
/*  2:   */   extends alq
/*  3:   */ {
/*  4:   */   public ajy()
/*  5:   */   {
/*  6:12 */     a(akf.k);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 10:   */   {
/* 11:17 */     bru localbru = a(paramaqu, paramahd, true);
/* 12:18 */     if (localbru == null) {
/* 13:19 */       return paramamj;
/* 14:   */     }
/* 15:22 */     if (localbru.a == brv.b)
/* 16:   */     {
/* 17:23 */       dt localdt = localbru.a();
/* 18:25 */       if (!paramaqu.a(paramahd, localdt)) {
/* 19:26 */         return paramamj;
/* 20:   */       }
/* 21:28 */       if (!paramahd.a(localdt.a(localbru.b), localbru.b, paramamj)) {
/* 22:29 */         return paramamj;
/* 23:   */       }
/* 24:31 */       if (paramaqu.p(localdt).c().r() == bof.h)
/* 25:   */       {
/* 26:32 */         paramamj.b -= 1;
/* 27:33 */         paramahd.b(ty.J[alq.b(this)]);
/* 28:34 */         if (paramamj.b <= 0) {
/* 29:35 */           return new amj(amk.bz);
/* 30:   */         }
/* 31:37 */         if (!paramahd.bg.a(new amj(amk.bz))) {
/* 32:38 */           paramahd.a(new amj(amk.bz, 1, 0), false);
/* 33:   */         }
/* 34:   */       }
/* 35:   */     }
/* 36:44 */     return paramamj;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajy
 * JD-Core Version:    0.7.0.1
 */