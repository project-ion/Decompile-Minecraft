/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhl
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private atr a;
/*  7:   */   private int b;
/*  8:   */   
/*  9:   */   public bhl(int paramInt)
/* 10:   */   {
/* 11:16 */     this.a = aty.aL;
/* 12:17 */     this.b = paramInt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 16:   */   {
/* 17:22 */     if (paramaqu.p(paramdt).c().r() != bof.h) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:25 */     int i = paramRandom.nextInt(this.b - 2) + 2;
/* 21:26 */     int j = 1;
/* 22:27 */     for (int k = paramdt.n() - i; k <= paramdt.n() + i; k++) {
/* 23:28 */       for (int m = paramdt.p() - i; m <= paramdt.p() + i; m++)
/* 24:   */       {
/* 25:29 */         int n = k - paramdt.n();
/* 26:30 */         int i1 = m - paramdt.p();
/* 27:31 */         if (n * n + i1 * i1 <= i * i) {
/* 28:34 */           for (int i2 = paramdt.o() - j; i2 <= paramdt.o() + j; i2++)
/* 29:   */           {
/* 30:35 */             dt localdt = new dt(k, i2, m);
/* 31:36 */             atr localatr = paramaqu.p(localdt).c();
/* 32:37 */             if ((localatr == aty.d) || (localatr == aty.aL)) {
/* 33:38 */               paramaqu.a(localdt, this.a.P(), 2);
/* 34:   */             }
/* 35:   */           }
/* 36:   */         }
/* 37:   */       }
/* 38:   */     }
/* 39:44 */     return true;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhl
 * JD-Core Version:    0.7.0.1
 */