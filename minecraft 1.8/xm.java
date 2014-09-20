/*    1:     */ import com.google.common.collect.Maps;
/*    2:     */ import java.util.Collection;
/*    3:     */ import java.util.Iterator;
/*    4:     */ import java.util.List;
/*    5:     */ import java.util.Map;
/*    6:     */ import java.util.Random;
/*    7:     */ import java.util.Set;
/*    8:     */ import java.util.UUID;
/*    9:     */ 
/*   10:     */ public abstract class xm
/*   11:     */   extends wv
/*   12:     */ {
/*   13:  44 */   private static final UUID a = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
/*   14:  45 */   private static final ya b = new ya(a, "Sprinting speed boost", 0.300000011920929D, 2).a(false);
/*   15:     */   private yc c;
/*   16:  64 */   private final wg f = new wg(this);
/*   17:  65 */   private final Map g = Maps.newHashMap();
/*   18:  66 */   private final amj[] h = new amj[5];
/*   19:     */   public boolean ap;
/*   20:     */   public int aq;
/*   21:     */   public int ar;
/*   22:     */   public int as;
/*   23:     */   public int at;
/*   24:     */   public float au;
/*   25:     */   public int av;
/*   26:     */   public float aw;
/*   27:     */   public float ax;
/*   28:     */   public float ay;
/*   29:     */   public float az;
/*   30:     */   public float aA;
/*   31:  78 */   public int aB = 20;
/*   32:     */   public float aC;
/*   33:     */   public float aD;
/*   34:     */   public float aE;
/*   35:     */   public float aF;
/*   36:     */   public float aG;
/*   37:     */   public float aH;
/*   38:     */   public float aI;
/*   39:     */   public float aJ;
/*   40:  84 */   public float aK = 0.02F;
/*   41:     */   protected ahd aL;
/*   42:     */   protected int aM;
/*   43:     */   protected boolean aN;
/*   44:     */   protected int aO;
/*   45:     */   protected float aP;
/*   46:     */   protected float aQ;
/*   47:     */   protected float aR;
/*   48:     */   protected float aS;
/*   49:     */   protected float aT;
/*   50:     */   protected int aU;
/*   51:     */   protected float aV;
/*   52:     */   protected boolean aW;
/*   53:     */   public float aX;
/*   54:     */   public float aY;
/*   55:     */   protected float aZ;
/*   56:     */   protected int ba;
/*   57:     */   protected double bb;
/*   58:     */   protected double bc;
/*   59:     */   protected double bd;
/*   60:     */   protected double be;
/*   61:     */   protected double bf;
/*   62: 100 */   private boolean i = true;
/*   63:     */   private xm bg;
/*   64:     */   private int bh;
/*   65:     */   private xm bi;
/*   66:     */   private int bj;
/*   67:     */   private float bk;
/*   68:     */   private int bl;
/*   69:     */   private float bm;
/*   70:     */   
/*   71:     */   public void G()
/*   72:     */   {
/*   73: 111 */     a(wh.j, 3.4028235E+38F);
/*   74:     */   }
/*   75:     */   
/*   76:     */   public xm(aqu paramaqu)
/*   77:     */   {
/*   78: 115 */     super(paramaqu);
/*   79:     */     
/*   80: 117 */     aW();
/*   81: 118 */     h(bt());
/*   82:     */     
/*   83: 120 */     this.k = true;
/*   84: 121 */     this.aF = ((float)((Math.random() + 1.0D) * 0.009999999776482582D));
/*   85: 122 */     b(this.s, this.t, this.u);
/*   86: 123 */     this.aE = ((float)Math.random() * 12398.0F);
/*   87: 124 */     this.y = ((float)(Math.random() * 3.141592741012573D * 2.0D));
/*   88: 125 */     this.aI = this.y;
/*   89: 126 */     this.S = 0.6F;
/*   90:     */   }
/*   91:     */   
/*   92:     */   protected void h()
/*   93:     */   {
/*   94: 131 */     this.ac.a(7, Integer.valueOf(0));
/*   95: 132 */     this.ac.a(8, Byte.valueOf((byte)0));
/*   96: 133 */     this.ac.a(9, Byte.valueOf((byte)0));
/*   97: 134 */     this.ac.a(6, Float.valueOf(1.0F));
/*   98:     */   }
/*   99:     */   
/*  100:     */   protected void aW()
/*  101:     */   {
/*  102: 138 */     bx().b(afs.a);
/*  103: 139 */     bx().b(afs.c);
/*  104: 140 */     bx().b(afs.d);
/*  105:     */   }
/*  106:     */   
/*  107:     */   protected void a(double paramDouble, boolean paramBoolean, atr paramatr, dt paramdt)
/*  108:     */   {
/*  109: 145 */     if (!V()) {
/*  110: 147 */       W();
/*  111:     */     }
/*  112: 150 */     if ((!this.o.D) && (this.O > 3.0F) && (paramBoolean))
/*  113:     */     {
/*  114: 151 */       bec localbec = this.o.p(paramdt);
/*  115: 152 */       atr localatr = localbec.c();
/*  116: 153 */       float f1 = uv.f(this.O - 3.0F);
/*  117: 154 */       if (localatr.r() != bof.a)
/*  118:     */       {
/*  119: 155 */         double d = Math.min(0.2F + f1 / 15.0F, 10.0F);
/*  120: 156 */         if (d > 2.5D) {
/*  121: 157 */           d = 2.5D;
/*  122:     */         }
/*  123: 159 */         int j = (int)(150.0D * d);
/*  124: 160 */         ((qt)this.o).a(ew.M, this.s, this.t, this.u, j, 0.0D, 0.0D, 0.0D, 0.1500000059604645D, new int[] { atr.f(localbec) });
/*  125:     */       }
/*  126:     */     }
/*  127: 164 */     super.a(paramDouble, paramBoolean, paramatr, paramdt);
/*  128:     */   }
/*  129:     */   
/*  130:     */   public boolean aX()
/*  131:     */   {
/*  132: 168 */     return false;
/*  133:     */   }
/*  134:     */   
/*  135:     */   public void K()
/*  136:     */   {
/*  137: 173 */     this.aw = this.ax;
/*  138: 174 */     super.K();
/*  139:     */     
/*  140: 176 */     this.o.B.a("livingEntityBaseTick");
/*  141:     */     
/*  142: 178 */     boolean bool = this instanceof ahd;
/*  143: 179 */     if (ai()) {
/*  144: 180 */       if (aj())
/*  145:     */       {
/*  146: 181 */         a(wh.e, 1.0F);
/*  147:     */       }
/*  148: 182 */       else if ((bool) && (!this.o.af().a(aQ())))
/*  149:     */       {
/*  150: 183 */         double d = this.o.af().a(this) + this.o.af().m();
/*  151: 184 */         if (d < 0.0D) {
/*  152: 185 */           a(wh.e, Math.max(1, uv.c(-d * this.o.af().n())));
/*  153:     */         }
/*  154:     */       }
/*  155:     */     }
/*  156: 190 */     if ((T()) || (this.o.D)) {
/*  157: 191 */       N();
/*  158:     */     }
/*  159: 193 */     int j = (bool) && (((ahd)this).by.a) ? 1 : 0;
/*  160: 195 */     if ((ai()) && (a(bof.h)))
/*  161:     */     {
/*  162: 196 */       if ((!aX()) && (!k(wp.o.H)) && (j == 0))
/*  163:     */       {
/*  164: 197 */         h(j(aA()));
/*  165: 198 */         if (aA() == -20)
/*  166:     */         {
/*  167: 199 */           h(0);
/*  168: 200 */           for (int k = 0; k < 8; k++)
/*  169:     */           {
/*  170: 201 */             float f1 = this.V.nextFloat() - this.V.nextFloat();
/*  171: 202 */             float f2 = this.V.nextFloat() - this.V.nextFloat();
/*  172: 203 */             float f3 = this.V.nextFloat() - this.V.nextFloat();
/*  173: 204 */             this.o.a(ew.e, this.s + f1, this.t + f2, this.u + f3, this.v, this.w, this.x, new int[0]);
/*  174:     */           }
/*  175: 206 */           a(wh.f, 2.0F);
/*  176:     */         }
/*  177:     */       }
/*  178: 210 */       if ((!this.o.D) && (av()) && ((this.m instanceof xm))) {
/*  179: 211 */         a(null);
/*  180:     */       }
/*  181:     */     }
/*  182:     */     else
/*  183:     */     {
/*  184: 214 */       h(300);
/*  185:     */     }
/*  186: 217 */     if ((ai()) && (U())) {
/*  187: 218 */       N();
/*  188:     */     }
/*  189: 221 */     this.aC = this.aD;
/*  190: 223 */     if (this.as > 0) {
/*  191: 224 */       this.as -= 1;
/*  192:     */     }
/*  193: 226 */     if ((this.Z > 0) && (!(this instanceof qw))) {
/*  194: 227 */       this.Z -= 1;
/*  195:     */     }
/*  196: 229 */     if (bm() <= 0.0F) {
/*  197: 230 */       aY();
/*  198:     */     }
/*  199: 232 */     if (this.aM > 0) {
/*  200: 233 */       this.aM -= 1;
/*  201:     */     } else {
/*  202: 235 */       this.aL = null;
/*  203:     */     }
/*  204: 237 */     if ((this.bi != null) && (!this.bi.ai())) {
/*  205: 238 */       this.bi = null;
/*  206:     */     }
/*  207: 241 */     if (this.bg != null) {
/*  208: 242 */       if (!this.bg.ai()) {
/*  209: 243 */         b(null);
/*  210: 244 */       } else if (this.W - this.bh > 100) {
/*  211: 245 */         b(null);
/*  212:     */       }
/*  213:     */     }
/*  214: 250 */     bh();
/*  215:     */     
/*  216: 252 */     this.aS = this.aR;
/*  217:     */     
/*  218: 254 */     this.aH = this.aG;
/*  219: 255 */     this.aJ = this.aI;
/*  220: 256 */     this.A = this.y;
/*  221: 257 */     this.B = this.z;
/*  222:     */     
/*  223: 259 */     this.o.B.b();
/*  224:     */   }
/*  225:     */   
/*  226:     */   public boolean i_()
/*  227:     */   {
/*  228: 263 */     return false;
/*  229:     */   }
/*  230:     */   
/*  231:     */   protected void aY()
/*  232:     */   {
/*  233: 267 */     this.av += 1;
/*  234: 268 */     if (this.av == 20)
/*  235:     */     {
/*  236: 269 */       if ((!this.o.D) && ((this.aM > 0) || (ba())) && 
/*  237: 270 */         (aZ()) && (this.o.Q().b("doMobLoot")))
/*  238:     */       {
/*  239: 271 */         j = b(this.aL);
/*  240: 272 */         while (j > 0)
/*  241:     */         {
/*  242: 273 */           int k = xk.a(j);
/*  243: 274 */           j -= k;
/*  244: 275 */           this.o.d(new xk(this.o, this.s, this.t, this.u, k));
/*  245:     */         }
/*  246:     */       }
/*  247: 280 */       J();
/*  248: 281 */       for (int j = 0; j < 20; j++)
/*  249:     */       {
/*  250: 282 */         double d1 = this.V.nextGaussian() * 0.02D;
/*  251: 283 */         double d2 = this.V.nextGaussian() * 0.02D;
/*  252: 284 */         double d3 = this.V.nextGaussian() * 0.02D;
/*  253: 285 */         this.o.a(ew.a, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, d1, d2, d3, new int[0]);
/*  254:     */       }
/*  255:     */     }
/*  256:     */   }
/*  257:     */   
/*  258:     */   protected boolean aZ()
/*  259:     */   {
/*  260: 291 */     return !i_();
/*  261:     */   }
/*  262:     */   
/*  263:     */   protected int j(int paramInt)
/*  264:     */   {
/*  265: 295 */     int j = aph.a(this);
/*  266: 296 */     if ((j > 0) && 
/*  267: 297 */       (this.V.nextInt(j + 1) > 0)) {
/*  268: 299 */       return paramInt;
/*  269:     */     }
/*  270: 302 */     return paramInt - 1;
/*  271:     */   }
/*  272:     */   
/*  273:     */   protected int b(ahd paramahd)
/*  274:     */   {
/*  275: 306 */     return 0;
/*  276:     */   }
/*  277:     */   
/*  278:     */   protected boolean ba()
/*  279:     */   {
/*  280: 310 */     return false;
/*  281:     */   }
/*  282:     */   
/*  283:     */   public Random bb()
/*  284:     */   {
/*  285: 314 */     return this.V;
/*  286:     */   }
/*  287:     */   
/*  288:     */   public xm bc()
/*  289:     */   {
/*  290: 318 */     return this.bg;
/*  291:     */   }
/*  292:     */   
/*  293:     */   public int bd()
/*  294:     */   {
/*  295: 322 */     return this.bh;
/*  296:     */   }
/*  297:     */   
/*  298:     */   public void b(xm paramxm)
/*  299:     */   {
/*  300: 326 */     this.bg = paramxm;
/*  301: 327 */     this.bh = this.W;
/*  302:     */   }
/*  303:     */   
/*  304:     */   public xm be()
/*  305:     */   {
/*  306: 331 */     return this.bi;
/*  307:     */   }
/*  308:     */   
/*  309:     */   public int bf()
/*  310:     */   {
/*  311: 335 */     return this.bj;
/*  312:     */   }
/*  313:     */   
/*  314:     */   public void p(wv paramwv)
/*  315:     */   {
/*  316: 339 */     if ((paramwv instanceof xm)) {
/*  317: 340 */       this.bi = ((xm)paramwv);
/*  318:     */     } else {
/*  319: 342 */       this.bi = null;
/*  320:     */     }
/*  321: 344 */     this.bj = this.W;
/*  322:     */   }
/*  323:     */   
/*  324:     */   public int bg()
/*  325:     */   {
/*  326: 348 */     return this.aO;
/*  327:     */   }
/*  328:     */   
/*  329:     */   public void b(fn paramfn)
/*  330:     */   {
/*  331: 353 */     paramfn.a("HealF", bm());
/*  332: 354 */     paramfn.a("Health", (short)(int)Math.ceil(bm()));
/*  333: 355 */     paramfn.a("HurtTime", (short)this.as);
/*  334: 356 */     paramfn.a("HurtByTimestamp", this.bh);
/*  335: 357 */     paramfn.a("DeathTime", (short)this.av);
/*  336: 358 */     paramfn.a("AbsorptionAmount", bM());
/*  337:     */     Object localObject2;
/*  338: 360 */     for (localObject2 : at()) {
/*  339: 361 */       if (localObject2 != null) {
/*  340: 362 */         this.c.a(localObject2.B());
/*  341:     */       }
/*  342:     */     }
/*  343: 366 */     paramfn.a("Attributes", afs.a(bx()));
/*  344: 368 */     for (localObject2 : at()) {
/*  345: 369 */       if (localObject2 != null) {
/*  346: 370 */         this.c.b(localObject2.B());
/*  347:     */       }
/*  348:     */     }
/*  349: 374 */     if (!this.g.isEmpty())
/*  350:     */     {
/*  351: 375 */       ??? = new fv();
/*  352: 377 */       for (wq localwq : this.g.values()) {
/*  353: 378 */         ((fv)???).a(localwq.a(new fn()));
/*  354:     */       }
/*  355: 380 */       paramfn.a("ActiveEffects", (gd)???);
/*  356:     */     }
/*  357:     */   }
/*  358:     */   
/*  359:     */   public void a(fn paramfn)
/*  360:     */   {
/*  361: 386 */     l(paramfn.h("AbsorptionAmount"));
/*  362: 388 */     if ((paramfn.b("Attributes", 9)) && (this.o != null) && (!this.o.D)) {
/*  363: 389 */       afs.a(bx(), paramfn.c("Attributes", 10));
/*  364:     */     }
/*  365:     */     Object localObject;
/*  366: 392 */     if (paramfn.b("ActiveEffects", 9))
/*  367:     */     {
/*  368: 393 */       localObject = paramfn.c("ActiveEffects", 10);
/*  369: 394 */       for (int j = 0; j < ((fv)localObject).c(); j++)
/*  370:     */       {
/*  371: 395 */         fn localfn = ((fv)localObject).b(j);
/*  372: 396 */         wq localwq = wq.b(localfn);
/*  373: 397 */         if (localwq != null) {
/*  374: 398 */           this.g.put(Integer.valueOf(localwq.a()), localwq);
/*  375:     */         }
/*  376:     */       }
/*  377:     */     }
/*  378: 403 */     if (paramfn.b("HealF", 99))
/*  379:     */     {
/*  380: 404 */       h(paramfn.h("HealF"));
/*  381:     */     }
/*  382:     */     else
/*  383:     */     {
/*  384: 406 */       localObject = paramfn.a("Health");
/*  385: 407 */       if (localObject == null) {
/*  386: 408 */         h(bt());
/*  387: 409 */       } else if (((gd)localObject).a() == 5) {
/*  388: 410 */         h(((fs)localObject).h());
/*  389: 411 */       } else if (((gd)localObject).a() == 2) {
/*  390: 413 */         h(((gb)localObject).e());
/*  391:     */       }
/*  392:     */     }
/*  393: 417 */     this.as = paramfn.e("HurtTime");
/*  394: 418 */     this.av = paramfn.e("DeathTime");
/*  395: 419 */     this.bh = paramfn.f("HurtByTimestamp");
/*  396:     */   }
/*  397:     */   
/*  398:     */   protected void bh()
/*  399:     */   {
/*  400: 423 */     Iterator localIterator = this.g.keySet().iterator();
/*  401: 424 */     while (localIterator.hasNext())
/*  402:     */     {
/*  403: 425 */       Integer localInteger = (Integer)localIterator.next();
/*  404: 426 */       wq localwq = (wq)this.g.get(localInteger);
/*  405: 428 */       if (!localwq.a(this))
/*  406:     */       {
/*  407: 429 */         if (!this.o.D)
/*  408:     */         {
/*  409: 430 */           localIterator.remove();
/*  410: 431 */           b(localwq);
/*  411:     */         }
/*  412:     */       }
/*  413: 433 */       else if (localwq.b() % 600 == 0) {
/*  414: 436 */         a(localwq, false);
/*  415:     */       }
/*  416:     */     }
/*  417: 440 */     if (this.i)
/*  418:     */     {
/*  419: 441 */       if (!this.o.D) {
/*  420: 442 */         B();
/*  421:     */       }
/*  422: 444 */       this.i = false;
/*  423:     */     }
/*  424: 446 */     int j = this.ac.c(7);
/*  425: 447 */     int k = this.ac.a(8) > 0 ? 1 : 0;
/*  426: 449 */     if (j > 0)
/*  427:     */     {
/*  428: 450 */       boolean bool = false;
/*  429: 452 */       if (!ay()) {
/*  430: 453 */         bool = this.V.nextBoolean();
/*  431:     */       } else {
/*  432: 456 */         bool = this.V.nextInt(15) == 0;
/*  433:     */       }
/*  434: 459 */       if (k != 0) {
/*  435: 460 */         bool &= this.V.nextInt(5) == 0;
/*  436:     */       }
/*  437: 463 */       if ((bool) && 
/*  438: 464 */         (j > 0))
/*  439:     */       {
/*  440: 465 */         double d1 = (j >> 16 & 0xFF) / 255.0D;
/*  441: 466 */         double d2 = (j >> 8 & 0xFF) / 255.0D;
/*  442: 467 */         double d3 = (j >> 0 & 0xFF) / 255.0D;
/*  443:     */         
/*  444: 469 */         this.o.a(k != 0 ? ew.q : ew.p, this.s + (this.V.nextDouble() - 0.5D) * this.J, this.t + this.V.nextDouble() * this.K, this.u + (this.V.nextDouble() - 0.5D) * this.J, d1, d2, d3, new int[0]);
/*  445:     */       }
/*  446:     */     }
/*  447:     */   }
/*  448:     */   
/*  449:     */   protected void B()
/*  450:     */   {
/*  451: 476 */     if (this.g.isEmpty())
/*  452:     */     {
/*  453: 477 */       bi();
/*  454: 478 */       e(false);
/*  455:     */     }
/*  456:     */     else
/*  457:     */     {
/*  458: 480 */       int j = ans.a(this.g.values());
/*  459: 481 */       this.ac.b(8, Byte.valueOf((byte)(ans.b(this.g.values()) ? 1 : 0)));
/*  460: 482 */       this.ac.b(7, Integer.valueOf(j));
/*  461: 483 */       e(k(wp.p.H));
/*  462:     */     }
/*  463:     */   }
/*  464:     */   
/*  465:     */   protected void bi()
/*  466:     */   {
/*  467: 488 */     this.ac.b(8, Byte.valueOf((byte)0));
/*  468: 489 */     this.ac.b(7, Integer.valueOf(0));
/*  469:     */   }
/*  470:     */   
/*  471:     */   public void bj()
/*  472:     */   {
/*  473: 493 */     Iterator localIterator = this.g.keySet().iterator();
/*  474: 494 */     while (localIterator.hasNext())
/*  475:     */     {
/*  476: 495 */       Integer localInteger = (Integer)localIterator.next();
/*  477: 496 */       wq localwq = (wq)this.g.get(localInteger);
/*  478: 498 */       if (!this.o.D)
/*  479:     */       {
/*  480: 499 */         localIterator.remove();
/*  481: 500 */         b(localwq);
/*  482:     */       }
/*  483:     */     }
/*  484:     */   }
/*  485:     */   
/*  486:     */   public Collection bk()
/*  487:     */   {
/*  488: 506 */     return this.g.values();
/*  489:     */   }
/*  490:     */   
/*  491:     */   public boolean k(int paramInt)
/*  492:     */   {
/*  493: 510 */     return this.g.containsKey(Integer.valueOf(paramInt));
/*  494:     */   }
/*  495:     */   
/*  496:     */   public boolean a(wp paramwp)
/*  497:     */   {
/*  498: 514 */     return this.g.containsKey(Integer.valueOf(paramwp.H));
/*  499:     */   }
/*  500:     */   
/*  501:     */   public wq b(wp paramwp)
/*  502:     */   {
/*  503: 518 */     return (wq)this.g.get(Integer.valueOf(paramwp.H));
/*  504:     */   }
/*  505:     */   
/*  506:     */   public void c(wq paramwq)
/*  507:     */   {
/*  508: 522 */     if (!d(paramwq)) {
/*  509: 523 */       return;
/*  510:     */     }
/*  511: 526 */     if (this.g.containsKey(Integer.valueOf(paramwq.a())))
/*  512:     */     {
/*  513: 528 */       ((wq)this.g.get(Integer.valueOf(paramwq.a()))).a(paramwq);
/*  514: 529 */       a((wq)this.g.get(Integer.valueOf(paramwq.a())), true);
/*  515:     */     }
/*  516:     */     else
/*  517:     */     {
/*  518: 531 */       this.g.put(Integer.valueOf(paramwq.a()), paramwq);
/*  519: 532 */       a(paramwq);
/*  520:     */     }
/*  521:     */   }
/*  522:     */   
/*  523:     */   public boolean d(wq paramwq)
/*  524:     */   {
/*  525: 537 */     if (by() == xs.b)
/*  526:     */     {
/*  527: 538 */       int j = paramwq.a();
/*  528: 539 */       if ((j == wp.l.H) || (j == wp.u.H)) {
/*  529: 540 */         return false;
/*  530:     */       }
/*  531:     */     }
/*  532: 544 */     return true;
/*  533:     */   }
/*  534:     */   
/*  535:     */   public boolean bl()
/*  536:     */   {
/*  537: 548 */     return by() == xs.b;
/*  538:     */   }
/*  539:     */   
/*  540:     */   public void l(int paramInt)
/*  541:     */   {
/*  542: 552 */     this.g.remove(Integer.valueOf(paramInt));
/*  543:     */   }
/*  544:     */   
/*  545:     */   public void m(int paramInt)
/*  546:     */   {
/*  547: 556 */     wq localwq = (wq)this.g.remove(Integer.valueOf(paramInt));
/*  548: 557 */     if (localwq != null) {
/*  549: 558 */       b(localwq);
/*  550:     */     }
/*  551:     */   }
/*  552:     */   
/*  553:     */   protected void a(wq paramwq)
/*  554:     */   {
/*  555: 563 */     this.i = true;
/*  556: 564 */     if (!this.o.D) {
/*  557: 565 */       wp.a[paramwq.a()].b(this, bx(), paramwq.c());
/*  558:     */     }
/*  559:     */   }
/*  560:     */   
/*  561:     */   protected void a(wq paramwq, boolean paramBoolean)
/*  562:     */   {
/*  563: 570 */     this.i = true;
/*  564: 571 */     if ((paramBoolean) && (!this.o.D))
/*  565:     */     {
/*  566: 572 */       wp.a[paramwq.a()].a(this, bx(), paramwq.c());
/*  567: 573 */       wp.a[paramwq.a()].b(this, bx(), paramwq.c());
/*  568:     */     }
/*  569:     */   }
/*  570:     */   
/*  571:     */   protected void b(wq paramwq)
/*  572:     */   {
/*  573: 578 */     this.i = true;
/*  574: 579 */     if (!this.o.D) {
/*  575: 580 */       wp.a[paramwq.a()].a(this, bx(), paramwq.c());
/*  576:     */     }
/*  577:     */   }
/*  578:     */   
/*  579:     */   public void g(float paramFloat)
/*  580:     */   {
/*  581: 585 */     float f1 = bm();
/*  582: 586 */     if (f1 > 0.0F) {
/*  583: 587 */       h(f1 + paramFloat);
/*  584:     */     }
/*  585:     */   }
/*  586:     */   
/*  587:     */   public final float bm()
/*  588:     */   {
/*  589: 592 */     return this.ac.d(6);
/*  590:     */   }
/*  591:     */   
/*  592:     */   public void h(float paramFloat)
/*  593:     */   {
/*  594: 596 */     this.ac.b(6, Float.valueOf(uv.a(paramFloat, 0.0F, bt())));
/*  595:     */   }
/*  596:     */   
/*  597:     */   public boolean a(wh paramwh, float paramFloat)
/*  598:     */   {
/*  599: 601 */     if (b(paramwh)) {
/*  600: 602 */       return false;
/*  601:     */     }
/*  602: 604 */     if (this.o.D) {
/*  603: 605 */       return false;
/*  604:     */     }
/*  605: 607 */     this.aO = 0;
/*  606: 608 */     if (bm() <= 0.0F) {
/*  607: 609 */       return false;
/*  608:     */     }
/*  609: 612 */     if ((paramwh.o()) && (a(wp.n))) {
/*  610: 613 */       return false;
/*  611:     */     }
/*  612: 616 */     if (((paramwh == wh.n) || (paramwh == wh.o)) && (p(4) != null))
/*  613:     */     {
/*  614: 617 */       p(4).a((int)(paramFloat * 4.0F + this.V.nextFloat() * paramFloat * 2.0F), this);
/*  615: 618 */       paramFloat *= 0.75F;
/*  616:     */     }
/*  617: 621 */     this.az = 1.5F;
/*  618:     */     
/*  619: 623 */     int j = 1;
/*  620: 624 */     if (this.Z > this.aB / 2.0F)
/*  621:     */     {
/*  622: 625 */       if (paramFloat <= this.aV) {
/*  623: 626 */         return false;
/*  624:     */       }
/*  625: 628 */       d(paramwh, paramFloat - this.aV);
/*  626: 629 */       this.aV = paramFloat;
/*  627: 630 */       j = 0;
/*  628:     */     }
/*  629:     */     else
/*  630:     */     {
/*  631: 632 */       this.aV = paramFloat;
/*  632: 633 */       this.Z = this.aB;
/*  633: 634 */       d(paramwh, paramFloat);
/*  634: 635 */       this.as = (this.at = 10);
/*  635:     */     }
/*  636: 638 */     this.au = 0.0F;
/*  637:     */     
/*  638: 640 */     wv localwv = paramwh.j();
/*  639: 641 */     if (localwv != null)
/*  640:     */     {
/*  641: 642 */       if ((localwv instanceof xm)) {
/*  642: 643 */         b((xm)localwv);
/*  643:     */       }
/*  644: 645 */       if ((localwv instanceof ahd))
/*  645:     */       {
/*  646: 646 */         this.aM = 100;
/*  647: 647 */         this.aL = ((ahd)localwv);
/*  648:     */       }
/*  649: 648 */       else if ((localwv instanceof acu))
/*  650:     */       {
/*  651: 649 */         acu localacu = (acu)localwv;
/*  652: 650 */         if (localacu.cj())
/*  653:     */         {
/*  654: 651 */           this.aM = 100;
/*  655: 652 */           this.aL = null;
/*  656:     */         }
/*  657:     */       }
/*  658:     */     }
/*  659: 656 */     if (j != 0)
/*  660:     */     {
/*  661: 657 */       this.o.a(this, (byte)2);
/*  662: 658 */       if (paramwh != wh.f) {
/*  663: 659 */         ac();
/*  664:     */       }
/*  665: 661 */       if (localwv != null)
/*  666:     */       {
/*  667: 662 */         double d1 = localwv.s - this.s;
/*  668: 663 */         double d2 = localwv.u - this.u;
/*  669: 664 */         while (d1 * d1 + d2 * d2 < 0.0001D)
/*  670:     */         {
/*  671: 665 */           d1 = (Math.random() - Math.random()) * 0.01D;
/*  672: 666 */           d2 = (Math.random() - Math.random()) * 0.01D;
/*  673:     */         }
/*  674: 668 */         this.au = ((float)(Math.atan2(d2, d1) * 180.0D / 3.141592741012573D - this.y));
/*  675: 669 */         a(localwv, paramFloat, d1, d2);
/*  676:     */       }
/*  677:     */       else
/*  678:     */       {
/*  679: 671 */         this.au = ((int)(Math.random() * 2.0D) * 180);
/*  680:     */       }
/*  681:     */     }
/*  682:     */     String str;
/*  683: 675 */     if (bm() <= 0.0F)
/*  684:     */     {
/*  685: 676 */       str = bo();
/*  686: 677 */       if ((j != 0) && (str != null)) {
/*  687: 678 */         a(str, bA(), bB());
/*  688:     */       }
/*  689: 680 */       a(paramwh);
/*  690:     */     }
/*  691:     */     else
/*  692:     */     {
/*  693: 682 */       str = bn();
/*  694: 683 */       if ((j != 0) && (str != null)) {
/*  695: 684 */         a(str, bA(), bB());
/*  696:     */       }
/*  697:     */     }
/*  698: 688 */     return true;
/*  699:     */   }
/*  700:     */   
/*  701:     */   public void b(amj paramamj)
/*  702:     */   {
/*  703: 692 */     a("random.break", 0.8F, 0.8F + this.o.s.nextFloat() * 0.4F);
/*  704: 694 */     for (int j = 0; j < 5; j++)
/*  705:     */     {
/*  706: 695 */       brw localbrw1 = new brw((this.V.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/*  707: 696 */       localbrw1 = localbrw1.a(-this.z * 3.141593F / 180.0F);
/*  708: 697 */       localbrw1 = localbrw1.b(-this.y * 3.141593F / 180.0F);
/*  709:     */       
/*  710: 699 */       double d = -this.V.nextFloat() * 0.6D - 0.3D;
/*  711: 700 */       brw localbrw2 = new brw((this.V.nextFloat() - 0.5D) * 0.3D, d, 0.6D);
/*  712: 701 */       localbrw2 = localbrw2.a(-this.z * 3.141593F / 180.0F);
/*  713: 702 */       localbrw2 = localbrw2.b(-this.y * 3.141593F / 180.0F);
/*  714: 703 */       localbrw2 = localbrw2.b(this.s, this.t + aR(), this.u);
/*  715: 704 */       this.o.a(ew.K, localbrw2.a, localbrw2.b, localbrw2.c, localbrw1.a, localbrw1.b + 0.05D, localbrw1.c, new int[] { alq.b(paramamj.b()) });
/*  716:     */     }
/*  717:     */   }
/*  718:     */   
/*  719:     */   public void a(wh paramwh)
/*  720:     */   {
/*  721: 709 */     wv localwv = paramwh.j();
/*  722: 710 */     xm localxm = bs();
/*  723: 711 */     if ((this.aU >= 0) && (localxm != null)) {
/*  724: 712 */       localxm.b(this, this.aU);
/*  725:     */     }
/*  726: 715 */     if (localwv != null) {
/*  727: 716 */       localwv.a(this);
/*  728:     */     }
/*  729: 719 */     this.aN = true;
/*  730: 720 */     br().g();
/*  731: 722 */     if (!this.o.D)
/*  732:     */     {
/*  733: 723 */       int j = 0;
/*  734: 724 */       if ((localwv instanceof ahd)) {
/*  735: 725 */         j = aph.i((xm)localwv);
/*  736:     */       }
/*  737: 727 */       if ((aZ()) && (this.o.Q().b("doMobLoot")))
/*  738:     */       {
/*  739: 728 */         b(this.aM > 0, j);
/*  740: 729 */         a(this.aM > 0, j);
/*  741: 730 */         if ((this.aM > 0) && 
/*  742: 731 */           (this.V.nextFloat() < 0.025F + j * 0.01F)) {
/*  743: 732 */           bp();
/*  744:     */         }
/*  745:     */       }
/*  746:     */     }
/*  747: 738 */     this.o.a(this, (byte)3);
/*  748:     */   }
/*  749:     */   
/*  750:     */   protected void a(boolean paramBoolean, int paramInt) {}
/*  751:     */   
/*  752:     */   public void a(wv paramwv, float paramFloat, double paramDouble1, double paramDouble2)
/*  753:     */   {
/*  754: 745 */     if (this.V.nextDouble() < a(afs.c).e()) {
/*  755: 746 */       return;
/*  756:     */     }
/*  757: 749 */     this.ai = true;
/*  758: 750 */     float f1 = uv.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2);
/*  759: 751 */     float f2 = 0.4F;
/*  760:     */     
/*  761: 753 */     this.v /= 2.0D;
/*  762: 754 */     this.w /= 2.0D;
/*  763: 755 */     this.x /= 2.0D;
/*  764:     */     
/*  765: 757 */     this.v -= paramDouble1 / f1 * f2;
/*  766: 758 */     this.w += f2;
/*  767: 759 */     this.x -= paramDouble2 / f1 * f2;
/*  768: 761 */     if (this.w > 0.4000000059604645D) {
/*  769: 762 */       this.w = 0.4000000059604645D;
/*  770:     */     }
/*  771:     */   }
/*  772:     */   
/*  773:     */   protected String bn()
/*  774:     */   {
/*  775: 768 */     return "game.neutral.hurt";
/*  776:     */   }
/*  777:     */   
/*  778:     */   protected String bo()
/*  779:     */   {
/*  780: 773 */     return "game.neutral.die";
/*  781:     */   }
/*  782:     */   
/*  783:     */   protected void bp() {}
/*  784:     */   
/*  785:     */   protected void b(boolean paramBoolean, int paramInt) {}
/*  786:     */   
/*  787:     */   public boolean j_()
/*  788:     */   {
/*  789: 788 */     int j = uv.c(this.s);
/*  790: 789 */     int k = uv.c(aQ().b);
/*  791: 790 */     int m = uv.c(this.u);
/*  792: 791 */     atr localatr = this.o.p(new dt(j, k, m)).c();
/*  793: 792 */     return ((localatr == aty.au) || (localatr == aty.bn)) && ((!(this instanceof ahd)) || (!((ahd)this).v()));
/*  794:     */   }
/*  795:     */   
/*  796:     */   public boolean ai()
/*  797:     */   {
/*  798: 797 */     return (!this.I) && (bm() > 0.0F);
/*  799:     */   }
/*  800:     */   
/*  801:     */   public void e(float paramFloat1, float paramFloat2)
/*  802:     */   {
/*  803: 802 */     super.e(paramFloat1, paramFloat2);
/*  804: 803 */     wq localwq = b(wp.j);
/*  805: 804 */     float f1 = localwq != null ? localwq.c() + 1 : 0.0F;
/*  806:     */     
/*  807: 806 */     int j = uv.f((paramFloat1 - 3.0F - f1) * paramFloat2);
/*  808: 808 */     if (j > 0)
/*  809:     */     {
/*  810: 809 */       a(n(j), 1.0F, 1.0F);
/*  811: 810 */       a(wh.i, j);
/*  812:     */       
/*  813: 812 */       int k = uv.c(this.s);
/*  814: 813 */       int m = uv.c(this.t - 0.2000000029802322D);
/*  815: 814 */       int n = uv.c(this.u);
/*  816:     */       
/*  817: 816 */       atr localatr = this.o.p(new dt(k, m, n)).c();
/*  818: 817 */       if (localatr.r() != bof.a)
/*  819:     */       {
/*  820: 818 */         atx localatx = localatr.H;
/*  821: 819 */         a(localatx.c(), localatx.d() * 0.5F, localatx.e() * 0.75F);
/*  822:     */       }
/*  823:     */     }
/*  824:     */   }
/*  825:     */   
/*  826:     */   protected String n(int paramInt)
/*  827:     */   {
/*  828: 825 */     if (paramInt > 4) {
/*  829: 826 */       return "game.neutral.hurt.fall.big";
/*  830:     */     }
/*  831: 828 */     return "game.neutral.hurt.fall.small";
/*  832:     */   }
/*  833:     */   
/*  834:     */   public void as()
/*  835:     */   {
/*  836: 834 */     this.as = (this.at = 10);
/*  837: 835 */     this.au = 0.0F;
/*  838:     */   }
/*  839:     */   
/*  840:     */   public int bq()
/*  841:     */   {
/*  842: 844 */     int j = 0;
/*  843: 845 */     for (amj localamj : at()) {
/*  844: 846 */       if ((localamj != null) && ((localamj.b() instanceof ajn)))
/*  845:     */       {
/*  846: 847 */         int n = ((ajn)localamj.b()).c;
/*  847: 848 */         j += n;
/*  848:     */       }
/*  849:     */     }
/*  850: 851 */     return j;
/*  851:     */   }
/*  852:     */   
/*  853:     */   protected void i(float paramFloat) {}
/*  854:     */   
/*  855:     */   protected float b(wh paramwh, float paramFloat)
/*  856:     */   {
/*  857: 858 */     if (!paramwh.e())
/*  858:     */     {
/*  859: 859 */       int j = 25 - bq();
/*  860: 860 */       float f1 = paramFloat * j;
/*  861: 861 */       i(paramFloat);
/*  862: 862 */       paramFloat = f1 / 25.0F;
/*  863:     */     }
/*  864: 864 */     return paramFloat;
/*  865:     */   }
/*  866:     */   
/*  867:     */   protected float c(wh paramwh, float paramFloat)
/*  868:     */   {
/*  869: 868 */     if (paramwh.h()) {
/*  870: 869 */       return paramFloat;
/*  871:     */     }
/*  872:     */     int k;
/*  873:     */     float f1;
/*  874: 872 */     if ((a(wp.m)) && (paramwh != wh.j))
/*  875:     */     {
/*  876: 873 */       j = (b(wp.m).c() + 1) * 5;
/*  877: 874 */       k = 25 - j;
/*  878: 875 */       f1 = paramFloat * k;
/*  879: 876 */       paramFloat = f1 / 25.0F;
/*  880:     */     }
/*  881: 879 */     if (paramFloat <= 0.0F) {
/*  882: 880 */       return 0.0F;
/*  883:     */     }
/*  884: 883 */     int j = aph.a(at(), paramwh);
/*  885: 884 */     if (j > 20) {
/*  886: 885 */       j = 20;
/*  887:     */     }
/*  888: 887 */     if ((j > 0) && (j <= 20))
/*  889:     */     {
/*  890: 888 */       k = 25 - j;
/*  891: 889 */       f1 = paramFloat * k;
/*  892: 890 */       paramFloat = f1 / 25.0F;
/*  893:     */     }
/*  894: 893 */     return paramFloat;
/*  895:     */   }
/*  896:     */   
/*  897:     */   protected void d(wh paramwh, float paramFloat)
/*  898:     */   {
/*  899: 897 */     if (b(paramwh)) {
/*  900: 898 */       return;
/*  901:     */     }
/*  902: 900 */     paramFloat = b(paramwh, paramFloat);
/*  903: 901 */     paramFloat = c(paramwh, paramFloat);
/*  904:     */     
/*  905: 903 */     float f1 = paramFloat;
/*  906: 904 */     paramFloat = Math.max(paramFloat - bM(), 0.0F);
/*  907: 905 */     l(bM() - (f1 - paramFloat));
/*  908: 906 */     if (paramFloat == 0.0F) {
/*  909: 907 */       return;
/*  910:     */     }
/*  911: 910 */     float f2 = bm();
/*  912: 911 */     h(f2 - paramFloat);
/*  913: 912 */     br().a(paramwh, f2, paramFloat);
/*  914: 913 */     l(bM() - paramFloat);
/*  915:     */   }
/*  916:     */   
/*  917:     */   public wg br()
/*  918:     */   {
/*  919: 917 */     return this.f;
/*  920:     */   }
/*  921:     */   
/*  922:     */   public xm bs()
/*  923:     */   {
/*  924: 921 */     if (this.f.c() != null) {
/*  925: 922 */       return this.f.c();
/*  926:     */     }
/*  927: 924 */     if (this.aL != null) {
/*  928: 925 */       return this.aL;
/*  929:     */     }
/*  930: 927 */     if (this.bg != null) {
/*  931: 928 */       return this.bg;
/*  932:     */     }
/*  933: 930 */     return null;
/*  934:     */   }
/*  935:     */   
/*  936:     */   public final float bt()
/*  937:     */   {
/*  938: 934 */     return (float)a(afs.a).e();
/*  939:     */   }
/*  940:     */   
/*  941:     */   public final int bu()
/*  942:     */   {
/*  943: 938 */     return this.ac.a(9);
/*  944:     */   }
/*  945:     */   
/*  946:     */   public final void o(int paramInt)
/*  947:     */   {
/*  948: 942 */     this.ac.b(9, Byte.valueOf((byte)paramInt));
/*  949:     */   }
/*  950:     */   
/*  951:     */   private int n()
/*  952:     */   {
/*  953: 946 */     if (a(wp.e)) {
/*  954: 947 */       return 6 - (1 + b(wp.e).c()) * 1;
/*  955:     */     }
/*  956: 949 */     if (a(wp.f)) {
/*  957: 950 */       return 6 + (1 + b(wp.f).c()) * 2;
/*  958:     */     }
/*  959: 952 */     return 6;
/*  960:     */   }
/*  961:     */   
/*  962:     */   public void bv()
/*  963:     */   {
/*  964: 956 */     if ((!this.ap) || (this.aq >= n() / 2) || (this.aq < 0))
/*  965:     */     {
/*  966: 957 */       this.aq = -1;
/*  967: 958 */       this.ap = true;
/*  968: 960 */       if ((this.o instanceof qt)) {
/*  969: 961 */         ((qt)this.o).s().a(this, new ir(this, 0));
/*  970:     */       }
/*  971:     */     }
/*  972:     */   }
/*  973:     */   
/*  974:     */   public void a(byte paramByte)
/*  975:     */   {
/*  976:     */     String str;
/*  977: 968 */     if (paramByte == 2)
/*  978:     */     {
/*  979: 969 */       this.az = 1.5F;
/*  980:     */       
/*  981: 971 */       this.Z = this.aB;
/*  982: 972 */       this.as = (this.at = 10);
/*  983: 973 */       this.au = 0.0F;
/*  984:     */       
/*  985: 975 */       str = bn();
/*  986: 976 */       if (str != null) {
/*  987: 977 */         a(bn(), bA(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
/*  988:     */       }
/*  989: 979 */       a(wh.k, 0.0F);
/*  990:     */     }
/*  991: 981 */     else if (paramByte == 3)
/*  992:     */     {
/*  993: 982 */       str = bo();
/*  994: 983 */       if (str != null) {
/*  995: 984 */         a(bo(), bA(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
/*  996:     */       }
/*  997: 986 */       h(0.0F);
/*  998: 987 */       a(wh.k);
/*  999:     */     }
/* 1000:     */     else
/* 1001:     */     {
/* 1002: 989 */       super.a(paramByte);
/* 1003:     */     }
/* 1004:     */   }
/* 1005:     */   
/* 1006:     */   protected void O()
/* 1007:     */   {
/* 1008: 995 */     a(wh.j, 4.0F);
/* 1009:     */   }
/* 1010:     */   
/* 1011:     */   protected void bw()
/* 1012:     */   {
/* 1013: 999 */     int j = n();
/* 1014:1000 */     if (this.ap)
/* 1015:     */     {
/* 1016:1001 */       this.aq += 1;
/* 1017:1002 */       if (this.aq >= j)
/* 1018:     */       {
/* 1019:1003 */         this.aq = 0;
/* 1020:1004 */         this.ap = false;
/* 1021:     */       }
/* 1022:     */     }
/* 1023:     */     else
/* 1024:     */     {
/* 1025:1007 */       this.aq = 0;
/* 1026:     */     }
/* 1027:1010 */     this.ax = (this.aq / j);
/* 1028:     */   }
/* 1029:     */   
/* 1030:     */   public xz a(xy paramxy)
/* 1031:     */   {
/* 1032:1014 */     return bx().a(paramxy);
/* 1033:     */   }
/* 1034:     */   
/* 1035:     */   public yc bx()
/* 1036:     */   {
/* 1037:1018 */     if (this.c == null) {
/* 1038:1019 */       this.c = new yf();
/* 1039:     */     }
/* 1040:1022 */     return this.c;
/* 1041:     */   }
/* 1042:     */   
/* 1043:     */   public xs by()
/* 1044:     */   {
/* 1045:1026 */     return xs.a;
/* 1046:     */   }
/* 1047:     */   
/* 1048:     */   public abstract amj bz();
/* 1049:     */   
/* 1050:     */   public abstract amj p(int paramInt);
/* 1051:     */   
/* 1052:     */   public abstract amj q(int paramInt);
/* 1053:     */   
/* 1054:     */   public abstract void c(int paramInt, amj paramamj);
/* 1055:     */   
/* 1056:     */   public void d(boolean paramBoolean)
/* 1057:     */   {
/* 1058:1040 */     super.d(paramBoolean);
/* 1059:     */     
/* 1060:1042 */     xz localxz = a(afs.d);
/* 1061:1043 */     if (localxz.a(a) != null) {
/* 1062:1044 */       localxz.c(b);
/* 1063:     */     }
/* 1064:1046 */     if (paramBoolean) {
/* 1065:1047 */       localxz.b(b);
/* 1066:     */     }
/* 1067:     */   }
/* 1068:     */   
/* 1069:     */   public abstract amj[] at();
/* 1070:     */   
/* 1071:     */   protected float bA()
/* 1072:     */   {
/* 1073:1055 */     return 1.0F;
/* 1074:     */   }
/* 1075:     */   
/* 1076:     */   protected float bB()
/* 1077:     */   {
/* 1078:1059 */     if (i_()) {
/* 1079:1060 */       return (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.5F;
/* 1080:     */     }
/* 1081:1062 */     return (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F;
/* 1082:     */   }
/* 1083:     */   
/* 1084:     */   protected boolean bC()
/* 1085:     */   {
/* 1086:1066 */     return bm() <= 0.0F;
/* 1087:     */   }
/* 1088:     */   
/* 1089:     */   public void q(wv paramwv)
/* 1090:     */   {
/* 1091:1071 */     double d1 = paramwv.s;
/* 1092:1072 */     double d2 = paramwv.aQ().b + paramwv.K;
/* 1093:1073 */     double d3 = paramwv.u;
/* 1094:1074 */     int j = 1;
/* 1095:1076 */     for (int k = -j; k <= j; k++) {
/* 1096:1077 */       for (int m = -j; m < j; m++) {
/* 1097:1078 */         if ((k != 0) || (m != 0))
/* 1098:     */         {
/* 1099:1082 */           int n = (int)(this.s + k);
/* 1100:1083 */           int i1 = (int)(this.u + m);
/* 1101:1084 */           brt localbrt = aQ().c(k, 1.0D, m);
/* 1102:1086 */           if (this.o.a(localbrt).isEmpty())
/* 1103:     */           {
/* 1104:1087 */             if (aqu.a(this.o, new dt(n, (int)this.t, i1)))
/* 1105:     */             {
/* 1106:1088 */               a(this.s + k, this.t + 1.0D, this.u + m);
/* 1107:1089 */               return;
/* 1108:     */             }
/* 1109:1090 */             if ((aqu.a(this.o, new dt(n, (int)this.t - 1, i1))) || (this.o.p(new dt(n, (int)this.t - 1, i1)).c().r() == bof.h))
/* 1110:     */             {
/* 1111:1091 */               d1 = this.s + k;
/* 1112:1092 */               d2 = this.t + 1.0D;
/* 1113:1093 */               d3 = this.u + m;
/* 1114:     */             }
/* 1115:     */           }
/* 1116:     */         }
/* 1117:     */       }
/* 1118:     */     }
/* 1119:1099 */     a(d1, d2, d3);
/* 1120:     */   }
/* 1121:     */   
/* 1122:     */   public boolean aN()
/* 1123:     */   {
/* 1124:1104 */     return false;
/* 1125:     */   }
/* 1126:     */   
/* 1127:     */   protected float bD()
/* 1128:     */   {
/* 1129:1108 */     return 0.42F;
/* 1130:     */   }
/* 1131:     */   
/* 1132:     */   protected void bE()
/* 1133:     */   {
/* 1134:1112 */     this.w = bD();
/* 1135:1113 */     if (a(wp.j)) {
/* 1136:1114 */       this.w += (b(wp.j).c() + 1) * 0.1F;
/* 1137:     */     }
/* 1138:1116 */     if (ax())
/* 1139:     */     {
/* 1140:1117 */       float f1 = this.y * 0.01745329F;
/* 1141:     */       
/* 1142:1119 */       this.v -= uv.a(f1) * 0.2F;
/* 1143:1120 */       this.x += uv.b(f1) * 0.2F;
/* 1144:     */     }
/* 1145:1122 */     this.ai = true;
/* 1146:     */   }
/* 1147:     */   
/* 1148:     */   protected void bF()
/* 1149:     */   {
/* 1150:1126 */     this.w += 0.03999999910593033D;
/* 1151:     */   }
/* 1152:     */   
/* 1153:     */   protected void bG()
/* 1154:     */   {
/* 1155:1130 */     this.w += 0.03999999910593033D;
/* 1156:     */   }
/* 1157:     */   
/* 1158:     */   public void g(float paramFloat1, float paramFloat2)
/* 1159:     */   {
/* 1160:1134 */     if (bL())
/* 1161:     */     {
/* 1162:     */       double d1;
/* 1163:     */       float f3;
/* 1164:     */       float f4;
/* 1165:1135 */       if ((V()) && ((!(this instanceof ahd)) || (!((ahd)this).by.b)))
/* 1166:     */       {
/* 1167:1136 */         d1 = this.t;
/* 1168:     */         
/* 1169:1138 */         f3 = 0.8F;
/* 1170:1139 */         f4 = 0.02F;
/* 1171:     */         
/* 1172:1141 */         float f5 = aph.b(this);
/* 1173:1142 */         if (f5 > 3.0F) {
/* 1174:1143 */           f5 = 3.0F;
/* 1175:     */         }
/* 1176:1145 */         if (!this.C) {
/* 1177:1146 */           f5 *= 0.5F;
/* 1178:     */         }
/* 1179:1148 */         if (f5 > 0.0F)
/* 1180:     */         {
/* 1181:1150 */           f3 += (0.5460001F - f3) * f5 / 3.0F;
/* 1182:     */           
/* 1183:1152 */           f4 += (bH() * 1.0F - f4) * f5 / 3.0F;
/* 1184:     */         }
/* 1185:1155 */         a(paramFloat1, paramFloat2, f4);
/* 1186:1156 */         d(this.v, this.w, this.x);
/* 1187:     */         
/* 1188:1158 */         this.v *= f3;
/* 1189:1159 */         this.w *= 0.800000011920929D;
/* 1190:1160 */         this.x *= f3;
/* 1191:1161 */         this.w -= 0.02D;
/* 1192:1163 */         if ((this.D) && (c(this.v, this.w + 0.6000000238418579D - this.t + d1, this.x))) {
/* 1193:1164 */           this.w = 0.300000011920929D;
/* 1194:     */         }
/* 1195:     */       }
/* 1196:1166 */       else if ((ab()) && ((!(this instanceof ahd)) || (!((ahd)this).by.b)))
/* 1197:     */       {
/* 1198:1167 */         d1 = this.t;
/* 1199:1168 */         a(paramFloat1, paramFloat2, 0.02F);
/* 1200:1169 */         d(this.v, this.w, this.x);
/* 1201:1170 */         this.v *= 0.5D;
/* 1202:1171 */         this.w *= 0.5D;
/* 1203:1172 */         this.x *= 0.5D;
/* 1204:1173 */         this.w -= 0.02D;
/* 1205:1175 */         if ((this.D) && (c(this.v, this.w + 0.6000000238418579D - this.t + d1, this.x))) {
/* 1206:1176 */           this.w = 0.300000011920929D;
/* 1207:     */         }
/* 1208:     */       }
/* 1209:     */       else
/* 1210:     */       {
/* 1211:1179 */         float f1 = 0.91F;
/* 1212:1180 */         if (this.C) {
/* 1213:1181 */           f1 = this.o.p(new dt(uv.c(this.s), uv.c(aQ().b) - 1, uv.c(this.u))).c().K * 0.91F;
/* 1214:     */         }
/* 1215:1184 */         float f2 = 0.1627714F / (f1 * f1 * f1);
/* 1216:1187 */         if (this.C) {
/* 1217:1188 */           f3 = bH() * f2;
/* 1218:     */         } else {
/* 1219:1190 */           f3 = this.aK;
/* 1220:     */         }
/* 1221:1193 */         a(paramFloat1, paramFloat2, f3);
/* 1222:     */         
/* 1223:1195 */         f1 = 0.91F;
/* 1224:1196 */         if (this.C) {
/* 1225:1197 */           f1 = this.o.p(new dt(uv.c(this.s), uv.c(aQ().b) - 1, uv.c(this.u))).c().K * 0.91F;
/* 1226:     */         }
/* 1227:1199 */         if (j_())
/* 1228:     */         {
/* 1229:1200 */           f4 = 0.15F;
/* 1230:1201 */           this.v = uv.a(this.v, -f4, f4);
/* 1231:1202 */           this.x = uv.a(this.x, -f4, f4);
/* 1232:1203 */           this.O = 0.0F;
/* 1233:1204 */           if (this.w < -0.15D) {
/* 1234:1205 */             this.w = -0.15D;
/* 1235:     */           }
/* 1236:1207 */           int j = (aw()) && ((this instanceof ahd)) ? 1 : 0;
/* 1237:1208 */           if ((j != 0) && (this.w < 0.0D)) {
/* 1238:1209 */             this.w = 0.0D;
/* 1239:     */           }
/* 1240:     */         }
/* 1241:1213 */         d(this.v, this.w, this.x);
/* 1242:1215 */         if ((this.D) && (j_())) {
/* 1243:1216 */           this.w = 0.2D;
/* 1244:     */         }
/* 1245:1219 */         if ((!this.o.D) || ((this.o.e(new dt((int)this.s, 0, (int)this.u))) && (this.o.f(new dt((int)this.s, 0, (int)this.u)).o()))) {
/* 1246:1220 */           this.w -= 0.08D;
/* 1247:1221 */         } else if (this.t > 0.0D) {
/* 1248:1222 */           this.w = -0.1D;
/* 1249:     */         } else {
/* 1250:1224 */           this.w = 0.0D;
/* 1251:     */         }
/* 1252:1226 */         this.w *= 0.9800000190734863D;
/* 1253:1227 */         this.v *= f1;
/* 1254:1228 */         this.x *= f1;
/* 1255:     */       }
/* 1256:     */     }
/* 1257:1231 */     this.ay = this.az;
/* 1258:1232 */     double d2 = this.s - this.p;
/* 1259:1233 */     double d3 = this.u - this.r;
/* 1260:1234 */     float f6 = uv.a(d2 * d2 + d3 * d3) * 4.0F;
/* 1261:1235 */     if (f6 > 1.0F) {
/* 1262:1236 */       f6 = 1.0F;
/* 1263:     */     }
/* 1264:1238 */     this.az += (f6 - this.az) * 0.4F;
/* 1265:1239 */     this.aA += this.az;
/* 1266:     */   }
/* 1267:     */   
/* 1268:     */   public float bH()
/* 1269:     */   {
/* 1270:1243 */     return this.bk;
/* 1271:     */   }
/* 1272:     */   
/* 1273:     */   public void j(float paramFloat)
/* 1274:     */   {
/* 1275:1247 */     this.bk = paramFloat;
/* 1276:     */   }
/* 1277:     */   
/* 1278:     */   public boolean r(wv paramwv)
/* 1279:     */   {
/* 1280:1251 */     p(paramwv);
/* 1281:1252 */     return false;
/* 1282:     */   }
/* 1283:     */   
/* 1284:     */   public boolean bI()
/* 1285:     */   {
/* 1286:1256 */     return false;
/* 1287:     */   }
/* 1288:     */   
/* 1289:     */   public void s_()
/* 1290:     */   {
/* 1291:1261 */     super.s_();
/* 1292:1263 */     if (!this.o.D)
/* 1293:     */     {
/* 1294:1264 */       int j = bu();
/* 1295:1265 */       if (j > 0)
/* 1296:     */       {
/* 1297:1266 */         if (this.ar <= 0) {
/* 1298:1267 */           this.ar = (20 * (30 - j));
/* 1299:     */         }
/* 1300:1269 */         this.ar -= 1;
/* 1301:1270 */         if (this.ar <= 0) {
/* 1302:1271 */           o(j - 1);
/* 1303:     */         }
/* 1304:     */       }
/* 1305:1275 */       for (int k = 0; k < 5; k++)
/* 1306:     */       {
/* 1307:1276 */         amj localamj1 = this.h[k];
/* 1308:1277 */         amj localamj2 = p(k);
/* 1309:1279 */         if (!amj.b(localamj2, localamj1))
/* 1310:     */         {
/* 1311:1280 */           ((qt)this.o).s().a(this, new la(F(), k, localamj2));
/* 1312:1281 */           if (localamj1 != null) {
/* 1313:1282 */             this.c.a(localamj1.B());
/* 1314:     */           }
/* 1315:1284 */           if (localamj2 != null) {
/* 1316:1285 */             this.c.b(localamj2.B());
/* 1317:     */           }
/* 1318:1287 */           this.h[k] = (localamj2 == null ? null : localamj2.k());
/* 1319:     */         }
/* 1320:     */       }
/* 1321:1291 */       if (this.W % 20 == 0) {
/* 1322:1292 */         br().g();
/* 1323:     */       }
/* 1324:     */     }
/* 1325:1296 */     m();
/* 1326:     */     
/* 1327:1298 */     double d1 = this.s - this.p;
/* 1328:1299 */     double d2 = this.u - this.r;
/* 1329:     */     
/* 1330:1301 */     float f1 = (float)(d1 * d1 + d2 * d2);
/* 1331:     */     
/* 1332:1303 */     float f2 = this.aG;
/* 1333:     */     
/* 1334:1305 */     float f3 = 0.0F;
/* 1335:1306 */     this.aP = this.aQ;
/* 1336:1307 */     float f4 = 0.0F;
/* 1337:1308 */     if (f1 > 0.0025F)
/* 1338:     */     {
/* 1339:1309 */       f4 = 1.0F;
/* 1340:1310 */       f3 = (float)Math.sqrt(f1) * 3.0F;
/* 1341:1311 */       f2 = (float)Math.atan2(d2, d1) * 180.0F / 3.141593F - 90.0F;
/* 1342:     */     }
/* 1343:1313 */     if (this.ax > 0.0F) {
/* 1344:1314 */       f2 = this.y;
/* 1345:     */     }
/* 1346:1316 */     if (!this.C) {
/* 1347:1317 */       f4 = 0.0F;
/* 1348:     */     }
/* 1349:1319 */     this.aQ += (f4 - this.aQ) * 0.3F;
/* 1350:     */     
/* 1351:1321 */     this.o.B.a("headTurn");
/* 1352:     */     
/* 1353:1323 */     f3 = h(f2, f3);
/* 1354:     */     
/* 1355:1325 */     this.o.B.b();
/* 1356:     */     
/* 1357:1327 */     this.o.B.a("rangeChecks");
/* 1358:1328 */     while (this.y - this.A < -180.0F) {
/* 1359:1329 */       this.A -= 360.0F;
/* 1360:     */     }
/* 1361:1331 */     while (this.y - this.A >= 180.0F) {
/* 1362:1332 */       this.A += 360.0F;
/* 1363:     */     }
/* 1364:1335 */     while (this.aG - this.aH < -180.0F) {
/* 1365:1336 */       this.aH -= 360.0F;
/* 1366:     */     }
/* 1367:1338 */     while (this.aG - this.aH >= 180.0F) {
/* 1368:1339 */       this.aH += 360.0F;
/* 1369:     */     }
/* 1370:1342 */     while (this.z - this.B < -180.0F) {
/* 1371:1343 */       this.B -= 360.0F;
/* 1372:     */     }
/* 1373:1345 */     while (this.z - this.B >= 180.0F) {
/* 1374:1346 */       this.B += 360.0F;
/* 1375:     */     }
/* 1376:1349 */     while (this.aI - this.aJ < -180.0F) {
/* 1377:1350 */       this.aJ -= 360.0F;
/* 1378:     */     }
/* 1379:1352 */     while (this.aI - this.aJ >= 180.0F) {
/* 1380:1353 */       this.aJ += 360.0F;
/* 1381:     */     }
/* 1382:1355 */     this.o.B.b();
/* 1383:     */     
/* 1384:1357 */     this.aR += f3;
/* 1385:     */   }
/* 1386:     */   
/* 1387:     */   protected float h(float paramFloat1, float paramFloat2)
/* 1388:     */   {
/* 1389:1361 */     float f1 = uv.g(paramFloat1 - this.aG);
/* 1390:1362 */     this.aG += f1 * 0.3F;
/* 1391:     */     
/* 1392:1364 */     float f2 = uv.g(this.y - this.aG);
/* 1393:1365 */     int j = (f2 < -90.0F) || (f2 >= 90.0F) ? 1 : 0;
/* 1394:1366 */     if (f2 < -75.0F) {
/* 1395:1367 */       f2 = -75.0F;
/* 1396:     */     }
/* 1397:1369 */     if (f2 >= 75.0F) {
/* 1398:1370 */       f2 = 75.0F;
/* 1399:     */     }
/* 1400:1372 */     this.aG = (this.y - f2);
/* 1401:1373 */     if (f2 * f2 > 2500.0F) {
/* 1402:1374 */       this.aG += f2 * 0.2F;
/* 1403:     */     }
/* 1404:1377 */     if (j != 0) {
/* 1405:1378 */       paramFloat2 *= -1.0F;
/* 1406:     */     }
/* 1407:1381 */     return paramFloat2;
/* 1408:     */   }
/* 1409:     */   
/* 1410:     */   public void m()
/* 1411:     */   {
/* 1412:1385 */     if (this.bl > 0) {
/* 1413:1386 */       this.bl -= 1;
/* 1414:     */     }
/* 1415:1388 */     if (this.ba > 0)
/* 1416:     */     {
/* 1417:1389 */       double d1 = this.s + (this.bb - this.s) / this.ba;
/* 1418:1390 */       double d2 = this.t + (this.bc - this.t) / this.ba;
/* 1419:1391 */       double d3 = this.u + (this.bd - this.u) / this.ba;
/* 1420:     */       
/* 1421:1393 */       double d4 = uv.g(this.be - this.y);
/* 1422:     */       
/* 1423:1395 */       this.y = ((float)(this.y + d4 / this.ba));
/* 1424:1396 */       this.z = ((float)(this.z + (this.bf - this.z) / this.ba));
/* 1425:     */       
/* 1426:1398 */       this.ba -= 1;
/* 1427:1399 */       b(d1, d2, d3);
/* 1428:1400 */       b(this.y, this.z);
/* 1429:     */     }
/* 1430:1401 */     else if (!bL())
/* 1431:     */     {
/* 1432:1404 */       this.v *= 0.98D;
/* 1433:1405 */       this.w *= 0.98D;
/* 1434:1406 */       this.x *= 0.98D;
/* 1435:     */     }
/* 1436:1409 */     if (Math.abs(this.v) < 0.005D) {
/* 1437:1410 */       this.v = 0.0D;
/* 1438:     */     }
/* 1439:1412 */     if (Math.abs(this.w) < 0.005D) {
/* 1440:1413 */       this.w = 0.0D;
/* 1441:     */     }
/* 1442:1415 */     if (Math.abs(this.x) < 0.005D) {
/* 1443:1416 */       this.x = 0.0D;
/* 1444:     */     }
/* 1445:1419 */     this.o.B.a("ai");
/* 1446:1420 */     if (bC())
/* 1447:     */     {
/* 1448:1421 */       this.aW = false;
/* 1449:1422 */       this.aX = 0.0F;
/* 1450:1423 */       this.aY = 0.0F;
/* 1451:1424 */       this.aZ = 0.0F;
/* 1452:     */     }
/* 1453:1426 */     else if (bL())
/* 1454:     */     {
/* 1455:1427 */       this.o.B.a("newAi");
/* 1456:1428 */       bJ();
/* 1457:1429 */       this.o.B.b();
/* 1458:     */     }
/* 1459:1432 */     this.o.B.b();
/* 1460:     */     
/* 1461:1434 */     this.o.B.a("jump");
/* 1462:1435 */     if (this.aW)
/* 1463:     */     {
/* 1464:1436 */       if (V())
/* 1465:     */       {
/* 1466:1437 */         bF();
/* 1467:     */       }
/* 1468:1438 */       else if (ab())
/* 1469:     */       {
/* 1470:1439 */         bG();
/* 1471:     */       }
/* 1472:1440 */       else if ((this.C) && 
/* 1473:1441 */         (this.bl == 0))
/* 1474:     */       {
/* 1475:1442 */         bE();
/* 1476:1443 */         this.bl = 10;
/* 1477:     */       }
/* 1478:     */     }
/* 1479:     */     else {
/* 1480:1447 */       this.bl = 0;
/* 1481:     */     }
/* 1482:1449 */     this.o.B.b();
/* 1483:     */     
/* 1484:1451 */     this.o.B.a("travel");
/* 1485:1452 */     this.aX *= 0.98F;
/* 1486:1453 */     this.aY *= 0.98F;
/* 1487:1454 */     this.aZ *= 0.9F;
/* 1488:     */     
/* 1489:1456 */     g(this.aX, this.aY);
/* 1490:1457 */     this.o.B.b();
/* 1491:     */     
/* 1492:1459 */     this.o.B.a("push");
/* 1493:1460 */     if (!this.o.D) {
/* 1494:1461 */       bK();
/* 1495:     */     }
/* 1496:1463 */     this.o.B.b();
/* 1497:     */   }
/* 1498:     */   
/* 1499:     */   protected void bJ() {}
/* 1500:     */   
/* 1501:     */   protected void bK()
/* 1502:     */   {
/* 1503:1470 */     List localList = this.o.b(this, aQ().b(0.2000000029802322D, 0.0D, 0.2000000029802322D));
/* 1504:1471 */     if ((localList != null) && (!localList.isEmpty())) {
/* 1505:1472 */       for (int j = 0; j < localList.size(); j++)
/* 1506:     */       {
/* 1507:1473 */         wv localwv = (wv)localList.get(j);
/* 1508:1474 */         if (localwv.ae()) {
/* 1509:1475 */           s(localwv);
/* 1510:     */         }
/* 1511:     */       }
/* 1512:     */     }
/* 1513:     */   }
/* 1514:     */   
/* 1515:     */   protected void s(wv paramwv)
/* 1516:     */   {
/* 1517:1482 */     paramwv.i(this);
/* 1518:     */   }
/* 1519:     */   
/* 1520:     */   public void a(wv paramwv)
/* 1521:     */   {
/* 1522:1487 */     if ((this.m != null) && (paramwv == null))
/* 1523:     */     {
/* 1524:1488 */       if (!this.o.D) {
/* 1525:1489 */         q(this.m);
/* 1526:     */       }
/* 1527:1492 */       if (this.m != null) {
/* 1528:1493 */         this.m.l = null;
/* 1529:     */       }
/* 1530:1495 */       this.m = null;
/* 1531:     */       
/* 1532:1497 */       return;
/* 1533:     */     }
/* 1534:1499 */     super.a(paramwv);
/* 1535:     */   }
/* 1536:     */   
/* 1537:     */   public void ak()
/* 1538:     */   {
/* 1539:1504 */     super.ak();
/* 1540:1505 */     this.aP = this.aQ;
/* 1541:1506 */     this.aQ = 0.0F;
/* 1542:1507 */     this.O = 0.0F;
/* 1543:     */   }
/* 1544:     */   
/* 1545:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 1546:     */   {
/* 1547:1512 */     this.bb = paramDouble1;
/* 1548:1513 */     this.bc = paramDouble2;
/* 1549:1514 */     this.bd = paramDouble3;
/* 1550:1515 */     this.be = paramFloat1;
/* 1551:1516 */     this.bf = paramFloat2;
/* 1552:     */     
/* 1553:1518 */     this.ba = paramInt;
/* 1554:     */   }
/* 1555:     */   
/* 1556:     */   public void i(boolean paramBoolean)
/* 1557:     */   {
/* 1558:1522 */     this.aW = paramBoolean;
/* 1559:     */   }
/* 1560:     */   
/* 1561:     */   public void a(wv paramwv, int paramInt)
/* 1562:     */   {
/* 1563:1526 */     if ((!paramwv.I) && (!this.o.D))
/* 1564:     */     {
/* 1565:1527 */       qn localqn = ((qt)this.o).s();
/* 1566:1528 */       if ((paramwv instanceof adw)) {
/* 1567:1529 */         localqn.a(paramwv, new ln(paramwv.F(), F()));
/* 1568:     */       }
/* 1569:1531 */       if ((paramwv instanceof ahj)) {
/* 1570:1532 */         localqn.a(paramwv, new ln(paramwv.F(), F()));
/* 1571:     */       }
/* 1572:1534 */       if ((paramwv instanceof xk)) {
/* 1573:1535 */         localqn.a(paramwv, new ln(paramwv.F(), F()));
/* 1574:     */       }
/* 1575:     */     }
/* 1576:     */   }
/* 1577:     */   
/* 1578:     */   public boolean t(wv paramwv)
/* 1579:     */   {
/* 1580:1541 */     return this.o.a(new brw(this.s, this.t + aR(), this.u), new brw(paramwv.s, paramwv.t + paramwv.aR(), paramwv.u)) == null;
/* 1581:     */   }
/* 1582:     */   
/* 1583:     */   public brw ap()
/* 1584:     */   {
/* 1585:1546 */     return d(1.0F);
/* 1586:     */   }
/* 1587:     */   
/* 1588:     */   public brw d(float paramFloat)
/* 1589:     */   {
/* 1590:1551 */     if (paramFloat == 1.0F) {
/* 1591:1552 */       return f(this.z, this.aI);
/* 1592:     */     }
/* 1593:1554 */     float f1 = this.B + (this.z - this.B) * paramFloat;
/* 1594:1555 */     float f2 = this.aJ + (this.aI - this.aJ) * paramFloat;
/* 1595:1556 */     return f(f1, f2);
/* 1596:     */   }
/* 1597:     */   
/* 1598:     */   public float k(float paramFloat)
/* 1599:     */   {
/* 1600:1560 */     float f1 = this.ax - this.aw;
/* 1601:1561 */     if (f1 < 0.0F) {
/* 1602:1562 */       f1 += 1.0F;
/* 1603:     */     }
/* 1604:1564 */     return this.aw + f1 * paramFloat;
/* 1605:     */   }
/* 1606:     */   
/* 1607:     */   public boolean bL()
/* 1608:     */   {
/* 1609:1568 */     return !this.o.D;
/* 1610:     */   }
/* 1611:     */   
/* 1612:     */   public boolean ad()
/* 1613:     */   {
/* 1614:1573 */     return !this.I;
/* 1615:     */   }
/* 1616:     */   
/* 1617:     */   public boolean ae()
/* 1618:     */   {
/* 1619:1578 */     return !this.I;
/* 1620:     */   }
/* 1621:     */   
/* 1622:     */   protected void ac()
/* 1623:     */   {
/* 1624:1583 */     this.G = (this.V.nextDouble() >= a(afs.c).e());
/* 1625:     */   }
/* 1626:     */   
/* 1627:     */   public float aD()
/* 1628:     */   {
/* 1629:1588 */     return this.aI;
/* 1630:     */   }
/* 1631:     */   
/* 1632:     */   public void f(float paramFloat)
/* 1633:     */   {
/* 1634:1593 */     this.aI = paramFloat;
/* 1635:     */   }
/* 1636:     */   
/* 1637:     */   public float bM()
/* 1638:     */   {
/* 1639:1597 */     return this.bm;
/* 1640:     */   }
/* 1641:     */   
/* 1642:     */   public void l(float paramFloat)
/* 1643:     */   {
/* 1644:1601 */     if (paramFloat < 0.0F) {
/* 1645:1602 */       paramFloat = 0.0F;
/* 1646:     */     }
/* 1647:1604 */     this.bm = paramFloat;
/* 1648:     */   }
/* 1649:     */   
/* 1650:     */   public bsf bN()
/* 1651:     */   {
/* 1652:1608 */     return this.o.Z().h(aJ().toString());
/* 1653:     */   }
/* 1654:     */   
/* 1655:     */   public boolean c(xm paramxm)
/* 1656:     */   {
/* 1657:1612 */     return a(paramxm.bN());
/* 1658:     */   }
/* 1659:     */   
/* 1660:     */   public boolean a(bsf parambsf)
/* 1661:     */   {
/* 1662:1616 */     if (bN() != null) {
/* 1663:1617 */       return bN().a(parambsf);
/* 1664:     */     }
/* 1665:1619 */     return false;
/* 1666:     */   }
/* 1667:     */   
/* 1668:     */   public void g_() {}
/* 1669:     */   
/* 1670:     */   public void j() {}
/* 1671:     */   
/* 1672:     */   protected void bO()
/* 1673:     */   {
/* 1674:1629 */     this.i = true;
/* 1675:     */   }
/* 1676:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     xm
 * JD-Core Version:    0.7.0.1
 */