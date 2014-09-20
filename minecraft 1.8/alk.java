/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class alk
/*  4:   */   extends alq
/*  5:   */ {
/*  6:   */   public alk()
/*  7:   */   {
/*  8:12 */     this.h = 1;
/*  9:13 */     d(64);
/* 10:14 */     a(akf.i);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 14:   */   {
/* 15:19 */     paramdt = paramdt.a(paramej);
/* 16:21 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 17:22 */       return false;
/* 18:   */     }
/* 19:25 */     if (paramaqu.p(paramdt).c().r() == bof.a)
/* 20:   */     {
/* 21:26 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "fire.ignite", 1.0F, g.nextFloat() * 0.4F + 0.8F);
/* 22:27 */       paramaqu.a(paramdt, aty.ab.P());
/* 23:   */     }
/* 24:30 */     paramamj.a(1, paramahd);
/* 25:31 */     return true;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     alk
 * JD-Core Version:    0.7.0.1
 */