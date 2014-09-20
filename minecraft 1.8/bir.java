/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bir
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   private final int a;
/*   7:    */   private final boolean b;
/*   8:    */   private final int c;
/*   9:    */   private final int d;
/*  10:    */   
/*  11:    */   public bir(boolean paramBoolean)
/*  12:    */   {
/*  13: 20 */     this(paramBoolean, 4, 0, 0, false);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public bir(boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean2)
/*  17:    */   {
/*  18: 24 */     super(paramBoolean1);
/*  19: 25 */     this.a = paramInt1;
/*  20: 26 */     this.c = paramInt2;
/*  21: 27 */     this.d = paramInt3;
/*  22: 28 */     this.b = paramBoolean2;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  26:    */   {
/*  27: 33 */     int i = paramRandom.nextInt(3) + this.a;
/*  28:    */     
/*  29: 35 */     int j = 1;
/*  30: 36 */     if ((paramdt.o() < 1) || (paramdt.o() + i + 1 > 256)) {
/*  31: 37 */       return false;
/*  32:    */     }
/*  33: 40 */     for (int k = paramdt.o(); k <= paramdt.o() + 1 + i; k++)
/*  34:    */     {
/*  35: 41 */       m = 1;
/*  36: 42 */       if (k == paramdt.o()) {
/*  37: 43 */         m = 0;
/*  38:    */       }
/*  39: 45 */       if (k >= paramdt.o() + 1 + i - 2) {
/*  40: 46 */         m = 2;
/*  41:    */       }
/*  42: 48 */       for (n = paramdt.n() - m; (n <= paramdt.n() + m) && (j != 0); n++) {
/*  43: 49 */         for (i1 = paramdt.p() - m; (i1 <= paramdt.p() + m) && (j != 0); i1++) {
/*  44: 50 */           if ((k >= 0) && (k < 256))
/*  45:    */           {
/*  46: 51 */             if (!a(paramaqu.p(new dt(n, k, i1)).c())) {
/*  47: 52 */               j = 0;
/*  48:    */             }
/*  49:    */           }
/*  50:    */           else {
/*  51: 55 */             j = 0;
/*  52:    */           }
/*  53:    */         }
/*  54:    */       }
/*  55:    */     }
/*  56: 61 */     if (j == 0) {
/*  57: 62 */       return false;
/*  58:    */     }
/*  59: 65 */     atr localatr1 = paramaqu.p(paramdt.b()).c();
/*  60: 66 */     if (((localatr1 != aty.c) && (localatr1 != aty.d) && (localatr1 != aty.ak)) || (paramdt.o() >= 256 - i - 1)) {
/*  61: 67 */       return false;
/*  62:    */     }
/*  63: 70 */     a(paramaqu, paramdt.b());
/*  64:    */     
/*  65: 72 */     int m = 3;
/*  66: 73 */     int n = 0;
/*  67:    */     int i4;
/*  68:    */     int i5;
/*  69:    */     int i6;
/*  70:    */     dt localdt3;
/*  71:    */     Object localObject;
/*  72: 74 */     for (int i1 = paramdt.o() - m + i; i1 <= paramdt.o() + i; i1++)
/*  73:    */     {
/*  74: 75 */       int i2 = i1 - (paramdt.o() + i);
/*  75: 76 */       i4 = n + 1 - i2 / 2;
/*  76: 77 */       for (i5 = paramdt.n() - i4; i5 <= paramdt.n() + i4; i5++)
/*  77:    */       {
/*  78: 78 */         i6 = i5 - paramdt.n();
/*  79: 79 */         for (int i7 = paramdt.p() - i4; i7 <= paramdt.p() + i4; i7++)
/*  80:    */         {
/*  81: 80 */           int i8 = i7 - paramdt.p();
/*  82: 81 */           if ((Math.abs(i6) != i4) || (Math.abs(i8) != i4) || ((paramRandom.nextInt(2) != 0) && (i2 != 0)))
/*  83:    */           {
/*  84: 84 */             localdt3 = new dt(i5, i1, i7);
/*  85: 85 */             localObject = paramaqu.p(localdt3).c();
/*  86: 86 */             if ((((atr)localObject).r() == bof.a) || (((atr)localObject).r() == bof.j) || (((atr)localObject).r() == bof.l)) {
/*  87: 87 */               a(paramaqu, localdt3, aty.t, this.d);
/*  88:    */             }
/*  89:    */           }
/*  90:    */         }
/*  91:    */       }
/*  92:    */     }
/*  93: 92 */     for (i1 = 0; i1 < i; i1++)
/*  94:    */     {
/*  95: 93 */       atr localatr2 = paramaqu.p(paramdt.b(i1)).c();
/*  96: 94 */       if ((localatr2.r() == bof.a) || (localatr2.r() == bof.j) || (localatr2.r() == bof.l))
/*  97:    */       {
/*  98: 95 */         a(paramaqu, paramdt.b(i1), aty.r, this.c);
/*  99: 96 */         if ((this.b) && (i1 > 0))
/* 100:    */         {
/* 101: 97 */           if ((paramRandom.nextInt(3) > 0) && (paramaqu.d(paramdt.a(-1, i1, 0)))) {
/* 102: 98 */             a(paramaqu, paramdt.a(-1, i1, 0), aty.bn, bbv.S);
/* 103:    */           }
/* 104:100 */           if ((paramRandom.nextInt(3) > 0) && (paramaqu.d(paramdt.a(1, i1, 0)))) {
/* 105:101 */             a(paramaqu, paramdt.a(1, i1, 0), aty.bn, bbv.T);
/* 106:    */           }
/* 107:103 */           if ((paramRandom.nextInt(3) > 0) && (paramaqu.d(paramdt.a(0, i1, -1)))) {
/* 108:104 */             a(paramaqu, paramdt.a(0, i1, -1), aty.bn, bbv.Q);
/* 109:    */           }
/* 110:106 */           if ((paramRandom.nextInt(3) > 0) && (paramaqu.d(paramdt.a(0, i1, 1)))) {
/* 111:107 */             a(paramaqu, paramdt.a(0, i1, 1), aty.bn, bbv.R);
/* 112:    */           }
/* 113:    */         }
/* 114:    */       }
/* 115:    */     }
/* 116:113 */     if (this.b)
/* 117:    */     {
/* 118:    */       int i3;
/* 119:114 */       for (i1 = paramdt.o() - 3 + i; i1 <= paramdt.o() + i; i1++)
/* 120:    */       {
/* 121:115 */         i3 = i1 - (paramdt.o() + i);
/* 122:116 */         i4 = 2 - i3 / 2;
/* 123:117 */         for (i5 = paramdt.n() - i4; i5 <= paramdt.n() + i4; i5++) {
/* 124:118 */           for (i6 = paramdt.p() - i4; i6 <= paramdt.p() + i4; i6++)
/* 125:    */           {
/* 126:119 */             dt localdt1 = new dt(i5, i1, i6);
/* 127:121 */             if (paramaqu.p(localdt1).c().r() == bof.j)
/* 128:    */             {
/* 129:122 */               dt localdt2 = localdt1.e();
/* 130:123 */               localdt3 = localdt1.f();
/* 131:124 */               localObject = localdt1.c();
/* 132:125 */               dt localdt4 = localdt1.d();
/* 133:127 */               if ((paramRandom.nextInt(4) == 0) && (paramaqu.p(localdt2).c().r() == bof.a)) {
/* 134:128 */                 a(paramaqu, localdt2, bbv.S);
/* 135:    */               }
/* 136:130 */               if ((paramRandom.nextInt(4) == 0) && (paramaqu.p(localdt3).c().r() == bof.a)) {
/* 137:131 */                 a(paramaqu, localdt3, bbv.T);
/* 138:    */               }
/* 139:133 */               if ((paramRandom.nextInt(4) == 0) && (paramaqu.p((dt)localObject).c().r() == bof.a)) {
/* 140:134 */                 a(paramaqu, (dt)localObject, bbv.Q);
/* 141:    */               }
/* 142:136 */               if ((paramRandom.nextInt(4) == 0) && (paramaqu.p(localdt4).c().r() == bof.a)) {
/* 143:137 */                 a(paramaqu, localdt4, bbv.R);
/* 144:    */               }
/* 145:    */             }
/* 146:    */           }
/* 147:    */         }
/* 148:    */       }
/* 149:145 */       if ((paramRandom.nextInt(5) == 0) && (i > 5)) {
/* 150:146 */         for (i1 = 0; i1 < 2; i1++) {
/* 151:147 */           for (i3 = 0; i3 < 4; i3++) {
/* 152:148 */             if (paramRandom.nextInt(4 - i1) == 0)
/* 153:    */             {
/* 154:149 */               i4 = paramRandom.nextInt(3);
/* 155:150 */               ej localej = ej.b(i3).d();
/* 156:    */               
/* 157:152 */               a(paramaqu, paramdt.a(localej.g(), i - 5 + i1, localej.i()), aty.bN, i4 << 2 | ej.b(i3).b());
/* 158:    */             }
/* 159:    */           }
/* 160:    */         }
/* 161:    */       }
/* 162:    */     }
/* 163:158 */     return true;
/* 164:    */   }
/* 165:    */   
/* 166:    */   private void a(aqu paramaqu, dt paramdt, int paramInt)
/* 167:    */   {
/* 168:162 */     a(paramaqu, paramdt, aty.bn, paramInt);
/* 169:163 */     int i = 4;
/* 170:    */     
/* 171:165 */     paramdt = paramdt.b();
/* 172:166 */     while ((paramaqu.p(paramdt).c().r() == bof.a) && (i > 0))
/* 173:    */     {
/* 174:167 */       a(paramaqu, paramdt, aty.bn, paramInt);
/* 175:168 */       paramdt = paramdt.b();
/* 176:169 */       i--;
/* 177:    */     }
/* 178:    */   }
/* 179:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bir
 * JD-Core Version:    0.7.0.1
 */