/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class avx
/*   6:    */   extends atr
/*   7:    */ {
/*   8: 25 */   public static final bew a = bew.a("age", 0, 15);
/*   9: 26 */   public static final bet b = bet.a("flip");
/*  10: 27 */   public static final bet M = bet.a("alt");
/*  11: 28 */   public static final bet N = bet.a("north");
/*  12: 29 */   public static final bet O = bet.a("east");
/*  13: 30 */   public static final bet P = bet.a("south");
/*  14: 31 */   public static final bet Q = bet.a("west");
/*  15: 32 */   public static final bew R = bew.a("upper", 0, 2);
/*  16:    */   
/*  17:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  18:    */   {
/*  19: 36 */     int i = paramdt.n();
/*  20: 37 */     int j = paramdt.o();
/*  21: 38 */     int k = paramdt.p();
/*  22: 40 */     if ((aqu.a(paramard, paramdt.b())) || (aty.ab.e(paramard, paramdt.b()))) {
/*  23: 41 */       return P();
/*  24:    */     }
/*  25: 44 */     boolean bool1 = (i + j + k & 0x1) == 1;
/*  26: 45 */     boolean bool2 = (i / 2 + j / 2 + k / 2 & 0x1) == 1;
/*  27:    */     
/*  28: 47 */     int m = 0;
/*  29: 48 */     if (e(paramard, paramdt.a())) {
/*  30: 49 */       m = bool1 ? 1 : 2;
/*  31:    */     }
/*  32: 52 */     return parambec.a(N, Boolean.valueOf(e(paramard, paramdt.c()))).a(O, Boolean.valueOf(e(paramard, paramdt.f()))).a(P, Boolean.valueOf(e(paramard, paramdt.d()))).a(Q, Boolean.valueOf(e(paramard, paramdt.e()))).a(R, Integer.valueOf(m)).a(b, Boolean.valueOf(bool2)).a(M, Boolean.valueOf(bool1));
/*  33:    */   }
/*  34:    */   
/*  35: 72 */   private final Map S = Maps.newIdentityHashMap();
/*  36: 73 */   private final Map T = Maps.newIdentityHashMap();
/*  37:    */   
/*  38:    */   protected avx()
/*  39:    */   {
/*  40: 76 */     super(bof.o);
/*  41: 77 */     j(this.L.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)).a(Q, Boolean.valueOf(false)).a(R, Integer.valueOf(0)));
/*  42: 78 */     a(true);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public static void j()
/*  46:    */   {
/*  47: 82 */     aty.ab.a(aty.f, 5, 20);
/*  48: 83 */     aty.ab.a(aty.bL, 5, 20);
/*  49: 84 */     aty.ab.a(aty.bM, 5, 20);
/*  50: 85 */     aty.ab.a(aty.bo, 5, 20);
/*  51: 86 */     aty.ab.a(aty.bp, 5, 20);
/*  52: 87 */     aty.ab.a(aty.bq, 5, 20);
/*  53: 88 */     aty.ab.a(aty.br, 5, 20);
/*  54: 89 */     aty.ab.a(aty.bs, 5, 20);
/*  55: 90 */     aty.ab.a(aty.bt, 5, 20);
/*  56: 91 */     aty.ab.a(aty.aO, 5, 20);
/*  57: 92 */     aty.ab.a(aty.aP, 5, 20);
/*  58: 93 */     aty.ab.a(aty.aQ, 5, 20);
/*  59: 94 */     aty.ab.a(aty.aR, 5, 20);
/*  60: 95 */     aty.ab.a(aty.aS, 5, 20);
/*  61: 96 */     aty.ab.a(aty.aT, 5, 20);
/*  62: 97 */     aty.ab.a(aty.ad, 5, 20);
/*  63: 98 */     aty.ab.a(aty.bV, 5, 20);
/*  64: 99 */     aty.ab.a(aty.bU, 5, 20);
/*  65:100 */     aty.ab.a(aty.bW, 5, 20);
/*  66:101 */     aty.ab.a(aty.r, 5, 5);
/*  67:102 */     aty.ab.a(aty.s, 5, 5);
/*  68:103 */     aty.ab.a(aty.t, 30, 60);
/*  69:104 */     aty.ab.a(aty.u, 30, 60);
/*  70:105 */     aty.ab.a(aty.X, 30, 20);
/*  71:106 */     aty.ab.a(aty.W, 15, 100);
/*  72:107 */     aty.ab.a(aty.H, 60, 100);
/*  73:108 */     aty.ab.a(aty.cF, 60, 100);
/*  74:109 */     aty.ab.a(aty.N, 60, 100);
/*  75:110 */     aty.ab.a(aty.O, 60, 100);
/*  76:111 */     aty.ab.a(aty.I, 60, 100);
/*  77:112 */     aty.ab.a(aty.L, 30, 60);
/*  78:113 */     aty.ab.a(aty.bn, 15, 100);
/*  79:114 */     aty.ab.a(aty.cA, 5, 5);
/*  80:115 */     aty.ab.a(aty.cx, 60, 20);
/*  81:116 */     aty.ab.a(aty.cy, 60, 20);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(atr paramatr, int paramInt1, int paramInt2)
/*  85:    */   {
/*  86:120 */     this.S.put(paramatr, Integer.valueOf(paramInt1));
/*  87:121 */     this.T.put(paramatr, Integer.valueOf(paramInt2));
/*  88:    */   }
/*  89:    */   
/*  90:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  91:    */   {
/*  92:127 */     return null;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public boolean c()
/*  96:    */   {
/*  97:132 */     return false;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public boolean d()
/* 101:    */   {
/* 102:137 */     return false;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public int a(Random paramRandom)
/* 106:    */   {
/* 107:142 */     return 0;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public int a(aqu paramaqu)
/* 111:    */   {
/* 112:147 */     return 30;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 116:    */   {
/* 117:152 */     if (!paramaqu.Q().b("doFireTick")) {
/* 118:153 */       return;
/* 119:    */     }
/* 120:156 */     if (!c(paramaqu, paramdt)) {
/* 121:157 */       paramaqu.g(paramdt);
/* 122:    */     }
/* 123:160 */     atr localatr = paramaqu.p(paramdt.b()).c();
/* 124:161 */     int i = localatr == aty.aV ? 1 : 0;
/* 125:162 */     if (((paramaqu.t instanceof bgh)) && (localatr == aty.h)) {
/* 126:163 */       i = 1;
/* 127:    */     }
/* 128:166 */     if ((i == 0) && (paramaqu.S()) && (d(paramaqu, paramdt)))
/* 129:    */     {
/* 130:167 */       paramaqu.g(paramdt);
/* 131:168 */       return;
/* 132:    */     }
/* 133:171 */     int j = ((Integer)parambec.b(a)).intValue();
/* 134:172 */     if (j < 15)
/* 135:    */     {
/* 136:173 */       parambec = parambec.a(a, Integer.valueOf(j + paramRandom.nextInt(3) / 2));
/* 137:174 */       paramaqu.a(paramdt, parambec, 4);
/* 138:    */     }
/* 139:177 */     paramaqu.a(paramdt, this, a(paramaqu) + paramRandom.nextInt(10));
/* 140:179 */     if (i == 0)
/* 141:    */     {
/* 142:180 */       if (!e(paramaqu, paramdt))
/* 143:    */       {
/* 144:181 */         if ((!aqu.a(paramaqu, paramdt.b())) || (j > 3)) {
/* 145:182 */           paramaqu.g(paramdt);
/* 146:    */         }
/* 147:184 */         return;
/* 148:    */       }
/* 149:187 */       if ((!e(paramaqu, paramdt.b())) && (j == 15) && (paramRandom.nextInt(4) == 0))
/* 150:    */       {
/* 151:188 */         paramaqu.g(paramdt);
/* 152:189 */         return;
/* 153:    */       }
/* 154:    */     }
/* 155:193 */     boolean bool = paramaqu.D(paramdt);
/* 156:194 */     int k = 0;
/* 157:195 */     if (bool) {
/* 158:196 */       k = -50;
/* 159:    */     }
/* 160:198 */     a(paramaqu, paramdt.f(), 300 + k, paramRandom, j);
/* 161:199 */     a(paramaqu, paramdt.e(), 300 + k, paramRandom, j);
/* 162:200 */     a(paramaqu, paramdt.b(), 250 + k, paramRandom, j);
/* 163:201 */     a(paramaqu, paramdt.a(), 250 + k, paramRandom, j);
/* 164:202 */     a(paramaqu, paramdt.c(), 300 + k, paramRandom, j);
/* 165:203 */     a(paramaqu, paramdt.d(), 300 + k, paramRandom, j);
/* 166:205 */     for (int m = -1; m <= 1; m++) {
/* 167:206 */       for (int n = -1; n <= 1; n++) {
/* 168:207 */         for (int i1 = -1; i1 <= 4; i1++) {
/* 169:208 */           if ((m != 0) || (i1 != 0) || (n != 0))
/* 170:    */           {
/* 171:212 */             int i2 = 100;
/* 172:213 */             if (i1 > 1) {
/* 173:214 */               i2 += (i1 - 1) * 100;
/* 174:    */             }
/* 175:217 */             dt localdt = paramdt.a(m, i1, n);
/* 176:218 */             int i3 = m(paramaqu, localdt);
/* 177:219 */             if (i3 > 0)
/* 178:    */             {
/* 179:223 */               int i4 = (i3 + 40 + paramaqu.aa().a() * 7) / (j + 30);
/* 180:224 */               if (bool) {
/* 181:225 */                 i4 /= 2;
/* 182:    */               }
/* 183:227 */               if ((i4 > 0) && (paramRandom.nextInt(i2) <= i4) && (
/* 184:228 */                 (!paramaqu.S()) || (!d(paramaqu, localdt))))
/* 185:    */               {
/* 186:232 */                 int i5 = j + paramRandom.nextInt(5) / 4;
/* 187:233 */                 if (i5 > 15) {
/* 188:234 */                   i5 = 15;
/* 189:    */                 }
/* 190:236 */                 paramaqu.a(localdt, parambec.a(a, Integer.valueOf(i5)), 3);
/* 191:    */               }
/* 192:    */             }
/* 193:    */           }
/* 194:    */         }
/* 195:    */       }
/* 196:    */     }
/* 197:    */   }
/* 198:    */   
/* 199:    */   protected boolean d(aqu paramaqu, dt paramdt)
/* 200:    */   {
/* 201:244 */     return (paramaqu.C(paramdt)) || (paramaqu.C(paramdt.e())) || (paramaqu.C(paramdt.f())) || (paramaqu.C(paramdt.c())) || (paramaqu.C(paramdt.d()));
/* 202:    */   }
/* 203:    */   
/* 204:    */   public boolean M()
/* 205:    */   {
/* 206:249 */     return false;
/* 207:    */   }
/* 208:    */   
/* 209:    */   private int c(atr paramatr)
/* 210:    */   {
/* 211:253 */     Integer localInteger = (Integer)this.T.get(paramatr);
/* 212:254 */     return localInteger == null ? 0 : localInteger.intValue();
/* 213:    */   }
/* 214:    */   
/* 215:    */   private int d(atr paramatr)
/* 216:    */   {
/* 217:258 */     Integer localInteger = (Integer)this.S.get(paramatr);
/* 218:259 */     return localInteger == null ? 0 : localInteger.intValue();
/* 219:    */   }
/* 220:    */   
/* 221:    */   private void a(aqu paramaqu, dt paramdt, int paramInt1, Random paramRandom, int paramInt2)
/* 222:    */   {
/* 223:263 */     int i = c(paramaqu.p(paramdt).c());
/* 224:264 */     if (paramRandom.nextInt(paramInt1) < i)
/* 225:    */     {
/* 226:265 */       bec localbec = paramaqu.p(paramdt);
/* 227:267 */       if ((paramRandom.nextInt(paramInt2 + 10) < 5) && (!paramaqu.C(paramdt)))
/* 228:    */       {
/* 229:268 */         int j = paramInt2 + paramRandom.nextInt(5) / 4;
/* 230:269 */         if (j > 15) {
/* 231:270 */           j = 15;
/* 232:    */         }
/* 233:272 */         paramaqu.a(paramdt, P().a(a, Integer.valueOf(j)), 3);
/* 234:    */       }
/* 235:    */       else
/* 236:    */       {
/* 237:274 */         paramaqu.g(paramdt);
/* 238:    */       }
/* 239:277 */       if (localbec.c() == aty.W) {
/* 240:278 */         aty.W.d(paramaqu, paramdt, localbec.a(bbk.a, Boolean.valueOf(true)));
/* 241:    */       }
/* 242:    */     }
/* 243:    */   }
/* 244:    */   
/* 245:    */   private boolean e(aqu paramaqu, dt paramdt)
/* 246:    */   {
/* 247:284 */     for (ej localej : ) {
/* 248:285 */       if (e(paramaqu, paramdt.a(localej))) {
/* 249:286 */         return true;
/* 250:    */       }
/* 251:    */     }
/* 252:290 */     return false;
/* 253:    */   }
/* 254:    */   
/* 255:    */   private int m(aqu paramaqu, dt paramdt)
/* 256:    */   {
/* 257:294 */     if (!paramaqu.d(paramdt)) {
/* 258:295 */       return 0;
/* 259:    */     }
/* 260:298 */     int i = 0;
/* 261:299 */     for (ej localej : ej.values()) {
/* 262:300 */       i = Math.max(d(paramaqu.p(paramdt.a(localej)).c()), i);
/* 263:    */     }
/* 264:303 */     return i;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public boolean y()
/* 268:    */   {
/* 269:308 */     return false;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public boolean e(ard paramard, dt paramdt)
/* 273:    */   {
/* 274:312 */     return d(paramard.p(paramdt).c()) > 0;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public boolean c(aqu paramaqu, dt paramdt)
/* 278:    */   {
/* 279:317 */     return (aqu.a(paramaqu, paramdt.b())) || (e(paramaqu, paramdt));
/* 280:    */   }
/* 281:    */   
/* 282:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 283:    */   {
/* 284:322 */     if ((!aqu.a(paramaqu, paramdt.b())) && (!e(paramaqu, paramdt))) {
/* 285:323 */       paramaqu.g(paramdt);
/* 286:    */     }
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 290:    */   {
/* 291:329 */     if ((paramaqu.t.q() <= 0) && 
/* 292:330 */       (aty.aY.d(paramaqu, paramdt))) {
/* 293:331 */       return;
/* 294:    */     }
/* 295:334 */     if ((!aqu.a(paramaqu, paramdt.b())) && (!e(paramaqu, paramdt)))
/* 296:    */     {
/* 297:335 */       paramaqu.g(paramdt);
/* 298:336 */       return;
/* 299:    */     }
/* 300:339 */     paramaqu.a(paramdt, this, a(paramaqu) + paramaqu.s.nextInt(10));
/* 301:    */   }
/* 302:    */   
/* 303:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 304:    */   {
/* 305:344 */     if (paramRandom.nextInt(24) == 0) {
/* 306:345 */       paramaqu.a(paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, "fire.fire", 1.0F + paramRandom.nextFloat(), paramRandom.nextFloat() * 0.7F + 0.3F, false);
/* 307:    */     }
/* 308:    */     int i;
/* 309:    */     double d1;
/* 310:    */     double d2;
/* 311:    */     double d3;
/* 312:348 */     if ((aqu.a(paramaqu, paramdt.b())) || (aty.ab.e(paramaqu, paramdt.b())))
/* 313:    */     {
/* 314:349 */       for (i = 0; i < 3; i++)
/* 315:    */       {
/* 316:350 */         d1 = paramdt.n() + paramRandom.nextDouble();
/* 317:351 */         d2 = paramdt.o() + paramRandom.nextDouble() * 0.5D + 0.5D;
/* 318:352 */         d3 = paramdt.p() + paramRandom.nextDouble();
/* 319:353 */         paramaqu.a(ew.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 320:    */       }
/* 321:    */     }
/* 322:    */     else
/* 323:    */     {
/* 324:356 */       if (aty.ab.e(paramaqu, paramdt.e())) {
/* 325:357 */         for (i = 0; i < 2; i++)
/* 326:    */         {
/* 327:358 */           d1 = paramdt.n() + paramRandom.nextDouble() * 0.1000000014901161D;
/* 328:359 */           d2 = paramdt.o() + paramRandom.nextDouble();
/* 329:360 */           d3 = paramdt.p() + paramRandom.nextDouble();
/* 330:361 */           paramaqu.a(ew.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 331:    */         }
/* 332:    */       }
/* 333:364 */       if (aty.ab.e(paramaqu, paramdt.f())) {
/* 334:365 */         for (i = 0; i < 2; i++)
/* 335:    */         {
/* 336:366 */           d1 = paramdt.n() + 1 - paramRandom.nextDouble() * 0.1000000014901161D;
/* 337:367 */           d2 = paramdt.o() + paramRandom.nextDouble();
/* 338:368 */           d3 = paramdt.p() + paramRandom.nextDouble();
/* 339:369 */           paramaqu.a(ew.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 340:    */         }
/* 341:    */       }
/* 342:372 */       if (aty.ab.e(paramaqu, paramdt.c())) {
/* 343:373 */         for (i = 0; i < 2; i++)
/* 344:    */         {
/* 345:374 */           d1 = paramdt.n() + paramRandom.nextDouble();
/* 346:375 */           d2 = paramdt.o() + paramRandom.nextDouble();
/* 347:376 */           d3 = paramdt.p() + paramRandom.nextDouble() * 0.1000000014901161D;
/* 348:377 */           paramaqu.a(ew.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 349:    */         }
/* 350:    */       }
/* 351:380 */       if (aty.ab.e(paramaqu, paramdt.d())) {
/* 352:381 */         for (i = 0; i < 2; i++)
/* 353:    */         {
/* 354:382 */           d1 = paramdt.n() + paramRandom.nextDouble();
/* 355:383 */           d2 = paramdt.o() + paramRandom.nextDouble();
/* 356:384 */           d3 = paramdt.p() + 1 - paramRandom.nextDouble() * 0.1000000014901161D;
/* 357:385 */           paramaqu.a(ew.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 358:    */         }
/* 359:    */       }
/* 360:388 */       if (aty.ab.e(paramaqu, paramdt.a())) {
/* 361:389 */         for (i = 0; i < 2; i++)
/* 362:    */         {
/* 363:390 */           d1 = paramdt.n() + paramRandom.nextDouble();
/* 364:391 */           d2 = paramdt.o() + 1 - paramRandom.nextDouble() * 0.1000000014901161D;
/* 365:392 */           d3 = paramdt.p() + paramRandom.nextDouble();
/* 366:393 */           paramaqu.a(ew.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 367:    */         }
/* 368:    */       }
/* 369:    */     }
/* 370:    */   }
/* 371:    */   
/* 372:    */   public boh g(bec parambec)
/* 373:    */   {
/* 374:401 */     return boh.f;
/* 375:    */   }
/* 376:    */   
/* 377:    */   public aql k()
/* 378:    */   {
/* 379:406 */     return aql.c;
/* 380:    */   }
/* 381:    */   
/* 382:    */   public bec a(int paramInt)
/* 383:    */   {
/* 384:411 */     return P().a(a, Integer.valueOf(paramInt));
/* 385:    */   }
/* 386:    */   
/* 387:    */   public int c(bec parambec)
/* 388:    */   {
/* 389:417 */     return ((Integer)parambec.b(a)).intValue();
/* 390:    */   }
/* 391:    */   
/* 392:    */   protected bed e()
/* 393:    */   {
/* 394:422 */     return new bed(this, new bex[] { a, N, O, P, Q, R, b, M });
/* 395:    */   }
/* 396:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avx
 * JD-Core Version:    0.7.0.1
 */