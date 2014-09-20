/*    1:     */ import java.util.Iterator;
/*    2:     */ import java.util.Random;
/*    3:     */ import java.util.UUID;
/*    4:     */ 
/*    5:     */ public class agp
/*    6:     */   extends ws
/*    7:     */   implements ago, aqb
/*    8:     */ {
/*    9:     */   private int bl;
/*   10:     */   private boolean bm;
/*   11:     */   private boolean bn;
/*   12:     */   abi bk;
/*   13:     */   private ahd bo;
/*   14:     */   private aqd bp;
/*   15:     */   private int bq;
/*   16:     */   private boolean br;
/*   17:     */   private boolean bs;
/*   18:     */   private int bt;
/*   19:     */   private String bu;
/*   20:     */   private int bv;
/*   21:     */   private int bw;
/*   22:     */   private boolean bx;
/*   23:     */   private boolean by;
/*   24:  83 */   private wa bz = new wa("Items", false, 8);
/*   25:     */   
/*   26:     */   public agp(aqu paramaqu)
/*   27:     */   {
/*   28:  89 */     this(paramaqu, 0);
/*   29:     */   }
/*   30:     */   
/*   31:     */   public agp(aqu paramaqu, int paramInt)
/*   32:     */   {
/*   33:  93 */     super(paramaqu);
/*   34:  94 */     r(paramInt);
/*   35:  95 */     a(0.6F, 1.8F);
/*   36:     */     
/*   37:  97 */     ((aay)s()).b(true);
/*   38:  98 */     ((aay)s()).a(true);
/*   39:     */     
/*   40: 100 */     this.i.a(0, new yy(this));
/*   41: 101 */     this.i.a(1, new yp(this, new agq(this), 8.0F, 0.6D, 0.6D));
/*   42:     */     
/*   43:     */ 
/*   44:     */ 
/*   45:     */ 
/*   46:     */ 
/*   47: 107 */     this.i.a(1, new aah(this));
/*   48: 108 */     this.i.a(1, new zi(this));
/*   49: 109 */     this.i.a(2, new zl(this));
/*   50: 110 */     this.i.a(3, new aaa(this));
/*   51: 111 */     this.i.a(4, new zt(this, true));
/*   52: 112 */     this.i.a(5, new zo(this, 0.6D));
/*   53: 113 */     this.i.a(6, new zj(this));
/*   54: 114 */     this.i.a(7, new aaf(this));
/*   55: 115 */     this.i.a(9, new zf(this, ahd.class, 3.0F, 1.0F));
/*   56: 116 */     this.i.a(9, new aai(this));
/*   57: 117 */     this.i.a(9, new zy(this, 0.6D));
/*   58: 118 */     this.i.a(10, new zh(this, xn.class, 8.0F));
/*   59:     */     
/*   60: 120 */     j(true);
/*   61:     */   }
/*   62:     */   
/*   63:     */   private void ct()
/*   64:     */   {
/*   65: 127 */     if (this.by) {
/*   66: 128 */       return;
/*   67:     */     }
/*   68: 130 */     this.by = true;
/*   69: 132 */     if (i_()) {
/*   70: 133 */       this.i.a(8, new zv(this, 0.32D));
/*   71: 134 */     } else if (cj() == 0) {
/*   72: 135 */       this.i.a(6, new ze(this, 0.6D));
/*   73:     */     }
/*   74:     */   }
/*   75:     */   
/*   76:     */   protected void n()
/*   77:     */   {
/*   78: 141 */     if (cj() == 0) {
/*   79: 142 */       this.i.a(8, new ze(this, 0.6D));
/*   80:     */     }
/*   81: 145 */     super.n();
/*   82:     */   }
/*   83:     */   
/*   84:     */   protected void aW()
/*   85:     */   {
/*   86: 150 */     super.aW();
/*   87:     */     
/*   88: 152 */     a(afs.d).a(0.5D);
/*   89:     */   }
/*   90:     */   
/*   91:     */   protected void E()
/*   92:     */   {
/*   93:     */     Object localObject1;
/*   94:     */     Object localObject2;
/*   95: 157 */     if (--this.bl <= 0)
/*   96:     */     {
/*   97: 158 */       localObject1 = new dt(this);
/*   98: 159 */       this.o.ae().a((dt)localObject1);
/*   99: 160 */       this.bl = (70 + this.V.nextInt(50));
/*  100:     */       
/*  101: 162 */       this.bk = this.o.ae().a((dt)localObject1, 32);
/*  102: 163 */       if (this.bk == null)
/*  103:     */       {
/*  104: 164 */         ch();
/*  105:     */       }
/*  106:     */       else
/*  107:     */       {
/*  108: 166 */         localObject2 = this.bk.a();
/*  109: 167 */         a((dt)localObject2, (int)(this.bk.b() * 1.0F));
/*  110: 169 */         if (this.bx)
/*  111:     */         {
/*  112: 170 */           this.bx = false;
/*  113: 171 */           this.bk.b(5);
/*  114:     */         }
/*  115:     */       }
/*  116:     */     }
/*  117: 175 */     if ((!cm()) && (this.bq > 0))
/*  118:     */     {
/*  119: 176 */       this.bq -= 1;
/*  120: 177 */       if (this.bq <= 0)
/*  121:     */       {
/*  122: 178 */         if (this.br)
/*  123:     */         {
/*  124: 180 */           for (localObject1 = this.bp.iterator(); ((Iterator)localObject1).hasNext();)
/*  125:     */           {
/*  126: 180 */             localObject2 = (aqc)((Iterator)localObject1).next();
/*  127: 181 */             if (((aqc)localObject2).h()) {
/*  128: 182 */               ((aqc)localObject2).a(this.V.nextInt(6) + this.V.nextInt(6) + 2);
/*  129:     */             }
/*  130:     */           }
/*  131: 186 */           cu();
/*  132: 187 */           this.br = false;
/*  133: 189 */           if ((this.bk != null) && (this.bu != null))
/*  134:     */           {
/*  135: 190 */             this.o.a(this, (byte)14);
/*  136: 191 */             this.bk.a(this.bu, 1);
/*  137:     */           }
/*  138:     */         }
/*  139: 194 */         c(new wq(wp.l.H, 200, 0));
/*  140:     */       }
/*  141:     */     }
/*  142: 198 */     super.E();
/*  143:     */   }
/*  144:     */   
/*  145:     */   public boolean a(ahd paramahd)
/*  146:     */   {
/*  147: 204 */     amj localamj = paramahd.bg.h();
/*  148: 205 */     int i = (localamj != null) && (localamj.b() == amk.bJ) ? 1 : 0;
/*  149: 207 */     if ((i == 0) && (ai()) && (!cm()) && (!i_()))
/*  150:     */     {
/*  151: 208 */       if ((!this.o.D) && ((this.bp == null) || (this.bp.size() > 0)))
/*  152:     */       {
/*  153: 210 */         a_(paramahd);
/*  154: 211 */         paramahd.a(this);
/*  155:     */       }
/*  156: 213 */       paramahd.b(ty.F);
/*  157: 214 */       return true;
/*  158:     */     }
/*  159: 216 */     return super.a(paramahd);
/*  160:     */   }
/*  161:     */   
/*  162:     */   protected void h()
/*  163:     */   {
/*  164: 221 */     super.h();
/*  165: 222 */     this.ac.a(16, Integer.valueOf(0));
/*  166:     */   }
/*  167:     */   
/*  168:     */   public void b(fn paramfn)
/*  169:     */   {
/*  170: 227 */     super.b(paramfn);
/*  171: 228 */     paramfn.a("Profession", cj());
/*  172: 229 */     paramfn.a("Riches", this.bt);
/*  173: 230 */     paramfn.a("Career", this.bv);
/*  174: 231 */     paramfn.a("CareerLevel", this.bw);
/*  175: 232 */     paramfn.a("Willing", this.bs);
/*  176: 233 */     if (this.bp != null) {
/*  177: 234 */       paramfn.a("Offers", this.bp.a());
/*  178:     */     }
/*  179: 236 */     fv localfv = new fv();
/*  180: 237 */     for (int i = 0; i < this.bz.n_(); i++)
/*  181:     */     {
/*  182: 238 */       amj localamj = this.bz.a(i);
/*  183: 239 */       if (localamj != null) {
/*  184: 240 */         localfv.a(localamj.b(new fn()));
/*  185:     */       }
/*  186:     */     }
/*  187: 243 */     paramfn.a("Inventory", localfv);
/*  188:     */   }
/*  189:     */   
/*  190:     */   public void a(fn paramfn)
/*  191:     */   {
/*  192: 248 */     super.a(paramfn);
/*  193: 249 */     r(paramfn.f("Profession"));
/*  194: 250 */     this.bt = paramfn.f("Riches");
/*  195: 251 */     this.bv = paramfn.f("Career");
/*  196: 252 */     this.bw = paramfn.f("CareerLevel");
/*  197: 253 */     this.bs = paramfn.n("Willing");
/*  198: 254 */     if (paramfn.b("Offers", 10))
/*  199:     */     {
/*  200: 255 */       localObject = paramfn.m("Offers");
/*  201: 256 */       this.bp = new aqd((fn)localObject);
/*  202:     */     }
/*  203: 258 */     Object localObject = paramfn.c("Inventory", 10);
/*  204: 259 */     for (int i = 0; i < ((fv)localObject).c(); i++)
/*  205:     */     {
/*  206: 260 */       amj localamj = amj.a(((fv)localObject).b(i));
/*  207: 261 */       if (localamj != null) {
/*  208: 262 */         this.bz.a(localamj);
/*  209:     */       }
/*  210:     */     }
/*  211: 266 */     j(true);
/*  212: 267 */     ct();
/*  213:     */   }
/*  214:     */   
/*  215:     */   protected boolean C()
/*  216:     */   {
/*  217: 272 */     return false;
/*  218:     */   }
/*  219:     */   
/*  220:     */   protected String z()
/*  221:     */   {
/*  222: 277 */     if (cm()) {
/*  223: 278 */       return "mob.villager.haggle";
/*  224:     */     }
/*  225: 280 */     return "mob.villager.idle";
/*  226:     */   }
/*  227:     */   
/*  228:     */   protected String bn()
/*  229:     */   {
/*  230: 285 */     return "mob.villager.hit";
/*  231:     */   }
/*  232:     */   
/*  233:     */   protected String bo()
/*  234:     */   {
/*  235: 290 */     return "mob.villager.death";
/*  236:     */   }
/*  237:     */   
/*  238:     */   public void r(int paramInt)
/*  239:     */   {
/*  240: 294 */     this.ac.b(16, Integer.valueOf(paramInt));
/*  241:     */   }
/*  242:     */   
/*  243:     */   public int cj()
/*  244:     */   {
/*  245: 298 */     return Math.max(this.ac.c(16) % 5, 0);
/*  246:     */   }
/*  247:     */   
/*  248:     */   public boolean ck()
/*  249:     */   {
/*  250: 302 */     return this.bm;
/*  251:     */   }
/*  252:     */   
/*  253:     */   public void l(boolean paramBoolean)
/*  254:     */   {
/*  255: 306 */     this.bm = paramBoolean;
/*  256:     */   }
/*  257:     */   
/*  258:     */   public void m(boolean paramBoolean)
/*  259:     */   {
/*  260: 310 */     this.bn = paramBoolean;
/*  261:     */   }
/*  262:     */   
/*  263:     */   public boolean cl()
/*  264:     */   {
/*  265: 314 */     return this.bn;
/*  266:     */   }
/*  267:     */   
/*  268:     */   public void b(xm paramxm)
/*  269:     */   {
/*  270: 319 */     super.b(paramxm);
/*  271: 320 */     if ((this.bk != null) && (paramxm != null))
/*  272:     */     {
/*  273: 321 */       this.bk.a(paramxm);
/*  274: 323 */       if ((paramxm instanceof ahd))
/*  275:     */       {
/*  276: 324 */         int i = -1;
/*  277: 325 */         if (i_()) {
/*  278: 326 */           i = -3;
/*  279:     */         }
/*  280: 328 */         this.bk.a(paramxm.d_(), i);
/*  281: 329 */         if (ai()) {
/*  282: 330 */           this.o.a(this, (byte)13);
/*  283:     */         }
/*  284:     */       }
/*  285:     */     }
/*  286:     */   }
/*  287:     */   
/*  288:     */   public void a(wh paramwh)
/*  289:     */   {
/*  290: 338 */     if (this.bk != null)
/*  291:     */     {
/*  292: 339 */       wv localwv = paramwh.j();
/*  293: 340 */       if (localwv != null)
/*  294:     */       {
/*  295: 341 */         if ((localwv instanceof ahd)) {
/*  296: 342 */           this.bk.a(localwv.d_(), -2);
/*  297: 343 */         } else if ((localwv instanceof aex)) {
/*  298: 344 */           this.bk.h();
/*  299:     */         }
/*  300:     */       }
/*  301:     */       else
/*  302:     */       {
/*  303: 349 */         ahd localahd = this.o.a(this, 16.0D);
/*  304: 350 */         if (localahd != null) {
/*  305: 351 */           this.bk.h();
/*  306:     */         }
/*  307:     */       }
/*  308:     */     }
/*  309: 356 */     super.a(paramwh);
/*  310:     */   }
/*  311:     */   
/*  312:     */   public void a_(ahd paramahd)
/*  313:     */   {
/*  314: 361 */     this.bo = paramahd;
/*  315:     */   }
/*  316:     */   
/*  317:     */   public ahd u_()
/*  318:     */   {
/*  319: 366 */     return this.bo;
/*  320:     */   }
/*  321:     */   
/*  322:     */   public boolean cm()
/*  323:     */   {
/*  324: 370 */     return this.bo != null;
/*  325:     */   }
/*  326:     */   
/*  327:     */   public boolean n(boolean paramBoolean)
/*  328:     */   {
/*  329: 374 */     if ((!this.bs) && (paramBoolean) && (cp()))
/*  330:     */     {
/*  331: 375 */       int i = 0;
/*  332: 377 */       for (int j = 0; j < this.bz.n_(); j++)
/*  333:     */       {
/*  334: 378 */         amj localamj = this.bz.a(j);
/*  335: 379 */         if (localamj != null) {
/*  336: 380 */           if ((localamj.b() == amk.P) && (localamj.b >= 3))
/*  337:     */           {
/*  338: 381 */             i = 1;
/*  339: 382 */             this.bz.a(j, 3);
/*  340:     */           }
/*  341: 383 */           else if (((localamj.b() == amk.bS) || (localamj.b() == amk.bR)) && (localamj.b >= 12))
/*  342:     */           {
/*  343: 384 */             i = 1;
/*  344: 385 */             this.bz.a(j, 12);
/*  345:     */           }
/*  346:     */         }
/*  347: 388 */         if (i != 0)
/*  348:     */         {
/*  349: 389 */           this.o.a(this, (byte)18);
/*  350: 390 */           this.bs = true;
/*  351: 391 */           break;
/*  352:     */         }
/*  353:     */       }
/*  354:     */     }
/*  355: 396 */     return this.bs;
/*  356:     */   }
/*  357:     */   
/*  358:     */   public void o(boolean paramBoolean)
/*  359:     */   {
/*  360: 400 */     this.bs = paramBoolean;
/*  361:     */   }
/*  362:     */   
/*  363:     */   public void a(aqc paramaqc)
/*  364:     */   {
/*  365: 405 */     paramaqc.g();
/*  366: 406 */     this.a_ = (-w());
/*  367: 407 */     a("mob.villager.yes", bA(), bB());
/*  368:     */     
/*  369: 409 */     int i = 3 + this.V.nextInt(4);
/*  370: 412 */     if ((paramaqc.e() == 1) || (this.V.nextInt(5) == 0))
/*  371:     */     {
/*  372: 413 */       this.bq = 40;
/*  373: 414 */       this.br = true;
/*  374: 415 */       this.bs = true;
/*  375: 416 */       if (this.bo != null) {
/*  376: 417 */         this.bu = this.bo.d_();
/*  377:     */       } else {
/*  378: 419 */         this.bu = null;
/*  379:     */       }
/*  380: 421 */       i += 5;
/*  381:     */     }
/*  382: 423 */     if (paramaqc.a().b() == amk.bO) {
/*  383: 424 */       this.bt += paramaqc.a().b;
/*  384:     */     }
/*  385: 427 */     if (paramaqc.j()) {
/*  386: 428 */       this.o.d(new xk(this.o, this.s, this.t + 0.5D, this.u, i));
/*  387:     */     }
/*  388:     */   }
/*  389:     */   
/*  390:     */   public void a_(amj paramamj)
/*  391:     */   {
/*  392: 434 */     if ((!this.o.D) && (this.a_ > -w() + 20))
/*  393:     */     {
/*  394: 435 */       this.a_ = (-w());
/*  395: 436 */       if (paramamj != null) {
/*  396: 437 */         a("mob.villager.yes", bA(), bB());
/*  397:     */       } else {
/*  398: 439 */         a("mob.villager.no", bA(), bB());
/*  399:     */       }
/*  400:     */     }
/*  401:     */   }
/*  402:     */   
/*  403:     */   public aqd b_(ahd paramahd)
/*  404:     */   {
/*  405: 446 */     if (this.bp == null) {
/*  406: 447 */       cu();
/*  407:     */     }
/*  408: 449 */     return this.bp;
/*  409:     */   }
/*  410:     */   
/*  411:     */   private void cu()
/*  412:     */   {
/*  413: 453 */     agw[][][] arrayOfagw = bA[cj()];
/*  414: 455 */     if ((this.bv == 0) || (this.bw == 0))
/*  415:     */     {
/*  416: 457 */       this.bv = (this.V.nextInt(arrayOfagw.length) + 1);
/*  417: 458 */       this.bw = 1;
/*  418:     */     }
/*  419:     */     else
/*  420:     */     {
/*  421: 460 */       this.bw += 1;
/*  422:     */     }
/*  423: 463 */     if (this.bp == null) {
/*  424: 464 */       this.bp = new aqd();
/*  425:     */     }
/*  426: 467 */     int i = this.bv - 1;
/*  427: 468 */     int j = this.bw - 1;
/*  428:     */     
/*  429: 470 */     agw[][] arrayOfagw1 = arrayOfagw[i];
/*  430: 471 */     if (j < arrayOfagw1.length)
/*  431:     */     {
/*  432: 472 */       agw[] arrayOfagw2 = arrayOfagw1[j];
/*  433: 473 */       for (agw localagw : arrayOfagw2) {
/*  434: 474 */         localagw.a(this.bp, this.V);
/*  435:     */       }
/*  436:     */     }
/*  437:     */   }
/*  438:     */   
/*  439:     */   public void a(aqd paramaqd) {}
/*  440:     */   
/*  441:     */   public ho e_()
/*  442:     */   {
/*  443: 485 */     String str1 = aL();
/*  444: 486 */     if ((str1 != null) && (str1.length() > 0)) {
/*  445: 487 */       return new hy(str1);
/*  446:     */     }
/*  447: 490 */     if (this.bp == null) {
/*  448: 492 */       cu();
/*  449:     */     }
/*  450: 495 */     String str2 = null;
/*  451: 496 */     switch (cj())
/*  452:     */     {
/*  453:     */     case 0: 
/*  454: 498 */       if (this.bv == 1) {
/*  455: 499 */         str2 = "farmer";
/*  456: 500 */       } else if (this.bv == 2) {
/*  457: 501 */         str2 = "fisherman";
/*  458: 502 */       } else if (this.bv == 3) {
/*  459: 503 */         str2 = "shepherd";
/*  460: 504 */       } else if (this.bv == 4) {
/*  461: 505 */         str2 = "fletcher";
/*  462:     */       }
/*  463:     */       break;
/*  464:     */     case 1: 
/*  465: 510 */       str2 = "librarian";
/*  466:     */       
/*  467: 512 */       break;
/*  468:     */     case 2: 
/*  469: 514 */       str2 = "cleric";
/*  470:     */       
/*  471: 516 */       break;
/*  472:     */     case 3: 
/*  473: 518 */       if (this.bv == 1) {
/*  474: 519 */         str2 = "armor";
/*  475: 520 */       } else if (this.bv == 2) {
/*  476: 521 */         str2 = "weapon";
/*  477: 522 */       } else if (this.bv == 3) {
/*  478: 523 */         str2 = "tool";
/*  479:     */       }
/*  480:     */       break;
/*  481:     */     case 4: 
/*  482: 528 */       if (this.bv == 1) {
/*  483: 529 */         str2 = "butcher";
/*  484: 530 */       } else if (this.bv == 2) {
/*  485: 531 */         str2 = "leather";
/*  486:     */       }
/*  487:     */       break;
/*  488:     */     }
/*  489: 537 */     if (str2 != null)
/*  490:     */     {
/*  491: 538 */       hz localhz = new hz("entity.Villager." + str2, new Object[0]);
/*  492: 539 */       localhz.b().a(aP());
/*  493: 540 */       localhz.b().a(aJ().toString());
/*  494: 541 */       return localhz;
/*  495:     */     }
/*  496: 544 */     return super.e_();
/*  497:     */   }
/*  498:     */   
/*  499:     */   public float aR()
/*  500:     */   {
/*  501: 549 */     float f = 1.62F;
/*  502: 550 */     if (i_()) {
/*  503: 551 */       f = (float)(f - 0.8100000000000001D);
/*  504:     */     }
/*  505: 553 */     return f;
/*  506:     */   }
/*  507:     */   
/*  508: 557 */   private static final agw[][][][] bA = { { { { new agr(amk.O, new agx(18, 22)), new agr(amk.bS, new agx(15, 19)), new agr(amk.bR, new agx(15, 19)), new agv(amk.P, new agx(-4, -2)) }, { new agr(alq.a(aty.aU), new agx(8, 13)), new agv(amk.ca, new agx(-3, -2)) }, { new agr(alq.a(aty.bk), new agx(7, 12)), new agv(amk.e, new agx(-5, -7)) }, { new agv(amk.bc, new agx(-6, -10)), new agv(amk.aZ, new agx(1, 1)) } }, { { new agr(amk.F, new agx(15, 20)), new agr(amk.h, new agx(16, 24)), new agu(amk.aU, new agx(6, 6), amk.aV, new agx(6, 6)) }, { new agt(amk.aR, new agx(7, 8)) } }, { { new agr(alq.a(aty.L), new agx(16, 22)), new agv(amk.be, new agx(3, 4)) }, { new agv(new amj(alq.a(aty.L), 1, 0), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 1), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 2), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 3), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 4), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 5), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 6), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 7), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 8), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 9), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 10), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 11), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 12), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 13), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 14), new agx(1, 2)), new agv(new amj(alq.a(aty.L), 1, 15), new agx(1, 2)) } }, { { new agr(amk.F, new agx(15, 20)), new agv(amk.g, new agx(-12, -8)) }, { new agv(amk.f, new agx(2, 3)), new agu(alq.a(aty.n), new agx(10, 10), amk.ak, new agx(6, 10)) } } }, { { { new agr(amk.aK, new agx(24, 36)), new ags() }, { new agr(amk.aL, new agx(8, 10)), new agv(amk.aQ, new agx(10, 12)), new agv(alq.a(aty.X), new agx(3, 4)) }, { new agr(amk.bN, new agx(2, 2)), new agv(amk.aS, new agx(10, 12)), new agv(alq.a(aty.w), new agx(-5, -3)) }, { new ags() }, { new ags() }, { new agv(amk.co, new agx(20, 22)) } } }, { { { new agr(amk.bt, new agx(36, 40)), new agr(amk.k, new agx(8, 10)) }, { new agv(amk.aC, new agx(-4, -1)), new agv(new amj(amk.aW, 1, akv.l.b()), new agx(-2, -1)) }, { new agv(amk.bH, new agx(7, 11)), new agv(alq.a(aty.aX), new agx(-3, -1)) }, { new agv(amk.bK, new agx(3, 11)) } } }, { { { new agr(amk.h, new agx(16, 24)), new agv(amk.Y, new agx(4, 6)) }, { new agr(amk.j, new agx(7, 9)), new agv(amk.Z, new agx(10, 14)) }, { new agr(amk.i, new agx(3, 4)), new agt(amk.ad, new agx(16, 19)) }, { new agv(amk.X, new agx(5, 7)), new agv(amk.W, new agx(9, 11)), new agv(amk.U, new agx(5, 7)), new agv(amk.V, new agx(11, 15)) } }, { { new agr(amk.h, new agx(16, 24)), new agv(amk.c, new agx(6, 8)) }, { new agr(amk.j, new agx(7, 9)), new agt(amk.l, new agx(9, 10)) }, { new agr(amk.i, new agx(3, 4)), new agt(amk.u, new agx(12, 15)), new agt(amk.x, new agx(9, 12)) } }, { { new agr(amk.h, new agx(16, 24)), new agt(amk.a, new agx(5, 7)) }, { new agr(amk.j, new agx(7, 9)), new agt(amk.b, new agx(9, 11)) }, { new agr(amk.i, new agx(3, 4)), new agt(amk.w, new agx(12, 15)) } } }, { { { new agr(amk.al, new agx(14, 18)), new agr(amk.bk, new agx(14, 18)) }, { new agr(amk.h, new agx(16, 24)), new agv(amk.am, new agx(-7, -5)), new agv(amk.bl, new agx(-8, -6)) } }, { { new agr(amk.aF, new agx(9, 12)), new agv(amk.S, new agx(2, 4)) }, { new agt(amk.R, new agx(7, 12)) }, { new agv(amk.aA, new agx(8, 10)) } } } };
/*  509:     */   
/*  510:     */   public void a(byte paramByte)
/*  511:     */   {
/*  512: 911 */     if (paramByte == 12) {
/*  513: 912 */       a(ew.I);
/*  514: 913 */     } else if (paramByte == 13) {
/*  515: 914 */       a(ew.u);
/*  516: 915 */     } else if (paramByte == 14) {
/*  517: 916 */       a(ew.v);
/*  518:     */     } else {
/*  519: 918 */       super.a(paramByte);
/*  520:     */     }
/*  521:     */   }
/*  522:     */   
/*  523:     */   private void a(ew paramew)
/*  524:     */   {
/*  525: 923 */     for (int i = 0; i < 5; i++)
/*  526:     */     {
/*  527: 924 */       double d1 = this.V.nextGaussian() * 0.02D;
/*  528: 925 */       double d2 = this.V.nextGaussian() * 0.02D;
/*  529: 926 */       double d3 = this.V.nextGaussian() * 0.02D;
/*  530: 927 */       this.o.a(paramew, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 1.0D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, d1, d2, d3, new int[0]);
/*  531:     */     }
/*  532:     */   }
/*  533:     */   
/*  534:     */   public xq a(vu paramvu, xq paramxq)
/*  535:     */   {
/*  536: 934 */     paramxq = super.a(paramvu, paramxq);
/*  537:     */     
/*  538: 936 */     r(this.o.s.nextInt(5));
/*  539:     */     
/*  540: 938 */     ct();
/*  541:     */     
/*  542: 940 */     return paramxq;
/*  543:     */   }
/*  544:     */   
/*  545:     */   public void cn()
/*  546:     */   {
/*  547: 944 */     this.bx = true;
/*  548:     */   }
/*  549:     */   
/*  550:     */   public agp b(ws paramws)
/*  551:     */   {
/*  552: 949 */     agp localagp = new agp(this.o);
/*  553: 950 */     localagp.a(this.o.E(new dt(localagp)), null);
/*  554: 951 */     return localagp;
/*  555:     */   }
/*  556:     */   
/*  557:     */   public boolean ca()
/*  558:     */   {
/*  559: 956 */     return false;
/*  560:     */   }
/*  561:     */   
/*  562:     */   public void a(ads paramads)
/*  563:     */   {
/*  564: 961 */     if (this.o.D) {
/*  565: 962 */       return;
/*  566:     */     }
/*  567: 965 */     agi localagi = new agi(this.o);
/*  568: 966 */     localagi.b(this.s, this.t, this.u, this.y, this.z);
/*  569: 967 */     localagi.a(this.o.E(new dt(localagi)), null);
/*  570: 968 */     this.o.d(localagi);
/*  571: 969 */     J();
/*  572:     */   }
/*  573:     */   
/*  574:     */   public wa co()
/*  575:     */   {
/*  576: 973 */     return this.bz;
/*  577:     */   }
/*  578:     */   
/*  579:     */   protected void a(adw paramadw)
/*  580:     */   {
/*  581: 978 */     amj localamj1 = paramadw.l();
/*  582: 979 */     alq localalq = localamj1.b();
/*  583: 981 */     if (a(localalq))
/*  584:     */     {
/*  585: 982 */       amj localamj2 = this.bz.a(localamj1);
/*  586: 983 */       if (localamj2 == null) {
/*  587: 984 */         paramadw.J();
/*  588:     */       } else {
/*  589: 986 */         localamj1.b = localamj2.b;
/*  590:     */       }
/*  591:     */     }
/*  592:     */   }
/*  593:     */   
/*  594:     */   private boolean a(alq paramalq)
/*  595:     */   {
/*  596: 992 */     return (paramalq == amk.P) || (paramalq == amk.bS) || (paramalq == amk.bR) || (paramalq == amk.O) || (paramalq == amk.N);
/*  597:     */   }
/*  598:     */   
/*  599:     */   public boolean cp()
/*  600:     */   {
/*  601: 996 */     return s(1);
/*  602:     */   }
/*  603:     */   
/*  604:     */   public boolean cq()
/*  605:     */   {
/*  606:1000 */     return s(2);
/*  607:     */   }
/*  608:     */   
/*  609:     */   public boolean cr()
/*  610:     */   {
/*  611:1004 */     int i = cj() == 0 ? 1 : 0;
/*  612:1005 */     if (i != 0) {
/*  613:1006 */       return !s(5);
/*  614:     */     }
/*  615:1008 */     return !s(1);
/*  616:     */   }
/*  617:     */   
/*  618:     */   private boolean s(int paramInt)
/*  619:     */   {
/*  620:1012 */     int i = cj() == 0 ? 1 : 0;
/*  621:1014 */     for (int j = 0; j < this.bz.n_(); j++)
/*  622:     */     {
/*  623:1015 */       amj localamj = this.bz.a(j);
/*  624:1016 */       if (localamj != null)
/*  625:     */       {
/*  626:1017 */         if (((localamj.b() == amk.P) && (localamj.b >= 3 * paramInt)) || ((localamj.b() == amk.bS) && (localamj.b >= 12 * paramInt)) || ((localamj.b() == amk.bR) && (localamj.b >= 12 * paramInt))) {
/*  627:1019 */           return true;
/*  628:     */         }
/*  629:1021 */         if ((i != 0) && 
/*  630:1022 */           (localamj.b() == amk.O) && (localamj.b >= 9 * paramInt)) {
/*  631:1023 */           return true;
/*  632:     */         }
/*  633:     */       }
/*  634:     */     }
/*  635:1028 */     return false;
/*  636:     */   }
/*  637:     */   
/*  638:     */   public boolean cs()
/*  639:     */   {
/*  640:1032 */     for (int i = 0; i < this.bz.n_(); i++)
/*  641:     */     {
/*  642:1033 */       amj localamj = this.bz.a(i);
/*  643:1034 */       if ((localamj != null) && (
/*  644:1035 */         (localamj.b() == amk.N) || (localamj.b() == amk.bS) || (localamj.b() == amk.bR))) {
/*  645:1036 */         return true;
/*  646:     */       }
/*  647:     */     }
/*  648:1040 */     return false;
/*  649:     */   }
/*  650:     */   
/*  651:     */   public boolean d(int paramInt, amj paramamj)
/*  652:     */   {
/*  653:1045 */     if (super.d(paramInt, paramamj)) {
/*  654:1046 */       return true;
/*  655:     */     }
/*  656:1048 */     int i = paramInt - 300;
/*  657:1049 */     if ((i >= 0) && (i < this.bz.n_()))
/*  658:     */     {
/*  659:1050 */       this.bz.a(i, paramamj);
/*  660:1051 */       return true;
/*  661:     */     }
/*  662:1053 */     return false;
/*  663:     */   }
/*  664:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     agp
 * JD-Core Version:    0.7.0.1
 */