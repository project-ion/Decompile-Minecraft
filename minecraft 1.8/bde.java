/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bde
/*   5:    */   extends bdf
/*   6:    */   implements bdd, pm
/*   7:    */ {
/*   8: 34 */   private amj[] a = new amj[5];
/*   9:    */   private String f;
/*  10: 36 */   private int g = -1;
/*  11:    */   
/*  12:    */   public void a(fn paramfn)
/*  13:    */   {
/*  14: 40 */     super.a(paramfn);
/*  15:    */     
/*  16:    */ 
/*  17: 43 */     fv localfv = paramfn.c("Items", 10);
/*  18: 44 */     this.a = new amj[n_()];
/*  19: 45 */     if (paramfn.b("CustomName", 8)) {
/*  20: 46 */       this.f = paramfn.j("CustomName");
/*  21:    */     }
/*  22: 48 */     this.g = paramfn.f("TransferCooldown");
/*  23: 49 */     for (int i = 0; i < localfv.c(); i++)
/*  24:    */     {
/*  25: 50 */       fn localfn = localfv.b(i);
/*  26: 51 */       int j = localfn.d("Slot");
/*  27: 52 */       if ((j >= 0) && (j < this.a.length)) {
/*  28: 53 */         this.a[j] = amj.a(localfn);
/*  29:    */       }
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void b(fn paramfn)
/*  34:    */   {
/*  35: 60 */     super.b(paramfn);
/*  36: 61 */     fv localfv = new fv();
/*  37: 63 */     for (int i = 0; i < this.a.length; i++) {
/*  38: 64 */       if (this.a[i] != null)
/*  39:    */       {
/*  40: 65 */         fn localfn = new fn();
/*  41: 66 */         localfn.a("Slot", (byte)i);
/*  42: 67 */         this.a[i].b(localfn);
/*  43: 68 */         localfv.a(localfn);
/*  44:    */       }
/*  45:    */     }
/*  46: 71 */     paramfn.a("Items", localfv);
/*  47: 72 */     paramfn.a("TransferCooldown", this.g);
/*  48: 73 */     if (k_()) {
/*  49: 74 */       paramfn.a("CustomName", this.f);
/*  50:    */     }
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void o_()
/*  54:    */   {
/*  55: 80 */     super.o_();
/*  56:    */   }
/*  57:    */   
/*  58:    */   public int n_()
/*  59:    */   {
/*  60: 85 */     return this.a.length;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public amj a(int paramInt)
/*  64:    */   {
/*  65: 91 */     return this.a[paramInt];
/*  66:    */   }
/*  67:    */   
/*  68:    */   public amj a(int paramInt1, int paramInt2)
/*  69:    */   {
/*  70: 97 */     if (this.a[paramInt1] != null)
/*  71:    */     {
/*  72: 98 */       if (this.a[paramInt1].b <= paramInt2)
/*  73:    */       {
/*  74: 99 */         localamj = this.a[paramInt1];
/*  75:100 */         this.a[paramInt1] = null;
/*  76:101 */         return localamj;
/*  77:    */       }
/*  78:103 */       amj localamj = this.a[paramInt1].a(paramInt2);
/*  79:104 */       if (this.a[paramInt1].b == 0) {
/*  80:105 */         this.a[paramInt1] = null;
/*  81:    */       }
/*  82:107 */       return localamj;
/*  83:    */     }
/*  84:110 */     return null;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public amj b(int paramInt)
/*  88:    */   {
/*  89:116 */     if (this.a[paramInt] != null)
/*  90:    */     {
/*  91:117 */       amj localamj = this.a[paramInt];
/*  92:118 */       this.a[paramInt] = null;
/*  93:119 */       return localamj;
/*  94:    */     }
/*  95:121 */     return null;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(int paramInt, amj paramamj)
/*  99:    */   {
/* 100:126 */     this.a[paramInt] = paramamj;
/* 101:127 */     if ((paramamj != null) && (paramamj.b > p_())) {
/* 102:128 */       paramamj.b = p_();
/* 103:    */     }
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String d_()
/* 107:    */   {
/* 108:134 */     return k_() ? this.f : "container.hopper";
/* 109:    */   }
/* 110:    */   
/* 111:    */   public boolean k_()
/* 112:    */   {
/* 113:139 */     return (this.f != null) && (this.f.length() > 0);
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void a(String paramString)
/* 117:    */   {
/* 118:143 */     this.f = paramString;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public int p_()
/* 122:    */   {
/* 123:148 */     return 64;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean a(ahd paramahd)
/* 127:    */   {
/* 128:153 */     if (this.b.s(this.c) != this) {
/* 129:154 */       return false;
/* 130:    */     }
/* 131:156 */     if (paramahd.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 132:157 */       return false;
/* 133:    */     }
/* 134:159 */     return true;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void b(ahd paramahd) {}
/* 138:    */   
/* 139:    */   public void c(ahd paramahd) {}
/* 140:    */   
/* 141:    */   public boolean b(int paramInt, amj paramamj)
/* 142:    */   {
/* 143:172 */     return true;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void c()
/* 147:    */   {
/* 148:177 */     if ((this.b == null) || (this.b.D)) {
/* 149:178 */       return;
/* 150:    */     }
/* 151:181 */     this.g -= 1;
/* 152:183 */     if (!n())
/* 153:    */     {
/* 154:184 */       d(0);
/* 155:185 */       m();
/* 156:    */     }
/* 157:    */   }
/* 158:    */   
/* 159:    */   public boolean m()
/* 160:    */   {
/* 161:190 */     if ((this.b == null) || (this.b.D)) {
/* 162:191 */       return false;
/* 163:    */     }
/* 164:194 */     if ((!n()) && (awx.f(u())))
/* 165:    */     {
/* 166:195 */       boolean bool = false;
/* 167:197 */       if (!p()) {
/* 168:198 */         bool = r();
/* 169:    */       }
/* 170:200 */       if (!q()) {
/* 171:201 */         bool = (a(this)) || (bool);
/* 172:    */       }
/* 173:204 */       if (bool)
/* 174:    */       {
/* 175:205 */         d(8);
/* 176:206 */         o_();
/* 177:207 */         return true;
/* 178:    */       }
/* 179:    */     }
/* 180:211 */     return false;
/* 181:    */   }
/* 182:    */   
/* 183:    */   private boolean p()
/* 184:    */   {
/* 185:215 */     for (amj localamj : this.a) {
/* 186:216 */       if (localamj != null) {
/* 187:217 */         return false;
/* 188:    */       }
/* 189:    */     }
/* 190:221 */     return true;
/* 191:    */   }
/* 192:    */   
/* 193:    */   private boolean q()
/* 194:    */   {
/* 195:225 */     for (amj localamj : this.a) {
/* 196:226 */       if ((localamj == null) || (localamj.b != localamj.c())) {
/* 197:227 */         return false;
/* 198:    */       }
/* 199:    */     }
/* 200:231 */     return true;
/* 201:    */   }
/* 202:    */   
/* 203:    */   private boolean r()
/* 204:    */   {
/* 205:235 */     vq localvq = G();
/* 206:236 */     if (localvq == null) {
/* 207:237 */       return false;
/* 208:    */     }
/* 209:240 */     ej localej = awx.b(u()).d();
/* 210:241 */     if (a(localvq, localej)) {
/* 211:242 */       return false;
/* 212:    */     }
/* 213:245 */     for (int i = 0; i < n_(); i++) {
/* 214:246 */       if (a(i) != null)
/* 215:    */       {
/* 216:250 */         amj localamj1 = a(i).k();
/* 217:251 */         amj localamj2 = a(localvq, a(i, 1), localej);
/* 218:253 */         if ((localamj2 == null) || (localamj2.b == 0))
/* 219:    */         {
/* 220:254 */           localvq.o_();
/* 221:255 */           return true;
/* 222:    */         }
/* 223:257 */         a(i, localamj1);
/* 224:    */       }
/* 225:    */     }
/* 226:261 */     return false;
/* 227:    */   }
/* 228:    */   
/* 229:    */   private boolean a(vq paramvq, ej paramej)
/* 230:    */   {
/* 231:265 */     if ((paramvq instanceof we))
/* 232:    */     {
/* 233:266 */       we localwe = (we)paramvq;
/* 234:267 */       int[] arrayOfInt = localwe.a(paramej);
/* 235:269 */       for (int k = 0; k < arrayOfInt.length; k++)
/* 236:    */       {
/* 237:270 */         amj localamj2 = localwe.a(arrayOfInt[k]);
/* 238:271 */         if ((localamj2 == null) || (localamj2.b != localamj2.c())) {
/* 239:272 */           return false;
/* 240:    */         }
/* 241:    */       }
/* 242:    */     }
/* 243:    */     else
/* 244:    */     {
/* 245:276 */       int i = paramvq.n_();
/* 246:277 */       for (int j = 0; j < i; j++)
/* 247:    */       {
/* 248:278 */         amj localamj1 = paramvq.a(j);
/* 249:279 */         if ((localamj1 == null) || (localamj1.b != localamj1.c())) {
/* 250:280 */           return false;
/* 251:    */         }
/* 252:    */       }
/* 253:    */     }
/* 254:285 */     return true;
/* 255:    */   }
/* 256:    */   
/* 257:    */   private static boolean b(vq paramvq, ej paramej)
/* 258:    */   {
/* 259:289 */     if ((paramvq instanceof we))
/* 260:    */     {
/* 261:290 */       we localwe = (we)paramvq;
/* 262:291 */       int[] arrayOfInt = localwe.a(paramej);
/* 263:293 */       for (int k = 0; k < arrayOfInt.length; k++) {
/* 264:294 */         if (localwe.a(arrayOfInt[k]) != null) {
/* 265:295 */           return false;
/* 266:    */         }
/* 267:    */       }
/* 268:    */     }
/* 269:    */     else
/* 270:    */     {
/* 271:299 */       int i = paramvq.n_();
/* 272:300 */       for (int j = 0; j < i; j++) {
/* 273:301 */         if (paramvq.a(j) != null) {
/* 274:302 */           return false;
/* 275:    */         }
/* 276:    */       }
/* 277:    */     }
/* 278:306 */     return true;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public static boolean a(bdd parambdd)
/* 282:    */   {
/* 283:310 */     vq localvq = b(parambdd);
/* 284:    */     Object localObject;
/* 285:312 */     if (localvq != null)
/* 286:    */     {
/* 287:313 */       localObject = ej.a;
/* 288:314 */       if (b(localvq, (ej)localObject)) {
/* 289:315 */         return false;
/* 290:    */       }
/* 291:318 */       if ((localvq instanceof we))
/* 292:    */       {
/* 293:319 */         we localwe = (we)localvq;
/* 294:320 */         int[] arrayOfInt = localwe.a((ej)localObject);
/* 295:322 */         for (int k = 0; k < arrayOfInt.length; k++) {
/* 296:323 */           if (a(parambdd, localvq, arrayOfInt[k], (ej)localObject)) {
/* 297:324 */             return true;
/* 298:    */           }
/* 299:    */         }
/* 300:    */       }
/* 301:    */       else
/* 302:    */       {
/* 303:328 */         int i = localvq.n_();
/* 304:329 */         for (int j = 0; j < i; j++) {
/* 305:330 */           if (a(parambdd, localvq, j, (ej)localObject)) {
/* 306:331 */             return true;
/* 307:    */           }
/* 308:    */         }
/* 309:    */       }
/* 310:    */     }
/* 311:    */     else
/* 312:    */     {
/* 313:336 */       localObject = a(parambdd.z(), parambdd.A(), parambdd.B() + 1.0D, parambdd.C());
/* 314:338 */       if (localObject != null) {
/* 315:339 */         return a(parambdd, (adw)localObject);
/* 316:    */       }
/* 317:    */     }
/* 318:343 */     return false;
/* 319:    */   }
/* 320:    */   
/* 321:    */   private static boolean a(bdd parambdd, vq paramvq, int paramInt, ej paramej)
/* 322:    */   {
/* 323:347 */     amj localamj1 = paramvq.a(paramInt);
/* 324:349 */     if ((localamj1 != null) && (b(paramvq, localamj1, paramInt, paramej)))
/* 325:    */     {
/* 326:350 */       amj localamj2 = localamj1.k();
/* 327:351 */       amj localamj3 = a(parambdd, paramvq.a(paramInt, 1), null);
/* 328:353 */       if ((localamj3 == null) || (localamj3.b == 0))
/* 329:    */       {
/* 330:354 */         paramvq.o_();
/* 331:355 */         return true;
/* 332:    */       }
/* 333:357 */       paramvq.a(paramInt, localamj2);
/* 334:    */     }
/* 335:361 */     return false;
/* 336:    */   }
/* 337:    */   
/* 338:    */   public static boolean a(vq paramvq, adw paramadw)
/* 339:    */   {
/* 340:365 */     boolean bool = false;
/* 341:366 */     if (paramadw == null) {
/* 342:367 */       return false;
/* 343:    */     }
/* 344:370 */     amj localamj1 = paramadw.l().k();
/* 345:371 */     amj localamj2 = a(paramvq, localamj1, null);
/* 346:373 */     if ((localamj2 == null) || (localamj2.b == 0))
/* 347:    */     {
/* 348:374 */       bool = true;
/* 349:    */       
/* 350:376 */       paramadw.J();
/* 351:    */     }
/* 352:    */     else
/* 353:    */     {
/* 354:378 */       paramadw.a(localamj2);
/* 355:    */     }
/* 356:381 */     return bool;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public static amj a(vq paramvq, amj paramamj, ej paramej)
/* 360:    */   {
/* 361:385 */     if (((paramvq instanceof we)) && (paramej != null))
/* 362:    */     {
/* 363:386 */       we localwe = (we)paramvq;
/* 364:387 */       int[] arrayOfInt = localwe.a(paramej);
/* 365:389 */       for (int k = 0; (k < arrayOfInt.length) && (paramamj != null) && (paramamj.b > 0); k++) {
/* 366:390 */         paramamj = c(paramvq, paramamj, arrayOfInt[k], paramej);
/* 367:    */       }
/* 368:    */     }
/* 369:    */     else
/* 370:    */     {
/* 371:393 */       int i = paramvq.n_();
/* 372:394 */       for (int j = 0; (j < i) && (paramamj != null) && (paramamj.b > 0); j++) {
/* 373:395 */         paramamj = c(paramvq, paramamj, j, paramej);
/* 374:    */       }
/* 375:    */     }
/* 376:399 */     if ((paramamj != null) && (paramamj.b == 0)) {
/* 377:400 */       paramamj = null;
/* 378:    */     }
/* 379:403 */     return paramamj;
/* 380:    */   }
/* 381:    */   
/* 382:    */   private static boolean a(vq paramvq, amj paramamj, int paramInt, ej paramej)
/* 383:    */   {
/* 384:407 */     if (!paramvq.b(paramInt, paramamj)) {
/* 385:408 */       return false;
/* 386:    */     }
/* 387:410 */     if (((paramvq instanceof we)) && (!((we)paramvq).a(paramInt, paramamj, paramej))) {
/* 388:411 */       return false;
/* 389:    */     }
/* 390:413 */     return true;
/* 391:    */   }
/* 392:    */   
/* 393:    */   private static boolean b(vq paramvq, amj paramamj, int paramInt, ej paramej)
/* 394:    */   {
/* 395:417 */     if (((paramvq instanceof we)) && (!((we)paramvq).b(paramInt, paramamj, paramej))) {
/* 396:418 */       return false;
/* 397:    */     }
/* 398:420 */     return true;
/* 399:    */   }
/* 400:    */   
/* 401:    */   private static amj c(vq paramvq, amj paramamj, int paramInt, ej paramej)
/* 402:    */   {
/* 403:424 */     amj localamj = paramvq.a(paramInt);
/* 404:426 */     if (a(paramvq, paramamj, paramInt, paramej))
/* 405:    */     {
/* 406:427 */       int i = 0;
/* 407:428 */       if (localamj == null)
/* 408:    */       {
/* 409:429 */         paramvq.a(paramInt, paramamj);
/* 410:430 */         paramamj = null;
/* 411:431 */         i = 1;
/* 412:    */       }
/* 413:432 */       else if (a(localamj, paramamj))
/* 414:    */       {
/* 415:433 */         int j = paramamj.c() - localamj.b;
/* 416:434 */         int k = Math.min(paramamj.b, j);
/* 417:    */         
/* 418:436 */         paramamj.b -= k;
/* 419:437 */         localamj.b += k;
/* 420:438 */         i = k > 0 ? 1 : 0;
/* 421:    */       }
/* 422:440 */       if (i != 0)
/* 423:    */       {
/* 424:441 */         if ((paramvq instanceof bde))
/* 425:    */         {
/* 426:442 */           bde localbde = (bde)paramvq;
/* 427:443 */           if (localbde.o()) {
/* 428:444 */             localbde.d(8);
/* 429:    */           }
/* 430:446 */           paramvq.o_();
/* 431:    */         }
/* 432:448 */         paramvq.o_();
/* 433:    */       }
/* 434:    */     }
/* 435:451 */     return paramamj;
/* 436:    */   }
/* 437:    */   
/* 438:    */   private vq G()
/* 439:    */   {
/* 440:455 */     ej localej = awx.b(u());
/* 441:456 */     return b(z(), this.c.n() + localej.g(), this.c.o() + localej.h(), this.c.p() + localej.i());
/* 442:    */   }
/* 443:    */   
/* 444:    */   public static vq b(bdd parambdd)
/* 445:    */   {
/* 446:460 */     return b(parambdd.z(), parambdd.A(), parambdd.B() + 1.0D, parambdd.C());
/* 447:    */   }
/* 448:    */   
/* 449:    */   public static adw a(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 450:    */   {
/* 451:464 */     List localList = paramaqu.a(adw.class, new brt(paramDouble1, paramDouble2, paramDouble3, paramDouble1 + 1.0D, paramDouble2 + 1.0D, paramDouble3 + 1.0D), xe.a);
/* 452:466 */     if (localList.size() > 0) {
/* 453:467 */       return (adw)localList.get(0);
/* 454:    */     }
/* 455:469 */     return null;
/* 456:    */   }
/* 457:    */   
/* 458:    */   public static vq b(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 459:    */   {
/* 460:474 */     Object localObject1 = null;
/* 461:475 */     int i = uv.c(paramDouble1);
/* 462:476 */     int j = uv.c(paramDouble2);
/* 463:477 */     int k = uv.c(paramDouble3);
/* 464:478 */     dt localdt = new dt(i, j, k);
/* 465:    */     
/* 466:480 */     bcm localbcm = paramaqu.s(new dt(i, j, k));
/* 467:    */     Object localObject2;
/* 468:482 */     if ((localbcm instanceof vq))
/* 469:    */     {
/* 470:483 */       localObject1 = (vq)localbcm;
/* 471:485 */       if ((localObject1 instanceof bcr))
/* 472:    */       {
/* 473:486 */         localObject2 = paramaqu.p(new dt(i, j, k)).c();
/* 474:488 */         if ((localObject2 instanceof auj)) {
/* 475:489 */           localObject1 = ((auj)localObject2).d(paramaqu, localdt);
/* 476:    */         }
/* 477:    */       }
/* 478:    */     }
/* 479:494 */     if (localObject1 == null)
/* 480:    */     {
/* 481:495 */       localObject2 = paramaqu.a(null, new brt(paramDouble1, paramDouble2, paramDouble3, paramDouble1 + 1.0D, paramDouble2 + 1.0D, paramDouble3 + 1.0D), xe.c);
/* 482:497 */       if (((List)localObject2).size() > 0) {
/* 483:498 */         localObject1 = (vq)((List)localObject2).get(paramaqu.s.nextInt(((List)localObject2).size()));
/* 484:    */       }
/* 485:    */     }
/* 486:502 */     return localObject1;
/* 487:    */   }
/* 488:    */   
/* 489:    */   private static boolean a(amj paramamj1, amj paramamj2)
/* 490:    */   {
/* 491:506 */     if (paramamj1.b() != paramamj2.b()) {
/* 492:507 */       return false;
/* 493:    */     }
/* 494:509 */     if (paramamj1.i() != paramamj2.i()) {
/* 495:510 */       return false;
/* 496:    */     }
/* 497:512 */     if (paramamj1.b > paramamj1.c()) {
/* 498:513 */       return false;
/* 499:    */     }
/* 500:515 */     if (!amj.a(paramamj1, paramamj2)) {
/* 501:516 */       return false;
/* 502:    */     }
/* 503:518 */     return true;
/* 504:    */   }
/* 505:    */   
/* 506:    */   public double A()
/* 507:    */   {
/* 508:523 */     return this.c.n();
/* 509:    */   }
/* 510:    */   
/* 511:    */   public double B()
/* 512:    */   {
/* 513:528 */     return this.c.o();
/* 514:    */   }
/* 515:    */   
/* 516:    */   public double C()
/* 517:    */   {
/* 518:533 */     return this.c.p();
/* 519:    */   }
/* 520:    */   
/* 521:    */   public void d(int paramInt)
/* 522:    */   {
/* 523:537 */     this.g = paramInt;
/* 524:    */   }
/* 525:    */   
/* 526:    */   public boolean n()
/* 527:    */   {
/* 528:541 */     return this.g > 0;
/* 529:    */   }
/* 530:    */   
/* 531:    */   public boolean o()
/* 532:    */   {
/* 533:545 */     return this.g <= 1;
/* 534:    */   }
/* 535:    */   
/* 536:    */   public String k()
/* 537:    */   {
/* 538:550 */     return "minecraft:hopper";
/* 539:    */   }
/* 540:    */   
/* 541:    */   public aib a(ahb paramahb, ahd paramahd)
/* 542:    */   {
/* 543:555 */     return new aix(paramahb, this, paramahd);
/* 544:    */   }
/* 545:    */   
/* 546:    */   public int a_(int paramInt)
/* 547:    */   {
/* 548:560 */     return 0;
/* 549:    */   }
/* 550:    */   
/* 551:    */   public void b(int paramInt1, int paramInt2) {}
/* 552:    */   
/* 553:    */   public int g()
/* 554:    */   {
/* 555:569 */     return 0;
/* 556:    */   }
/* 557:    */   
/* 558:    */   public void l()
/* 559:    */   {
/* 560:574 */     for (int i = 0; i < this.a.length; i++) {
/* 561:575 */       this.a[i] = null;
/* 562:    */     }
/* 563:    */   }
/* 564:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bde
 * JD-Core Version:    0.7.0.1
 */