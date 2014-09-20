/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bil
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   public bil(boolean paramBoolean)
/*   7:    */   {
/*   8: 16 */     super(paramBoolean);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  12:    */   {
/*  13: 21 */     bof localbof1 = paramRandom.nextInt(3) + paramRandom.nextInt(3) + 5;
/*  14:    */     
/*  15: 23 */     int i = 1;
/*  16: 24 */     if ((paramdt.o() < 1) || (paramdt.o() + localbof1 + 1 > 256)) {
/*  17: 25 */       return false;
/*  18:    */     }
/*  19: 28 */     for (int j = paramdt.o(); j <= paramdt.o() + 1 + localbof1; j++)
/*  20:    */     {
/*  21: 29 */       int k = 1;
/*  22: 30 */       if (j == paramdt.o()) {
/*  23: 31 */         k = 0;
/*  24:    */       }
/*  25: 33 */       if (j >= paramdt.o() + 1 + localbof1 - 2) {
/*  26: 34 */         k = 2;
/*  27:    */       }
/*  28: 36 */       for (m = paramdt.n() - k; (m <= paramdt.n() + k) && (i != 0); m++) {
/*  29: 37 */         for (n = paramdt.p() - k; (n <= paramdt.p() + k) && (i != 0); n++) {
/*  30: 38 */           if ((j >= 0) && (j < 256))
/*  31:    */           {
/*  32: 39 */             if (!a(paramaqu.p(new dt(m, j, n)).c())) {
/*  33: 40 */               i = 0;
/*  34:    */             }
/*  35:    */           }
/*  36:    */           else {
/*  37: 43 */             i = 0;
/*  38:    */           }
/*  39:    */         }
/*  40:    */       }
/*  41:    */     }
/*  42: 49 */     if (i == 0) {
/*  43: 50 */       return false;
/*  44:    */     }
/*  45: 53 */     atr localatr = paramaqu.p(paramdt.b()).c();
/*  46: 54 */     if (((localatr != aty.c) && (localatr != aty.d)) || (paramdt.o() >= 256 - localbof1 - 1)) {
/*  47: 55 */       return false;
/*  48:    */     }
/*  49: 58 */     a(paramaqu, paramdt.b());
/*  50:    */     
/*  51: 60 */     ej localej = en.a.a(paramRandom);
/*  52: 61 */     int m = localbof1 - paramRandom.nextInt(4) - 1;
/*  53: 62 */     int n = 3 - paramRandom.nextInt(3);
/*  54:    */     
/*  55: 64 */     int i1 = paramdt.n();int i2 = paramdt.p();
/*  56: 65 */     int i3 = 0;
/*  57:    */     Object localObject3;
/*  58: 66 */     for (int i4 = 0; i4 < localbof1; i4++)
/*  59:    */     {
/*  60: 67 */       localObject2 = paramdt.o() + i4;
/*  61: 68 */       if ((i4 >= m) && (n > 0))
/*  62:    */       {
/*  63: 69 */         i1 += localej.g();
/*  64: 70 */         i2 += localej.i();
/*  65: 71 */         n--;
/*  66:    */       }
/*  67: 73 */       dt localdt1 = new dt(i1, localObject2, i2);
/*  68: 74 */       localObject3 = paramaqu.p(localdt1).c().r();
/*  69: 75 */       if ((localObject3 == bof.a) || (localObject3 == bof.j))
/*  70:    */       {
/*  71: 76 */         a(paramaqu, localdt1, aty.s, ayx.e.a() - 4);
/*  72: 77 */         i3 = localObject2;
/*  73:    */       }
/*  74:    */     }
/*  75: 81 */     Object localObject1 = new dt(i1, i3, i2);
/*  76:    */     int i5;
/*  77: 82 */     for (Object localObject2 = -3; localObject2 <= 3; localObject2++) {
/*  78: 83 */       for (i5 = -3; i5 <= 3; i5++) {
/*  79: 84 */         if ((Math.abs(localObject2) != 3) || (Math.abs(i5) != 3)) {
/*  80: 87 */           b(paramaqu, ((dt)localObject1).a(localObject2, 0, i5));
/*  81:    */         }
/*  82:    */       }
/*  83:    */     }
/*  84: 91 */     localObject1 = ((dt)localObject1).a();
/*  85: 93 */     for (localObject2 = -1; localObject2 <= 1; localObject2++) {
/*  86: 94 */       for (i5 = -1; i5 <= 1; i5++) {
/*  87: 95 */         b(paramaqu, ((dt)localObject1).a(localObject2, 0, i5));
/*  88:    */       }
/*  89:    */     }
/*  90: 99 */     b(paramaqu, ((dt)localObject1).g(2));
/*  91:100 */     b(paramaqu, ((dt)localObject1).f(2));
/*  92:101 */     b(paramaqu, ((dt)localObject1).e(2));
/*  93:102 */     b(paramaqu, ((dt)localObject1).d(2));
/*  94:    */     
/*  95:    */ 
/*  96:105 */     i1 = paramdt.n();
/*  97:106 */     i2 = paramdt.p();
/*  98:107 */     localObject1 = en.a.a(paramRandom);
/*  99:108 */     if (localObject1 != localej)
/* 100:    */     {
/* 101:109 */       localObject2 = m - paramRandom.nextInt(2) - 1;
/* 102:110 */       i5 = 1 + paramRandom.nextInt(3);
/* 103:    */       
/* 104:112 */       i3 = 0;
/* 105:    */       int i6;
/* 106:113 */       for (localObject3 = localObject2; (localObject3 < localbof1) && (i5 > 0); i5--)
/* 107:    */       {
/* 108:114 */         if (localObject3 >= 1)
/* 109:    */         {
/* 110:117 */           i6 = paramdt.o() + localObject3;
/* 111:118 */           i1 += ((ej)localObject1).g();
/* 112:119 */           i2 += ((ej)localObject1).i();
/* 113:120 */           dt localdt2 = new dt(i1, i6, i2);
/* 114:121 */           bof localbof2 = paramaqu.p(localdt2).c().r();
/* 115:122 */           if ((localbof2 == bof.a) || (localbof2 == bof.j))
/* 116:    */           {
/* 117:123 */             a(paramaqu, localdt2, aty.s, ayx.e.a() - 4);
/* 118:124 */             i3 = i6;
/* 119:    */           }
/* 120:    */         }
/* 121:113 */         localObject3++;
/* 122:    */       }
/* 123:127 */       if (i3 > 0)
/* 124:    */       {
/* 125:128 */         localObject3 = new dt(i1, i3, i2);
/* 126:    */         int i7;
/* 127:129 */         for (i6 = -2; i6 <= 2; i6++) {
/* 128:130 */           for (i7 = -2; i7 <= 2; i7++) {
/* 129:131 */             if ((Math.abs(i6) != 2) || (Math.abs(i7) != 2)) {
/* 130:134 */               b(paramaqu, ((dt)localObject3).a(i6, 0, i7));
/* 131:    */             }
/* 132:    */           }
/* 133:    */         }
/* 134:137 */         localObject3 = ((dt)localObject3).a();
/* 135:138 */         for (i6 = -1; i6 <= 1; i6++) {
/* 136:139 */           for (i7 = -1; i7 <= 1; i7++) {
/* 137:140 */             b(paramaqu, ((dt)localObject3).a(i6, 0, i7));
/* 138:    */           }
/* 139:    */         }
/* 140:    */       }
/* 141:    */     }
/* 142:146 */     return true;
/* 143:    */   }
/* 144:    */   
/* 145:    */   private void b(aqu paramaqu, dt paramdt)
/* 146:    */   {
/* 147:150 */     bof localbof = paramaqu.p(paramdt).c().r();
/* 148:151 */     if ((localbof == bof.a) || (localbof == bof.j)) {
/* 149:152 */       a(paramaqu, paramdt, aty.u, 0);
/* 150:    */     }
/* 151:    */   }
/* 152:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bil
 * JD-Core Version:    0.7.0.1
 */