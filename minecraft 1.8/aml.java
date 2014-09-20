/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class aml
/*  4:   */   extends alq
/*  5:   */ {
/*  6:   */   public aml()
/*  7:   */   {
/*  8:17 */     a(akf.i);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 12:   */   {
/* 13:22 */     atr localatr = paramaqu.p(paramdt).c();
/* 14:23 */     if ((localatr instanceof avv))
/* 15:   */     {
/* 16:24 */       if (paramaqu.D) {
/* 17:25 */         return true;
/* 18:   */       }
/* 19:28 */       a(paramahd, paramaqu, paramdt);
/* 20:29 */       return true;
/* 21:   */     }
/* 22:31 */     return false;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public static boolean a(ahd paramahd, aqu paramaqu, dt paramdt)
/* 26:   */   {
/* 27:36 */     adl localadl = adl.b(paramaqu, paramdt);
/* 28:   */     
/* 29:   */ 
/* 30:39 */     boolean bool = false;
/* 31:40 */     double d = 7.0D;
/* 32:41 */     int i = paramdt.n();
/* 33:42 */     int j = paramdt.o();
/* 34:43 */     int k = paramdt.p();
/* 35:   */     
/* 36:45 */     List localList = paramaqu.a(xn.class, new brt(i - d, j - d, k - d, i + d, j + d, k + d));
/* 37:46 */     for (xn localxn : localList) {
/* 38:47 */       if ((localxn.cb()) && (localxn.cc() == paramahd))
/* 39:   */       {
/* 40:48 */         if (localadl == null) {
/* 41:49 */           localadl = adl.a(paramaqu, paramdt);
/* 42:   */         }
/* 43:51 */         localxn.a(localadl, true);
/* 44:52 */         bool = true;
/* 45:   */       }
/* 46:   */     }
/* 47:55 */     return bool;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aml
 * JD-Core Version:    0.7.0.1
 */