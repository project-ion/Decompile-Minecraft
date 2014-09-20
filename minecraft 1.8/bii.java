/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bii
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:14 */     for (int i = 0; i < 20; i++)
/*  9:   */     {
/* 10:15 */       dt localdt1 = paramdt.a(paramRandom.nextInt(4) - paramRandom.nextInt(4), 0, paramRandom.nextInt(4) - paramRandom.nextInt(4));
/* 11:17 */       if (paramaqu.d(localdt1))
/* 12:   */       {
/* 13:18 */         dt localdt2 = localdt1.b();
/* 14:20 */         if ((paramaqu.p(localdt2.e()).c().r() == bof.h) || (paramaqu.p(localdt2.f()).c().r() == bof.h) || (paramaqu.p(localdt2.c()).c().r() == bof.h) || (paramaqu.p(localdt2.d()).c().r() == bof.h))
/* 15:   */         {
/* 16:21 */           int j = 2 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 17:22 */           for (int k = 0; k < j; k++) {
/* 18:23 */             if (aty.aM.d(paramaqu, localdt1)) {
/* 19:24 */               paramaqu.a(localdt1.b(k), aty.aM.P(), 2);
/* 20:   */             }
/* 21:   */           }
/* 22:   */         }
/* 23:   */       }
/* 24:   */     }
/* 25:31 */     return true;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bii
 * JD-Core Version:    0.7.0.1
 */