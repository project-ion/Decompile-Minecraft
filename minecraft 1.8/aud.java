/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class aud
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 25 */   public static final beu a = beu.a("facing");
/*   8: 26 */   public static final bet b = bet.a("powered");
/*   9:    */   private final boolean M;
/*  10:    */   
/*  11:    */   protected aud(boolean paramBoolean)
/*  12:    */   {
/*  13: 31 */     super(bof.q);
/*  14: 32 */     j(this.L.b().a(a, ej.c).a(b, Boolean.valueOf(false)));
/*  15: 33 */     a(true);
/*  16: 34 */     a(akf.d);
/*  17: 35 */     this.M = paramBoolean;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  21:    */   {
/*  22: 41 */     return null;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public int a(aqu paramaqu)
/*  26:    */   {
/*  27: 46 */     return this.M ? 30 : 20;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean c()
/*  31:    */   {
/*  32: 51 */     return false;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean d()
/*  36:    */   {
/*  37: 56 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean a(aqu paramaqu, dt paramdt, ej paramej)
/*  41:    */   {
/*  42: 61 */     return paramaqu.p(paramdt.a(paramej.d())).c().t();
/*  43:    */   }
/*  44:    */   
/*  45:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  46:    */   {
/*  47: 66 */     for (ej localej : ) {
/*  48: 67 */       if (paramaqu.p(paramdt.a(localej)).c().t()) {
/*  49: 68 */         return true;
/*  50:    */       }
/*  51:    */     }
/*  52: 71 */     return false;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  56:    */   {
/*  57: 76 */     if (paramaqu.p(paramdt.a(paramej.d())).c().t()) {
/*  58: 77 */       return P().a(a, paramej).a(b, Boolean.valueOf(false));
/*  59:    */     }
/*  60: 79 */     return P().a(a, ej.a).a(b, Boolean.valueOf(false));
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  64:    */   {
/*  65: 85 */     if (e(paramaqu, paramdt, parambec))
/*  66:    */     {
/*  67: 86 */       ej localej = (ej)parambec.b(a);
/*  68: 88 */       if (!paramaqu.p(paramdt.a(localej.d())).c().t())
/*  69:    */       {
/*  70: 89 */         b(paramaqu, paramdt, parambec, 0);
/*  71: 90 */         paramaqu.g(paramdt);
/*  72:    */       }
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   private boolean e(aqu paramaqu, dt paramdt, bec parambec)
/*  77:    */   {
/*  78: 96 */     if (!c(paramaqu, paramdt))
/*  79:    */     {
/*  80: 97 */       b(paramaqu, paramdt, parambec, 0);
/*  81: 98 */       paramaqu.g(paramdt);
/*  82: 99 */       return false;
/*  83:    */     }
/*  84:101 */     return true;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void a(ard paramard, dt paramdt)
/*  88:    */   {
/*  89:106 */     d(paramard.p(paramdt));
/*  90:    */   }
/*  91:    */   
/*  92:    */   private void d(bec parambec)
/*  93:    */   {
/*  94:110 */     ej localej = (ej)parambec.b(a);
/*  95:111 */     boolean bool = ((Boolean)parambec.b(b)).booleanValue();
/*  96:    */     
/*  97:113 */     float f1 = 0.25F;
/*  98:114 */     float f2 = 0.375F;
/*  99:115 */     float f3 = (bool ? 1 : 2) / 16.0F;
/* 100:116 */     float f4 = 0.125F;
/* 101:117 */     float f5 = 0.1875F;
/* 102:119 */     switch (aue.a[localej.ordinal()])
/* 103:    */     {
/* 104:    */     case 1: 
/* 105:121 */       a(0.0F, 0.375F, 0.3125F, f3, 0.625F, 0.6875F);
/* 106:122 */       break;
/* 107:    */     case 2: 
/* 108:124 */       a(1.0F - f3, 0.375F, 0.3125F, 1.0F, 0.625F, 0.6875F);
/* 109:125 */       break;
/* 110:    */     case 3: 
/* 111:127 */       a(0.3125F, 0.375F, 0.0F, 0.6875F, 0.625F, f3);
/* 112:128 */       break;
/* 113:    */     case 4: 
/* 114:130 */       a(0.3125F, 0.375F, 1.0F - f3, 0.6875F, 0.625F, 1.0F);
/* 115:131 */       break;
/* 116:    */     case 5: 
/* 117:133 */       a(0.3125F, 0.0F, 0.375F, 0.6875F, 0.0F + f3, 0.625F);
/* 118:134 */       break;
/* 119:    */     case 6: 
/* 120:136 */       a(0.3125F, 1.0F - f3, 0.375F, 0.6875F, 1.0F, 0.625F);
/* 121:    */     }
/* 122:    */   }
/* 123:    */   
/* 124:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 125:    */   {
/* 126:143 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 127:144 */       return true;
/* 128:    */     }
/* 129:147 */     paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(true)), 3);
/* 130:148 */     paramaqu.b(paramdt, paramdt);
/* 131:    */     
/* 132:150 */     paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "random.click", 0.3F, 0.6F);
/* 133:    */     
/* 134:152 */     b(paramaqu, paramdt, (ej)parambec.b(a));
/* 135:    */     
/* 136:154 */     paramaqu.a(paramdt, this, a(paramaqu));
/* 137:    */     
/* 138:156 */     return true;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 142:    */   {
/* 143:161 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 144:162 */       b(paramaqu, paramdt, (ej)parambec.b(a));
/* 145:    */     }
/* 146:164 */     super.b(paramaqu, paramdt, parambec);
/* 147:    */   }
/* 148:    */   
/* 149:    */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 150:    */   {
/* 151:169 */     return ((Boolean)parambec.b(b)).booleanValue() ? 15 : 0;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public int b(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 155:    */   {
/* 156:174 */     if (!((Boolean)parambec.b(b)).booleanValue()) {
/* 157:175 */       return 0;
/* 158:    */     }
/* 159:178 */     if (parambec.b(a) == paramej) {
/* 160:179 */       return 15;
/* 161:    */     }
/* 162:182 */     return 0;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public boolean g()
/* 166:    */   {
/* 167:187 */     return true;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom) {}
/* 171:    */   
/* 172:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 173:    */   {
/* 174:196 */     if (paramaqu.D) {
/* 175:197 */       return;
/* 176:    */     }
/* 177:199 */     if (!((Boolean)parambec.b(b)).booleanValue()) {
/* 178:200 */       return;
/* 179:    */     }
/* 180:202 */     if (this.M)
/* 181:    */     {
/* 182:203 */       f(paramaqu, paramdt, parambec);
/* 183:    */     }
/* 184:    */     else
/* 185:    */     {
/* 186:205 */       paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(false)));
/* 187:    */       
/* 188:207 */       b(paramaqu, paramdt, (ej)parambec.b(a));
/* 189:    */       
/* 190:209 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "random.click", 0.3F, 0.5F);
/* 191:210 */       paramaqu.b(paramdt, paramdt);
/* 192:    */     }
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void h()
/* 196:    */   {
/* 197:216 */     float f1 = 0.1875F;
/* 198:217 */     float f2 = 0.125F;
/* 199:218 */     float f3 = 0.125F;
/* 200:219 */     a(0.5F - f1, 0.5F - f2, 0.5F - f3, 0.5F + f1, 0.5F + f2, 0.5F + f3);
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, wv paramwv)
/* 204:    */   {
/* 205:224 */     if (paramaqu.D) {
/* 206:225 */       return;
/* 207:    */     }
/* 208:227 */     if (!this.M) {
/* 209:228 */       return;
/* 210:    */     }
/* 211:231 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 212:232 */       return;
/* 213:    */     }
/* 214:235 */     f(paramaqu, paramdt, parambec);
/* 215:    */   }
/* 216:    */   
/* 217:    */   private void f(aqu paramaqu, dt paramdt, bec parambec)
/* 218:    */   {
/* 219:239 */     d(parambec);
/* 220:240 */     List localList = paramaqu.a(ahj.class, new brt(paramdt.n() + this.B, paramdt.o() + this.C, paramdt.p() + this.D, paramdt.n() + this.E, paramdt.o() + this.F, paramdt.p() + this.G));
/* 221:241 */     int i = !localList.isEmpty() ? 1 : 0;
/* 222:242 */     boolean bool = ((Boolean)parambec.b(b)).booleanValue();
/* 223:244 */     if ((i != 0) && (!bool))
/* 224:    */     {
/* 225:245 */       paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(true)));
/* 226:246 */       b(paramaqu, paramdt, (ej)parambec.b(a));
/* 227:247 */       paramaqu.b(paramdt, paramdt);
/* 228:    */       
/* 229:249 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "random.click", 0.3F, 0.6F);
/* 230:    */     }
/* 231:251 */     if ((i == 0) && (bool))
/* 232:    */     {
/* 233:252 */       paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(false)));
/* 234:253 */       b(paramaqu, paramdt, (ej)parambec.b(a));
/* 235:254 */       paramaqu.b(paramdt, paramdt);
/* 236:    */       
/* 237:256 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "random.click", 0.3F, 0.5F);
/* 238:    */     }
/* 239:259 */     if (i != 0) {
/* 240:260 */       paramaqu.a(paramdt, this, a(paramaqu));
/* 241:    */     }
/* 242:    */   }
/* 243:    */   
/* 244:    */   private void b(aqu paramaqu, dt paramdt, ej paramej)
/* 245:    */   {
/* 246:265 */     paramaqu.c(paramdt, this);
/* 247:266 */     paramaqu.c(paramdt.a(paramej.d()), this);
/* 248:    */   }
/* 249:    */   
/* 250:    */   public bec a(int paramInt)
/* 251:    */   {
/* 252:    */     ej localej;
/* 253:272 */     switch (paramInt & 0x7)
/* 254:    */     {
/* 255:    */     case 0: 
/* 256:274 */       localej = ej.a;
/* 257:275 */       break;
/* 258:    */     case 1: 
/* 259:277 */       localej = ej.f;
/* 260:278 */       break;
/* 261:    */     case 2: 
/* 262:280 */       localej = ej.e;
/* 263:281 */       break;
/* 264:    */     case 3: 
/* 265:283 */       localej = ej.d;
/* 266:284 */       break;
/* 267:    */     case 4: 
/* 268:286 */       localej = ej.c;
/* 269:287 */       break;
/* 270:    */     case 5: 
/* 271:    */     default: 
/* 272:290 */       localej = ej.b;
/* 273:    */     }
/* 274:294 */     return P().a(a, localej).a(b, Boolean.valueOf((paramInt & 0x8) > 0));
/* 275:    */   }
/* 276:    */   
/* 277:    */   public int c(bec parambec)
/* 278:    */   {
/* 279:    */     int i;
/* 280:302 */     switch (aue.a[((ej)parambec.b(a)).ordinal()])
/* 281:    */     {
/* 282:    */     case 6: 
/* 283:304 */       i = 0;
/* 284:305 */       break;
/* 285:    */     case 1: 
/* 286:307 */       i = 1;
/* 287:308 */       break;
/* 288:    */     case 2: 
/* 289:310 */       i = 2;
/* 290:311 */       break;
/* 291:    */     case 3: 
/* 292:313 */       i = 3;
/* 293:314 */       break;
/* 294:    */     case 4: 
/* 295:316 */       i = 4;
/* 296:317 */       break;
/* 297:    */     case 5: 
/* 298:    */     default: 
/* 299:320 */       i = 5;
/* 300:    */     }
/* 301:324 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 302:325 */       i |= 0x8;
/* 303:    */     }
/* 304:328 */     return i;
/* 305:    */   }
/* 306:    */   
/* 307:    */   protected bed e()
/* 308:    */   {
/* 309:333 */     return new bed(this, new bex[] { a, b });
/* 310:    */   }
/* 311:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aud
 * JD-Core Version:    0.7.0.1
 */