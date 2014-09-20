/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bip
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   public bip()
/*   7:    */   {
/*   8: 14 */     super(false);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  12:    */   {
/*  13: 19 */     int i = paramRandom.nextInt(4) + 5;
/*  14: 20 */     while (paramaqu.p(paramdt.b()).c().r() == bof.h) {
/*  15: 21 */       paramdt = paramdt.b();
/*  16:    */     }
/*  17: 24 */     int j = 1;
/*  18: 25 */     if ((paramdt.o() < 1) || (paramdt.o() + i + 1 > 256)) {
/*  19: 26 */       return false;
/*  20:    */     }
/*  21:    */     int n;
/*  22:    */     int i2;
/*  23: 29 */     for (int k = paramdt.o(); k <= paramdt.o() + 1 + i; k++)
/*  24:    */     {
/*  25: 30 */       m = 1;
/*  26: 31 */       if (k == paramdt.o()) {
/*  27: 32 */         m = 0;
/*  28:    */       }
/*  29: 34 */       if (k >= paramdt.o() + 1 + i - 2) {
/*  30: 35 */         m = 3;
/*  31:    */       }
/*  32: 37 */       for (n = paramdt.n() - m; (n <= paramdt.n() + m) && (j != 0); n++) {
/*  33: 38 */         for (i2 = paramdt.p() - m; (i2 <= paramdt.p() + m) && (j != 0); i2++) {
/*  34: 39 */           if ((k >= 0) && (k < 256))
/*  35:    */           {
/*  36: 40 */             atr localatr3 = paramaqu.p(new dt(n, k, i2)).c();
/*  37: 41 */             if ((localatr3.r() != bof.a) && (localatr3.r() != bof.j)) {
/*  38: 42 */               if ((localatr3 == aty.j) || (localatr3 == aty.i))
/*  39:    */               {
/*  40: 43 */                 if (k > paramdt.o()) {
/*  41: 44 */                   j = 0;
/*  42:    */                 }
/*  43:    */               }
/*  44:    */               else {
/*  45: 47 */                 j = 0;
/*  46:    */               }
/*  47:    */             }
/*  48:    */           }
/*  49:    */           else
/*  50:    */           {
/*  51: 51 */             j = 0;
/*  52:    */           }
/*  53:    */         }
/*  54:    */       }
/*  55:    */     }
/*  56: 57 */     if (j == 0) {
/*  57: 58 */       return false;
/*  58:    */     }
/*  59: 61 */     atr localatr1 = paramaqu.p(paramdt.b()).c();
/*  60: 62 */     if (((localatr1 != aty.c) && (localatr1 != aty.d)) || (paramdt.o() >= 256 - i - 1)) {
/*  61: 63 */       return false;
/*  62:    */     }
/*  63: 66 */     a(paramaqu, paramdt.b());
/*  64:    */     int i3;
/*  65:    */     int i4;
/*  66:    */     dt localdt3;
/*  67: 68 */     for (int m = paramdt.o() - 3 + i; m <= paramdt.o() + i; m++)
/*  68:    */     {
/*  69: 69 */       n = m - (paramdt.o() + i);
/*  70: 70 */       i2 = 2 - n / 2;
/*  71: 71 */       for (i3 = paramdt.n() - i2; i3 <= paramdt.n() + i2; i3++)
/*  72:    */       {
/*  73: 72 */         i4 = i3 - paramdt.n();
/*  74: 73 */         for (int i5 = paramdt.p() - i2; i5 <= paramdt.p() + i2; i5++)
/*  75:    */         {
/*  76: 74 */           int i6 = i5 - paramdt.p();
/*  77: 75 */           if ((Math.abs(i4) != i2) || (Math.abs(i6) != i2) || ((paramRandom.nextInt(2) != 0) && (n != 0)))
/*  78:    */           {
/*  79: 78 */             localdt3 = new dt(i3, m, i5);
/*  80: 79 */             if (!paramaqu.p(localdt3).c().m()) {
/*  81: 80 */               a(paramaqu, localdt3, aty.t);
/*  82:    */             }
/*  83:    */           }
/*  84:    */         }
/*  85:    */       }
/*  86:    */     }
/*  87: 86 */     for (m = 0; m < i; m++)
/*  88:    */     {
/*  89: 87 */       atr localatr2 = paramaqu.p(paramdt.b(m)).c();
/*  90: 88 */       if ((localatr2.r() == bof.a) || (localatr2.r() == bof.j) || (localatr2 == aty.i) || (localatr2 == aty.j)) {
/*  91: 89 */         a(paramaqu, paramdt.b(m), aty.r);
/*  92:    */       }
/*  93:    */     }
/*  94: 93 */     for (m = paramdt.o() - 3 + i; m <= paramdt.o() + i; m++)
/*  95:    */     {
/*  96: 94 */       int i1 = m - (paramdt.o() + i);
/*  97: 95 */       i2 = 2 - i1 / 2;
/*  98: 96 */       for (i3 = paramdt.n() - i2; i3 <= paramdt.n() + i2; i3++) {
/*  99: 97 */         for (i4 = paramdt.p() - i2; i4 <= paramdt.p() + i2; i4++)
/* 100:    */         {
/* 101: 98 */           dt localdt1 = new dt(i3, m, i4);
/* 102:100 */           if (paramaqu.p(localdt1).c().r() == bof.j)
/* 103:    */           {
/* 104:101 */             dt localdt2 = localdt1.e();
/* 105:102 */             localdt3 = localdt1.f();
/* 106:103 */             dt localdt4 = localdt1.c();
/* 107:104 */             dt localdt5 = localdt1.d();
/* 108:106 */             if ((paramRandom.nextInt(4) == 0) && (paramaqu.p(localdt2).c().r() == bof.a)) {
/* 109:107 */               a(paramaqu, localdt2, bbv.S);
/* 110:    */             }
/* 111:109 */             if ((paramRandom.nextInt(4) == 0) && (paramaqu.p(localdt3).c().r() == bof.a)) {
/* 112:110 */               a(paramaqu, localdt3, bbv.T);
/* 113:    */             }
/* 114:112 */             if ((paramRandom.nextInt(4) == 0) && (paramaqu.p(localdt4).c().r() == bof.a)) {
/* 115:113 */               a(paramaqu, localdt4, bbv.Q);
/* 116:    */             }
/* 117:115 */             if ((paramRandom.nextInt(4) == 0) && (paramaqu.p(localdt5).c().r() == bof.a)) {
/* 118:116 */               a(paramaqu, localdt5, bbv.R);
/* 119:    */             }
/* 120:    */           }
/* 121:    */         }
/* 122:    */       }
/* 123:    */     }
/* 124:122 */     return true;
/* 125:    */   }
/* 126:    */   
/* 127:    */   private void a(aqu paramaqu, dt paramdt, int paramInt)
/* 128:    */   {
/* 129:126 */     a(paramaqu, paramdt, aty.bn, paramInt);
/* 130:127 */     int i = 4;
/* 131:    */     
/* 132:129 */     paramdt = paramdt.b();
/* 133:130 */     while ((paramaqu.p(paramdt).c().r() == bof.a) && (i > 0))
/* 134:    */     {
/* 135:131 */       a(paramaqu, paramdt, aty.bn, paramInt);
/* 136:132 */       paramdt = paramdt.b();
/* 137:133 */       i--;
/* 138:    */     }
/* 139:    */   }
/* 140:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bip
 * JD-Core Version:    0.7.0.1
 */