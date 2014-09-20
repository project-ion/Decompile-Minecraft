/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bim
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private atr a;
/*  7:   */   
/*  8:   */   public bim(atr paramatr)
/*  9:   */   {
/* 10:16 */     this.a = paramatr;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 14:   */   {
/* 15:21 */     if ((!paramaqu.d(paramdt)) || (paramaqu.p(paramdt.b()).c() != this.a)) {
/* 16:22 */       return false;
/* 17:   */     }
/* 18:24 */     int i = paramRandom.nextInt(32) + 6;
/* 19:25 */     int j = paramRandom.nextInt(4) + 1;
/* 20:   */     int m;
/* 21:   */     int n;
/* 22:   */     int i1;
/* 23:26 */     for (int k = paramdt.n() - j; k <= paramdt.n() + j; k++) {
/* 24:27 */       for (m = paramdt.p() - j; m <= paramdt.p() + j; m++)
/* 25:   */       {
/* 26:28 */         n = k - paramdt.n();
/* 27:29 */         i1 = m - paramdt.p();
/* 28:30 */         if ((n * n + i1 * i1 <= j * j + 1) && 
/* 29:31 */           (paramaqu.p(new dt(k, paramdt.o() - 1, m)).c() != this.a)) {
/* 30:32 */           return false;
/* 31:   */         }
/* 32:   */       }
/* 33:   */     }
/* 34:37 */     for (k = paramdt.o(); k < paramdt.o() + i; k++)
/* 35:   */     {
/* 36:38 */       if (k >= 256) {
/* 37:   */         break;
/* 38:   */       }
/* 39:39 */       for (m = paramdt.n() - j; m <= paramdt.n() + j; m++) {
/* 40:40 */         for (n = paramdt.p() - j; n <= paramdt.p() + j; n++)
/* 41:   */         {
/* 42:41 */           i1 = m - paramdt.n();
/* 43:42 */           int i2 = n - paramdt.p();
/* 44:43 */           if (i1 * i1 + i2 * i2 <= j * j + 1) {
/* 45:44 */             paramaqu.a(new dt(m, k, n), aty.Z.P(), 2);
/* 46:   */           }
/* 47:   */         }
/* 48:   */       }
/* 49:   */     }
/* 50:53 */     ada localada = new ada(paramaqu);
/* 51:54 */     localada.b(paramdt.n() + 0.5F, paramdt.o() + i, paramdt.p() + 0.5F, paramRandom.nextFloat() * 360.0F, 0.0F);
/* 52:55 */     paramaqu.d(localada);
/* 53:56 */     paramaqu.a(paramdt.b(i), aty.h.P(), 2);
/* 54:   */     
/* 55:58 */     return true;
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bim
 * JD-Core Version:    0.7.0.1
 */