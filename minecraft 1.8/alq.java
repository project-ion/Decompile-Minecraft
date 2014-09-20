/*   1:    */ import com.google.common.collect.HashMultimap;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Multimap;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   6:    */ import java.util.Random;
/*   7:    */ import java.util.UUID;
/*   8:    */ 
/*   9:    */ public class alq
/*  10:    */ {
/*  11: 38 */   public static final ev e = new ev();
/*  12: 39 */   private static final Map a = Maps.newHashMap();
/*  13: 41 */   protected static final UUID f = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
/*  14:    */   private akf b;
/*  15:    */   
/*  16:    */   public static int b(alq paramalq)
/*  17:    */   {
/*  18: 52 */     return paramalq == null ? 0 : e.b(paramalq);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public static alq b(int paramInt)
/*  22:    */   {
/*  23: 56 */     return (alq)e.a(paramInt);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public static alq a(atr paramatr)
/*  27:    */   {
/*  28: 60 */     return (alq)a.get(paramatr);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public static alq d(String paramString)
/*  32:    */   {
/*  33: 64 */     alq localalq = (alq)e.a(new oa(paramString));
/*  34: 65 */     if (localalq == null) {
/*  35:    */       try
/*  36:    */       {
/*  37: 67 */         return b(Integer.parseInt(paramString));
/*  38:    */       }
/*  39:    */       catch (NumberFormatException localNumberFormatException) {}
/*  40:    */     }
/*  41: 71 */     return localalq;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean a(fn paramfn)
/*  45:    */   {
/*  46: 75 */     return false;
/*  47:    */   }
/*  48:    */   
/*  49:135 */   protected static Random g = new Random();
/*  50:138 */   protected int h = 64;
/*  51:    */   private int c;
/*  52:    */   protected boolean i;
/*  53:    */   protected boolean j;
/*  54:    */   private alq d;
/*  55:    */   private String k;
/*  56:    */   private String l;
/*  57:    */   
/*  58:    */   public alq c(int paramInt)
/*  59:    */   {
/*  60:150 */     this.h = paramInt;
/*  61:151 */     return this;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  65:    */   {
/*  66:155 */     return false;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public float a(amj paramamj, atr paramatr)
/*  70:    */   {
/*  71:159 */     return 1.0F;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/*  75:    */   {
/*  76:163 */     return paramamj;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public amj b(amj paramamj, aqu paramaqu, ahd paramahd)
/*  80:    */   {
/*  81:167 */     return paramamj;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public int j()
/*  85:    */   {
/*  86:171 */     return this.h;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public int a(int paramInt)
/*  90:    */   {
/*  91:175 */     return 0;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public boolean k()
/*  95:    */   {
/*  96:179 */     return this.j;
/*  97:    */   }
/*  98:    */   
/*  99:    */   protected alq a(boolean paramBoolean)
/* 100:    */   {
/* 101:183 */     this.j = paramBoolean;
/* 102:184 */     return this;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public int l()
/* 106:    */   {
/* 107:188 */     return this.c;
/* 108:    */   }
/* 109:    */   
/* 110:    */   protected alq d(int paramInt)
/* 111:    */   {
/* 112:192 */     this.c = paramInt;
/* 113:193 */     return this;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public boolean m()
/* 117:    */   {
/* 118:197 */     return (this.c > 0) && (!this.j);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public boolean a(amj paramamj, xm paramxm1, xm paramxm2)
/* 122:    */   {
/* 123:204 */     return false;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean a(amj paramamj, aqu paramaqu, atr paramatr, dt paramdt, xm paramxm)
/* 127:    */   {
/* 128:211 */     return false;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public boolean b(atr paramatr)
/* 132:    */   {
/* 133:215 */     return false;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public boolean a(amj paramamj, ahd paramahd, xm paramxm)
/* 137:    */   {
/* 138:219 */     return false;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public alq n()
/* 142:    */   {
/* 143:223 */     this.i = true;
/* 144:224 */     return this;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public boolean v_()
/* 148:    */   {
/* 149:228 */     return this.i;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public boolean e()
/* 153:    */   {
/* 154:232 */     return false;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public alq c(String paramString)
/* 158:    */   {
/* 159:237 */     this.l = paramString;
/* 160:238 */     return this;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String k(amj paramamj)
/* 164:    */   {
/* 165:246 */     String str = e_(paramamj);
/* 166:247 */     if (str == null) {
/* 167:248 */       return "";
/* 168:    */     }
/* 169:250 */     return fi.a(str);
/* 170:    */   }
/* 171:    */   
/* 172:    */   public String a()
/* 173:    */   {
/* 174:255 */     return "item." + this.l;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String e_(amj paramamj)
/* 178:    */   {
/* 179:259 */     return "item." + this.l;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public alq c(alq paramalq)
/* 183:    */   {
/* 184:263 */     this.d = paramalq;
/* 185:264 */     return this;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public boolean p()
/* 189:    */   {
/* 190:268 */     return true;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public alq q()
/* 194:    */   {
/* 195:272 */     return this.d;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public boolean r()
/* 199:    */   {
/* 200:276 */     return this.d != null;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public int a(amj paramamj, int paramInt)
/* 204:    */   {
/* 205:280 */     return 16777215;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public void a(amj paramamj, aqu paramaqu, wv paramwv, int paramInt, boolean paramBoolean) {}
/* 209:    */   
/* 210:    */   public void d(amj paramamj, aqu paramaqu, ahd paramahd) {}
/* 211:    */   
/* 212:    */   public boolean f()
/* 213:    */   {
/* 214:290 */     return false;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public ano e(amj paramamj)
/* 218:    */   {
/* 219:294 */     return ano.a;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public int d(amj paramamj)
/* 223:    */   {
/* 224:298 */     return 0;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void a(amj paramamj, aqu paramaqu, ahd paramahd, int paramInt) {}
/* 228:    */   
/* 229:    */   protected alq e(String paramString)
/* 230:    */   {
/* 231:305 */     this.k = paramString;
/* 232:306 */     return this;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public String j(amj paramamj)
/* 236:    */   {
/* 237:310 */     return this.k;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public boolean l(amj paramamj)
/* 241:    */   {
/* 242:314 */     return j(paramamj) != null;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void a(amj paramamj, ahd paramahd, List paramList, boolean paramBoolean) {}
/* 246:    */   
/* 247:    */   public String a(amj paramamj)
/* 248:    */   {
/* 249:321 */     return ("" + fi.a(new StringBuilder().append(k(paramamj)).append(".name").toString())).trim();
/* 250:    */   }
/* 251:    */   
/* 252:    */   public boolean f(amj paramamj)
/* 253:    */   {
/* 254:325 */     if (paramamj.w()) {
/* 255:326 */       return true;
/* 256:    */     }
/* 257:328 */     return false;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public amx g(amj paramamj)
/* 261:    */   {
/* 262:332 */     if (paramamj.w()) {
/* 263:333 */       return amx.c;
/* 264:    */     }
/* 265:335 */     return amx.a;
/* 266:    */   }
/* 267:    */   
/* 268:    */   public boolean f_(amj paramamj)
/* 269:    */   {
/* 270:339 */     return (j() == 1) && (m());
/* 271:    */   }
/* 272:    */   
/* 273:    */   protected bru a(aqu paramaqu, ahd paramahd, boolean paramBoolean)
/* 274:    */   {
/* 275:343 */     float f1 = paramahd.B + (paramahd.z - paramahd.B);
/* 276:344 */     float f2 = paramahd.A + (paramahd.y - paramahd.A);
/* 277:    */     
/* 278:346 */     double d1 = paramahd.p + (paramahd.s - paramahd.p);
/* 279:347 */     double d2 = paramahd.q + (paramahd.t - paramahd.q) + paramahd.aR();
/* 280:348 */     double d3 = paramahd.r + (paramahd.u - paramahd.r);
/* 281:    */     
/* 282:350 */     brw localbrw1 = new brw(d1, d2, d3);
/* 283:    */     
/* 284:352 */     float f3 = uv.b(-f2 * 0.01745329F - 3.141593F);
/* 285:353 */     float f4 = uv.a(-f2 * 0.01745329F - 3.141593F);
/* 286:354 */     float f5 = -uv.b(-f1 * 0.01745329F);
/* 287:355 */     float f6 = uv.a(-f1 * 0.01745329F);
/* 288:    */     
/* 289:357 */     float f7 = f4 * f5;
/* 290:358 */     float f8 = f6;
/* 291:359 */     float f9 = f3 * f5;
/* 292:    */     
/* 293:361 */     double d4 = 5.0D;
/* 294:362 */     brw localbrw2 = localbrw1.b(f7 * d4, f8 * d4, f9 * d4);
/* 295:    */     
/* 296:364 */     return paramaqu.a(localbrw1, localbrw2, paramBoolean, !paramBoolean, false);
/* 297:    */   }
/* 298:    */   
/* 299:    */   public int b()
/* 300:    */   {
/* 301:368 */     return 0;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void a(alq paramalq, akf paramakf, List paramList)
/* 305:    */   {
/* 306:372 */     paramList.add(new amj(paramalq, 1, 0));
/* 307:    */   }
/* 308:    */   
/* 309:    */   public akf c()
/* 310:    */   {
/* 311:376 */     return this.b;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public alq a(akf paramakf)
/* 315:    */   {
/* 316:380 */     this.b = paramakf;
/* 317:381 */     return this;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public boolean s()
/* 321:    */   {
/* 322:385 */     return false;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public boolean a(amj paramamj1, amj paramamj2)
/* 326:    */   {
/* 327:389 */     return false;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public Multimap i()
/* 331:    */   {
/* 332:393 */     return HashMultimap.create();
/* 333:    */   }
/* 334:    */   
/* 335:    */   public static void t()
/* 336:    */   {
/* 337:399 */     a(aty.b, new amr(aty.b, aty.b, new alr()).b("stone"));
/* 338:    */     
/* 339:    */ 
/* 340:    */ 
/* 341:    */ 
/* 342:    */ 
/* 343:    */ 
/* 344:406 */     a(aty.c, new ann(aty.c, false));
/* 345:407 */     a(aty.d, new amr(aty.d, aty.d, new ama()).b("dirt"));
/* 346:    */     
/* 347:    */ 
/* 348:    */ 
/* 349:    */ 
/* 350:    */ 
/* 351:    */ 
/* 352:414 */     c(aty.e);
/* 353:415 */     a(aty.f, new amr(aty.f, aty.f, new amb()).b("wood"));
/* 354:    */     
/* 355:    */ 
/* 356:    */ 
/* 357:    */ 
/* 358:    */ 
/* 359:    */ 
/* 360:422 */     a(aty.g, new amr(aty.g, aty.g, new amc()).b("sapling"));
/* 361:    */     
/* 362:    */ 
/* 363:    */ 
/* 364:    */ 
/* 365:    */ 
/* 366:    */ 
/* 367:429 */     c(aty.h);
/* 368:430 */     a(aty.m, new amr(aty.m, aty.m, new amd()).b("sand"));
/* 369:    */     
/* 370:    */ 
/* 371:    */ 
/* 372:    */ 
/* 373:    */ 
/* 374:    */ 
/* 375:437 */     c(aty.n);
/* 376:438 */     c(aty.o);
/* 377:439 */     c(aty.p);
/* 378:440 */     c(aty.q);
/* 379:441 */     a(aty.r, new amr(aty.r, aty.r, new ame()).b("log"));
/* 380:    */     
/* 381:    */ 
/* 382:    */ 
/* 383:    */ 
/* 384:    */ 
/* 385:    */ 
/* 386:448 */     a(aty.s, new amr(aty.s, aty.s, new amf()).b("log"));
/* 387:    */     
/* 388:    */ 
/* 389:    */ 
/* 390:    */ 
/* 391:    */ 
/* 392:    */ 
/* 393:455 */     a(aty.t, new amm(aty.t).b("leaves"));
/* 394:456 */     a(aty.u, new amm(aty.u).b("leaves"));
/* 395:457 */     a(aty.v, new amr(aty.v, aty.v, new amg()).b("sponge"));
/* 396:    */     
/* 397:    */ 
/* 398:    */ 
/* 399:    */ 
/* 400:    */ 
/* 401:    */ 
/* 402:464 */     c(aty.w);
/* 403:465 */     c(aty.x);
/* 404:466 */     c(aty.y);
/* 405:467 */     c(aty.z);
/* 406:468 */     a(aty.A, new amr(aty.A, aty.A, new amh()).b("sandStone"));
/* 407:    */     
/* 408:    */ 
/* 409:    */ 
/* 410:    */ 
/* 411:    */ 
/* 412:    */ 
/* 413:475 */     c(aty.B);
/* 414:476 */     c(aty.D);
/* 415:477 */     c(aty.E);
/* 416:478 */     a(aty.F, new amv(aty.F));
/* 417:479 */     c(aty.G);
/* 418:480 */     a(aty.H, new ann(aty.H, true).a(new String[] { "shrub", "grass", "fern" }));
/* 419:481 */     c(aty.I);
/* 420:482 */     a(aty.J, new amv(aty.J));
/* 421:483 */     a(aty.L, new akx(aty.L).b("cloth"));
/* 422:484 */     a(aty.N, new amr(aty.N, aty.N, new als()).b("flower"));
/* 423:    */     
/* 424:    */ 
/* 425:    */ 
/* 426:    */ 
/* 427:    */ 
/* 428:    */ 
/* 429:491 */     a(aty.O, new amr(aty.O, aty.O, new alt()).b("rose"));
/* 430:    */     
/* 431:    */ 
/* 432:    */ 
/* 433:    */ 
/* 434:    */ 
/* 435:    */ 
/* 436:498 */     c(aty.P);
/* 437:499 */     c(aty.Q);
/* 438:500 */     c(aty.R);
/* 439:501 */     c(aty.S);
/* 440:502 */     a(aty.U, new ani(aty.U, aty.U, aty.T).b("stoneSlab"));
/* 441:503 */     c(aty.V);
/* 442:504 */     c(aty.W);
/* 443:505 */     c(aty.X);
/* 444:506 */     c(aty.Y);
/* 445:507 */     c(aty.Z);
/* 446:508 */     c(aty.aa);
/* 447:509 */     c(aty.ac);
/* 448:510 */     c(aty.ad);
/* 449:511 */     c(aty.ae);
/* 450:512 */     c(aty.ag);
/* 451:513 */     c(aty.ah);
/* 452:514 */     c(aty.ai);
/* 453:515 */     c(aty.ak);
/* 454:516 */     c(aty.al);
/* 455:517 */     c(aty.am);
/* 456:518 */     c(aty.au);
/* 457:519 */     c(aty.av);
/* 458:520 */     c(aty.aw);
/* 459:521 */     c(aty.ay);
/* 460:522 */     c(aty.az);
/* 461:523 */     c(aty.aB);
/* 462:524 */     c(aty.aC);
/* 463:525 */     c(aty.aF);
/* 464:526 */     c(aty.aG);
/* 465:527 */     a(aty.aH, new anj(aty.aH));
/* 466:528 */     c(aty.aI);
/* 467:529 */     c(aty.aJ);
/* 468:530 */     c(aty.aK);
/* 469:531 */     c(aty.aL);
/* 470:532 */     c(aty.aN);
/* 471:533 */     c(aty.aO);
/* 472:534 */     c(aty.aP);
/* 473:535 */     c(aty.aQ);
/* 474:536 */     c(aty.aR);
/* 475:537 */     c(aty.aS);
/* 476:538 */     c(aty.aT);
/* 477:539 */     c(aty.aU);
/* 478:540 */     c(aty.aV);
/* 479:541 */     c(aty.aW);
/* 480:542 */     c(aty.aX);
/* 481:543 */     c(aty.aZ);
/* 482:544 */     c(aty.bd);
/* 483:545 */     a(aty.be, new amr(aty.be, aty.be, new alu()).b("monsterStoneEgg"));
/* 484:    */     
/* 485:    */ 
/* 486:    */ 
/* 487:    */ 
/* 488:    */ 
/* 489:    */ 
/* 490:552 */     a(aty.bf, new amr(aty.bf, aty.bf, new alv()).b("stonebricksmooth"));
/* 491:    */     
/* 492:    */ 
/* 493:    */ 
/* 494:    */ 
/* 495:    */ 
/* 496:    */ 
/* 497:559 */     c(aty.bg);
/* 498:560 */     c(aty.bh);
/* 499:561 */     c(aty.bi);
/* 500:562 */     c(aty.bj);
/* 501:563 */     c(aty.bk);
/* 502:564 */     a(aty.bn, new ann(aty.bn, false));
/* 503:565 */     c(aty.bo);
/* 504:566 */     c(aty.bp);
/* 505:567 */     c(aty.bq);
/* 506:568 */     c(aty.br);
/* 507:569 */     c(aty.bs);
/* 508:570 */     c(aty.bt);
/* 509:571 */     c(aty.bu);
/* 510:572 */     c(aty.bv);
/* 511:573 */     c(aty.bw);
/* 512:574 */     a(aty.bx, new anp(aty.bx));
/* 513:575 */     c(aty.by);
/* 514:576 */     c(aty.bz);
/* 515:577 */     c(aty.bA);
/* 516:578 */     c(aty.bC);
/* 517:579 */     c(aty.bG);
/* 518:580 */     c(aty.bH);
/* 519:581 */     c(aty.bI);
/* 520:582 */     c(aty.bJ);
/* 521:583 */     a(aty.bM, new ani(aty.bM, aty.bM, aty.bL).b("woodSlab"));
/* 522:584 */     c(aty.bO);
/* 523:585 */     c(aty.bP);
/* 524:586 */     c(aty.bQ);
/* 525:587 */     c(aty.bR);
/* 526:588 */     c(aty.bT);
/* 527:589 */     c(aty.bU);
/* 528:590 */     c(aty.bV);
/* 529:591 */     c(aty.bW);
/* 530:592 */     c(aty.bX);
/* 531:593 */     c(aty.bY);
/* 532:594 */     a(aty.bZ, new amr(aty.bZ, aty.bZ, new alw()).b("cobbleWall"));
/* 533:    */     
/* 534:    */ 
/* 535:    */ 
/* 536:    */ 
/* 537:    */ 
/* 538:    */ 
/* 539:601 */     c(aty.cd);
/* 540:602 */     a(aty.cf, new ajm(aty.cf).b("anvil"));
/* 541:603 */     c(aty.cg);
/* 542:604 */     c(aty.ch);
/* 543:605 */     c(aty.ci);
/* 544:606 */     c(aty.cl);
/* 545:607 */     c(aty.cn);
/* 546:608 */     c(aty.co);
/* 547:609 */     c(aty.cp);
/* 548:610 */     a(aty.cq, new amr(aty.cq, aty.cq, new String[] { "default", "chiseled", "lines" }).b("quartzBlock"));
/* 549:611 */     c(aty.cr);
/* 550:612 */     c(aty.cs);
/* 551:613 */     c(aty.ct);
/* 552:614 */     a(aty.cu, new akx(aty.cu).b("clayHardenedStained"));
/* 553:615 */     c(aty.cv);
/* 554:616 */     c(aty.cw);
/* 555:617 */     c(aty.cx);
/* 556:618 */     a(aty.cy, new akx(aty.cy).b("woolCarpet"));
/* 557:619 */     c(aty.cz);
/* 558:620 */     c(aty.cA);
/* 559:621 */     c(aty.cB);
/* 560:622 */     c(aty.cC);
/* 561:623 */     c(aty.cD);
/* 562:624 */     c(aty.cE);
/* 563:625 */     a(aty.cF, new aku(aty.cF, aty.cF, new alx()).b("doublePlant"));
/* 564:    */     
/* 565:    */ 
/* 566:    */ 
/* 567:    */ 
/* 568:    */ 
/* 569:    */ 
/* 570:632 */     a(aty.cG, new akx(aty.cG).b("stainedGlass"));
/* 571:633 */     a(aty.cH, new akx(aty.cH).b("stainedGlassPane"));
/* 572:634 */     a(aty.cI, new amr(aty.cI, aty.cI, new aly()).b("prismarine"));
/* 573:    */     
/* 574:    */ 
/* 575:    */ 
/* 576:    */ 
/* 577:    */ 
/* 578:    */ 
/* 579:641 */     c(aty.cJ);
/* 580:642 */     a(aty.cM, new amr(aty.cM, aty.cM, new alz()).b("redSandStone"));
/* 581:    */     
/* 582:    */ 
/* 583:    */ 
/* 584:    */ 
/* 585:    */ 
/* 586:    */ 
/* 587:649 */     c(aty.cN);
/* 588:650 */     a(aty.cP, new ani(aty.cP, aty.cP, aty.cO).b("stoneSlab2"));
/* 589:    */     
/* 590:    */ 
/* 591:653 */     a(256, "iron_shovel", new ane(ami.c).c("shovelIron"));
/* 592:654 */     a(257, "iron_pickaxe", new amu(ami.c).c("pickaxeIron"));
/* 593:655 */     a(258, "iron_axe", new ajr(ami.c).c("hatchetIron"));
/* 594:656 */     a(259, "flint_and_steel", new alk().c("flintAndSteel"));
/* 595:657 */     a(260, "apple", new all(4, 0.3F, false).c("apple"));
/* 596:658 */     a(261, "bow", new ajz().c("bow"));
/* 597:659 */     a(262, "arrow", new alq().c("arrow").a(akf.j));
/* 598:660 */     a(263, "coal", new akd().c("coal"));
/* 599:661 */     a(264, "diamond", new alq().c("diamond").a(akf.l));
/* 600:662 */     a(265, "iron_ingot", new alq().c("ingotIron").a(akf.l));
/* 601:663 */     a(266, "gold_ingot", new alq().c("ingotGold").a(akf.l));
/* 602:664 */     a(267, "iron_sword", new anm(ami.c).c("swordIron"));
/* 603:665 */     a(268, "wooden_sword", new anm(ami.a).c("swordWood"));
/* 604:666 */     a(269, "wooden_shovel", new ane(ami.a).c("shovelWood"));
/* 605:667 */     a(270, "wooden_pickaxe", new amu(ami.a).c("pickaxeWood"));
/* 606:668 */     a(271, "wooden_axe", new ajr(ami.a).c("hatchetWood"));
/* 607:669 */     a(272, "stone_sword", new anm(ami.b).c("swordStone"));
/* 608:670 */     a(273, "stone_shovel", new ane(ami.b).c("shovelStone"));
/* 609:671 */     a(274, "stone_pickaxe", new amu(ami.b).c("pickaxeStone"));
/* 610:672 */     a(275, "stone_axe", new ajr(ami.b).c("hatchetStone"));
/* 611:673 */     a(276, "diamond_sword", new anm(ami.d).c("swordDiamond"));
/* 612:674 */     a(277, "diamond_shovel", new ane(ami.d).c("shovelDiamond"));
/* 613:675 */     a(278, "diamond_pickaxe", new amu(ami.d).c("pickaxeDiamond"));
/* 614:676 */     a(279, "diamond_axe", new ajr(ami.d).c("hatchetDiamond"));
/* 615:677 */     a(280, "stick", new alq().n().c("stick").a(akf.l));
/* 616:678 */     a(281, "bowl", new alq().c("bowl").a(akf.l));
/* 617:679 */     a(282, "mushroom_stew", new aka(6).c("mushroomStew"));
/* 618:680 */     a(283, "golden_sword", new anm(ami.e).c("swordGold"));
/* 619:681 */     a(284, "golden_shovel", new ane(ami.e).c("shovelGold"));
/* 620:682 */     a(285, "golden_pickaxe", new amu(ami.e).c("pickaxeGold"));
/* 621:683 */     a(286, "golden_axe", new ajr(ami.e).c("hatchetGold"));
/* 622:684 */     a(287, "string", new ajv(aty.bS).c("string").a(akf.l));
/* 623:685 */     a(288, "feather", new alq().c("feather").a(akf.l));
/* 624:686 */     a(289, "gunpowder", new alq().c("sulphur").e(ans.k).a(akf.l));
/* 625:687 */     a(290, "wooden_hoe", new alo(ami.a).c("hoeWood"));
/* 626:688 */     a(291, "stone_hoe", new alo(ami.b).c("hoeStone"));
/* 627:689 */     a(292, "iron_hoe", new alo(ami.c).c("hoeIron"));
/* 628:690 */     a(293, "diamond_hoe", new alo(ami.d).c("hoeDiamond"));
/* 629:691 */     a(294, "golden_hoe", new alo(ami.e).c("hoeGold"));
/* 630:692 */     a(295, "wheat_seeds", new anc(aty.aj, aty.ak).c("seeds"));
/* 631:693 */     a(296, "wheat", new alq().c("wheat").a(akf.l));
/* 632:694 */     a(297, "bread", new all(5, 0.6F, false).c("bread"));
/* 633:695 */     a(298, "leather_helmet", new ajn(ajp.a, 0, 0).c("helmetCloth"));
/* 634:696 */     a(299, "leather_chestplate", new ajn(ajp.a, 0, 1).c("chestplateCloth"));
/* 635:697 */     a(300, "leather_leggings", new ajn(ajp.a, 0, 2).c("leggingsCloth"));
/* 636:698 */     a(301, "leather_boots", new ajn(ajp.a, 0, 3).c("bootsCloth"));
/* 637:699 */     a(302, "chainmail_helmet", new ajn(ajp.b, 1, 0).c("helmetChain"));
/* 638:700 */     a(303, "chainmail_chestplate", new ajn(ajp.b, 1, 1).c("chestplateChain"));
/* 639:701 */     a(304, "chainmail_leggings", new ajn(ajp.b, 1, 2).c("leggingsChain"));
/* 640:702 */     a(305, "chainmail_boots", new ajn(ajp.b, 1, 3).c("bootsChain"));
/* 641:703 */     a(306, "iron_helmet", new ajn(ajp.c, 2, 0).c("helmetIron"));
/* 642:704 */     a(307, "iron_chestplate", new ajn(ajp.c, 2, 1).c("chestplateIron"));
/* 643:705 */     a(308, "iron_leggings", new ajn(ajp.c, 2, 2).c("leggingsIron"));
/* 644:706 */     a(309, "iron_boots", new ajn(ajp.c, 2, 3).c("bootsIron"));
/* 645:707 */     a(310, "diamond_helmet", new ajn(ajp.e, 3, 0).c("helmetDiamond"));
/* 646:708 */     a(311, "diamond_chestplate", new ajn(ajp.e, 3, 1).c("chestplateDiamond"));
/* 647:709 */     a(312, "diamond_leggings", new ajn(ajp.e, 3, 2).c("leggingsDiamond"));
/* 648:710 */     a(313, "diamond_boots", new ajn(ajp.e, 3, 3).c("bootsDiamond"));
/* 649:711 */     a(314, "golden_helmet", new ajn(ajp.d, 4, 0).c("helmetGold"));
/* 650:712 */     a(315, "golden_chestplate", new ajn(ajp.d, 4, 1).c("chestplateGold"));
/* 651:713 */     a(316, "golden_leggings", new ajn(ajp.d, 4, 2).c("leggingsGold"));
/* 652:714 */     a(317, "golden_boots", new ajn(ajp.d, 4, 3).c("bootsGold"));
/* 653:715 */     a(318, "flint", new alq().c("flint").a(akf.l));
/* 654:716 */     a(319, "porkchop", new all(3, 0.3F, true).c("porkchopRaw"));
/* 655:717 */     a(320, "cooked_porkchop", new all(8, 0.8F, true).c("porkchopCooked"));
/* 656:718 */     a(321, "painting", new aln(adm.class).c("painting"));
/* 657:719 */     a(322, "golden_apple", new alm(4, 1.2F, false).h().a(wp.l.H, 5, 1, 1.0F).c("appleGold"));
/* 658:720 */     a(323, "sign", new anf().c("sign"));
/* 659:721 */     a(324, "wooden_door", new akt(aty.ao).c("doorOak"));
/* 660:722 */     alq localalq = new akb(aty.a).c("bucket").c(16);
/* 661:723 */     a(325, "bucket", localalq);
/* 662:724 */     a(326, "water_bucket", new akb(aty.i).c("bucketWater").c(localalq));
/* 663:725 */     a(327, "lava_bucket", new akb(aty.k).c("bucketLava").c(localalq));
/* 664:726 */     a(328, "minecart", new amp(adz.a).c("minecart"));
/* 665:727 */     a(329, "saddle", new ana().c("saddle"));
/* 666:728 */     a(330, "iron_door", new akt(aty.aA).c("doorIron"));
/* 667:729 */     a(331, "redstone", new amz().c("redstone").e(ans.i));
/* 668:730 */     a(332, "snowball", new ank().c("snowball"));
/* 669:731 */     a(333, "boat", new ajw().c("boat"));
/* 670:732 */     a(334, "leather", new alq().c("leather").a(akf.l));
/* 671:733 */     a(335, "milk_bucket", new amo().c("milk").c(localalq));
/* 672:734 */     a(336, "brick", new alq().c("brick").a(akf.l));
/* 673:735 */     a(337, "clay_ball", new alq().c("clay").a(akf.l));
/* 674:736 */     a(338, "reeds", new ajv(aty.aM).c("reeds").a(akf.l));
/* 675:737 */     a(339, "paper", new alq().c("paper").a(akf.f));
/* 676:738 */     a(340, "book", new ajx().c("book").a(akf.f));
/* 677:739 */     a(341, "slime_ball", new alq().c("slimeball").a(akf.f));
/* 678:740 */     a(342, "chest_minecart", new amp(adz.b).c("minecartChest"));
/* 679:741 */     a(343, "furnace_minecart", new amp(adz.c).c("minecartFurnace"));
/* 680:742 */     a(344, "egg", new aky().c("egg"));
/* 681:743 */     a(345, "compass", new alq().c("compass").a(akf.i));
/* 682:744 */     a(346, "fishing_rod", new alj().c("fishingRod"));
/* 683:745 */     a(347, "clock", new alq().c("clock").a(akf.i));
/* 684:746 */     a(348, "glowstone_dust", new alq().c("yellowDust").e(ans.j).a(akf.l));
/* 685:747 */     a(349, "fish", new alh(false).c("fish").a(true));
/* 686:748 */     a(350, "cooked_fish", new alh(true).c("fish").a(true));
/* 687:749 */     a(351, "dye", new akw().c("dyePowder"));
/* 688:750 */     a(352, "bone", new alq().c("bone").n().a(akf.f));
/* 689:751 */     a(353, "sugar", new alq().c("sugar").e(ans.b).a(akf.l));
/* 690:752 */     a(354, "cake", new ajv(aty.ba).c(1).c("cake").a(akf.h));
/* 691:753 */     a(355, "bed", new ajt().c(1).c("bed"));
/* 692:754 */     a(356, "repeater", new ajv(aty.bb).c("diode").a(akf.d));
/* 693:755 */     a(357, "cookie", new all(2, 0.1F, false).c("cookie"));
/* 694:756 */     a(358, "filled_map", new amn().c("map"));
/* 695:757 */     a(359, "shears", new and().c("shears"));
/* 696:758 */     a(360, "melon", new all(2, 0.3F, false).c("melon"));
/* 697:759 */     a(361, "pumpkin_seeds", new anc(aty.bl, aty.ak).c("seeds_pumpkin"));
/* 698:760 */     a(362, "melon_seeds", new anc(aty.bm, aty.ak).c("seeds_melon"));
/* 699:761 */     a(363, "beef", new all(3, 0.3F, true).c("beefRaw"));
/* 700:762 */     a(364, "cooked_beef", new all(8, 0.8F, true).c("beefCooked"));
/* 701:763 */     a(365, "chicken", new all(2, 0.3F, true).a(wp.s.H, 30, 0, 0.3F).c("chickenRaw"));
/* 702:764 */     a(366, "cooked_chicken", new all(6, 0.6F, true).c("chickenCooked"));
/* 703:765 */     a(367, "rotten_flesh", new all(4, 0.1F, true).a(wp.s.H, 30, 0, 0.8F).c("rottenFlesh"));
/* 704:766 */     a(368, "ender_pearl", new alc().c("enderPearl"));
/* 705:767 */     a(369, "blaze_rod", new alq().c("blazeRod").a(akf.l).n());
/* 706:768 */     a(370, "ghast_tear", new alq().c("ghastTear").e(ans.c).a(akf.k));
/* 707:769 */     a(371, "gold_nugget", new alq().c("goldNugget").a(akf.l));
/* 708:770 */     a(372, "nether_wart", new anc(aty.bB, aty.aW).c("netherStalkSeeds").e("+4"));
/* 709:771 */     a(373, "potion", new amw().c("potion"));
/* 710:772 */     a(374, "glass_bottle", new ajy().c("glassBottle"));
/* 711:773 */     a(375, "spider_eye", new all(2, 0.8F, false).a(wp.u.H, 5, 0, 1.0F).c("spiderEye").e(ans.d));
/* 712:774 */     a(376, "fermented_spider_eye", new alq().c("fermentedSpiderEye").e(ans.e).a(akf.k));
/* 713:775 */     a(377, "blaze_powder", new alq().c("blazePowder").e(ans.g).a(akf.k));
/* 714:776 */     a(378, "magma_cream", new alq().c("magmaCream").e(ans.h).a(akf.k));
/* 715:777 */     a(379, "brewing_stand", new ajv(aty.bD).c("brewingStand").a(akf.k));
/* 716:778 */     a(380, "cauldron", new ajv(aty.bE).c("cauldron").a(akf.k));
/* 717:779 */     a(381, "ender_eye", new alb().c("eyeOfEnder"));
/* 718:780 */     a(382, "speckled_melon", new alq().c("speckledMelon").e(ans.f).a(akf.k));
/* 719:781 */     a(383, "spawn_egg", new anl().c("monsterPlacer"));
/* 720:782 */     a(384, "experience_bottle", new ald().c("expBottle"));
/* 721:783 */     a(385, "fire_charge", new ale().c("fireball"));
/* 722:784 */     a(386, "writable_book", new anq().c("writingBook").a(akf.f));
/* 723:785 */     a(387, "written_book", new anr().c("writtenBook").c(16));
/* 724:786 */     a(388, "emerald", new alq().c("emerald").a(akf.l));
/* 725:787 */     a(389, "item_frame", new aln(adk.class).c("frame"));
/* 726:788 */     a(390, "flower_pot", new ajv(aty.ca).c("flowerPot").a(akf.c));
/* 727:789 */     a(391, "carrot", new anb(3, 0.6F, aty.cb, aty.ak).c("carrots"));
/* 728:790 */     a(392, "potato", new anb(1, 0.3F, aty.cc, aty.ak).c("potato"));
/* 729:791 */     a(393, "baked_potato", new all(5, 0.6F, false).c("potatoBaked"));
/* 730:792 */     a(394, "poisonous_potato", new all(2, 0.3F, false).a(wp.u.H, 5, 0, 0.6F).c("potatoPoisonous"));
/* 731:793 */     a(395, "map", new akz().c("emptyMap"));
/* 732:794 */     a(396, "golden_carrot", new all(6, 1.2F, false).c("carrotGolden").e(ans.l).a(akf.k));
/* 733:795 */     a(397, "skull", new anh().c("skull"));
/* 734:796 */     a(398, "carrot_on_a_stick", new akc().c("carrotOnAStick"));
/* 735:797 */     a(399, "nether_star", new ang().c("netherStar").a(akf.l));
/* 736:798 */     a(400, "pumpkin_pie", new all(8, 0.3F, false).c("pumpkinPie").a(akf.h));
/* 737:799 */     a(401, "fireworks", new alg().c("fireworks"));
/* 738:800 */     a(402, "firework_charge", new alf().c("fireworksCharge").a(akf.f));
/* 739:801 */     a(403, "enchanted_book", new ala().c(1).c("enchantedBook"));
/* 740:802 */     a(404, "comparator", new ajv(aty.cj).c("comparator").a(akf.d));
/* 741:803 */     a(405, "netherbrick", new alq().c("netherbrick").a(akf.l));
/* 742:804 */     a(406, "quartz", new alq().c("netherquartz").a(akf.l));
/* 743:805 */     a(407, "tnt_minecart", new amp(adz.d).c("minecartTnt"));
/* 744:806 */     a(408, "hopper_minecart", new amp(adz.f).c("minecartHopper"));
/* 745:807 */     a(409, "prismarine_shard", new alq().c("prismarineShard").a(akf.l));
/* 746:808 */     a(410, "prismarine_crystals", new alq().c("prismarineCrystals").a(akf.l));
/* 747:809 */     a(411, "rabbit", new all(3, 0.3F, true).c("rabbitRaw"));
/* 748:810 */     a(412, "cooked_rabbit", new all(5, 0.6F, true).c("rabbitCooked"));
/* 749:811 */     a(413, "rabbit_stew", new aka(10).c("rabbitStew"));
/* 750:812 */     a(414, "rabbit_foot", new alq().c("rabbitFoot").e(ans.n).a(akf.k));
/* 751:813 */     a(415, "rabbit_hide", new alq().c("rabbitHide").a(akf.l));
/* 752:814 */     a(416, "armor_stand", new ajq().c("armorStand").c(16));
/* 753:815 */     a(417, "iron_horse_armor", new alq().c("horsearmormetal").c(1).a(akf.f));
/* 754:816 */     a(418, "golden_horse_armor", new alq().c("horsearmorgold").c(1).a(akf.f));
/* 755:817 */     a(419, "diamond_horse_armor", new alq().c("horsearmordiamond").c(1).a(akf.f));
/* 756:818 */     a(420, "lead", new aml().c("leash"));
/* 757:819 */     a(421, "name_tag", new amt().c("nameTag"));
/* 758:820 */     a(422, "command_block_minecart", new amp(adz.g).c("minecartCommandBlock").a(null));
/* 759:821 */     a(423, "mutton", new all(2, 0.3F, true).c("muttonRaw"));
/* 760:822 */     a(424, "cooked_mutton", new all(6, 0.8F, true).c("muttonCooked"));
/* 761:823 */     a(425, "banner", new ajs().b("banner"));
/* 762:824 */     a(427, "spruce_door", new akt(aty.ap).c("doorSpruce"));
/* 763:825 */     a(428, "birch_door", new akt(aty.aq).c("doorBirch"));
/* 764:826 */     a(429, "jungle_door", new akt(aty.ar).c("doorJungle"));
/* 765:827 */     a(430, "acacia_door", new akt(aty.as).c("doorAcacia"));
/* 766:828 */     a(431, "dark_oak_door", new akt(aty.at).c("doorDarkOak"));
/* 767:    */     
/* 768:    */ 
/* 769:831 */     a(2256, "record_13", new amy("13").c("record"));
/* 770:832 */     a(2257, "record_cat", new amy("cat").c("record"));
/* 771:833 */     a(2258, "record_blocks", new amy("blocks").c("record"));
/* 772:834 */     a(2259, "record_chirp", new amy("chirp").c("record"));
/* 773:835 */     a(2260, "record_far", new amy("far").c("record"));
/* 774:836 */     a(2261, "record_mall", new amy("mall").c("record"));
/* 775:837 */     a(2262, "record_mellohi", new amy("mellohi").c("record"));
/* 776:838 */     a(2263, "record_stal", new amy("stal").c("record"));
/* 777:839 */     a(2264, "record_strad", new amy("strad").c("record"));
/* 778:840 */     a(2265, "record_ward", new amy("ward").c("record"));
/* 779:841 */     a(2266, "record_11", new amy("11").c("record"));
/* 780:842 */     a(2267, "record_wait", new amy("wait").c("record"));
/* 781:    */   }
/* 782:    */   
/* 783:    */   private static void c(atr paramatr)
/* 784:    */   {
/* 785:846 */     a(paramatr, new aju(paramatr));
/* 786:    */   }
/* 787:    */   
/* 788:    */   protected static void a(atr paramatr, alq paramalq)
/* 789:    */   {
/* 790:850 */     a(atr.a(paramatr), (oa)atr.c.c(paramatr), paramalq);
/* 791:851 */     a.put(paramatr, paramalq);
/* 792:    */   }
/* 793:    */   
/* 794:    */   private static void a(int paramInt, String paramString, alq paramalq)
/* 795:    */   {
/* 796:855 */     a(paramInt, new oa(paramString), paramalq);
/* 797:    */   }
/* 798:    */   
/* 799:    */   private static void a(int paramInt, oa paramoa, alq paramalq)
/* 800:    */   {
/* 801:859 */     e.a(paramInt, paramoa, paramalq);
/* 802:    */   }
/* 803:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     alq
 * JD-Core Version:    0.7.0.1
 */