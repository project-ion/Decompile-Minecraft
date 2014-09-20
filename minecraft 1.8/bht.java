/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bht
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:15 */     if (!paramaqu.d(paramdt)) {
/*  9:16 */       return false;
/* 10:   */     }
/* 11:18 */     if (paramaqu.p(paramdt.a()).c() != aty.aV) {
/* 12:19 */       return false;
/* 13:   */     }
/* 14:21 */     paramaqu.a(paramdt, aty.aX.P(), 2);
/* 15:23 */     for (int i = 0; i < 1500; i++)
/* 16:   */     {
/* 17:24 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(12), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 18:25 */       if (paramaqu.p(localdt).c().r() == bof.a)
/* 19:   */       {
/* 20:29 */         int j = 0;
/* 21:30 */         for (ej localej : ej.values())
/* 22:   */         {
/* 23:31 */           if (paramaqu.p(localdt.a(localej)).c() == aty.aX) {
/* 24:32 */             j++;
/* 25:   */           }
/* 26:35 */           if (j > 1) {
/* 27:   */             break;
/* 28:   */           }
/* 29:   */         }
/* 30:40 */         if (j == 1) {
/* 31:41 */           paramaqu.a(localdt, aty.aX.P(), 2);
/* 32:   */         }
/* 33:   */       }
/* 34:   */     }
/* 35:45 */     return true;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bht
 * JD-Core Version:    0.7.0.1
 */