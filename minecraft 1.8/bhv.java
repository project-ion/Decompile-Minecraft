/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bhv
/*   4:    */   extends bhp
/*   5:    */ {
/*   6: 12 */   private int a = -1;
/*   7:    */   
/*   8:    */   public bhv(int paramInt)
/*   9:    */   {
/*  10: 15 */     super(true);
/*  11: 16 */     this.a = paramInt;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public bhv()
/*  15:    */   {
/*  16: 20 */     super(false);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  20:    */   {
/*  21: 25 */     int i = paramRandom.nextInt(2);
/*  22: 26 */     if (this.a >= 0) {
/*  23: 27 */       i = this.a;
/*  24:    */     }
/*  25: 30 */     int j = paramRandom.nextInt(3) + 4;
/*  26:    */     
/*  27: 32 */     int k = 1;
/*  28: 33 */     if ((paramdt.o() < 1) || (paramdt.o() + j + 1 >= 256)) {
/*  29: 34 */       return false;
/*  30:    */     }
/*  31:    */     int i2;
/*  32: 37 */     for (int m = paramdt.o(); m <= paramdt.o() + 1 + j; m++)
/*  33:    */     {
/*  34: 38 */       n = 3;
/*  35: 39 */       if (m <= paramdt.o() + 3) {
/*  36: 40 */         n = 0;
/*  37:    */       }
/*  38: 42 */       for (i1 = paramdt.n() - n; (i1 <= paramdt.n() + n) && (k != 0); i1++) {
/*  39: 43 */         for (i2 = paramdt.p() - n; (i2 <= paramdt.p() + n) && (k != 0); i2++) {
/*  40: 44 */           if ((m >= 0) && (m < 256))
/*  41:    */           {
/*  42: 45 */             atr localatr3 = paramaqu.p(new dt(i1, m, i2)).c();
/*  43: 46 */             if ((localatr3.r() != bof.a) && (localatr3.r() != bof.j)) {
/*  44: 47 */               k = 0;
/*  45:    */             }
/*  46:    */           }
/*  47:    */           else
/*  48:    */           {
/*  49: 50 */             k = 0;
/*  50:    */           }
/*  51:    */         }
/*  52:    */       }
/*  53:    */     }
/*  54: 56 */     if (k == 0) {
/*  55: 57 */       return false;
/*  56:    */     }
/*  57: 60 */     atr localatr1 = paramaqu.p(paramdt.b()).c();
/*  58: 61 */     if ((localatr1 != aty.d) && (localatr1 != aty.c) && (localatr1 != aty.bw)) {
/*  59: 62 */       return false;
/*  60:    */     }
/*  61: 65 */     int n = paramdt.o() + j;
/*  62: 66 */     if (i == 1) {
/*  63: 67 */       n = paramdt.o() + j - 3;
/*  64:    */     }
/*  65: 69 */     for (int i1 = n; i1 <= paramdt.o() + j; i1++)
/*  66:    */     {
/*  67: 70 */       i2 = 1;
/*  68: 71 */       if (i1 < paramdt.o() + j) {
/*  69: 72 */         i2++;
/*  70:    */       }
/*  71: 74 */       if (i == 0) {
/*  72: 75 */         i2 = 3;
/*  73:    */       }
/*  74: 77 */       for (int i3 = paramdt.n() - i2; i3 <= paramdt.n() + i2; i3++) {
/*  75: 78 */         for (int i4 = paramdt.p() - i2; i4 <= paramdt.p() + i2; i4++)
/*  76:    */         {
/*  77: 79 */           int i5 = 5;
/*  78: 80 */           if (i3 == paramdt.n() - i2) {
/*  79: 81 */             i5--;
/*  80:    */           }
/*  81: 83 */           if (i3 == paramdt.n() + i2) {
/*  82: 84 */             i5++;
/*  83:    */           }
/*  84: 86 */           if (i4 == paramdt.p() - i2) {
/*  85: 87 */             i5 -= 3;
/*  86:    */           }
/*  87: 89 */           if (i4 == paramdt.p() + i2) {
/*  88: 90 */             i5 += 3;
/*  89:    */           }
/*  90: 93 */           if ((i == 0) || (i1 < paramdt.o() + j))
/*  91:    */           {
/*  92: 94 */             if (((i3 == paramdt.n() - i2) || (i3 == paramdt.n() + i2)) && ((i4 == paramdt.p() - i2) || (i4 == paramdt.p() + i2))) {
/*  93:    */               continue;
/*  94:    */             }
/*  95: 97 */             if ((i3 == paramdt.n() - (i2 - 1)) && (i4 == paramdt.p() - i2)) {
/*  96: 98 */               i5 = 1;
/*  97:    */             }
/*  98:100 */             if ((i3 == paramdt.n() - i2) && (i4 == paramdt.p() - (i2 - 1))) {
/*  99:101 */               i5 = 1;
/* 100:    */             }
/* 101:104 */             if ((i3 == paramdt.n() + (i2 - 1)) && (i4 == paramdt.p() - i2)) {
/* 102:105 */               i5 = 3;
/* 103:    */             }
/* 104:107 */             if ((i3 == paramdt.n() + i2) && (i4 == paramdt.p() - (i2 - 1))) {
/* 105:108 */               i5 = 3;
/* 106:    */             }
/* 107:111 */             if ((i3 == paramdt.n() - (i2 - 1)) && (i4 == paramdt.p() + i2)) {
/* 108:112 */               i5 = 7;
/* 109:    */             }
/* 110:114 */             if ((i3 == paramdt.n() - i2) && (i4 == paramdt.p() + (i2 - 1))) {
/* 111:115 */               i5 = 7;
/* 112:    */             }
/* 113:118 */             if ((i3 == paramdt.n() + (i2 - 1)) && (i4 == paramdt.p() + i2)) {
/* 114:119 */               i5 = 9;
/* 115:    */             }
/* 116:121 */             if ((i3 == paramdt.n() + i2) && (i4 == paramdt.p() + (i2 - 1))) {
/* 117:122 */               i5 = 9;
/* 118:    */             }
/* 119:    */           }
/* 120:126 */           if ((i5 == 5) && (i1 < paramdt.o() + j)) {
/* 121:127 */             i5 = 0;
/* 122:    */           }
/* 123:129 */           if ((i5 != 0) || (paramdt.o() >= paramdt.o() + j - 1))
/* 124:    */           {
/* 125:131 */             dt localdt = new dt(i3, i1, i4);
/* 126:132 */             if (!paramaqu.p(localdt).c().m()) {
/* 127:133 */               a(paramaqu, localdt, atr.c(atr.a(aty.bg) + i), i5);
/* 128:    */             }
/* 129:    */           }
/* 130:    */         }
/* 131:    */       }
/* 132:    */     }
/* 133:139 */     for (i1 = 0; i1 < j; i1++)
/* 134:    */     {
/* 135:140 */       atr localatr2 = paramaqu.p(paramdt.b(i1)).c();
/* 136:142 */       if (!localatr2.m()) {
/* 137:143 */         a(paramaqu, paramdt.b(i1), atr.c(atr.a(aty.bg) + i), 10);
/* 138:    */       }
/* 139:    */     }
/* 140:146 */     return true;
/* 141:    */   }
/* 142:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhv
 * JD-Core Version:    0.7.0.1
 */