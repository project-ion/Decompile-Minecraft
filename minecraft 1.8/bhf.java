/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhf
/*  4:   */   extends bhc
/*  5:   */ {
/*  6:   */   private boolean a;
/*  7:   */   
/*  8:   */   public bhf(boolean paramBoolean1, boolean paramBoolean2)
/*  9:   */   {
/* 10:19 */     super(paramBoolean1);
/* 11:20 */     this.a = paramBoolean2;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 15:   */   {
/* 16:25 */     int i = paramRandom.nextInt(3) + 5;
/* 17:26 */     if (this.a) {
/* 18:27 */       i += paramRandom.nextInt(7);
/* 19:   */     }
/* 20:30 */     int j = 1;
/* 21:31 */     if ((paramdt.o() < 1) || (paramdt.o() + i + 1 > 256)) {
/* 22:32 */       return false;
/* 23:   */     }
/* 24:   */     int n;
/* 25:   */     int i1;
/* 26:35 */     for (int k = paramdt.o(); k <= paramdt.o() + 1 + i; k++)
/* 27:   */     {
/* 28:36 */       m = 1;
/* 29:37 */       if (k == paramdt.o()) {
/* 30:38 */         m = 0;
/* 31:   */       }
/* 32:40 */       if (k >= paramdt.o() + 1 + i - 2) {
/* 33:41 */         m = 2;
/* 34:   */       }
/* 35:43 */       for (n = paramdt.n() - m; (n <= paramdt.n() + m) && (j != 0); n++) {
/* 36:44 */         for (i1 = paramdt.p() - m; (i1 <= paramdt.p() + m) && (j != 0); i1++) {
/* 37:45 */           if ((k >= 0) && (k < 256))
/* 38:   */           {
/* 39:46 */             if (!a(paramaqu.p(new dt(n, k, i1)).c())) {
/* 40:47 */               j = 0;
/* 41:   */             }
/* 42:   */           }
/* 43:   */           else {
/* 44:50 */             j = 0;
/* 45:   */           }
/* 46:   */         }
/* 47:   */       }
/* 48:   */     }
/* 49:56 */     if (j == 0) {
/* 50:57 */       return false;
/* 51:   */     }
/* 52:60 */     atr localatr1 = paramaqu.p(paramdt.b()).c();
/* 53:61 */     if (((localatr1 != aty.c) && (localatr1 != aty.d) && (localatr1 != aty.ak)) || (paramdt.o() >= 256 - i - 1)) {
/* 54:62 */       return false;
/* 55:   */     }
/* 56:65 */     a(paramaqu, paramdt.b());
/* 57:67 */     for (int m = paramdt.o() - 3 + i; m <= paramdt.o() + i; m++)
/* 58:   */     {
/* 59:68 */       n = m - (paramdt.o() + i);
/* 60:69 */       i1 = 1 - n / 2;
/* 61:70 */       for (int i2 = paramdt.n() - i1; i2 <= paramdt.n() + i1; i2++)
/* 62:   */       {
/* 63:71 */         int i3 = i2 - paramdt.n();
/* 64:72 */         for (int i4 = paramdt.p() - i1; i4 <= paramdt.p() + i1; i4++)
/* 65:   */         {
/* 66:73 */           int i5 = i4 - paramdt.p();
/* 67:74 */           if ((Math.abs(i3) != i1) || (Math.abs(i5) != i1) || ((paramRandom.nextInt(2) != 0) && (n != 0)))
/* 68:   */           {
/* 69:77 */             dt localdt = new dt(i2, m, i4);
/* 70:78 */             atr localatr3 = paramaqu.p(localdt).c();
/* 71:79 */             if ((localatr3.r() == bof.a) || (localatr3.r() == bof.j)) {
/* 72:80 */               a(paramaqu, localdt, aty.t, ayx.c.a());
/* 73:   */             }
/* 74:   */           }
/* 75:   */         }
/* 76:   */       }
/* 77:   */     }
/* 78:85 */     for (m = 0; m < i; m++)
/* 79:   */     {
/* 80:86 */       atr localatr2 = paramaqu.p(paramdt.b(m)).c();
/* 81:87 */       if ((localatr2.r() == bof.a) || (localatr2.r() == bof.j)) {
/* 82:88 */         a(paramaqu, paramdt.b(m), aty.r, ayx.c.a());
/* 83:   */       }
/* 84:   */     }
/* 85:91 */     return true;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhf
 * JD-Core Version:    0.7.0.1
 */