/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ale
/*  4:   */   extends alq
/*  5:   */ {
/*  6:   */   public ale()
/*  7:   */   {
/*  8:12 */     a(akf.f);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 12:   */   {
/* 13:17 */     if (paramaqu.D) {
/* 14:18 */       return true;
/* 15:   */     }
/* 16:21 */     paramdt = paramdt.a(paramej);
/* 17:23 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 18:24 */       return false;
/* 19:   */     }
/* 20:27 */     if (paramaqu.p(paramdt).c().r() == bof.a)
/* 21:   */     {
/* 22:28 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "item.fireCharge.use", 1.0F, (g.nextFloat() - g.nextFloat()) * 0.2F + 1.0F);
/* 23:29 */       paramaqu.a(paramdt, aty.ab.P());
/* 24:   */     }
/* 25:31 */     if (!paramahd.by.d) {
/* 26:32 */       paramamj.b -= 1;
/* 27:   */     }
/* 28:34 */     return true;
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ale
 * JD-Core Version:    0.7.0.1
 */