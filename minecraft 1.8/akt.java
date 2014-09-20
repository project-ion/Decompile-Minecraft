/*  1:   */ public class akt
/*  2:   */   extends alq
/*  3:   */ {
/*  4:   */   private atr a;
/*  5:   */   
/*  6:   */   public akt(atr paramatr)
/*  7:   */   {
/*  8:15 */     this.a = paramatr;
/*  9:16 */     a(akf.d);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 13:   */   {
/* 14:21 */     if (paramej != ej.b) {
/* 15:22 */       return false;
/* 16:   */     }
/* 17:25 */     bec localbec = paramaqu.p(paramdt);
/* 18:26 */     atr localatr = localbec.c();
/* 19:28 */     if (!localatr.f(paramaqu, paramdt)) {
/* 20:29 */       paramdt = paramdt.a(paramej);
/* 21:   */     }
/* 22:32 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 23:33 */       return false;
/* 24:   */     }
/* 25:35 */     if (!this.a.c(paramaqu, paramdt)) {
/* 26:36 */       return false;
/* 27:   */     }
/* 28:39 */     a(paramaqu, paramdt, ej.a(paramahd.y), this.a);
/* 29:   */     
/* 30:41 */     paramamj.b -= 1;
/* 31:42 */     return true;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public static void a(aqu paramaqu, dt paramdt, ej paramej, atr paramatr)
/* 35:   */   {
/* 36:46 */     dt localdt1 = paramdt.a(paramej.e());
/* 37:47 */     dt localdt2 = paramdt.a(paramej.f());
/* 38:   */     
/* 39:49 */     int i = (paramaqu.p(localdt2).c().t() ? 1 : 0) + (paramaqu.p(localdt2.a()).c().t() ? 1 : 0);
/* 40:50 */     int j = (paramaqu.p(localdt1).c().t() ? 1 : 0) + (paramaqu.p(localdt1.a()).c().t() ? 1 : 0);
/* 41:   */     
/* 42:52 */     int k = (paramaqu.p(localdt2).c() == paramatr) || (paramaqu.p(localdt2.a()).c() == paramatr) ? 1 : 0;
/* 43:53 */     int m = (paramaqu.p(localdt1).c() == paramatr) || (paramaqu.p(localdt1.a()).c() == paramatr) ? 1 : 0;
/* 44:   */     
/* 45:   */ 
/* 46:56 */     int n = 0;
/* 47:57 */     if (((k != 0) && (m == 0)) || (j > i)) {
/* 48:58 */       n = 1;
/* 49:   */     }
/* 50:61 */     dt localdt3 = paramdt.a();
/* 51:62 */     bec localbec = paramatr.P().a(avf.a, paramej).a(avf.M, n != 0 ? avh.b : avh.a);
/* 52:63 */     paramaqu.a(paramdt, localbec.a(avf.O, avg.b), 2);
/* 53:64 */     paramaqu.a(localdt3, localbec.a(avf.O, avg.a), 2);
/* 54:65 */     paramaqu.c(paramdt, paramatr);
/* 55:66 */     paramaqu.c(localdt3, paramatr);
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     akt
 * JD-Core Version:    0.7.0.1
 */