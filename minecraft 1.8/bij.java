/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bij
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   public bij(boolean paramBoolean)
/*   7:    */   {
/*   8: 16 */     super(paramBoolean);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  12:    */   {
/*  13: 21 */     int i = paramRandom.nextInt(3) + paramRandom.nextInt(2) + 6;
/*  14:    */     
/*  15: 23 */     int j = 1;
/*  16: 24 */     if ((paramdt.o() < 1) || (paramdt.o() + i + 1 > 256)) {
/*  17: 25 */       return false;
/*  18:    */     }
/*  19: 28 */     for (int k = paramdt.o(); k <= paramdt.o() + 1 + i; k++)
/*  20:    */     {
/*  21: 29 */       int m = 1;
/*  22: 30 */       if (k == paramdt.o()) {
/*  23: 31 */         m = 0;
/*  24:    */       }
/*  25: 33 */       if (k >= paramdt.o() + 1 + i - 2) {
/*  26: 34 */         m = 2;
/*  27:    */       }
/*  28: 36 */       for (n = paramdt.n() - m; (n <= paramdt.n() + m) && (j != 0); n++) {
/*  29: 37 */         for (i1 = paramdt.p() - m; (i1 <= paramdt.p() + m) && (j != 0); i1++) {
/*  30: 38 */           if ((k >= 0) && (k < 256))
/*  31:    */           {
/*  32: 39 */             if (!a(paramaqu.p(new dt(n, k, i1)).c())) {
/*  33: 40 */               j = 0;
/*  34:    */             }
/*  35:    */           }
/*  36:    */           else {
/*  37: 43 */             j = 0;
/*  38:    */           }
/*  39:    */         }
/*  40:    */       }
/*  41:    */     }
/*  42: 49 */     if (j == 0) {
/*  43: 50 */       return false;
/*  44:    */     }
/*  45: 53 */     atr localatr = paramaqu.p(paramdt.b()).c();
/*  46: 54 */     if (((localatr != aty.c) && (localatr != aty.d)) || (paramdt.o() >= 256 - i - 1)) {
/*  47: 55 */       return false;
/*  48:    */     }
/*  49: 58 */     a(paramaqu, paramdt.b());
/*  50: 59 */     a(paramaqu, paramdt.a(1, -1, 0));
/*  51: 60 */     a(paramaqu, paramdt.a(1, -1, 1));
/*  52: 61 */     a(paramaqu, paramdt.a(0, -1, 1));
/*  53:    */     
/*  54: 63 */     ej localej = en.a.a(paramRandom);
/*  55: 64 */     int n = i - paramRandom.nextInt(4);
/*  56: 65 */     int i1 = 2 - paramRandom.nextInt(3);
/*  57:    */     
/*  58: 67 */     int i2 = paramdt.n();int i3 = paramdt.p();
/*  59: 68 */     int i4 = 0;
/*  60:    */     int i6;
/*  61: 69 */     for (int i5 = 0; i5 < i; i5++)
/*  62:    */     {
/*  63: 70 */       i6 = paramdt.o() + i5;
/*  64: 71 */       if ((i5 >= n) && (i1 > 0))
/*  65:    */       {
/*  66: 72 */         i2 += localej.g();
/*  67: 73 */         i3 += localej.i();
/*  68: 74 */         i1--;
/*  69:    */       }
/*  70: 76 */       dt localdt = new dt(i2, i6, i3);
/*  71: 77 */       bof localbof = paramaqu.p(localdt).c().r();
/*  72: 78 */       if ((localbof == bof.a) || (localbof == bof.j))
/*  73:    */       {
/*  74: 79 */         a(paramaqu, localdt, aty.s, ayx.f.a() - 4);
/*  75: 80 */         a(paramaqu, localdt.f(), aty.s, ayx.f.a() - 4);
/*  76: 81 */         a(paramaqu, localdt.d(), aty.s, ayx.f.a() - 4);
/*  77: 82 */         a(paramaqu, localdt.f().d(), aty.s, ayx.f.a() - 4);
/*  78: 83 */         i4 = i6;
/*  79:    */       }
/*  80:    */     }
/*  81:    */     int i7;
/*  82: 87 */     for (i5 = -2; i5 <= 0; i5++) {
/*  83: 88 */       for (i6 = -2; i6 <= 0; i6++)
/*  84:    */       {
/*  85: 89 */         i7 = -1;
/*  86: 90 */         a(paramaqu, i2 + i5, i4 + i7, i3 + i6);
/*  87: 91 */         a(paramaqu, 1 + i2 - i5, i4 + i7, i3 + i6);
/*  88: 92 */         a(paramaqu, i2 + i5, i4 + i7, 1 + i3 - i6);
/*  89: 93 */         a(paramaqu, 1 + i2 - i5, i4 + i7, 1 + i3 - i6);
/*  90: 94 */         if (((i5 > -2) || (i6 > -1)) && ((i5 != -1) || (i6 != -2)))
/*  91:    */         {
/*  92: 97 */           i7 = 1;
/*  93: 98 */           a(paramaqu, i2 + i5, i4 + i7, i3 + i6);
/*  94: 99 */           a(paramaqu, 1 + i2 - i5, i4 + i7, i3 + i6);
/*  95:100 */           a(paramaqu, i2 + i5, i4 + i7, 1 + i3 - i6);
/*  96:101 */           a(paramaqu, 1 + i2 - i5, i4 + i7, 1 + i3 - i6);
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:104 */     if (paramRandom.nextBoolean())
/* 101:    */     {
/* 102:105 */       a(paramaqu, i2, i4 + 2, i3);
/* 103:106 */       a(paramaqu, i2 + 1, i4 + 2, i3);
/* 104:107 */       a(paramaqu, i2 + 1, i4 + 2, i3 + 1);
/* 105:108 */       a(paramaqu, i2, i4 + 2, i3 + 1);
/* 106:    */     }
/* 107:110 */     for (i5 = -3; i5 <= 4; i5++) {
/* 108:111 */       for (i6 = -3; i6 <= 4; i6++) {
/* 109:112 */         if (((i5 != -3) || (i6 != -3)) && ((i5 != -3) || (i6 != 4)) && ((i5 != 4) || (i6 != -3)) && ((i5 != 4) || (i6 != 4))) {
/* 110:115 */           if ((Math.abs(i5) < 3) || (Math.abs(i6) < 3)) {
/* 111:118 */             a(paramaqu, i2 + i5, i4, i3 + i6);
/* 112:    */           }
/* 113:    */         }
/* 114:    */       }
/* 115:    */     }
/* 116:123 */     for (i5 = -1; i5 <= 2; i5++) {
/* 117:124 */       for (i6 = -1; i6 <= 2; i6++) {
/* 118:125 */         if ((i5 < 0) || (i5 > 1) || (i6 < 0) || (i6 > 1)) {
/* 119:128 */           if (paramRandom.nextInt(3) <= 0)
/* 120:    */           {
/* 121:131 */             i7 = paramRandom.nextInt(3) + 2;
/* 122:132 */             for (int i8 = 0; i8 < i7; i8++) {
/* 123:133 */               a(paramaqu, new dt(paramdt.n() + i5, i4 - i8 - 1, paramdt.p() + i6), aty.s, ayx.f.a() - 4);
/* 124:    */             }
/* 125:    */             int i9;
/* 126:135 */             for (i8 = -1; i8 <= 1; i8++) {
/* 127:136 */               for (i9 = -1; i9 <= 1; i9++) {
/* 128:137 */                 a(paramaqu, i2 + i5 + i8, i4 - 0, i3 + i6 + i9);
/* 129:    */               }
/* 130:    */             }
/* 131:140 */             for (i8 = -2; i8 <= 2; i8++) {
/* 132:141 */               for (i9 = -2; i9 <= 2; i9++) {
/* 133:142 */                 if ((Math.abs(i8) != 2) || (Math.abs(i9) != 2)) {
/* 134:145 */                   a(paramaqu, i2 + i5 + i8, i4 - 1, i3 + i6 + i9);
/* 135:    */                 }
/* 136:    */               }
/* 137:    */             }
/* 138:    */           }
/* 139:    */         }
/* 140:    */       }
/* 141:    */     }
/* 142:152 */     return true;
/* 143:    */   }
/* 144:    */   
/* 145:    */   private void a(aqu paramaqu, int paramInt1, int paramInt2, int paramInt3)
/* 146:    */   {
/* 147:156 */     atr localatr = paramaqu.p(new dt(paramInt1, paramInt2, paramInt3)).c();
/* 148:157 */     if (localatr.r() == bof.a) {
/* 149:158 */       a(paramaqu, new dt(paramInt1, paramInt2, paramInt3), aty.u, 1);
/* 150:    */     }
/* 151:    */   }
/* 152:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bij
 * JD-Core Version:    0.7.0.1
 */