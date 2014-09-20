/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;
/*   4:    */ import com.google.common.util.concurrent.ListenableFuture;
/*   5:    */ import java.util.ArrayList;
/*   6:    */ import java.util.Iterator;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ import java.util.Random;
/*  10:    */ import java.util.Set;
/*  11:    */ import java.util.TreeSet;
/*  12:    */ import java.util.UUID;
/*  13:    */ import net.minecraft.server.MinecraftServer;
/*  14:    */ import org.apache.logging.log4j.LogManager;
/*  15:    */ import org.apache.logging.log4j.Logger;
/*  16:    */ 
/*  17:    */ public class qt
/*  18:    */   extends aqu
/*  19:    */   implements vn
/*  20:    */ {
/*  21: 64 */   private static final Logger a = ;
/*  22:    */   private final MinecraftServer I;
/*  23:    */   private final qn J;
/*  24:    */   private final qq K;
/*  25: 70 */   private final Set L = Sets.newHashSet();
/*  26: 71 */   private final TreeSet M = new TreeSet();
/*  27: 72 */   private final Map N = Maps.newHashMap();
/*  28:    */   public qs b;
/*  29:    */   public boolean c;
/*  30:    */   private boolean O;
/*  31:    */   private int P;
/*  32:    */   private final arh Q;
/*  33: 78 */   private final arg R = new arg();
/*  34: 80 */   protected final abk d = new abk(this);
/*  35: 87 */   private qv[] S = { new qv(null), new qv(null) };
/*  36:    */   private int T;
/*  37: 92 */   private static final List U = Lists.newArrayList(new vl[] { new vl(amk.y, 0, 1, 3, 10), new vl(alq.a(aty.f), 0, 1, 3, 10), new vl(alq.a(aty.r), 0, 1, 3, 10), new vl(amk.t, 0, 1, 1, 3), new vl(amk.p, 0, 1, 1, 5), new vl(amk.s, 0, 1, 1, 3), new vl(amk.o, 0, 1, 1, 5), new vl(amk.e, 0, 2, 3, 5), new vl(amk.P, 0, 2, 3, 3), new vl(alq.a(aty.s), 0, 1, 3, 10) });
/*  38:    */   
/*  39:    */   public qt(MinecraftServer paramMinecraftServer, bqy parambqy, bqo parambqo, int paramInt, uw paramuw)
/*  40:    */   {
/*  41:106 */     super(parambqy, parambqo, bgd.a(paramInt), paramuw, false);
/*  42:107 */     this.I = paramMinecraftServer;
/*  43:108 */     this.J = new qn(this);
/*  44:109 */     this.K = new qq(this);
/*  45:    */     
/*  46:111 */     this.t.a(this);
/*  47:112 */     this.v = k();
/*  48:    */     
/*  49:114 */     this.Q = new arh(this);
/*  50:    */     
/*  51:116 */     B();
/*  52:117 */     C();
/*  53:    */     
/*  54:119 */     af().a(paramMinecraftServer.aG());
/*  55:    */   }
/*  56:    */   
/*  57:    */   public aqu b()
/*  58:    */   {
/*  59:124 */     this.z = new brn(this.w);
/*  60:    */     
/*  61:126 */     String str = abl.a(this.t);
/*  62:127 */     abl localabl = (abl)this.z.a(abl.class, str);
/*  63:128 */     if (localabl == null)
/*  64:    */     {
/*  65:129 */       this.A = new abl(this);
/*  66:130 */       this.z.a(str, this.A);
/*  67:    */     }
/*  68:    */     else
/*  69:    */     {
/*  70:132 */       this.A = localabl;
/*  71:133 */       this.A.a(this);
/*  72:    */     }
/*  73:136 */     this.C = new pk(this.I);
/*  74:    */     
/*  75:138 */     bse localbse = (bse)this.z.a(bse.class, "scoreboard");
/*  76:139 */     if (localbse == null)
/*  77:    */     {
/*  78:140 */       localbse = new bse();
/*  79:141 */       this.z.a("scoreboard", localbse);
/*  80:    */     }
/*  81:143 */     localbse.a(this.C);
/*  82:144 */     ((pk)this.C).a(localbse);
/*  83:    */     
/*  84:146 */     af().c(this.x.C(), this.x.D());
/*  85:147 */     af().c(this.x.I());
/*  86:148 */     af().b(this.x.H());
/*  87:149 */     af().c(this.x.J());
/*  88:150 */     af().b(this.x.K());
/*  89:152 */     if (this.x.F() > 0L) {
/*  90:153 */       af().a(this.x.E(), this.x.G(), this.x.F());
/*  91:    */     } else {
/*  92:155 */       af().a(this.x.E());
/*  93:    */     }
/*  94:158 */     return this;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void c()
/*  98:    */   {
/*  99:163 */     super.c();
/* 100:164 */     if ((P().t()) && (aa() != vt.d)) {
/* 101:165 */       P().a(vt.d);
/* 102:    */     }
/* 103:167 */     this.t.m().b();
/* 104:169 */     if (f())
/* 105:    */     {
/* 106:170 */       if (Q().b("doDaylightCycle"))
/* 107:    */       {
/* 108:172 */         long l = this.x.g() + 24000L;
/* 109:173 */         this.x.c(l - l % 24000L);
/* 110:    */       }
/* 111:176 */       e();
/* 112:    */     }
/* 113:179 */     this.B.a("mobSpawner");
/* 114:180 */     if ((Q().b("doMobSpawning")) && (this.x.u() != are.g)) {
/* 115:182 */       this.R.a(this, this.F, this.G, this.x.f() % 400L == 0L);
/* 116:    */     }
/* 117:184 */     this.B.c("chunkSource");
/* 118:185 */     this.v.d();
/* 119:186 */     int i = a(1.0F);
/* 120:188 */     if (i != ab()) {
/* 121:189 */       b(i);
/* 122:    */     }
/* 123:193 */     this.x.b(this.x.f() + 1L);
/* 124:194 */     if (Q().b("doDaylightCycle")) {
/* 125:195 */       this.x.c(this.x.g() + 1L);
/* 126:    */     }
/* 127:198 */     this.B.c("tickPending");
/* 128:199 */     a(false);
/* 129:    */     
/* 130:201 */     this.B.c("tickBlocks");
/* 131:202 */     h();
/* 132:    */     
/* 133:204 */     this.B.c("chunkMap");
/* 134:205 */     this.K.b();
/* 135:    */     
/* 136:207 */     this.B.c("village");
/* 137:208 */     this.A.a();
/* 138:209 */     this.d.a();
/* 139:    */     
/* 140:211 */     this.B.c("portalForcer");
/* 141:212 */     this.Q.a(K());
/* 142:    */     
/* 143:214 */     this.B.b();
/* 144:    */     
/* 145:    */ 
/* 146:217 */     ak();
/* 147:    */   }
/* 148:    */   
/* 149:    */   public arq a(xp paramxp, dt paramdt)
/* 150:    */   {
/* 151:222 */     List localList = N().a(paramxp, paramdt);
/* 152:223 */     if ((localList == null) || (localList.isEmpty())) {
/* 153:224 */       return null;
/* 154:    */     }
/* 155:227 */     return (arq)vj.a(this.s, localList);
/* 156:    */   }
/* 157:    */   
/* 158:    */   public boolean a(xp paramxp, arq paramarq, dt paramdt)
/* 159:    */   {
/* 160:231 */     List localList = N().a(paramxp, paramdt);
/* 161:232 */     if ((localList == null) || (localList.isEmpty())) {
/* 162:233 */       return false;
/* 163:    */     }
/* 164:235 */     return localList.contains(paramarq);
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void d()
/* 168:    */   {
/* 169:240 */     this.O = false;
/* 170:242 */     if (!this.j.isEmpty())
/* 171:    */     {
/* 172:243 */       int i = 0;
/* 173:244 */       int j = 0;
/* 174:246 */       for (ahd localahd : this.j) {
/* 175:247 */         if (localahd.v()) {
/* 176:248 */           i++;
/* 177:249 */         } else if (localahd.bI()) {
/* 178:250 */           j++;
/* 179:    */         }
/* 180:    */       }
/* 181:254 */       this.O = ((j > 0) && (j >= this.j.size() - i));
/* 182:    */     }
/* 183:    */   }
/* 184:    */   
/* 185:    */   protected void e()
/* 186:    */   {
/* 187:259 */     this.O = false;
/* 188:261 */     for (ahd localahd : this.j) {
/* 189:262 */       if (localahd.bI()) {
/* 190:263 */         localahd.a(false, false, true);
/* 191:    */       }
/* 192:    */     }
/* 193:267 */     ag();
/* 194:    */   }
/* 195:    */   
/* 196:    */   private void ag()
/* 197:    */   {
/* 198:271 */     this.x.g(0);
/* 199:272 */     this.x.b(false);
/* 200:273 */     this.x.f(0);
/* 201:274 */     this.x.a(false);
/* 202:    */   }
/* 203:    */   
/* 204:    */   public boolean f()
/* 205:    */   {
/* 206:278 */     if ((this.O) && (!this.D))
/* 207:    */     {
/* 208:280 */       for (ahd localahd : this.j) {
/* 209:281 */         if ((localahd.v()) || (!localahd.ce())) {
/* 210:282 */           return false;
/* 211:    */         }
/* 212:    */       }
/* 213:285 */       return true;
/* 214:    */     }
/* 215:287 */     return false;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public void g()
/* 219:    */   {
/* 220:292 */     if (this.x.d() <= 0) {
/* 221:293 */       this.x.b(64);
/* 222:    */     }
/* 223:295 */     int i = this.x.c();
/* 224:296 */     int j = this.x.e();
/* 225:297 */     int k = 0;
/* 226:298 */     while (c(new dt(i, 0, j)).r() == bof.a)
/* 227:    */     {
/* 228:299 */       i += this.s.nextInt(8) - this.s.nextInt(8);
/* 229:300 */       j += this.s.nextInt(8) - this.s.nextInt(8);
/* 230:301 */       k++;
/* 231:301 */       if (k == 10000) {
/* 232:    */         break;
/* 233:    */       }
/* 234:    */     }
/* 235:305 */     this.x.a(i);
/* 236:306 */     this.x.c(j);
/* 237:    */   }
/* 238:    */   
/* 239:    */   protected void h()
/* 240:    */   {
/* 241:311 */     super.h();
/* 242:313 */     if (this.x.u() == are.g)
/* 243:    */     {
/* 244:314 */       for (aqm localaqm1 : this.E) {
/* 245:315 */         a(localaqm1.a, localaqm1.b).b(false);
/* 246:    */       }
/* 247:317 */       return;
/* 248:    */     }
/* 249:320 */     int i = 0;
/* 250:321 */     int j = 0;
/* 251:322 */     for (aqm localaqm2 : this.E)
/* 252:    */     {
/* 253:323 */       int k = localaqm2.a * 16;
/* 254:324 */       int m = localaqm2.b * 16;
/* 255:    */       
/* 256:326 */       this.B.a("getChunk");
/* 257:327 */       bfh localbfh = a(localaqm2.a, localaqm2.b);
/* 258:    */       
/* 259:329 */       a(k, m, localbfh);
/* 260:    */       
/* 261:331 */       this.B.c("tickChunk");
/* 262:332 */       localbfh.b(false);
/* 263:    */       
/* 264:334 */       this.B.c("thunder");
/* 265:    */       Object localObject1;
/* 266:335 */       if ((this.s.nextInt(100000) == 0) && (S()) && (R()))
/* 267:    */       {
/* 268:336 */         this.m = (this.m * 3 + 1013904223);
/* 269:337 */         n = this.m >> 2;
/* 270:    */         
/* 271:339 */         localObject1 = a(new dt(k + (n & 0xF), 0, m + (n >> 8 & 0xF)));
/* 272:340 */         if (C((dt)localObject1)) {
/* 273:341 */           c(new ads(this, ((dt)localObject1).n(), ((dt)localObject1).o(), ((dt)localObject1).p()));
/* 274:    */         }
/* 275:    */       }
/* 276:345 */       this.B.c("iceandsnow");
/* 277:346 */       if (this.s.nextInt(16) == 0)
/* 278:    */       {
/* 279:347 */         this.m = (this.m * 3 + 1013904223);
/* 280:348 */         n = this.m >> 2;
/* 281:    */         
/* 282:350 */         localObject1 = q(new dt(k + (n & 0xF), 0, m + (n >> 8 & 0xF)));
/* 283:351 */         dt localdt1 = ((dt)localObject1).b();
/* 284:352 */         if (w(localdt1)) {
/* 285:353 */           a(localdt1, aty.aI.P());
/* 286:    */         }
/* 287:356 */         if ((S()) && (f((dt)localObject1, true))) {
/* 288:357 */           a((dt)localObject1, aty.aH.P());
/* 289:    */         }
/* 290:359 */         if ((S()) && 
/* 291:360 */           (b(localdt1).e())) {
/* 292:361 */           p(localdt1).c().k(this, localdt1);
/* 293:    */         }
/* 294:    */       }
/* 295:366 */       this.B.c("tickBlocks");
/* 296:367 */       int n = Q().c("randomTickSpeed");
/* 297:368 */       if (n > 0) {
/* 298:369 */         for (Object localObject2 : localbfh.h()) {
/* 299:370 */           if ((localObject2 != null) && (localObject2.b())) {
/* 300:371 */             for (int i3 = 0; i3 < n; i3++)
/* 301:    */             {
/* 302:372 */               this.m = (this.m * 3 + 1013904223);
/* 303:373 */               int i4 = this.m >> 2;
/* 304:374 */               int i5 = i4 & 0xF;
/* 305:375 */               int i6 = i4 >> 8 & 0xF;
/* 306:376 */               int i7 = i4 >> 16 & 0xF;
/* 307:    */               
/* 308:378 */               j++;
/* 309:379 */               dt localdt2 = new dt(i5 + k, i7 + localObject2.d(), i6 + m);
/* 310:380 */               bec localbec = localObject2.a(i5, i7, i6);
/* 311:381 */               atr localatr = localbec.c();
/* 312:382 */               if (localatr.w())
/* 313:    */               {
/* 314:383 */                 i++;
/* 315:384 */                 localatr.a(this, localdt2, localbec, this.s);
/* 316:    */               }
/* 317:    */             }
/* 318:    */           }
/* 319:    */         }
/* 320:    */       }
/* 321:390 */       this.B.b();
/* 322:    */     }
/* 323:    */   }
/* 324:    */   
/* 325:    */   protected dt a(dt paramdt)
/* 326:    */   {
/* 327:395 */     dt localdt = q(paramdt);
/* 328:396 */     brt localbrt = new brt(localdt, new dt(localdt.n(), U(), localdt.p())).b(3.0D, 3.0D, 3.0D);
/* 329:    */     
/* 330:398 */     List localList = a(xm.class, localbrt, new qu(this));
/* 331:405 */     if (!localList.isEmpty()) {
/* 332:406 */       return ((xm)localList.get(this.s.nextInt(localList.size()))).c();
/* 333:    */     }
/* 334:409 */     return localdt;
/* 335:    */   }
/* 336:    */   
/* 337:    */   public boolean a(dt paramdt, atr paramatr)
/* 338:    */   {
/* 339:414 */     ark localark = new ark(paramdt, paramatr);
/* 340:415 */     return this.V.contains(localark);
/* 341:    */   }
/* 342:    */   
/* 343:    */   public void a(dt paramdt, atr paramatr, int paramInt)
/* 344:    */   {
/* 345:420 */     a(paramdt, paramatr, paramInt, 0);
/* 346:    */   }
/* 347:    */   
/* 348:    */   public void a(dt paramdt, atr paramatr, int paramInt1, int paramInt2)
/* 349:    */   {
/* 350:425 */     ark localark = new ark(paramdt, paramatr);
/* 351:426 */     int i = 0;
/* 352:427 */     if ((this.e) && (paramatr.r() != bof.a))
/* 353:    */     {
/* 354:428 */       if (paramatr.M())
/* 355:    */       {
/* 356:429 */         i = 8;
/* 357:430 */         if (a(localark.a.a(-i, -i, -i), localark.a.a(i, i, i)))
/* 358:    */         {
/* 359:431 */           bec localbec = p(localark.a);
/* 360:433 */           if ((localbec.c().r() != bof.a) && (localbec.c() == localark.a())) {
/* 361:434 */             localbec.c().b(this, localark.a, localbec, this.s);
/* 362:    */           }
/* 363:    */         }
/* 364:437 */         return;
/* 365:    */       }
/* 366:439 */       paramInt1 = 1;
/* 367:    */     }
/* 368:443 */     if (a(paramdt.a(-i, -i, -i), paramdt.a(i, i, i)))
/* 369:    */     {
/* 370:444 */       if (paramatr.r() != bof.a)
/* 371:    */       {
/* 372:445 */         localark.a(paramInt1 + this.x.f());
/* 373:446 */         localark.a(paramInt2);
/* 374:    */       }
/* 375:448 */       if (!this.L.contains(localark))
/* 376:    */       {
/* 377:449 */         this.L.add(localark);
/* 378:450 */         this.M.add(localark);
/* 379:    */       }
/* 380:    */     }
/* 381:    */   }
/* 382:    */   
/* 383:    */   public void b(dt paramdt, atr paramatr, int paramInt1, int paramInt2)
/* 384:    */   {
/* 385:457 */     ark localark = new ark(paramdt, paramatr);
/* 386:458 */     localark.a(paramInt2);
/* 387:460 */     if (paramatr.r() != bof.a) {
/* 388:461 */       localark.a(paramInt1 + this.x.f());
/* 389:    */     }
/* 390:463 */     if (!this.L.contains(localark))
/* 391:    */     {
/* 392:464 */       this.L.add(localark);
/* 393:465 */       this.M.add(localark);
/* 394:    */     }
/* 395:    */   }
/* 396:    */   
/* 397:    */   public void i()
/* 398:    */   {
/* 399:471 */     if (this.j.isEmpty())
/* 400:    */     {
/* 401:472 */       if (this.P++ < 1200) {}
/* 402:    */     }
/* 403:    */     else {
/* 404:476 */       j();
/* 405:    */     }
/* 406:479 */     super.i();
/* 407:    */   }
/* 408:    */   
/* 409:    */   public void j()
/* 410:    */   {
/* 411:483 */     this.P = 0;
/* 412:    */   }
/* 413:    */   
/* 414:486 */   private List V = Lists.newArrayList();
/* 415:    */   
/* 416:    */   public boolean a(boolean paramBoolean)
/* 417:    */   {
/* 418:490 */     if (this.x.u() == are.g) {
/* 419:491 */       return false;
/* 420:    */     }
/* 421:494 */     int i = this.M.size();
/* 422:495 */     if (i != this.L.size()) {
/* 423:496 */       throw new IllegalStateException("TickNextTick list out of synch");
/* 424:    */     }
/* 425:498 */     if (i > 1000) {
/* 426:499 */       i = 1000;
/* 427:    */     }
/* 428:502 */     this.B.a("cleaning");
/* 429:    */     ark localark;
/* 430:503 */     for (int j = 0; j < i; j++)
/* 431:    */     {
/* 432:504 */       localark = (ark)this.M.first();
/* 433:505 */       if ((!paramBoolean) && (localark.b > this.x.f())) {
/* 434:    */         break;
/* 435:    */       }
/* 436:509 */       this.M.remove(localark);
/* 437:510 */       this.L.remove(localark);
/* 438:511 */       this.V.add(localark);
/* 439:    */     }
/* 440:513 */     this.B.b();
/* 441:    */     
/* 442:515 */     this.B.a("ticking");
/* 443:516 */     Iterator localIterator = this.V.iterator();
/* 444:517 */     while (localIterator.hasNext())
/* 445:    */     {
/* 446:518 */       localark = (ark)localIterator.next();
/* 447:519 */       localIterator.remove();
/* 448:    */       
/* 449:521 */       int k = 0;
/* 450:523 */       if (a(localark.a.a(-k, -k, -k), localark.a.a(k, k, k)))
/* 451:    */       {
/* 452:524 */         bec localbec = p(localark.a);
/* 453:525 */         if ((localbec.c().r() != bof.a) && (atr.a(localbec.c(), localark.a()))) {
/* 454:    */           try
/* 455:    */           {
/* 456:527 */             localbec.c().b(this, localark.a, localbec, this.s);
/* 457:    */           }
/* 458:    */           catch (Throwable localThrowable)
/* 459:    */           {
/* 460:529 */             b localb = b.a(localThrowable, "Exception while ticking a block");
/* 461:530 */             j localj = localb.a("Block being ticked");
/* 462:531 */             j.a(localj, localark.a, localbec);
/* 463:532 */             throw new u(localb);
/* 464:    */           }
/* 465:    */         }
/* 466:    */       }
/* 467:    */       else
/* 468:    */       {
/* 469:536 */         a(localark.a, localark.a(), 0);
/* 470:    */       }
/* 471:    */     }
/* 472:539 */     this.B.b();
/* 473:    */     
/* 474:541 */     this.V.clear();
/* 475:    */     
/* 476:543 */     return !this.M.isEmpty();
/* 477:    */   }
/* 478:    */   
/* 479:    */   public List a(bfh parambfh, boolean paramBoolean)
/* 480:    */   {
/* 481:549 */     aqm localaqm = parambfh.j();
/* 482:550 */     int i = (localaqm.a << 4) - 2;
/* 483:551 */     int j = i + 16 + 2;
/* 484:552 */     int k = (localaqm.b << 4) - 2;
/* 485:553 */     int m = k + 16 + 2;
/* 486:    */     
/* 487:555 */     return a(new bjb(i, 0, k, j, 256, m), paramBoolean);
/* 488:    */   }
/* 489:    */   
/* 490:    */   public List a(bjb parambjb, boolean paramBoolean)
/* 491:    */   {
/* 492:561 */     ArrayList localArrayList = null;
/* 493:563 */     for (int i = 0; i < 2; i++)
/* 494:    */     {
/* 495:    */       Iterator localIterator;
/* 496:565 */       if (i == 0)
/* 497:    */       {
/* 498:566 */         localIterator = this.M.iterator();
/* 499:    */       }
/* 500:    */       else
/* 501:    */       {
/* 502:568 */         localIterator = this.V.iterator();
/* 503:569 */         if (!this.V.isEmpty()) {
/* 504:570 */           a.debug("toBeTicked = " + this.V.size());
/* 505:    */         }
/* 506:    */       }
/* 507:574 */       while (localIterator.hasNext())
/* 508:    */       {
/* 509:575 */         ark localark = (ark)localIterator.next();
/* 510:576 */         dt localdt = localark.a;
/* 511:577 */         if ((localdt.n() >= parambjb.a) && (localdt.n() < parambjb.d) && (localdt.p() >= parambjb.c) && (localdt.p() < parambjb.f))
/* 512:    */         {
/* 513:578 */           if (paramBoolean)
/* 514:    */           {
/* 515:579 */             this.L.remove(localark);
/* 516:580 */             localIterator.remove();
/* 517:    */           }
/* 518:582 */           if (localArrayList == null) {
/* 519:583 */             localArrayList = Lists.newArrayList();
/* 520:    */           }
/* 521:585 */           localArrayList.add(localark);
/* 522:    */         }
/* 523:    */       }
/* 524:    */     }
/* 525:590 */     return localArrayList;
/* 526:    */   }
/* 527:    */   
/* 528:    */   public void a(wv paramwv, boolean paramBoolean)
/* 529:    */   {
/* 530:595 */     if ((!ai()) && (((paramwv instanceof abq)) || ((paramwv instanceof act)))) {
/* 531:596 */       paramwv.J();
/* 532:    */     }
/* 533:598 */     if ((!ah()) && ((paramwv instanceof ago))) {
/* 534:599 */       paramwv.J();
/* 535:    */     }
/* 536:601 */     super.a(paramwv, paramBoolean);
/* 537:    */   }
/* 538:    */   
/* 539:    */   private boolean ah()
/* 540:    */   {
/* 541:605 */     return this.I.ag();
/* 542:    */   }
/* 543:    */   
/* 544:    */   private boolean ai()
/* 545:    */   {
/* 546:609 */     return this.I.af();
/* 547:    */   }
/* 548:    */   
/* 549:    */   protected bfe k()
/* 550:    */   {
/* 551:627 */     bfq localbfq = this.w.a(this.t);
/* 552:628 */     this.b = new qs(this, localbfq, this.t.c());
/* 553:629 */     return this.b;
/* 554:    */   }
/* 555:    */   
/* 556:    */   public List a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 557:    */   {
/* 558:633 */     ArrayList localArrayList = Lists.newArrayList();
/* 559:634 */     for (int i = 0; i < this.h.size(); i++)
/* 560:    */     {
/* 561:635 */       bcm localbcm = (bcm)this.h.get(i);
/* 562:636 */       dt localdt = localbcm.v();
/* 563:638 */       if ((localdt.n() >= paramInt1) && (localdt.o() >= paramInt2) && (localdt.p() >= paramInt3) && (localdt.n() < paramInt4) && (localdt.o() < paramInt5) && (localdt.p() < paramInt6)) {
/* 564:639 */         localArrayList.add(localbcm);
/* 565:    */       }
/* 566:    */     }
/* 567:643 */     return localArrayList;
/* 568:    */   }
/* 569:    */   
/* 570:    */   public boolean a(ahd paramahd, dt paramdt)
/* 571:    */   {
/* 572:648 */     return (!this.I.a(this, paramdt, paramahd)) && (af().a(paramdt));
/* 573:    */   }
/* 574:    */   
/* 575:    */   public void a(arb paramarb)
/* 576:    */   {
/* 577:653 */     if (!this.x.w())
/* 578:    */     {
/* 579:    */       try
/* 580:    */       {
/* 581:655 */         b(paramarb);
/* 582:656 */         if (this.x.u() == are.g) {
/* 583:657 */           aj();
/* 584:    */         }
/* 585:659 */         super.a(paramarb);
/* 586:    */       }
/* 587:    */       catch (Throwable localThrowable1)
/* 588:    */       {
/* 589:661 */         b localb = b.a(localThrowable1, "Exception initializing level");
/* 590:    */         try
/* 591:    */         {
/* 592:664 */           a(localb);
/* 593:    */         }
/* 594:    */         catch (Throwable localThrowable2) {}
/* 595:668 */         throw new u(localb);
/* 596:    */       }
/* 597:670 */       this.x.d(true);
/* 598:    */     }
/* 599:    */   }
/* 600:    */   
/* 601:    */   private void aj()
/* 602:    */   {
/* 603:675 */     this.x.f(false);
/* 604:676 */     this.x.c(true);
/* 605:677 */     this.x.b(false);
/* 606:678 */     this.x.a(false);
/* 607:679 */     this.x.i(1000000000);
/* 608:680 */     this.x.c(6000L);
/* 609:681 */     this.x.a(arc.e);
/* 610:682 */     this.x.g(false);
/* 611:683 */     this.x.a(vt.a);
/* 612:684 */     this.x.e(true);
/* 613:685 */     Q().a("doDaylightCycle", "false");
/* 614:    */   }
/* 615:    */   
/* 616:    */   private void b(arb paramarb)
/* 617:    */   {
/* 618:689 */     if (!this.t.e())
/* 619:    */     {
/* 620:690 */       this.x.a(dt.a.b(this.t.i()));
/* 621:691 */       return;
/* 622:    */     }
/* 623:694 */     if (this.x.u() == are.g)
/* 624:    */     {
/* 625:695 */       this.x.a(dt.a.a());
/* 626:696 */       return;
/* 627:    */     }
/* 628:699 */     this.y = true;
/* 629:    */     
/* 630:701 */     arz localarz = this.t.m();
/* 631:702 */     List localList = localarz.a();
/* 632:703 */     Random localRandom = new Random(J());
/* 633:    */     
/* 634:705 */     dt localdt = localarz.a(0, 0, 256, localList, localRandom);
/* 635:    */     
/* 636:707 */     int i = 0;
/* 637:708 */     int j = this.t.i();
/* 638:709 */     int k = 0;
/* 639:711 */     if (localdt != null)
/* 640:    */     {
/* 641:712 */       i = localdt.n();
/* 642:713 */       k = localdt.p();
/* 643:    */     }
/* 644:    */     else
/* 645:    */     {
/* 646:715 */       a.warn("Unable to find spawn biome");
/* 647:    */     }
/* 648:718 */     int m = 0;
/* 649:719 */     while (!this.t.a(i, k))
/* 650:    */     {
/* 651:720 */       i += localRandom.nextInt(64) - localRandom.nextInt(64);
/* 652:721 */       k += localRandom.nextInt(64) - localRandom.nextInt(64);
/* 653:722 */       m++;
/* 654:722 */       if (m == 1000) {
/* 655:    */         break;
/* 656:    */       }
/* 657:    */     }
/* 658:726 */     this.x.a(new dt(i, j, k));
/* 659:727 */     this.y = false;
/* 660:729 */     if (paramarb.c()) {
/* 661:730 */       l();
/* 662:    */     }
/* 663:    */   }
/* 664:    */   
/* 665:    */   protected void l()
/* 666:    */   {
/* 667:737 */     bhh localbhh = new bhh(U, 10);
/* 668:738 */     for (int i = 0; i < 10; i++)
/* 669:    */     {
/* 670:739 */       int j = this.x.c() + this.s.nextInt(6) - this.s.nextInt(6);
/* 671:740 */       int k = this.x.e() + this.s.nextInt(6) - this.s.nextInt(6);
/* 672:    */       
/* 673:742 */       dt localdt = r(new dt(j, 0, k)).a();
/* 674:744 */       if (localbhh.b(this, this.s, localdt)) {
/* 675:    */         break;
/* 676:    */       }
/* 677:    */     }
/* 678:    */   }
/* 679:    */   
/* 680:    */   public dt m()
/* 681:    */   {
/* 682:751 */     return this.t.h();
/* 683:    */   }
/* 684:    */   
/* 685:    */   public void a(boolean paramBoolean, uy paramuy)
/* 686:    */   {
/* 687:755 */     if (!this.v.e()) {
/* 688:756 */       return;
/* 689:    */     }
/* 690:759 */     if (paramuy != null) {
/* 691:760 */       paramuy.a("Saving level");
/* 692:    */     }
/* 693:762 */     a();
/* 694:764 */     if (paramuy != null) {
/* 695:765 */       paramuy.c("Saving chunks");
/* 696:    */     }
/* 697:767 */     this.v.a(paramBoolean, paramuy);
/* 698:    */     
/* 699:    */ 
/* 700:770 */     List localList = this.b.a();
/* 701:771 */     for (bfh localbfh : localList) {
/* 702:772 */       if (!this.K.a(localbfh.a, localbfh.b)) {
/* 703:773 */         this.b.b(localbfh.a, localbfh.b);
/* 704:    */       }
/* 705:    */     }
/* 706:    */   }
/* 707:    */   
/* 708:    */   public void n()
/* 709:    */   {
/* 710:779 */     if (!this.v.e()) {
/* 711:780 */       return;
/* 712:    */     }
/* 713:782 */     this.v.c();
/* 714:    */   }
/* 715:    */   
/* 716:    */   protected void a()
/* 717:    */   {
/* 718:786 */     I();
/* 719:    */     
/* 720:788 */     this.x.a(af().h());
/* 721:789 */     this.x.d(af().f());
/* 722:790 */     this.x.c(af().g());
/* 723:791 */     this.x.e(af().m());
/* 724:792 */     this.x.f(af().n());
/* 725:793 */     this.x.j(af().q());
/* 726:794 */     this.x.k(af().p());
/* 727:    */     
/* 728:796 */     this.x.b(af().j());
/* 729:797 */     this.x.e(af().i());
/* 730:    */     
/* 731:799 */     this.w.a(this.x, this.I.an().u());
/* 732:800 */     this.z.a();
/* 733:    */   }
/* 734:    */   
/* 735:    */   protected void a(wv paramwv)
/* 736:    */   {
/* 737:805 */     super.a(paramwv);
/* 738:806 */     this.l.a(paramwv.F(), paramwv);
/* 739:807 */     this.N.put(paramwv.aJ(), paramwv);
/* 740:808 */     wv[] arrayOfwv = paramwv.aC();
/* 741:809 */     if (arrayOfwv != null) {
/* 742:810 */       for (int i = 0; i < arrayOfwv.length; i++) {
/* 743:811 */         this.l.a(arrayOfwv[i].F(), arrayOfwv[i]);
/* 744:    */       }
/* 745:    */     }
/* 746:    */   }
/* 747:    */   
/* 748:    */   protected void b(wv paramwv)
/* 749:    */   {
/* 750:818 */     super.b(paramwv);
/* 751:819 */     this.l.d(paramwv.F());
/* 752:820 */     this.N.remove(paramwv.aJ());
/* 753:821 */     wv[] arrayOfwv = paramwv.aC();
/* 754:822 */     if (arrayOfwv != null) {
/* 755:823 */       for (int i = 0; i < arrayOfwv.length; i++) {
/* 756:824 */         this.l.d(arrayOfwv[i].F());
/* 757:    */       }
/* 758:    */     }
/* 759:    */   }
/* 760:    */   
/* 761:    */   public boolean c(wv paramwv)
/* 762:    */   {
/* 763:831 */     if (super.c(paramwv))
/* 764:    */     {
/* 765:832 */       this.I.an().a(paramwv.s, paramwv.t, paramwv.u, 512.0D, this.t.q(), new in(paramwv));
/* 766:833 */       return true;
/* 767:    */     }
/* 768:835 */     return false;
/* 769:    */   }
/* 770:    */   
/* 771:    */   public void a(wv paramwv, byte paramByte)
/* 772:    */   {
/* 773:840 */     s().b(paramwv, new jk(paramwv, paramByte));
/* 774:    */   }
/* 775:    */   
/* 776:    */   public aqo a(wv paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
/* 777:    */   {
/* 778:847 */     aqo localaqo = new aqo(this, paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat, paramBoolean1, paramBoolean2);
/* 779:848 */     localaqo.a();
/* 780:849 */     localaqo.a(false);
/* 781:851 */     if (!paramBoolean2) {
/* 782:852 */       localaqo.d();
/* 783:    */     }
/* 784:855 */     for (ahd localahd : this.j) {
/* 785:856 */       if (localahd.e(paramDouble1, paramDouble2, paramDouble3) < 4096.0D) {
/* 786:857 */         ((qw)localahd).a.a(new jm(paramDouble1, paramDouble2, paramDouble3, paramFloat, localaqo.e(), (brw)localaqo.b().get(localahd)));
/* 787:    */       }
/* 788:    */     }
/* 789:861 */     return localaqo;
/* 790:    */   }
/* 791:    */   
/* 792:    */   public void c(dt paramdt, atr paramatr, int paramInt1, int paramInt2)
/* 793:    */   {
/* 794:866 */     aqk localaqk1 = new aqk(paramdt, paramatr, paramInt1, paramInt2);
/* 795:867 */     for (aqk localaqk2 : this.S[this.T]) {
/* 796:868 */       if (localaqk2.equals(localaqk1)) {
/* 797:869 */         return;
/* 798:    */       }
/* 799:    */     }
/* 800:872 */     this.S[this.T].add(localaqk1);
/* 801:    */   }
/* 802:    */   
/* 803:    */   private void ak()
/* 804:    */   {
/* 805:877 */     while (!this.S[this.T].isEmpty())
/* 806:    */     {
/* 807:878 */       int i = this.T;
/* 808:879 */       this.T ^= 0x1;
/* 809:881 */       for (aqk localaqk : this.S[i]) {
/* 810:882 */         if (a(localaqk)) {
/* 811:883 */           this.I.an().a(localaqk.a().n(), localaqk.a().o(), localaqk.a().p(), 64.0D, this.t.q(), new iv(localaqk.a(), localaqk.d(), localaqk.b(), localaqk.c()));
/* 812:    */         }
/* 813:    */       }
/* 814:886 */       this.S[i].clear();
/* 815:    */     }
/* 816:    */   }
/* 817:    */   
/* 818:    */   private boolean a(aqk paramaqk)
/* 819:    */   {
/* 820:891 */     bec localbec = p(paramaqk.a());
/* 821:892 */     if (localbec.c() == paramaqk.d()) {
/* 822:893 */       return localbec.c().a(this, paramaqk.a(), localbec, paramaqk.b(), paramaqk.c());
/* 823:    */     }
/* 824:895 */     return false;
/* 825:    */   }
/* 826:    */   
/* 827:    */   public void o()
/* 828:    */   {
/* 829:899 */     this.w.a();
/* 830:    */   }
/* 831:    */   
/* 832:    */   protected void p()
/* 833:    */   {
/* 834:904 */     boolean bool = S();
/* 835:905 */     super.p();
/* 836:907 */     if (this.o != this.p) {
/* 837:908 */       this.I.an().a(new jo(7, this.p), this.t.q());
/* 838:    */     }
/* 839:910 */     if (this.q != this.r) {
/* 840:911 */       this.I.an().a(new jo(8, this.r), this.t.q());
/* 841:    */     }
/* 842:914 */     if (bool != S())
/* 843:    */     {
/* 844:915 */       if (bool) {
/* 845:916 */         this.I.an().a(new jo(2, 0.0F));
/* 846:    */       } else {
/* 847:918 */         this.I.an().a(new jo(1, 0.0F));
/* 848:    */       }
/* 849:920 */       this.I.an().a(new jo(7, this.p));
/* 850:921 */       this.I.an().a(new jo(8, this.r));
/* 851:    */     }
/* 852:    */   }
/* 853:    */   
/* 854:    */   protected int q()
/* 855:    */   {
/* 856:927 */     return this.I.an().t();
/* 857:    */   }
/* 858:    */   
/* 859:    */   public MinecraftServer r()
/* 860:    */   {
/* 861:931 */     return this.I;
/* 862:    */   }
/* 863:    */   
/* 864:    */   public qn s()
/* 865:    */   {
/* 866:935 */     return this.J;
/* 867:    */   }
/* 868:    */   
/* 869:    */   public qq t()
/* 870:    */   {
/* 871:939 */     return this.K;
/* 872:    */   }
/* 873:    */   
/* 874:    */   public arh u()
/* 875:    */   {
/* 876:943 */     return this.Q;
/* 877:    */   }
/* 878:    */   
/* 879:    */   public void a(ew paramew, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, int... paramVarArgs)
/* 880:    */   {
/* 881:947 */     a(paramew, false, paramDouble1, paramDouble2, paramDouble3, paramInt, paramDouble4, paramDouble5, paramDouble6, paramDouble7, paramVarArgs);
/* 882:    */   }
/* 883:    */   
/* 884:    */   public void a(ew paramew, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, int... paramVarArgs)
/* 885:    */   {
/* 886:951 */     ju localju = new ju(paramew, paramBoolean, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4, (float)paramDouble5, (float)paramDouble6, (float)paramDouble7, paramInt, paramVarArgs);
/* 887:953 */     for (int i = 0; i < this.j.size(); i++)
/* 888:    */     {
/* 889:954 */       qw localqw = (qw)this.j.get(i);
/* 890:955 */       dt localdt = localqw.c();
/* 891:956 */       double d1 = localdt.c(paramDouble1, paramDouble2, paramDouble3);
/* 892:958 */       if ((d1 <= 256.0D) || ((paramBoolean) && (d1 <= 65536.0D))) {
/* 893:959 */         localqw.a.a(localju);
/* 894:    */       }
/* 895:    */     }
/* 896:    */   }
/* 897:    */   
/* 898:    */   public wv a(UUID paramUUID)
/* 899:    */   {
/* 900:966 */     return (wv)this.N.get(paramUUID);
/* 901:    */   }
/* 902:    */   
/* 903:    */   public ListenableFuture a(Runnable paramRunnable)
/* 904:    */   {
/* 905:976 */     return this.I.a(paramRunnable);
/* 906:    */   }
/* 907:    */   
/* 908:    */   public boolean aH()
/* 909:    */   {
/* 910:981 */     return this.I.aH();
/* 911:    */   }
/* 912:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     qt
 * JD-Core Version:    0.7.0.1
 */