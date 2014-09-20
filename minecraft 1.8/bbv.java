/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bbv
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 27 */   public static final bet a = bet.a("up");
/*   8: 28 */   public static final bet b = bet.a("north");
/*   9: 29 */   public static final bet M = bet.a("east");
/*  10: 30 */   public static final bet N = bet.a("south");
/*  11: 31 */   public static final bet O = bet.a("west");
/*  12: 32 */   public static final bet[] P = { a, b, N, O, M };
/*  13: 34 */   public static final int Q = b(ej.d);
/*  14: 35 */   public static final int R = b(ej.c);
/*  15: 36 */   public static final int S = b(ej.f);
/*  16: 37 */   public static final int T = b(ej.e);
/*  17:    */   
/*  18:    */   public bbv()
/*  19:    */   {
/*  20: 40 */     super(bof.l);
/*  21: 41 */     j(this.L.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)));
/*  22: 42 */     a(true);
/*  23: 43 */     a(akf.c);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  27:    */   {
/*  28: 48 */     return parambec.a(a, Boolean.valueOf(paramard.p(paramdt.a()).c().s()));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void h()
/*  32:    */   {
/*  33: 53 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean c()
/*  37:    */   {
/*  38: 58 */     return false;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public boolean d()
/*  42:    */   {
/*  43: 63 */     return false;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public boolean f(aqu paramaqu, dt paramdt)
/*  47:    */   {
/*  48: 68 */     return true;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(ard paramard, dt paramdt)
/*  52:    */   {
/*  53: 73 */     float f1 = 0.0625F;
/*  54:    */     
/*  55: 75 */     float f2 = 1.0F;
/*  56: 76 */     float f3 = 1.0F;
/*  57: 77 */     float f4 = 1.0F;
/*  58: 78 */     float f5 = 0.0F;
/*  59: 79 */     float f6 = 0.0F;
/*  60: 80 */     float f7 = 0.0F;
/*  61: 81 */     int i = 0;
/*  62: 83 */     if (((Boolean)paramard.p(paramdt).b(O)).booleanValue())
/*  63:    */     {
/*  64: 84 */       f5 = Math.max(f5, 0.0625F);
/*  65: 85 */       f2 = 0.0F;
/*  66: 86 */       f3 = 0.0F;
/*  67: 87 */       f6 = 1.0F;
/*  68: 88 */       f4 = 0.0F;
/*  69: 89 */       f7 = 1.0F;
/*  70: 90 */       i = 1;
/*  71:    */     }
/*  72: 92 */     if (((Boolean)paramard.p(paramdt).b(M)).booleanValue())
/*  73:    */     {
/*  74: 93 */       f2 = Math.min(f2, 0.9375F);
/*  75: 94 */       f5 = 1.0F;
/*  76: 95 */       f3 = 0.0F;
/*  77: 96 */       f6 = 1.0F;
/*  78: 97 */       f4 = 0.0F;
/*  79: 98 */       f7 = 1.0F;
/*  80: 99 */       i = 1;
/*  81:    */     }
/*  82:101 */     if (((Boolean)paramard.p(paramdt).b(b)).booleanValue())
/*  83:    */     {
/*  84:102 */       f7 = Math.max(f7, 0.0625F);
/*  85:103 */       f4 = 0.0F;
/*  86:104 */       f2 = 0.0F;
/*  87:105 */       f5 = 1.0F;
/*  88:106 */       f3 = 0.0F;
/*  89:107 */       f6 = 1.0F;
/*  90:108 */       i = 1;
/*  91:    */     }
/*  92:110 */     if (((Boolean)paramard.p(paramdt).b(N)).booleanValue())
/*  93:    */     {
/*  94:111 */       f4 = Math.min(f4, 0.9375F);
/*  95:112 */       f7 = 1.0F;
/*  96:113 */       f2 = 0.0F;
/*  97:114 */       f5 = 1.0F;
/*  98:115 */       f3 = 0.0F;
/*  99:116 */       f6 = 1.0F;
/* 100:117 */       i = 1;
/* 101:    */     }
/* 102:119 */     if ((i == 0) && (c(paramard.p(paramdt.a()).c())))
/* 103:    */     {
/* 104:120 */       f3 = Math.min(f3, 0.9375F);
/* 105:121 */       f6 = 1.0F;
/* 106:122 */       f2 = 0.0F;
/* 107:123 */       f5 = 1.0F;
/* 108:124 */       f4 = 0.0F;
/* 109:125 */       f7 = 1.0F;
/* 110:    */     }
/* 111:127 */     a(f2, f3, f4, f5, f6, f7);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/* 115:    */   {
/* 116:133 */     return null;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public boolean a(aqu paramaqu, dt paramdt, ej paramej)
/* 120:    */   {
/* 121:138 */     switch (bbw.a[paramej.ordinal()])
/* 122:    */     {
/* 123:    */     default: 
/* 124:140 */       return false;
/* 125:    */     case 1: 
/* 126:142 */       return c(paramaqu.p(paramdt.a()).c());
/* 127:    */     }
/* 128:147 */     return c(paramaqu.p(paramdt.a(paramej.d())).c());
/* 129:    */   }
/* 130:    */   
/* 131:    */   private boolean c(atr paramatr)
/* 132:    */   {
/* 133:152 */     return (paramatr.d()) && (paramatr.J.c());
/* 134:    */   }
/* 135:    */   
/* 136:    */   private boolean e(aqu paramaqu, dt paramdt, bec parambec)
/* 137:    */   {
/* 138:156 */     bec localbec1 = parambec;
/* 139:158 */     for (ej localej : en.a)
/* 140:    */     {
/* 141:159 */       bet localbet = a(localej);
/* 142:161 */       if ((((Boolean)parambec.b(localbet)).booleanValue()) && 
/* 143:162 */         (!c(paramaqu.p(paramdt.a(localej)).c())))
/* 144:    */       {
/* 145:164 */         bec localbec2 = paramaqu.p(paramdt.a());
/* 146:165 */         if ((localbec2.c() != this) || (!((Boolean)localbec2.b(localbet)).booleanValue())) {
/* 147:166 */           parambec = parambec.a(localbet, Boolean.valueOf(false));
/* 148:    */         }
/* 149:    */       }
/* 150:    */     }
/* 151:172 */     if (d(parambec) == 0) {
/* 152:174 */       return false;
/* 153:    */     }
/* 154:177 */     if (localbec1 != parambec) {
/* 155:178 */       paramaqu.a(paramdt, parambec, 2);
/* 156:    */     }
/* 157:181 */     return true;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public int F()
/* 161:    */   {
/* 162:186 */     return aqp.c();
/* 163:    */   }
/* 164:    */   
/* 165:    */   public int h(bec parambec)
/* 166:    */   {
/* 167:191 */     return aqp.c();
/* 168:    */   }
/* 169:    */   
/* 170:    */   public int a(ard paramard, dt paramdt, int paramInt)
/* 171:    */   {
/* 172:196 */     return paramard.b(paramdt).c(paramdt);
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 176:    */   {
/* 177:201 */     if ((!paramaqu.D) && (!e(paramaqu, paramdt, parambec)))
/* 178:    */     {
/* 179:202 */       b(paramaqu, paramdt, parambec, 0);
/* 180:203 */       paramaqu.g(paramdt);
/* 181:    */     }
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 185:    */   {
/* 186:209 */     if (paramaqu.D) {
/* 187:210 */       return;
/* 188:    */     }
/* 189:212 */     if (paramaqu.s.nextInt(4) != 0) {
/* 190:213 */       return;
/* 191:    */     }
/* 192:216 */     int i = 4;
/* 193:217 */     int j = 5;
/* 194:218 */     int k = 0;
/* 195:219 */     for (int m = -i; m <= i; m++) {
/* 196:220 */       for (int n = -i; n <= i; n++) {
/* 197:221 */         for (int i1 = -1; i1 <= 1; i1++) {
/* 198:222 */           if (paramaqu.p(paramdt.a(m, i1, n)).c() == this)
/* 199:    */           {
/* 200:222 */             j--;
/* 201:222 */             if (j <= 0)
/* 202:    */             {
/* 203:223 */               k = 1;
/* 204:    */               break label117;
/* 205:    */             }
/* 206:    */           }
/* 207:    */         }
/* 208:    */       }
/* 209:    */     }
/* 210:    */     label117:
/* 211:230 */     ej localej1 = ej.a(paramRandom);
/* 212:    */     Object localObject1;
/* 213:    */     Object localObject2;
/* 214:    */     Object localObject3;
/* 215:232 */     if ((localej1 == ej.b) && (paramdt.o() < 255) && (paramaqu.d(paramdt.a())))
/* 216:    */     {
/* 217:233 */       if (k != 0) {
/* 218:234 */         return;
/* 219:    */       }
/* 220:238 */       localObject1 = parambec;
/* 221:239 */       for (localObject2 = en.a.iterator(); ((Iterator)localObject2).hasNext();)
/* 222:    */       {
/* 223:239 */         localObject3 = (ej)((Iterator)localObject2).next();
/* 224:240 */         if ((paramRandom.nextBoolean()) || (!c(paramaqu.p(paramdt.a((ej)localObject3).a()).c()))) {
/* 225:241 */           localObject1 = ((bec)localObject1).a(a((ej)localObject3), Boolean.valueOf(false));
/* 226:    */         }
/* 227:    */       }
/* 228:244 */       if ((((Boolean)((bec)localObject1).b(b)).booleanValue()) || (((Boolean)((bec)localObject1).b(M)).booleanValue()) || (((Boolean)((bec)localObject1).b(N)).booleanValue()) || (((Boolean)((bec)localObject1).b(O)).booleanValue())) {
/* 229:245 */         paramaqu.a(paramdt.a(), (bec)localObject1, 2);
/* 230:    */       }
/* 231:    */       return;
/* 232:    */     }
/* 233:    */     Object localObject4;
/* 234:    */     Object localObject5;
/* 235:250 */     if ((localej1.k().c()) && (!((Boolean)parambec.b(a(localej1))).booleanValue()))
/* 236:    */     {
/* 237:251 */       if (k != 0) {
/* 238:252 */         return;
/* 239:    */       }
/* 240:255 */       localObject1 = paramdt.a(localej1);
/* 241:    */       
/* 242:257 */       localObject2 = paramaqu.p((dt)localObject1).c();
/* 243:258 */       if (((atr)localObject2).J == bof.a)
/* 244:    */       {
/* 245:261 */         localObject3 = localej1.e();
/* 246:262 */         localObject4 = localej1.f();
/* 247:    */         
/* 248:    */ 
/* 249:265 */         boolean bool1 = ((Boolean)parambec.b(a((ej)localObject3))).booleanValue();
/* 250:266 */         boolean bool2 = ((Boolean)parambec.b(a((ej)localObject4))).booleanValue();
/* 251:    */         
/* 252:268 */         localObject5 = ((dt)localObject1).a((ej)localObject3);
/* 253:269 */         dt localdt = ((dt)localObject1).a((ej)localObject4);
/* 254:271 */         if ((bool1) && (c(paramaqu.p((dt)localObject5).c()))) {
/* 255:272 */           paramaqu.a((dt)localObject1, P().a(a((ej)localObject3), Boolean.valueOf(true)), 2);
/* 256:273 */         } else if ((bool2) && (c(paramaqu.p(localdt).c()))) {
/* 257:274 */           paramaqu.a((dt)localObject1, P().a(a((ej)localObject4), Boolean.valueOf(true)), 2);
/* 258:277 */         } else if ((bool1) && (paramaqu.d((dt)localObject5)) && (c(paramaqu.p(paramdt.a((ej)localObject3)).c()))) {
/* 259:278 */           paramaqu.a((dt)localObject5, P().a(a(localej1.d()), Boolean.valueOf(true)), 2);
/* 260:279 */         } else if ((bool2) && (paramaqu.d(localdt)) && (c(paramaqu.p(paramdt.a((ej)localObject4)).c()))) {
/* 261:280 */           paramaqu.a(localdt, P().a(a(localej1.d()), Boolean.valueOf(true)), 2);
/* 262:283 */         } else if (c(paramaqu.p(((dt)localObject1).a()).c())) {
/* 263:284 */           paramaqu.a((dt)localObject1, P(), 2);
/* 264:    */         }
/* 265:    */       }
/* 266:287 */       else if ((((atr)localObject2).J.k()) && (((atr)localObject2).d()))
/* 267:    */       {
/* 268:289 */         paramaqu.a(paramdt, parambec.a(a(localej1), Boolean.valueOf(true)), 2);
/* 269:    */       }
/* 270:291 */       return;
/* 271:    */     }
/* 272:293 */     if (paramdt.o() > 1)
/* 273:    */     {
/* 274:295 */       localObject1 = paramdt.b();
/* 275:296 */       localObject2 = paramaqu.p((dt)localObject1);
/* 276:297 */       localObject3 = ((bec)localObject2).c();
/* 277:    */       Iterator localIterator;
/* 278:    */       ej localej2;
/* 279:299 */       if (((atr)localObject3).J == bof.a)
/* 280:    */       {
/* 281:300 */         localObject4 = parambec;
/* 282:301 */         for (localIterator = en.a.iterator(); localIterator.hasNext();)
/* 283:    */         {
/* 284:301 */           localej2 = (ej)localIterator.next();
/* 285:302 */           if (paramRandom.nextBoolean()) {
/* 286:303 */             localObject4 = ((bec)localObject4).a(a(localej2), Boolean.valueOf(false));
/* 287:    */           }
/* 288:    */         }
/* 289:306 */         if ((((Boolean)((bec)localObject4).b(b)).booleanValue()) || (((Boolean)((bec)localObject4).b(M)).booleanValue()) || (((Boolean)((bec)localObject4).b(N)).booleanValue()) || (((Boolean)((bec)localObject4).b(O)).booleanValue())) {
/* 290:307 */           paramaqu.a((dt)localObject1, (bec)localObject4, 2);
/* 291:    */         }
/* 292:    */       }
/* 293:309 */       else if (localObject3 == this)
/* 294:    */       {
/* 295:310 */         localObject4 = localObject2;
/* 296:311 */         for (localIterator = en.a.iterator(); localIterator.hasNext();)
/* 297:    */         {
/* 298:311 */           localej2 = (ej)localIterator.next();
/* 299:312 */           localObject5 = a(localej2);
/* 300:313 */           if ((paramRandom.nextBoolean()) || (!((Boolean)parambec.b((bex)localObject5)).booleanValue())) {
/* 301:314 */             localObject4 = ((bec)localObject4).a((bex)localObject5, Boolean.valueOf(false));
/* 302:    */           }
/* 303:    */         }
/* 304:317 */         if ((((Boolean)((bec)localObject4).b(b)).booleanValue()) || (((Boolean)((bec)localObject4).b(M)).booleanValue()) || (((Boolean)((bec)localObject4).b(N)).booleanValue()) || (((Boolean)((bec)localObject4).b(O)).booleanValue())) {
/* 305:318 */           paramaqu.a((dt)localObject1, (bec)localObject4, 2);
/* 306:    */         }
/* 307:    */       }
/* 308:    */     }
/* 309:    */   }
/* 310:    */   
/* 311:    */   private static int b(ej paramej)
/* 312:    */   {
/* 313:325 */     return 1 << paramej.b();
/* 314:    */   }
/* 315:    */   
/* 316:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 317:    */   {
/* 318:330 */     bec localbec = P().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false));
/* 319:331 */     if (paramej.k().c()) {
/* 320:332 */       return localbec.a(a(paramej.d()), Boolean.valueOf(true));
/* 321:    */     }
/* 322:335 */     return localbec;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 326:    */   {
/* 327:341 */     return null;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public int a(Random paramRandom)
/* 331:    */   {
/* 332:346 */     return 0;
/* 333:    */   }
/* 334:    */   
/* 335:    */   public void a(aqu paramaqu, ahd paramahd, dt paramdt, bec parambec, bcm parambcm)
/* 336:    */   {
/* 337:351 */     if ((!paramaqu.D) && (paramahd.bY() != null) && (paramahd.bY().b() == amk.be))
/* 338:    */     {
/* 339:352 */       paramahd.b(ty.H[atr.a(this)]);
/* 340:    */       
/* 341:    */ 
/* 342:355 */       a(paramaqu, paramdt, new amj(aty.bn, 1, 0));
/* 343:    */     }
/* 344:    */     else
/* 345:    */     {
/* 346:357 */       super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/* 347:    */     }
/* 348:    */   }
/* 349:    */   
/* 350:    */   public aql k()
/* 351:    */   {
/* 352:363 */     return aql.c;
/* 353:    */   }
/* 354:    */   
/* 355:    */   public bec a(int paramInt)
/* 356:    */   {
/* 357:368 */     return P().a(b, Boolean.valueOf((paramInt & R) > 0)).a(M, Boolean.valueOf((paramInt & S) > 0)).a(N, Boolean.valueOf((paramInt & Q) > 0)).a(O, Boolean.valueOf((paramInt & T) > 0));
/* 358:    */   }
/* 359:    */   
/* 360:    */   public int c(bec parambec)
/* 361:    */   {
/* 362:377 */     int i = 0;
/* 363:379 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 364:380 */       i |= R;
/* 365:    */     }
/* 366:383 */     if (((Boolean)parambec.b(M)).booleanValue()) {
/* 367:384 */       i |= S;
/* 368:    */     }
/* 369:387 */     if (((Boolean)parambec.b(N)).booleanValue()) {
/* 370:388 */       i |= Q;
/* 371:    */     }
/* 372:391 */     if (((Boolean)parambec.b(O)).booleanValue()) {
/* 373:392 */       i |= T;
/* 374:    */     }
/* 375:395 */     return i;
/* 376:    */   }
/* 377:    */   
/* 378:    */   protected bed e()
/* 379:    */   {
/* 380:400 */     return new bed(this, new bex[] { a, b, M, N, O });
/* 381:    */   }
/* 382:    */   
/* 383:    */   public static bet a(ej paramej)
/* 384:    */   {
/* 385:404 */     switch (bbw.a[paramej.ordinal()])
/* 386:    */     {
/* 387:    */     case 1: 
/* 388:406 */       return a;
/* 389:    */     case 2: 
/* 390:408 */       return b;
/* 391:    */     case 3: 
/* 392:410 */       return N;
/* 393:    */     case 5: 
/* 394:412 */       return O;
/* 395:    */     case 4: 
/* 396:414 */       return M;
/* 397:    */     }
/* 398:417 */     throw new IllegalArgumentException(paramej + " is an invalid choice");
/* 399:    */   }
/* 400:    */   
/* 401:    */   public static int d(bec parambec)
/* 402:    */   {
/* 403:421 */     int i = 0;
/* 404:423 */     for (bet localbet : P) {
/* 405:424 */       if (((Boolean)parambec.b(localbet)).booleanValue()) {
/* 406:425 */         i++;
/* 407:    */       }
/* 408:    */     }
/* 409:429 */     return i;
/* 410:    */   }
/* 411:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbv
 * JD-Core Version:    0.7.0.1
 */