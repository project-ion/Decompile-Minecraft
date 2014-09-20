/*  1:   */ public class anf
/*  2:   */   extends alq
/*  3:   */ {
/*  4:   */   public anf()
/*  5:   */   {
/*  6:17 */     this.h = 16;
/*  7:18 */     a(akf.c);
/*  8:   */   }
/*  9:   */   
/* 10:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 11:   */   {
/* 12:23 */     if (paramej == ej.a) {
/* 13:24 */       return false;
/* 14:   */     }
/* 15:26 */     if (!paramaqu.p(paramdt).c().r().a()) {
/* 16:27 */       return false;
/* 17:   */     }
/* 18:30 */     paramdt = paramdt.a(paramej);
/* 19:32 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 20:33 */       return false;
/* 21:   */     }
/* 22:35 */     if (!aty.an.c(paramaqu, paramdt)) {
/* 23:36 */       return false;
/* 24:   */     }
/* 25:39 */     if (paramaqu.D) {
/* 26:40 */       return true;
/* 27:   */     }
/* 28:43 */     if (paramej == ej.b)
/* 29:   */     {
/* 30:44 */       int i = uv.c((paramahd.y + 180.0F) * 16.0F / 360.0F + 0.5D) & 0xF;
/* 31:45 */       paramaqu.a(paramdt, aty.an.P().a(baw.a, Integer.valueOf(i)), 3);
/* 32:   */     }
/* 33:   */     else
/* 34:   */     {
/* 35:47 */       paramaqu.a(paramdt, aty.ax.P().a(bbz.a, paramej), 3);
/* 36:   */     }
/* 37:50 */     paramamj.b -= 1;
/* 38:51 */     bcm localbcm = paramaqu.s(paramdt);
/* 39:52 */     if (((localbcm instanceof bdj)) && 
/* 40:53 */       (!aju.a(paramaqu, paramdt, paramamj))) {
/* 41:54 */       paramahd.a((bdj)localbcm);
/* 42:   */     }
/* 43:57 */     return true;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     anf
 * JD-Core Version:    0.7.0.1
 */