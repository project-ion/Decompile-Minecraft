/*   1:    */ import com.google.common.collect.HashMultimap;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.google.common.collect.Multimap;
/*   4:    */ import java.text.DecimalFormat;
/*   5:    */ import java.util.ArrayList;
/*   6:    */ import java.util.Collection;
/*   7:    */ import java.util.Iterator;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Map.Entry;
/*  10:    */ import java.util.Random;
/*  11:    */ import java.util.Set;
/*  12:    */ import java.util.UUID;
/*  13:    */ 
/*  14:    */ public final class amj
/*  15:    */ {
/*  16: 39 */   public static final DecimalFormat a = new DecimalFormat("#.###");
/*  17:    */   public int b;
/*  18:    */   public int c;
/*  19:    */   private alq d;
/*  20:    */   private fn e;
/*  21:    */   private int f;
/*  22:    */   private adk g;
/*  23:    */   
/*  24:    */   public amj(atr paramatr)
/*  25:    */   {
/*  26: 76 */     this(paramatr, 1);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public amj(atr paramatr, int paramInt)
/*  30:    */   {
/*  31: 80 */     this(paramatr, paramInt, 0);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public amj(atr paramatr, int paramInt1, int paramInt2)
/*  35:    */   {
/*  36: 84 */     this(alq.a(paramatr), paramInt1, paramInt2);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public amj(alq paramalq)
/*  40:    */   {
/*  41: 88 */     this(paramalq, 1);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public amj(alq paramalq, int paramInt)
/*  45:    */   {
/*  46: 92 */     this(paramalq, paramInt, 0);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public amj(alq paramalq, int paramInt1, int paramInt2)
/*  50:    */   {
/*  51: 96 */     this.d = paramalq;
/*  52: 97 */     this.b = paramInt1;
/*  53: 98 */     this.f = paramInt2;
/*  54: 99 */     if (this.f < 0) {
/*  55:100 */       this.f = 0;
/*  56:    */     }
/*  57:    */   }
/*  58:    */   
/*  59:    */   public static amj a(fn paramfn)
/*  60:    */   {
/*  61:105 */     amj localamj = new amj();
/*  62:106 */     localamj.c(paramfn);
/*  63:107 */     return localamj.b() != null ? localamj : null;
/*  64:    */   }
/*  65:    */   
/*  66:    */   private amj() {}
/*  67:    */   
/*  68:    */   public amj a(int paramInt)
/*  69:    */   {
/*  70:114 */     amj localamj = new amj(this.d, paramInt, this.f);
/*  71:115 */     if (this.e != null) {
/*  72:116 */       localamj.e = ((fn)this.e.b());
/*  73:    */     }
/*  74:118 */     this.b -= paramInt;
/*  75:119 */     return localamj;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public alq b()
/*  79:    */   {
/*  80:123 */     return this.d;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public boolean a(ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  84:    */   {
/*  85:127 */     boolean bool = b().a(this, paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/*  86:128 */     if (bool) {
/*  87:129 */       paramahd.b(ty.J[alq.b(this.d)]);
/*  88:    */     }
/*  89:131 */     return bool;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public float a(atr paramatr)
/*  93:    */   {
/*  94:135 */     return b().a(this, paramatr);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public amj a(aqu paramaqu, ahd paramahd)
/*  98:    */   {
/*  99:139 */     return b().a(this, paramaqu, paramahd);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public amj b(aqu paramaqu, ahd paramahd)
/* 103:    */   {
/* 104:143 */     return b().b(this, paramaqu, paramahd);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public fn b(fn paramfn)
/* 108:    */   {
/* 109:147 */     oa localoa = (oa)alq.e.c(this.d);
/* 110:148 */     paramfn.a("id", localoa == null ? "minecraft:air" : localoa.toString());
/* 111:149 */     paramfn.a("Count", (byte)this.b);
/* 112:150 */     paramfn.a("Damage", (short)this.f);
/* 113:151 */     if (this.e != null) {
/* 114:152 */       paramfn.a("tag", this.e);
/* 115:    */     }
/* 116:154 */     return paramfn;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void c(fn paramfn)
/* 120:    */   {
/* 121:158 */     if (paramfn.b("id", 8)) {
/* 122:159 */       this.d = alq.d(paramfn.j("id"));
/* 123:    */     } else {
/* 124:161 */       this.d = alq.b(paramfn.e("id"));
/* 125:    */     }
/* 126:163 */     this.b = paramfn.d("Count");
/* 127:164 */     this.f = paramfn.e("Damage");
/* 128:165 */     if (this.f < 0) {
/* 129:166 */       this.f = 0;
/* 130:    */     }
/* 131:168 */     if (paramfn.b("tag", 10))
/* 132:    */     {
/* 133:169 */       this.e = paramfn.m("tag");
/* 134:170 */       if (this.d != null) {
/* 135:171 */         this.d.a(this.e);
/* 136:    */       }
/* 137:    */     }
/* 138:    */   }
/* 139:    */   
/* 140:    */   public int c()
/* 141:    */   {
/* 142:177 */     return b().j();
/* 143:    */   }
/* 144:    */   
/* 145:    */   public boolean d()
/* 146:    */   {
/* 147:181 */     return (c() > 1) && ((!e()) || (!g()));
/* 148:    */   }
/* 149:    */   
/* 150:    */   public boolean e()
/* 151:    */   {
/* 152:185 */     if (this.d == null) {
/* 153:186 */       return false;
/* 154:    */     }
/* 155:188 */     if (this.d.l() <= 0) {
/* 156:189 */       return false;
/* 157:    */     }
/* 158:191 */     if ((n()) && (o().n("Unbreakable"))) {
/* 159:192 */       return false;
/* 160:    */     }
/* 161:194 */     return true;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public boolean f()
/* 165:    */   {
/* 166:204 */     return this.d.k();
/* 167:    */   }
/* 168:    */   
/* 169:    */   public boolean g()
/* 170:    */   {
/* 171:208 */     return (e()) && (this.f > 0);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public int h()
/* 175:    */   {
/* 176:212 */     return this.f;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public int i()
/* 180:    */   {
/* 181:216 */     return this.f;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void b(int paramInt)
/* 185:    */   {
/* 186:220 */     this.f = paramInt;
/* 187:221 */     if (this.f < 0) {
/* 188:222 */       this.f = 0;
/* 189:    */     }
/* 190:    */   }
/* 191:    */   
/* 192:    */   public int j()
/* 193:    */   {
/* 194:227 */     return this.d.l();
/* 195:    */   }
/* 196:    */   
/* 197:    */   public boolean a(int paramInt, Random paramRandom)
/* 198:    */   {
/* 199:231 */     if (!e()) {
/* 200:232 */       return false;
/* 201:    */     }
/* 202:235 */     if (paramInt > 0)
/* 203:    */     {
/* 204:236 */       int m = aph.a(apf.t.B, this);
/* 205:    */       
/* 206:238 */       int n = 0;
/* 207:239 */       for (int i1 = 0; (m > 0) && (i1 < paramInt); i1++) {
/* 208:240 */         if (apd.a(this, m, paramRandom)) {
/* 209:241 */           n++;
/* 210:    */         }
/* 211:    */       }
/* 212:244 */       paramInt -= n;
/* 213:246 */       if (paramInt <= 0) {
/* 214:247 */         return false;
/* 215:    */       }
/* 216:    */     }
/* 217:251 */     this.f += paramInt;
/* 218:    */     
/* 219:253 */     return this.f > j();
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void a(int paramInt, xm paramxm)
/* 223:    */   {
/* 224:257 */     if (((paramxm instanceof ahd)) && (((ahd)paramxm).by.d)) {
/* 225:258 */       return;
/* 226:    */     }
/* 227:260 */     if (!e()) {
/* 228:261 */       return;
/* 229:    */     }
/* 230:264 */     if (a(paramInt, paramxm.bb()))
/* 231:    */     {
/* 232:265 */       paramxm.b(this);
/* 233:    */       
/* 234:267 */       this.b -= 1;
/* 235:268 */       if ((paramxm instanceof ahd))
/* 236:    */       {
/* 237:269 */         ahd localahd = (ahd)paramxm;
/* 238:270 */         localahd.b(ty.K[alq.b(this.d)]);
/* 239:271 */         if ((this.b == 0) && ((b() instanceof ajz))) {
/* 240:272 */           localahd.bZ();
/* 241:    */         }
/* 242:    */       }
/* 243:275 */       if (this.b < 0) {
/* 244:276 */         this.b = 0;
/* 245:    */       }
/* 246:278 */       this.f = 0;
/* 247:    */     }
/* 248:    */   }
/* 249:    */   
/* 250:    */   public void a(xm paramxm, ahd paramahd)
/* 251:    */   {
/* 252:283 */     boolean bool = this.d.a(this, paramxm, paramahd);
/* 253:284 */     if (bool) {
/* 254:285 */       paramahd.b(ty.J[alq.b(this.d)]);
/* 255:    */     }
/* 256:    */   }
/* 257:    */   
/* 258:    */   public void a(aqu paramaqu, atr paramatr, dt paramdt, ahd paramahd)
/* 259:    */   {
/* 260:290 */     boolean bool = this.d.a(this, paramaqu, paramatr, paramdt, paramahd);
/* 261:291 */     if (bool) {
/* 262:292 */       paramahd.b(ty.J[alq.b(this.d)]);
/* 263:    */     }
/* 264:    */   }
/* 265:    */   
/* 266:    */   public boolean b(atr paramatr)
/* 267:    */   {
/* 268:297 */     return this.d.b(paramatr);
/* 269:    */   }
/* 270:    */   
/* 271:    */   public boolean a(ahd paramahd, xm paramxm)
/* 272:    */   {
/* 273:301 */     return this.d.a(this, paramahd, paramxm);
/* 274:    */   }
/* 275:    */   
/* 276:    */   public amj k()
/* 277:    */   {
/* 278:305 */     amj localamj = new amj(this.d, this.b, this.f);
/* 279:306 */     if (this.e != null) {
/* 280:307 */       localamj.e = ((fn)this.e.b());
/* 281:    */     }
/* 282:309 */     return localamj;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public static boolean a(amj paramamj1, amj paramamj2)
/* 286:    */   {
/* 287:313 */     if ((paramamj1 == null) && (paramamj2 == null)) {
/* 288:314 */       return true;
/* 289:    */     }
/* 290:316 */     if ((paramamj1 == null) || (paramamj2 == null)) {
/* 291:317 */       return false;
/* 292:    */     }
/* 293:320 */     if ((paramamj1.e == null) && (paramamj2.e != null)) {
/* 294:321 */       return false;
/* 295:    */     }
/* 296:323 */     if ((paramamj1.e != null) && (!paramamj1.e.equals(paramamj2.e))) {
/* 297:324 */       return false;
/* 298:    */     }
/* 299:326 */     return true;
/* 300:    */   }
/* 301:    */   
/* 302:    */   public static boolean b(amj paramamj1, amj paramamj2)
/* 303:    */   {
/* 304:330 */     if ((paramamj1 == null) && (paramamj2 == null)) {
/* 305:331 */       return true;
/* 306:    */     }
/* 307:333 */     if ((paramamj1 == null) || (paramamj2 == null)) {
/* 308:334 */       return false;
/* 309:    */     }
/* 310:336 */     return paramamj1.d(paramamj2);
/* 311:    */   }
/* 312:    */   
/* 313:    */   private boolean d(amj paramamj)
/* 314:    */   {
/* 315:340 */     if (this.b != paramamj.b) {
/* 316:341 */       return false;
/* 317:    */     }
/* 318:343 */     if (this.d != paramamj.d) {
/* 319:344 */       return false;
/* 320:    */     }
/* 321:346 */     if (this.f != paramamj.f) {
/* 322:347 */       return false;
/* 323:    */     }
/* 324:349 */     if ((this.e == null) && (paramamj.e != null)) {
/* 325:350 */       return false;
/* 326:    */     }
/* 327:352 */     if ((this.e != null) && (!this.e.equals(paramamj.e))) {
/* 328:353 */       return false;
/* 329:    */     }
/* 330:355 */     return true;
/* 331:    */   }
/* 332:    */   
/* 333:    */   public static boolean c(amj paramamj1, amj paramamj2)
/* 334:    */   {
/* 335:359 */     if ((paramamj1 == null) && (paramamj2 == null)) {
/* 336:360 */       return true;
/* 337:    */     }
/* 338:362 */     if ((paramamj1 != null) && (paramamj2 != null)) {
/* 339:363 */       return paramamj1.a(paramamj2);
/* 340:    */     }
/* 341:365 */     return false;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public boolean a(amj paramamj)
/* 345:    */   {
/* 346:376 */     return (paramamj != null) && (this.d == paramamj.d) && (this.f == paramamj.f);
/* 347:    */   }
/* 348:    */   
/* 349:    */   public String a()
/* 350:    */   {
/* 351:381 */     return this.d.e_(this);
/* 352:    */   }
/* 353:    */   
/* 354:    */   public static amj b(amj paramamj)
/* 355:    */   {
/* 356:390 */     return paramamj == null ? null : paramamj.k();
/* 357:    */   }
/* 358:    */   
/* 359:    */   public String toString()
/* 360:    */   {
/* 361:395 */     return this.b + "x" + this.d.a() + "@" + this.f;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public void a(aqu paramaqu, wv paramwv, int paramInt, boolean paramBoolean)
/* 365:    */   {
/* 366:399 */     if (this.c > 0) {
/* 367:400 */       this.c -= 1;
/* 368:    */     }
/* 369:402 */     this.d.a(this, paramaqu, paramwv, paramInt, paramBoolean);
/* 370:    */   }
/* 371:    */   
/* 372:    */   public void a(aqu paramaqu, ahd paramahd, int paramInt)
/* 373:    */   {
/* 374:406 */     paramahd.a(ty.I[alq.b(this.d)], paramInt);
/* 375:407 */     this.d.d(this, paramaqu, paramahd);
/* 376:    */   }
/* 377:    */   
/* 378:    */   public boolean c(amj paramamj)
/* 379:    */   {
/* 380:411 */     return d(paramamj);
/* 381:    */   }
/* 382:    */   
/* 383:    */   public int l()
/* 384:    */   {
/* 385:415 */     return b().d(this);
/* 386:    */   }
/* 387:    */   
/* 388:    */   public ano m()
/* 389:    */   {
/* 390:419 */     return b().e(this);
/* 391:    */   }
/* 392:    */   
/* 393:    */   public void b(aqu paramaqu, ahd paramahd, int paramInt)
/* 394:    */   {
/* 395:423 */     b().a(this, paramaqu, paramahd, paramInt);
/* 396:    */   }
/* 397:    */   
/* 398:    */   public boolean n()
/* 399:    */   {
/* 400:427 */     return this.e != null;
/* 401:    */   }
/* 402:    */   
/* 403:    */   public fn o()
/* 404:    */   {
/* 405:431 */     return this.e;
/* 406:    */   }
/* 407:    */   
/* 408:    */   public fn a(String paramString, boolean paramBoolean)
/* 409:    */   {
/* 410:435 */     if ((this.e == null) || (!this.e.b(paramString, 10)))
/* 411:    */     {
/* 412:436 */       if (paramBoolean)
/* 413:    */       {
/* 414:437 */         fn localfn = new fn();
/* 415:438 */         a(paramString, localfn);
/* 416:439 */         return localfn;
/* 417:    */       }
/* 418:441 */       return null;
/* 419:    */     }
/* 420:443 */     return this.e.m(paramString);
/* 421:    */   }
/* 422:    */   
/* 423:    */   public fv p()
/* 424:    */   {
/* 425:447 */     if (this.e == null) {
/* 426:448 */       return null;
/* 427:    */     }
/* 428:450 */     return this.e.c("ench", 10);
/* 429:    */   }
/* 430:    */   
/* 431:    */   public void d(fn paramfn)
/* 432:    */   {
/* 433:454 */     this.e = paramfn;
/* 434:    */   }
/* 435:    */   
/* 436:    */   public String q()
/* 437:    */   {
/* 438:458 */     String str = b().a(this);
/* 439:460 */     if ((this.e != null) && (this.e.b("display", 10)))
/* 440:    */     {
/* 441:461 */       fn localfn = this.e.m("display");
/* 442:463 */       if (localfn.b("Name", 8)) {
/* 443:464 */         str = localfn.j("Name");
/* 444:    */       }
/* 445:    */     }
/* 446:468 */     return str;
/* 447:    */   }
/* 448:    */   
/* 449:    */   public amj c(String paramString)
/* 450:    */   {
/* 451:472 */     if (this.e == null) {
/* 452:473 */       this.e = new fn();
/* 453:    */     }
/* 454:475 */     if (!this.e.b("display", 10)) {
/* 455:476 */       this.e.a("display", new fn());
/* 456:    */     }
/* 457:478 */     this.e.m("display").a("Name", paramString);
/* 458:479 */     return this;
/* 459:    */   }
/* 460:    */   
/* 461:    */   public void r()
/* 462:    */   {
/* 463:483 */     if (this.e == null) {
/* 464:484 */       return;
/* 465:    */     }
/* 466:486 */     if (!this.e.b("display", 10)) {
/* 467:487 */       return;
/* 468:    */     }
/* 469:489 */     fn localfn = this.e.m("display");
/* 470:490 */     localfn.o("Name");
/* 471:492 */     if (localfn.c_())
/* 472:    */     {
/* 473:493 */       this.e.o("display");
/* 474:495 */       if (this.e.c_()) {
/* 475:496 */         d(null);
/* 476:    */       }
/* 477:    */     }
/* 478:    */   }
/* 479:    */   
/* 480:    */   public boolean s()
/* 481:    */   {
/* 482:502 */     if (this.e == null) {
/* 483:503 */       return false;
/* 484:    */     }
/* 485:505 */     if (!this.e.b("display", 10)) {
/* 486:506 */       return false;
/* 487:    */     }
/* 488:508 */     return this.e.m("display").b("Name", 8);
/* 489:    */   }
/* 490:    */   
/* 491:    */   public List a(ahd paramahd, boolean paramBoolean)
/* 492:    */   {
/* 493:512 */     ArrayList localArrayList = Lists.newArrayList();
/* 494:    */     
/* 495:514 */     String str1 = q();
/* 496:515 */     if (s()) {
/* 497:516 */       str1 = a.u + str1;
/* 498:    */     }
/* 499:518 */     str1 = str1 + a.v;
/* 500:520 */     if (paramBoolean)
/* 501:    */     {
/* 502:521 */       String str2 = "";
/* 503:523 */       if (str1.length() > 0)
/* 504:    */       {
/* 505:524 */         str1 = str1 + " (";
/* 506:525 */         str2 = ")";
/* 507:    */       }
/* 508:528 */       int n = alq.b(this.d);
/* 509:529 */       if (f()) {
/* 510:530 */         str1 = str1 + String.format("#%04d/%d%s", new Object[] { Integer.valueOf(n), Integer.valueOf(this.f), str2 });
/* 511:    */       } else {
/* 512:532 */         str1 = str1 + String.format("#%04d%s", new Object[] { Integer.valueOf(n), str2 });
/* 513:    */       }
/* 514:    */     }
/* 515:534 */     else if ((!s()) && 
/* 516:535 */       (this.d == amk.bd))
/* 517:    */     {
/* 518:536 */       str1 = str1 + " #" + this.f;
/* 519:    */     }
/* 520:539 */     localArrayList.add(str1);
/* 521:    */     
/* 522:541 */     int m = 0;
/* 523:542 */     if ((n()) && 
/* 524:543 */       (this.e.b("HideFlags", 99))) {
/* 525:544 */       m = this.e.f("HideFlags");
/* 526:    */     }
/* 527:548 */     if ((m & 0x20) == 0) {
/* 528:549 */       this.d.a(this, paramahd, localArrayList, paramBoolean);
/* 529:    */     }
/* 530:    */     Object localObject2;
/* 531:552 */     if (n())
/* 532:    */     {
/* 533:    */       int i2;
/* 534:553 */       if ((m & 0x1) == 0)
/* 535:    */       {
/* 536:554 */         localObject1 = p();
/* 537:555 */         if (localObject1 != null) {
/* 538:556 */           for (int i1 = 0; i1 < ((fv)localObject1).c(); i1++)
/* 539:    */           {
/* 540:557 */             i2 = ((fv)localObject1).b(i1).e("id");
/* 541:558 */             int i4 = ((fv)localObject1).b(i1).e("lvl");
/* 542:560 */             if (apf.c(i2) != null) {
/* 543:561 */               localArrayList.add(apf.c(i2).d(i4));
/* 544:    */             }
/* 545:    */           }
/* 546:    */         }
/* 547:    */       }
/* 548:567 */       if (this.e.b("display", 10))
/* 549:    */       {
/* 550:568 */         localObject1 = this.e.m("display");
/* 551:570 */         if (((fn)localObject1).b("color", 3)) {
/* 552:571 */           if (paramBoolean) {
/* 553:572 */             localArrayList.add("Color: #" + Integer.toHexString(((fn)localObject1).f("color")).toUpperCase());
/* 554:    */           } else {
/* 555:574 */             localArrayList.add(a.u + fi.a("item.dyed"));
/* 556:    */           }
/* 557:    */         }
/* 558:578 */         if (((fn)localObject1).b("Lore") == 9)
/* 559:    */         {
/* 560:579 */           localObject2 = ((fn)localObject1).c("Lore", 8);
/* 561:580 */           if (((fv)localObject2).c() > 0) {
/* 562:581 */             for (i2 = 0; i2 < ((fv)localObject2).c(); i2++) {
/* 563:582 */               localArrayList.add(a.f + "" + a.u + ((fv)localObject2).f(i2));
/* 564:    */             }
/* 565:    */           }
/* 566:    */         }
/* 567:    */       }
/* 568:    */     }
/* 569:589 */     Object localObject1 = B();
/* 570:591 */     if ((!((Multimap)localObject1).isEmpty()) && ((m & 0x2) == 0))
/* 571:    */     {
/* 572:592 */       localArrayList.add("");
/* 573:593 */       for (localObject2 = ((Multimap)localObject1).entries().iterator(); ((Iterator)localObject2).hasNext();)
/* 574:    */       {
/* 575:593 */         Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
/* 576:594 */         localObject3 = (ya)localEntry.getValue();
/* 577:595 */         double d1 = ((ya)localObject3).d();
/* 578:598 */         if (((ya)localObject3).a() == alq.f) {
/* 579:599 */           d1 += aph.a(this, xs.a);
/* 580:    */         }
/* 581:    */         double d2;
/* 582:602 */         if ((((ya)localObject3).c() == 1) || (((ya)localObject3).c() == 2)) {
/* 583:603 */           d2 = d1 * 100.0D;
/* 584:    */         } else {
/* 585:605 */           d2 = d1;
/* 586:    */         }
/* 587:608 */         if (d1 > 0.0D)
/* 588:    */         {
/* 589:609 */           localArrayList.add(a.j + fi.a(new StringBuilder().append("attribute.modifier.plus.").append(((ya)localObject3).c()).toString(), new Object[] { a.format(d2), fi.a("attribute.name." + (String)localEntry.getKey()) }));
/* 590:    */         }
/* 591:610 */         else if (d1 < 0.0D)
/* 592:    */         {
/* 593:611 */           d2 *= -1.0D;
/* 594:612 */           localArrayList.add(a.m + fi.a(new StringBuilder().append("attribute.modifier.take.").append(((ya)localObject3).c()).toString(), new Object[] { a.format(d2), fi.a("attribute.name." + (String)localEntry.getKey()) }));
/* 595:    */         }
/* 596:    */       }
/* 597:    */     }
/* 598:    */     Object localObject3;
/* 599:616 */     if ((n()) && (o().n("Unbreakable")) && ((m & 0x4) == 0)) {
/* 600:617 */       localArrayList.add(a.j + fi.a("item.unbreakable"));
/* 601:    */     }
/* 602:    */     int i3;
/* 603:620 */     if ((n()) && (this.e.b("CanDestroy", 9)) && ((m & 0x8) == 0))
/* 604:    */     {
/* 605:621 */       localObject2 = this.e.c("CanDestroy", 8);
/* 606:622 */       if (((fv)localObject2).c() > 0)
/* 607:    */       {
/* 608:623 */         localArrayList.add("");
/* 609:624 */         localArrayList.add(a.h + fi.a("item.canBreak"));
/* 610:625 */         for (i3 = 0; i3 < ((fv)localObject2).c(); i3++)
/* 611:    */         {
/* 612:626 */           localObject3 = atr.b(((fv)localObject2).f(i3));
/* 613:627 */           if (localObject3 != null) {
/* 614:628 */             localArrayList.add(a.i + ((atr)localObject3).H());
/* 615:    */           } else {
/* 616:630 */             localArrayList.add(a.i + "missingno");
/* 617:    */           }
/* 618:    */         }
/* 619:    */       }
/* 620:    */     }
/* 621:636 */     if ((n()) && (this.e.b("CanPlaceOn", 9)) && ((m & 0x10) == 0))
/* 622:    */     {
/* 623:637 */       localObject2 = this.e.c("CanPlaceOn", 8);
/* 624:638 */       if (((fv)localObject2).c() > 0)
/* 625:    */       {
/* 626:639 */         localArrayList.add("");
/* 627:640 */         localArrayList.add(a.h + fi.a("item.canPlace"));
/* 628:641 */         for (i3 = 0; i3 < ((fv)localObject2).c(); i3++)
/* 629:    */         {
/* 630:642 */           localObject3 = atr.b(((fv)localObject2).f(i3));
/* 631:643 */           if (localObject3 != null) {
/* 632:644 */             localArrayList.add(a.i + ((atr)localObject3).H());
/* 633:    */           } else {
/* 634:646 */             localArrayList.add(a.i + "missingno");
/* 635:    */           }
/* 636:    */         }
/* 637:    */       }
/* 638:    */     }
/* 639:652 */     if (paramBoolean)
/* 640:    */     {
/* 641:653 */       if (g()) {
/* 642:654 */         localArrayList.add("Durability: " + (j() - h()) + " / " + j());
/* 643:    */       }
/* 644:656 */       localArrayList.add(a.i + ((oa)alq.e.c(this.d)).toString());
/* 645:657 */       if (n()) {
/* 646:658 */         localArrayList.add(a.i + "NBT: " + o().c().size() + " tag(s)");
/* 647:    */       }
/* 648:    */     }
/* 649:662 */     return localArrayList;
/* 650:    */   }
/* 651:    */   
/* 652:    */   public boolean t()
/* 653:    */   {
/* 654:666 */     return b().f(this);
/* 655:    */   }
/* 656:    */   
/* 657:    */   public amx u()
/* 658:    */   {
/* 659:670 */     return b().g(this);
/* 660:    */   }
/* 661:    */   
/* 662:    */   public boolean v()
/* 663:    */   {
/* 664:674 */     if (!b().f_(this)) {
/* 665:675 */       return false;
/* 666:    */     }
/* 667:677 */     if (w()) {
/* 668:678 */       return false;
/* 669:    */     }
/* 670:680 */     return true;
/* 671:    */   }
/* 672:    */   
/* 673:    */   public void a(apf paramapf, int paramInt)
/* 674:    */   {
/* 675:684 */     if (this.e == null) {
/* 676:685 */       d(new fn());
/* 677:    */     }
/* 678:687 */     if (!this.e.b("ench", 9)) {
/* 679:688 */       this.e.a("ench", new fv());
/* 680:    */     }
/* 681:690 */     fv localfv = this.e.c("ench", 10);
/* 682:691 */     fn localfn = new fn();
/* 683:692 */     localfn.a("id", (short)paramapf.B);
/* 684:693 */     localfn.a("lvl", (short)(byte)paramInt);
/* 685:694 */     localfv.a(localfn);
/* 686:    */   }
/* 687:    */   
/* 688:    */   public boolean w()
/* 689:    */   {
/* 690:698 */     if ((this.e != null) && (this.e.b("ench", 9))) {
/* 691:699 */       return true;
/* 692:    */     }
/* 693:701 */     return false;
/* 694:    */   }
/* 695:    */   
/* 696:    */   public void a(String paramString, gd paramgd)
/* 697:    */   {
/* 698:705 */     if (this.e == null) {
/* 699:706 */       d(new fn());
/* 700:    */     }
/* 701:708 */     this.e.a(paramString, paramgd);
/* 702:    */   }
/* 703:    */   
/* 704:    */   public boolean x()
/* 705:    */   {
/* 706:712 */     return b().s();
/* 707:    */   }
/* 708:    */   
/* 709:    */   public boolean y()
/* 710:    */   {
/* 711:716 */     return this.g != null;
/* 712:    */   }
/* 713:    */   
/* 714:    */   public void a(adk paramadk)
/* 715:    */   {
/* 716:720 */     this.g = paramadk;
/* 717:    */   }
/* 718:    */   
/* 719:    */   public adk z()
/* 720:    */   {
/* 721:724 */     return this.g;
/* 722:    */   }
/* 723:    */   
/* 724:    */   public int A()
/* 725:    */   {
/* 726:728 */     if ((n()) && (this.e.b("RepairCost", 3))) {
/* 727:729 */       return this.e.f("RepairCost");
/* 728:    */     }
/* 729:731 */     return 0;
/* 730:    */   }
/* 731:    */   
/* 732:    */   public void c(int paramInt)
/* 733:    */   {
/* 734:736 */     if (!n()) {
/* 735:737 */       this.e = new fn();
/* 736:    */     }
/* 737:739 */     this.e.a("RepairCost", paramInt);
/* 738:    */   }
/* 739:    */   
/* 740:    */   public Multimap B()
/* 741:    */   {
/* 742:    */     Object localObject;
/* 743:745 */     if ((n()) && (this.e.b("AttributeModifiers", 9)))
/* 744:    */     {
/* 745:746 */       localObject = HashMultimap.create();
/* 746:747 */       fv localfv = this.e.c("AttributeModifiers", 10);
/* 747:749 */       for (int m = 0; m < localfv.c(); m++)
/* 748:    */       {
/* 749:750 */         fn localfn = localfv.b(m);
/* 750:751 */         ya localya = afs.a(localfn);
/* 751:752 */         if (localya != null) {
/* 752:756 */           if ((localya.a().getLeastSignificantBits() != 0L) && (localya.a().getMostSignificantBits() != 0L)) {
/* 753:757 */             ((Multimap)localObject).put(localfn.j("AttributeName"), localya);
/* 754:    */           }
/* 755:    */         }
/* 756:    */       }
/* 757:    */     }
/* 758:    */     else
/* 759:    */     {
/* 760:761 */       localObject = b().i();
/* 761:    */     }
/* 762:764 */     return localObject;
/* 763:    */   }
/* 764:    */   
/* 765:    */   public void a(alq paramalq)
/* 766:    */   {
/* 767:770 */     this.d = paramalq;
/* 768:    */   }
/* 769:    */   
/* 770:    */   public ho C()
/* 771:    */   {
/* 772:774 */     hy localhy = new hy(q());
/* 773:775 */     if (s()) {
/* 774:776 */       localhy.b().b(Boolean.valueOf(true));
/* 775:    */     }
/* 776:779 */     ho localho = new hy("[").a(localhy).a("]");
/* 777:781 */     if (this.d != null)
/* 778:    */     {
/* 779:782 */       fn localfn = new fn();
/* 780:783 */       b(localfn);
/* 781:    */       
/* 782:785 */       localho.b().a(new hr(hs.c, new hy(localfn.toString())));
/* 783:786 */       localho.b().a(u().e);
/* 784:    */     }
/* 785:789 */     return localho;
/* 786:    */   }
/* 787:    */   
/* 788:793 */   private atr h = null;
/* 789:794 */   private boolean i = false;
/* 790:    */   
/* 791:    */   public boolean c(atr paramatr)
/* 792:    */   {
/* 793:797 */     if (paramatr == this.h) {
/* 794:798 */       return this.i;
/* 795:    */     }
/* 796:801 */     this.h = paramatr;
/* 797:803 */     if ((n()) && (this.e.b("CanDestroy", 9)))
/* 798:    */     {
/* 799:804 */       fv localfv = this.e.c("CanDestroy", 8);
/* 800:805 */       for (int m = 0; m < localfv.c(); m++)
/* 801:    */       {
/* 802:806 */         atr localatr = atr.b(localfv.f(m));
/* 803:807 */         if (localatr == paramatr)
/* 804:    */         {
/* 805:808 */           this.i = true;
/* 806:809 */           return true;
/* 807:    */         }
/* 808:    */       }
/* 809:    */     }
/* 810:813 */     this.i = false;
/* 811:814 */     return false;
/* 812:    */   }
/* 813:    */   
/* 814:818 */   private atr j = null;
/* 815:819 */   private boolean k = false;
/* 816:    */   
/* 817:    */   public boolean d(atr paramatr)
/* 818:    */   {
/* 819:822 */     if (paramatr == this.j) {
/* 820:823 */       return this.k;
/* 821:    */     }
/* 822:826 */     this.j = paramatr;
/* 823:828 */     if ((n()) && (this.e.b("CanPlaceOn", 9)))
/* 824:    */     {
/* 825:829 */       fv localfv = this.e.c("CanPlaceOn", 8);
/* 826:830 */       for (int m = 0; m < localfv.c(); m++)
/* 827:    */       {
/* 828:831 */         atr localatr = atr.b(localfv.f(m));
/* 829:832 */         if (localatr == paramatr)
/* 830:    */         {
/* 831:833 */           this.k = true;
/* 832:834 */           return true;
/* 833:    */         }
/* 834:    */       }
/* 835:    */     }
/* 836:838 */     this.k = false;
/* 837:839 */     return false;
/* 838:    */   }
/* 839:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     amj
 * JD-Core Version:    0.7.0.1
 */