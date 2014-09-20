/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bit
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:13 */     for (int i = 0; i < 10; i++)
/*  9:   */     {
/* 10:14 */       int j = paramdt.n() + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 11:15 */       int k = paramdt.o() + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 12:16 */       int m = paramdt.p() + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 13:17 */       if ((paramaqu.d(new dt(j, k, m))) && 
/* 14:18 */         (aty.bx.c(paramaqu, new dt(j, k, m)))) {
/* 15:19 */         paramaqu.a(new dt(j, k, m), aty.bx.P(), 2);
/* 16:   */       }
/* 17:   */     }
/* 18:24 */     return true;
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bit
 * JD-Core Version:    0.7.0.1
 */