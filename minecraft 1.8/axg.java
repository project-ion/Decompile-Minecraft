/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class axg
/*   4:    */   extends bbo
/*   5:    */ {
/*   6: 22 */   public static final bet a = bet.a("decayable");
/*   7: 23 */   public static final bet b = bet.a("check_decay");
/*   8:    */   int[] M;
/*   9:    */   protected int N;
/*  10:    */   protected boolean O;
/*  11:    */   
/*  12:    */   public axg()
/*  13:    */   {
/*  14: 34 */     super(bof.j, false);
/*  15: 35 */     a(true);
/*  16: 36 */     a(akf.c);
/*  17: 37 */     c(0.2F);
/*  18: 38 */     e(1);
/*  19: 39 */     a(h);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int F()
/*  23:    */   {
/*  24: 44 */     return aqp.a(0.5D, 1.0D);
/*  25:    */   }
/*  26:    */   
/*  27:    */   public int h(bec parambec)
/*  28:    */   {
/*  29: 49 */     return aqp.c();
/*  30:    */   }
/*  31:    */   
/*  32:    */   public int a(ard paramard, dt paramdt, int paramInt)
/*  33:    */   {
/*  34: 54 */     return art.b(paramard, paramdt);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/*  38:    */   {
/*  39: 59 */     int i = 1;
/*  40: 60 */     int j = i + 1;
/*  41: 61 */     int k = paramdt.n();
/*  42: 62 */     int m = paramdt.o();
/*  43: 63 */     int n = paramdt.p();
/*  44: 65 */     if (paramaqu.a(new dt(k - j, m - j, n - j), new dt(k + j, m + j, n + j))) {
/*  45: 66 */       for (int i1 = -i; i1 <= i; i1++) {
/*  46: 67 */         for (int i2 = -i; i2 <= i; i2++) {
/*  47: 68 */           for (int i3 = -i; i3 <= i; i3++)
/*  48:    */           {
/*  49: 69 */             dt localdt = paramdt.a(i1, i2, i3);
/*  50: 70 */             bec localbec = paramaqu.p(localdt);
/*  51: 71 */             if ((localbec.c().r() == bof.j) && 
/*  52: 72 */               (!((Boolean)localbec.b(b)).booleanValue())) {
/*  53: 73 */               paramaqu.a(localdt, localbec.a(b, Boolean.valueOf(true)), 4);
/*  54:    */             }
/*  55:    */           }
/*  56:    */         }
/*  57:    */       }
/*  58:    */     }
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  62:    */   {
/*  63: 84 */     if (paramaqu.D) {
/*  64: 85 */       return;
/*  65:    */     }
/*  66: 89 */     if ((((Boolean)parambec.b(b)).booleanValue()) && (((Boolean)parambec.b(a)).booleanValue()))
/*  67:    */     {
/*  68: 90 */       int i = 4;
/*  69: 91 */       int j = i + 1;
/*  70: 92 */       int k = paramdt.n();
/*  71: 93 */       int m = paramdt.o();
/*  72: 94 */       int n = paramdt.p();
/*  73:    */       
/*  74: 96 */       int i1 = 32;
/*  75: 97 */       int i2 = i1 * i1;
/*  76: 98 */       int i3 = i1 / 2;
/*  77: 99 */       if (this.M == null) {
/*  78:100 */         this.M = new int[i1 * i1 * i1];
/*  79:    */       }
/*  80:103 */       if (paramaqu.a(new dt(k - j, m - j, n - j), new dt(k + j, m + j, n + j)))
/*  81:    */       {
/*  82:    */         int i5;
/*  83:    */         int i6;
/*  84:104 */         for (i4 = -i; i4 <= i; i4++) {
/*  85:105 */           for (i5 = -i; i5 <= i; i5++) {
/*  86:106 */             for (i6 = -i; i6 <= i; i6++)
/*  87:    */             {
/*  88:107 */               atr localatr = paramaqu.p(new dt(k + i4, m + i5, n + i6)).c();
/*  89:108 */               if ((localatr == aty.r) || (localatr == aty.s)) {
/*  90:109 */                 this.M[((i4 + i3) * i2 + (i5 + i3) * i1 + (i6 + i3))] = 0;
/*  91:110 */               } else if (localatr.r() == bof.j) {
/*  92:111 */                 this.M[((i4 + i3) * i2 + (i5 + i3) * i1 + (i6 + i3))] = -2;
/*  93:    */               } else {
/*  94:113 */                 this.M[((i4 + i3) * i2 + (i5 + i3) * i1 + (i6 + i3))] = -1;
/*  95:    */               }
/*  96:    */             }
/*  97:    */           }
/*  98:    */         }
/*  99:118 */         for (i4 = 1; i4 <= 4; i4++) {
/* 100:119 */           for (i5 = -i; i5 <= i; i5++) {
/* 101:120 */             for (i6 = -i; i6 <= i; i6++) {
/* 102:121 */               for (int i7 = -i; i7 <= i; i7++) {
/* 103:122 */                 if (this.M[((i5 + i3) * i2 + (i6 + i3) * i1 + (i7 + i3))] == i4 - 1)
/* 104:    */                 {
/* 105:123 */                   if (this.M[((i5 + i3 - 1) * i2 + (i6 + i3) * i1 + (i7 + i3))] == -2) {
/* 106:124 */                     this.M[((i5 + i3 - 1) * i2 + (i6 + i3) * i1 + (i7 + i3))] = i4;
/* 107:    */                   }
/* 108:126 */                   if (this.M[((i5 + i3 + 1) * i2 + (i6 + i3) * i1 + (i7 + i3))] == -2) {
/* 109:127 */                     this.M[((i5 + i3 + 1) * i2 + (i6 + i3) * i1 + (i7 + i3))] = i4;
/* 110:    */                   }
/* 111:129 */                   if (this.M[((i5 + i3) * i2 + (i6 + i3 - 1) * i1 + (i7 + i3))] == -2) {
/* 112:130 */                     this.M[((i5 + i3) * i2 + (i6 + i3 - 1) * i1 + (i7 + i3))] = i4;
/* 113:    */                   }
/* 114:132 */                   if (this.M[((i5 + i3) * i2 + (i6 + i3 + 1) * i1 + (i7 + i3))] == -2) {
/* 115:133 */                     this.M[((i5 + i3) * i2 + (i6 + i3 + 1) * i1 + (i7 + i3))] = i4;
/* 116:    */                   }
/* 117:135 */                   if (this.M[((i5 + i3) * i2 + (i6 + i3) * i1 + (i7 + i3 - 1))] == -2) {
/* 118:136 */                     this.M[((i5 + i3) * i2 + (i6 + i3) * i1 + (i7 + i3 - 1))] = i4;
/* 119:    */                   }
/* 120:138 */                   if (this.M[((i5 + i3) * i2 + (i6 + i3) * i1 + (i7 + i3 + 1))] == -2) {
/* 121:139 */                     this.M[((i5 + i3) * i2 + (i6 + i3) * i1 + (i7 + i3 + 1))] = i4;
/* 122:    */                   }
/* 123:    */                 }
/* 124:    */               }
/* 125:    */             }
/* 126:    */           }
/* 127:    */         }
/* 128:    */       }
/* 129:148 */       int i4 = this.M[(i3 * i2 + i3 * i1 + i3)];
/* 130:149 */       if (i4 >= 0) {
/* 131:150 */         paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(false)), 4);
/* 132:    */       } else {
/* 133:152 */         d(paramaqu, paramdt);
/* 134:    */       }
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 139:    */   {
/* 140:159 */     if ((paramaqu.C(paramdt.a())) && (!aqu.a(paramaqu, paramdt.b())) && (paramRandom.nextInt(15) == 1))
/* 141:    */     {
/* 142:160 */       double d1 = paramdt.n() + paramRandom.nextFloat();
/* 143:161 */       double d2 = paramdt.o() - 0.05D;
/* 144:162 */       double d3 = paramdt.p() + paramRandom.nextFloat();
/* 145:    */       
/* 146:164 */       paramaqu.a(ew.s, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 147:    */     }
/* 148:    */   }
/* 149:    */   
/* 150:    */   private void d(aqu paramaqu, dt paramdt)
/* 151:    */   {
/* 152:169 */     b(paramaqu, paramdt, paramaqu.p(paramdt), 0);
/* 153:170 */     paramaqu.g(paramdt);
/* 154:    */   }
/* 155:    */   
/* 156:    */   public int a(Random paramRandom)
/* 157:    */   {
/* 158:175 */     return paramRandom.nextInt(20) == 0 ? 1 : 0;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 162:    */   {
/* 163:181 */     return alq.a(aty.g);
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/* 167:    */   {
/* 168:186 */     if (!paramaqu.D)
/* 169:    */     {
/* 170:187 */       int i = d(parambec);
/* 171:188 */       if (paramInt > 0)
/* 172:    */       {
/* 173:189 */         i -= (2 << paramInt);
/* 174:190 */         if (i < 10) {
/* 175:191 */           i = 10;
/* 176:    */         }
/* 177:    */       }
/* 178:194 */       if (paramaqu.s.nextInt(i) == 0)
/* 179:    */       {
/* 180:195 */         alq localalq = a(parambec, paramaqu.s, paramInt);
/* 181:196 */         a(paramaqu, paramdt, new amj(localalq, 1, a(parambec)));
/* 182:    */       }
/* 183:199 */       i = 200;
/* 184:200 */       if (paramInt > 0)
/* 185:    */       {
/* 186:201 */         i -= (10 << paramInt);
/* 187:202 */         if (i < 40) {
/* 188:203 */           i = 40;
/* 189:    */         }
/* 190:    */       }
/* 191:206 */       a(paramaqu, paramdt, parambec, i);
/* 192:    */     }
/* 193:    */   }
/* 194:    */   
/* 195:    */   protected void a(aqu paramaqu, dt paramdt, bec parambec, int paramInt) {}
/* 196:    */   
/* 197:    */   protected int d(bec parambec)
/* 198:    */   {
/* 199:215 */     return 20;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public boolean c()
/* 203:    */   {
/* 204:220 */     return !this.Q;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void b(boolean paramBoolean)
/* 208:    */   {
/* 209:224 */     this.O = paramBoolean;
/* 210:225 */     this.Q = paramBoolean;
/* 211:226 */     this.N = (paramBoolean ? 0 : 1);
/* 212:    */   }
/* 213:    */   
/* 214:    */   public aql k()
/* 215:    */   {
/* 216:234 */     return this.O ? aql.b : aql.a;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public boolean u()
/* 220:    */   {
/* 221:239 */     return false;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public abstract ayx b(int paramInt);
/* 225:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axg
 * JD-Core Version:    0.7.0.1
 */