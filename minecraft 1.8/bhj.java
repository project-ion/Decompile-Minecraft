/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhj
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:13 */     for (int i = 0; i < 10; i++)
/*  9:   */     {
/* 10:14 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 11:16 */       if (paramaqu.d(localdt))
/* 12:   */       {
/* 13:17 */         int j = 1 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 14:18 */         for (int k = 0; k < j; k++) {
/* 15:19 */           if (aty.aK.d(paramaqu, localdt)) {
/* 16:20 */             paramaqu.a(localdt.b(k), aty.aK.P(), 2);
/* 17:   */           }
/* 18:   */         }
/* 19:   */       }
/* 20:   */     }
/* 21:26 */     return true;
/* 22:   */   }
/* 23:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhj
 * JD-Core Version:    0.7.0.1
 */