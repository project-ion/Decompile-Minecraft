/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhr
/*  4:   */   extends bir
/*  5:   */ {
/*  6:   */   private int a;
/*  7:   */   private int b;
/*  8:   */   
/*  9:   */   public bhr(int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:16 */     super(false);
/* 12:17 */     this.b = paramInt1;
/* 13:18 */     this.a = paramInt2;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 17:   */   {
/* 18:   */     atr localatr1;
/* 19:25 */     while ((((localatr1 = paramaqu.p(paramdt).c()).r() == bof.a) || (localatr1.r() == bof.j)) && (paramdt.o() > 0)) {
/* 20:26 */       paramdt = paramdt.b();
/* 21:   */     }
/* 22:29 */     atr localatr2 = paramaqu.p(paramdt).c();
/* 23:30 */     if ((localatr2 == aty.d) || (localatr2 == aty.c))
/* 24:   */     {
/* 25:31 */       paramdt = paramdt.a();
/* 26:32 */       a(paramaqu, paramdt, aty.r, this.b);
/* 27:34 */       for (int i = paramdt.o(); i <= paramdt.o() + 2; i++)
/* 28:   */       {
/* 29:35 */         int j = i - paramdt.o();
/* 30:36 */         int k = 2 - j;
/* 31:37 */         for (int m = paramdt.n() - k; m <= paramdt.n() + k; m++)
/* 32:   */         {
/* 33:38 */           int n = m - paramdt.n();
/* 34:39 */           for (int i1 = paramdt.p() - k; i1 <= paramdt.p() + k; i1++)
/* 35:   */           {
/* 36:40 */             int i2 = i1 - paramdt.p();
/* 37:41 */             if ((Math.abs(n) != k) || (Math.abs(i2) != k) || (paramRandom.nextInt(2) != 0))
/* 38:   */             {
/* 39:44 */               dt localdt = new dt(m, i, i1);
/* 40:45 */               if (!paramaqu.p(localdt).c().m()) {
/* 41:46 */                 a(paramaqu, localdt, aty.t, this.a);
/* 42:   */               }
/* 43:   */             }
/* 44:   */           }
/* 45:   */         }
/* 46:   */       }
/* 47:   */     }
/* 48:52 */     return true;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhr
 * JD-Core Version:    0.7.0.1
 */