/*  1:   */ public class avm
/*  2:   */   extends ave
/*  3:   */ {
/*  4:13 */   private final eo O = new eg();
/*  5:   */   
/*  6:   */   protected eo a(amj paramamj)
/*  7:   */   {
/*  8:17 */     return this.O;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public bcm a(aqu paramaqu, int paramInt)
/* 12:   */   {
/* 13:22 */     return new bcy();
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void d(aqu paramaqu, dt paramdt)
/* 17:   */   {
/* 18:27 */     ea localea = new ea(paramaqu, paramdt);
/* 19:28 */     bcx localbcx = (bcx)localea.h();
/* 20:29 */     if (localbcx == null) {
/* 21:30 */       return;
/* 22:   */     }
/* 23:33 */     int i = localbcx.m();
/* 24:34 */     if (i < 0)
/* 25:   */     {
/* 26:35 */       paramaqu.b(1001, paramdt, 0);
/* 27:36 */       return;
/* 28:   */     }
/* 29:39 */     amj localamj1 = localbcx.a(i);
/* 30:40 */     if (localamj1 == null) {
/* 31:41 */       return;
/* 32:   */     }
/* 33:44 */     ej localej = (ej)paramaqu.p(paramdt).b(a);
/* 34:45 */     dt localdt = paramdt.a(localej);
/* 35:46 */     vq localvq = bde.b(paramaqu, localdt.n(), localdt.o(), localdt.p());
/* 36:   */     amj localamj2;
/* 37:49 */     if (localvq == null)
/* 38:   */     {
/* 39:50 */       localamj2 = this.O.a(localea, localamj1);
/* 40:51 */       if ((localamj2 != null) && (localamj2.b == 0)) {
/* 41:52 */         localamj2 = null;
/* 42:   */       }
/* 43:   */     }
/* 44:   */     else
/* 45:   */     {
/* 46:55 */       localamj2 = bde.a(localvq, localamj1.k().a(1), localej.d());
/* 47:57 */       if (localamj2 == null)
/* 48:   */       {
/* 49:58 */         localamj2 = localamj1.k();
/* 50:59 */         if (--localamj2.b == 0) {
/* 51:60 */           localamj2 = null;
/* 52:   */         }
/* 53:   */       }
/* 54:   */       else
/* 55:   */       {
/* 56:64 */         localamj2 = localamj1.k();
/* 57:   */       }
/* 58:   */     }
/* 59:68 */     localbcx.a(i, localamj2);
/* 60:   */   }
/* 61:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avm
 * JD-Core Version:    0.7.0.1
 */