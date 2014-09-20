/*  1:   */ public class amz
/*  2:   */   extends alq
/*  3:   */ {
/*  4:   */   public amz()
/*  5:   */   {
/*  6:12 */     a(akf.d);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 10:   */   {
/* 11:17 */     boolean bool = paramaqu.p(paramdt).c().f(paramaqu, paramdt);
/* 12:18 */     dt localdt = bool ? paramdt : paramdt.a(paramej);
/* 13:20 */     if (!paramahd.a(localdt, paramej, paramamj)) {
/* 14:21 */       return false;
/* 15:   */     }
/* 16:24 */     atr localatr = paramaqu.p(localdt).c();
/* 17:25 */     if (!paramaqu.a(localatr, localdt, false, paramej, null, paramamj)) {
/* 18:26 */       return false;
/* 19:   */     }
/* 20:29 */     if (aty.af.c(paramaqu, localdt))
/* 21:   */     {
/* 22:30 */       paramamj.b -= 1;
/* 23:31 */       paramaqu.a(localdt, aty.af.P());
/* 24:32 */       return true;
/* 25:   */     }
/* 26:35 */     return false;
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     amz
 * JD-Core Version:    0.7.0.1
 */