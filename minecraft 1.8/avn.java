/*   1:    */ import java.util.EnumSet;
/*   2:    */ import java.util.Random;
/*   3:    */ import java.util.Set;
/*   4:    */ 
/*   5:    */ public class avn
/*   6:    */   extends axl
/*   7:    */ {
/*   8:    */   int a;
/*   9:    */   
/*  10:    */   protected avn(bof parambof)
/*  11:    */   {
/*  12: 15 */     super(parambof);
/*  13:    */   }
/*  14:    */   
/*  15:    */   private void f(aqu paramaqu, dt paramdt, bec parambec)
/*  16:    */   {
/*  17: 19 */     paramaqu.a(paramdt, b(this.J).P().a(b, parambec.b(b)), 2);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  21:    */   {
/*  22: 26 */     int i = ((Integer)parambec.b(b)).intValue();
/*  23:    */     
/*  24: 28 */     int j = 1;
/*  25: 29 */     if ((this.J == bof.i) && (!paramaqu.t.n())) {
/*  26: 30 */       j = 2;
/*  27:    */     }
/*  28: 33 */     int k = a(paramaqu);
/*  29: 34 */     if (i > 0)
/*  30:    */     {
/*  31: 35 */       int m = -100;
/*  32: 36 */       this.a = 0;
/*  33: 38 */       for (ej localej1 : en.a) {
/*  34: 39 */         m = a(paramaqu, paramdt.a(localej1), m);
/*  35:    */       }
/*  36: 42 */       int n = m + j;
/*  37: 43 */       if ((n >= 8) || (m < 0)) {
/*  38: 44 */         n = -1;
/*  39:    */       }
/*  40: 46 */       if (e(paramaqu, paramdt.a()) >= 0)
/*  41:    */       {
/*  42: 47 */         int i1 = e(paramaqu, paramdt.a());
/*  43: 48 */         if (i1 >= 8) {
/*  44: 49 */           n = i1;
/*  45:    */         } else {
/*  46: 51 */           n = i1 + 8;
/*  47:    */         }
/*  48:    */       }
/*  49: 54 */       if ((this.a >= 2) && (this.J == bof.h))
/*  50:    */       {
/*  51: 57 */         bec localbec2 = paramaqu.p(paramdt.b());
/*  52: 58 */         if (localbec2.c().r().a()) {
/*  53: 59 */           n = 0;
/*  54: 60 */         } else if ((localbec2.c().r() == this.J) && (((Integer)localbec2.b(b)).intValue() == 0)) {
/*  55: 61 */           n = 0;
/*  56:    */         }
/*  57:    */       }
/*  58: 64 */       if ((this.J == bof.i) && 
/*  59: 65 */         (i < 8) && (n < 8) && 
/*  60: 66 */         (n > i) && 
/*  61: 67 */         (paramRandom.nextInt(4) != 0)) {
/*  62: 68 */         k *= 4;
/*  63:    */       }
/*  64: 73 */       if (n == i)
/*  65:    */       {
/*  66: 74 */         f(paramaqu, paramdt, parambec);
/*  67:    */       }
/*  68:    */       else
/*  69:    */       {
/*  70: 76 */         i = n;
/*  71: 77 */         if (i < 0)
/*  72:    */         {
/*  73: 78 */           paramaqu.g(paramdt);
/*  74:    */         }
/*  75:    */         else
/*  76:    */         {
/*  77: 80 */           parambec = parambec.a(b, Integer.valueOf(i));
/*  78: 81 */           paramaqu.a(paramdt, parambec, 2);
/*  79: 82 */           paramaqu.a(paramdt, this, k);
/*  80: 83 */           paramaqu.c(paramdt, this);
/*  81:    */         }
/*  82:    */       }
/*  83:    */     }
/*  84:    */     else
/*  85:    */     {
/*  86: 87 */       f(paramaqu, paramdt, parambec);
/*  87:    */     }
/*  88: 90 */     bec localbec1 = paramaqu.p(paramdt.b());
/*  89:    */     int i2;
/*  90: 92 */     if (h(paramaqu, paramdt.b(), localbec1))
/*  91:    */     {
/*  92: 93 */       if ((this.J == bof.i) && 
/*  93: 94 */         (paramaqu.p(paramdt.b()).c().r() == bof.h))
/*  94:    */       {
/*  95: 95 */         paramaqu.a(paramdt.b(), aty.b.P());
/*  96: 96 */         d(paramaqu, paramdt.b());
/*  97: 97 */         return;
/*  98:    */       }
/*  99:101 */       if (i >= 8) {
/* 100:102 */         a(paramaqu, paramdt.b(), localbec1, i);
/* 101:    */       } else {
/* 102:104 */         a(paramaqu, paramdt.b(), localbec1, i + 8);
/* 103:    */       }
/* 104:    */     }
/* 105:106 */     else if ((i >= 0) && ((i == 0) || (g(paramaqu, paramdt.b(), localbec1))))
/* 106:    */     {
/* 107:107 */       Set localSet = e(paramaqu, paramdt);
/* 108:108 */       i2 = i + j;
/* 109:109 */       if (i >= 8) {
/* 110:110 */         i2 = 1;
/* 111:    */       }
/* 112:112 */       if (i2 >= 8) {
/* 113:113 */         return;
/* 114:    */       }
/* 115:115 */       for (ej localej2 : localSet) {
/* 116:116 */         a(paramaqu, paramdt.a(localej2), paramaqu.p(paramdt.a(localej2)), i2);
/* 117:    */       }
/* 118:    */     }
/* 119:    */   }
/* 120:    */   
/* 121:    */   private void a(aqu paramaqu, dt paramdt, bec parambec, int paramInt)
/* 122:    */   {
/* 123:122 */     if (h(paramaqu, paramdt, parambec))
/* 124:    */     {
/* 125:123 */       if (parambec.c() != aty.a) {
/* 126:124 */         if (this.J == bof.i) {
/* 127:125 */           d(paramaqu, paramdt);
/* 128:    */         } else {
/* 129:127 */           parambec.c().b(paramaqu, paramdt, parambec, 0);
/* 130:    */         }
/* 131:    */       }
/* 132:130 */       paramaqu.a(paramdt, P().a(b, Integer.valueOf(paramInt)), 3);
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   private int a(aqu paramaqu, dt paramdt, int paramInt, ej paramej)
/* 137:    */   {
/* 138:135 */     int i = 1000;
/* 139:136 */     for (ej localej : en.a) {
/* 140:137 */       if (localej != paramej)
/* 141:    */       {
/* 142:141 */         dt localdt = paramdt.a(localej);
/* 143:142 */         bec localbec = paramaqu.p(localdt);
/* 144:144 */         if ((!g(paramaqu, localdt, localbec)) && ((localbec.c().r() != this.J) || (((Integer)localbec.b(b)).intValue() > 0))) {
/* 145:145 */           if (g(paramaqu, localdt.b(), localbec))
/* 146:    */           {
/* 147:146 */             if (paramInt < 4)
/* 148:    */             {
/* 149:147 */               int j = a(paramaqu, localdt, paramInt + 1, localej.d());
/* 150:148 */               if (j < i) {
/* 151:149 */                 i = j;
/* 152:    */               }
/* 153:    */             }
/* 154:    */           }
/* 155:    */           else {
/* 156:153 */             return paramInt;
/* 157:    */           }
/* 158:    */         }
/* 159:    */       }
/* 160:    */     }
/* 161:157 */     return i;
/* 162:    */   }
/* 163:    */   
/* 164:    */   private Set e(aqu paramaqu, dt paramdt)
/* 165:    */   {
/* 166:161 */     int i = 1000;
/* 167:162 */     EnumSet localEnumSet = EnumSet.noneOf(ej.class);
/* 168:164 */     for (ej localej : en.a)
/* 169:    */     {
/* 170:165 */       dt localdt = paramdt.a(localej);
/* 171:166 */       bec localbec = paramaqu.p(localdt);
/* 172:168 */       if ((!g(paramaqu, localdt, localbec)) && ((localbec.c().r() != this.J) || (((Integer)localbec.b(b)).intValue() > 0)))
/* 173:    */       {
/* 174:    */         int j;
/* 175:170 */         if (g(paramaqu, localdt.b(), paramaqu.p(localdt.b()))) {
/* 176:171 */           j = a(paramaqu, localdt, 1, localej.d());
/* 177:    */         } else {
/* 178:173 */           j = 0;
/* 179:    */         }
/* 180:176 */         if (j < i) {
/* 181:177 */           localEnumSet.clear();
/* 182:    */         }
/* 183:180 */         if (j <= i)
/* 184:    */         {
/* 185:181 */           localEnumSet.add(localej);
/* 186:182 */           i = j;
/* 187:    */         }
/* 188:    */       }
/* 189:    */     }
/* 190:187 */     return localEnumSet;
/* 191:    */   }
/* 192:    */   
/* 193:    */   private boolean g(aqu paramaqu, dt paramdt, bec parambec)
/* 194:    */   {
/* 195:191 */     atr localatr = paramaqu.p(paramdt).c();
/* 196:192 */     if (((localatr instanceof avf)) || (localatr == aty.an) || (localatr == aty.au) || (localatr == aty.aM)) {
/* 197:193 */       return true;
/* 198:    */     }
/* 199:195 */     if (localatr.J == bof.E) {
/* 200:196 */       return true;
/* 201:    */     }
/* 202:199 */     return localatr.J.c();
/* 203:    */   }
/* 204:    */   
/* 205:    */   protected int a(aqu paramaqu, dt paramdt, int paramInt)
/* 206:    */   {
/* 207:203 */     int i = e(paramaqu, paramdt);
/* 208:204 */     if (i < 0) {
/* 209:205 */       return paramInt;
/* 210:    */     }
/* 211:207 */     if (i == 0) {
/* 212:208 */       this.a += 1;
/* 213:    */     }
/* 214:210 */     if (i >= 8) {
/* 215:211 */       i = 0;
/* 216:    */     }
/* 217:213 */     return (paramInt < 0) || (i < paramInt) ? i : paramInt;
/* 218:    */   }
/* 219:    */   
/* 220:    */   private boolean h(aqu paramaqu, dt paramdt, bec parambec)
/* 221:    */   {
/* 222:217 */     bof localbof = parambec.c().r();
/* 223:218 */     return (localbof != this.J) && (localbof != bof.i) && (!g(paramaqu, paramdt, parambec));
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 227:    */   {
/* 228:223 */     if (!e(paramaqu, paramdt, parambec)) {
/* 229:224 */       paramaqu.a(paramdt, this, a(paramaqu));
/* 230:    */     }
/* 231:    */   }
/* 232:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avn
 * JD-Core Version:    0.7.0.1
 */