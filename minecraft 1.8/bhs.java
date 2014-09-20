/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhs
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:13 */     for (int i = 0; i < 64; i++)
/*  9:   */     {
/* 10:14 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 11:15 */       if (paramaqu.d(localdt)) {
/* 12:18 */         if (paramaqu.p(localdt.b()).c() == aty.aV) {
/* 13:21 */           paramaqu.a(localdt, aty.ab.P(), 2);
/* 14:   */         }
/* 15:   */       }
/* 16:   */     }
/* 17:24 */     return true;
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhs
 * JD-Core Version:    0.7.0.1
 */