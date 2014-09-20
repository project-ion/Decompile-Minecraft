/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class big
/*  4:   */   extends bhc
/*  5:   */ {
/*  6:   */   public big()
/*  7:   */   {
/*  8:14 */     super(false);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 12:   */   {
/* 13:20 */     int i = paramRandom.nextInt(5) + 7;
/* 14:21 */     int j = i - paramRandom.nextInt(2) - 3;
/* 15:22 */     int k = i - j;
/* 16:23 */     int m = 1 + paramRandom.nextInt(k + 1);
/* 17:   */     
/* 18:25 */     int n = 1;
/* 19:27 */     if ((paramdt.o() < 1) || (paramdt.o() + i + 1 > 256)) {
/* 20:28 */       return false;
/* 21:   */     }
/* 22:   */     int i4;
/* 23:32 */     for (int i1 = paramdt.o(); (i1 <= paramdt.o() + 1 + i) && (n != 0); i1++)
/* 24:   */     {
/* 25:33 */       i2 = 1;
/* 26:34 */       if (i1 - paramdt.o() < j) {
/* 27:35 */         i2 = 0;
/* 28:   */       } else {
/* 29:37 */         i2 = m;
/* 30:   */       }
/* 31:39 */       for (i3 = paramdt.n() - i2; (i3 <= paramdt.n() + i2) && (n != 0); i3++) {
/* 32:40 */         for (i4 = paramdt.p() - i2; (i4 <= paramdt.p() + i2) && (n != 0); i4++) {
/* 33:41 */           if ((i1 >= 0) && (i1 < 256))
/* 34:   */           {
/* 35:42 */             if (!a(paramaqu.p(new dt(i3, i1, i4)).c())) {
/* 36:43 */               n = 0;
/* 37:   */             }
/* 38:   */           }
/* 39:   */           else {
/* 40:46 */             n = 0;
/* 41:   */           }
/* 42:   */         }
/* 43:   */       }
/* 44:   */     }
/* 45:52 */     if (n == 0) {
/* 46:53 */       return false;
/* 47:   */     }
/* 48:57 */     atr localatr1 = paramaqu.p(paramdt.b()).c();
/* 49:58 */     if (((localatr1 != aty.c) && (localatr1 != aty.d)) || (paramdt.o() >= 256 - i - 1)) {
/* 50:59 */       return false;
/* 51:   */     }
/* 52:62 */     a(paramaqu, paramdt.b());
/* 53:   */     
/* 54:   */ 
/* 55:65 */     int i2 = 0;
/* 56:66 */     for (int i3 = paramdt.o() + i; i3 >= paramdt.o() + j; i3--)
/* 57:   */     {
/* 58:67 */       for (i4 = paramdt.n() - i2; i4 <= paramdt.n() + i2; i4++)
/* 59:   */       {
/* 60:68 */         int i5 = i4 - paramdt.n();
/* 61:69 */         for (int i6 = paramdt.p() - i2; i6 <= paramdt.p() + i2; i6++)
/* 62:   */         {
/* 63:70 */           int i7 = i6 - paramdt.p();
/* 64:71 */           if ((Math.abs(i5) != i2) || (Math.abs(i7) != i2) || (i2 <= 0))
/* 65:   */           {
/* 66:74 */             dt localdt = new dt(i4, i3, i6);
/* 67:75 */             if (!paramaqu.p(localdt).c().m()) {
/* 68:76 */               a(paramaqu, localdt, aty.t, ayx.b.a());
/* 69:   */             }
/* 70:   */           }
/* 71:   */         }
/* 72:   */       }
/* 73:81 */       if ((i2 >= 1) && (i3 == paramdt.o() + j + 1)) {
/* 74:82 */         i2--;
/* 75:83 */       } else if (i2 < m) {
/* 76:84 */         i2++;
/* 77:   */       }
/* 78:   */     }
/* 79:87 */     for (i3 = 0; i3 < i - 1; i3++)
/* 80:   */     {
/* 81:88 */       atr localatr2 = paramaqu.p(paramdt.b(i3)).c();
/* 82:89 */       if ((localatr2.r() == bof.a) || (localatr2.r() == bof.j)) {
/* 83:90 */         a(paramaqu, paramdt.b(i3), aty.r, ayx.b.a());
/* 84:   */       }
/* 85:   */     }
/* 86:93 */     return true;
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     big
 * JD-Core Version:    0.7.0.1
 */