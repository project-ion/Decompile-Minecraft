/*    1:     */ import java.util.Collection;
/*    2:     */ import java.util.Iterator;
/*    3:     */ import java.util.List;
/*    4:     */ import java.util.Random;
/*    5:     */ 
/*    6:     */ public class atr
/*    7:     */ {
/*    8:  43 */   private static final oa a = new oa("air");
/*    9:  44 */   public static final eh c = new eh(a);
/*   10:  45 */   public static final er d = new er();
/*   11:     */   private akf b;
/*   12:     */   
/*   13:     */   public static int a(atr paramatr)
/*   14:     */   {
/*   15:  65 */     return c.b(paramatr);
/*   16:     */   }
/*   17:     */   
/*   18:     */   public static int f(bec parambec)
/*   19:     */   {
/*   20:  69 */     return a(parambec.c()) + (parambec.c().c(parambec) << 12);
/*   21:     */   }
/*   22:     */   
/*   23:     */   public static atr c(int paramInt)
/*   24:     */   {
/*   25:  73 */     return (atr)c.a(paramInt);
/*   26:     */   }
/*   27:     */   
/*   28:     */   public static bec d(int paramInt)
/*   29:     */   {
/*   30:  77 */     int i1 = paramInt & 0xFFF;
/*   31:  78 */     int i2 = paramInt >> 12 & 0xF;
/*   32:  79 */     return c(i1).a(i2);
/*   33:     */   }
/*   34:     */   
/*   35:     */   public static atr a(alq paramalq)
/*   36:     */   {
/*   37:  83 */     if ((paramalq instanceof aju)) {
/*   38:  84 */       return ((aju)paramalq).d();
/*   39:     */     }
/*   40:  87 */     return null;
/*   41:     */   }
/*   42:     */   
/*   43:     */   public static atr b(String paramString)
/*   44:     */   {
/*   45:  92 */     oa localoa = new oa(paramString);
/*   46:  93 */     if (c.d(localoa)) {
/*   47:  94 */       return (atr)c.a(localoa);
/*   48:     */     }
/*   49:     */     try
/*   50:     */     {
/*   51:  98 */       return (atr)c.a(Integer.parseInt(paramString));
/*   52:     */     }
/*   53:     */     catch (NumberFormatException localNumberFormatException) {}
/*   54: 102 */     return null;
/*   55:     */   }
/*   56:     */   
/*   57:     */   public boolean m()
/*   58:     */   {
/*   59: 106 */     return this.r;
/*   60:     */   }
/*   61:     */   
/*   62:     */   public int n()
/*   63:     */   {
/*   64: 110 */     return this.s;
/*   65:     */   }
/*   66:     */   
/*   67:     */   public boolean o()
/*   68:     */   {
/*   69: 114 */     return this.t;
/*   70:     */   }
/*   71:     */   
/*   72:     */   public int p()
/*   73:     */   {
/*   74: 118 */     return this.u;
/*   75:     */   }
/*   76:     */   
/*   77:     */   public boolean q()
/*   78:     */   {
/*   79: 122 */     return this.v;
/*   80:     */   }
/*   81:     */   
/*   82:     */   public bof r()
/*   83:     */   {
/*   84: 126 */     return this.J;
/*   85:     */   }
/*   86:     */   
/*   87:     */   public boh g(bec parambec)
/*   88:     */   {
/*   89: 130 */     return r().r();
/*   90:     */   }
/*   91:     */   
/*   92:     */   public bec a(int paramInt)
/*   93:     */   {
/*   94: 136 */     return P();
/*   95:     */   }
/*   96:     */   
/*   97:     */   public int c(bec parambec)
/*   98:     */   {
/*   99: 140 */     if ((parambec == null) || (parambec.a().isEmpty())) {
/*  100: 141 */       return 0;
/*  101:     */     }
/*  102: 144 */     throw new IllegalArgumentException("Don't know how to convert " + parambec + " back into data...");
/*  103:     */   }
/*  104:     */   
/*  105:     */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  106:     */   {
/*  107: 148 */     return parambec;
/*  108:     */   }
/*  109:     */   
/*  110: 183 */   public static final atx e = new atx("stone", 1.0F, 1.0F);
/*  111: 184 */   public static final atx f = new atx("wood", 1.0F, 1.0F);
/*  112: 185 */   public static final atx g = new atx("gravel", 1.0F, 1.0F);
/*  113: 186 */   public static final atx h = new atx("grass", 1.0F, 1.0F);
/*  114: 187 */   public static final atx i = new atx("stone", 1.0F, 1.0F);
/*  115: 188 */   public static final atx j = new atx("stone", 1.0F, 1.5F);
/*  116: 189 */   public static final atx k = new ats("stone", 1.0F, 1.0F);
/*  117: 200 */   public static final atx l = new atx("cloth", 1.0F, 1.0F);
/*  118: 201 */   public static final atx m = new atx("sand", 1.0F, 1.0F);
/*  119: 202 */   public static final atx n = new atx("snow", 1.0F, 1.0F);
/*  120: 203 */   public static final atx o = new att("ladder", 1.0F, 1.0F);
/*  121: 209 */   public static final atx p = new atu("anvil", 0.3F, 1.0F);
/*  122: 220 */   public static final atx q = new atv("slime", 1.0F, 1.0F);
/*  123:     */   protected boolean r;
/*  124:     */   protected int s;
/*  125:     */   protected boolean t;
/*  126:     */   protected int u;
/*  127:     */   protected boolean v;
/*  128:     */   protected float w;
/*  129:     */   protected float x;
/*  130: 249 */   protected boolean y = true;
/*  131:     */   protected boolean z;
/*  132:     */   protected boolean A;
/*  133:     */   protected double B;
/*  134:     */   protected double C;
/*  135:     */   protected double D;
/*  136:     */   protected double E;
/*  137:     */   protected double F;
/*  138:     */   protected double G;
/*  139: 255 */   public atx H = e;
/*  140: 257 */   public float I = 1.0F;
/*  141:     */   protected final bof J;
/*  142: 259 */   public float K = 0.6F;
/*  143:     */   protected final bed L;
/*  144:     */   private bec M;
/*  145:     */   private String N;
/*  146:     */   
/*  147:     */   protected atr(bof parambof)
/*  148:     */   {
/*  149: 266 */     this.J = parambof;
/*  150: 267 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  151: 268 */     this.r = c();
/*  152: 269 */     this.s = (c() ? 255 : 0);
/*  153: 270 */     this.t = (!parambof.b());
/*  154:     */     
/*  155: 272 */     this.L = e();
/*  156: 273 */     j(this.L.b());
/*  157:     */   }
/*  158:     */   
/*  159:     */   protected atr a(atx paramatx)
/*  160:     */   {
/*  161: 277 */     this.H = paramatx;
/*  162: 278 */     return this;
/*  163:     */   }
/*  164:     */   
/*  165:     */   protected atr e(int paramInt)
/*  166:     */   {
/*  167: 282 */     this.s = paramInt;
/*  168: 283 */     return this;
/*  169:     */   }
/*  170:     */   
/*  171:     */   protected atr a(float paramFloat)
/*  172:     */   {
/*  173: 287 */     this.u = ((int)(15.0F * paramFloat));
/*  174: 288 */     return this;
/*  175:     */   }
/*  176:     */   
/*  177:     */   protected atr b(float paramFloat)
/*  178:     */   {
/*  179: 292 */     this.x = (paramFloat * 3.0F);
/*  180: 293 */     return this;
/*  181:     */   }
/*  182:     */   
/*  183:     */   public boolean s()
/*  184:     */   {
/*  185: 301 */     return (this.J.c()) && (d());
/*  186:     */   }
/*  187:     */   
/*  188:     */   public boolean t()
/*  189:     */   {
/*  190: 305 */     return (this.J.k()) && (d()) && (!g());
/*  191:     */   }
/*  192:     */   
/*  193:     */   public boolean u()
/*  194:     */   {
/*  195: 309 */     return (this.J.c()) && (d());
/*  196:     */   }
/*  197:     */   
/*  198:     */   public boolean d()
/*  199:     */   {
/*  200: 313 */     return true;
/*  201:     */   }
/*  202:     */   
/*  203:     */   public boolean b(ard paramard, dt paramdt)
/*  204:     */   {
/*  205: 318 */     return !this.J.c();
/*  206:     */   }
/*  207:     */   
/*  208:     */   public int b()
/*  209:     */   {
/*  210: 322 */     return 3;
/*  211:     */   }
/*  212:     */   
/*  213:     */   public boolean f(aqu paramaqu, dt paramdt)
/*  214:     */   {
/*  215: 326 */     return false;
/*  216:     */   }
/*  217:     */   
/*  218:     */   protected atr c(float paramFloat)
/*  219:     */   {
/*  220: 330 */     this.w = paramFloat;
/*  221: 331 */     if (this.x < paramFloat * 5.0F) {
/*  222: 332 */       this.x = (paramFloat * 5.0F);
/*  223:     */     }
/*  224: 334 */     return this;
/*  225:     */   }
/*  226:     */   
/*  227:     */   protected atr v()
/*  228:     */   {
/*  229: 338 */     c(-1.0F);
/*  230: 339 */     return this;
/*  231:     */   }
/*  232:     */   
/*  233:     */   public float g(aqu paramaqu, dt paramdt)
/*  234:     */   {
/*  235: 343 */     return this.w;
/*  236:     */   }
/*  237:     */   
/*  238:     */   protected atr a(boolean paramBoolean)
/*  239:     */   {
/*  240: 347 */     this.z = paramBoolean;
/*  241: 348 */     return this;
/*  242:     */   }
/*  243:     */   
/*  244:     */   public boolean w()
/*  245:     */   {
/*  246: 352 */     return this.z;
/*  247:     */   }
/*  248:     */   
/*  249:     */   public boolean x()
/*  250:     */   {
/*  251: 356 */     return this.A;
/*  252:     */   }
/*  253:     */   
/*  254:     */   protected final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  255:     */   {
/*  256: 360 */     this.B = paramFloat1;
/*  257: 361 */     this.C = paramFloat2;
/*  258: 362 */     this.D = paramFloat3;
/*  259: 363 */     this.E = paramFloat4;
/*  260: 364 */     this.F = paramFloat5;
/*  261: 365 */     this.G = paramFloat6;
/*  262:     */   }
/*  263:     */   
/*  264:     */   public int c(ard paramard, dt paramdt)
/*  265:     */   {
/*  266: 369 */     atr localatr = paramard.p(paramdt).c();
/*  267: 370 */     int i1 = paramard.b(paramdt, localatr.p());
/*  268: 373 */     if ((i1 == 0) && ((localatr instanceof awq)))
/*  269:     */     {
/*  270: 374 */       paramdt = paramdt.b();
/*  271: 375 */       localatr = paramard.p(paramdt).c();
/*  272: 376 */       return paramard.b(paramdt, localatr.p());
/*  273:     */     }
/*  274: 378 */     return i1;
/*  275:     */   }
/*  276:     */   
/*  277:     */   public boolean a(ard paramard, dt paramdt, ej paramej)
/*  278:     */   {
/*  279: 382 */     if ((paramej == ej.a) && (this.C > 0.0D)) {
/*  280: 383 */       return true;
/*  281:     */     }
/*  282: 385 */     if ((paramej == ej.b) && (this.F < 1.0D)) {
/*  283: 386 */       return true;
/*  284:     */     }
/*  285: 388 */     if ((paramej == ej.c) && (this.D > 0.0D)) {
/*  286: 389 */       return true;
/*  287:     */     }
/*  288: 391 */     if ((paramej == ej.d) && (this.G < 1.0D)) {
/*  289: 392 */       return true;
/*  290:     */     }
/*  291: 394 */     if ((paramej == ej.e) && (this.B > 0.0D)) {
/*  292: 395 */       return true;
/*  293:     */     }
/*  294: 397 */     if ((paramej == ej.f) && (this.E < 1.0D)) {
/*  295: 398 */       return true;
/*  296:     */     }
/*  297: 400 */     return !paramard.p(paramdt).c().c();
/*  298:     */   }
/*  299:     */   
/*  300:     */   public boolean b(ard paramard, dt paramdt, ej paramej)
/*  301:     */   {
/*  302: 405 */     return paramard.p(paramdt).c().r().a();
/*  303:     */   }
/*  304:     */   
/*  305:     */   public brt a(aqu paramaqu, dt paramdt)
/*  306:     */   {
/*  307: 409 */     return new brt(paramdt.n() + this.B, paramdt.o() + this.C, paramdt.p() + this.D, paramdt.n() + this.E, paramdt.o() + this.F, paramdt.p() + this.G);
/*  308:     */   }
/*  309:     */   
/*  310:     */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/*  311:     */   {
/*  312: 413 */     brt localbrt = a(paramaqu, paramdt, parambec);
/*  313: 414 */     if ((localbrt != null) && (parambrt.b(localbrt))) {
/*  314: 415 */       paramList.add(localbrt);
/*  315:     */     }
/*  316:     */   }
/*  317:     */   
/*  318:     */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  319:     */   {
/*  320: 421 */     return new brt(paramdt.n() + this.B, paramdt.o() + this.C, paramdt.p() + this.D, paramdt.n() + this.E, paramdt.o() + this.F, paramdt.p() + this.G);
/*  321:     */   }
/*  322:     */   
/*  323:     */   public boolean c()
/*  324:     */   {
/*  325: 425 */     return true;
/*  326:     */   }
/*  327:     */   
/*  328:     */   public boolean a(bec parambec, boolean paramBoolean)
/*  329:     */   {
/*  330: 429 */     return y();
/*  331:     */   }
/*  332:     */   
/*  333:     */   public boolean y()
/*  334:     */   {
/*  335: 433 */     return true;
/*  336:     */   }
/*  337:     */   
/*  338:     */   public void a(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  339:     */   {
/*  340: 437 */     b(paramaqu, paramdt, parambec, paramRandom);
/*  341:     */   }
/*  342:     */   
/*  343:     */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom) {}
/*  344:     */   
/*  345:     */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom) {}
/*  346:     */   
/*  347:     */   public void d(aqu paramaqu, dt paramdt, bec parambec) {}
/*  348:     */   
/*  349:     */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr) {}
/*  350:     */   
/*  351:     */   public int a(aqu paramaqu)
/*  352:     */   {
/*  353: 456 */     return 10;
/*  354:     */   }
/*  355:     */   
/*  356:     */   public void c(aqu paramaqu, dt paramdt, bec parambec) {}
/*  357:     */   
/*  358:     */   public void b(aqu paramaqu, dt paramdt, bec parambec) {}
/*  359:     */   
/*  360:     */   public int a(Random paramRandom)
/*  361:     */   {
/*  362: 466 */     return 1;
/*  363:     */   }
/*  364:     */   
/*  365:     */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  366:     */   {
/*  367: 471 */     return alq.a(this);
/*  368:     */   }
/*  369:     */   
/*  370:     */   public float a(ahd paramahd, aqu paramaqu, dt paramdt)
/*  371:     */   {
/*  372: 475 */     float f1 = g(paramaqu, paramdt);
/*  373: 476 */     if (f1 < 0.0F) {
/*  374: 477 */       return 0.0F;
/*  375:     */     }
/*  376: 479 */     if (!paramahd.b(this)) {
/*  377: 480 */       return paramahd.a(this) / f1 / 100.0F;
/*  378:     */     }
/*  379: 482 */     return paramahd.a(this) / f1 / 30.0F;
/*  380:     */   }
/*  381:     */   
/*  382:     */   public final void b(aqu paramaqu, dt paramdt, bec parambec, int paramInt)
/*  383:     */   {
/*  384: 486 */     a(paramaqu, paramdt, parambec, 1.0F, paramInt);
/*  385:     */   }
/*  386:     */   
/*  387:     */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/*  388:     */   {
/*  389: 490 */     if (paramaqu.D) {
/*  390: 491 */       return;
/*  391:     */     }
/*  392: 493 */     int i1 = a(paramInt, paramaqu.s);
/*  393: 494 */     for (int i2 = 0; i2 < i1; i2++) {
/*  394: 495 */       if (paramaqu.s.nextFloat() <= paramFloat)
/*  395:     */       {
/*  396: 498 */         alq localalq = a(parambec, paramaqu.s, paramInt);
/*  397: 499 */         if (localalq != null) {
/*  398: 503 */           a(paramaqu, paramdt, new amj(localalq, 1, a(parambec)));
/*  399:     */         }
/*  400:     */       }
/*  401:     */     }
/*  402:     */   }
/*  403:     */   
/*  404:     */   public static void a(aqu paramaqu, dt paramdt, amj paramamj)
/*  405:     */   {
/*  406: 508 */     if ((paramaqu.D) || (!paramaqu.Q().b("doTileDrops"))) {
/*  407: 509 */       return;
/*  408:     */     }
/*  409: 512 */     float f1 = 0.5F;
/*  410: 513 */     double d1 = paramaqu.s.nextFloat() * f1 + (1.0F - f1) * 0.5D;
/*  411: 514 */     double d2 = paramaqu.s.nextFloat() * f1 + (1.0F - f1) * 0.5D;
/*  412: 515 */     double d3 = paramaqu.s.nextFloat() * f1 + (1.0F - f1) * 0.5D;
/*  413: 516 */     adw localadw = new adw(paramaqu, paramdt.n() + d1, paramdt.o() + d2, paramdt.p() + d3, paramamj);
/*  414: 517 */     localadw.p();
/*  415: 518 */     paramaqu.d(localadw);
/*  416:     */   }
/*  417:     */   
/*  418:     */   protected void b(aqu paramaqu, dt paramdt, int paramInt)
/*  419:     */   {
/*  420: 522 */     if (!paramaqu.D) {
/*  421: 523 */       while (paramInt > 0)
/*  422:     */       {
/*  423: 524 */         int i1 = xk.a(paramInt);
/*  424: 525 */         paramInt -= i1;
/*  425: 526 */         paramaqu.d(new xk(paramaqu, paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, i1));
/*  426:     */       }
/*  427:     */     }
/*  428:     */   }
/*  429:     */   
/*  430:     */   public int a(bec parambec)
/*  431:     */   {
/*  432: 539 */     return 0;
/*  433:     */   }
/*  434:     */   
/*  435:     */   public float a(wv paramwv)
/*  436:     */   {
/*  437: 543 */     return this.x / 5.0F;
/*  438:     */   }
/*  439:     */   
/*  440:     */   public bru a(aqu paramaqu, dt paramdt, brw parambrw1, brw parambrw2)
/*  441:     */   {
/*  442: 548 */     a(paramaqu, paramdt);
/*  443:     */     
/*  444: 550 */     parambrw1 = parambrw1.b(-paramdt.n(), -paramdt.o(), -paramdt.p());
/*  445: 551 */     parambrw2 = parambrw2.b(-paramdt.n(), -paramdt.o(), -paramdt.p());
/*  446:     */     
/*  447: 553 */     brw localbrw1 = parambrw1.a(parambrw2, this.B);
/*  448: 554 */     brw localbrw2 = parambrw1.a(parambrw2, this.E);
/*  449:     */     
/*  450: 556 */     brw localbrw3 = parambrw1.b(parambrw2, this.C);
/*  451: 557 */     brw localbrw4 = parambrw1.b(parambrw2, this.F);
/*  452:     */     
/*  453: 559 */     brw localbrw5 = parambrw1.c(parambrw2, this.D);
/*  454: 560 */     brw localbrw6 = parambrw1.c(parambrw2, this.G);
/*  455: 562 */     if (!a(localbrw1)) {
/*  456: 563 */       localbrw1 = null;
/*  457:     */     }
/*  458: 565 */     if (!a(localbrw2)) {
/*  459: 566 */       localbrw2 = null;
/*  460:     */     }
/*  461: 568 */     if (!b(localbrw3)) {
/*  462: 569 */       localbrw3 = null;
/*  463:     */     }
/*  464: 571 */     if (!b(localbrw4)) {
/*  465: 572 */       localbrw4 = null;
/*  466:     */     }
/*  467: 574 */     if (!c(localbrw5)) {
/*  468: 575 */       localbrw5 = null;
/*  469:     */     }
/*  470: 577 */     if (!c(localbrw6)) {
/*  471: 578 */       localbrw6 = null;
/*  472:     */     }
/*  473: 581 */     brw localbrw7 = null;
/*  474: 583 */     if ((localbrw1 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw1) < parambrw1.g(localbrw7)))) {
/*  475: 584 */       localbrw7 = localbrw1;
/*  476:     */     }
/*  477: 586 */     if ((localbrw2 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw2) < parambrw1.g(localbrw7)))) {
/*  478: 587 */       localbrw7 = localbrw2;
/*  479:     */     }
/*  480: 589 */     if ((localbrw3 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw3) < parambrw1.g(localbrw7)))) {
/*  481: 590 */       localbrw7 = localbrw3;
/*  482:     */     }
/*  483: 592 */     if ((localbrw4 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw4) < parambrw1.g(localbrw7)))) {
/*  484: 593 */       localbrw7 = localbrw4;
/*  485:     */     }
/*  486: 595 */     if ((localbrw5 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw5) < parambrw1.g(localbrw7)))) {
/*  487: 596 */       localbrw7 = localbrw5;
/*  488:     */     }
/*  489: 598 */     if ((localbrw6 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw6) < parambrw1.g(localbrw7)))) {
/*  490: 599 */       localbrw7 = localbrw6;
/*  491:     */     }
/*  492: 602 */     if (localbrw7 == null) {
/*  493: 603 */       return null;
/*  494:     */     }
/*  495: 606 */     ej localej = null;
/*  496: 608 */     if (localbrw7 == localbrw1) {
/*  497: 609 */       localej = ej.e;
/*  498:     */     }
/*  499: 611 */     if (localbrw7 == localbrw2) {
/*  500: 612 */       localej = ej.f;
/*  501:     */     }
/*  502: 614 */     if (localbrw7 == localbrw3) {
/*  503: 615 */       localej = ej.a;
/*  504:     */     }
/*  505: 617 */     if (localbrw7 == localbrw4) {
/*  506: 618 */       localej = ej.b;
/*  507:     */     }
/*  508: 620 */     if (localbrw7 == localbrw5) {
/*  509: 621 */       localej = ej.c;
/*  510:     */     }
/*  511: 623 */     if (localbrw7 == localbrw6) {
/*  512: 624 */       localej = ej.d;
/*  513:     */     }
/*  514: 627 */     return new bru(localbrw7.b(paramdt.n(), paramdt.o(), paramdt.p()), localej, paramdt);
/*  515:     */   }
/*  516:     */   
/*  517:     */   private boolean a(brw parambrw)
/*  518:     */   {
/*  519: 631 */     if (parambrw == null) {
/*  520: 632 */       return false;
/*  521:     */     }
/*  522: 634 */     return (parambrw.b >= this.C) && (parambrw.b <= this.F) && (parambrw.c >= this.D) && (parambrw.c <= this.G);
/*  523:     */   }
/*  524:     */   
/*  525:     */   private boolean b(brw parambrw)
/*  526:     */   {
/*  527: 638 */     if (parambrw == null) {
/*  528: 639 */       return false;
/*  529:     */     }
/*  530: 641 */     return (parambrw.a >= this.B) && (parambrw.a <= this.E) && (parambrw.c >= this.D) && (parambrw.c <= this.G);
/*  531:     */   }
/*  532:     */   
/*  533:     */   private boolean c(brw parambrw)
/*  534:     */   {
/*  535: 645 */     if (parambrw == null) {
/*  536: 646 */       return false;
/*  537:     */     }
/*  538: 648 */     return (parambrw.a >= this.B) && (parambrw.a <= this.E) && (parambrw.b >= this.C) && (parambrw.b <= this.F);
/*  539:     */   }
/*  540:     */   
/*  541:     */   public void a(aqu paramaqu, dt paramdt, aqo paramaqo) {}
/*  542:     */   
/*  543:     */   public aql k()
/*  544:     */   {
/*  545: 655 */     return aql.a;
/*  546:     */   }
/*  547:     */   
/*  548:     */   public boolean a(aqu paramaqu, dt paramdt, ej paramej, amj paramamj)
/*  549:     */   {
/*  550: 659 */     return a(paramaqu, paramdt, paramej);
/*  551:     */   }
/*  552:     */   
/*  553:     */   public boolean a(aqu paramaqu, dt paramdt, ej paramej)
/*  554:     */   {
/*  555: 663 */     return c(paramaqu, paramdt);
/*  556:     */   }
/*  557:     */   
/*  558:     */   public boolean c(aqu paramaqu, dt paramdt)
/*  559:     */   {
/*  560: 667 */     return paramaqu.p(paramdt).c().J.j();
/*  561:     */   }
/*  562:     */   
/*  563:     */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  564:     */   {
/*  565: 671 */     return false;
/*  566:     */   }
/*  567:     */   
/*  568:     */   public void a(aqu paramaqu, dt paramdt, wv paramwv) {}
/*  569:     */   
/*  570:     */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  571:     */   {
/*  572: 678 */     return a(paramInt);
/*  573:     */   }
/*  574:     */   
/*  575:     */   public void a(aqu paramaqu, dt paramdt, ahd paramahd) {}
/*  576:     */   
/*  577:     */   public brw a(aqu paramaqu, dt paramdt, wv paramwv, brw parambrw)
/*  578:     */   {
/*  579: 688 */     return parambrw;
/*  580:     */   }
/*  581:     */   
/*  582:     */   public void a(ard paramard, dt paramdt) {}
/*  583:     */   
/*  584:     */   public final double z()
/*  585:     */   {
/*  586: 695 */     return this.B;
/*  587:     */   }
/*  588:     */   
/*  589:     */   public final double A()
/*  590:     */   {
/*  591: 699 */     return this.E;
/*  592:     */   }
/*  593:     */   
/*  594:     */   public final double B()
/*  595:     */   {
/*  596: 703 */     return this.C;
/*  597:     */   }
/*  598:     */   
/*  599:     */   public final double C()
/*  600:     */   {
/*  601: 707 */     return this.F;
/*  602:     */   }
/*  603:     */   
/*  604:     */   public final double D()
/*  605:     */   {
/*  606: 711 */     return this.D;
/*  607:     */   }
/*  608:     */   
/*  609:     */   public final double E()
/*  610:     */   {
/*  611: 715 */     return this.G;
/*  612:     */   }
/*  613:     */   
/*  614:     */   public int F()
/*  615:     */   {
/*  616: 719 */     return 16777215;
/*  617:     */   }
/*  618:     */   
/*  619:     */   public int h(bec parambec)
/*  620:     */   {
/*  621: 723 */     return 16777215;
/*  622:     */   }
/*  623:     */   
/*  624:     */   public int a(ard paramard, dt paramdt, int paramInt)
/*  625:     */   {
/*  626: 727 */     return 16777215;
/*  627:     */   }
/*  628:     */   
/*  629:     */   public final int d(ard paramard, dt paramdt)
/*  630:     */   {
/*  631: 731 */     return a(paramard, paramdt, 0);
/*  632:     */   }
/*  633:     */   
/*  634:     */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/*  635:     */   {
/*  636: 735 */     return 0;
/*  637:     */   }
/*  638:     */   
/*  639:     */   public boolean g()
/*  640:     */   {
/*  641: 739 */     return false;
/*  642:     */   }
/*  643:     */   
/*  644:     */   public void a(aqu paramaqu, dt paramdt, bec parambec, wv paramwv) {}
/*  645:     */   
/*  646:     */   public int b(ard paramard, dt paramdt, bec parambec, ej paramej)
/*  647:     */   {
/*  648: 746 */     return 0;
/*  649:     */   }
/*  650:     */   
/*  651:     */   public void h() {}
/*  652:     */   
/*  653:     */   public void a(aqu paramaqu, ahd paramahd, dt paramdt, bec parambec, bcm parambcm)
/*  654:     */   {
/*  655: 753 */     paramahd.b(ty.H[a(this)]);
/*  656: 754 */     paramahd.a(0.025F);
/*  657: 756 */     if ((G()) && (aph.e(paramahd)))
/*  658:     */     {
/*  659: 757 */       amj localamj = i(parambec);
/*  660: 758 */       if (localamj != null) {
/*  661: 759 */         a(paramaqu, paramdt, localamj);
/*  662:     */       }
/*  663:     */     }
/*  664:     */     else
/*  665:     */     {
/*  666: 762 */       int i1 = aph.f(paramahd);
/*  667: 763 */       b(paramaqu, paramdt, parambec, i1);
/*  668:     */     }
/*  669:     */   }
/*  670:     */   
/*  671:     */   protected boolean G()
/*  672:     */   {
/*  673: 768 */     return (d()) && (!this.A);
/*  674:     */   }
/*  675:     */   
/*  676:     */   protected amj i(bec parambec)
/*  677:     */   {
/*  678: 772 */     int i1 = 0;
/*  679: 773 */     alq localalq = alq.a(this);
/*  680: 774 */     if ((localalq != null) && (localalq.k())) {
/*  681: 775 */       i1 = c(parambec);
/*  682:     */     }
/*  683: 777 */     return new amj(localalq, 1, i1);
/*  684:     */   }
/*  685:     */   
/*  686:     */   public int a(int paramInt, Random paramRandom)
/*  687:     */   {
/*  688: 781 */     return a(paramRandom);
/*  689:     */   }
/*  690:     */   
/*  691:     */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj) {}
/*  692:     */   
/*  693:     */   public atr c(String paramString)
/*  694:     */   {
/*  695: 789 */     this.N = paramString;
/*  696: 790 */     return this;
/*  697:     */   }
/*  698:     */   
/*  699:     */   public String H()
/*  700:     */   {
/*  701: 794 */     return fi.a(a() + ".name");
/*  702:     */   }
/*  703:     */   
/*  704:     */   public String a()
/*  705:     */   {
/*  706: 799 */     return "tile." + this.N;
/*  707:     */   }
/*  708:     */   
/*  709:     */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, int paramInt1, int paramInt2)
/*  710:     */   {
/*  711: 803 */     return false;
/*  712:     */   }
/*  713:     */   
/*  714:     */   public boolean I()
/*  715:     */   {
/*  716: 807 */     return this.y;
/*  717:     */   }
/*  718:     */   
/*  719:     */   protected atr J()
/*  720:     */   {
/*  721: 811 */     this.y = false;
/*  722: 812 */     return this;
/*  723:     */   }
/*  724:     */   
/*  725:     */   public int i()
/*  726:     */   {
/*  727: 816 */     return this.J.m();
/*  728:     */   }
/*  729:     */   
/*  730:     */   public float f()
/*  731:     */   {
/*  732: 820 */     return s() ? 0.2F : 1.0F;
/*  733:     */   }
/*  734:     */   
/*  735:     */   public void a(aqu paramaqu, dt paramdt, wv paramwv, float paramFloat)
/*  736:     */   {
/*  737: 824 */     paramwv.e(paramFloat, 1.0F);
/*  738:     */   }
/*  739:     */   
/*  740:     */   public void a(aqu paramaqu, wv paramwv)
/*  741:     */   {
/*  742: 828 */     paramwv.w = 0.0D;
/*  743:     */   }
/*  744:     */   
/*  745:     */   public alq b(aqu paramaqu, dt paramdt)
/*  746:     */   {
/*  747: 832 */     return alq.a(this);
/*  748:     */   }
/*  749:     */   
/*  750:     */   public int j(aqu paramaqu, dt paramdt)
/*  751:     */   {
/*  752: 836 */     return a(paramaqu.p(paramdt));
/*  753:     */   }
/*  754:     */   
/*  755:     */   public void a(alq paramalq, akf paramakf, List paramList)
/*  756:     */   {
/*  757: 840 */     paramList.add(new amj(paramalq, 1, 0));
/*  758:     */   }
/*  759:     */   
/*  760:     */   public akf K()
/*  761:     */   {
/*  762: 844 */     return this.b;
/*  763:     */   }
/*  764:     */   
/*  765:     */   public atr a(akf paramakf)
/*  766:     */   {
/*  767: 848 */     this.b = paramakf;
/*  768: 849 */     return this;
/*  769:     */   }
/*  770:     */   
/*  771:     */   public void a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd) {}
/*  772:     */   
/*  773:     */   public void k(aqu paramaqu, dt paramdt) {}
/*  774:     */   
/*  775:     */   public boolean L()
/*  776:     */   {
/*  777: 859 */     return false;
/*  778:     */   }
/*  779:     */   
/*  780:     */   public boolean M()
/*  781:     */   {
/*  782: 863 */     return true;
/*  783:     */   }
/*  784:     */   
/*  785:     */   public boolean a(aqo paramaqo)
/*  786:     */   {
/*  787: 867 */     return true;
/*  788:     */   }
/*  789:     */   
/*  790:     */   public boolean b(atr paramatr)
/*  791:     */   {
/*  792: 871 */     return this == paramatr;
/*  793:     */   }
/*  794:     */   
/*  795:     */   public static boolean a(atr paramatr1, atr paramatr2)
/*  796:     */   {
/*  797: 875 */     if ((paramatr1 == null) || (paramatr2 == null)) {
/*  798: 876 */       return false;
/*  799:     */     }
/*  800: 878 */     if (paramatr1 == paramatr2) {
/*  801: 879 */       return true;
/*  802:     */     }
/*  803: 881 */     return paramatr1.b(paramatr2);
/*  804:     */   }
/*  805:     */   
/*  806:     */   public boolean N()
/*  807:     */   {
/*  808: 885 */     return false;
/*  809:     */   }
/*  810:     */   
/*  811:     */   public int l(aqu paramaqu, dt paramdt)
/*  812:     */   {
/*  813: 889 */     return 0;
/*  814:     */   }
/*  815:     */   
/*  816:     */   public bec b(bec parambec)
/*  817:     */   {
/*  818: 893 */     return parambec;
/*  819:     */   }
/*  820:     */   
/*  821:     */   protected bed e()
/*  822:     */   {
/*  823: 897 */     return new bed(this, new bex[0]);
/*  824:     */   }
/*  825:     */   
/*  826:     */   public bed O()
/*  827:     */   {
/*  828: 901 */     return this.L;
/*  829:     */   }
/*  830:     */   
/*  831:     */   protected final void j(bec parambec)
/*  832:     */   {
/*  833: 905 */     this.M = parambec;
/*  834:     */   }
/*  835:     */   
/*  836:     */   public final bec P()
/*  837:     */   {
/*  838: 909 */     return this.M;
/*  839:     */   }
/*  840:     */   
/*  841:     */   public atw Q()
/*  842:     */   {
/*  843: 913 */     return atw.a;
/*  844:     */   }
/*  845:     */   
/*  846:     */   public static void R()
/*  847:     */   {
/*  848: 924 */     a(0, a, new asy().c("air"));
/*  849: 925 */     a(1, "stone", new bba().c(1.5F).b(10.0F).a(i).c("stone"));
/*  850: 926 */     a(2, "grass", new awn().c(0.6F).a(h).c("grass"));
/*  851: 927 */     a(3, "dirt", new avc().c(0.5F).a(g).c("dirt"));
/*  852: 928 */     atr localatr1 = new atr(bof.e).c(2.0F).b(10.0F).a(i).c("stonebrick").a(akf.b);
/*  853: 929 */     a(4, "cobblestone", localatr1);
/*  854: 930 */     atr localatr2 = new ayw().c(2.0F).b(5.0F).a(f).c("wood");
/*  855: 931 */     a(5, "planks", localatr2);
/*  856: 932 */     a(6, "sapling", new baf().c(0.0F).a(h).c("sapling"));
/*  857: 933 */     a(7, "bedrock", new atr(bof.e).v().b(6000000.0F).a(i).c("bedrock").J().a(akf.b));
/*  858: 934 */     a(8, "flowing_water", new avn(bof.h).c(100.0F).e(3).c("water").J());
/*  859: 935 */     a(9, "water", new bax(bof.h).c(100.0F).e(3).c("water").J());
/*  860: 936 */     a(10, "flowing_lava", new avn(bof.i).c(100.0F).a(1.0F).c("lava").J());
/*  861: 937 */     a(11, "lava", new bax(bof.i).c(100.0F).a(1.0F).c("lava").J());
/*  862: 938 */     a(12, "sand", new bab().c(0.5F).a(m).c("sand"));
/*  863: 939 */     a(13, "gravel", new awo().c(0.6F).a(g).c("gravel"));
/*  864: 940 */     a(14, "gold_ore", new ayu().c(3.0F).b(5.0F).a(i).c("oreGold"));
/*  865: 941 */     a(15, "iron_ore", new ayu().c(3.0F).b(5.0F).a(i).c("oreIron"));
/*  866: 942 */     a(16, "coal_ore", new ayu().c(3.0F).b(5.0F).a(i).c("oreCoal"));
/*  867: 943 */     a(17, "log", new ayr().c("log"));
/*  868: 944 */     a(18, "leaves", new ayp().c("leaves"));
/*  869: 945 */     a(19, "sponge", new baq().c(0.6F).a(h).c("sponge"));
/*  870: 946 */     a(20, "glass", new awl(bof.s, false).c(0.3F).a(k).c("glass"));
/*  871: 947 */     a(21, "lapis_ore", new ayu().c(3.0F).b(5.0F).a(i).c("oreLapis"));
/*  872: 948 */     a(22, "lapis_block", new axq(boh.H).c(3.0F).b(5.0F).a(i).c("blockLapis").a(akf.b));
/*  873: 949 */     a(23, "dispenser", new ave().c(3.5F).a(i).c("dispenser"));
/*  874: 950 */     atr localatr3 = new bad().a(i).c(0.8F).c("sandStone");
/*  875: 951 */     a(24, "sandstone", localatr3);
/*  876: 952 */     a(25, "noteblock", new ayn().c(0.8F).c("musicBlock"));
/*  877: 953 */     a(26, "bed", new atp().a(f).c(0.2F).c("bed").J());
/*  878: 954 */     a(27, "golden_rail", new azc().c(0.7F).a(j).c("goldenRail"));
/*  879: 955 */     a(28, "detector_rail", new auy().c(0.7F).a(j).c("detectorRail"));
/*  880: 956 */     a(29, "sticky_piston", new bdq(true).c("pistonStickyBase"));
/*  881: 957 */     a(30, "web", new bcc().e(1).c(4.0F).c("web"));
/*  882: 958 */     a(31, "tallgrass", new bbh().c(0.0F).a(h).c("tallgrass"));
/*  883: 959 */     a(32, "deadbush", new auw().c(0.0F).a(h).c("deadbush"));
/*  884: 960 */     a(33, "piston", new bdq(false).c("pistonBase"));
/*  885: 961 */     a(34, "piston_head", new bds());
/*  886: 962 */     a(35, "wool", new aun(bof.n).c(0.8F).a(l).c("cloth"));
/*  887: 963 */     a(36, "piston_extension", new bdx());
/*  888: 964 */     a(37, "yellow_flower", new bch().c(0.0F).a(h).c("flower1"));
/*  889: 965 */     a(38, "red_flower", new azp().c(0.0F).a(h).c("flower2"));
/*  890: 966 */     atr localatr4 = new ayb().c(0.0F).a(h).a(0.125F).c("mushroom");
/*  891: 967 */     a(39, "brown_mushroom", localatr4);
/*  892: 968 */     atr localatr5 = new ayb().c(0.0F).a(h).c("mushroom");
/*  893: 969 */     a(40, "red_mushroom", localatr5);
/*  894: 970 */     a(41, "gold_block", new axq(boh.F).c(3.0F).b(10.0F).a(j).c("blockGold"));
/*  895: 971 */     a(42, "iron_block", new axq(boh.h).c(5.0F).b(10.0F).a(j).c("blockIron"));
/*  896: 972 */     a(43, "double_stone_slab", new awh().c(2.0F).b(10.0F).a(i).c("stoneSlab"));
/*  897: 973 */     a(44, "stone_slab", new aws().c(2.0F).b(10.0F).a(i).c("stoneSlab"));
/*  898: 974 */     atr localatr6 = new atr(bof.e).c(2.0F).b(10.0F).a(i).c("brick").a(akf.b);
/*  899: 975 */     a(45, "brick_block", localatr6);
/*  900: 976 */     a(46, "tnt", new bbk().c(0.0F).a(h).c("tnt"));
/*  901: 977 */     a(47, "bookshelf", new aua().c(1.5F).a(f).c("bookshelf"));
/*  902: 978 */     a(48, "mossy_cobblestone", new atr(bof.e).c(2.0F).b(10.0F).a(i).c("stoneMoss").a(akf.b));
/*  903: 979 */     a(49, "obsidian", new ayo().c(50.0F).b(2000.0F).a(i).c("obsidian"));
/*  904: 980 */     a(50, "torch", new bbl().c(0.0F).a(0.9375F).a(f).c("torch"));
/*  905: 981 */     a(51, "fire", new avx().c(0.0F).a(1.0F).a(l).c("fire").J());
/*  906: 982 */     a(52, "mob_spawner", new axr().c(5.0F).a(j).c("mobSpawner").J());
/*  907: 983 */     a(53, "oak_stairs", new bat(localatr2.P().a(ayw.a, ayx.a)).c("stairsWood"));
/*  908: 984 */     a(54, "chest", new auj(0).c(2.5F).a(f).c("chest"));
/*  909: 985 */     a(55, "redstone_wire", new azt().c(0.0F).a(e).c("redstoneDust").J());
/*  910: 986 */     a(56, "diamond_ore", new ayu().c(3.0F).b(5.0F).a(i).c("oreDiamond"));
/*  911: 987 */     a(57, "diamond_block", new axq(boh.G).c(5.0F).b(10.0F).a(j).c("blockDiamond"));
/*  912: 988 */     a(58, "crafting_table", new aus().c(2.5F).a(f).c("workbench"));
/*  913: 989 */     a(59, "wheat", new auu().c("crops"));
/*  914: 990 */     atr localatr7 = new avu().c(0.6F).a(g).c("farmland");
/*  915: 991 */     a(60, "farmland", localatr7);
/*  916: 992 */     a(61, "furnace", new awj(false).c(3.5F).a(i).c("furnace").a(akf.c));
/*  917: 993 */     a(62, "lit_furnace", new awj(true).c(3.5F).a(i).a(0.875F).c("furnace"));
/*  918: 994 */     a(63, "standing_sign", new baw().c(1.0F).a(f).c("sign").J());
/*  919: 995 */     a(64, "wooden_door", new avf(bof.d).c(3.0F).a(f).c("doorOak").J());
/*  920: 996 */     a(65, "ladder", new axe().c(0.4F).a(o).c("ladder"));
/*  921: 997 */     a(66, "rail", new azo().c(0.7F).a(j).c("rail"));
/*  922: 998 */     a(67, "stone_stairs", new bat(localatr1.P()).c("stairsStone"));
/*  923: 999 */     a(68, "wall_sign", new bbz().c(1.0F).a(f).c("sign").J());
/*  924:1000 */     a(69, "lever", new axi().c(0.5F).a(f).c("lever"));
/*  925:1001 */     a(70, "stone_pressure_plate", new azf(bof.e, azh.b).c(0.5F).a(i).c("pressurePlateStone"));
/*  926:1002 */     a(71, "iron_door", new avf(bof.f).c(5.0F).a(j).c("doorIron").J());
/*  927:1003 */     a(72, "wooden_pressure_plate", new azf(bof.d, azh.a).c(0.5F).a(f).c("pressurePlateWood"));
/*  928:1004 */     a(73, "redstone_ore", new azs(false).c(3.0F).b(5.0F).a(i).c("oreRedstone").a(akf.b));
/*  929:1005 */     a(74, "lit_redstone_ore", new azs(true).a(0.625F).c(3.0F).b(5.0F).a(i).c("oreRedstone"));
/*  930:1006 */     a(75, "unlit_redstone_torch", new azw(false).c(0.0F).a(f).c("notGate"));
/*  931:1007 */     a(76, "redstone_torch", new azw(true).c(0.0F).a(0.5F).a(f).c("notGate").a(akf.d));
/*  932:1008 */     a(77, "stone_button", new bbe().c(0.5F).a(i).c("button"));
/*  933:1009 */     a(78, "snow_layer", new bao().c(0.1F).a(n).c("snow").e(0));
/*  934:1010 */     a(79, "ice", new axb().c(0.5F).e(3).a(k).c("ice"));
/*  935:1011 */     a(80, "snow", new ban().c(0.2F).a(n).c("snow"));
/*  936:1012 */     a(81, "cactus", new auf().c(0.4F).a(l).c("cactus"));
/*  937:1013 */     a(82, "clay", new auk().c(0.6F).a(g).c("clay"));
/*  938:1014 */     a(83, "reeds", new azy().c(0.0F).a(h).c("reeds").J());
/*  939:1015 */     a(84, "jukebox", new axc().c(2.0F).b(10.0F).a(i).c("jukebox"));
/*  940:1016 */     a(85, "fence", new avv(bof.d).c(2.0F).b(5.0F).a(f).c("fence"));
/*  941:1017 */     atr localatr8 = new azk().c(1.0F).a(f).c("pumpkin");
/*  942:1018 */     a(86, "pumpkin", localatr8);
/*  943:1019 */     a(87, "netherrack", new ayf().c(0.4F).a(i).c("hellrock"));
/*  944:1020 */     a(88, "soul_sand", new bap().c(0.5F).a(m).c("hellsand"));
/*  945:1021 */     a(89, "glowstone", new awm(bof.s).c(0.3F).a(k).a(1.0F).c("lightgem"));
/*  946:1022 */     a(90, "portal", new ayy().c(-1.0F).a(k).a(0.75F).c("portal"));
/*  947:1023 */     a(91, "lit_pumpkin", new azk().c(1.0F).a(f).a(1.0F).c("litpumpkin"));
/*  948:1024 */     a(92, "cake", new aug().c(0.5F).a(l).c("cake").J());
/*  949:1025 */     a(93, "unpowered_repeater", new azz(false).c(0.0F).a(f).c("diode").J());
/*  950:1026 */     a(94, "powered_repeater", new azz(true).c(0.0F).a(f).c("diode").J());
/*  951:1027 */     a(95, "stained_glass", new bar(bof.s).c(0.3F).a(k).c("stainedGlass"));
/*  952:1028 */     a(96, "trapdoor", new bbp(bof.d).c(3.0F).a(f).c("trapdoor").J());
/*  953:1029 */     a(97, "monster_egg", new axs().c(0.75F).c("monsterStoneEgg"));
/*  954:1030 */     atr localatr9 = new bbc().c(1.5F).b(10.0F).a(i).c("stonebricksmooth");
/*  955:1031 */     a(98, "stonebrick", localatr9);
/*  956:1032 */     a(99, "brown_mushroom_block", new awz(bof.d, localatr4).c(0.2F).a(f).c("mushroom"));
/*  957:1033 */     a(100, "red_mushroom_block", new awz(bof.d, localatr5).c(0.2F).a(f).c("mushroom"));
/*  958:1034 */     a(101, "iron_bars", new bbj(bof.f, true).c(5.0F).b(10.0F).a(j).c("fenceIron"));
/*  959:1035 */     a(102, "glass_pane", new bbj(bof.s, false).c(0.3F).a(k).c("thinGlass"));
/*  960:1036 */     atr localatr10 = new axp().c(1.0F).a(f).c("melon");
/*  961:1037 */     a(103, "melon_block", localatr10);
/*  962:1038 */     a(104, "pumpkin_stem", new bay(localatr8).c(0.0F).a(f).c("pumpkinStem"));
/*  963:1039 */     a(105, "melon_stem", new bay(localatr10).c(0.0F).a(f).c("pumpkinStem"));
/*  964:1040 */     a(106, "vine", new bbv().c(0.2F).a(h).c("vine"));
/*  965:1041 */     a(107, "fence_gate", new avw().c(2.0F).b(5.0F).a(f).c("fenceGate"));
/*  966:1042 */     a(108, "brick_stairs", new bat(localatr6.P()).c("stairsBrick"));
/*  967:1043 */     a(109, "stone_brick_stairs", new bat(localatr9.P().a(bbc.a, bbd.a)).c("stairsStoneBrickSmooth"));
/*  968:1044 */     a(110, "mycelium", new ayc().c(0.6F).a(h).c("mycel"));
/*  969:1045 */     a(111, "waterlily", new bcb().c(0.0F).a(h).c("waterlily"));
/*  970:1046 */     atr localatr11 = new ayd().c(2.0F).b(10.0F).a(i).c("netherBrick").a(akf.b);
/*  971:1047 */     a(112, "nether_brick", localatr11);
/*  972:1048 */     a(113, "nether_brick_fence", new avv(bof.e).c(2.0F).b(10.0F).a(i).c("netherFence"));
/*  973:1049 */     a(114, "nether_brick_stairs", new bat(localatr11.P()).c("stairsNetherBrick"));
/*  974:1050 */     a(115, "nether_wart", new aye().c("netherStalk"));
/*  975:1051 */     a(116, "enchanting_table", new avo().c(5.0F).b(2000.0F).c("enchantmentTable"));
/*  976:1052 */     a(117, "brewing_stand", new aub().c(0.5F).a(0.125F).c("brewingStand"));
/*  977:1053 */     a(118, "cauldron", new aui().c(2.0F).c("cauldron"));
/*  978:1054 */     a(119, "end_portal", new avp(bof.E).c(-1.0F).b(6000000.0F));
/*  979:1055 */     a(120, "end_portal_frame", new avq().a(k).a(0.125F).c(-1.0F).c("endPortalFrame").b(6000000.0F).a(akf.c));
/*  980:1056 */     a(121, "end_stone", new atr(bof.e).c(3.0F).b(15.0F).a(i).c("whiteStone").a(akf.b));
/*  981:1057 */     a(122, "dragon_egg", new avl().c(3.0F).b(15.0F).a(i).a(0.125F).c("dragonEgg"));
/*  982:1058 */     a(123, "redstone_lamp", new azv(false).c(0.3F).a(k).c("redstoneLight").a(akf.d));
/*  983:1059 */     a(124, "lit_redstone_lamp", new azv(true).c(0.3F).a(k).c("redstoneLight"));
/*  984:1060 */     a(125, "double_wooden_slab", new awi().c(2.0F).b(5.0F).a(f).c("woodSlab"));
/*  985:1061 */     a(126, "wooden_slab", new awu().c(2.0F).b(5.0F).a(f).c("woodSlab"));
/*  986:1062 */     a(127, "cocoa", new aul().c(0.2F).b(5.0F).a(f).c("cocoa"));
/*  987:1063 */     a(128, "sandstone_stairs", new bat(localatr3.P().a(bad.a, bae.c)).c("stairsSandStone"));
/*  988:1064 */     a(129, "emerald_ore", new ayu().c(3.0F).b(5.0F).a(i).c("oreEmerald"));
/*  989:1065 */     a(130, "ender_chest", new avr().c(22.5F).b(1000.0F).a(i).c("enderChest").a(0.5F));
/*  990:1066 */     a(131, "tripwire_hook", new bbt().c("tripWireSource"));
/*  991:1067 */     a(132, "tripwire", new bbs().c("tripWire"));
/*  992:1068 */     a(133, "emerald_block", new axq(boh.I).c(5.0F).b(10.0F).a(j).c("blockEmerald"));
/*  993:1069 */     a(134, "spruce_stairs", new bat(localatr2.P().a(ayw.a, ayx.b)).c("stairsWoodSpruce"));
/*  994:1070 */     a(135, "birch_stairs", new bat(localatr2.P().a(ayw.a, ayx.c)).c("stairsWoodBirch"));
/*  995:1071 */     a(136, "jungle_stairs", new bat(localatr2.P().a(ayw.a, ayx.d)).c("stairsWoodJungle"));
/*  996:1072 */     a(137, "command_block", new auo().v().b(6000000.0F).c("commandBlock"));
/*  997:1073 */     a(138, "beacon", new atm().c("beacon").a(1.0F));
/*  998:1074 */     a(139, "cobblestone_wall", new bbx(localatr1).c("cobbleWall"));
/*  999:1075 */     a(140, "flower_pot", new awd().c(0.0F).a(e).c("flowerPot"));
/* 1000:1076 */     a(141, "carrots", new auh().c("carrots"));
/* 1001:1077 */     a(142, "potatoes", new aza().c("potatoes"));
/* 1002:1078 */     a(143, "wooden_button", new bce().c(0.5F).a(f).c("button"));
/* 1003:1079 */     a(144, "skull", new baj().c(1.0F).a(i).c("skull"));
/* 1004:1080 */     a(145, "anvil", new asz().c(5.0F).a(p).b(2000.0F).c("anvil"));
/* 1005:1081 */     a(146, "trapped_chest", new auj(1).c(2.5F).a(f).c("chestTrap"));
/* 1006:1082 */     a(147, "light_weighted_pressure_plate", new bcd("gold_block", bof.f, 15).c(0.5F).a(f).c("weightedPlate_light"));
/* 1007:1083 */     a(148, "heavy_weighted_pressure_plate", new bcd("iron_block", bof.f, 150).c(0.5F).a(f).c("weightedPlate_heavy"));
/* 1008:1084 */     a(149, "unpowered_comparator", new aup(false).c(0.0F).a(f).c("comparator").J());
/* 1009:1085 */     a(150, "powered_comparator", new aup(true).c(0.0F).a(0.625F).a(f).c("comparator").J());
/* 1010:1086 */     a(151, "daylight_detector", new auv(false));
/* 1011:1087 */     a(152, "redstone_block", new azb(boh.f).c(5.0F).b(10.0F).a(j).c("blockRedstone"));
/* 1012:1088 */     a(153, "quartz_ore", new ayu().c(3.0F).b(5.0F).a(i).c("netherquartz"));
/* 1013:1089 */     a(154, "hopper", new awx().c(3.0F).b(8.0F).a(j).c("hopper"));
/* 1014:1090 */     atr localatr12 = new azl().a(i).c(0.8F).c("quartzBlock");
/* 1015:1091 */     a(155, "quartz_block", localatr12);
/* 1016:1092 */     a(156, "quartz_stairs", new bat(localatr12.P().a(azl.a, azn.a)).c("stairsQuartz"));
/* 1017:1093 */     a(157, "activator_rail", new azc().c(0.7F).a(j).c("activatorRail"));
/* 1018:1094 */     a(158, "dropper", new avm().c(3.5F).a(i).c("dropper"));
/* 1019:1095 */     a(159, "stained_hardened_clay", new aun(bof.e).c(1.25F).b(7.0F).a(i).c("clayHardenedStained"));
/* 1020:1096 */     a(160, "stained_glass_pane", new bas().c(0.3F).a(k).c("thinStainedGlass"));
/* 1021:1097 */     a(161, "leaves2", new ayg().c("leaves"));
/* 1022:1098 */     a(162, "log2", new ayi().c("log"));
/* 1023:1099 */     a(163, "acacia_stairs", new bat(localatr2.P().a(ayw.a, ayx.e)).c("stairsWoodAcacia"));
/* 1024:1100 */     a(164, "dark_oak_stairs", new bat(localatr2.P().a(ayw.a, ayx.f)).c("stairsWoodDarkOak"));
/* 1025:1101 */     a(165, "slime", new bam().c("slime").a(q));
/* 1026:1102 */     a(166, "barrier", new atf().c("barrier"));
/* 1027:1103 */     a(167, "iron_trapdoor", new bbp(bof.f).c(5.0F).a(j).c("ironTrapdoor").J());
/* 1028:1104 */     a(168, "prismarine", new azi().c(1.5F).b(10.0F).a(i).c("prismarine"));
/* 1029:1105 */     a(169, "sea_lantern", new bah(bof.s).c(0.3F).a(k).a(1.0F).c("seaLantern"));
/* 1030:1106 */     a(170, "hay_block", new aww().c(0.5F).a(h).c("hayBlock").a(akf.b));
/* 1031:1107 */     a(171, "carpet", new bcg().c(0.1F).a(l).c("woolCarpet").e(0));
/* 1032:1108 */     a(172, "hardened_clay", new awv().c(1.25F).b(7.0F).a(i).c("clayHardened"));
/* 1033:1109 */     a(173, "coal_block", new atr(bof.e).c(5.0F).b(10.0F).a(i).c("blockCoal").a(akf.b));
/* 1034:1110 */     a(174, "packed_ice", new ayv().c(0.5F).a(k).c("icePacked"));
/* 1035:1111 */     a(175, "double_plant", new avi());
/* 1036:1112 */     a(176, "standing_banner", new atd().c(1.0F).a(f).c("banner").J());
/* 1037:1113 */     a(177, "wall_banner", new ate().c(1.0F).a(f).c("banner").J());
/* 1038:1114 */     a(178, "daylight_detector_inverted", new auv(true));
/* 1039:1115 */     atr localatr13 = new azq().a(i).c(0.8F).c("redSandStone");
/* 1040:1116 */     a(179, "red_sandstone", localatr13);
/* 1041:1117 */     a(180, "red_sandstone_stairs", new bat(localatr13.P().a(azq.a, azr.c)).c("stairsRedSandStone"));
/* 1042:1118 */     a(181, "double_stone_slab2", new awg().c(2.0F).b(10.0F).a(i).c("stoneSlab2"));
/* 1043:1119 */     a(182, "stone_slab2", new awp().c(2.0F).b(10.0F).a(i).c("stoneSlab2"));
/* 1044:1120 */     a(183, "spruce_fence_gate", new avw().c(2.0F).b(5.0F).a(f).c("spruceFenceGate"));
/* 1045:1121 */     a(184, "birch_fence_gate", new avw().c(2.0F).b(5.0F).a(f).c("birchFenceGate"));
/* 1046:1122 */     a(185, "jungle_fence_gate", new avw().c(2.0F).b(5.0F).a(f).c("jungleFenceGate"));
/* 1047:1123 */     a(186, "dark_oak_fence_gate", new avw().c(2.0F).b(5.0F).a(f).c("darkOakFenceGate"));
/* 1048:1124 */     a(187, "acacia_fence_gate", new avw().c(2.0F).b(5.0F).a(f).c("acaciaFenceGate"));
/* 1049:1125 */     a(188, "spruce_fence", new avv(bof.d).c(2.0F).b(5.0F).a(f).c("spruceFence"));
/* 1050:1126 */     a(189, "birch_fence", new avv(bof.d).c(2.0F).b(5.0F).a(f).c("birchFence"));
/* 1051:1127 */     a(190, "jungle_fence", new avv(bof.d).c(2.0F).b(5.0F).a(f).c("jungleFence"));
/* 1052:1128 */     a(191, "dark_oak_fence", new avv(bof.d).c(2.0F).b(5.0F).a(f).c("darkOakFence"));
/* 1053:1129 */     a(192, "acacia_fence", new avv(bof.d).c(2.0F).b(5.0F).a(f).c("acaciaFence"));
/* 1054:1130 */     a(193, "spruce_door", new avf(bof.d).c(3.0F).a(f).c("doorSpruce").J());
/* 1055:1131 */     a(194, "birch_door", new avf(bof.d).c(3.0F).a(f).c("doorBirch").J());
/* 1056:1132 */     a(195, "jungle_door", new avf(bof.d).c(3.0F).a(f).c("doorJungle").J());
/* 1057:1133 */     a(196, "acacia_door", new avf(bof.d).c(3.0F).a(f).c("doorAcacia").J());
/* 1058:1134 */     a(197, "dark_oak_door", new avf(bof.d).c(3.0F).a(f).c("doorDarkOak").J());
/* 1059:     */     
/* 1060:1136 */     c.a();
/* 1061:1139 */     for (Iterator localIterator1 = c.iterator(); localIterator1.hasNext();)
/* 1062:     */     {
/* 1063:1139 */       localatr14 = (atr)localIterator1.next();
/* 1064:1140 */       if (localatr14.J == bof.a)
/* 1065:     */       {
/* 1066:1141 */         localatr14.v = false;
/* 1067:     */       }
/* 1068:     */       else
/* 1069:     */       {
/* 1070:1146 */         boolean bool1 = false;
/* 1071:1147 */         boolean bool2 = localatr14 instanceof bat;
/* 1072:1148 */         boolean bool3 = localatr14 instanceof awq;
/* 1073:1149 */         int i2 = localatr14 == localatr7 ? 1 : 0;
/* 1074:1150 */         boolean bool4 = localatr14.t;
/* 1075:1151 */         int i3 = localatr14.s == 0 ? 1 : 0;
/* 1076:1152 */         if ((bool2) || (bool3) || (i2 != 0) || (bool4) || (i3 != 0)) {
/* 1077:1153 */           bool1 = true;
/* 1078:     */         }
/* 1079:1156 */         localatr14.v = bool1;
/* 1080:     */       }
/* 1081:     */     }
/* 1082:     */     atr localatr14;
/* 1083:1159 */     for (localIterator1 = c.iterator(); localIterator1.hasNext();)
/* 1084:     */     {
/* 1085:1159 */       localatr14 = (atr)localIterator1.next();
/* 1086:1160 */       for (bec localbec : localatr14.O().a())
/* 1087:     */       {
/* 1088:1161 */         int i1 = c.b(localatr14) << 4 | localatr14.c(localbec);
/* 1089:1162 */         d.a(localbec, i1);
/* 1090:     */       }
/* 1091:     */     }
/* 1092:     */   }
/* 1093:     */   
/* 1094:     */   private static void a(int paramInt, oa paramoa, atr paramatr)
/* 1095:     */   {
/* 1096:1168 */     c.a(paramInt, paramoa, paramatr);
/* 1097:     */   }
/* 1098:     */   
/* 1099:     */   private static void a(int paramInt, String paramString, atr paramatr)
/* 1100:     */   {
/* 1101:1172 */     a(paramInt, new oa(paramString), paramatr);
/* 1102:     */   }
/* 1103:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     atr
 * JD-Core Version:    0.7.0.1
 */