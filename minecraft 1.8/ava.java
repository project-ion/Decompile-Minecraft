/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class ava
/*   4:    */   extends avb
/*   5:    */ {
/*   6:    */   protected final boolean M;
/*   7:    */   
/*   8:    */   protected ava(boolean paramBoolean)
/*   9:    */   {
/*  10: 22 */     super(bof.q);
/*  11: 23 */     this.M = paramBoolean;
/*  12: 24 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean d()
/*  16:    */   {
/*  17: 29 */     return false;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  21:    */   {
/*  22: 34 */     if (aqu.a(paramaqu, paramdt.b())) {
/*  23: 35 */       return super.c(paramaqu, paramdt);
/*  24:    */     }
/*  25: 38 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean d(aqu paramaqu, dt paramdt)
/*  29:    */   {
/*  30: 42 */     if (aqu.a(paramaqu, paramdt.b())) {
/*  31: 43 */       return true;
/*  32:    */     }
/*  33: 46 */     return false;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom) {}
/*  37:    */   
/*  38:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  39:    */   {
/*  40: 55 */     if (b(paramaqu, paramdt, parambec)) {
/*  41: 56 */       return;
/*  42:    */     }
/*  43: 59 */     boolean bool = e(paramaqu, paramdt, parambec);
/*  44: 60 */     if ((this.M) && (!bool))
/*  45:    */     {
/*  46: 61 */       paramaqu.a(paramdt, k(parambec), 2);
/*  47:    */     }
/*  48: 62 */     else if (!this.M)
/*  49:    */     {
/*  50: 65 */       paramaqu.a(paramdt, e(parambec), 2);
/*  51: 66 */       if (!bool) {
/*  52: 67 */         paramaqu.a(paramdt, e(parambec).c(), m(parambec), -1);
/*  53:    */       }
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/*  58:    */   {
/*  59: 75 */     return paramej.k() != el.b;
/*  60:    */   }
/*  61:    */   
/*  62:    */   protected boolean l(bec parambec)
/*  63:    */   {
/*  64: 79 */     return this.M;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int b(ard paramard, dt paramdt, bec parambec, ej paramej)
/*  68:    */   {
/*  69: 84 */     return a(paramard, paramdt, parambec, paramej);
/*  70:    */   }
/*  71:    */   
/*  72:    */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/*  73:    */   {
/*  74: 89 */     if (!l(parambec)) {
/*  75: 90 */       return 0;
/*  76:    */     }
/*  77: 93 */     if (parambec.b(N) == paramej) {
/*  78: 94 */       return a(paramard, paramdt, parambec);
/*  79:    */     }
/*  80: 97 */     return 0;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  84:    */   {
/*  85:102 */     if (d(paramaqu, paramdt))
/*  86:    */     {
/*  87:103 */       g(paramaqu, paramdt, parambec);
/*  88:104 */       return;
/*  89:    */     }
/*  90:107 */     b(paramaqu, paramdt, parambec, 0);
/*  91:108 */     paramaqu.g(paramdt);
/*  92:109 */     for (ej localej : ej.values()) {
/*  93:110 */       paramaqu.c(paramdt.a(localej), this);
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected void g(aqu paramaqu, dt paramdt, bec parambec)
/*  98:    */   {
/*  99:115 */     if (b(paramaqu, paramdt, parambec)) {
/* 100:116 */       return;
/* 101:    */     }
/* 102:119 */     boolean bool = e(paramaqu, paramdt, parambec);
/* 103:120 */     if (((this.M) && (!bool)) || ((!this.M) && (bool) && (!paramaqu.a(paramdt, this))))
/* 104:    */     {
/* 105:121 */       int i = -1;
/* 106:124 */       if (i(paramaqu, paramdt, parambec)) {
/* 107:125 */         i = -3;
/* 108:126 */       } else if (this.M) {
/* 109:127 */         i = -2;
/* 110:    */       }
/* 111:130 */       paramaqu.a(paramdt, this, d(parambec), i);
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean b(ard paramard, dt paramdt, bec parambec)
/* 116:    */   {
/* 117:135 */     return false;
/* 118:    */   }
/* 119:    */   
/* 120:    */   protected boolean e(aqu paramaqu, dt paramdt, bec parambec)
/* 121:    */   {
/* 122:139 */     return f(paramaqu, paramdt, parambec) > 0;
/* 123:    */   }
/* 124:    */   
/* 125:    */   protected int f(aqu paramaqu, dt paramdt, bec parambec)
/* 126:    */   {
/* 127:143 */     ej localej = (ej)parambec.b(N);
/* 128:    */     
/* 129:145 */     dt localdt = paramdt.a(localej);
/* 130:146 */     int i = paramaqu.c(localdt, localej);
/* 131:147 */     if (i >= 15) {
/* 132:148 */       return i;
/* 133:    */     }
/* 134:151 */     bec localbec = paramaqu.p(localdt);
/* 135:152 */     return Math.max(i, localbec.c() == aty.af ? ((Integer)localbec.b(azt.O)).intValue() : 0);
/* 136:    */   }
/* 137:    */   
/* 138:    */   protected int c(ard paramard, dt paramdt, bec parambec)
/* 139:    */   {
/* 140:156 */     ej localej1 = (ej)parambec.b(N);
/* 141:157 */     ej localej2 = localej1.e();
/* 142:158 */     ej localej3 = localej1.f();
/* 143:159 */     return Math.max(c(paramard, paramdt.a(localej2), localej2), c(paramard, paramdt.a(localej3), localej3));
/* 144:    */   }
/* 145:    */   
/* 146:    */   protected int c(ard paramard, dt paramdt, ej paramej)
/* 147:    */   {
/* 148:163 */     bec localbec = paramard.p(paramdt);
/* 149:164 */     atr localatr = localbec.c();
/* 150:165 */     if (c(localatr))
/* 151:    */     {
/* 152:166 */       if (localatr == aty.af) {
/* 153:167 */         return ((Integer)localbec.b(azt.O)).intValue();
/* 154:    */       }
/* 155:169 */       return paramard.a(paramdt, paramej);
/* 156:    */     }
/* 157:172 */     return 0;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public boolean g()
/* 161:    */   {
/* 162:177 */     return true;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 166:    */   {
/* 167:182 */     return P().a(N, paramxm.aO().d());
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj)
/* 171:    */   {
/* 172:187 */     if (e(paramaqu, paramdt, parambec)) {
/* 173:188 */       paramaqu.a(paramdt, this, 1);
/* 174:    */     }
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 178:    */   {
/* 179:194 */     h(paramaqu, paramdt, parambec);
/* 180:    */   }
/* 181:    */   
/* 182:    */   protected void h(aqu paramaqu, dt paramdt, bec parambec)
/* 183:    */   {
/* 184:198 */     ej localej = (ej)parambec.b(N);
/* 185:199 */     dt localdt = paramdt.a(localej.d());
/* 186:    */     
/* 187:201 */     paramaqu.d(localdt, this);
/* 188:202 */     paramaqu.a(localdt, this, localej);
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void d(aqu paramaqu, dt paramdt, bec parambec)
/* 192:    */   {
/* 193:207 */     if (this.M) {
/* 194:208 */       for (ej localej : ej.values()) {
/* 195:209 */         paramaqu.c(paramdt.a(localej), this);
/* 196:    */       }
/* 197:    */     }
/* 198:212 */     super.d(paramaqu, paramdt, parambec);
/* 199:    */   }
/* 200:    */   
/* 201:    */   public boolean c()
/* 202:    */   {
/* 203:217 */     return false;
/* 204:    */   }
/* 205:    */   
/* 206:    */   protected boolean c(atr paramatr)
/* 207:    */   {
/* 208:228 */     return paramatr.g();
/* 209:    */   }
/* 210:    */   
/* 211:    */   protected int a(ard paramard, dt paramdt, bec parambec)
/* 212:    */   {
/* 213:232 */     return 15;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public static boolean d(atr paramatr)
/* 217:    */   {
/* 218:236 */     return (aty.bb.e(paramatr)) || (aty.cj.e(paramatr));
/* 219:    */   }
/* 220:    */   
/* 221:    */   public boolean e(atr paramatr)
/* 222:    */   {
/* 223:240 */     return (paramatr == e(P()).c()) || (paramatr == k(P()).c());
/* 224:    */   }
/* 225:    */   
/* 226:    */   public boolean i(aqu paramaqu, dt paramdt, bec parambec)
/* 227:    */   {
/* 228:244 */     ej localej = ((ej)parambec.b(N)).d();
/* 229:245 */     dt localdt = paramdt.a(localej);
/* 230:247 */     if (d(paramaqu.p(localdt).c())) {
/* 231:248 */       return paramaqu.p(localdt).b(N) != localej;
/* 232:    */     }
/* 233:250 */     return false;
/* 234:    */   }
/* 235:    */   
/* 236:    */   protected int m(bec parambec)
/* 237:    */   {
/* 238:254 */     return d(parambec);
/* 239:    */   }
/* 240:    */   
/* 241:    */   protected abstract int d(bec parambec);
/* 242:    */   
/* 243:    */   protected abstract bec e(bec parambec);
/* 244:    */   
/* 245:    */   protected abstract bec k(bec parambec);
/* 246:    */   
/* 247:    */   public boolean b(atr paramatr)
/* 248:    */   {
/* 249:265 */     return e(paramatr);
/* 250:    */   }
/* 251:    */   
/* 252:    */   public aql k()
/* 253:    */   {
/* 254:270 */     return aql.c;
/* 255:    */   }
/* 256:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ava
 * JD-Core Version:    0.7.0.1
 */