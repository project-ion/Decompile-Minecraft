/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class bms
/*   5:    */ {
/*   6:    */   protected bjb l;
/*   7:    */   protected ej m;
/*   8:    */   protected int n;
/*   9:    */   
/*  10:    */   public bms() {}
/*  11:    */   
/*  12:    */   protected bms(int paramInt)
/*  13:    */   {
/*  14: 59 */     this.n = paramInt;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public fn b()
/*  18:    */   {
/*  19: 63 */     fn localfn = new fn();
/*  20:    */     
/*  21: 65 */     localfn.a("id", bmq.a(this));
/*  22: 66 */     localfn.a("BB", this.l.g());
/*  23: 67 */     localfn.a("O", this.m == null ? -1 : this.m.b());
/*  24: 68 */     localfn.a("GD", this.n);
/*  25:    */     
/*  26: 70 */     a(localfn);
/*  27:    */     
/*  28: 72 */     return localfn;
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected abstract void a(fn paramfn);
/*  32:    */   
/*  33:    */   public void a(aqu paramaqu, fn paramfn)
/*  34:    */   {
/*  35: 78 */     if (paramfn.c("BB")) {
/*  36: 79 */       this.l = new bjb(paramfn.l("BB"));
/*  37:    */     }
/*  38: 81 */     int i = paramfn.f("O");
/*  39: 82 */     this.m = (i == -1 ? null : ej.b(i));
/*  40: 83 */     this.n = paramfn.f("GD");
/*  41:    */     
/*  42: 85 */     b(paramfn);
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected abstract void b(fn paramfn);
/*  46:    */   
/*  47:    */   public void a(bms parambms, List paramList, Random paramRandom) {}
/*  48:    */   
/*  49:    */   public abstract boolean a(aqu paramaqu, Random paramRandom, bjb parambjb);
/*  50:    */   
/*  51:    */   public bjb c()
/*  52:    */   {
/*  53: 96 */     return this.l;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public int d()
/*  57:    */   {
/*  58:100 */     return this.n;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public static bms a(List paramList, bjb parambjb)
/*  62:    */   {
/*  63:111 */     for (bms localbms : paramList) {
/*  64:112 */       if ((localbms.c() != null) && (localbms.c().a(parambjb))) {
/*  65:113 */         return localbms;
/*  66:    */       }
/*  67:    */     }
/*  68:116 */     return null;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public dt a()
/*  72:    */   {
/*  73:120 */     return new dt(this.l.f());
/*  74:    */   }
/*  75:    */   
/*  76:    */   protected boolean a(aqu paramaqu, bjb parambjb)
/*  77:    */   {
/*  78:124 */     int i = Math.max(this.l.a - 1, parambjb.a);
/*  79:125 */     int j = Math.max(this.l.b - 1, parambjb.b);
/*  80:126 */     int k = Math.max(this.l.c - 1, parambjb.c);
/*  81:127 */     int i1 = Math.min(this.l.d + 1, parambjb.d);
/*  82:128 */     int i2 = Math.min(this.l.e + 1, parambjb.e);
/*  83:129 */     int i3 = Math.min(this.l.f + 1, parambjb.f);
/*  84:    */     int i5;
/*  85:132 */     for (int i4 = i; i4 <= i1; i4++) {
/*  86:133 */       for (i5 = k; i5 <= i3; i5++)
/*  87:    */       {
/*  88:134 */         if (paramaqu.p(new dt(i4, j, i5)).c().r().d()) {
/*  89:135 */           return true;
/*  90:    */         }
/*  91:137 */         if (paramaqu.p(new dt(i4, i2, i5)).c().r().d()) {
/*  92:138 */           return true;
/*  93:    */         }
/*  94:    */       }
/*  95:    */     }
/*  96:143 */     for (i4 = i; i4 <= i1; i4++) {
/*  97:144 */       for (i5 = j; i5 <= i2; i5++)
/*  98:    */       {
/*  99:145 */         if (paramaqu.p(new dt(i4, i5, k)).c().r().d()) {
/* 100:146 */           return true;
/* 101:    */         }
/* 102:148 */         if (paramaqu.p(new dt(i4, i5, i3)).c().r().d()) {
/* 103:149 */           return true;
/* 104:    */         }
/* 105:    */       }
/* 106:    */     }
/* 107:154 */     for (i4 = k; i4 <= i3; i4++) {
/* 108:155 */       for (i5 = j; i5 <= i2; i5++)
/* 109:    */       {
/* 110:156 */         if (paramaqu.p(new dt(i, i5, i4)).c().r().d()) {
/* 111:157 */           return true;
/* 112:    */         }
/* 113:159 */         if (paramaqu.p(new dt(i1, i5, i4)).c().r().d()) {
/* 114:160 */           return true;
/* 115:    */         }
/* 116:    */       }
/* 117:    */     }
/* 118:164 */     return false;
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected int a(int paramInt1, int paramInt2)
/* 122:    */   {
/* 123:168 */     if (this.m == null) {
/* 124:169 */       return paramInt1;
/* 125:    */     }
/* 126:172 */     switch (bmt.a[this.m.ordinal()])
/* 127:    */     {
/* 128:    */     case 1: 
/* 129:    */     case 2: 
/* 130:175 */       return this.l.a + paramInt1;
/* 131:    */     case 3: 
/* 132:177 */       return this.l.d - paramInt2;
/* 133:    */     case 4: 
/* 134:179 */       return this.l.a + paramInt2;
/* 135:    */     }
/* 136:181 */     return paramInt1;
/* 137:    */   }
/* 138:    */   
/* 139:    */   protected int d(int paramInt)
/* 140:    */   {
/* 141:186 */     if (this.m == null) {
/* 142:187 */       return paramInt;
/* 143:    */     }
/* 144:189 */     return paramInt + this.l.b;
/* 145:    */   }
/* 146:    */   
/* 147:    */   protected int b(int paramInt1, int paramInt2)
/* 148:    */   {
/* 149:193 */     if (this.m == null) {
/* 150:194 */       return paramInt2;
/* 151:    */     }
/* 152:197 */     switch (bmt.a[this.m.ordinal()])
/* 153:    */     {
/* 154:    */     case 1: 
/* 155:199 */       return this.l.f - paramInt2;
/* 156:    */     case 2: 
/* 157:201 */       return this.l.c + paramInt2;
/* 158:    */     case 3: 
/* 159:    */     case 4: 
/* 160:204 */       return this.l.c + paramInt1;
/* 161:    */     }
/* 162:206 */     return paramInt2;
/* 163:    */   }
/* 164:    */   
/* 165:    */   protected int a(atr paramatr, int paramInt)
/* 166:    */   {
/* 167:212 */     if (paramatr == aty.av)
/* 168:    */     {
/* 169:213 */       if ((this.m == ej.e) || (this.m == ej.f))
/* 170:    */       {
/* 171:214 */         if (paramInt == 1) {
/* 172:215 */           return 0;
/* 173:    */         }
/* 174:217 */         return 1;
/* 175:    */       }
/* 176:    */     }
/* 177:220 */     else if ((paramatr instanceof avf))
/* 178:    */     {
/* 179:221 */       if (this.m == ej.d)
/* 180:    */       {
/* 181:222 */         if (paramInt == 0) {
/* 182:223 */           return 2;
/* 183:    */         }
/* 184:225 */         if (paramInt == 2) {
/* 185:226 */           return 0;
/* 186:    */         }
/* 187:    */       }
/* 188:    */       else
/* 189:    */       {
/* 190:228 */         if (this.m == ej.e) {
/* 191:233 */           return paramInt + 1 & 0x3;
/* 192:    */         }
/* 193:234 */         if (this.m == ej.f) {
/* 194:239 */           return paramInt + 3 & 0x3;
/* 195:    */         }
/* 196:    */       }
/* 197:    */     }
/* 198:241 */     else if ((paramatr == aty.aw) || (paramatr == aty.ad) || (paramatr == aty.bA) || (paramatr == aty.bv) || (paramatr == aty.bO))
/* 199:    */     {
/* 200:242 */       if (this.m == ej.d)
/* 201:    */       {
/* 202:243 */         if (paramInt == 2) {
/* 203:244 */           return 3;
/* 204:    */         }
/* 205:246 */         if (paramInt == 3) {
/* 206:247 */           return 2;
/* 207:    */         }
/* 208:    */       }
/* 209:249 */       else if (this.m == ej.e)
/* 210:    */       {
/* 211:250 */         if (paramInt == 0) {
/* 212:251 */           return 2;
/* 213:    */         }
/* 214:253 */         if (paramInt == 1) {
/* 215:254 */           return 3;
/* 216:    */         }
/* 217:256 */         if (paramInt == 2) {
/* 218:257 */           return 0;
/* 219:    */         }
/* 220:259 */         if (paramInt == 3) {
/* 221:260 */           return 1;
/* 222:    */         }
/* 223:    */       }
/* 224:262 */       else if (this.m == ej.f)
/* 225:    */       {
/* 226:263 */         if (paramInt == 0) {
/* 227:264 */           return 2;
/* 228:    */         }
/* 229:266 */         if (paramInt == 1) {
/* 230:267 */           return 3;
/* 231:    */         }
/* 232:269 */         if (paramInt == 2) {
/* 233:270 */           return 1;
/* 234:    */         }
/* 235:272 */         if (paramInt == 3) {
/* 236:273 */           return 0;
/* 237:    */         }
/* 238:    */       }
/* 239:    */     }
/* 240:276 */     else if (paramatr == aty.au)
/* 241:    */     {
/* 242:277 */       if (this.m == ej.d)
/* 243:    */       {
/* 244:278 */         if (paramInt == ej.c.a()) {
/* 245:279 */           return ej.d.a();
/* 246:    */         }
/* 247:281 */         if (paramInt == ej.d.a()) {
/* 248:282 */           return ej.c.a();
/* 249:    */         }
/* 250:    */       }
/* 251:284 */       else if (this.m == ej.e)
/* 252:    */       {
/* 253:285 */         if (paramInt == ej.c.a()) {
/* 254:286 */           return ej.e.a();
/* 255:    */         }
/* 256:288 */         if (paramInt == ej.d.a()) {
/* 257:289 */           return ej.f.a();
/* 258:    */         }
/* 259:291 */         if (paramInt == ej.e.a()) {
/* 260:292 */           return ej.c.a();
/* 261:    */         }
/* 262:294 */         if (paramInt == ej.f.a()) {
/* 263:295 */           return ej.d.a();
/* 264:    */         }
/* 265:    */       }
/* 266:297 */       else if (this.m == ej.f)
/* 267:    */       {
/* 268:299 */         if (paramInt == ej.c.a()) {
/* 269:300 */           return ej.f.a();
/* 270:    */         }
/* 271:302 */         if (paramInt == ej.d.a()) {
/* 272:303 */           return ej.e.a();
/* 273:    */         }
/* 274:305 */         if (paramInt == ej.e.a()) {
/* 275:306 */           return ej.c.a();
/* 276:    */         }
/* 277:308 */         if (paramInt == ej.f.a()) {
/* 278:309 */           return ej.d.a();
/* 279:    */         }
/* 280:    */       }
/* 281:    */     }
/* 282:312 */     else if (paramatr == aty.aG)
/* 283:    */     {
/* 284:313 */       if (this.m == ej.d)
/* 285:    */       {
/* 286:314 */         if (paramInt == 3) {
/* 287:315 */           return 4;
/* 288:    */         }
/* 289:317 */         if (paramInt == 4) {
/* 290:318 */           return 3;
/* 291:    */         }
/* 292:    */       }
/* 293:320 */       else if (this.m == ej.e)
/* 294:    */       {
/* 295:321 */         if (paramInt == 3) {
/* 296:322 */           return 1;
/* 297:    */         }
/* 298:324 */         if (paramInt == 4) {
/* 299:325 */           return 2;
/* 300:    */         }
/* 301:327 */         if (paramInt == 2) {
/* 302:328 */           return 3;
/* 303:    */         }
/* 304:330 */         if (paramInt == 1) {
/* 305:331 */           return 4;
/* 306:    */         }
/* 307:    */       }
/* 308:333 */       else if (this.m == ej.f)
/* 309:    */       {
/* 310:334 */         if (paramInt == 3) {
/* 311:335 */           return 2;
/* 312:    */         }
/* 313:337 */         if (paramInt == 4) {
/* 314:338 */           return 1;
/* 315:    */         }
/* 316:340 */         if (paramInt == 2) {
/* 317:341 */           return 3;
/* 318:    */         }
/* 319:343 */         if (paramInt == 1) {
/* 320:344 */           return 4;
/* 321:    */         }
/* 322:    */       }
/* 323:    */     }
/* 324:347 */     else if ((paramatr == aty.bR) || ((paramatr instanceof avb)))
/* 325:    */     {
/* 326:348 */       ej localej = ej.b(paramInt);
/* 327:349 */       if (this.m == ej.d)
/* 328:    */       {
/* 329:350 */         if ((localej == ej.d) || (localej == ej.c)) {
/* 330:351 */           return localej.d().b();
/* 331:    */         }
/* 332:    */       }
/* 333:353 */       else if (this.m == ej.e)
/* 334:    */       {
/* 335:354 */         if (localej == ej.c) {
/* 336:355 */           return ej.e.b();
/* 337:    */         }
/* 338:357 */         if (localej == ej.d) {
/* 339:358 */           return ej.f.b();
/* 340:    */         }
/* 341:360 */         if (localej == ej.e) {
/* 342:361 */           return ej.c.b();
/* 343:    */         }
/* 344:363 */         if (localej == ej.f) {
/* 345:364 */           return ej.d.b();
/* 346:    */         }
/* 347:    */       }
/* 348:366 */       else if (this.m == ej.f)
/* 349:    */       {
/* 350:368 */         if (localej == ej.c) {
/* 351:369 */           return ej.f.b();
/* 352:    */         }
/* 353:371 */         if (localej == ej.d) {
/* 354:372 */           return ej.e.b();
/* 355:    */         }
/* 356:374 */         if (localej == ej.e) {
/* 357:375 */           return ej.c.b();
/* 358:    */         }
/* 359:377 */         if (localej == ej.f) {
/* 360:378 */           return ej.d.b();
/* 361:    */         }
/* 362:    */       }
/* 363:    */     }
/* 364:381 */     else if ((paramatr == aty.J) || (paramatr == aty.F) || (paramatr == aty.ay) || (paramatr == aty.z))
/* 365:    */     {
/* 366:382 */       if (this.m == ej.d)
/* 367:    */       {
/* 368:383 */         if ((paramInt == ej.c.a()) || (paramInt == ej.d.a())) {
/* 369:384 */           return ej.a(paramInt).d().a();
/* 370:    */         }
/* 371:    */       }
/* 372:386 */       else if (this.m == ej.e)
/* 373:    */       {
/* 374:387 */         if (paramInt == ej.c.a()) {
/* 375:388 */           return ej.e.a();
/* 376:    */         }
/* 377:390 */         if (paramInt == ej.d.a()) {
/* 378:391 */           return ej.f.a();
/* 379:    */         }
/* 380:393 */         if (paramInt == ej.e.a()) {
/* 381:394 */           return ej.c.a();
/* 382:    */         }
/* 383:396 */         if (paramInt == ej.f.a()) {
/* 384:397 */           return ej.d.a();
/* 385:    */         }
/* 386:    */       }
/* 387:399 */       else if (this.m == ej.f)
/* 388:    */       {
/* 389:400 */         if (paramInt == ej.c.a()) {
/* 390:401 */           return ej.f.a();
/* 391:    */         }
/* 392:403 */         if (paramInt == ej.d.a()) {
/* 393:404 */           return ej.e.a();
/* 394:    */         }
/* 395:406 */         if (paramInt == ej.e.a()) {
/* 396:407 */           return ej.c.a();
/* 397:    */         }
/* 398:409 */         if (paramInt == ej.f.a()) {
/* 399:410 */           return ej.d.a();
/* 400:    */         }
/* 401:    */       }
/* 402:    */     }
/* 403:414 */     return paramInt;
/* 404:    */   }
/* 405:    */   
/* 406:    */   protected void a(aqu paramaqu, bec parambec, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 407:    */   {
/* 408:418 */     dt localdt = new dt(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 409:420 */     if (!parambjb.b(localdt)) {
/* 410:421 */       return;
/* 411:    */     }
/* 412:424 */     paramaqu.a(localdt, parambec, 2);
/* 413:    */   }
/* 414:    */   
/* 415:    */   protected bec a(aqu paramaqu, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 416:    */   {
/* 417:440 */     int i = a(paramInt1, paramInt3);
/* 418:441 */     int j = d(paramInt2);
/* 419:442 */     int k = b(paramInt1, paramInt3);
/* 420:444 */     if (!parambjb.b(new dt(i, j, k))) {
/* 421:445 */       return aty.a.P();
/* 422:    */     }
/* 423:448 */     return paramaqu.p(new dt(i, j, k));
/* 424:    */   }
/* 425:    */   
/* 426:    */   protected void a(aqu paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 427:    */   {
/* 428:452 */     for (int i = paramInt2; i <= paramInt5; i++) {
/* 429:453 */       for (int j = paramInt1; j <= paramInt4; j++) {
/* 430:454 */         for (int k = paramInt3; k <= paramInt6; k++) {
/* 431:455 */           a(paramaqu, aty.a.P(), j, i, k, parambjb);
/* 432:    */         }
/* 433:    */       }
/* 434:    */     }
/* 435:    */   }
/* 436:    */   
/* 437:    */   protected void a(aqu paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, bec parambec1, bec parambec2, boolean paramBoolean)
/* 438:    */   {
/* 439:462 */     for (int i = paramInt2; i <= paramInt5; i++) {
/* 440:463 */       for (int j = paramInt1; j <= paramInt4; j++) {
/* 441:464 */         for (int k = paramInt3; k <= paramInt6; k++) {
/* 442:465 */           if ((!paramBoolean) || (a(paramaqu, j, i, k, parambjb).c().r() != bof.a)) {
/* 443:468 */             if ((i == paramInt2) || (i == paramInt5) || (j == paramInt1) || (j == paramInt4) || (k == paramInt3) || (k == paramInt6)) {
/* 444:469 */               a(paramaqu, parambec1, j, i, k, parambjb);
/* 445:    */             } else {
/* 446:471 */               a(paramaqu, parambec2, j, i, k, parambjb);
/* 447:    */             }
/* 448:    */           }
/* 449:    */         }
/* 450:    */       }
/* 451:    */     }
/* 452:    */   }
/* 453:    */   
/* 454:    */   protected void a(aqu paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, Random paramRandom, bmu parambmu)
/* 455:    */   {
/* 456:483 */     for (int i = paramInt2; i <= paramInt5; i++) {
/* 457:484 */       for (int j = paramInt1; j <= paramInt4; j++) {
/* 458:485 */         for (int k = paramInt3; k <= paramInt6; k++) {
/* 459:486 */           if ((!paramBoolean) || (a(paramaqu, j, i, k, parambjb).c().r() != bof.a))
/* 460:    */           {
/* 461:489 */             parambmu.a(paramRandom, j, i, k, (i == paramInt2) || (i == paramInt5) || (j == paramInt1) || (j == paramInt4) || (k == paramInt3) || (k == paramInt6));
/* 462:490 */             a(paramaqu, parambmu.a(), j, i, k, parambjb);
/* 463:    */           }
/* 464:    */         }
/* 465:    */       }
/* 466:    */     }
/* 467:    */   }
/* 468:    */   
/* 469:    */   protected void a(aqu paramaqu, bjb parambjb, Random paramRandom, float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, bec parambec1, bec parambec2, boolean paramBoolean)
/* 470:    */   {
/* 471:501 */     for (int i = paramInt2; i <= paramInt5; i++) {
/* 472:502 */       for (int j = paramInt1; j <= paramInt4; j++) {
/* 473:503 */         for (int k = paramInt3; k <= paramInt6; k++) {
/* 474:504 */           if (paramRandom.nextFloat() <= paramFloat) {
/* 475:507 */             if ((!paramBoolean) || (a(paramaqu, j, i, k, parambjb).c().r() != bof.a)) {
/* 476:510 */               if ((i == paramInt2) || (i == paramInt5) || (j == paramInt1) || (j == paramInt4) || (k == paramInt3) || (k == paramInt6)) {
/* 477:511 */                 a(paramaqu, parambec1, j, i, k, parambjb);
/* 478:    */               } else {
/* 479:513 */                 a(paramaqu, parambec2, j, i, k, parambjb);
/* 480:    */               }
/* 481:    */             }
/* 482:    */           }
/* 483:    */         }
/* 484:    */       }
/* 485:    */     }
/* 486:    */   }
/* 487:    */   
/* 488:    */   protected void a(aqu paramaqu, bjb parambjb, Random paramRandom, float paramFloat, int paramInt1, int paramInt2, int paramInt3, bec parambec)
/* 489:    */   {
/* 490:521 */     if (paramRandom.nextFloat() < paramFloat) {
/* 491:522 */       a(paramaqu, parambec, paramInt1, paramInt2, paramInt3, parambjb);
/* 492:    */     }
/* 493:    */   }
/* 494:    */   
/* 495:    */   protected void a(aqu paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, bec parambec, boolean paramBoolean)
/* 496:    */   {
/* 497:527 */     float f1 = paramInt4 - paramInt1 + 1;
/* 498:528 */     float f2 = paramInt5 - paramInt2 + 1;
/* 499:529 */     float f3 = paramInt6 - paramInt3 + 1;
/* 500:530 */     float f4 = paramInt1 + f1 / 2.0F;
/* 501:531 */     float f5 = paramInt3 + f3 / 2.0F;
/* 502:533 */     for (int i = paramInt2; i <= paramInt5; i++)
/* 503:    */     {
/* 504:534 */       float f6 = (i - paramInt2) / f2;
/* 505:536 */       for (int j = paramInt1; j <= paramInt4; j++)
/* 506:    */       {
/* 507:537 */         float f7 = (j - f4) / (f1 * 0.5F);
/* 508:539 */         for (int k = paramInt3; k <= paramInt6; k++)
/* 509:    */         {
/* 510:540 */           float f8 = (k - f5) / (f3 * 0.5F);
/* 511:542 */           if ((!paramBoolean) || (a(paramaqu, j, i, k, parambjb).c().r() != bof.a))
/* 512:    */           {
/* 513:546 */             float f9 = f7 * f7 + f6 * f6 + f8 * f8;
/* 514:548 */             if (f9 <= 1.05F) {
/* 515:549 */               a(paramaqu, parambec, j, i, k, parambjb);
/* 516:    */             }
/* 517:    */           }
/* 518:    */         }
/* 519:    */       }
/* 520:    */     }
/* 521:    */   }
/* 522:    */   
/* 523:    */   protected void b(aqu paramaqu, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 524:    */   {
/* 525:557 */     dt localdt = new dt(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 526:559 */     if (!parambjb.b(localdt)) {
/* 527:560 */       return;
/* 528:    */     }
/* 529:563 */     while ((!paramaqu.d(localdt)) && (localdt.o() < 255))
/* 530:    */     {
/* 531:564 */       paramaqu.a(localdt, aty.a.P(), 2);
/* 532:565 */       localdt = localdt.a();
/* 533:    */     }
/* 534:    */   }
/* 535:    */   
/* 536:    */   protected void b(aqu paramaqu, bec parambec, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 537:    */   {
/* 538:570 */     int i = a(paramInt1, paramInt3);
/* 539:571 */     int j = d(paramInt2);
/* 540:572 */     int k = b(paramInt1, paramInt3);
/* 541:574 */     if (!parambjb.b(new dt(i, j, k))) {
/* 542:575 */       return;
/* 543:    */     }
/* 544:578 */     while (((paramaqu.d(new dt(i, j, k))) || (paramaqu.p(new dt(i, j, k)).c().r().d())) && (j > 1))
/* 545:    */     {
/* 546:579 */       paramaqu.a(new dt(i, j, k), parambec, 2);
/* 547:580 */       j--;
/* 548:    */     }
/* 549:    */   }
/* 550:    */   
/* 551:    */   protected boolean a(aqu paramaqu, bjb parambjb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, List paramList, int paramInt4)
/* 552:    */   {
/* 553:585 */     dt localdt = new dt(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 554:587 */     if ((parambjb.b(localdt)) && 
/* 555:588 */       (paramaqu.p(localdt).c() != aty.ae))
/* 556:    */     {
/* 557:589 */       bec localbec = aty.ae.P();
/* 558:590 */       paramaqu.a(localdt, aty.ae.f(paramaqu, localdt, localbec), 2);
/* 559:    */       
/* 560:592 */       bcm localbcm = paramaqu.s(localdt);
/* 561:593 */       if ((localbcm instanceof bcr)) {
/* 562:594 */         vl.a(paramRandom, paramList, (bcr)localbcm, paramInt4);
/* 563:    */       }
/* 564:596 */       return true;
/* 565:    */     }
/* 566:599 */     return false;
/* 567:    */   }
/* 568:    */   
/* 569:    */   protected boolean a(aqu paramaqu, bjb parambjb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List paramList, int paramInt5)
/* 570:    */   {
/* 571:603 */     dt localdt = new dt(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 572:605 */     if ((parambjb.b(localdt)) && 
/* 573:606 */       (paramaqu.p(localdt).c() != aty.z))
/* 574:    */     {
/* 575:607 */       paramaqu.a(localdt, aty.z.a(a(aty.z, paramInt4)), 2);
/* 576:    */       
/* 577:609 */       bcm localbcm = paramaqu.s(localdt);
/* 578:610 */       if ((localbcm instanceof bcx)) {
/* 579:611 */         vl.a(paramRandom, paramList, (bcx)localbcm, paramInt5);
/* 580:    */       }
/* 581:613 */       return true;
/* 582:    */     }
/* 583:616 */     return false;
/* 584:    */   }
/* 585:    */   
/* 586:    */   protected void a(aqu paramaqu, bjb parambjb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej)
/* 587:    */   {
/* 588:620 */     dt localdt = new dt(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 589:622 */     if (parambjb.b(localdt)) {
/* 590:623 */       akt.a(paramaqu, localdt, paramej.f(), aty.ao);
/* 591:    */     }
/* 592:    */   }
/* 593:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bms
 * JD-Core Version:    0.7.0.1
 */