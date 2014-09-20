/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bio
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   public bio(boolean paramBoolean)
/*   7:    */   {
/*   8: 14 */     super(paramBoolean);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  12:    */   {
/*  13: 20 */     int i = paramRandom.nextInt(4) + 6;
/*  14: 21 */     int j = 1 + paramRandom.nextInt(2);
/*  15: 22 */     int k = i - j;
/*  16: 23 */     int m = 2 + paramRandom.nextInt(2);
/*  17:    */     
/*  18: 25 */     int n = 1;
/*  19: 27 */     if ((paramdt.o() < 1) || (paramdt.o() + i + 1 > 256)) {
/*  20: 28 */       return false;
/*  21:    */     }
/*  22: 32 */     for (int i1 = paramdt.o(); (i1 <= paramdt.o() + 1 + i) && (n != 0); i1++)
/*  23:    */     {
/*  24: 33 */       i2 = 1;
/*  25: 34 */       if (i1 - paramdt.o() < j) {
/*  26: 35 */         i2 = 0;
/*  27:    */       } else {
/*  28: 37 */         i2 = m;
/*  29:    */       }
/*  30: 39 */       for (i3 = paramdt.n() - i2; (i3 <= paramdt.n() + i2) && (n != 0); i3++) {
/*  31: 40 */         for (i4 = paramdt.p() - i2; (i4 <= paramdt.p() + i2) && (n != 0); i4++) {
/*  32: 41 */           if ((i1 >= 0) && (i1 < 256))
/*  33:    */           {
/*  34: 42 */             atr localatr2 = paramaqu.p(new dt(i3, i1, i4)).c();
/*  35: 43 */             if ((localatr2.r() != bof.a) && (localatr2.r() != bof.j)) {
/*  36: 44 */               n = 0;
/*  37:    */             }
/*  38:    */           }
/*  39:    */           else
/*  40:    */           {
/*  41: 47 */             n = 0;
/*  42:    */           }
/*  43:    */         }
/*  44:    */       }
/*  45:    */     }
/*  46: 53 */     if (n == 0) {
/*  47: 54 */       return false;
/*  48:    */     }
/*  49: 58 */     atr localatr1 = paramaqu.p(paramdt.b()).c();
/*  50: 59 */     if (((localatr1 != aty.c) && (localatr1 != aty.d) && (localatr1 != aty.ak)) || (paramdt.o() >= 256 - i - 1)) {
/*  51: 60 */       return false;
/*  52:    */     }
/*  53: 63 */     a(paramaqu, paramdt.b());
/*  54:    */     
/*  55:    */ 
/*  56: 66 */     int i2 = paramRandom.nextInt(2);
/*  57: 67 */     int i3 = 1;
/*  58: 68 */     int i4 = 0;
/*  59: 69 */     for (int i5 = 0; i5 <= k; i5++)
/*  60:    */     {
/*  61: 70 */       i6 = paramdt.o() + i - i5;
/*  62: 72 */       for (int i7 = paramdt.n() - i2; i7 <= paramdt.n() + i2; i7++)
/*  63:    */       {
/*  64: 73 */         int i8 = i7 - paramdt.n();
/*  65: 74 */         for (int i9 = paramdt.p() - i2; i9 <= paramdt.p() + i2; i9++)
/*  66:    */         {
/*  67: 75 */           int i10 = i9 - paramdt.p();
/*  68: 76 */           if ((Math.abs(i8) != i2) || (Math.abs(i10) != i2) || (i2 <= 0))
/*  69:    */           {
/*  70: 79 */             dt localdt = new dt(i7, i6, i9);
/*  71: 80 */             if (!paramaqu.p(localdt).c().m()) {
/*  72: 81 */               a(paramaqu, localdt, aty.t, ayx.b.a());
/*  73:    */             }
/*  74:    */           }
/*  75:    */         }
/*  76:    */       }
/*  77: 86 */       if (i2 >= i3)
/*  78:    */       {
/*  79: 87 */         i2 = i4;
/*  80: 88 */         i4 = 1;
/*  81: 89 */         i3++;
/*  82: 90 */         if (i3 > m) {
/*  83: 91 */           i3 = m;
/*  84:    */         }
/*  85:    */       }
/*  86:    */       else
/*  87:    */       {
/*  88: 94 */         i2++;
/*  89:    */       }
/*  90:    */     }
/*  91: 97 */     i5 = paramRandom.nextInt(3);
/*  92: 98 */     for (int i6 = 0; i6 < i - i5; i6++)
/*  93:    */     {
/*  94: 99 */       atr localatr3 = paramaqu.p(paramdt.b(i6)).c();
/*  95:100 */       if ((localatr3.r() == bof.a) || (localatr3.r() == bof.j)) {
/*  96:101 */         a(paramaqu, paramdt.b(i6), aty.r, ayx.b.a());
/*  97:    */       }
/*  98:    */     }
/*  99:104 */     return true;
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bio
 * JD-Core Version:    0.7.0.1
 */