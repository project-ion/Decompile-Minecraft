/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class axl
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 23 */   public static final bew b = bew.a("level", 0, 15);
/*   8:    */   
/*   9:    */   protected axl(bof parambof)
/*  10:    */   {
/*  11: 26 */     super(parambof);
/*  12: 27 */     j(this.L.b().a(b, Integer.valueOf(0)));
/*  13: 28 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  14: 29 */     a(true);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public boolean b(ard paramard, dt paramdt)
/*  18:    */   {
/*  19: 34 */     return this.J != bof.i;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int a(ard paramard, dt paramdt, int paramInt)
/*  23:    */   {
/*  24: 39 */     if (this.J == bof.h) {
/*  25: 40 */       return art.c(paramard, paramdt);
/*  26:    */     }
/*  27: 42 */     return 16777215;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public static float b(int paramInt)
/*  31:    */   {
/*  32: 46 */     if (paramInt >= 8) {
/*  33: 47 */       paramInt = 0;
/*  34:    */     }
/*  35: 49 */     return (paramInt + 1) / 9.0F;
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected int e(ard paramard, dt paramdt)
/*  39:    */   {
/*  40: 53 */     if (paramard.p(paramdt).c().r() == this.J) {
/*  41: 54 */       return ((Integer)paramard.p(paramdt).b(b)).intValue();
/*  42:    */     }
/*  43: 57 */     return -1;
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected int f(ard paramard, dt paramdt)
/*  47:    */   {
/*  48: 61 */     int i = e(paramard, paramdt);
/*  49:    */     
/*  50: 63 */     return i >= 8 ? 0 : i;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public boolean d()
/*  54:    */   {
/*  55: 68 */     return false;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public boolean c()
/*  59:    */   {
/*  60: 73 */     return false;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public boolean a(bec parambec, boolean paramBoolean)
/*  64:    */   {
/*  65: 78 */     return (paramBoolean) && (((Integer)parambec.b(b)).intValue() == 0);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean b(ard paramard, dt paramdt, ej paramej)
/*  69:    */   {
/*  70: 83 */     bof localbof = paramard.p(paramdt).c().r();
/*  71: 84 */     if (localbof == this.J) {
/*  72: 85 */       return false;
/*  73:    */     }
/*  74: 87 */     if (paramej == ej.b) {
/*  75: 88 */       return true;
/*  76:    */     }
/*  77: 90 */     if (localbof == bof.w) {
/*  78: 91 */       return false;
/*  79:    */     }
/*  80: 93 */     return super.b(paramard, paramdt, paramej);
/*  81:    */   }
/*  82:    */   
/*  83:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/*  84:    */   {
/*  85: 98 */     if (paramard.p(paramdt).c().r() == this.J) {
/*  86: 99 */       return false;
/*  87:    */     }
/*  88:101 */     if (paramej == ej.b) {
/*  89:102 */       return true;
/*  90:    */     }
/*  91:105 */     return super.a(paramard, paramdt, paramej);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public boolean g(ard paramard, dt paramdt)
/*  95:    */   {
/*  96:109 */     for (int i = -1; i <= 1; i++) {
/*  97:110 */       for (int j = -1; j <= 1; j++)
/*  98:    */       {
/*  99:111 */         bec localbec = paramard.p(paramdt.a(i, 0, j));
/* 100:112 */         atr localatr = localbec.c();
/* 101:113 */         bof localbof = localatr.r();
/* 102:114 */         if ((localbof != this.J) && (!localatr.m())) {
/* 103:115 */           return true;
/* 104:    */         }
/* 105:    */       }
/* 106:    */     }
/* 107:119 */     return false;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/* 111:    */   {
/* 112:125 */     return null;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public int b()
/* 116:    */   {
/* 117:130 */     return 1;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 121:    */   {
/* 122:136 */     return null;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public int a(Random paramRandom)
/* 126:    */   {
/* 127:141 */     return 0;
/* 128:    */   }
/* 129:    */   
/* 130:    */   protected brw h(ard paramard, dt paramdt)
/* 131:    */   {
/* 132:145 */     brw localbrw = new brw(0.0D, 0.0D, 0.0D);
/* 133:146 */     int i = f(paramard, paramdt);
/* 134:147 */     for (Iterator localIterator = en.a.iterator(); localIterator.hasNext();)
/* 135:    */     {
/* 136:147 */       localej = (ej)localIterator.next();
/* 137:148 */       localdt = paramdt.a(localej);
/* 138:    */       
/* 139:150 */       int j = f(paramard, localdt);
/* 140:    */       int k;
/* 141:151 */       if (j < 0)
/* 142:    */       {
/* 143:152 */         if (!paramard.p(localdt).c().r().c())
/* 144:    */         {
/* 145:153 */           j = f(paramard, localdt.b());
/* 146:154 */           if (j >= 0)
/* 147:    */           {
/* 148:155 */             k = j - (i - 8);
/* 149:156 */             localbrw = localbrw.b((localdt.n() - paramdt.n()) * k, (localdt.o() - paramdt.o()) * k, (localdt.p() - paramdt.p()) * k);
/* 150:    */           }
/* 151:    */         }
/* 152:    */       }
/* 153:159 */       else if (j >= 0)
/* 154:    */       {
/* 155:160 */         k = j - i;
/* 156:161 */         localbrw = localbrw.b((localdt.n() - paramdt.n()) * k, (localdt.o() - paramdt.o()) * k, (localdt.p() - paramdt.p()) * k);
/* 157:    */       }
/* 158:    */     }
/* 159:    */     ej localej;
/* 160:    */     dt localdt;
/* 161:164 */     if (((Integer)paramard.p(paramdt).b(b)).intValue() >= 8) {
/* 162:165 */       for (localIterator = en.a.iterator(); localIterator.hasNext();)
/* 163:    */       {
/* 164:165 */         localej = (ej)localIterator.next();
/* 165:166 */         localdt = paramdt.a(localej);
/* 166:167 */         if ((b(paramard, localdt, localej)) || (b(paramard, localdt.a(), localej)))
/* 167:    */         {
/* 168:168 */           localbrw = localbrw.a().b(0.0D, -6.0D, 0.0D);
/* 169:169 */           break;
/* 170:    */         }
/* 171:    */       }
/* 172:    */     }
/* 173:173 */     return localbrw.a();
/* 174:    */   }
/* 175:    */   
/* 176:    */   public brw a(aqu paramaqu, dt paramdt, wv paramwv, brw parambrw)
/* 177:    */   {
/* 178:178 */     return parambrw.e(h(paramaqu, paramdt));
/* 179:    */   }
/* 180:    */   
/* 181:    */   public int a(aqu paramaqu)
/* 182:    */   {
/* 183:183 */     if (this.J == bof.h) {
/* 184:184 */       return 5;
/* 185:    */     }
/* 186:186 */     if (this.J == bof.i) {
/* 187:187 */       return paramaqu.t.o() ? 10 : 30;
/* 188:    */     }
/* 189:189 */     return 0;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public int c(ard paramard, dt paramdt)
/* 193:    */   {
/* 194:194 */     int i = paramard.b(paramdt, 0);
/* 195:195 */     int j = paramard.b(paramdt.a(), 0);
/* 196:    */     
/* 197:197 */     int k = i & 0xFF;
/* 198:198 */     int m = j & 0xFF;
/* 199:199 */     int n = i >> 16 & 0xFF;
/* 200:200 */     int i1 = j >> 16 & 0xFF;
/* 201:    */     
/* 202:202 */     return (k > m ? k : m) | (n > i1 ? n : i1) << 16;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public aql k()
/* 206:    */   {
/* 207:207 */     return this.J == bof.h ? aql.d : aql.a;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 211:    */   {
/* 212:212 */     double d1 = paramdt.n();
/* 213:213 */     double d2 = paramdt.o();
/* 214:214 */     double d3 = paramdt.p();
/* 215:216 */     if (this.J == bof.h)
/* 216:    */     {
/* 217:217 */       int i = ((Integer)parambec.b(b)).intValue();
/* 218:218 */       if ((i > 0) && (i < 8))
/* 219:    */       {
/* 220:219 */         if (paramRandom.nextInt(64) == 0) {
/* 221:220 */           paramaqu.a(d1 + 0.5D, d2 + 0.5D, d3 + 0.5D, "liquid.water", paramRandom.nextFloat() * 0.25F + 0.75F, paramRandom.nextFloat() * 1.0F + 0.5F, false);
/* 222:    */         }
/* 223:    */       }
/* 224:222 */       else if (paramRandom.nextInt(10) == 0) {
/* 225:223 */         paramaqu.a(ew.h, d1 + paramRandom.nextFloat(), d2 + paramRandom.nextFloat(), d3 + paramRandom.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 226:    */       }
/* 227:    */     }
/* 228:227 */     if ((this.J == bof.i) && 
/* 229:228 */       (paramaqu.p(paramdt.a()).c().r() == bof.a) && (!paramaqu.p(paramdt.a()).c().c()))
/* 230:    */     {
/* 231:229 */       if (paramRandom.nextInt(100) == 0)
/* 232:    */       {
/* 233:230 */         double d4 = d1 + paramRandom.nextFloat();
/* 234:231 */         double d6 = d2 + this.F;
/* 235:232 */         double d8 = d3 + paramRandom.nextFloat();
/* 236:233 */         paramaqu.a(ew.B, d4, d6, d8, 0.0D, 0.0D, 0.0D, new int[0]);
/* 237:234 */         paramaqu.a(d4, d6, d8, "liquid.lavapop", 0.2F + paramRandom.nextFloat() * 0.2F, 0.9F + paramRandom.nextFloat() * 0.15F, false);
/* 238:    */       }
/* 239:236 */       if (paramRandom.nextInt(200) == 0) {
/* 240:237 */         paramaqu.a(d1, d2, d3, "liquid.lava", 0.2F + paramRandom.nextFloat() * 0.2F, 0.9F + paramRandom.nextFloat() * 0.15F, false);
/* 241:    */       }
/* 242:    */     }
/* 243:242 */     if ((paramRandom.nextInt(10) == 0) && (aqu.a(paramaqu, paramdt.b())))
/* 244:    */     {
/* 245:243 */       bof localbof = paramaqu.p(paramdt.c(2)).c().r();
/* 246:244 */       if ((!localbof.c()) && (!localbof.d()))
/* 247:    */       {
/* 248:245 */         double d5 = d1 + paramRandom.nextFloat();
/* 249:246 */         double d7 = d2 - 1.05D;
/* 250:247 */         double d9 = d3 + paramRandom.nextFloat();
/* 251:249 */         if (this.J == bof.h) {
/* 252:250 */           paramaqu.a(ew.s, d5, d7, d9, 0.0D, 0.0D, 0.0D, new int[0]);
/* 253:    */         } else {
/* 254:252 */           paramaqu.a(ew.t, d5, d7, d9, 0.0D, 0.0D, 0.0D, new int[0]);
/* 255:    */         }
/* 256:    */       }
/* 257:    */     }
/* 258:    */   }
/* 259:    */   
/* 260:    */   public static double a(ard paramard, dt paramdt, bof parambof)
/* 261:    */   {
/* 262:259 */     brw localbrw = a(parambof).h(paramard, paramdt);
/* 263:260 */     if ((localbrw.a == 0.0D) && (localbrw.c == 0.0D)) {
/* 264:261 */       return -1000.0D;
/* 265:    */     }
/* 266:264 */     return Math.atan2(localbrw.c, localbrw.a) - 1.570796326794897D;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 270:    */   {
/* 271:269 */     e(paramaqu, paramdt, parambec);
/* 272:    */   }
/* 273:    */   
/* 274:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 275:    */   {
/* 276:274 */     e(paramaqu, paramdt, parambec);
/* 277:    */   }
/* 278:    */   
/* 279:    */   public boolean e(aqu paramaqu, dt paramdt, bec parambec)
/* 280:    */   {
/* 281:278 */     if (this.J == bof.i)
/* 282:    */     {
/* 283:279 */       int i = 0;
/* 284:280 */       for (ej localej : ej.values()) {
/* 285:281 */         if ((localej != ej.a) && (paramaqu.p(paramdt.a(localej)).c().r() == bof.h))
/* 286:    */         {
/* 287:282 */           i = 1;
/* 288:283 */           break;
/* 289:    */         }
/* 290:    */       }
/* 291:286 */       if (i != 0)
/* 292:    */       {
/* 293:287 */         ??? = (Integer)parambec.b(b);
/* 294:288 */         if (((Integer)???).intValue() == 0)
/* 295:    */         {
/* 296:289 */           paramaqu.a(paramdt, aty.Z.P());
/* 297:290 */           d(paramaqu, paramdt);
/* 298:291 */           return true;
/* 299:    */         }
/* 300:292 */         if (((Integer)???).intValue() <= 4)
/* 301:    */         {
/* 302:293 */           paramaqu.a(paramdt, aty.e.P());
/* 303:294 */           d(paramaqu, paramdt);
/* 304:295 */           return true;
/* 305:    */         }
/* 306:    */       }
/* 307:    */     }
/* 308:300 */     return false;
/* 309:    */   }
/* 310:    */   
/* 311:    */   protected void d(aqu paramaqu, dt paramdt)
/* 312:    */   {
/* 313:304 */     double d1 = paramdt.n();
/* 314:305 */     double d2 = paramdt.o();
/* 315:306 */     double d3 = paramdt.p();
/* 316:    */     
/* 317:308 */     paramaqu.a(d1 + 0.5D, d2 + 0.5D, d3 + 0.5D, "random.fizz", 0.5F, 2.6F + (paramaqu.s.nextFloat() - paramaqu.s.nextFloat()) * 0.8F);
/* 318:309 */     for (int i = 0; i < 8; i++) {
/* 319:310 */       paramaqu.a(ew.m, d1 + Math.random(), d2 + 1.2D, d3 + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 320:    */     }
/* 321:    */   }
/* 322:    */   
/* 323:    */   public bec a(int paramInt)
/* 324:    */   {
/* 325:316 */     return P().a(b, Integer.valueOf(paramInt));
/* 326:    */   }
/* 327:    */   
/* 328:    */   public int c(bec parambec)
/* 329:    */   {
/* 330:321 */     return ((Integer)parambec.b(b)).intValue();
/* 331:    */   }
/* 332:    */   
/* 333:    */   protected bed e()
/* 334:    */   {
/* 335:326 */     return new bed(this, new bex[] { b });
/* 336:    */   }
/* 337:    */   
/* 338:    */   public static avn a(bof parambof)
/* 339:    */   {
/* 340:330 */     if (parambof == bof.h) {
/* 341:331 */       return aty.i;
/* 342:    */     }
/* 343:332 */     if (parambof == bof.i) {
/* 344:333 */       return aty.k;
/* 345:    */     }
/* 346:336 */     throw new IllegalArgumentException("Invalid material");
/* 347:    */   }
/* 348:    */   
/* 349:    */   public static bax b(bof parambof)
/* 350:    */   {
/* 351:340 */     if (parambof == bof.h) {
/* 352:341 */       return aty.j;
/* 353:    */     }
/* 354:342 */     if (parambof == bof.i) {
/* 355:343 */       return aty.l;
/* 356:    */     }
/* 357:346 */     throw new IllegalArgumentException("Invalid material");
/* 358:    */   }
/* 359:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axl
 * JD-Core Version:    0.7.0.1
 */