/*   1:    */ import net.minecraft.server.MinecraftServer;
/*   2:    */ 
/*   3:    */ public class bqo
/*   4:    */ {
/*   5: 17 */   public static final vt a = vt.c;
/*   6:    */   private long b;
/*   7: 19 */   private are c = are.b;
/*   8: 20 */   private String d = "";
/*   9:    */   private int e;
/*  10:    */   private int f;
/*  11:    */   private int g;
/*  12:    */   private long h;
/*  13:    */   private long i;
/*  14:    */   private long j;
/*  15:    */   private long k;
/*  16:    */   private fn l;
/*  17:    */   private int m;
/*  18:    */   private String n;
/*  19:    */   private int o;
/*  20:    */   private int p;
/*  21:    */   private boolean q;
/*  22:    */   private int r;
/*  23:    */   private boolean s;
/*  24:    */   private int t;
/*  25:    */   private arc u;
/*  26:    */   private boolean v;
/*  27:    */   private boolean w;
/*  28:    */   private boolean x;
/*  29:    */   private boolean y;
/*  30:    */   private vt z;
/*  31:    */   private boolean A;
/*  32: 46 */   private double B = 0.0D;
/*  33: 47 */   private double C = 0.0D;
/*  34: 48 */   private double D = 60000000.0D;
/*  35: 49 */   private long E = 0L;
/*  36: 50 */   private double F = 0.0D;
/*  37: 51 */   private double G = 5.0D;
/*  38: 52 */   private double H = 0.2D;
/*  39: 53 */   private int I = 5;
/*  40: 54 */   private int J = 15;
/*  41: 56 */   private aqq K = new aqq();
/*  42:    */   
/*  43:    */   protected bqo() {}
/*  44:    */   
/*  45:    */   public bqo(fn paramfn)
/*  46:    */   {
/*  47: 62 */     this.b = paramfn.g("RandomSeed");
/*  48: 63 */     if (paramfn.b("generatorName", 8))
/*  49:    */     {
/*  50: 64 */       String str = paramfn.j("generatorName");
/*  51: 65 */       this.c = are.a(str);
/*  52: 66 */       if (this.c == null)
/*  53:    */       {
/*  54: 67 */         this.c = are.b;
/*  55:    */       }
/*  56: 68 */       else if (this.c.f())
/*  57:    */       {
/*  58: 69 */         int i1 = 0;
/*  59: 70 */         if (paramfn.b("generatorVersion", 99)) {
/*  60: 71 */           i1 = paramfn.f("generatorVersion");
/*  61:    */         }
/*  62: 73 */         this.c = this.c.a(i1);
/*  63:    */       }
/*  64: 76 */       if (paramfn.b("generatorOptions", 8)) {
/*  65: 77 */         this.d = paramfn.j("generatorOptions");
/*  66:    */       }
/*  67:    */     }
/*  68: 80 */     this.u = arc.a(paramfn.f("GameType"));
/*  69: 81 */     if (paramfn.b("MapFeatures", 99)) {
/*  70: 82 */       this.v = paramfn.n("MapFeatures");
/*  71:    */     } else {
/*  72: 84 */       this.v = true;
/*  73:    */     }
/*  74: 86 */     this.e = paramfn.f("SpawnX");
/*  75: 87 */     this.f = paramfn.f("SpawnY");
/*  76: 88 */     this.g = paramfn.f("SpawnZ");
/*  77: 89 */     this.h = paramfn.g("Time");
/*  78: 90 */     if (paramfn.b("DayTime", 99)) {
/*  79: 91 */       this.i = paramfn.g("DayTime");
/*  80:    */     } else {
/*  81: 93 */       this.i = this.h;
/*  82:    */     }
/*  83: 95 */     this.j = paramfn.g("LastPlayed");
/*  84: 96 */     this.k = paramfn.g("SizeOnDisk");
/*  85: 97 */     this.n = paramfn.j("LevelName");
/*  86: 98 */     this.o = paramfn.f("version");
/*  87: 99 */     this.p = paramfn.f("clearWeatherTime");
/*  88:100 */     this.r = paramfn.f("rainTime");
/*  89:101 */     this.q = paramfn.n("raining");
/*  90:102 */     this.t = paramfn.f("thunderTime");
/*  91:103 */     this.s = paramfn.n("thundering");
/*  92:104 */     this.w = paramfn.n("hardcore");
/*  93:106 */     if (paramfn.b("initialized", 99)) {
/*  94:107 */       this.y = paramfn.n("initialized");
/*  95:    */     } else {
/*  96:109 */       this.y = true;
/*  97:    */     }
/*  98:112 */     if (paramfn.b("allowCommands", 99)) {
/*  99:113 */       this.x = paramfn.n("allowCommands");
/* 100:    */     } else {
/* 101:115 */       this.x = (this.u == arc.c);
/* 102:    */     }
/* 103:118 */     if (paramfn.b("Player", 10))
/* 104:    */     {
/* 105:119 */       this.l = paramfn.m("Player");
/* 106:120 */       this.m = this.l.f("Dimension");
/* 107:    */     }
/* 108:123 */     if (paramfn.b("GameRules", 10)) {
/* 109:124 */       this.K.a(paramfn.m("GameRules"));
/* 110:    */     }
/* 111:127 */     if (paramfn.b("Difficulty", 99)) {
/* 112:128 */       this.z = vt.a(paramfn.d("Difficulty"));
/* 113:    */     }
/* 114:131 */     if (paramfn.b("DifficultyLocked", 1)) {
/* 115:132 */       this.A = paramfn.n("DifficultyLocked");
/* 116:    */     }
/* 117:135 */     if (paramfn.b("BorderCenterX", 99)) {
/* 118:136 */       this.B = paramfn.i("BorderCenterX");
/* 119:    */     }
/* 120:139 */     if (paramfn.b("BorderCenterZ", 99)) {
/* 121:140 */       this.C = paramfn.i("BorderCenterZ");
/* 122:    */     }
/* 123:143 */     if (paramfn.b("BorderSize", 99)) {
/* 124:144 */       this.D = paramfn.i("BorderSize");
/* 125:    */     }
/* 126:147 */     if (paramfn.b("BorderSizeLerpTime", 99)) {
/* 127:148 */       this.E = paramfn.g("BorderSizeLerpTime");
/* 128:    */     }
/* 129:151 */     if (paramfn.b("BorderSizeLerpTarget", 99)) {
/* 130:152 */       this.F = paramfn.i("BorderSizeLerpTarget");
/* 131:    */     }
/* 132:155 */     if (paramfn.b("BorderSafeZone", 99)) {
/* 133:156 */       this.G = paramfn.i("BorderSafeZone");
/* 134:    */     }
/* 135:159 */     if (paramfn.b("BorderDamagePerBlock", 99)) {
/* 136:160 */       this.H = paramfn.i("BorderDamagePerBlock");
/* 137:    */     }
/* 138:163 */     if (paramfn.b("BorderWarningBlocks", 99)) {
/* 139:164 */       this.I = paramfn.f("BorderWarningBlocks");
/* 140:    */     }
/* 141:167 */     if (paramfn.b("BorderWarningTime", 99)) {
/* 142:168 */       this.J = paramfn.f("BorderWarningTime");
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   public bqo(arb paramarb, String paramString)
/* 147:    */   {
/* 148:173 */     a(paramarb);
/* 149:174 */     this.n = paramString;
/* 150:175 */     this.z = a;
/* 151:176 */     this.y = false;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void a(arb paramarb)
/* 155:    */   {
/* 156:180 */     this.b = paramarb.d();
/* 157:181 */     this.u = paramarb.e();
/* 158:182 */     this.v = paramarb.g();
/* 159:183 */     this.w = paramarb.f();
/* 160:184 */     this.c = paramarb.h();
/* 161:185 */     this.d = paramarb.j();
/* 162:186 */     this.x = paramarb.i();
/* 163:    */   }
/* 164:    */   
/* 165:    */   public bqo(bqo parambqo)
/* 166:    */   {
/* 167:190 */     this.b = parambqo.b;
/* 168:191 */     this.c = parambqo.c;
/* 169:192 */     this.d = parambqo.d;
/* 170:193 */     this.u = parambqo.u;
/* 171:194 */     this.v = parambqo.v;
/* 172:195 */     this.e = parambqo.e;
/* 173:196 */     this.f = parambqo.f;
/* 174:197 */     this.g = parambqo.g;
/* 175:198 */     this.h = parambqo.h;
/* 176:199 */     this.i = parambqo.i;
/* 177:200 */     this.j = parambqo.j;
/* 178:201 */     this.k = parambqo.k;
/* 179:202 */     this.l = parambqo.l;
/* 180:203 */     this.m = parambqo.m;
/* 181:204 */     this.n = parambqo.n;
/* 182:205 */     this.o = parambqo.o;
/* 183:206 */     this.r = parambqo.r;
/* 184:207 */     this.q = parambqo.q;
/* 185:208 */     this.t = parambqo.t;
/* 186:209 */     this.s = parambqo.s;
/* 187:210 */     this.w = parambqo.w;
/* 188:211 */     this.x = parambqo.x;
/* 189:212 */     this.y = parambqo.y;
/* 190:213 */     this.K = parambqo.K;
/* 191:214 */     this.z = parambqo.z;
/* 192:215 */     this.A = parambqo.A;
/* 193:216 */     this.B = parambqo.B;
/* 194:217 */     this.C = parambqo.C;
/* 195:218 */     this.D = parambqo.D;
/* 196:219 */     this.E = parambqo.E;
/* 197:220 */     this.F = parambqo.F;
/* 198:221 */     this.G = parambqo.G;
/* 199:222 */     this.H = parambqo.H;
/* 200:223 */     this.J = parambqo.J;
/* 201:224 */     this.I = parambqo.I;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public fn a()
/* 205:    */   {
/* 206:228 */     fn localfn = new fn();
/* 207:    */     
/* 208:230 */     a(localfn, this.l);
/* 209:    */     
/* 210:232 */     return localfn;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public fn a(fn paramfn)
/* 214:    */   {
/* 215:236 */     fn localfn = new fn();
/* 216:237 */     a(localfn, paramfn);
/* 217:    */     
/* 218:239 */     return localfn;
/* 219:    */   }
/* 220:    */   
/* 221:    */   private void a(fn paramfn1, fn paramfn2)
/* 222:    */   {
/* 223:243 */     paramfn1.a("RandomSeed", this.b);
/* 224:244 */     paramfn1.a("generatorName", this.c.a());
/* 225:245 */     paramfn1.a("generatorVersion", this.c.d());
/* 226:246 */     paramfn1.a("generatorOptions", this.d);
/* 227:247 */     paramfn1.a("GameType", this.u.a());
/* 228:248 */     paramfn1.a("MapFeatures", this.v);
/* 229:249 */     paramfn1.a("SpawnX", this.e);
/* 230:250 */     paramfn1.a("SpawnY", this.f);
/* 231:251 */     paramfn1.a("SpawnZ", this.g);
/* 232:252 */     paramfn1.a("Time", this.h);
/* 233:253 */     paramfn1.a("DayTime", this.i);
/* 234:254 */     paramfn1.a("SizeOnDisk", this.k);
/* 235:255 */     paramfn1.a("LastPlayed", MinecraftServer.ax());
/* 236:256 */     paramfn1.a("LevelName", this.n);
/* 237:257 */     paramfn1.a("version", this.o);
/* 238:258 */     paramfn1.a("clearWeatherTime", this.p);
/* 239:259 */     paramfn1.a("rainTime", this.r);
/* 240:260 */     paramfn1.a("raining", this.q);
/* 241:261 */     paramfn1.a("thunderTime", this.t);
/* 242:262 */     paramfn1.a("thundering", this.s);
/* 243:263 */     paramfn1.a("hardcore", this.w);
/* 244:264 */     paramfn1.a("allowCommands", this.x);
/* 245:265 */     paramfn1.a("initialized", this.y);
/* 246:266 */     paramfn1.a("BorderCenterX", this.B);
/* 247:267 */     paramfn1.a("BorderCenterZ", this.C);
/* 248:268 */     paramfn1.a("BorderSize", this.D);
/* 249:269 */     paramfn1.a("BorderSizeLerpTime", this.E);
/* 250:270 */     paramfn1.a("BorderSafeZone", this.G);
/* 251:271 */     paramfn1.a("BorderDamagePerBlock", this.H);
/* 252:272 */     paramfn1.a("BorderSizeLerpTarget", this.F);
/* 253:273 */     paramfn1.a("BorderWarningBlocks", this.I);
/* 254:274 */     paramfn1.a("BorderWarningTime", this.J);
/* 255:275 */     if (this.z != null) {
/* 256:276 */       paramfn1.a("Difficulty", (byte)this.z.a());
/* 257:    */     }
/* 258:278 */     paramfn1.a("DifficultyLocked", this.A);
/* 259:279 */     paramfn1.a("GameRules", this.K.a());
/* 260:281 */     if (paramfn2 != null) {
/* 261:282 */       paramfn1.a("Player", paramfn2);
/* 262:    */     }
/* 263:    */   }
/* 264:    */   
/* 265:    */   public long b()
/* 266:    */   {
/* 267:287 */     return this.b;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public int c()
/* 271:    */   {
/* 272:291 */     return this.e;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public int d()
/* 276:    */   {
/* 277:295 */     return this.f;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public int e()
/* 281:    */   {
/* 282:299 */     return this.g;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public long f()
/* 286:    */   {
/* 287:303 */     return this.h;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public long g()
/* 291:    */   {
/* 292:307 */     return this.i;
/* 293:    */   }
/* 294:    */   
/* 295:    */   public long h()
/* 296:    */   {
/* 297:311 */     return this.k;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public fn i()
/* 301:    */   {
/* 302:315 */     return this.l;
/* 303:    */   }
/* 304:    */   
/* 305:    */   public void a(int paramInt)
/* 306:    */   {
/* 307:327 */     this.e = paramInt;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public void b(int paramInt)
/* 311:    */   {
/* 312:331 */     this.f = paramInt;
/* 313:    */   }
/* 314:    */   
/* 315:    */   public void c(int paramInt)
/* 316:    */   {
/* 317:335 */     this.g = paramInt;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public void b(long paramLong)
/* 321:    */   {
/* 322:339 */     this.h = paramLong;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public void c(long paramLong)
/* 326:    */   {
/* 327:343 */     this.i = paramLong;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public void a(dt paramdt)
/* 331:    */   {
/* 332:359 */     this.e = paramdt.n();
/* 333:360 */     this.f = paramdt.o();
/* 334:361 */     this.g = paramdt.p();
/* 335:    */   }
/* 336:    */   
/* 337:    */   public String k()
/* 338:    */   {
/* 339:365 */     return this.n;
/* 340:    */   }
/* 341:    */   
/* 342:    */   public void a(String paramString)
/* 343:    */   {
/* 344:369 */     this.n = paramString;
/* 345:    */   }
/* 346:    */   
/* 347:    */   public int l()
/* 348:    */   {
/* 349:373 */     return this.o;
/* 350:    */   }
/* 351:    */   
/* 352:    */   public void e(int paramInt)
/* 353:    */   {
/* 354:377 */     this.o = paramInt;
/* 355:    */   }
/* 356:    */   
/* 357:    */   public long m()
/* 358:    */   {
/* 359:381 */     return this.j;
/* 360:    */   }
/* 361:    */   
/* 362:    */   public int A()
/* 363:    */   {
/* 364:385 */     return this.p;
/* 365:    */   }
/* 366:    */   
/* 367:    */   public void i(int paramInt)
/* 368:    */   {
/* 369:389 */     this.p = paramInt;
/* 370:    */   }
/* 371:    */   
/* 372:    */   public boolean n()
/* 373:    */   {
/* 374:393 */     return this.s;
/* 375:    */   }
/* 376:    */   
/* 377:    */   public void a(boolean paramBoolean)
/* 378:    */   {
/* 379:397 */     this.s = paramBoolean;
/* 380:    */   }
/* 381:    */   
/* 382:    */   public int o()
/* 383:    */   {
/* 384:401 */     return this.t;
/* 385:    */   }
/* 386:    */   
/* 387:    */   public void f(int paramInt)
/* 388:    */   {
/* 389:405 */     this.t = paramInt;
/* 390:    */   }
/* 391:    */   
/* 392:    */   public boolean p()
/* 393:    */   {
/* 394:409 */     return this.q;
/* 395:    */   }
/* 396:    */   
/* 397:    */   public void b(boolean paramBoolean)
/* 398:    */   {
/* 399:413 */     this.q = paramBoolean;
/* 400:    */   }
/* 401:    */   
/* 402:    */   public int q()
/* 403:    */   {
/* 404:417 */     return this.r;
/* 405:    */   }
/* 406:    */   
/* 407:    */   public void g(int paramInt)
/* 408:    */   {
/* 409:421 */     this.r = paramInt;
/* 410:    */   }
/* 411:    */   
/* 412:    */   public arc r()
/* 413:    */   {
/* 414:425 */     return this.u;
/* 415:    */   }
/* 416:    */   
/* 417:    */   public boolean s()
/* 418:    */   {
/* 419:429 */     return this.v;
/* 420:    */   }
/* 421:    */   
/* 422:    */   public void f(boolean paramBoolean)
/* 423:    */   {
/* 424:433 */     this.v = paramBoolean;
/* 425:    */   }
/* 426:    */   
/* 427:    */   public void a(arc paramarc)
/* 428:    */   {
/* 429:437 */     this.u = paramarc;
/* 430:    */   }
/* 431:    */   
/* 432:    */   public boolean t()
/* 433:    */   {
/* 434:441 */     return this.w;
/* 435:    */   }
/* 436:    */   
/* 437:    */   public void g(boolean paramBoolean)
/* 438:    */   {
/* 439:445 */     this.w = paramBoolean;
/* 440:    */   }
/* 441:    */   
/* 442:    */   public are u()
/* 443:    */   {
/* 444:449 */     return this.c;
/* 445:    */   }
/* 446:    */   
/* 447:    */   public void a(are paramare)
/* 448:    */   {
/* 449:453 */     this.c = paramare;
/* 450:    */   }
/* 451:    */   
/* 452:    */   public String B()
/* 453:    */   {
/* 454:457 */     return this.d;
/* 455:    */   }
/* 456:    */   
/* 457:    */   public boolean v()
/* 458:    */   {
/* 459:465 */     return this.x;
/* 460:    */   }
/* 461:    */   
/* 462:    */   public void c(boolean paramBoolean)
/* 463:    */   {
/* 464:469 */     this.x = paramBoolean;
/* 465:    */   }
/* 466:    */   
/* 467:    */   public boolean w()
/* 468:    */   {
/* 469:473 */     return this.y;
/* 470:    */   }
/* 471:    */   
/* 472:    */   public void d(boolean paramBoolean)
/* 473:    */   {
/* 474:477 */     this.y = paramBoolean;
/* 475:    */   }
/* 476:    */   
/* 477:    */   public aqq x()
/* 478:    */   {
/* 479:481 */     return this.K;
/* 480:    */   }
/* 481:    */   
/* 482:    */   public double C()
/* 483:    */   {
/* 484:485 */     return this.B;
/* 485:    */   }
/* 486:    */   
/* 487:    */   public double D()
/* 488:    */   {
/* 489:489 */     return this.C;
/* 490:    */   }
/* 491:    */   
/* 492:    */   public double E()
/* 493:    */   {
/* 494:493 */     return this.D;
/* 495:    */   }
/* 496:    */   
/* 497:    */   public void a(double paramDouble)
/* 498:    */   {
/* 499:497 */     this.D = paramDouble;
/* 500:    */   }
/* 501:    */   
/* 502:    */   public long F()
/* 503:    */   {
/* 504:501 */     return this.E;
/* 505:    */   }
/* 506:    */   
/* 507:    */   public void e(long paramLong)
/* 508:    */   {
/* 509:505 */     this.E = paramLong;
/* 510:    */   }
/* 511:    */   
/* 512:    */   public double G()
/* 513:    */   {
/* 514:509 */     return this.F;
/* 515:    */   }
/* 516:    */   
/* 517:    */   public void b(double paramDouble)
/* 518:    */   {
/* 519:513 */     this.F = paramDouble;
/* 520:    */   }
/* 521:    */   
/* 522:    */   public void c(double paramDouble)
/* 523:    */   {
/* 524:517 */     this.C = paramDouble;
/* 525:    */   }
/* 526:    */   
/* 527:    */   public void d(double paramDouble)
/* 528:    */   {
/* 529:521 */     this.B = paramDouble;
/* 530:    */   }
/* 531:    */   
/* 532:    */   public double H()
/* 533:    */   {
/* 534:525 */     return this.G;
/* 535:    */   }
/* 536:    */   
/* 537:    */   public void e(double paramDouble)
/* 538:    */   {
/* 539:529 */     this.G = paramDouble;
/* 540:    */   }
/* 541:    */   
/* 542:    */   public double I()
/* 543:    */   {
/* 544:533 */     return this.H;
/* 545:    */   }
/* 546:    */   
/* 547:    */   public void f(double paramDouble)
/* 548:    */   {
/* 549:537 */     this.H = paramDouble;
/* 550:    */   }
/* 551:    */   
/* 552:    */   public int J()
/* 553:    */   {
/* 554:541 */     return this.I;
/* 555:    */   }
/* 556:    */   
/* 557:    */   public int K()
/* 558:    */   {
/* 559:545 */     return this.J;
/* 560:    */   }
/* 561:    */   
/* 562:    */   public void j(int paramInt)
/* 563:    */   {
/* 564:549 */     this.I = paramInt;
/* 565:    */   }
/* 566:    */   
/* 567:    */   public void k(int paramInt)
/* 568:    */   {
/* 569:553 */     this.J = paramInt;
/* 570:    */   }
/* 571:    */   
/* 572:    */   public vt y()
/* 573:    */   {
/* 574:557 */     return this.z;
/* 575:    */   }
/* 576:    */   
/* 577:    */   public void a(vt paramvt)
/* 578:    */   {
/* 579:561 */     this.z = paramvt;
/* 580:    */   }
/* 581:    */   
/* 582:    */   public boolean z()
/* 583:    */   {
/* 584:565 */     return this.A;
/* 585:    */   }
/* 586:    */   
/* 587:    */   public void e(boolean paramBoolean)
/* 588:    */   {
/* 589:569 */     this.A = paramBoolean;
/* 590:    */   }
/* 591:    */   
/* 592:    */   public void a(j paramj)
/* 593:    */   {
/* 594:573 */     paramj.a("Level seed", new bqp(this));
/* 595:    */     
/* 596:    */ 
/* 597:    */ 
/* 598:    */ 
/* 599:    */ 
/* 600:    */ 
/* 601:580 */     paramj.a("Level generator", new bqq(this));
/* 602:    */     
/* 603:    */ 
/* 604:    */ 
/* 605:    */ 
/* 606:    */ 
/* 607:    */ 
/* 608:587 */     paramj.a("Level generator options", new bqr(this));
/* 609:    */     
/* 610:    */ 
/* 611:    */ 
/* 612:    */ 
/* 613:    */ 
/* 614:    */ 
/* 615:594 */     paramj.a("Level spawn location", new bqs(this));
/* 616:    */     
/* 617:    */ 
/* 618:    */ 
/* 619:    */ 
/* 620:    */ 
/* 621:    */ 
/* 622:601 */     paramj.a("Level time", new bqt(this));
/* 623:    */     
/* 624:    */ 
/* 625:    */ 
/* 626:    */ 
/* 627:    */ 
/* 628:    */ 
/* 629:608 */     paramj.a("Level dimension", new bqu(this));
/* 630:    */     
/* 631:    */ 
/* 632:    */ 
/* 633:    */ 
/* 634:    */ 
/* 635:    */ 
/* 636:615 */     paramj.a("Level storage version", new bqv(this));
/* 637:    */     
/* 638:    */ 
/* 639:    */ 
/* 640:    */ 
/* 641:    */ 
/* 642:    */ 
/* 643:    */ 
/* 644:    */ 
/* 645:    */ 
/* 646:    */ 
/* 647:    */ 
/* 648:    */ 
/* 649:    */ 
/* 650:    */ 
/* 651:    */ 
/* 652:    */ 
/* 653:    */ 
/* 654:    */ 
/* 655:    */ 
/* 656:    */ 
/* 657:636 */     paramj.a("Level weather", new bqw(this));
/* 658:    */     
/* 659:    */ 
/* 660:    */ 
/* 661:    */ 
/* 662:    */ 
/* 663:    */ 
/* 664:643 */     paramj.a("Level game mode", new bqx(this));
/* 665:    */   }
/* 666:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bqo
 * JD-Core Version:    0.7.0.1
 */