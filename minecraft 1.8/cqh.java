/*    1:     */ import java.util.List;
/*    2:     */ import javax.vecmath.Vector3f;
/*    3:     */ 
/*    4:     */ public class cqh
/*    5:     */   implements cvl
/*    6:     */ {
/*    7:  38 */   private static final oa k = new oa("textures/misc/enchanted_item_glint.png");
/*    8:  51 */   private boolean l = true;
/*    9:     */   public float a;
/*   10:     */   private final ckk m;
/*   11:     */   private final cug n;
/*   12:     */   
/*   13:     */   public cqh(cug paramcug, cxk paramcxk)
/*   14:     */   {
/*   15:  58 */     this.n = paramcug;
/*   16:  59 */     this.m = new ckk(paramcxk);
/*   17:     */     
/*   18:  61 */     b();
/*   19:     */   }
/*   20:     */   
/*   21:     */   public void a(boolean paramBoolean)
/*   22:     */   {
/*   23:  65 */     this.l = paramBoolean;
/*   24:     */   }
/*   25:     */   
/*   26:     */   public ckk a()
/*   27:     */   {
/*   28:  69 */     return this.m;
/*   29:     */   }
/*   30:     */   
/*   31:     */   protected void a(alq paramalq, int paramInt, String paramString)
/*   32:     */   {
/*   33:  73 */     this.m.a(paramalq, paramInt, new cxl(paramString, "inventory"));
/*   34:     */   }
/*   35:     */   
/*   36:     */   protected void a(atr paramatr, int paramInt, String paramString)
/*   37:     */   {
/*   38:  77 */     a(alq.a(paramatr), paramInt, paramString);
/*   39:     */   }
/*   40:     */   
/*   41:     */   private void a(atr paramatr, String paramString)
/*   42:     */   {
/*   43:  81 */     a(paramatr, 0, paramString);
/*   44:     */   }
/*   45:     */   
/*   46:     */   private void a(alq paramalq, String paramString)
/*   47:     */   {
/*   48:  85 */     a(paramalq, 0, paramString);
/*   49:     */   }
/*   50:     */   
/*   51:     */   private void a(cxe paramcxe, amj paramamj)
/*   52:     */   {
/*   53:  89 */     a(paramcxe, -1, paramamj);
/*   54:     */   }
/*   55:     */   
/*   56:     */   private void a(cxe paramcxe, int paramInt)
/*   57:     */   {
/*   58:  93 */     a(paramcxe, paramInt, null);
/*   59:     */   }
/*   60:     */   
/*   61:     */   private void a(cxe paramcxe, int paramInt, amj paramamj)
/*   62:     */   {
/*   63:  97 */     ckx localckx = ckx.a();
/*   64:  98 */     civ localciv = localckx.c();
/*   65:  99 */     localciv.b();
/*   66: 100 */     localciv.a(cuq.b);
/*   67: 102 */     for (ej localej : ej.values()) {
/*   68: 103 */       a(localciv, paramcxe.a(localej), paramInt, paramamj);
/*   69:     */     }
/*   70: 105 */     a(localciv, paramcxe.a(), paramInt, paramamj);
/*   71:     */     
/*   72: 107 */     localckx.b();
/*   73:     */   }
/*   74:     */   
/*   75:     */   public void a(amj paramamj, cxe paramcxe)
/*   76:     */   {
/*   77: 111 */     cjm.E();
/*   78: 112 */     cjm.a(0.5F, 0.5F, 0.5F);
/*   79: 113 */     if (paramcxe.d())
/*   80:     */     {
/*   81: 114 */       cjm.b(180.0F, 0.0F, 1.0F, 0.0F);
/*   82: 115 */       cjm.b(-0.5F, -0.5F, -0.5F);
/*   83: 116 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*   84: 117 */       cjm.B();
/*   85:     */       
/*   86: 119 */       cjd.a.a(paramamj);
/*   87:     */     }
/*   88:     */     else
/*   89:     */     {
/*   90: 121 */       cjm.b(-0.5F, -0.5F, -0.5F);
/*   91:     */       
/*   92: 123 */       a(paramcxe, paramamj);
/*   93: 124 */       if (paramamj.t()) {
/*   94: 125 */         a(paramcxe);
/*   95:     */       }
/*   96:     */     }
/*   97: 128 */     cjm.F();
/*   98:     */   }
/*   99:     */   
/*  100:     */   private void a(cxe paramcxe)
/*  101:     */   {
/*  102: 132 */     cjm.a(false);
/*  103: 133 */     cjm.c(514);
/*  104: 134 */     cjm.f();
/*  105: 135 */     cjm.b(768, 1);
/*  106:     */     
/*  107: 137 */     this.n.a(k);
/*  108:     */     
/*  109: 139 */     cjm.n(5890);
/*  110:     */     
/*  111: 141 */     cjm.E();
/*  112: 142 */     cjm.a(8.0F, 8.0F, 8.0F);
/*  113:     */     
/*  114: 144 */     float f1 = (float)(bsu.I() % 3000L) / 3000.0F / 8.0F;
/*  115: 145 */     cjm.b(f1, 0.0F, 0.0F);
/*  116: 146 */     cjm.b(-50.0F, 0.0F, 0.0F, 1.0F);
/*  117: 147 */     a(paramcxe, -8372020);
/*  118: 148 */     cjm.F();
/*  119:     */     
/*  120: 150 */     cjm.E();
/*  121: 151 */     cjm.a(8.0F, 8.0F, 8.0F);
/*  122: 152 */     float f2 = (float)(bsu.I() % 4873L) / 4873.0F / 8.0F;
/*  123: 153 */     cjm.b(-f2, 0.0F, 0.0F);
/*  124: 154 */     cjm.b(10.0F, 0.0F, 0.0F, 1.0F);
/*  125: 155 */     a(paramcxe, -8372020);
/*  126: 156 */     cjm.F();
/*  127:     */     
/*  128: 158 */     cjm.n(5888);
/*  129:     */     
/*  130: 160 */     cjm.b(770, 771);
/*  131: 161 */     cjm.e();
/*  132: 162 */     cjm.c(515);
/*  133: 163 */     cjm.a(true);
/*  134:     */     
/*  135:     */ 
/*  136: 166 */     this.n.a(cua.g);
/*  137:     */   }
/*  138:     */   
/*  139:     */   private void a(civ paramciv, clt paramclt)
/*  140:     */   {
/*  141: 170 */     fd localfd = paramclt.d().m();
/*  142: 171 */     paramciv.e(localfd.n(), localfd.o(), localfd.p());
/*  143:     */   }
/*  144:     */   
/*  145:     */   private void a(civ paramciv, clt paramclt, int paramInt)
/*  146:     */   {
/*  147: 175 */     paramciv.a(paramclt.a());
/*  148: 176 */     paramciv.d(paramInt);
/*  149: 177 */     a(paramciv, paramclt);
/*  150:     */   }
/*  151:     */   
/*  152:     */   private void a(civ paramciv, List paramList, int paramInt, amj paramamj)
/*  153:     */   {
/*  154: 181 */     int i1 = (paramInt == -1) && (paramamj != null) ? 1 : 0;
/*  155: 183 */     for (clt localclt : paramList)
/*  156:     */     {
/*  157: 184 */       int i2 = paramInt;
/*  158: 185 */       if ((i1 != 0) && (localclt.b()))
/*  159:     */       {
/*  160: 186 */         i2 = paramamj.b().a(paramamj, localclt.c());
/*  161: 187 */         if (cji.a) {
/*  162: 188 */           i2 = cuj.c(i2);
/*  163:     */         }
/*  164: 190 */         i2 |= 0xFF000000;
/*  165:     */       }
/*  166: 193 */       a(paramciv, localclt, i2);
/*  167:     */     }
/*  168:     */   }
/*  169:     */   
/*  170:     */   public boolean a(amj paramamj)
/*  171:     */   {
/*  172: 198 */     cxe localcxe = this.m.a(paramamj);
/*  173: 199 */     if (localcxe == null) {
/*  174: 200 */       return false;
/*  175:     */     }
/*  176: 203 */     return localcxe.c();
/*  177:     */   }
/*  178:     */   
/*  179:     */   private void c(amj paramamj)
/*  180:     */   {
/*  181: 207 */     cxe localcxe = this.m.a(paramamj);
/*  182: 208 */     alq localalq = paramamj.b();
/*  183: 210 */     if (localalq == null) {
/*  184: 211 */       return;
/*  185:     */     }
/*  186: 214 */     boolean bool = localcxe.c();
/*  187: 215 */     if (!bool) {
/*  188: 216 */       cjm.a(2.0F, 2.0F, 2.0F);
/*  189:     */     }
/*  190: 219 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  191:     */   }
/*  192:     */   
/*  193:     */   public void b(amj paramamj)
/*  194:     */   {
/*  195: 223 */     cxe localcxe = this.m.a(paramamj);
/*  196:     */     
/*  197: 225 */     a(paramamj, localcxe, cmz.a);
/*  198:     */   }
/*  199:     */   
/*  200:     */   public void a(amj paramamj, xm paramxm, cmz paramcmz)
/*  201:     */   {
/*  202: 229 */     cxe localcxe = this.m.a(paramamj);
/*  203: 232 */     if ((paramxm instanceof ahd))
/*  204:     */     {
/*  205: 233 */       ahd localahd = (ahd)paramxm;
/*  206:     */       
/*  207: 235 */       alq localalq = paramamj.b();
/*  208: 236 */       cxl localcxl = null;
/*  209: 238 */       if ((localalq == amk.aR) && (localahd.bE != null))
/*  210:     */       {
/*  211: 239 */         localcxl = new cxl("fishing_rod_cast", "inventory");
/*  212:     */       }
/*  213: 240 */       else if ((localalq == amk.f) && (localahd.bP() != null))
/*  214:     */       {
/*  215: 242 */         int i1 = paramamj.l() - localahd.bQ();
/*  216: 243 */         if (i1 >= 18) {
/*  217: 244 */           localcxl = new cxl("bow_pulling_2", "inventory");
/*  218: 245 */         } else if (i1 > 13) {
/*  219: 246 */           localcxl = new cxl("bow_pulling_1", "inventory");
/*  220: 247 */         } else if (i1 > 0) {
/*  221: 248 */           localcxl = new cxl("bow_pulling_0", "inventory");
/*  222:     */         }
/*  223:     */       }
/*  224: 252 */       if (localcxl != null) {
/*  225: 253 */         localcxe = this.m.a().a(localcxl);
/*  226:     */       }
/*  227:     */     }
/*  228: 257 */     a(paramamj, localcxe, paramcmz);
/*  229:     */   }
/*  230:     */   
/*  231: 260 */   public static float b = 0.0F;
/*  232: 261 */   public static float c = 0.0F;
/*  233: 262 */   public static float d = 0.0F;
/*  234: 263 */   public static float e = 0.0F;
/*  235: 264 */   public static float f = 0.0F;
/*  236: 265 */   public static float g = 0.0F;
/*  237: 266 */   public static float h = 0.0F;
/*  238: 267 */   public static float i = 0.0F;
/*  239: 268 */   public static float j = 0.0F;
/*  240:     */   
/*  241:     */   protected void a(cmv paramcmv)
/*  242:     */   {
/*  243: 271 */     if (paramcmv != cmv.a)
/*  244:     */     {
/*  245: 272 */       cjm.b(paramcmv.c.x + b, paramcmv.c.y + c, paramcmv.c.z + d);
/*  246: 273 */       cjm.b(paramcmv.b.y + f, 0.0F, 1.0F, 0.0F);
/*  247: 274 */       cjm.b(paramcmv.b.x + e, 1.0F, 0.0F, 0.0F);
/*  248: 275 */       cjm.b(paramcmv.b.z + g, 0.0F, 0.0F, 1.0F);
/*  249: 276 */       cjm.a(paramcmv.d.x + h, paramcmv.d.y + i, paramcmv.d.z + j);
/*  250:     */     }
/*  251:     */   }
/*  252:     */   
/*  253:     */   protected void a(amj paramamj, cxe paramcxe, cmz paramcmz)
/*  254:     */   {
/*  255: 281 */     this.n.a(cua.g);
/*  256: 282 */     this.n.b(cua.g).b(false, false);
/*  257:     */     
/*  258: 284 */     c(paramamj);
/*  259:     */     
/*  260: 286 */     cjm.B();
/*  261: 287 */     cjm.a(516, 0.1F);
/*  262: 288 */     cjm.l();
/*  263: 289 */     cjm.a(770, 771, 1, 0);
/*  264:     */     
/*  265: 291 */     cjm.E();
/*  266: 292 */     switch (cqj.a[paramcmz.ordinal()])
/*  267:     */     {
/*  268:     */     case 1: 
/*  269:     */       break;
/*  270:     */     case 2: 
/*  271: 296 */       a(paramcxe.f().b);
/*  272: 297 */       break;
/*  273:     */     case 3: 
/*  274: 299 */       a(paramcxe.f().c);
/*  275: 300 */       break;
/*  276:     */     case 4: 
/*  277: 302 */       a(paramcxe.f().d);
/*  278: 303 */       break;
/*  279:     */     case 5: 
/*  280: 305 */       a(paramcxe.f().e);
/*  281:     */     }
/*  282: 308 */     a(paramamj, paramcxe);
/*  283: 309 */     cjm.F();
/*  284:     */     
/*  285: 311 */     cjm.C();
/*  286: 312 */     cjm.k();
/*  287: 313 */     this.n.a(cua.g);
/*  288: 314 */     this.n.b(cua.g).a();
/*  289:     */   }
/*  290:     */   
/*  291:     */   public void a(amj paramamj, int paramInt1, int paramInt2)
/*  292:     */   {
/*  293: 318 */     cxe localcxe = this.m.a(paramamj);
/*  294:     */     
/*  295: 320 */     cjm.E();
/*  296: 321 */     this.n.a(cua.g);
/*  297: 322 */     this.n.b(cua.g).b(false, false);
/*  298:     */     
/*  299: 324 */     cjm.B();
/*  300: 325 */     cjm.d();
/*  301: 326 */     cjm.a(516, 0.1F);
/*  302: 327 */     cjm.l();
/*  303: 328 */     cjm.b(770, 771);
/*  304:     */     
/*  305: 330 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  306:     */     
/*  307:     */ 
/*  308: 333 */     a(paramInt1, paramInt2, localcxe.c());
/*  309: 334 */     a(localcxe.f().e);
/*  310: 335 */     a(paramamj, localcxe);
/*  311:     */     
/*  312: 337 */     cjm.c();
/*  313: 338 */     cjm.C();
/*  314: 339 */     cjm.f();
/*  315: 340 */     cjm.F();
/*  316: 341 */     this.n.a(cua.g);
/*  317: 342 */     this.n.b(cua.g).a();
/*  318:     */   }
/*  319:     */   
/*  320:     */   private void a(int paramInt1, int paramInt2, boolean paramBoolean)
/*  321:     */   {
/*  322: 346 */     cjm.b(paramInt1, paramInt2, 100.0F + this.a);
/*  323: 347 */     cjm.b(8.0F, 8.0F, 0.0F);
/*  324:     */     
/*  325: 349 */     cjm.a(1.0F, 1.0F, -1.0F);
/*  326: 350 */     cjm.a(0.5F, 0.5F, 0.5F);
/*  327: 352 */     if (paramBoolean)
/*  328:     */     {
/*  329: 353 */       cjm.a(40.0F, 40.0F, 40.0F);
/*  330: 354 */       cjm.b(210.0F, 1.0F, 0.0F, 0.0F);
/*  331: 355 */       cjm.b(-135.0F, 0.0F, 1.0F, 0.0F);
/*  332: 356 */       cjm.e();
/*  333:     */     }
/*  334:     */     else
/*  335:     */     {
/*  336: 358 */       cjm.a(64.0F, 64.0F, 64.0F);
/*  337: 359 */       cjm.b(180.0F, 1.0F, 0.0F, 0.0F);
/*  338: 360 */       cjm.f();
/*  339:     */     }
/*  340:     */   }
/*  341:     */   
/*  342:     */   public void b(amj paramamj, int paramInt1, int paramInt2)
/*  343:     */   {
/*  344: 365 */     if (paramamj == null) {
/*  345: 366 */       return;
/*  346:     */     }
/*  347: 369 */     this.a += 50.0F;
/*  348:     */     try
/*  349:     */     {
/*  350: 371 */       a(paramamj, paramInt1, paramInt2);
/*  351:     */     }
/*  352:     */     catch (Throwable localThrowable)
/*  353:     */     {
/*  354: 373 */       b localb = b.a(localThrowable, "Rendering item");
/*  355: 374 */       j localj = localb.a("Item being rendered");
/*  356:     */       
/*  357: 376 */       localj.a("Item Type", new cqi(this, paramamj));
/*  358:     */       
/*  359:     */ 
/*  360:     */ 
/*  361:     */ 
/*  362:     */ 
/*  363:     */ 
/*  364: 383 */       localj.a("Item Aux", new cqk(this, paramamj));
/*  365:     */       
/*  366:     */ 
/*  367:     */ 
/*  368:     */ 
/*  369:     */ 
/*  370:     */ 
/*  371: 390 */       localj.a("Item NBT", new cql(this, paramamj));
/*  372:     */       
/*  373:     */ 
/*  374:     */ 
/*  375:     */ 
/*  376:     */ 
/*  377:     */ 
/*  378: 397 */       localj.a("Item Foil", new cqm(this, paramamj));
/*  379:     */       
/*  380:     */ 
/*  381:     */ 
/*  382:     */ 
/*  383:     */ 
/*  384:     */ 
/*  385: 404 */       throw new u(localb);
/*  386:     */     }
/*  387: 407 */     this.a -= 50.0F;
/*  388:     */   }
/*  389:     */   
/*  390:     */   public void a(bty parambty, amj paramamj, int paramInt1, int paramInt2)
/*  391:     */   {
/*  392: 411 */     a(parambty, paramamj, paramInt1, paramInt2, null);
/*  393:     */   }
/*  394:     */   
/*  395:     */   public void a(bty parambty, amj paramamj, int paramInt1, int paramInt2, String paramString)
/*  396:     */   {
/*  397: 415 */     if (paramamj == null) {
/*  398: 416 */       return;
/*  399:     */     }
/*  400: 419 */     if ((paramamj.b != 1) || (paramString != null))
/*  401:     */     {
/*  402: 420 */       String str = paramString == null ? String.valueOf(paramamj.b) : paramString;
/*  403: 422 */       if ((paramString == null) && (paramamj.b < 1)) {
/*  404: 423 */         str = a.m + String.valueOf(paramamj.b);
/*  405:     */       }
/*  406: 426 */       cjm.f();
/*  407: 427 */       cjm.i();
/*  408: 428 */       cjm.k();
/*  409: 429 */       parambty.a(str, paramInt1 + 19 - 2 - parambty.a(str), paramInt2 + 6 + 3, 16777215);
/*  410: 430 */       cjm.e();
/*  411: 431 */       cjm.j();
/*  412:     */     }
/*  413: 434 */     if (paramamj.g())
/*  414:     */     {
/*  415: 435 */       int i1 = (int)Math.round(13.0D - paramamj.h() * 13.0D / paramamj.j());
/*  416: 436 */       int i2 = (int)Math.round(255.0D - paramamj.h() * 255.0D / paramamj.j());
/*  417: 437 */       cjm.f();
/*  418: 438 */       cjm.i();
/*  419: 439 */       cjm.x();
/*  420: 440 */       cjm.c();
/*  421: 441 */       cjm.k();
/*  422:     */       
/*  423: 443 */       ckx localckx = ckx.a();
/*  424: 444 */       civ localciv = localckx.c();
/*  425:     */       
/*  426: 446 */       int i3 = 255 - i2 << 16 | i2 << 8;
/*  427: 447 */       int i4 = (255 - i2) / 4 << 16 | 0x3F00;
/*  428: 448 */       a(localciv, paramInt1 + 2, paramInt2 + 13, 13, 2, 0);
/*  429: 449 */       a(localciv, paramInt1 + 2, paramInt2 + 13, 12, 1, i4);
/*  430: 450 */       a(localciv, paramInt1 + 2, paramInt2 + 13, i1, 1, i3);
/*  431:     */       
/*  432: 452 */       cjm.l();
/*  433: 453 */       cjm.d();
/*  434: 454 */       cjm.w();
/*  435: 455 */       cjm.e();
/*  436: 456 */       cjm.j();
/*  437:     */     }
/*  438:     */   }
/*  439:     */   
/*  440:     */   private void a(civ paramciv, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  441:     */   {
/*  442: 461 */     paramciv.b();
/*  443: 462 */     paramciv.c(paramInt5);
/*  444: 463 */     paramciv.b(paramInt1 + 0, paramInt2 + 0, 0.0D);
/*  445: 464 */     paramciv.b(paramInt1 + 0, paramInt2 + paramInt4, 0.0D);
/*  446: 465 */     paramciv.b(paramInt1 + paramInt3, paramInt2 + paramInt4, 0.0D);
/*  447: 466 */     paramciv.b(paramInt1 + paramInt3, paramInt2 + 0, 0.0D);
/*  448: 467 */     ckx.a().b();
/*  449:     */   }
/*  450:     */   
/*  451:     */   private void b()
/*  452:     */   {
/*  453: 482 */     a(aty.cf, "anvil_intact");
/*  454: 483 */     a(aty.cf, 1, "anvil_slightly_damaged");
/*  455: 484 */     a(aty.cf, 2, "anvil_very_damaged");
/*  456: 485 */     a(aty.cy, akv.p.a(), "black_carpet");
/*  457: 486 */     a(aty.cy, akv.l.a(), "blue_carpet");
/*  458: 487 */     a(aty.cy, akv.m.a(), "brown_carpet");
/*  459: 488 */     a(aty.cy, akv.j.a(), "cyan_carpet");
/*  460: 489 */     a(aty.cy, akv.h.a(), "gray_carpet");
/*  461: 490 */     a(aty.cy, akv.n.a(), "green_carpet");
/*  462: 491 */     a(aty.cy, akv.d.a(), "light_blue_carpet");
/*  463: 492 */     a(aty.cy, akv.f.a(), "lime_carpet");
/*  464: 493 */     a(aty.cy, akv.c.a(), "magenta_carpet");
/*  465: 494 */     a(aty.cy, akv.b.a(), "orange_carpet");
/*  466: 495 */     a(aty.cy, akv.g.a(), "pink_carpet");
/*  467: 496 */     a(aty.cy, akv.k.a(), "purple_carpet");
/*  468: 497 */     a(aty.cy, akv.o.a(), "red_carpet");
/*  469: 498 */     a(aty.cy, akv.i.a(), "silver_carpet");
/*  470: 499 */     a(aty.cy, akv.a.a(), "white_carpet");
/*  471: 500 */     a(aty.cy, akv.e.a(), "yellow_carpet");
/*  472: 501 */     a(aty.bZ, bby.b.a(), "mossy_cobblestone_wall");
/*  473: 502 */     a(aty.bZ, bby.a.a(), "cobblestone_wall");
/*  474: 503 */     a(aty.d, avd.b.a(), "coarse_dirt");
/*  475: 504 */     a(aty.d, avd.a.a(), "dirt");
/*  476: 505 */     a(aty.d, avd.c.a(), "podzol");
/*  477: 506 */     a(aty.cF, avk.d.a(), "double_fern");
/*  478: 507 */     a(aty.cF, avk.c.a(), "double_grass");
/*  479: 508 */     a(aty.cF, avk.f.a(), "paeonia");
/*  480: 509 */     a(aty.cF, avk.e.a(), "double_rose");
/*  481: 510 */     a(aty.cF, avk.a.a(), "sunflower");
/*  482: 511 */     a(aty.cF, avk.b.a(), "syringa");
/*  483: 512 */     a(aty.t, ayx.c.a(), "birch_leaves");
/*  484: 513 */     a(aty.t, ayx.d.a(), "jungle_leaves");
/*  485: 514 */     a(aty.t, ayx.a.a(), "oak_leaves");
/*  486: 515 */     a(aty.t, ayx.b.a(), "spruce_leaves");
/*  487: 516 */     a(aty.u, ayx.e.a() - 4, "acacia_leaves");
/*  488: 517 */     a(aty.u, ayx.f.a() - 4, "dark_oak_leaves");
/*  489: 518 */     a(aty.r, ayx.c.a(), "birch_log");
/*  490: 519 */     a(aty.r, ayx.d.a(), "jungle_log");
/*  491: 520 */     a(aty.r, ayx.a.a(), "oak_log");
/*  492: 521 */     a(aty.r, ayx.b.a(), "spruce_log");
/*  493: 522 */     a(aty.s, ayx.e.a() - 4, "acacia_log");
/*  494: 523 */     a(aty.s, ayx.f.a() - 4, "dark_oak_log");
/*  495: 524 */     a(aty.be, axu.f.a(), "chiseled_brick_monster_egg");
/*  496: 525 */     a(aty.be, axu.b.a(), "cobblestone_monster_egg");
/*  497: 526 */     a(aty.be, axu.e.a(), "cracked_brick_monster_egg");
/*  498: 527 */     a(aty.be, axu.d.a(), "mossy_brick_monster_egg");
/*  499: 528 */     a(aty.be, axu.a.a(), "stone_monster_egg");
/*  500: 529 */     a(aty.be, axu.c.a(), "stone_brick_monster_egg");
/*  501: 530 */     a(aty.f, ayx.e.a(), "acacia_planks");
/*  502: 531 */     a(aty.f, ayx.c.a(), "birch_planks");
/*  503: 532 */     a(aty.f, ayx.f.a(), "dark_oak_planks");
/*  504: 533 */     a(aty.f, ayx.d.a(), "jungle_planks");
/*  505: 534 */     a(aty.f, ayx.a.a(), "oak_planks");
/*  506: 535 */     a(aty.f, ayx.b.a(), "spruce_planks");
/*  507: 536 */     a(aty.cI, azj.b.a(), "prismarine_bricks");
/*  508: 537 */     a(aty.cI, azj.c.a(), "dark_prismarine");
/*  509: 538 */     a(aty.cI, azj.a.a(), "prismarine");
/*  510: 539 */     a(aty.cq, azn.b.a(), "chiseled_quartz_block");
/*  511: 540 */     a(aty.cq, azn.a.a(), "quartz_block");
/*  512: 541 */     a(aty.cq, azn.c.a(), "quartz_column");
/*  513: 542 */     a(aty.O, awa.d.b(), "allium");
/*  514: 543 */     a(aty.O, awa.c.b(), "blue_orchid");
/*  515: 544 */     a(aty.O, awa.e.b(), "houstonia");
/*  516: 545 */     a(aty.O, awa.g.b(), "orange_tulip");
/*  517: 546 */     a(aty.O, awa.j.b(), "oxeye_daisy");
/*  518: 547 */     a(aty.O, awa.i.b(), "pink_tulip");
/*  519: 548 */     a(aty.O, awa.b.b(), "poppy");
/*  520: 549 */     a(aty.O, awa.f.b(), "red_tulip");
/*  521: 550 */     a(aty.O, awa.h.b(), "white_tulip");
/*  522: 551 */     a(aty.m, bac.b.a(), "red_sand");
/*  523: 552 */     a(aty.m, bac.a.a(), "sand");
/*  524: 553 */     a(aty.A, bae.b.a(), "chiseled_sandstone");
/*  525: 554 */     a(aty.A, bae.a.a(), "sandstone");
/*  526: 555 */     a(aty.A, bae.c.a(), "smooth_sandstone");
/*  527: 556 */     a(aty.cM, azr.b.a(), "chiseled_red_sandstone");
/*  528: 557 */     a(aty.cM, azr.a.a(), "red_sandstone");
/*  529: 558 */     a(aty.cM, azr.c.a(), "smooth_red_sandstone");
/*  530: 559 */     a(aty.g, ayx.e.a(), "acacia_sapling");
/*  531: 560 */     a(aty.g, ayx.c.a(), "birch_sapling");
/*  532: 561 */     a(aty.g, ayx.f.a(), "dark_oak_sapling");
/*  533: 562 */     a(aty.g, ayx.d.a(), "jungle_sapling");
/*  534: 563 */     a(aty.g, ayx.a.a(), "oak_sapling");
/*  535: 564 */     a(aty.g, ayx.b.a(), "spruce_sapling");
/*  536: 565 */     a(aty.v, 0, "sponge");
/*  537: 566 */     a(aty.v, 1, "sponge_wet");
/*  538: 567 */     a(aty.cG, akv.p.a(), "black_stained_glass");
/*  539: 568 */     a(aty.cG, akv.l.a(), "blue_stained_glass");
/*  540: 569 */     a(aty.cG, akv.m.a(), "brown_stained_glass");
/*  541: 570 */     a(aty.cG, akv.j.a(), "cyan_stained_glass");
/*  542: 571 */     a(aty.cG, akv.h.a(), "gray_stained_glass");
/*  543: 572 */     a(aty.cG, akv.n.a(), "green_stained_glass");
/*  544: 573 */     a(aty.cG, akv.d.a(), "light_blue_stained_glass");
/*  545: 574 */     a(aty.cG, akv.f.a(), "lime_stained_glass");
/*  546: 575 */     a(aty.cG, akv.c.a(), "magenta_stained_glass");
/*  547: 576 */     a(aty.cG, akv.b.a(), "orange_stained_glass");
/*  548: 577 */     a(aty.cG, akv.g.a(), "pink_stained_glass");
/*  549: 578 */     a(aty.cG, akv.k.a(), "purple_stained_glass");
/*  550: 579 */     a(aty.cG, akv.o.a(), "red_stained_glass");
/*  551: 580 */     a(aty.cG, akv.i.a(), "silver_stained_glass");
/*  552: 581 */     a(aty.cG, akv.a.a(), "white_stained_glass");
/*  553: 582 */     a(aty.cG, akv.e.a(), "yellow_stained_glass");
/*  554: 583 */     a(aty.cH, akv.p.a(), "black_stained_glass_pane");
/*  555: 584 */     a(aty.cH, akv.l.a(), "blue_stained_glass_pane");
/*  556: 585 */     a(aty.cH, akv.m.a(), "brown_stained_glass_pane");
/*  557: 586 */     a(aty.cH, akv.j.a(), "cyan_stained_glass_pane");
/*  558: 587 */     a(aty.cH, akv.h.a(), "gray_stained_glass_pane");
/*  559: 588 */     a(aty.cH, akv.n.a(), "green_stained_glass_pane");
/*  560: 589 */     a(aty.cH, akv.d.a(), "light_blue_stained_glass_pane");
/*  561: 590 */     a(aty.cH, akv.f.a(), "lime_stained_glass_pane");
/*  562: 591 */     a(aty.cH, akv.c.a(), "magenta_stained_glass_pane");
/*  563: 592 */     a(aty.cH, akv.b.a(), "orange_stained_glass_pane");
/*  564: 593 */     a(aty.cH, akv.g.a(), "pink_stained_glass_pane");
/*  565: 594 */     a(aty.cH, akv.k.a(), "purple_stained_glass_pane");
/*  566: 595 */     a(aty.cH, akv.o.a(), "red_stained_glass_pane");
/*  567: 596 */     a(aty.cH, akv.i.a(), "silver_stained_glass_pane");
/*  568: 597 */     a(aty.cH, akv.a.a(), "white_stained_glass_pane");
/*  569: 598 */     a(aty.cH, akv.e.a(), "yellow_stained_glass_pane");
/*  570: 599 */     a(aty.cu, akv.p.a(), "black_stained_hardened_clay");
/*  571: 600 */     a(aty.cu, akv.l.a(), "blue_stained_hardened_clay");
/*  572: 601 */     a(aty.cu, akv.m.a(), "brown_stained_hardened_clay");
/*  573: 602 */     a(aty.cu, akv.j.a(), "cyan_stained_hardened_clay");
/*  574: 603 */     a(aty.cu, akv.h.a(), "gray_stained_hardened_clay");
/*  575: 604 */     a(aty.cu, akv.n.a(), "green_stained_hardened_clay");
/*  576: 605 */     a(aty.cu, akv.d.a(), "light_blue_stained_hardened_clay");
/*  577: 606 */     a(aty.cu, akv.f.a(), "lime_stained_hardened_clay");
/*  578: 607 */     a(aty.cu, akv.c.a(), "magenta_stained_hardened_clay");
/*  579: 608 */     a(aty.cu, akv.b.a(), "orange_stained_hardened_clay");
/*  580: 609 */     a(aty.cu, akv.g.a(), "pink_stained_hardened_clay");
/*  581: 610 */     a(aty.cu, akv.k.a(), "purple_stained_hardened_clay");
/*  582: 611 */     a(aty.cu, akv.o.a(), "red_stained_hardened_clay");
/*  583: 612 */     a(aty.cu, akv.i.a(), "silver_stained_hardened_clay");
/*  584: 613 */     a(aty.cu, akv.a.a(), "white_stained_hardened_clay");
/*  585: 614 */     a(aty.cu, akv.e.a(), "yellow_stained_hardened_clay");
/*  586: 615 */     a(aty.b, bbb.f.a(), "andesite");
/*  587: 616 */     a(aty.b, bbb.g.a(), "andesite_smooth");
/*  588: 617 */     a(aty.b, bbb.d.a(), "diorite");
/*  589: 618 */     a(aty.b, bbb.e.a(), "diorite_smooth");
/*  590: 619 */     a(aty.b, bbb.b.a(), "granite");
/*  591: 620 */     a(aty.b, bbb.c.a(), "granite_smooth");
/*  592: 621 */     a(aty.b, bbb.a.a(), "stone");
/*  593: 622 */     a(aty.bf, bbd.c.a(), "cracked_stonebrick");
/*  594: 623 */     a(aty.bf, bbd.a.a(), "stonebrick");
/*  595: 624 */     a(aty.bf, bbd.d.a(), "chiseled_stonebrick");
/*  596: 625 */     a(aty.bf, bbd.b.a(), "mossy_stonebrick");
/*  597: 626 */     a(aty.U, bbg.e.a(), "brick_slab");
/*  598: 627 */     a(aty.U, bbg.d.a(), "cobblestone_slab");
/*  599: 628 */     a(aty.U, bbg.c.a(), "old_wood_slab");
/*  600: 629 */     a(aty.U, bbg.g.a(), "nether_brick_slab");
/*  601: 630 */     a(aty.U, bbg.h.a(), "quartz_slab");
/*  602: 631 */     a(aty.U, bbg.b.a(), "sandstone_slab");
/*  603: 632 */     a(aty.U, bbg.f.a(), "stone_brick_slab");
/*  604: 633 */     a(aty.U, bbg.a.a(), "stone_slab");
/*  605: 634 */     a(aty.cP, aym.a.a(), "red_sandstone_slab");
/*  606: 635 */     a(aty.H, bbi.a.a(), "dead_bush");
/*  607: 636 */     a(aty.H, bbi.c.a(), "fern");
/*  608: 637 */     a(aty.H, bbi.b.a(), "tall_grass");
/*  609: 638 */     a(aty.bM, ayx.e.a(), "acacia_slab");
/*  610: 639 */     a(aty.bM, ayx.c.a(), "birch_slab");
/*  611: 640 */     a(aty.bM, ayx.f.a(), "dark_oak_slab");
/*  612: 641 */     a(aty.bM, ayx.d.a(), "jungle_slab");
/*  613: 642 */     a(aty.bM, ayx.a.a(), "oak_slab");
/*  614: 643 */     a(aty.bM, ayx.b.a(), "spruce_slab");
/*  615: 644 */     a(aty.L, akv.p.a(), "black_wool");
/*  616: 645 */     a(aty.L, akv.l.a(), "blue_wool");
/*  617: 646 */     a(aty.L, akv.m.a(), "brown_wool");
/*  618: 647 */     a(aty.L, akv.j.a(), "cyan_wool");
/*  619: 648 */     a(aty.L, akv.h.a(), "gray_wool");
/*  620: 649 */     a(aty.L, akv.n.a(), "green_wool");
/*  621: 650 */     a(aty.L, akv.d.a(), "light_blue_wool");
/*  622: 651 */     a(aty.L, akv.f.a(), "lime_wool");
/*  623: 652 */     a(aty.L, akv.c.a(), "magenta_wool");
/*  624: 653 */     a(aty.L, akv.b.a(), "orange_wool");
/*  625: 654 */     a(aty.L, akv.g.a(), "pink_wool");
/*  626: 655 */     a(aty.L, akv.k.a(), "purple_wool");
/*  627: 656 */     a(aty.L, akv.o.a(), "red_wool");
/*  628: 657 */     a(aty.L, akv.i.a(), "silver_wool");
/*  629: 658 */     a(aty.L, akv.a.a(), "white_wool");
/*  630: 659 */     a(aty.L, akv.e.a(), "yellow_wool");
/*  631:     */     
/*  632: 661 */     a(aty.cC, "acacia_stairs");
/*  633: 662 */     a(aty.cs, "activator_rail");
/*  634: 663 */     a(aty.bY, "beacon");
/*  635: 664 */     a(aty.h, "bedrock");
/*  636: 665 */     a(aty.bV, "birch_stairs");
/*  637: 666 */     a(aty.X, "bookshelf");
/*  638: 667 */     a(aty.V, "brick_block");
/*  639: 668 */     a(aty.V, "brick_block");
/*  640: 669 */     a(aty.bu, "brick_stairs");
/*  641: 670 */     a(aty.P, "brown_mushroom");
/*  642: 671 */     a(aty.aK, "cactus");
/*  643: 672 */     a(aty.aL, "clay");
/*  644: 673 */     a(aty.cA, "coal_block");
/*  645: 674 */     a(aty.q, "coal_ore");
/*  646: 675 */     a(aty.e, "cobblestone");
/*  647: 676 */     a(aty.ai, "crafting_table");
/*  648: 677 */     a(aty.cD, "dark_oak_stairs");
/*  649: 678 */     a(aty.cl, "daylight_detector");
/*  650: 679 */     a(aty.I, "dead_bush");
/*  651: 680 */     a(aty.E, "detector_rail");
/*  652: 681 */     a(aty.ah, "diamond_block");
/*  653: 682 */     a(aty.ag, "diamond_ore");
/*  654: 683 */     a(aty.z, "dispenser");
/*  655: 684 */     a(aty.ct, "dropper");
/*  656: 685 */     a(aty.bT, "emerald_block");
/*  657: 686 */     a(aty.bP, "emerald_ore");
/*  658: 687 */     a(aty.bC, "enchanting_table");
/*  659: 688 */     a(aty.bG, "end_portal_frame");
/*  660: 689 */     a(aty.bH, "end_stone");
/*  661: 690 */     a(aty.aO, "oak_fence");
/*  662: 691 */     a(aty.aP, "spruce_fence");
/*  663: 692 */     a(aty.aQ, "birch_fence");
/*  664: 693 */     a(aty.aR, "jungle_fence");
/*  665: 694 */     a(aty.aS, "dark_oak_fence");
/*  666: 695 */     a(aty.aT, "acacia_fence");
/*  667: 696 */     a(aty.bo, "oak_fence_gate");
/*  668: 697 */     a(aty.bp, "spruce_fence_gate");
/*  669: 698 */     a(aty.bq, "birch_fence_gate");
/*  670: 699 */     a(aty.br, "jungle_fence_gate");
/*  671: 700 */     a(aty.bs, "dark_oak_fence_gate");
/*  672: 701 */     a(aty.bt, "acacia_fence_gate");
/*  673: 702 */     a(aty.al, "furnace");
/*  674: 703 */     a(aty.w, "glass");
/*  675: 704 */     a(aty.bj, "glass_pane");
/*  676: 705 */     a(aty.aX, "glowstone");
/*  677: 706 */     a(aty.D, "golden_rail");
/*  678: 707 */     a(aty.R, "gold_block");
/*  679: 708 */     a(aty.o, "gold_ore");
/*  680: 709 */     a(aty.c, "grass");
/*  681: 710 */     a(aty.n, "gravel");
/*  682: 711 */     a(aty.cz, "hardened_clay");
/*  683: 712 */     a(aty.cx, "hay_block");
/*  684: 713 */     a(aty.ci, "heavy_weighted_pressure_plate");
/*  685: 714 */     a(aty.cp, "hopper");
/*  686: 715 */     a(aty.aI, "ice");
/*  687: 716 */     a(aty.bi, "iron_bars");
/*  688: 717 */     a(aty.S, "iron_block");
/*  689: 718 */     a(aty.p, "iron_ore");
/*  690: 719 */     a(aty.cw, "iron_trapdoor");
/*  691: 720 */     a(aty.aN, "jukebox");
/*  692: 721 */     a(aty.bW, "jungle_stairs");
/*  693: 722 */     a(aty.au, "ladder");
/*  694: 723 */     a(aty.y, "lapis_block");
/*  695: 724 */     a(aty.x, "lapis_ore");
/*  696: 725 */     a(aty.ay, "lever");
/*  697: 726 */     a(aty.ch, "light_weighted_pressure_plate");
/*  698: 727 */     a(aty.aZ, "lit_pumpkin");
/*  699: 728 */     a(aty.bk, "melon_block");
/*  700: 729 */     a(aty.Y, "mossy_cobblestone");
/*  701: 730 */     a(aty.bw, "mycelium");
/*  702: 731 */     a(aty.aV, "netherrack");
/*  703: 732 */     a(aty.by, "nether_brick");
/*  704: 733 */     a(aty.bz, "nether_brick_fence");
/*  705: 734 */     a(aty.bA, "nether_brick_stairs");
/*  706: 735 */     a(aty.B, "noteblock");
/*  707: 736 */     a(aty.ad, "oak_stairs");
/*  708: 737 */     a(aty.Z, "obsidian");
/*  709: 738 */     a(aty.cB, "packed_ice");
/*  710: 739 */     a(aty.J, "piston");
/*  711: 740 */     a(aty.aU, "pumpkin");
/*  712: 741 */     a(aty.co, "quartz_ore");
/*  713: 742 */     a(aty.cr, "quartz_stairs");
/*  714: 743 */     a(aty.av, "rail");
/*  715: 744 */     a(aty.cn, "redstone_block");
/*  716: 745 */     a(aty.bJ, "redstone_lamp");
/*  717: 746 */     a(aty.aC, "redstone_ore");
/*  718: 747 */     a(aty.aF, "redstone_torch");
/*  719: 748 */     a(aty.Q, "red_mushroom");
/*  720: 749 */     a(aty.bO, "sandstone_stairs");
/*  721: 750 */     a(aty.cN, "red_sandstone_stairs");
/*  722: 751 */     a(aty.cJ, "sea_lantern");
/*  723: 752 */     a(aty.cE, "slime");
/*  724: 753 */     a(aty.aJ, "snow");
/*  725: 754 */     a(aty.aH, "snow_layer");
/*  726: 755 */     a(aty.aW, "soul_sand");
/*  727: 756 */     a(aty.bU, "spruce_stairs");
/*  728: 757 */     a(aty.F, "sticky_piston");
/*  729: 758 */     a(aty.bv, "stone_brick_stairs");
/*  730: 759 */     a(aty.aG, "stone_button");
/*  731: 760 */     a(aty.az, "stone_pressure_plate");
/*  732: 761 */     a(aty.aw, "stone_stairs");
/*  733: 762 */     a(aty.W, "tnt");
/*  734: 763 */     a(aty.aa, "torch");
/*  735: 764 */     a(aty.bd, "trapdoor");
/*  736: 765 */     a(aty.bR, "tripwire_hook");
/*  737: 766 */     a(aty.bn, "vine");
/*  738: 767 */     a(aty.bx, "waterlily");
/*  739: 768 */     a(aty.G, "web");
/*  740: 769 */     a(aty.cd, "wooden_button");
/*  741: 770 */     a(aty.aB, "wooden_pressure_plate");
/*  742: 771 */     a(aty.N, awa.a.b(), "dandelion");
/*  743:     */     
/*  744: 773 */     a(aty.ae, "chest");
/*  745: 774 */     a(aty.cg, "trapped_chest");
/*  746: 775 */     a(aty.bQ, "ender_chest");
/*  747:     */     
/*  748: 777 */     a(amk.a, "iron_shovel");
/*  749: 778 */     a(amk.b, "iron_pickaxe");
/*  750:     */     
/*  751: 780 */     a(amk.c, "iron_axe");
/*  752: 781 */     a(amk.d, "flint_and_steel");
/*  753: 782 */     a(amk.e, "apple");
/*  754: 783 */     a(amk.f, 0, "bow");
/*  755: 784 */     a(amk.f, 1, "bow_pulling_0");
/*  756: 785 */     a(amk.f, 2, "bow_pulling_1");
/*  757: 786 */     a(amk.f, 3, "bow_pulling_2");
/*  758: 787 */     a(amk.g, "arrow");
/*  759: 788 */     a(amk.h, 0, "coal");
/*  760: 789 */     a(amk.h, 1, "charcoal");
/*  761: 790 */     a(amk.i, "diamond");
/*  762: 791 */     a(amk.j, "iron_ingot");
/*  763:     */     
/*  764: 793 */     a(amk.k, "gold_ingot");
/*  765: 794 */     a(amk.l, "iron_sword");
/*  766: 795 */     a(amk.m, "wooden_sword");
/*  767: 796 */     a(amk.n, "wooden_shovel");
/*  768: 797 */     a(amk.o, "wooden_pickaxe");
/*  769: 798 */     a(amk.p, "wooden_axe");
/*  770: 799 */     a(amk.q, "stone_sword");
/*  771: 800 */     a(amk.r, "stone_shovel");
/*  772: 801 */     a(amk.s, "stone_pickaxe");
/*  773:     */     
/*  774: 803 */     a(amk.t, "stone_axe");
/*  775: 804 */     a(amk.u, "diamond_sword");
/*  776: 805 */     a(amk.v, "diamond_shovel");
/*  777: 806 */     a(amk.w, "diamond_pickaxe");
/*  778: 807 */     a(amk.x, "diamond_axe");
/*  779: 808 */     a(amk.y, "stick");
/*  780: 809 */     a(amk.z, "bowl");
/*  781: 810 */     a(amk.A, "mushroom_stew");
/*  782: 811 */     a(amk.B, "golden_sword");
/*  783: 812 */     a(amk.C, "golden_shovel");
/*  784: 813 */     a(amk.D, "golden_pickaxe");
/*  785: 814 */     a(amk.E, "golden_axe");
/*  786: 815 */     a(amk.F, "string");
/*  787: 816 */     a(amk.G, "feather");
/*  788: 817 */     a(amk.H, "gunpowder");
/*  789: 818 */     a(amk.I, "wooden_hoe");
/*  790: 819 */     a(amk.J, "stone_hoe");
/*  791: 820 */     a(amk.K, "iron_hoe");
/*  792: 821 */     a(amk.L, "diamond_hoe");
/*  793: 822 */     a(amk.M, "golden_hoe");
/*  794: 823 */     a(amk.N, "wheat_seeds");
/*  795: 824 */     a(amk.O, "wheat");
/*  796: 825 */     a(amk.P, "bread");
/*  797:     */     
/*  798: 827 */     a(amk.Q, "leather_helmet");
/*  799: 828 */     a(amk.R, "leather_chestplate");
/*  800: 829 */     a(amk.S, "leather_leggings");
/*  801: 830 */     a(amk.T, "leather_boots");
/*  802:     */     
/*  803: 832 */     a(amk.U, "chainmail_helmet");
/*  804: 833 */     a(amk.V, "chainmail_chestplate");
/*  805: 834 */     a(amk.W, "chainmail_leggings");
/*  806: 835 */     a(amk.X, "chainmail_boots");
/*  807:     */     
/*  808: 837 */     a(amk.Y, "iron_helmet");
/*  809: 838 */     a(amk.Z, "iron_chestplate");
/*  810: 839 */     a(amk.aa, "iron_leggings");
/*  811: 840 */     a(amk.ab, "iron_boots");
/*  812:     */     
/*  813: 842 */     a(amk.ac, "diamond_helmet");
/*  814: 843 */     a(amk.ad, "diamond_chestplate");
/*  815: 844 */     a(amk.ae, "diamond_leggings");
/*  816: 845 */     a(amk.af, "diamond_boots");
/*  817:     */     
/*  818: 847 */     a(amk.ag, "golden_helmet");
/*  819: 848 */     a(amk.ah, "golden_chestplate");
/*  820: 849 */     a(amk.ai, "golden_leggings");
/*  821: 850 */     a(amk.aj, "golden_boots");
/*  822:     */     
/*  823: 852 */     a(amk.ak, "flint");
/*  824: 853 */     a(amk.al, "porkchop");
/*  825: 854 */     a(amk.am, "cooked_porkchop");
/*  826: 855 */     a(amk.an, "painting");
/*  827: 856 */     a(amk.ao, "golden_apple");
/*  828: 857 */     a(amk.ao, 1, "golden_apple");
/*  829: 858 */     a(amk.ap, "sign");
/*  830: 859 */     a(amk.aq, "oak_door");
/*  831: 860 */     a(amk.ar, "spruce_door");
/*  832: 861 */     a(amk.as, "birch_door");
/*  833: 862 */     a(amk.at, "jungle_door");
/*  834: 863 */     a(amk.au, "acacia_door");
/*  835: 864 */     a(amk.av, "dark_oak_door");
/*  836: 865 */     a(amk.aw, "bucket");
/*  837: 866 */     a(amk.ax, "water_bucket");
/*  838: 867 */     a(amk.ay, "lava_bucket");
/*  839:     */     
/*  840: 869 */     a(amk.az, "minecart");
/*  841: 870 */     a(amk.aA, "saddle");
/*  842: 871 */     a(amk.aB, "iron_door");
/*  843: 872 */     a(amk.aC, "redstone");
/*  844: 873 */     a(amk.aD, "snowball");
/*  845: 874 */     a(amk.aE, "boat");
/*  846: 875 */     a(amk.aF, "leather");
/*  847: 876 */     a(amk.aG, "milk_bucket");
/*  848: 877 */     a(amk.aH, "brick");
/*  849:     */     
/*  850: 879 */     a(amk.aI, "clay_ball");
/*  851: 880 */     a(amk.aJ, "reeds");
/*  852: 881 */     a(amk.aK, "paper");
/*  853: 882 */     a(amk.aL, "book");
/*  854: 883 */     a(amk.aM, "slime_ball");
/*  855: 884 */     a(amk.aN, "chest_minecart");
/*  856: 885 */     a(amk.aO, "furnace_minecart");
/*  857: 886 */     a(amk.aP, "egg");
/*  858: 887 */     a(amk.aQ, "compass");
/*  859:     */     
/*  860: 889 */     a(amk.aR, "fishing_rod");
/*  861: 890 */     a(amk.aR, 1, "fishing_rod_cast");
/*  862: 891 */     a(amk.aS, "clock");
/*  863: 892 */     a(amk.aT, "glowstone_dust");
/*  864: 893 */     a(amk.aU, ali.a.a(), "cod");
/*  865: 894 */     a(amk.aU, ali.b.a(), "salmon");
/*  866: 895 */     a(amk.aU, ali.c.a(), "clownfish");
/*  867: 896 */     a(amk.aU, ali.d.a(), "pufferfish");
/*  868: 897 */     a(amk.aV, ali.a.a(), "cooked_cod");
/*  869: 898 */     a(amk.aV, ali.b.a(), "cooked_salmon");
/*  870:     */     
/*  871: 900 */     a(amk.aW, akv.p.b(), "dye_black");
/*  872: 901 */     a(amk.aW, akv.o.b(), "dye_red");
/*  873: 902 */     a(amk.aW, akv.n.b(), "dye_green");
/*  874: 903 */     a(amk.aW, akv.m.b(), "dye_brown");
/*  875: 904 */     a(amk.aW, akv.l.b(), "dye_blue");
/*  876: 905 */     a(amk.aW, akv.k.b(), "dye_purple");
/*  877: 906 */     a(amk.aW, akv.j.b(), "dye_cyan");
/*  878: 907 */     a(amk.aW, akv.i.b(), "dye_silver");
/*  879: 908 */     a(amk.aW, akv.h.b(), "dye_gray");
/*  880: 909 */     a(amk.aW, akv.g.b(), "dye_pink");
/*  881: 910 */     a(amk.aW, akv.f.b(), "dye_lime");
/*  882: 911 */     a(amk.aW, akv.e.b(), "dye_yellow");
/*  883: 912 */     a(amk.aW, akv.d.b(), "dye_light_blue");
/*  884: 913 */     a(amk.aW, akv.c.b(), "dye_magenta");
/*  885: 914 */     a(amk.aW, akv.b.b(), "dye_orange");
/*  886: 915 */     a(amk.aW, akv.a.b(), "dye_white");
/*  887:     */     
/*  888: 917 */     a(amk.aX, "bone");
/*  889: 918 */     a(amk.aY, "sugar");
/*  890:     */     
/*  891: 920 */     a(amk.aZ, "cake");
/*  892: 921 */     a(amk.ba, "bed");
/*  893: 922 */     a(amk.bb, "repeater");
/*  894: 923 */     a(amk.bc, "cookie");
/*  895: 924 */     a(amk.be, "shears");
/*  896: 925 */     a(amk.bf, "melon");
/*  897: 926 */     a(amk.bg, "pumpkin_seeds");
/*  898: 927 */     a(amk.bh, "melon_seeds");
/*  899:     */     
/*  900: 929 */     a(amk.bi, "beef");
/*  901: 930 */     a(amk.bj, "cooked_beef");
/*  902: 931 */     a(amk.bk, "chicken");
/*  903: 932 */     a(amk.bl, "cooked_chicken");
/*  904: 933 */     a(amk.bo, "rabbit");
/*  905: 934 */     a(amk.bp, "cooked_rabbit");
/*  906: 935 */     a(amk.bm, "mutton");
/*  907: 936 */     a(amk.bn, "cooked_mutton");
/*  908: 937 */     a(amk.br, "rabbit_foot");
/*  909: 938 */     a(amk.bs, "rabbit_hide");
/*  910: 939 */     a(amk.bq, "rabbit_stew");
/*  911:     */     
/*  912: 941 */     a(amk.bt, "rotten_flesh");
/*  913: 942 */     a(amk.bu, "ender_pearl");
/*  914: 943 */     a(amk.bv, "blaze_rod");
/*  915: 944 */     a(amk.bw, "ghast_tear");
/*  916: 945 */     a(amk.bx, "gold_nugget");
/*  917: 946 */     a(amk.by, "nether_wart");
/*  918:     */     
/*  919: 948 */     this.m.a(amk.bz, new cqn(this));
/*  920:     */     
/*  921:     */ 
/*  922:     */ 
/*  923:     */ 
/*  924:     */ 
/*  925:     */ 
/*  926:     */ 
/*  927:     */ 
/*  928:     */ 
/*  929:     */ 
/*  930: 959 */     a(amk.bA, "glass_bottle");
/*  931: 960 */     a(amk.bB, "spider_eye");
/*  932: 961 */     a(amk.bC, "fermented_spider_eye");
/*  933: 962 */     a(amk.bD, "blaze_powder");
/*  934: 963 */     a(amk.bE, "magma_cream");
/*  935: 964 */     a(amk.bF, "brewing_stand");
/*  936: 965 */     a(amk.bG, "cauldron");
/*  937: 966 */     a(amk.bH, "ender_eye");
/*  938: 967 */     a(amk.bI, "speckled_melon");
/*  939:     */     
/*  940: 969 */     this.m.a(amk.bJ, new cqo(this));
/*  941:     */     
/*  942:     */ 
/*  943:     */ 
/*  944:     */ 
/*  945:     */ 
/*  946:     */ 
/*  947: 976 */     a(amk.bK, "experience_bottle");
/*  948: 977 */     a(amk.bL, "fire_charge");
/*  949: 978 */     a(amk.bM, "writable_book");
/*  950: 979 */     a(amk.bO, "emerald");
/*  951: 980 */     a(amk.bP, "item_frame");
/*  952: 981 */     a(amk.bQ, "flower_pot");
/*  953: 982 */     a(amk.bR, "carrot");
/*  954: 983 */     a(amk.bS, "potato");
/*  955:     */     
/*  956: 985 */     a(amk.bT, "baked_potato");
/*  957: 986 */     a(amk.bU, "poisonous_potato");
/*  958: 987 */     a(amk.bV, "map");
/*  959: 988 */     a(amk.bW, "golden_carrot");
/*  960: 989 */     a(amk.bX, 0, "skull_skeleton");
/*  961: 990 */     a(amk.bX, 1, "skull_wither");
/*  962: 991 */     a(amk.bX, 2, "skull_zombie");
/*  963: 992 */     a(amk.bX, 3, "skull_char");
/*  964: 993 */     a(amk.bX, 4, "skull_creeper");
/*  965:     */     
/*  966: 995 */     a(amk.bY, "carrot_on_a_stick");
/*  967: 996 */     a(amk.bZ, "nether_star");
/*  968: 997 */     a(amk.ca, "pumpkin_pie");
/*  969: 998 */     a(amk.cc, "firework_charge");
/*  970: 999 */     a(amk.ce, "comparator");
/*  971:1000 */     a(amk.cf, "netherbrick");
/*  972:1001 */     a(amk.cg, "quartz");
/*  973:1002 */     a(amk.ch, "tnt_minecart");
/*  974:1003 */     a(amk.ci, "hopper_minecart");
/*  975:     */     
/*  976:1005 */     a(amk.cj, "armor_stand");
/*  977:1006 */     a(amk.ck, "iron_horse_armor");
/*  978:1007 */     a(amk.cl, "golden_horse_armor");
/*  979:1008 */     a(amk.cm, "diamond_horse_armor");
/*  980:1009 */     a(amk.cn, "lead");
/*  981:1010 */     a(amk.co, "name_tag");
/*  982:     */     
/*  983:1012 */     this.m.a(amk.cE, new cqp(this));
/*  984:     */     
/*  985:     */ 
/*  986:     */ 
/*  987:     */ 
/*  988:     */ 
/*  989:     */ 
/*  990:1019 */     a(amk.cq, "record_13");
/*  991:1020 */     a(amk.cr, "record_cat");
/*  992:1021 */     a(amk.cs, "record_blocks");
/*  993:1022 */     a(amk.ct, "record_chirp");
/*  994:1023 */     a(amk.cu, "record_far");
/*  995:1024 */     a(amk.cv, "record_mall");
/*  996:1025 */     a(amk.cw, "record_mellohi");
/*  997:1026 */     a(amk.cx, "record_stal");
/*  998:1027 */     a(amk.cy, "record_strad");
/*  999:1028 */     a(amk.cz, "record_ward");
/* 1000:1029 */     a(amk.cA, "record_11");
/* 1001:1030 */     a(amk.cB, "record_wait");
/* 1002:     */     
/* 1003:1032 */     a(amk.cC, "prismarine_shard");
/* 1004:1033 */     a(amk.cD, "prismarine_crystals");
/* 1005:     */     
/* 1006:1035 */     this.m.a(amk.cd, new cqq(this));
/* 1007:     */     
/* 1008:     */ 
/* 1009:     */ 
/* 1010:     */ 
/* 1011:     */ 
/* 1012:     */ 
/* 1013:1042 */     this.m.a(amk.bd, new cqr(this));
/* 1014:     */     
/* 1015:     */ 
/* 1016:     */ 
/* 1017:     */ 
/* 1018:     */ 
/* 1019:1048 */     a(aty.bX, "command_block");
/* 1020:1049 */     a(amk.cb, "fireworks");
/* 1021:1050 */     a(amk.cp, "command_block_minecart");
/* 1022:1051 */     a(aty.cv, "barrier");
/* 1023:1052 */     a(aty.ac, "mob_spawner");
/* 1024:1053 */     a(amk.bN, "written_book");
/* 1025:     */     
/* 1026:1055 */     a(aty.bg, axa.k.a(), "brown_mushroom_block");
/* 1027:1056 */     a(aty.bh, axa.k.a(), "red_mushroom_block");
/* 1028:     */     
/* 1029:1058 */     a(aty.bI, "dragon_egg");
/* 1030:     */   }
/* 1031:     */   
/* 1032:     */   public void a(cvk paramcvk)
/* 1033:     */   {
/* 1034:1063 */     this.m.b();
/* 1035:     */   }
/* 1036:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cqh
 * JD-Core Version:    0.7.0.1
 */