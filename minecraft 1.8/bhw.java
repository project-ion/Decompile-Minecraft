/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhw
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private atr a;
/*  7:   */   private int b;
/*  8:   */   
/*  9:   */   public bhw(int paramInt)
/* 10:   */   {
/* 11:15 */     this.a = aty.cB;
/* 12:16 */     this.b = paramInt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 16:   */   {
/* 17:21 */     while ((paramaqu.d(paramdt)) && (paramdt.o() > 2)) {
/* 18:22 */       paramdt = paramdt.b();
/* 19:   */     }
/* 20:25 */     if (paramaqu.p(paramdt).c() != aty.aJ) {
/* 21:26 */       return false;
/* 22:   */     }
/* 23:28 */     int i = paramRandom.nextInt(this.b - 2) + 2;
/* 24:29 */     int j = 1;
/* 25:30 */     for (int k = paramdt.n() - i; k <= paramdt.n() + i; k++) {
/* 26:31 */       for (int m = paramdt.p() - i; m <= paramdt.p() + i; m++)
/* 27:   */       {
/* 28:32 */         int n = k - paramdt.n();
/* 29:33 */         int i1 = m - paramdt.p();
/* 30:34 */         if (n * n + i1 * i1 <= i * i) {
/* 31:37 */           for (int i2 = paramdt.o() - j; i2 <= paramdt.o() + j; i2++)
/* 32:   */           {
/* 33:38 */             dt localdt = new dt(k, i2, m);
/* 34:39 */             atr localatr = paramaqu.p(localdt).c();
/* 35:40 */             if ((localatr == aty.d) || (localatr == aty.aJ) || (localatr == aty.aI)) {
/* 36:41 */               paramaqu.a(localdt, this.a.P(), 2);
/* 37:   */             }
/* 38:   */           }
/* 39:   */         }
/* 40:   */       }
/* 41:   */     }
/* 42:47 */     return true;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhw
 * JD-Core Version:    0.7.0.1
 */