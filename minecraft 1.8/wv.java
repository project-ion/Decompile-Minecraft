/*    1:     */ import java.util.Iterator;
/*    2:     */ import java.util.List;
/*    3:     */ import java.util.Random;
/*    4:     */ import java.util.UUID;
/*    5:     */ import net.minecraft.server.MinecraftServer;
/*    6:     */ 
/*    7:     */ public abstract class wv
/*    8:     */   implements ae
/*    9:     */ {
/*   10:  48 */   private static final brt a = new brt(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*   11:     */   private static int b;
/*   12:  51 */   private int c = b++;
/*   13:  53 */   public double j = 1.0D;
/*   14:     */   public boolean k;
/*   15:     */   public wv l;
/*   16:     */   public wv m;
/*   17:     */   public boolean n;
/*   18:     */   public aqu o;
/*   19:     */   public double p;
/*   20:     */   public double q;
/*   21:     */   public double r;
/*   22:     */   public double s;
/*   23:     */   public double t;
/*   24:     */   public double u;
/*   25:     */   public double v;
/*   26:     */   public double w;
/*   27:     */   public double x;
/*   28:     */   public float y;
/*   29:     */   public float z;
/*   30:     */   public float A;
/*   31:     */   public float B;
/*   32:  66 */   private brt f = a;
/*   33:     */   public boolean C;
/*   34:     */   public boolean D;
/*   35:     */   public boolean E;
/*   36:     */   public boolean F;
/*   37:     */   public boolean G;
/*   38:     */   protected boolean H;
/*   39:     */   private boolean g;
/*   40:     */   public boolean I;
/*   41:  76 */   public float J = 0.6F;
/*   42:  77 */   public float K = 1.8F;
/*   43:     */   public float L;
/*   44:     */   public float M;
/*   45:     */   public float N;
/*   46:     */   public float O;
/*   47:  83 */   private int h = 1;
/*   48:     */   public double P;
/*   49:     */   public double Q;
/*   50:     */   public double R;
/*   51:     */   public float S;
/*   52:     */   public boolean T;
/*   53:     */   public float U;
/*   54:  89 */   protected Random V = new Random();
/*   55:     */   public int W;
/*   56:  91 */   public int X = 1;
/*   57:     */   private int i;
/*   58:     */   protected boolean Y;
/*   59:     */   public int Z;
/*   60:  98 */   protected boolean aa = true;
/*   61:     */   protected boolean ab;
/*   62:     */   protected xv ac;
/*   63:     */   private double ap;
/*   64:     */   private double aq;
/*   65:     */   public boolean ad;
/*   66:     */   public int ae;
/*   67:     */   public int af;
/*   68:     */   public int ag;
/*   69:     */   public int bU;
/*   70:     */   public int bV;
/*   71:     */   public int bW;
/*   72:     */   public boolean ah;
/*   73:     */   public boolean ai;
/*   74:     */   public int aj;
/*   75:     */   protected boolean ak;
/*   76:     */   protected int al;
/*   77:     */   public int am;
/*   78:     */   protected int an;
/*   79:     */   private boolean ar;
/*   80: 130 */   protected UUID ao = uv.a(this.V);
/*   81: 131 */   private final af as = new af();
/*   82:     */   
/*   83:     */   public int F()
/*   84:     */   {
/*   85: 134 */     return this.c;
/*   86:     */   }
/*   87:     */   
/*   88:     */   public void d(int paramInt)
/*   89:     */   {
/*   90: 138 */     this.c = paramInt;
/*   91:     */   }
/*   92:     */   
/*   93:     */   public void G()
/*   94:     */   {
/*   95: 142 */     J();
/*   96:     */   }
/*   97:     */   
/*   98:     */   public wv(aqu paramaqu)
/*   99:     */   {
/*  100: 146 */     this.o = paramaqu;
/*  101: 147 */     b(0.0D, 0.0D, 0.0D);
/*  102: 149 */     if (paramaqu != null) {
/*  103: 150 */       this.am = paramaqu.t.q();
/*  104:     */     }
/*  105: 153 */     this.ac = new xv(this);
/*  106: 154 */     this.ac.a(0, Byte.valueOf((byte)0));
/*  107: 155 */     this.ac.a(1, Short.valueOf((short)300));
/*  108: 156 */     this.ac.a(3, Byte.valueOf((byte)0));
/*  109: 157 */     this.ac.a(2, "");
/*  110: 158 */     this.ac.a(4, Byte.valueOf((byte)0));
/*  111: 159 */     h();
/*  112:     */   }
/*  113:     */   
/*  114:     */   protected abstract void h();
/*  115:     */   
/*  116:     */   public xv H()
/*  117:     */   {
/*  118: 165 */     return this.ac;
/*  119:     */   }
/*  120:     */   
/*  121:     */   public boolean equals(Object paramObject)
/*  122:     */   {
/*  123: 170 */     if ((paramObject instanceof wv)) {
/*  124: 171 */       return ((wv)paramObject).c == this.c;
/*  125:     */     }
/*  126: 173 */     return false;
/*  127:     */   }
/*  128:     */   
/*  129:     */   public int hashCode()
/*  130:     */   {
/*  131: 178 */     return this.c;
/*  132:     */   }
/*  133:     */   
/*  134:     */   protected void I()
/*  135:     */   {
/*  136: 182 */     if (this.o == null) {
/*  137: 183 */       return;
/*  138:     */     }
/*  139: 185 */     while ((this.t > 0.0D) && (this.t < 256.0D))
/*  140:     */     {
/*  141: 186 */       b(this.s, this.t, this.u);
/*  142: 187 */       if (this.o.a(this, aQ()).isEmpty()) {
/*  143:     */         break;
/*  144:     */       }
/*  145: 190 */       this.t += 1.0D;
/*  146:     */     }
/*  147: 193 */     this.v = (this.w = this.x = 0.0D);
/*  148: 194 */     this.z = 0.0F;
/*  149:     */   }
/*  150:     */   
/*  151:     */   public void J()
/*  152:     */   {
/*  153: 198 */     this.I = true;
/*  154:     */   }
/*  155:     */   
/*  156:     */   protected void a(float paramFloat1, float paramFloat2)
/*  157:     */   {
/*  158: 202 */     if ((paramFloat1 != this.J) || (paramFloat2 != this.K))
/*  159:     */     {
/*  160: 203 */       float f1 = this.J;
/*  161:     */       
/*  162: 205 */       this.J = paramFloat1;
/*  163: 206 */       this.K = paramFloat2;
/*  164: 207 */       a(new brt(aQ().a, aQ().b, aQ().c, aQ().a + this.J, aQ().b + this.K, aQ().c + this.J));
/*  165: 209 */       if ((this.J > f1) && (!this.aa) && (!this.o.D)) {
/*  166: 210 */         d(f1 - this.J, 0.0D, f1 - this.J);
/*  167:     */       }
/*  168:     */     }
/*  169:     */   }
/*  170:     */   
/*  171:     */   protected void b(float paramFloat1, float paramFloat2)
/*  172:     */   {
/*  173: 230 */     this.y = (paramFloat1 % 360.0F);
/*  174: 231 */     this.z = (paramFloat2 % 360.0F);
/*  175:     */   }
/*  176:     */   
/*  177:     */   public void b(double paramDouble1, double paramDouble2, double paramDouble3)
/*  178:     */   {
/*  179: 236 */     this.s = paramDouble1;
/*  180: 237 */     this.t = paramDouble2;
/*  181: 238 */     this.u = paramDouble3;
/*  182: 239 */     float f1 = this.J / 2.0F;
/*  183: 240 */     float f2 = this.K;
/*  184: 241 */     a(new brt(paramDouble1 - f1, paramDouble2, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 + f2, paramDouble3 + f1));
/*  185:     */   }
/*  186:     */   
/*  187:     */   public void c(float paramFloat1, float paramFloat2)
/*  188:     */   {
/*  189: 245 */     float f1 = this.z;
/*  190: 246 */     float f2 = this.y;
/*  191:     */     
/*  192: 248 */     this.y = ((float)(this.y + paramFloat1 * 0.15D));
/*  193: 249 */     this.z = ((float)(this.z - paramFloat2 * 0.15D));
/*  194: 250 */     this.z = uv.a(this.z, -90.0F, 90.0F);
/*  195:     */     
/*  196: 252 */     this.B += this.z - f1;
/*  197: 253 */     this.A += this.y - f2;
/*  198:     */   }
/*  199:     */   
/*  200:     */   public void s_()
/*  201:     */   {
/*  202: 263 */     K();
/*  203:     */   }
/*  204:     */   
/*  205:     */   public void K()
/*  206:     */   {
/*  207: 267 */     this.o.B.a("entityBaseTick");
/*  208: 269 */     if ((this.m != null) && (this.m.I)) {
/*  209: 270 */       this.m = null;
/*  210:     */     }
/*  211: 273 */     this.L = this.M;
/*  212: 274 */     this.p = this.s;
/*  213: 275 */     this.q = this.t;
/*  214: 276 */     this.r = this.u;
/*  215: 277 */     this.B = this.z;
/*  216: 278 */     this.A = this.y;
/*  217: 280 */     if ((!this.o.D) && ((this.o instanceof qt)))
/*  218:     */     {
/*  219: 281 */       this.o.B.a("portal");
/*  220: 282 */       MinecraftServer localMinecraftServer = ((qt)this.o).r();
/*  221: 283 */       int i1 = L();
/*  222: 285 */       if (this.ak)
/*  223:     */       {
/*  224: 286 */         if (localMinecraftServer.A())
/*  225:     */         {
/*  226: 287 */           if ((this.m == null) && 
/*  227: 288 */             (this.al++ >= i1))
/*  228:     */           {
/*  229: 289 */             this.al = i1;
/*  230: 290 */             this.aj = ar();
/*  231:     */             int i2;
/*  232: 294 */             if (this.o.t.q() == -1) {
/*  233: 295 */               i2 = 0;
/*  234:     */             } else {
/*  235: 297 */               i2 = -1;
/*  236:     */             }
/*  237: 300 */             c(i2);
/*  238:     */           }
/*  239: 303 */           this.ak = false;
/*  240:     */         }
/*  241:     */       }
/*  242:     */       else
/*  243:     */       {
/*  244: 306 */         if (this.al > 0) {
/*  245: 307 */           this.al -= 4;
/*  246:     */         }
/*  247: 309 */         if (this.al < 0) {
/*  248: 310 */           this.al = 0;
/*  249:     */         }
/*  250:     */       }
/*  251: 313 */       if (this.aj > 0) {
/*  252: 314 */         this.aj -= 1;
/*  253:     */       }
/*  254: 316 */       this.o.B.b();
/*  255:     */     }
/*  256: 320 */     Y();
/*  257:     */     
/*  258: 322 */     W();
/*  259: 324 */     if (this.o.D) {
/*  260: 325 */       this.i = 0;
/*  261: 327 */     } else if (this.i > 0) {
/*  262: 328 */       if (this.ab)
/*  263:     */       {
/*  264: 329 */         this.i -= 4;
/*  265: 330 */         if (this.i < 0) {
/*  266: 331 */           this.i = 0;
/*  267:     */         }
/*  268:     */       }
/*  269:     */       else
/*  270:     */       {
/*  271: 334 */         if (this.i % 20 == 0) {
/*  272: 335 */           a(wh.c, 1.0F);
/*  273:     */         }
/*  274: 337 */         this.i -= 1;
/*  275:     */       }
/*  276:     */     }
/*  277: 342 */     if (ab())
/*  278:     */     {
/*  279: 343 */       M();
/*  280: 344 */       this.O *= 0.5F;
/*  281:     */     }
/*  282: 347 */     if (this.t < -64.0D) {
/*  283: 348 */       O();
/*  284:     */     }
/*  285: 351 */     if (!this.o.D) {
/*  286: 352 */       b(0, this.i > 0);
/*  287:     */     }
/*  288: 355 */     this.aa = false;
/*  289:     */     
/*  290: 357 */     this.o.B.b();
/*  291:     */   }
/*  292:     */   
/*  293:     */   public int L()
/*  294:     */   {
/*  295: 361 */     return 0;
/*  296:     */   }
/*  297:     */   
/*  298:     */   protected void M()
/*  299:     */   {
/*  300: 365 */     if (this.ab) {
/*  301: 366 */       return;
/*  302:     */     }
/*  303: 369 */     a(wh.d, 4.0F);
/*  304: 370 */     e(15);
/*  305:     */   }
/*  306:     */   
/*  307:     */   public void e(int paramInt)
/*  308:     */   {
/*  309: 374 */     int i1 = paramInt * 20;
/*  310: 375 */     i1 = apu.a(this, i1);
/*  311: 376 */     if (this.i < i1) {
/*  312: 377 */       this.i = i1;
/*  313:     */     }
/*  314:     */   }
/*  315:     */   
/*  316:     */   public void N()
/*  317:     */   {
/*  318: 382 */     this.i = 0;
/*  319:     */   }
/*  320:     */   
/*  321:     */   protected void O()
/*  322:     */   {
/*  323: 386 */     J();
/*  324:     */   }
/*  325:     */   
/*  326:     */   public boolean c(double paramDouble1, double paramDouble2, double paramDouble3)
/*  327:     */   {
/*  328: 395 */     brt localbrt = aQ().c(paramDouble1, paramDouble2, paramDouble3);
/*  329: 396 */     return b(localbrt);
/*  330:     */   }
/*  331:     */   
/*  332:     */   private boolean b(brt parambrt)
/*  333:     */   {
/*  334: 400 */     return (this.o.a(this, parambrt).isEmpty()) && (!this.o.d(parambrt));
/*  335:     */   }
/*  336:     */   
/*  337:     */   public void d(double paramDouble1, double paramDouble2, double paramDouble3)
/*  338:     */   {
/*  339: 404 */     if (this.T)
/*  340:     */     {
/*  341: 405 */       a(aQ().c(paramDouble1, paramDouble2, paramDouble3));
/*  342: 406 */       m();
/*  343: 407 */       return;
/*  344:     */     }
/*  345: 410 */     this.o.B.a("move");
/*  346:     */     
/*  347: 412 */     double d1 = this.s;
/*  348: 413 */     double d2 = this.t;
/*  349: 414 */     double d3 = this.u;
/*  350: 417 */     if (this.H)
/*  351:     */     {
/*  352: 418 */       this.H = false;
/*  353:     */       
/*  354: 420 */       paramDouble1 *= 0.25D;
/*  355: 421 */       paramDouble2 *= 0.0500000007450581D;
/*  356: 422 */       paramDouble3 *= 0.25D;
/*  357: 423 */       this.v = 0.0D;
/*  358: 424 */       this.w = 0.0D;
/*  359: 425 */       this.x = 0.0D;
/*  360:     */     }
/*  361: 428 */     double d4 = paramDouble1;
/*  362: 429 */     double d5 = paramDouble2;
/*  363: 430 */     double d6 = paramDouble3;
/*  364:     */     
/*  365:     */ 
/*  366: 433 */     int i1 = (this.C) && (aw()) && ((this instanceof ahd)) ? 1 : 0;
/*  367: 434 */     if (i1 != 0)
/*  368:     */     {
/*  369: 435 */       double d7 = 0.05D;
/*  370: 438 */       while ((paramDouble1 != 0.0D) && (this.o.a(this, aQ().c(paramDouble1, -1.0D, 0.0D)).isEmpty()))
/*  371:     */       {
/*  372: 439 */         if ((paramDouble1 < d7) && (paramDouble1 >= -d7)) {
/*  373: 440 */           paramDouble1 = 0.0D;
/*  374: 441 */         } else if (paramDouble1 > 0.0D) {
/*  375: 442 */           paramDouble1 -= d7;
/*  376:     */         } else {
/*  377: 444 */           paramDouble1 += d7;
/*  378:     */         }
/*  379: 446 */         d4 = paramDouble1;
/*  380:     */       }
/*  381: 450 */       while ((paramDouble3 != 0.0D) && (this.o.a(this, aQ().c(0.0D, -1.0D, paramDouble3)).isEmpty()))
/*  382:     */       {
/*  383: 451 */         if ((paramDouble3 < d7) && (paramDouble3 >= -d7)) {
/*  384: 452 */           paramDouble3 = 0.0D;
/*  385: 453 */         } else if (paramDouble3 > 0.0D) {
/*  386: 454 */           paramDouble3 -= d7;
/*  387:     */         } else {
/*  388: 456 */           paramDouble3 += d7;
/*  389:     */         }
/*  390: 458 */         d6 = paramDouble3;
/*  391:     */       }
/*  392: 462 */       while ((paramDouble1 != 0.0D) && (paramDouble3 != 0.0D) && (this.o.a(this, aQ().c(paramDouble1, -1.0D, paramDouble3)).isEmpty()))
/*  393:     */       {
/*  394: 463 */         if ((paramDouble1 < d7) && (paramDouble1 >= -d7)) {
/*  395: 464 */           paramDouble1 = 0.0D;
/*  396: 465 */         } else if (paramDouble1 > 0.0D) {
/*  397: 466 */           paramDouble1 -= d7;
/*  398:     */         } else {
/*  399: 468 */           paramDouble1 += d7;
/*  400:     */         }
/*  401: 470 */         d4 = paramDouble1;
/*  402: 472 */         if ((paramDouble3 < d7) && (paramDouble3 >= -d7)) {
/*  403: 473 */           paramDouble3 = 0.0D;
/*  404: 474 */         } else if (paramDouble3 > 0.0D) {
/*  405: 475 */           paramDouble3 -= d7;
/*  406:     */         } else {
/*  407: 477 */           paramDouble3 += d7;
/*  408:     */         }
/*  409: 479 */         d6 = paramDouble3;
/*  410:     */       }
/*  411:     */     }
/*  412: 483 */     List localList1 = this.o.a(this, aQ().a(paramDouble1, paramDouble2, paramDouble3));
/*  413: 484 */     brt localbrt1 = aQ();
/*  414: 487 */     for (Iterator localIterator1 = localList1.iterator(); localIterator1.hasNext();)
/*  415:     */     {
/*  416: 487 */       localObject1 = (brt)localIterator1.next();
/*  417: 488 */       paramDouble2 = ((brt)localObject1).b(aQ(), paramDouble2);
/*  418:     */     }
/*  419: 490 */     a(aQ().c(0.0D, paramDouble2, 0.0D));
/*  420: 491 */     int i2 = (this.C) || ((d5 != paramDouble2) && (d5 < 0.0D)) ? 1 : 0;
/*  421: 495 */     for (Object localObject1 = localList1.iterator(); ((Iterator)localObject1).hasNext();)
/*  422:     */     {
/*  423: 495 */       localbrt2 = (brt)((Iterator)localObject1).next();
/*  424: 496 */       paramDouble1 = localbrt2.a(aQ(), paramDouble1);
/*  425:     */     }
/*  426:     */     brt localbrt2;
/*  427: 498 */     a(aQ().c(paramDouble1, 0.0D, 0.0D));
/*  428: 501 */     for (localObject1 = localList1.iterator(); ((Iterator)localObject1).hasNext();)
/*  429:     */     {
/*  430: 501 */       localbrt2 = (brt)((Iterator)localObject1).next();
/*  431: 502 */       paramDouble3 = localbrt2.c(aQ(), paramDouble3);
/*  432:     */     }
/*  433: 504 */     a(aQ().c(0.0D, 0.0D, paramDouble3));
/*  434:     */     Object localObject3;
/*  435: 507 */     if ((this.S > 0.0F) && (i2 != 0) && ((d4 != paramDouble1) || (d6 != paramDouble3)))
/*  436:     */     {
/*  437: 508 */       double d8 = paramDouble1;
/*  438: 509 */       double d9 = paramDouble2;
/*  439: 510 */       double d10 = paramDouble3;
/*  440: 511 */       localObject3 = aQ();
/*  441:     */       
/*  442:     */ 
/*  443: 514 */       a(localbrt1);
/*  444: 515 */       paramDouble1 = d4;
/*  445: 516 */       paramDouble2 = this.S;
/*  446: 517 */       paramDouble3 = d6;
/*  447:     */       
/*  448: 519 */       List localList2 = this.o.a(this, aQ().a(paramDouble1, paramDouble2, paramDouble3));
/*  449:     */       
/*  450:     */ 
/*  451: 522 */       brt localbrt3 = aQ();
/*  452: 523 */       brt localbrt4 = localbrt3.a(paramDouble1, 0.0D, paramDouble3);
/*  453: 524 */       double d14 = paramDouble2;
/*  454: 525 */       for (brt localbrt5 : localList2) {
/*  455: 526 */         d14 = localbrt5.b(localbrt4, d14);
/*  456:     */       }
/*  457: 528 */       localbrt3 = localbrt3.c(0.0D, d14, 0.0D);
/*  458:     */       
/*  459:     */ 
/*  460: 531 */       double d15 = paramDouble1;
/*  461: 533 */       for (brt localbrt6 : localList2) {
/*  462: 534 */         d15 = localbrt6.a(localbrt3, d15);
/*  463:     */       }
/*  464: 536 */       localbrt3 = localbrt3.c(d15, 0.0D, 0.0D);
/*  465:     */       
/*  466:     */ 
/*  467: 539 */       double d16 = paramDouble3;
/*  468: 541 */       for (Object localObject4 = localList2.iterator(); ((Iterator)localObject4).hasNext();)
/*  469:     */       {
/*  470: 541 */         brt localbrt7 = (brt)((Iterator)localObject4).next();
/*  471: 542 */         d16 = localbrt7.c(localbrt3, d16);
/*  472:     */       }
/*  473: 544 */       localbrt3 = localbrt3.c(0.0D, 0.0D, d16);
/*  474:     */       
/*  475:     */ 
/*  476: 547 */       localObject4 = aQ();
/*  477: 548 */       double d17 = paramDouble2;
/*  478: 549 */       for (brt localbrt8 : localList2) {
/*  479: 550 */         d17 = localbrt8.b((brt)localObject4, d17);
/*  480:     */       }
/*  481: 552 */       localObject4 = ((brt)localObject4).c(0.0D, d17, 0.0D);
/*  482:     */       
/*  483:     */ 
/*  484: 555 */       double d18 = paramDouble1;
/*  485: 557 */       for (brt localbrt9 : localList2) {
/*  486: 558 */         d18 = localbrt9.a((brt)localObject4, d18);
/*  487:     */       }
/*  488: 560 */       localObject4 = ((brt)localObject4).c(d18, 0.0D, 0.0D);
/*  489:     */       
/*  490:     */ 
/*  491: 563 */       double d19 = paramDouble3;
/*  492: 565 */       for (brt localbrt10 : localList2) {
/*  493: 566 */         d19 = localbrt10.c((brt)localObject4, d19);
/*  494:     */       }
/*  495: 568 */       localObject4 = ((brt)localObject4).c(0.0D, 0.0D, d19);
/*  496:     */       
/*  497:     */ 
/*  498: 571 */       double d20 = d15 * d15 + d16 * d16;
/*  499: 572 */       double d21 = d18 * d18 + d19 * d19;
/*  500: 575 */       if (d20 > d21)
/*  501:     */       {
/*  502: 576 */         paramDouble1 = d15;
/*  503: 577 */         paramDouble3 = d16;
/*  504: 578 */         a(localbrt3);
/*  505:     */       }
/*  506:     */       else
/*  507:     */       {
/*  508: 580 */         paramDouble1 = d18;
/*  509: 581 */         paramDouble3 = d19;
/*  510: 582 */         a((brt)localObject4);
/*  511:     */       }
/*  512: 586 */       paramDouble2 = -this.S;
/*  513: 587 */       for (brt localbrt11 : localList2) {
/*  514: 588 */         paramDouble2 = localbrt11.b(aQ(), paramDouble2);
/*  515:     */       }
/*  516: 590 */       a(aQ().c(0.0D, paramDouble2, 0.0D));
/*  517: 593 */       if (d8 * d8 + d10 * d10 >= paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3)
/*  518:     */       {
/*  519: 594 */         paramDouble1 = d8;
/*  520: 595 */         paramDouble2 = d9;
/*  521: 596 */         paramDouble3 = d10;
/*  522: 597 */         a((brt)localObject3);
/*  523:     */       }
/*  524:     */     }
/*  525: 600 */     this.o.B.b();
/*  526: 601 */     this.o.B.a("rest");
/*  527:     */     
/*  528: 603 */     m();
/*  529:     */     
/*  530: 605 */     this.D = ((d4 != paramDouble1) || (d6 != paramDouble3));
/*  531: 606 */     this.E = (d5 != paramDouble2);
/*  532:     */     
/*  533: 608 */     this.C = ((this.E) && (d5 < 0.0D));
/*  534: 609 */     this.F = ((this.D) || (this.E));
/*  535:     */     
/*  536: 611 */     int i3 = uv.c(this.s);
/*  537: 612 */     int i4 = uv.c(this.t - 0.2000000029802322D);
/*  538: 613 */     int i5 = uv.c(this.u);
/*  539:     */     
/*  540:     */ 
/*  541: 616 */     dt localdt = new dt(i3, i4, i5);
/*  542: 617 */     Object localObject2 = this.o.p(localdt).c();
/*  543: 618 */     if (((atr)localObject2).r() == bof.a)
/*  544:     */     {
/*  545: 619 */       atr localatr = this.o.p(localdt.b()).c();
/*  546: 620 */       if (((localatr instanceof avv)) || ((localatr instanceof bbx)) || ((localatr instanceof avw)))
/*  547:     */       {
/*  548: 621 */         localObject2 = localatr;
/*  549: 622 */         localdt = localdt.b();
/*  550:     */       }
/*  551:     */     }
/*  552: 626 */     a(paramDouble2, this.C, (atr)localObject2, localdt);
/*  553: 628 */     if (d4 != paramDouble1) {
/*  554: 629 */       this.v = 0.0D;
/*  555:     */     }
/*  556: 631 */     if (d6 != paramDouble3) {
/*  557: 632 */       this.x = 0.0D;
/*  558:     */     }
/*  559: 635 */     if (d5 != paramDouble2) {
/*  560: 636 */       ((atr)localObject2).a(this.o, this);
/*  561:     */     }
/*  562: 639 */     if ((r_()) && (i1 == 0) && (this.m == null))
/*  563:     */     {
/*  564: 640 */       double d11 = this.s - d1;
/*  565: 641 */       double d12 = this.t - d2;
/*  566: 642 */       double d13 = this.u - d3;
/*  567: 644 */       if (localObject2 != aty.au) {
/*  568: 645 */         d12 = 0.0D;
/*  569:     */       }
/*  570: 648 */       if ((localObject2 != null) && (this.C)) {
/*  571: 649 */         ((atr)localObject2).a(this.o, localdt, this);
/*  572:     */       }
/*  573: 652 */       this.M = ((float)(this.M + uv.a(d11 * d11 + d13 * d13) * 0.6D));
/*  574: 653 */       this.N = ((float)(this.N + uv.a(d11 * d11 + d12 * d12 + d13 * d13) * 0.6D));
/*  575: 655 */       if ((this.N > this.h) && (((atr)localObject2).r() != bof.a))
/*  576:     */       {
/*  577: 656 */         this.h = ((int)this.N + 1);
/*  578: 657 */         if (V())
/*  579:     */         {
/*  580: 658 */           float f1 = uv.a(this.v * this.v * 0.2000000029802322D + this.w * this.w + this.x * this.x * 0.2000000029802322D) * 0.35F;
/*  581: 659 */           if (f1 > 1.0F) {
/*  582: 660 */             f1 = 1.0F;
/*  583:     */           }
/*  584: 662 */           a(P(), f1, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
/*  585:     */         }
/*  586: 664 */         a(localdt, (atr)localObject2);
/*  587:     */       }
/*  588:     */     }
/*  589:     */     try
/*  590:     */     {
/*  591: 669 */       Q();
/*  592:     */     }
/*  593:     */     catch (Throwable localThrowable)
/*  594:     */     {
/*  595: 671 */       localObject3 = b.a(localThrowable, "Checking entity block collision");
/*  596: 672 */       j localj = ((b)localObject3).a("Entity being checked for collision");
/*  597:     */       
/*  598: 674 */       a(localj);
/*  599:     */       
/*  600: 676 */       throw new u((b)localObject3);
/*  601:     */     }
/*  602: 679 */     boolean bool = U();
/*  603: 680 */     if (this.o.e(aQ().d(0.001D, 0.001D, 0.001D)))
/*  604:     */     {
/*  605: 681 */       f(1);
/*  606: 682 */       if (!bool)
/*  607:     */       {
/*  608: 683 */         this.i += 1;
/*  609: 684 */         if (this.i == 0) {
/*  610: 685 */           e(8);
/*  611:     */         }
/*  612:     */       }
/*  613:     */     }
/*  614: 689 */     else if (this.i <= 0)
/*  615:     */     {
/*  616: 690 */       this.i = (-this.X);
/*  617:     */     }
/*  618: 694 */     if ((bool) && (this.i > 0))
/*  619:     */     {
/*  620: 695 */       a("random.fizz", 0.7F, 1.6F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
/*  621: 696 */       this.i = (-this.X);
/*  622:     */     }
/*  623: 699 */     this.o.B.b();
/*  624:     */   }
/*  625:     */   
/*  626:     */   private void m()
/*  627:     */   {
/*  628: 703 */     this.s = ((aQ().a + aQ().d) / 2.0D);
/*  629: 704 */     this.t = aQ().b;
/*  630: 705 */     this.u = ((aQ().c + aQ().f) / 2.0D);
/*  631:     */   }
/*  632:     */   
/*  633:     */   protected String P()
/*  634:     */   {
/*  635: 709 */     return "game.neutral.swim";
/*  636:     */   }
/*  637:     */   
/*  638:     */   protected void Q()
/*  639:     */   {
/*  640: 713 */     dt localdt1 = new dt(aQ().a + 0.001D, aQ().b + 0.001D, aQ().c + 0.001D);
/*  641: 714 */     dt localdt2 = new dt(aQ().d - 0.001D, aQ().e - 0.001D, aQ().f - 0.001D);
/*  642: 716 */     if (this.o.a(localdt1, localdt2)) {
/*  643: 717 */       for (int i1 = localdt1.n(); i1 <= localdt2.n(); i1++) {
/*  644: 718 */         for (int i2 = localdt1.o(); i2 <= localdt2.o(); i2++) {
/*  645: 719 */           for (int i3 = localdt1.p(); i3 <= localdt2.p(); i3++)
/*  646:     */           {
/*  647: 720 */             dt localdt3 = new dt(i1, i2, i3);
/*  648: 721 */             bec localbec = this.o.p(localdt3);
/*  649:     */             try
/*  650:     */             {
/*  651: 724 */               localbec.c().a(this.o, localdt3, localbec, this);
/*  652:     */             }
/*  653:     */             catch (Throwable localThrowable)
/*  654:     */             {
/*  655: 726 */               b localb = b.a(localThrowable, "Colliding entity with block");
/*  656: 727 */               j localj = localb.a("Block being collided with");
/*  657:     */               
/*  658: 729 */               j.a(localj, localdt3, localbec);
/*  659:     */               
/*  660: 731 */               throw new u(localb);
/*  661:     */             }
/*  662:     */           }
/*  663:     */         }
/*  664:     */       }
/*  665:     */     }
/*  666:     */   }
/*  667:     */   
/*  668:     */   protected void a(dt paramdt, atr paramatr)
/*  669:     */   {
/*  670: 740 */     atx localatx = paramatr.H;
/*  671: 741 */     if (this.o.p(paramdt.a()).c() == aty.aH)
/*  672:     */     {
/*  673: 742 */       localatx = aty.aH.H;
/*  674: 743 */       a(localatx.c(), localatx.d() * 0.15F, localatx.e());
/*  675:     */     }
/*  676: 744 */     else if (!paramatr.r().d())
/*  677:     */     {
/*  678: 745 */       a(localatx.c(), localatx.d() * 0.15F, localatx.e());
/*  679:     */     }
/*  680:     */   }
/*  681:     */   
/*  682:     */   public void a(String paramString, float paramFloat1, float paramFloat2)
/*  683:     */   {
/*  684: 750 */     if (!R()) {
/*  685: 751 */       this.o.a(this, paramString, paramFloat1, paramFloat2);
/*  686:     */     }
/*  687:     */   }
/*  688:     */   
/*  689:     */   public boolean R()
/*  690:     */   {
/*  691: 756 */     return this.ac.a(4) == 1;
/*  692:     */   }
/*  693:     */   
/*  694:     */   public void b(boolean paramBoolean)
/*  695:     */   {
/*  696: 760 */     this.ac.b(4, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*  697:     */   }
/*  698:     */   
/*  699:     */   protected boolean r_()
/*  700:     */   {
/*  701: 764 */     return true;
/*  702:     */   }
/*  703:     */   
/*  704:     */   protected void a(double paramDouble, boolean paramBoolean, atr paramatr, dt paramdt)
/*  705:     */   {
/*  706: 768 */     if (paramBoolean)
/*  707:     */     {
/*  708: 769 */       if (this.O > 0.0F)
/*  709:     */       {
/*  710: 770 */         if (paramatr != null) {
/*  711: 771 */           paramatr.a(this.o, paramdt, this, this.O);
/*  712:     */         } else {
/*  713: 773 */           e(this.O, 1.0F);
/*  714:     */         }
/*  715: 775 */         this.O = 0.0F;
/*  716:     */       }
/*  717:     */     }
/*  718: 778 */     else if (paramDouble < 0.0D) {
/*  719: 779 */       this.O = ((float)(this.O - paramDouble));
/*  720:     */     }
/*  721:     */   }
/*  722:     */   
/*  723:     */   public brt S()
/*  724:     */   {
/*  725: 785 */     return null;
/*  726:     */   }
/*  727:     */   
/*  728:     */   protected void f(int paramInt)
/*  729:     */   {
/*  730: 789 */     if (!this.ab) {
/*  731: 790 */       a(wh.a, paramInt);
/*  732:     */     }
/*  733:     */   }
/*  734:     */   
/*  735:     */   public final boolean T()
/*  736:     */   {
/*  737: 795 */     return this.ab;
/*  738:     */   }
/*  739:     */   
/*  740:     */   public void e(float paramFloat1, float paramFloat2)
/*  741:     */   {
/*  742: 799 */     if (this.l != null) {
/*  743: 800 */       this.l.e(paramFloat1, paramFloat2);
/*  744:     */     }
/*  745:     */   }
/*  746:     */   
/*  747:     */   public boolean U()
/*  748:     */   {
/*  749: 805 */     return (this.Y) || (this.o.C(new dt(this.s, this.t, this.u))) || (this.o.C(new dt(this.s, this.t + this.K, this.u)));
/*  750:     */   }
/*  751:     */   
/*  752:     */   public boolean V()
/*  753:     */   {
/*  754: 809 */     return this.Y;
/*  755:     */   }
/*  756:     */   
/*  757:     */   public boolean W()
/*  758:     */   {
/*  759: 813 */     if (this.o.a(aQ().b(0.0D, -0.4000000059604645D, 0.0D).d(0.001D, 0.001D, 0.001D), bof.h, this))
/*  760:     */     {
/*  761: 814 */       if ((!this.Y) && (!this.aa)) {
/*  762: 815 */         X();
/*  763:     */       }
/*  764: 817 */       this.O = 0.0F;
/*  765: 818 */       this.Y = true;
/*  766: 819 */       this.i = 0;
/*  767:     */     }
/*  768:     */     else
/*  769:     */     {
/*  770: 821 */       this.Y = false;
/*  771:     */     }
/*  772: 823 */     return this.Y;
/*  773:     */   }
/*  774:     */   
/*  775:     */   protected void X()
/*  776:     */   {
/*  777: 827 */     float f1 = uv.a(this.v * this.v * 0.2000000029802322D + this.w * this.w + this.x * this.x * 0.2000000029802322D) * 0.2F;
/*  778: 828 */     if (f1 > 1.0F) {
/*  779: 829 */       f1 = 1.0F;
/*  780:     */     }
/*  781: 831 */     a(aa(), f1, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
/*  782: 832 */     float f2 = uv.c(aQ().b);
/*  783:     */     float f3;
/*  784:     */     float f4;
/*  785: 833 */     for (int i1 = 0; i1 < 1.0F + this.J * 20.0F; i1++)
/*  786:     */     {
/*  787: 834 */       f3 = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
/*  788: 835 */       f4 = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
/*  789: 836 */       this.o.a(ew.e, this.s + f3, f2 + 1.0F, this.u + f4, this.v, this.w - this.V.nextFloat() * 0.2F, this.x, new int[0]);
/*  790:     */     }
/*  791: 838 */     for (i1 = 0; i1 < 1.0F + this.J * 20.0F; i1++)
/*  792:     */     {
/*  793: 839 */       f3 = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
/*  794: 840 */       f4 = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
/*  795: 841 */       this.o.a(ew.f, this.s + f3, f2 + 1.0F, this.u + f4, this.v, this.w, this.x, new int[0]);
/*  796:     */     }
/*  797:     */   }
/*  798:     */   
/*  799:     */   public void Y()
/*  800:     */   {
/*  801: 846 */     if ((ax()) && (!V())) {
/*  802: 847 */       Z();
/*  803:     */     }
/*  804:     */   }
/*  805:     */   
/*  806:     */   protected void Z()
/*  807:     */   {
/*  808: 852 */     int i1 = uv.c(this.s);
/*  809: 853 */     int i2 = uv.c(this.t - 0.2000000029802322D);
/*  810: 854 */     int i3 = uv.c(this.u);
/*  811: 855 */     dt localdt = new dt(i1, i2, i3);
/*  812: 856 */     bec localbec = this.o.p(localdt);
/*  813: 857 */     atr localatr = localbec.c();
/*  814: 859 */     if (localatr.b() != -1) {
/*  815: 860 */       this.o.a(ew.L, this.s + (this.V.nextFloat() - 0.5D) * this.J, aQ().b + 0.1D, this.u + (this.V.nextFloat() - 0.5D) * this.J, -this.v * 4.0D, 1.5D, -this.x * 4.0D, new int[] { atr.f(localbec) });
/*  816:     */     }
/*  817:     */   }
/*  818:     */   
/*  819:     */   protected String aa()
/*  820:     */   {
/*  821: 865 */     return "game.neutral.swim.splash";
/*  822:     */   }
/*  823:     */   
/*  824:     */   public boolean a(bof parambof)
/*  825:     */   {
/*  826: 869 */     double d = this.t + aR();
/*  827: 870 */     dt localdt = new dt(this.s, d, this.u);
/*  828: 871 */     bec localbec = this.o.p(localdt);
/*  829: 872 */     atr localatr = localbec.c();
/*  830: 873 */     if (localatr.r() == parambof)
/*  831:     */     {
/*  832: 874 */       float f1 = axl.b(localbec.c().c(localbec)) - 0.1111111F;
/*  833: 875 */       float f2 = localdt.o() + 1 - f1;
/*  834: 876 */       boolean bool = d < f2;
/*  835: 878 */       if ((!bool) && ((this instanceof ahd))) {
/*  836: 879 */         return false;
/*  837:     */       }
/*  838: 881 */       return bool;
/*  839:     */     }
/*  840: 884 */     return false;
/*  841:     */   }
/*  842:     */   
/*  843:     */   public boolean ab()
/*  844:     */   {
/*  845: 888 */     return this.o.a(aQ().b(-0.1000000014901161D, -0.4000000059604645D, -0.1000000014901161D), bof.i);
/*  846:     */   }
/*  847:     */   
/*  848:     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3)
/*  849:     */   {
/*  850: 892 */     float f1 = paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2;
/*  851: 893 */     if (f1 < 1.0E-004F) {
/*  852: 894 */       return;
/*  853:     */     }
/*  854: 897 */     f1 = uv.c(f1);
/*  855: 898 */     if (f1 < 1.0F) {
/*  856: 899 */       f1 = 1.0F;
/*  857:     */     }
/*  858: 901 */     f1 = paramFloat3 / f1;
/*  859: 902 */     paramFloat1 *= f1;
/*  860: 903 */     paramFloat2 *= f1;
/*  861:     */     
/*  862: 905 */     float f2 = uv.a(this.y * 3.141593F / 180.0F);
/*  863: 906 */     float f3 = uv.b(this.y * 3.141593F / 180.0F);
/*  864:     */     
/*  865: 908 */     this.v += paramFloat1 * f3 - paramFloat2 * f2;
/*  866: 909 */     this.x += paramFloat2 * f3 + paramFloat1 * f2;
/*  867:     */   }
/*  868:     */   
/*  869:     */   public int b(float paramFloat)
/*  870:     */   {
/*  871: 913 */     dt localdt = new dt(this.s, 0.0D, this.u);
/*  872: 914 */     if (this.o.e(localdt))
/*  873:     */     {
/*  874: 915 */       double d = (aQ().e - aQ().b) * 0.66D;
/*  875: 916 */       int i1 = uv.c(this.t + d);
/*  876: 917 */       return this.o.b(localdt.b(i1), 0);
/*  877:     */     }
/*  878: 919 */     return 0;
/*  879:     */   }
/*  880:     */   
/*  881:     */   public float c(float paramFloat)
/*  882:     */   {
/*  883: 923 */     dt localdt = new dt(this.s, 0.0D, this.u);
/*  884: 924 */     if (this.o.e(localdt))
/*  885:     */     {
/*  886: 925 */       double d = (aQ().e - aQ().b) * 0.66D;
/*  887: 926 */       int i1 = uv.c(this.t + d);
/*  888: 927 */       return this.o.o(localdt.b(i1));
/*  889:     */     }
/*  890: 929 */     return 0.0F;
/*  891:     */   }
/*  892:     */   
/*  893:     */   public void a(aqu paramaqu)
/*  894:     */   {
/*  895: 933 */     this.o = paramaqu;
/*  896:     */   }
/*  897:     */   
/*  898:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  899:     */   {
/*  900: 937 */     this.p = (this.s = paramDouble1);
/*  901: 938 */     this.q = (this.t = paramDouble2);
/*  902: 939 */     this.r = (this.u = paramDouble3);
/*  903: 940 */     this.A = (this.y = paramFloat1);
/*  904: 941 */     this.B = (this.z = paramFloat2);
/*  905:     */     
/*  906: 943 */     double d = this.A - paramFloat1;
/*  907: 944 */     if (d < -180.0D) {
/*  908: 945 */       this.A += 360.0F;
/*  909:     */     }
/*  910: 947 */     if (d >= 180.0D) {
/*  911: 948 */       this.A -= 360.0F;
/*  912:     */     }
/*  913: 950 */     b(this.s, this.t, this.u);
/*  914: 951 */     b(paramFloat1, paramFloat2);
/*  915:     */   }
/*  916:     */   
/*  917:     */   public void a(dt paramdt, float paramFloat1, float paramFloat2)
/*  918:     */   {
/*  919: 955 */     b(paramdt.n() + 0.5D, paramdt.o(), paramdt.p() + 0.5D, paramFloat1, paramFloat2);
/*  920:     */   }
/*  921:     */   
/*  922:     */   public void b(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  923:     */   {
/*  924: 959 */     this.P = (this.p = this.s = paramDouble1);
/*  925: 960 */     this.Q = (this.q = this.t = paramDouble2);
/*  926: 961 */     this.R = (this.r = this.u = paramDouble3);
/*  927: 962 */     this.y = paramFloat1;
/*  928: 963 */     this.z = paramFloat2;
/*  929: 964 */     b(this.s, this.t, this.u);
/*  930:     */   }
/*  931:     */   
/*  932:     */   public float g(wv paramwv)
/*  933:     */   {
/*  934: 968 */     float f1 = (float)(this.s - paramwv.s);
/*  935: 969 */     float f2 = (float)(this.t - paramwv.t);
/*  936: 970 */     float f3 = (float)(this.u - paramwv.u);
/*  937: 971 */     return uv.c(f1 * f1 + f2 * f2 + f3 * f3);
/*  938:     */   }
/*  939:     */   
/*  940:     */   public double e(double paramDouble1, double paramDouble2, double paramDouble3)
/*  941:     */   {
/*  942: 975 */     double d1 = this.s - paramDouble1;
/*  943: 976 */     double d2 = this.t - paramDouble2;
/*  944: 977 */     double d3 = this.u - paramDouble3;
/*  945: 978 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*  946:     */   }
/*  947:     */   
/*  948:     */   public double b(dt paramdt)
/*  949:     */   {
/*  950: 982 */     return paramdt.c(this.s, this.t, this.u);
/*  951:     */   }
/*  952:     */   
/*  953:     */   public double c(dt paramdt)
/*  954:     */   {
/*  955: 986 */     return paramdt.d(this.s, this.t, this.u);
/*  956:     */   }
/*  957:     */   
/*  958:     */   public double f(double paramDouble1, double paramDouble2, double paramDouble3)
/*  959:     */   {
/*  960: 990 */     double d1 = this.s - paramDouble1;
/*  961: 991 */     double d2 = this.t - paramDouble2;
/*  962: 992 */     double d3 = this.u - paramDouble3;
/*  963: 993 */     return uv.a(d1 * d1 + d2 * d2 + d3 * d3);
/*  964:     */   }
/*  965:     */   
/*  966:     */   public double h(wv paramwv)
/*  967:     */   {
/*  968: 997 */     double d1 = this.s - paramwv.s;
/*  969: 998 */     double d2 = this.t - paramwv.t;
/*  970: 999 */     double d3 = this.u - paramwv.u;
/*  971:1000 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*  972:     */   }
/*  973:     */   
/*  974:     */   public void d(ahd paramahd) {}
/*  975:     */   
/*  976:     */   public void i(wv paramwv)
/*  977:     */   {
/*  978:1007 */     if ((paramwv.l == this) || (paramwv.m == this)) {
/*  979:1008 */       return;
/*  980:     */     }
/*  981:1010 */     if ((paramwv.T) || (this.T)) {
/*  982:1011 */       return;
/*  983:     */     }
/*  984:1014 */     double d1 = paramwv.s - this.s;
/*  985:1015 */     double d2 = paramwv.u - this.u;
/*  986:     */     
/*  987:1017 */     double d3 = uv.a(d1, d2);
/*  988:1019 */     if (d3 >= 0.009999999776482582D)
/*  989:     */     {
/*  990:1020 */       d3 = uv.a(d3);
/*  991:1021 */       d1 /= d3;
/*  992:1022 */       d2 /= d3;
/*  993:     */       
/*  994:1024 */       double d4 = 1.0D / d3;
/*  995:1025 */       if (d4 > 1.0D) {
/*  996:1026 */         d4 = 1.0D;
/*  997:     */       }
/*  998:1028 */       d1 *= d4;
/*  999:1029 */       d2 *= d4;
/* 1000:     */       
/* 1001:1031 */       d1 *= 0.0500000007450581D;
/* 1002:1032 */       d2 *= 0.0500000007450581D;
/* 1003:     */       
/* 1004:1034 */       d1 *= (1.0F - this.U);
/* 1005:1035 */       d2 *= (1.0F - this.U);
/* 1006:1037 */       if (this.l == null) {
/* 1007:1038 */         g(-d1, 0.0D, -d2);
/* 1008:     */       }
/* 1009:1040 */       if (paramwv.l == null) {
/* 1010:1041 */         paramwv.g(d1, 0.0D, d2);
/* 1011:     */       }
/* 1012:     */     }
/* 1013:     */   }
/* 1014:     */   
/* 1015:     */   public void g(double paramDouble1, double paramDouble2, double paramDouble3)
/* 1016:     */   {
/* 1017:1047 */     this.v += paramDouble1;
/* 1018:1048 */     this.w += paramDouble2;
/* 1019:1049 */     this.x += paramDouble3;
/* 1020:1050 */     this.ai = true;
/* 1021:     */   }
/* 1022:     */   
/* 1023:     */   protected void ac()
/* 1024:     */   {
/* 1025:1054 */     this.G = true;
/* 1026:     */   }
/* 1027:     */   
/* 1028:     */   public boolean a(wh paramwh, float paramFloat)
/* 1029:     */   {
/* 1030:1058 */     if (b(paramwh)) {
/* 1031:1059 */       return false;
/* 1032:     */     }
/* 1033:1061 */     ac();
/* 1034:1062 */     return false;
/* 1035:     */   }
/* 1036:     */   
/* 1037:     */   public brw d(float paramFloat)
/* 1038:     */   {
/* 1039:1070 */     if (paramFloat == 1.0F) {
/* 1040:1071 */       return f(this.z, this.y);
/* 1041:     */     }
/* 1042:1073 */     float f1 = this.B + (this.z - this.B) * paramFloat;
/* 1043:1074 */     float f2 = this.A + (this.y - this.A) * paramFloat;
/* 1044:1075 */     return f(f1, f2);
/* 1045:     */   }
/* 1046:     */   
/* 1047:     */   protected final brw f(float paramFloat1, float paramFloat2)
/* 1048:     */   {
/* 1049:1079 */     float f1 = uv.b(-paramFloat2 * 0.01745329F - 3.141593F);
/* 1050:1080 */     float f2 = uv.a(-paramFloat2 * 0.01745329F - 3.141593F);
/* 1051:1081 */     float f3 = -uv.b(-paramFloat1 * 0.01745329F);
/* 1052:1082 */     float f4 = uv.a(-paramFloat1 * 0.01745329F);
/* 1053:     */     
/* 1054:1084 */     return new brw(f2 * f3, f4, f1 * f3);
/* 1055:     */   }
/* 1056:     */   
/* 1057:     */   public brw e(float paramFloat)
/* 1058:     */   {
/* 1059:1088 */     if (paramFloat == 1.0F) {
/* 1060:1089 */       return new brw(this.s, this.t + aR(), this.u);
/* 1061:     */     }
/* 1062:1091 */     double d1 = this.p + (this.s - this.p) * paramFloat;
/* 1063:1092 */     double d2 = this.q + (this.t - this.q) * paramFloat + aR();
/* 1064:1093 */     double d3 = this.r + (this.u - this.r) * paramFloat;
/* 1065:     */     
/* 1066:1095 */     return new brw(d1, d2, d3);
/* 1067:     */   }
/* 1068:     */   
/* 1069:     */   public bru a(double paramDouble, float paramFloat)
/* 1070:     */   {
/* 1071:1100 */     brw localbrw1 = e(paramFloat);
/* 1072:1101 */     brw localbrw2 = d(paramFloat);
/* 1073:1102 */     brw localbrw3 = localbrw1.b(localbrw2.a * paramDouble, localbrw2.b * paramDouble, localbrw2.c * paramDouble);
/* 1074:1103 */     return this.o.a(localbrw1, localbrw3, false, false, true);
/* 1075:     */   }
/* 1076:     */   
/* 1077:     */   public boolean ad()
/* 1078:     */   {
/* 1079:1107 */     return false;
/* 1080:     */   }
/* 1081:     */   
/* 1082:     */   public boolean ae()
/* 1083:     */   {
/* 1084:1111 */     return false;
/* 1085:     */   }
/* 1086:     */   
/* 1087:     */   public void b(wv paramwv, int paramInt) {}
/* 1088:     */   
/* 1089:     */   public boolean h(double paramDouble1, double paramDouble2, double paramDouble3)
/* 1090:     */   {
/* 1091:1118 */     double d1 = this.s - paramDouble1;
/* 1092:1119 */     double d2 = this.t - paramDouble2;
/* 1093:1120 */     double d3 = this.u - paramDouble3;
/* 1094:1121 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 1095:1122 */     return a(d4);
/* 1096:     */   }
/* 1097:     */   
/* 1098:     */   public boolean a(double paramDouble)
/* 1099:     */   {
/* 1100:1126 */     double d = aQ().a();
/* 1101:1127 */     d *= 64.0D * this.j;
/* 1102:1128 */     return paramDouble < d * d;
/* 1103:     */   }
/* 1104:     */   
/* 1105:     */   public boolean c(fn paramfn)
/* 1106:     */   {
/* 1107:1132 */     String str = ag();
/* 1108:1133 */     if ((this.I) || (str == null)) {
/* 1109:1134 */       return false;
/* 1110:     */     }
/* 1111:1136 */     paramfn.a("id", str);
/* 1112:1137 */     e(paramfn);
/* 1113:1138 */     return true;
/* 1114:     */   }
/* 1115:     */   
/* 1116:     */   public boolean d(fn paramfn)
/* 1117:     */   {
/* 1118:1142 */     String str = ag();
/* 1119:1143 */     if ((this.I) || (str == null) || (this.l != null)) {
/* 1120:1144 */       return false;
/* 1121:     */     }
/* 1122:1146 */     paramfn.a("id", str);
/* 1123:1147 */     e(paramfn);
/* 1124:1148 */     return true;
/* 1125:     */   }
/* 1126:     */   
/* 1127:     */   public void e(fn paramfn)
/* 1128:     */   {
/* 1129:     */     try
/* 1130:     */     {
/* 1131:1153 */       paramfn.a("Pos", a(new double[] { this.s, this.t, this.u }));
/* 1132:1154 */       paramfn.a("Motion", a(new double[] { this.v, this.w, this.x }));
/* 1133:1155 */       paramfn.a("Rotation", a(new float[] { this.y, this.z }));
/* 1134:     */       
/* 1135:1157 */       paramfn.a("FallDistance", this.O);
/* 1136:1158 */       paramfn.a("Fire", (short)this.i);
/* 1137:1159 */       paramfn.a("Air", (short)aA());
/* 1138:1160 */       paramfn.a("OnGround", this.C);
/* 1139:1161 */       paramfn.a("Dimension", this.am);
/* 1140:1162 */       paramfn.a("Invulnerable", this.ar);
/* 1141:1163 */       paramfn.a("PortalCooldown", this.aj);
/* 1142:     */       
/* 1143:1165 */       paramfn.a("UUIDMost", aJ().getMostSignificantBits());
/* 1144:1166 */       paramfn.a("UUIDLeast", aJ().getLeastSignificantBits());
/* 1145:1168 */       if ((aL() != null) && (aL().length() > 0))
/* 1146:     */       {
/* 1147:1169 */         paramfn.a("CustomName", aL());
/* 1148:1170 */         paramfn.a("CustomNameVisible", aM());
/* 1149:     */       }
/* 1150:1172 */       this.as.b(paramfn);
/* 1151:1173 */       if (R()) {
/* 1152:1174 */         paramfn.a("Silent", R());
/* 1153:     */       }
/* 1154:1177 */       b(paramfn);
/* 1155:1179 */       if (this.m != null)
/* 1156:     */       {
/* 1157:1180 */         fn localfn = new fn();
/* 1158:1181 */         if (this.m.c(localfn)) {
/* 1159:1182 */           paramfn.a("Riding", localfn);
/* 1160:     */         }
/* 1161:     */       }
/* 1162:     */     }
/* 1163:     */     catch (Throwable localThrowable)
/* 1164:     */     {
/* 1165:1186 */       b localb = b.a(localThrowable, "Saving entity NBT");
/* 1166:1187 */       j localj = localb.a("Entity being saved");
/* 1167:1188 */       a(localj);
/* 1168:1189 */       throw new u(localb);
/* 1169:     */     }
/* 1170:     */   }
/* 1171:     */   
/* 1172:     */   public void f(fn paramfn)
/* 1173:     */   {
/* 1174:     */     try
/* 1175:     */     {
/* 1176:1195 */       fv localfv = paramfn.c("Pos", 6);
/* 1177:1196 */       localObject1 = paramfn.c("Motion", 6);
/* 1178:1197 */       localObject2 = paramfn.c("Rotation", 5);
/* 1179:     */       
/* 1180:1199 */       this.v = ((fv)localObject1).d(0);
/* 1181:1200 */       this.w = ((fv)localObject1).d(1);
/* 1182:1201 */       this.x = ((fv)localObject1).d(2);
/* 1183:1203 */       if (Math.abs(this.v) > 10.0D) {
/* 1184:1204 */         this.v = 0.0D;
/* 1185:     */       }
/* 1186:1206 */       if (Math.abs(this.w) > 10.0D) {
/* 1187:1207 */         this.w = 0.0D;
/* 1188:     */       }
/* 1189:1209 */       if (Math.abs(this.x) > 10.0D) {
/* 1190:1210 */         this.x = 0.0D;
/* 1191:     */       }
/* 1192:1213 */       this.p = (this.P = this.s = localfv.d(0));
/* 1193:1214 */       this.q = (this.Q = this.t = localfv.d(1));
/* 1194:1215 */       this.r = (this.R = this.u = localfv.d(2));
/* 1195:     */       
/* 1196:1217 */       this.A = (this.y = ((fv)localObject2).e(0));
/* 1197:1218 */       this.B = (this.z = ((fv)localObject2).e(1));
/* 1198:     */       
/* 1199:1220 */       this.O = paramfn.h("FallDistance");
/* 1200:1221 */       this.i = paramfn.e("Fire");
/* 1201:1222 */       h(paramfn.e("Air"));
/* 1202:1223 */       this.C = paramfn.n("OnGround");
/* 1203:1224 */       this.am = paramfn.f("Dimension");
/* 1204:1225 */       this.ar = paramfn.n("Invulnerable");
/* 1205:1226 */       this.aj = paramfn.f("PortalCooldown");
/* 1206:1228 */       if ((paramfn.b("UUIDMost", 4)) && (paramfn.b("UUIDLeast", 4))) {
/* 1207:1229 */         this.ao = new UUID(paramfn.g("UUIDMost"), paramfn.g("UUIDLeast"));
/* 1208:1230 */       } else if (paramfn.b("UUID", 8)) {
/* 1209:1231 */         this.ao = UUID.fromString(paramfn.j("UUID"));
/* 1210:     */       }
/* 1211:1234 */       b(this.s, this.t, this.u);
/* 1212:1235 */       b(this.y, this.z);
/* 1213:1237 */       if ((paramfn.b("CustomName", 8)) && (paramfn.j("CustomName").length() > 0)) {
/* 1214:1238 */         a(paramfn.j("CustomName"));
/* 1215:     */       }
/* 1216:1240 */       g(paramfn.n("CustomNameVisible"));
/* 1217:1241 */       this.as.a(paramfn);
/* 1218:1242 */       b(paramfn.n("Silent"));
/* 1219:     */       
/* 1220:1244 */       a(paramfn);
/* 1221:1246 */       if (af()) {
/* 1222:1247 */         b(this.s, this.t, this.u);
/* 1223:     */       }
/* 1224:     */     }
/* 1225:     */     catch (Throwable localThrowable)
/* 1226:     */     {
/* 1227:1250 */       Object localObject1 = b.a(localThrowable, "Loading entity NBT");
/* 1228:1251 */       Object localObject2 = ((b)localObject1).a("Entity being loaded");
/* 1229:1252 */       a((j)localObject2);
/* 1230:1253 */       throw new u((b)localObject1);
/* 1231:     */     }
/* 1232:     */   }
/* 1233:     */   
/* 1234:     */   protected boolean af()
/* 1235:     */   {
/* 1236:1258 */     return true;
/* 1237:     */   }
/* 1238:     */   
/* 1239:     */   protected final String ag()
/* 1240:     */   {
/* 1241:1262 */     return xb.b(this);
/* 1242:     */   }
/* 1243:     */   
/* 1244:     */   protected abstract void a(fn paramfn);
/* 1245:     */   
/* 1246:     */   protected abstract void b(fn paramfn);
/* 1247:     */   
/* 1248:     */   public void ah() {}
/* 1249:     */   
/* 1250:     */   protected fv a(double... paramVarArgs)
/* 1251:     */   {
/* 1252:1277 */     fv localfv = new fv();
/* 1253:1278 */     for (double d : paramVarArgs) {
/* 1254:1279 */       localfv.a(new fq(d));
/* 1255:     */     }
/* 1256:1281 */     return localfv;
/* 1257:     */   }
/* 1258:     */   
/* 1259:     */   protected fv a(float... paramVarArgs)
/* 1260:     */   {
/* 1261:1285 */     fv localfv = new fv();
/* 1262:1286 */     for (float f1 : paramVarArgs) {
/* 1263:1287 */       localfv.a(new fs(f1));
/* 1264:     */     }
/* 1265:1289 */     return localfv;
/* 1266:     */   }
/* 1267:     */   
/* 1268:     */   public adw a(alq paramalq, int paramInt)
/* 1269:     */   {
/* 1270:1293 */     return a(paramalq, paramInt, 0.0F);
/* 1271:     */   }
/* 1272:     */   
/* 1273:     */   public adw a(alq paramalq, int paramInt, float paramFloat)
/* 1274:     */   {
/* 1275:1297 */     return a(new amj(paramalq, paramInt, 0), paramFloat);
/* 1276:     */   }
/* 1277:     */   
/* 1278:     */   public adw a(amj paramamj, float paramFloat)
/* 1279:     */   {
/* 1280:1301 */     if ((paramamj.b == 0) || (paramamj.b() == null)) {
/* 1281:1302 */       return null;
/* 1282:     */     }
/* 1283:1305 */     adw localadw = new adw(this.o, this.s, this.t + paramFloat, this.u, paramamj);
/* 1284:1306 */     localadw.p();
/* 1285:1307 */     this.o.d(localadw);
/* 1286:1308 */     return localadw;
/* 1287:     */   }
/* 1288:     */   
/* 1289:     */   public boolean ai()
/* 1290:     */   {
/* 1291:1312 */     return !this.I;
/* 1292:     */   }
/* 1293:     */   
/* 1294:     */   public boolean aj()
/* 1295:     */   {
/* 1296:1316 */     if (this.T) {
/* 1297:1317 */       return false;
/* 1298:     */     }
/* 1299:1320 */     for (int i1 = 0; i1 < 8; i1++)
/* 1300:     */     {
/* 1301:1321 */       double d1 = this.s + ((i1 >> 0) % 2 - 0.5F) * this.J * 0.8F;
/* 1302:1322 */       double d2 = this.t + ((i1 >> 1) % 2 - 0.5F) * 0.1F;
/* 1303:1323 */       double d3 = this.u + ((i1 >> 2) % 2 - 0.5F) * this.J * 0.8F;
/* 1304:1325 */       if (this.o.p(new dt(d1, d2 + aR(), d3)).c().u()) {
/* 1305:1326 */         return true;
/* 1306:     */       }
/* 1307:     */     }
/* 1308:1329 */     return false;
/* 1309:     */   }
/* 1310:     */   
/* 1311:     */   public boolean e(ahd paramahd)
/* 1312:     */   {
/* 1313:1333 */     return false;
/* 1314:     */   }
/* 1315:     */   
/* 1316:     */   public brt j(wv paramwv)
/* 1317:     */   {
/* 1318:1337 */     return null;
/* 1319:     */   }
/* 1320:     */   
/* 1321:     */   public void ak()
/* 1322:     */   {
/* 1323:1341 */     if (this.m.I)
/* 1324:     */     {
/* 1325:1342 */       this.m = null;
/* 1326:1343 */       return;
/* 1327:     */     }
/* 1328:1345 */     this.v = 0.0D;
/* 1329:1346 */     this.w = 0.0D;
/* 1330:1347 */     this.x = 0.0D;
/* 1331:1348 */     s_();
/* 1332:1349 */     if (this.m == null) {
/* 1333:1350 */       return;
/* 1334:     */     }
/* 1335:1353 */     this.m.al();
/* 1336:     */     
/* 1337:1355 */     this.aq += this.m.y - this.m.A;
/* 1338:1356 */     this.ap += this.m.z - this.m.B;
/* 1339:1358 */     while (this.aq >= 180.0D) {
/* 1340:1359 */       this.aq -= 360.0D;
/* 1341:     */     }
/* 1342:1361 */     while (this.aq < -180.0D) {
/* 1343:1362 */       this.aq += 360.0D;
/* 1344:     */     }
/* 1345:1365 */     while (this.ap >= 180.0D) {
/* 1346:1366 */       this.ap -= 360.0D;
/* 1347:     */     }
/* 1348:1368 */     while (this.ap < -180.0D) {
/* 1349:1369 */       this.ap += 360.0D;
/* 1350:     */     }
/* 1351:1372 */     double d1 = this.aq * 0.5D;
/* 1352:1373 */     double d2 = this.ap * 0.5D;
/* 1353:     */     
/* 1354:1375 */     float f1 = 10.0F;
/* 1355:1376 */     if (d1 > f1) {
/* 1356:1377 */       d1 = f1;
/* 1357:     */     }
/* 1358:1379 */     if (d1 < -f1) {
/* 1359:1380 */       d1 = -f1;
/* 1360:     */     }
/* 1361:1382 */     if (d2 > f1) {
/* 1362:1383 */       d2 = f1;
/* 1363:     */     }
/* 1364:1385 */     if (d2 < -f1) {
/* 1365:1386 */       d2 = -f1;
/* 1366:     */     }
/* 1367:1389 */     this.aq -= d1;
/* 1368:1390 */     this.ap -= d2;
/* 1369:     */   }
/* 1370:     */   
/* 1371:     */   public void al()
/* 1372:     */   {
/* 1373:1399 */     if (this.l == null) {
/* 1374:1400 */       return;
/* 1375:     */     }
/* 1376:1402 */     this.l.b(this.s, this.t + an() + this.l.am(), this.u);
/* 1377:     */   }
/* 1378:     */   
/* 1379:     */   public double am()
/* 1380:     */   {
/* 1381:1406 */     return 0.0D;
/* 1382:     */   }
/* 1383:     */   
/* 1384:     */   public double an()
/* 1385:     */   {
/* 1386:1410 */     return this.K * 0.75D;
/* 1387:     */   }
/* 1388:     */   
/* 1389:     */   public void a(wv paramwv)
/* 1390:     */   {
/* 1391:1414 */     this.ap = 0.0D;
/* 1392:1415 */     this.aq = 0.0D;
/* 1393:1417 */     if (paramwv == null)
/* 1394:     */     {
/* 1395:1418 */       if (this.m != null)
/* 1396:     */       {
/* 1397:1419 */         b(this.m.s, this.m.aQ().b + this.m.K, this.m.u, this.y, this.z);
/* 1398:1420 */         this.m.l = null;
/* 1399:     */       }
/* 1400:1422 */       this.m = null;
/* 1401:1423 */       return;
/* 1402:     */     }
/* 1403:1425 */     if (this.m != null) {
/* 1404:1426 */       this.m.l = null;
/* 1405:     */     }
/* 1406:1430 */     if (paramwv != null)
/* 1407:     */     {
/* 1408:1431 */       wv localwv = paramwv.m;
/* 1409:1432 */       while (localwv != null)
/* 1410:     */       {
/* 1411:1433 */         if (localwv == this) {
/* 1412:1435 */           return;
/* 1413:     */         }
/* 1414:1437 */         localwv = localwv.m;
/* 1415:     */       }
/* 1416:     */     }
/* 1417:1440 */     this.m = paramwv;
/* 1418:1441 */     paramwv.l = this;
/* 1419:     */   }
/* 1420:     */   
/* 1421:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 1422:     */   {
/* 1423:1445 */     b(paramDouble1, paramDouble2, paramDouble3);
/* 1424:1446 */     b(paramFloat1, paramFloat2);
/* 1425:     */     
/* 1426:1448 */     List localList = this.o.a(this, aQ().d(0.03125D, 0.0D, 0.03125D));
/* 1427:1449 */     if (!localList.isEmpty())
/* 1428:     */     {
/* 1429:1450 */       double d = 0.0D;
/* 1430:1451 */       for (brt localbrt : localList) {
/* 1431:1452 */         if (localbrt.e > d) {
/* 1432:1453 */           d = localbrt.e;
/* 1433:     */         }
/* 1434:     */       }
/* 1435:1457 */       paramDouble2 += d - aQ().b;
/* 1436:1458 */       b(paramDouble1, paramDouble2, paramDouble3);
/* 1437:     */     }
/* 1438:     */   }
/* 1439:     */   
/* 1440:     */   public float ao()
/* 1441:     */   {
/* 1442:1463 */     return 0.1F;
/* 1443:     */   }
/* 1444:     */   
/* 1445:     */   public brw ap()
/* 1446:     */   {
/* 1447:1467 */     return null;
/* 1448:     */   }
/* 1449:     */   
/* 1450:     */   public void aq()
/* 1451:     */   {
/* 1452:1471 */     if (this.aj > 0)
/* 1453:     */     {
/* 1454:1472 */       this.aj = ar();
/* 1455:1473 */       return;
/* 1456:     */     }
/* 1457:1476 */     double d1 = this.p - this.s;
/* 1458:1477 */     double d2 = this.r - this.u;
/* 1459:1479 */     if ((!this.o.D) && (!this.ak))
/* 1460:     */     {
/* 1461:     */       int i1;
/* 1462:1481 */       if (uv.e((float)d1) > uv.e((float)d2)) {
/* 1463:1482 */         i1 = d1 > 0.0D ? ej.e.b() : ej.f.b();
/* 1464:     */       } else {
/* 1465:1484 */         i1 = d2 > 0.0D ? ej.c.b() : ej.d.b();
/* 1466:     */       }
/* 1467:1486 */       this.an = i1;
/* 1468:     */     }
/* 1469:1489 */     this.ak = true;
/* 1470:     */   }
/* 1471:     */   
/* 1472:     */   public int ar()
/* 1473:     */   {
/* 1474:1493 */     return 300;
/* 1475:     */   }
/* 1476:     */   
/* 1477:     */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 1478:     */   {
/* 1479:1497 */     this.v = paramDouble1;
/* 1480:1498 */     this.w = paramDouble2;
/* 1481:1499 */     this.x = paramDouble3;
/* 1482:     */   }
/* 1483:     */   
/* 1484:     */   public void a(byte paramByte) {}
/* 1485:     */   
/* 1486:     */   public void as() {}
/* 1487:     */   
/* 1488:     */   public amj[] at()
/* 1489:     */   {
/* 1490:1509 */     return null;
/* 1491:     */   }
/* 1492:     */   
/* 1493:     */   public void c(int paramInt, amj paramamj) {}
/* 1494:     */   
/* 1495:     */   public boolean au()
/* 1496:     */   {
/* 1497:1517 */     int i1 = (this.o != null) && (this.o.D) ? 1 : 0;
/* 1498:     */     
/* 1499:1519 */     return (!this.ab) && ((this.i > 0) || ((i1 != 0) && (g(0))));
/* 1500:     */   }
/* 1501:     */   
/* 1502:     */   public boolean av()
/* 1503:     */   {
/* 1504:1523 */     return this.m != null;
/* 1505:     */   }
/* 1506:     */   
/* 1507:     */   public boolean aw()
/* 1508:     */   {
/* 1509:1527 */     return g(1);
/* 1510:     */   }
/* 1511:     */   
/* 1512:     */   public void c(boolean paramBoolean)
/* 1513:     */   {
/* 1514:1531 */     b(1, paramBoolean);
/* 1515:     */   }
/* 1516:     */   
/* 1517:     */   public boolean ax()
/* 1518:     */   {
/* 1519:1535 */     return g(3);
/* 1520:     */   }
/* 1521:     */   
/* 1522:     */   public void d(boolean paramBoolean)
/* 1523:     */   {
/* 1524:1539 */     b(3, paramBoolean);
/* 1525:     */   }
/* 1526:     */   
/* 1527:     */   public boolean ay()
/* 1528:     */   {
/* 1529:1543 */     return g(5);
/* 1530:     */   }
/* 1531:     */   
/* 1532:     */   public boolean f(ahd paramahd)
/* 1533:     */   {
/* 1534:1547 */     if (paramahd.v()) {
/* 1535:1548 */       return false;
/* 1536:     */     }
/* 1537:1550 */     return ay();
/* 1538:     */   }
/* 1539:     */   
/* 1540:     */   public void e(boolean paramBoolean)
/* 1541:     */   {
/* 1542:1554 */     b(5, paramBoolean);
/* 1543:     */   }
/* 1544:     */   
/* 1545:     */   public boolean az()
/* 1546:     */   {
/* 1547:1558 */     return g(4);
/* 1548:     */   }
/* 1549:     */   
/* 1550:     */   public void f(boolean paramBoolean)
/* 1551:     */   {
/* 1552:1562 */     b(4, paramBoolean);
/* 1553:     */   }
/* 1554:     */   
/* 1555:     */   protected boolean g(int paramInt)
/* 1556:     */   {
/* 1557:1566 */     return (this.ac.a(0) & 1 << paramInt) != 0;
/* 1558:     */   }
/* 1559:     */   
/* 1560:     */   protected void b(int paramInt, boolean paramBoolean)
/* 1561:     */   {
/* 1562:1570 */     int i1 = this.ac.a(0);
/* 1563:1571 */     if (paramBoolean) {
/* 1564:1572 */       this.ac.b(0, Byte.valueOf((byte)(i1 | 1 << paramInt)));
/* 1565:     */     } else {
/* 1566:1574 */       this.ac.b(0, Byte.valueOf((byte)(i1 & (1 << paramInt ^ 0xFFFFFFFF))));
/* 1567:     */     }
/* 1568:     */   }
/* 1569:     */   
/* 1570:     */   public int aA()
/* 1571:     */   {
/* 1572:1579 */     return this.ac.b(1);
/* 1573:     */   }
/* 1574:     */   
/* 1575:     */   public void h(int paramInt)
/* 1576:     */   {
/* 1577:1583 */     this.ac.b(1, Short.valueOf((short)paramInt));
/* 1578:     */   }
/* 1579:     */   
/* 1580:     */   public void a(ads paramads)
/* 1581:     */   {
/* 1582:1587 */     a(wh.b, 5.0F);
/* 1583:1588 */     this.i += 1;
/* 1584:1589 */     if (this.i == 0) {
/* 1585:1590 */       e(8);
/* 1586:     */     }
/* 1587:     */   }
/* 1588:     */   
/* 1589:     */   public void a(xm paramxm) {}
/* 1590:     */   
/* 1591:     */   protected boolean j(double paramDouble1, double paramDouble2, double paramDouble3)
/* 1592:     */   {
/* 1593:1598 */     dt localdt = new dt(paramDouble1, paramDouble2, paramDouble3);
/* 1594:     */     
/* 1595:1600 */     double d1 = paramDouble1 - localdt.n();
/* 1596:1601 */     double d2 = paramDouble2 - localdt.o();
/* 1597:1602 */     double d3 = paramDouble3 - localdt.p();
/* 1598:     */     
/* 1599:1604 */     List localList = this.o.a(aQ());
/* 1600:1606 */     if ((!localList.isEmpty()) || (this.o.u(localdt)))
/* 1601:     */     {
/* 1602:1607 */       int i1 = 3;
/* 1603:1608 */       double d4 = 9999.0D;
/* 1604:1609 */       if ((!this.o.u(localdt.e())) && (d1 < d4))
/* 1605:     */       {
/* 1606:1610 */         d4 = d1;
/* 1607:1611 */         i1 = 0;
/* 1608:     */       }
/* 1609:1613 */       if ((!this.o.u(localdt.f())) && (1.0D - d1 < d4))
/* 1610:     */       {
/* 1611:1614 */         d4 = 1.0D - d1;
/* 1612:1615 */         i1 = 1;
/* 1613:     */       }
/* 1614:1617 */       if ((!this.o.u(localdt.a())) && (1.0D - d2 < d4))
/* 1615:     */       {
/* 1616:1618 */         d4 = 1.0D - d2;
/* 1617:1619 */         i1 = 3;
/* 1618:     */       }
/* 1619:1621 */       if ((!this.o.u(localdt.c())) && (d3 < d4))
/* 1620:     */       {
/* 1621:1622 */         d4 = d3;
/* 1622:1623 */         i1 = 4;
/* 1623:     */       }
/* 1624:1625 */       if ((!this.o.u(localdt.d())) && (1.0D - d3 < d4))
/* 1625:     */       {
/* 1626:1626 */         d4 = 1.0D - d3;
/* 1627:1627 */         i1 = 5;
/* 1628:     */       }
/* 1629:1630 */       float f1 = this.V.nextFloat() * 0.2F + 0.1F;
/* 1630:1631 */       if (i1 == 0) {
/* 1631:1632 */         this.v = (-f1);
/* 1632:     */       }
/* 1633:1634 */       if (i1 == 1) {
/* 1634:1635 */         this.v = f1;
/* 1635:     */       }
/* 1636:1638 */       if (i1 == 3) {
/* 1637:1639 */         this.w = f1;
/* 1638:     */       }
/* 1639:1642 */       if (i1 == 4) {
/* 1640:1643 */         this.x = (-f1);
/* 1641:     */       }
/* 1642:1645 */       if (i1 == 5) {
/* 1643:1646 */         this.x = f1;
/* 1644:     */       }
/* 1645:1648 */       return true;
/* 1646:     */     }
/* 1647:1651 */     return false;
/* 1648:     */   }
/* 1649:     */   
/* 1650:     */   public void aB()
/* 1651:     */   {
/* 1652:1655 */     this.H = true;
/* 1653:1656 */     this.O = 0.0F;
/* 1654:     */   }
/* 1655:     */   
/* 1656:     */   public String d_()
/* 1657:     */   {
/* 1658:1661 */     if (k_()) {
/* 1659:1662 */       return aL();
/* 1660:     */     }
/* 1661:1665 */     String str = xb.b(this);
/* 1662:1666 */     if (str == null) {
/* 1663:1667 */       str = "generic";
/* 1664:     */     }
/* 1665:1670 */     return fi.a("entity." + str + ".name");
/* 1666:     */   }
/* 1667:     */   
/* 1668:     */   public wv[] aC()
/* 1669:     */   {
/* 1670:1674 */     return null;
/* 1671:     */   }
/* 1672:     */   
/* 1673:     */   public boolean k(wv paramwv)
/* 1674:     */   {
/* 1675:1679 */     return this == paramwv;
/* 1676:     */   }
/* 1677:     */   
/* 1678:     */   public float aD()
/* 1679:     */   {
/* 1680:1683 */     return 0.0F;
/* 1681:     */   }
/* 1682:     */   
/* 1683:     */   public void f(float paramFloat) {}
/* 1684:     */   
/* 1685:     */   public boolean aE()
/* 1686:     */   {
/* 1687:1690 */     return true;
/* 1688:     */   }
/* 1689:     */   
/* 1690:     */   public boolean l(wv paramwv)
/* 1691:     */   {
/* 1692:1694 */     return false;
/* 1693:     */   }
/* 1694:     */   
/* 1695:     */   public String toString()
/* 1696:     */   {
/* 1697:1699 */     return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", new Object[] { getClass().getSimpleName(), d_(), Integer.valueOf(this.c), this.o == null ? "~NULL~" : this.o.P().k(), Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u) });
/* 1698:     */   }
/* 1699:     */   
/* 1700:     */   public boolean b(wh paramwh)
/* 1701:     */   {
/* 1702:1703 */     return (this.ar) && (paramwh != wh.j) && (!paramwh.u());
/* 1703:     */   }
/* 1704:     */   
/* 1705:     */   public void m(wv paramwv)
/* 1706:     */   {
/* 1707:1707 */     b(paramwv.s, paramwv.t, paramwv.u, paramwv.y, paramwv.z);
/* 1708:     */   }
/* 1709:     */   
/* 1710:     */   public void n(wv paramwv)
/* 1711:     */   {
/* 1712:1711 */     fn localfn = new fn();
/* 1713:1712 */     paramwv.e(localfn);
/* 1714:1713 */     f(localfn);
/* 1715:1714 */     this.aj = paramwv.aj;
/* 1716:1715 */     this.an = paramwv.an;
/* 1717:     */   }
/* 1718:     */   
/* 1719:     */   public void c(int paramInt)
/* 1720:     */   {
/* 1721:1719 */     if ((this.o.D) || (this.I)) {
/* 1722:1720 */       return;
/* 1723:     */     }
/* 1724:1722 */     this.o.B.a("changeDimension");
/* 1725:     */     
/* 1726:1724 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 1727:1725 */     int i1 = this.am;
/* 1728:1726 */     qt localqt1 = localMinecraftServer.a(i1);
/* 1729:1727 */     qt localqt2 = localMinecraftServer.a(paramInt);
/* 1730:1728 */     this.am = paramInt;
/* 1731:1730 */     if ((i1 == 1) && (paramInt == 1))
/* 1732:     */     {
/* 1733:1731 */       localqt2 = localMinecraftServer.a(0);
/* 1734:1732 */       this.am = 0;
/* 1735:     */     }
/* 1736:1735 */     this.o.e(this);
/* 1737:1736 */     this.I = false;
/* 1738:1737 */     this.o.B.a("reposition");
/* 1739:1738 */     localMinecraftServer.an().a(this, i1, localqt1, localqt2);
/* 1740:1739 */     this.o.B.c("reloading");
/* 1741:1740 */     wv localwv = xb.a(xb.b(this), localqt2);
/* 1742:1742 */     if (localwv != null)
/* 1743:     */     {
/* 1744:1743 */       localwv.n(this);
/* 1745:1745 */       if ((i1 == 1) && (paramInt == 1))
/* 1746:     */       {
/* 1747:1746 */         dt localdt = this.o.r(localqt2.M());
/* 1748:1747 */         localwv.a(localdt, localwv.y, localwv.z);
/* 1749:     */       }
/* 1750:1750 */       localqt2.d(localwv);
/* 1751:     */     }
/* 1752:1753 */     this.I = true;
/* 1753:1754 */     this.o.B.b();
/* 1754:     */     
/* 1755:1756 */     localqt1.j();
/* 1756:1757 */     localqt2.j();
/* 1757:1758 */     this.o.B.b();
/* 1758:     */   }
/* 1759:     */   
/* 1760:     */   public float a(aqo paramaqo, aqu paramaqu, dt paramdt, bec parambec)
/* 1761:     */   {
/* 1762:1762 */     return parambec.c().a(this);
/* 1763:     */   }
/* 1764:     */   
/* 1765:     */   public boolean a(aqo paramaqo, aqu paramaqu, dt paramdt, bec parambec, float paramFloat)
/* 1766:     */   {
/* 1767:1766 */     return true;
/* 1768:     */   }
/* 1769:     */   
/* 1770:     */   public int aF()
/* 1771:     */   {
/* 1772:1770 */     return 3;
/* 1773:     */   }
/* 1774:     */   
/* 1775:     */   public int aG()
/* 1776:     */   {
/* 1777:1774 */     return this.an;
/* 1778:     */   }
/* 1779:     */   
/* 1780:     */   public boolean aH()
/* 1781:     */   {
/* 1782:1778 */     return false;
/* 1783:     */   }
/* 1784:     */   
/* 1785:     */   public void a(j paramj)
/* 1786:     */   {
/* 1787:1782 */     paramj.a("Entity Type", new ww(this));
/* 1788:     */     
/* 1789:     */ 
/* 1790:     */ 
/* 1791:     */ 
/* 1792:     */ 
/* 1793:1788 */     paramj.a("Entity ID", Integer.valueOf(this.c));
/* 1794:1789 */     paramj.a("Entity Name", new wx(this));
/* 1795:     */     
/* 1796:     */ 
/* 1797:     */ 
/* 1798:     */ 
/* 1799:     */ 
/* 1800:1795 */     paramj.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u) }));
/* 1801:1796 */     paramj.a("Entity's Block location", j.a(uv.c(this.s), uv.c(this.t), uv.c(this.u)));
/* 1802:1797 */     paramj.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.v), Double.valueOf(this.w), Double.valueOf(this.x) }));
/* 1803:1798 */     paramj.a("Entity's Rider", new wy(this));
/* 1804:     */     
/* 1805:     */ 
/* 1806:     */ 
/* 1807:     */ 
/* 1808:     */ 
/* 1809:1804 */     paramj.a("Entity's Vehicle", new wz(this));
/* 1810:     */   }
/* 1811:     */   
/* 1812:     */   public boolean aI()
/* 1813:     */   {
/* 1814:1813 */     return au();
/* 1815:     */   }
/* 1816:     */   
/* 1817:     */   public UUID aJ()
/* 1818:     */   {
/* 1819:1817 */     return this.ao;
/* 1820:     */   }
/* 1821:     */   
/* 1822:     */   public boolean aK()
/* 1823:     */   {
/* 1824:1821 */     return true;
/* 1825:     */   }
/* 1826:     */   
/* 1827:     */   public ho e_()
/* 1828:     */   {
/* 1829:1826 */     hy localhy = new hy(d_());
/* 1830:1827 */     localhy.b().a(aP());
/* 1831:1828 */     localhy.b().a(aJ().toString());
/* 1832:1829 */     return localhy;
/* 1833:     */   }
/* 1834:     */   
/* 1835:     */   public void a(String paramString)
/* 1836:     */   {
/* 1837:1833 */     this.ac.b(2, paramString);
/* 1838:     */   }
/* 1839:     */   
/* 1840:     */   public String aL()
/* 1841:     */   {
/* 1842:1837 */     return this.ac.e(2);
/* 1843:     */   }
/* 1844:     */   
/* 1845:     */   public boolean k_()
/* 1846:     */   {
/* 1847:1841 */     return this.ac.e(2).length() > 0;
/* 1848:     */   }
/* 1849:     */   
/* 1850:     */   public void g(boolean paramBoolean)
/* 1851:     */   {
/* 1852:1845 */     this.ac.b(3, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 1853:     */   }
/* 1854:     */   
/* 1855:     */   public boolean aM()
/* 1856:     */   {
/* 1857:1849 */     return this.ac.a(3) == 1;
/* 1858:     */   }
/* 1859:     */   
/* 1860:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3)
/* 1861:     */   {
/* 1862:1853 */     b(paramDouble1, paramDouble2, paramDouble3, this.y, this.z);
/* 1863:     */   }
/* 1864:     */   
/* 1865:     */   public boolean aN()
/* 1866:     */   {
/* 1867:1857 */     return aM();
/* 1868:     */   }
/* 1869:     */   
/* 1870:     */   public void i(int paramInt) {}
/* 1871:     */   
/* 1872:     */   public ej aO()
/* 1873:     */   {
/* 1874:1864 */     return ej.b(uv.c(this.y * 4.0F / 360.0F + 0.5D) & 0x3);
/* 1875:     */   }
/* 1876:     */   
/* 1877:     */   protected hr aP()
/* 1878:     */   {
/* 1879:1868 */     fn localfn = new fn();
/* 1880:1869 */     String str = xb.b(this);
/* 1881:     */     
/* 1882:1871 */     localfn.a("id", aJ().toString());
/* 1883:1872 */     if (str != null) {
/* 1884:1873 */       localfn.a("type", str);
/* 1885:     */     }
/* 1886:1875 */     localfn.a("name", d_());
/* 1887:     */     
/* 1888:1877 */     return new hr(hs.d, new hy(localfn.toString()));
/* 1889:     */   }
/* 1890:     */   
/* 1891:     */   public boolean a(qw paramqw)
/* 1892:     */   {
/* 1893:1881 */     return true;
/* 1894:     */   }
/* 1895:     */   
/* 1896:     */   public brt aQ()
/* 1897:     */   {
/* 1898:1885 */     return this.f;
/* 1899:     */   }
/* 1900:     */   
/* 1901:     */   public void a(brt parambrt)
/* 1902:     */   {
/* 1903:1889 */     this.f = parambrt;
/* 1904:     */   }
/* 1905:     */   
/* 1906:     */   public float aR()
/* 1907:     */   {
/* 1908:1893 */     return this.K * 0.85F;
/* 1909:     */   }
/* 1910:     */   
/* 1911:     */   public boolean aS()
/* 1912:     */   {
/* 1913:1897 */     return this.g;
/* 1914:     */   }
/* 1915:     */   
/* 1916:     */   public void h(boolean paramBoolean)
/* 1917:     */   {
/* 1918:1901 */     this.g = paramBoolean;
/* 1919:     */   }
/* 1920:     */   
/* 1921:     */   public boolean d(int paramInt, amj paramamj)
/* 1922:     */   {
/* 1923:1905 */     return false;
/* 1924:     */   }
/* 1925:     */   
/* 1926:     */   public void a(ho paramho) {}
/* 1927:     */   
/* 1928:     */   public boolean a(int paramInt, String paramString)
/* 1929:     */   {
/* 1930:1914 */     return true;
/* 1931:     */   }
/* 1932:     */   
/* 1933:     */   public dt c()
/* 1934:     */   {
/* 1935:1919 */     return new dt(this.s, this.t + 0.5D, this.u);
/* 1936:     */   }
/* 1937:     */   
/* 1938:     */   public brw d()
/* 1939:     */   {
/* 1940:1924 */     return new brw(this.s, this.t, this.u);
/* 1941:     */   }
/* 1942:     */   
/* 1943:     */   public aqu e()
/* 1944:     */   {
/* 1945:1929 */     return this.o;
/* 1946:     */   }
/* 1947:     */   
/* 1948:     */   public wv f()
/* 1949:     */   {
/* 1950:1934 */     return this;
/* 1951:     */   }
/* 1952:     */   
/* 1953:     */   public boolean t_()
/* 1954:     */   {
/* 1955:1939 */     return false;
/* 1956:     */   }
/* 1957:     */   
/* 1958:     */   public void a(ag paramag, int paramInt)
/* 1959:     */   {
/* 1960:1944 */     this.as.a(this, paramag, paramInt);
/* 1961:     */   }
/* 1962:     */   
/* 1963:     */   public af aT()
/* 1964:     */   {
/* 1965:1948 */     return this.as;
/* 1966:     */   }
/* 1967:     */   
/* 1968:     */   public void o(wv paramwv)
/* 1969:     */   {
/* 1970:1952 */     this.as.a(paramwv.aT());
/* 1971:     */   }
/* 1972:     */   
/* 1973:     */   public fn aU()
/* 1974:     */   {
/* 1975:1957 */     return null;
/* 1976:     */   }
/* 1977:     */   
/* 1978:     */   public void g(fn paramfn) {}
/* 1979:     */   
/* 1980:     */   public boolean a(ahd paramahd, brw parambrw)
/* 1981:     */   {
/* 1982:1964 */     return false;
/* 1983:     */   }
/* 1984:     */   
/* 1985:     */   public boolean aV()
/* 1986:     */   {
/* 1987:1968 */     return false;
/* 1988:     */   }
/* 1989:     */   
/* 1990:     */   protected void a(xm paramxm, wv paramwv)
/* 1991:     */   {
/* 1992:1972 */     if ((paramwv instanceof xm)) {
/* 1993:1973 */       aph.a((xm)paramwv, paramxm);
/* 1994:     */     }
/* 1995:1975 */     aph.b(paramxm, paramwv);
/* 1996:     */   }
/* 1997:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     wv
 * JD-Core Version:    0.7.0.1
 */