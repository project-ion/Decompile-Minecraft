/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ import java.util.UUID;
/*   4:    */ 
/*   5:    */ public abstract class xn
/*   6:    */   extends xm
/*   7:    */ {
/*   8:    */   public int a_;
/*   9:    */   protected int b_;
/*  10:    */   private ym a;
/*  11:    */   protected yn f;
/*  12:    */   protected yl g;
/*  13:    */   private yj b;
/*  14:    */   protected aaz h;
/*  15:    */   protected final zc i;
/*  16:    */   protected final zc bg;
/*  17:    */   private xm c;
/*  18:    */   private abd bi;
/*  19: 69 */   private amj[] bj = new amj[5];
/*  20: 70 */   protected float[] bh = new float[5];
/*  21:    */   private boolean bk;
/*  22:    */   private boolean bl;
/*  23:    */   private boolean bm;
/*  24:    */   private wv bn;
/*  25:    */   private fn bo;
/*  26:    */   
/*  27:    */   public xn(aqu paramaqu)
/*  28:    */   {
/*  29: 75 */     super(paramaqu);
/*  30:    */     
/*  31: 77 */     this.i = new zc((paramaqu == null) || (paramaqu.B == null) ? null : paramaqu.B);
/*  32: 78 */     this.bg = new zc((paramaqu == null) || (paramaqu.B == null) ? null : paramaqu.B);
/*  33: 79 */     this.a = new ym(this);
/*  34: 80 */     this.f = new yn(this);
/*  35: 81 */     this.g = new yl(this);
/*  36: 82 */     this.b = new yj(this);
/*  37: 83 */     this.h = b(paramaqu);
/*  38: 84 */     this.bi = new abd(this);
/*  39: 86 */     for (int j = 0; j < this.bh.length; j++) {
/*  40: 87 */       this.bh[j] = 0.085F;
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   protected void aW()
/*  45:    */   {
/*  46: 93 */     super.aW();
/*  47:    */     
/*  48: 95 */     bx().b(afs.b).a(16.0D);
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected aaz b(aqu paramaqu)
/*  52:    */   {
/*  53: 99 */     return new aay(this, paramaqu);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public ym p()
/*  57:    */   {
/*  58:103 */     return this.a;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public yn q()
/*  62:    */   {
/*  63:107 */     return this.f;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public yl r()
/*  67:    */   {
/*  68:111 */     return this.g;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public aaz s()
/*  72:    */   {
/*  73:115 */     return this.h;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public abd t()
/*  77:    */   {
/*  78:119 */     return this.bi;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public xm u()
/*  82:    */   {
/*  83:123 */     return this.c;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void d(xm paramxm)
/*  87:    */   {
/*  88:127 */     this.c = paramxm;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public boolean a(Class paramClass)
/*  92:    */   {
/*  93:131 */     return paramClass != afa.class;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void v() {}
/*  97:    */   
/*  98:    */   protected void h()
/*  99:    */   {
/* 100:140 */     super.h();
/* 101:141 */     this.ac.a(15, Byte.valueOf((byte)0));
/* 102:    */   }
/* 103:    */   
/* 104:    */   public int w()
/* 105:    */   {
/* 106:145 */     return 80;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void x()
/* 110:    */   {
/* 111:149 */     String str = z();
/* 112:150 */     if (str != null) {
/* 113:151 */       a(str, bA(), bB());
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void K()
/* 118:    */   {
/* 119:157 */     super.K();
/* 120:    */     
/* 121:159 */     this.o.B.a("mobBaseTick");
/* 122:160 */     if ((ai()) && (this.V.nextInt(1000) < this.a_++))
/* 123:    */     {
/* 124:161 */       this.a_ = (-w());
/* 125:162 */       x();
/* 126:    */     }
/* 127:164 */     this.o.B.b();
/* 128:    */   }
/* 129:    */   
/* 130:    */   protected int b(ahd paramahd)
/* 131:    */   {
/* 132:169 */     if (this.b_ > 0)
/* 133:    */     {
/* 134:170 */       int j = this.b_;
/* 135:    */       
/* 136:172 */       amj[] arrayOfamj = at();
/* 137:173 */       for (int k = 0; k < arrayOfamj.length; k++) {
/* 138:174 */         if ((arrayOfamj[k] != null) && (this.bh[k] <= 1.0F)) {
/* 139:175 */           j += 1 + this.V.nextInt(3);
/* 140:    */         }
/* 141:    */       }
/* 142:179 */       return j;
/* 143:    */     }
/* 144:181 */     return this.b_;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void y()
/* 148:    */   {
/* 149:186 */     if (this.o.D) {
/* 150:187 */       for (int j = 0; j < 20; j++)
/* 151:    */       {
/* 152:188 */         double d1 = this.V.nextGaussian() * 0.02D;
/* 153:189 */         double d2 = this.V.nextGaussian() * 0.02D;
/* 154:190 */         double d3 = this.V.nextGaussian() * 0.02D;
/* 155:191 */         double d4 = 10.0D;
/* 156:192 */         this.o.a(ew.a, this.s + this.V.nextFloat() * this.J * 2.0F - this.J - d1 * d4, this.t + this.V.nextFloat() * this.K - d2 * d4, this.u + this.V.nextFloat() * this.J * 2.0F - this.J - d3 * d4, d1, d2, d3, new int[0]);
/* 157:    */       }
/* 158:    */     } else {
/* 159:196 */       this.o.a(this, (byte)20);
/* 160:    */     }
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void a(byte paramByte)
/* 164:    */   {
/* 165:202 */     if (paramByte == 20) {
/* 166:203 */       y();
/* 167:    */     } else {
/* 168:205 */       super.a(paramByte);
/* 169:    */     }
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void s_()
/* 173:    */   {
/* 174:211 */     super.s_();
/* 175:213 */     if (!this.o.D) {
/* 176:214 */       bZ();
/* 177:    */     }
/* 178:    */   }
/* 179:    */   
/* 180:    */   protected float h(float paramFloat1, float paramFloat2)
/* 181:    */   {
/* 182:220 */     this.b.a();
/* 183:221 */     return paramFloat2;
/* 184:    */   }
/* 185:    */   
/* 186:    */   protected String z()
/* 187:    */   {
/* 188:226 */     return null;
/* 189:    */   }
/* 190:    */   
/* 191:    */   protected alq A()
/* 192:    */   {
/* 193:230 */     return null;
/* 194:    */   }
/* 195:    */   
/* 196:    */   protected void b(boolean paramBoolean, int paramInt)
/* 197:    */   {
/* 198:235 */     alq localalq = A();
/* 199:236 */     if (localalq != null)
/* 200:    */     {
/* 201:237 */       int j = this.V.nextInt(3);
/* 202:238 */       if (paramInt > 0) {
/* 203:239 */         j += this.V.nextInt(paramInt + 1);
/* 204:    */       }
/* 205:241 */       for (int k = 0; k < j; k++) {
/* 206:242 */         a(localalq, 1);
/* 207:    */       }
/* 208:    */     }
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void b(fn paramfn)
/* 212:    */   {
/* 213:249 */     super.b(paramfn);
/* 214:250 */     paramfn.a("CanPickUpLoot", bX());
/* 215:251 */     paramfn.a("PersistenceRequired", this.bl);
/* 216:    */     
/* 217:253 */     fv localfv1 = new fv();
/* 218:254 */     for (int j = 0; j < this.bj.length; j++)
/* 219:    */     {
/* 220:255 */       fn localfn1 = new fn();
/* 221:256 */       if (this.bj[j] != null) {
/* 222:257 */         this.bj[j].b(localfn1);
/* 223:    */       }
/* 224:259 */       localfv1.a(localfn1);
/* 225:    */     }
/* 226:261 */     paramfn.a("Equipment", localfv1);
/* 227:    */     
/* 228:263 */     fv localfv2 = new fv();
/* 229:264 */     for (int k = 0; k < this.bh.length; k++) {
/* 230:265 */       localfv2.a(new fs(this.bh[k]));
/* 231:    */     }
/* 232:267 */     paramfn.a("DropChances", localfv2);
/* 233:    */     
/* 234:    */ 
/* 235:270 */     paramfn.a("Leashed", this.bm);
/* 236:271 */     if (this.bn != null)
/* 237:    */     {
/* 238:272 */       fn localfn2 = new fn();
/* 239:273 */       if ((this.bn instanceof xm))
/* 240:    */       {
/* 241:275 */         localfn2.a("UUIDMost", this.bn.aJ().getMostSignificantBits());
/* 242:276 */         localfn2.a("UUIDLeast", this.bn.aJ().getLeastSignificantBits());
/* 243:    */       }
/* 244:277 */       else if ((this.bn instanceof adj))
/* 245:    */       {
/* 246:279 */         dt localdt = ((adj)this.bn).n();
/* 247:280 */         localfn2.a("X", localdt.n());
/* 248:281 */         localfn2.a("Y", localdt.o());
/* 249:282 */         localfn2.a("Z", localdt.p());
/* 250:    */       }
/* 251:284 */       paramfn.a("Leash", localfn2);
/* 252:    */     }
/* 253:287 */     if (cd()) {
/* 254:288 */       paramfn.a("NoAI", cd());
/* 255:    */     }
/* 256:    */   }
/* 257:    */   
/* 258:    */   public void a(fn paramfn)
/* 259:    */   {
/* 260:295 */     super.a(paramfn);
/* 261:297 */     if (paramfn.b("CanPickUpLoot", 1)) {
/* 262:298 */       j(paramfn.n("CanPickUpLoot"));
/* 263:    */     }
/* 264:300 */     this.bl = paramfn.n("PersistenceRequired");
/* 265:    */     fv localfv;
/* 266:    */     int j;
/* 267:302 */     if (paramfn.b("Equipment", 9))
/* 268:    */     {
/* 269:303 */       localfv = paramfn.c("Equipment", 10);
/* 270:305 */       for (j = 0; j < this.bj.length; j++) {
/* 271:306 */         this.bj[j] = amj.a(localfv.b(j));
/* 272:    */       }
/* 273:    */     }
/* 274:310 */     if (paramfn.b("DropChances", 9))
/* 275:    */     {
/* 276:311 */       localfv = paramfn.c("DropChances", 5);
/* 277:312 */       for (j = 0; j < localfv.c(); j++) {
/* 278:313 */         this.bh[j] = localfv.e(j);
/* 279:    */       }
/* 280:    */     }
/* 281:317 */     this.bm = paramfn.n("Leashed");
/* 282:318 */     if ((this.bm) && (paramfn.b("Leash", 10))) {
/* 283:319 */       this.bo = paramfn.m("Leash");
/* 284:    */     }
/* 285:322 */     k(paramfn.n("NoAI"));
/* 286:    */   }
/* 287:    */   
/* 288:    */   public void m(float paramFloat)
/* 289:    */   {
/* 290:328 */     this.aY = paramFloat;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void j(float paramFloat)
/* 294:    */   {
/* 295:333 */     super.j(paramFloat);
/* 296:334 */     m(paramFloat);
/* 297:    */   }
/* 298:    */   
/* 299:    */   public void m()
/* 300:    */   {
/* 301:339 */     super.m();
/* 302:    */     
/* 303:341 */     this.o.B.a("looting");
/* 304:342 */     if ((!this.o.D) && (bX()) && (!this.aN) && (this.o.Q().b("mobGriefing")))
/* 305:    */     {
/* 306:343 */       List localList = this.o.a(adw.class, aQ().b(1.0D, 0.0D, 1.0D));
/* 307:344 */       for (adw localadw : localList) {
/* 308:345 */         if ((!localadw.I) && (localadw.l() != null) && (!localadw.s())) {
/* 309:348 */           a(localadw);
/* 310:    */         }
/* 311:    */       }
/* 312:    */     }
/* 313:351 */     this.o.B.b();
/* 314:    */   }
/* 315:    */   
/* 316:    */   protected void a(adw paramadw)
/* 317:    */   {
/* 318:355 */     amj localamj1 = paramadw.l();
/* 319:356 */     int j = c(localamj1);
/* 320:358 */     if (j > -1)
/* 321:    */     {
/* 322:359 */       int k = 1;
/* 323:360 */       amj localamj2 = p(j);
/* 324:    */       Object localObject1;
/* 325:362 */       if (localamj2 != null)
/* 326:    */       {
/* 327:    */         Object localObject2;
/* 328:363 */         if (j == 0)
/* 329:    */         {
/* 330:364 */           if (((localamj1.b() instanceof anm)) && (!(localamj2.b() instanceof anm)))
/* 331:    */           {
/* 332:365 */             k = 1;
/* 333:    */           }
/* 334:366 */           else if (((localamj1.b() instanceof anm)) && ((localamj2.b() instanceof anm)))
/* 335:    */           {
/* 336:367 */             localObject1 = (anm)localamj1.b();
/* 337:368 */             localObject2 = (anm)localamj2.b();
/* 338:370 */             if (((anm)localObject1).g() == ((anm)localObject2).g()) {
/* 339:371 */               k = (localamj1.i() > localamj2.i()) || ((localamj1.n()) && (!localamj2.n())) ? 1 : 0;
/* 340:    */             } else {
/* 341:373 */               k = ((anm)localObject1).g() > ((anm)localObject2).g() ? 1 : 0;
/* 342:    */             }
/* 343:    */           }
/* 344:375 */           else if (((localamj1.b() instanceof ajz)) && ((localamj2.b() instanceof ajz)))
/* 345:    */           {
/* 346:376 */             k = (localamj1.n()) && (!localamj2.n()) ? 1 : 0;
/* 347:    */           }
/* 348:    */           else
/* 349:    */           {
/* 350:378 */             k = 0;
/* 351:    */           }
/* 352:    */         }
/* 353:381 */         else if (((localamj1.b() instanceof ajn)) && (!(localamj2.b() instanceof ajn)))
/* 354:    */         {
/* 355:382 */           k = 1;
/* 356:    */         }
/* 357:383 */         else if (((localamj1.b() instanceof ajn)) && ((localamj2.b() instanceof ajn)))
/* 358:    */         {
/* 359:384 */           localObject1 = (ajn)localamj1.b();
/* 360:385 */           localObject2 = (ajn)localamj2.b();
/* 361:387 */           if (((ajn)localObject1).c == ((ajn)localObject2).c) {
/* 362:388 */             k = (localamj1.i() > localamj2.i()) || ((localamj1.n()) && (!localamj2.n())) ? 1 : 0;
/* 363:    */           } else {
/* 364:390 */             k = ((ajn)localObject1).c > ((ajn)localObject2).c ? 1 : 0;
/* 365:    */           }
/* 366:    */         }
/* 367:    */         else
/* 368:    */         {
/* 369:393 */           k = 0;
/* 370:    */         }
/* 371:    */       }
/* 372:398 */       if ((k != 0) && (a(localamj1)))
/* 373:    */       {
/* 374:399 */         if ((localamj2 != null) && (this.V.nextFloat() - 0.1F < this.bh[j])) {
/* 375:400 */           a(localamj2, 0.0F);
/* 376:    */         }
/* 377:403 */         if ((localamj1.b() == amk.i) && (paramadw.n() != null))
/* 378:    */         {
/* 379:404 */           localObject1 = this.o.a(paramadw.n());
/* 380:405 */           if (localObject1 != null) {
/* 381:406 */             ((ahd)localObject1).b(tl.x);
/* 382:    */           }
/* 383:    */         }
/* 384:410 */         c(j, localamj1);
/* 385:411 */         this.bh[j] = 2.0F;
/* 386:412 */         this.bl = true;
/* 387:413 */         a(paramadw, 1);
/* 388:414 */         paramadw.J();
/* 389:    */       }
/* 390:    */     }
/* 391:    */   }
/* 392:    */   
/* 393:    */   protected boolean a(amj paramamj)
/* 394:    */   {
/* 395:420 */     return true;
/* 396:    */   }
/* 397:    */   
/* 398:    */   protected boolean C()
/* 399:    */   {
/* 400:424 */     return true;
/* 401:    */   }
/* 402:    */   
/* 403:    */   protected void D()
/* 404:    */   {
/* 405:428 */     if (this.bl)
/* 406:    */     {
/* 407:429 */       this.aO = 0;
/* 408:430 */       return;
/* 409:    */     }
/* 410:433 */     ahd localahd = this.o.a(this, -1.0D);
/* 411:434 */     if (localahd != null)
/* 412:    */     {
/* 413:435 */       double d1 = localahd.s - this.s;
/* 414:436 */       double d2 = localahd.t - this.t;
/* 415:437 */       double d3 = localahd.u - this.u;
/* 416:438 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 417:440 */       if ((C()) && (d4 > 16384.0D)) {
/* 418:441 */         J();
/* 419:    */       }
/* 420:444 */       if ((this.aO > 600) && (this.V.nextInt(800) == 0) && (d4 > 1024.0D) && (C())) {
/* 421:445 */         J();
/* 422:446 */       } else if (d4 < 1024.0D) {
/* 423:447 */         this.aO = 0;
/* 424:    */       }
/* 425:    */     }
/* 426:    */   }
/* 427:    */   
/* 428:    */   protected final void bJ()
/* 429:    */   {
/* 430:455 */     this.aO += 1;
/* 431:456 */     this.o.B.a("checkDespawn");
/* 432:457 */     D();
/* 433:458 */     this.o.B.b();
/* 434:    */     
/* 435:460 */     this.o.B.a("sensing");
/* 436:461 */     this.bi.a();
/* 437:462 */     this.o.B.b();
/* 438:    */     
/* 439:464 */     this.o.B.a("targetSelector");
/* 440:465 */     this.bg.a();
/* 441:466 */     this.o.B.b();
/* 442:    */     
/* 443:468 */     this.o.B.a("goalSelector");
/* 444:469 */     this.i.a();
/* 445:470 */     this.o.B.b();
/* 446:    */     
/* 447:472 */     this.o.B.a("navigation");
/* 448:473 */     this.h.k();
/* 449:474 */     this.o.B.b();
/* 450:    */     
/* 451:476 */     this.o.B.a("mob tick");
/* 452:477 */     E();
/* 453:478 */     this.o.B.b();
/* 454:    */     
/* 455:480 */     this.o.B.a("controls");
/* 456:481 */     this.o.B.a("move");
/* 457:482 */     this.f.c();
/* 458:483 */     this.o.B.c("look");
/* 459:484 */     this.a.a();
/* 460:485 */     this.o.B.c("jump");
/* 461:486 */     this.g.b();
/* 462:487 */     this.o.B.b();
/* 463:488 */     this.o.B.b();
/* 464:    */   }
/* 465:    */   
/* 466:    */   protected void E() {}
/* 467:    */   
/* 468:    */   public int bP()
/* 469:    */   {
/* 470:495 */     return 40;
/* 471:    */   }
/* 472:    */   
/* 473:    */   public void a(wv paramwv, float paramFloat1, float paramFloat2)
/* 474:    */   {
/* 475:499 */     double d1 = paramwv.s - this.s;
/* 476:    */     
/* 477:501 */     double d3 = paramwv.u - this.u;
/* 478:    */     double d2;
/* 479:503 */     if ((paramwv instanceof xm))
/* 480:    */     {
/* 481:504 */       xm localxm = (xm)paramwv;
/* 482:505 */       d2 = localxm.t + localxm.aR() - (this.t + aR());
/* 483:    */     }
/* 484:    */     else
/* 485:    */     {
/* 486:507 */       d2 = (paramwv.aQ().b + paramwv.aQ().e) / 2.0D - (this.t + aR());
/* 487:    */     }
/* 488:510 */     double d4 = uv.a(d1 * d1 + d3 * d3);
/* 489:    */     
/* 490:512 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.141592741012573D) - 90.0F;
/* 491:513 */     float f2 = (float)-(Math.atan2(d2, d4) * 180.0D / 3.141592741012573D);
/* 492:514 */     this.z = b(this.z, f2, paramFloat2);
/* 493:515 */     this.y = b(this.y, f1, paramFloat1);
/* 494:    */   }
/* 495:    */   
/* 496:    */   private float b(float paramFloat1, float paramFloat2, float paramFloat3)
/* 497:    */   {
/* 498:519 */     float f1 = uv.g(paramFloat2 - paramFloat1);
/* 499:520 */     if (f1 > paramFloat3) {
/* 500:521 */       f1 = paramFloat3;
/* 501:    */     }
/* 502:523 */     if (f1 < -paramFloat3) {
/* 503:524 */       f1 = -paramFloat3;
/* 504:    */     }
/* 505:526 */     return paramFloat1 + f1;
/* 506:    */   }
/* 507:    */   
/* 508:    */   public boolean bQ()
/* 509:    */   {
/* 510:530 */     return true;
/* 511:    */   }
/* 512:    */   
/* 513:    */   public boolean bR()
/* 514:    */   {
/* 515:534 */     return (this.o.a(aQ(), this)) && (this.o.a(this, aQ()).isEmpty()) && (!this.o.d(aQ()));
/* 516:    */   }
/* 517:    */   
/* 518:    */   public float bS()
/* 519:    */   {
/* 520:539 */     return 1.0F;
/* 521:    */   }
/* 522:    */   
/* 523:    */   public int bU()
/* 524:    */   {
/* 525:547 */     return 4;
/* 526:    */   }
/* 527:    */   
/* 528:    */   public int aF()
/* 529:    */   {
/* 530:552 */     if (u() == null) {
/* 531:553 */       return 3;
/* 532:    */     }
/* 533:555 */     int j = (int)(bm() - bt() * 0.33F);
/* 534:556 */     j -= (3 - this.o.aa().a()) * 4;
/* 535:557 */     if (j < 0) {
/* 536:558 */       j = 0;
/* 537:    */     }
/* 538:560 */     return j + 3;
/* 539:    */   }
/* 540:    */   
/* 541:    */   public amj bz()
/* 542:    */   {
/* 543:565 */     return this.bj[0];
/* 544:    */   }
/* 545:    */   
/* 546:    */   public amj p(int paramInt)
/* 547:    */   {
/* 548:570 */     return this.bj[paramInt];
/* 549:    */   }
/* 550:    */   
/* 551:    */   public amj q(int paramInt)
/* 552:    */   {
/* 553:575 */     return this.bj[(paramInt + 1)];
/* 554:    */   }
/* 555:    */   
/* 556:    */   public void c(int paramInt, amj paramamj)
/* 557:    */   {
/* 558:580 */     this.bj[paramInt] = paramamj;
/* 559:    */   }
/* 560:    */   
/* 561:    */   public amj[] at()
/* 562:    */   {
/* 563:585 */     return this.bj;
/* 564:    */   }
/* 565:    */   
/* 566:    */   protected void a(boolean paramBoolean, int paramInt)
/* 567:    */   {
/* 568:590 */     for (int j = 0; j < at().length; j++)
/* 569:    */     {
/* 570:591 */       amj localamj = p(j);
/* 571:592 */       int k = this.bh[j] > 1.0F ? 1 : 0;
/* 572:594 */       if ((localamj != null) && ((paramBoolean) || (k != 0)) && (this.V.nextFloat() - paramInt * 0.01F < this.bh[j]))
/* 573:    */       {
/* 574:595 */         if ((k == 0) && (localamj.e()))
/* 575:    */         {
/* 576:596 */           int m = Math.max(localamj.j() - 25, 1);
/* 577:597 */           int n = localamj.j() - this.V.nextInt(this.V.nextInt(m) + 1);
/* 578:598 */           if (n > m) {
/* 579:599 */             n = m;
/* 580:    */           }
/* 581:601 */           if (n < 1) {
/* 582:602 */             n = 1;
/* 583:    */           }
/* 584:604 */           localamj.b(n);
/* 585:    */         }
/* 586:606 */         a(localamj, 0.0F);
/* 587:    */       }
/* 588:    */     }
/* 589:    */   }
/* 590:    */   
/* 591:    */   protected void a(vu paramvu)
/* 592:    */   {
/* 593:612 */     if (this.V.nextFloat() < 0.15F * paramvu.c())
/* 594:    */     {
/* 595:613 */       int j = this.V.nextInt(2);
/* 596:614 */       float f1 = this.o.aa() == vt.d ? 0.1F : 0.25F;
/* 597:615 */       if (this.V.nextFloat() < 0.095F) {
/* 598:616 */         j++;
/* 599:    */       }
/* 600:618 */       if (this.V.nextFloat() < 0.095F) {
/* 601:619 */         j++;
/* 602:    */       }
/* 603:621 */       if (this.V.nextFloat() < 0.095F) {
/* 604:622 */         j++;
/* 605:    */       }
/* 606:625 */       for (int k = 3; k >= 0; k--)
/* 607:    */       {
/* 608:626 */         amj localamj = q(k);
/* 609:627 */         if ((k < 3) && (this.V.nextFloat() < f1)) {
/* 610:    */           break;
/* 611:    */         }
/* 612:630 */         if (localamj == null)
/* 613:    */         {
/* 614:631 */           alq localalq = a(k + 1, j);
/* 615:632 */           if (localalq != null) {
/* 616:633 */             c(k + 1, new amj(localalq));
/* 617:    */           }
/* 618:    */         }
/* 619:    */       }
/* 620:    */     }
/* 621:    */   }
/* 622:    */   
/* 623:    */   public static int c(amj paramamj)
/* 624:    */   {
/* 625:641 */     if ((paramamj.b() == alq.a(aty.aU)) || (paramamj.b() == amk.bX)) {
/* 626:642 */       return 4;
/* 627:    */     }
/* 628:645 */     if ((paramamj.b() instanceof ajn)) {
/* 629:646 */       switch (((ajn)paramamj.b()).b)
/* 630:    */       {
/* 631:    */       case 3: 
/* 632:648 */         return 1;
/* 633:    */       case 2: 
/* 634:650 */         return 2;
/* 635:    */       case 1: 
/* 636:652 */         return 3;
/* 637:    */       case 0: 
/* 638:654 */         return 4;
/* 639:    */       }
/* 640:    */     }
/* 641:658 */     return 0;
/* 642:    */   }
/* 643:    */   
/* 644:    */   public static alq a(int paramInt1, int paramInt2)
/* 645:    */   {
/* 646:662 */     switch (paramInt1)
/* 647:    */     {
/* 648:    */     case 4: 
/* 649:664 */       if (paramInt2 == 0) {
/* 650:665 */         return amk.Q;
/* 651:    */       }
/* 652:667 */       if (paramInt2 == 1) {
/* 653:668 */         return amk.ag;
/* 654:    */       }
/* 655:670 */       if (paramInt2 == 2) {
/* 656:671 */         return amk.U;
/* 657:    */       }
/* 658:673 */       if (paramInt2 == 3) {
/* 659:674 */         return amk.Y;
/* 660:    */       }
/* 661:676 */       if (paramInt2 == 4) {
/* 662:677 */         return amk.ac;
/* 663:    */       }
/* 664:    */     case 3: 
/* 665:680 */       if (paramInt2 == 0) {
/* 666:681 */         return amk.R;
/* 667:    */       }
/* 668:683 */       if (paramInt2 == 1) {
/* 669:684 */         return amk.ah;
/* 670:    */       }
/* 671:686 */       if (paramInt2 == 2) {
/* 672:687 */         return amk.V;
/* 673:    */       }
/* 674:689 */       if (paramInt2 == 3) {
/* 675:690 */         return amk.Z;
/* 676:    */       }
/* 677:692 */       if (paramInt2 == 4) {
/* 678:693 */         return amk.ad;
/* 679:    */       }
/* 680:    */     case 2: 
/* 681:696 */       if (paramInt2 == 0) {
/* 682:697 */         return amk.S;
/* 683:    */       }
/* 684:699 */       if (paramInt2 == 1) {
/* 685:700 */         return amk.ai;
/* 686:    */       }
/* 687:702 */       if (paramInt2 == 2) {
/* 688:703 */         return amk.W;
/* 689:    */       }
/* 690:705 */       if (paramInt2 == 3) {
/* 691:706 */         return amk.aa;
/* 692:    */       }
/* 693:708 */       if (paramInt2 == 4) {
/* 694:709 */         return amk.ae;
/* 695:    */       }
/* 696:    */     case 1: 
/* 697:712 */       if (paramInt2 == 0) {
/* 698:713 */         return amk.T;
/* 699:    */       }
/* 700:715 */       if (paramInt2 == 1) {
/* 701:716 */         return amk.aj;
/* 702:    */       }
/* 703:718 */       if (paramInt2 == 2) {
/* 704:719 */         return amk.X;
/* 705:    */       }
/* 706:721 */       if (paramInt2 == 3) {
/* 707:722 */         return amk.ab;
/* 708:    */       }
/* 709:724 */       if (paramInt2 == 4) {
/* 710:725 */         return amk.af;
/* 711:    */       }
/* 712:    */       break;
/* 713:    */     }
/* 714:729 */     return null;
/* 715:    */   }
/* 716:    */   
/* 717:    */   protected void b(vu paramvu)
/* 718:    */   {
/* 719:733 */     float f1 = paramvu.c();
/* 720:735 */     if ((bz() != null) && (this.V.nextFloat() < 0.25F * f1)) {
/* 721:736 */       aph.a(this.V, bz(), (int)(5.0F + f1 * this.V.nextInt(18)));
/* 722:    */     }
/* 723:739 */     for (int j = 0; j < 4; j++)
/* 724:    */     {
/* 725:740 */       amj localamj = q(j);
/* 726:741 */       if ((localamj != null) && (this.V.nextFloat() < 0.5F * f1)) {
/* 727:742 */         aph.a(this.V, localamj, (int)(5.0F + f1 * this.V.nextInt(18)));
/* 728:    */       }
/* 729:    */     }
/* 730:    */   }
/* 731:    */   
/* 732:    */   public xq a(vu paramvu, xq paramxq)
/* 733:    */   {
/* 734:760 */     a(afs.b).b(new ya("Random spawn bonus", this.V.nextGaussian() * 0.05D, 1));
/* 735:    */     
/* 736:762 */     return paramxq;
/* 737:    */   }
/* 738:    */   
/* 739:    */   public boolean bV()
/* 740:    */   {
/* 741:766 */     return false;
/* 742:    */   }
/* 743:    */   
/* 744:    */   public void bW()
/* 745:    */   {
/* 746:770 */     this.bl = true;
/* 747:    */   }
/* 748:    */   
/* 749:    */   public void a(int paramInt, float paramFloat)
/* 750:    */   {
/* 751:774 */     this.bh[paramInt] = paramFloat;
/* 752:    */   }
/* 753:    */   
/* 754:    */   public boolean bX()
/* 755:    */   {
/* 756:778 */     return this.bk;
/* 757:    */   }
/* 758:    */   
/* 759:    */   public void j(boolean paramBoolean)
/* 760:    */   {
/* 761:782 */     this.bk = paramBoolean;
/* 762:    */   }
/* 763:    */   
/* 764:    */   public boolean bY()
/* 765:    */   {
/* 766:786 */     return this.bl;
/* 767:    */   }
/* 768:    */   
/* 769:    */   public final boolean e(ahd paramahd)
/* 770:    */   {
/* 771:791 */     if ((cb()) && (cc() == paramahd))
/* 772:    */     {
/* 773:792 */       a(true, !paramahd.by.d);
/* 774:793 */       return true;
/* 775:    */     }
/* 776:796 */     amj localamj = paramahd.bg.h();
/* 777:797 */     if (localamj != null) {
/* 778:801 */       if ((localamj.b() == amk.cn) && 
/* 779:802 */         (ca())) {
/* 780:803 */         if (((this instanceof xx)) && (((xx)this).cj()))
/* 781:    */         {
/* 782:804 */           if (((xx)this).e(paramahd))
/* 783:    */           {
/* 784:805 */             a(paramahd, true);
/* 785:806 */             localamj.b -= 1;
/* 786:807 */             return true;
/* 787:    */           }
/* 788:    */         }
/* 789:    */         else
/* 790:    */         {
/* 791:810 */           a(paramahd, true);
/* 792:811 */           localamj.b -= 1;
/* 793:812 */           return true;
/* 794:    */         }
/* 795:    */       }
/* 796:    */     }
/* 797:818 */     if (a(paramahd)) {
/* 798:819 */       return true;
/* 799:    */     }
/* 800:822 */     return super.e(paramahd);
/* 801:    */   }
/* 802:    */   
/* 803:    */   protected boolean a(ahd paramahd)
/* 804:    */   {
/* 805:826 */     return false;
/* 806:    */   }
/* 807:    */   
/* 808:    */   protected void bZ()
/* 809:    */   {
/* 810:836 */     if (this.bo != null) {
/* 811:837 */       n();
/* 812:    */     }
/* 813:839 */     if (!this.bm) {
/* 814:840 */       return;
/* 815:    */     }
/* 816:842 */     if (!ai()) {
/* 817:843 */       a(true, true);
/* 818:    */     }
/* 819:846 */     if ((this.bn == null) || (this.bn.I))
/* 820:    */     {
/* 821:847 */       a(true, true);
/* 822:848 */       return;
/* 823:    */     }
/* 824:    */   }
/* 825:    */   
/* 826:    */   public void a(boolean paramBoolean1, boolean paramBoolean2)
/* 827:    */   {
/* 828:853 */     if (this.bm)
/* 829:    */     {
/* 830:854 */       this.bm = false;
/* 831:855 */       this.bn = null;
/* 832:856 */       if ((!this.o.D) && (paramBoolean2)) {
/* 833:857 */         a(amk.cn, 1);
/* 834:    */       }
/* 835:860 */       if ((!this.o.D) && (paramBoolean1) && ((this.o instanceof qt))) {
/* 836:861 */         ((qt)this.o).s().a(this, new ky(1, this, null));
/* 837:    */       }
/* 838:    */     }
/* 839:    */   }
/* 840:    */   
/* 841:    */   public boolean ca()
/* 842:    */   {
/* 843:867 */     return (!cb()) && (!(this instanceof aex));
/* 844:    */   }
/* 845:    */   
/* 846:    */   public boolean cb()
/* 847:    */   {
/* 848:871 */     return this.bm;
/* 849:    */   }
/* 850:    */   
/* 851:    */   public wv cc()
/* 852:    */   {
/* 853:875 */     return this.bn;
/* 854:    */   }
/* 855:    */   
/* 856:    */   public void a(wv paramwv, boolean paramBoolean)
/* 857:    */   {
/* 858:879 */     this.bm = true;
/* 859:880 */     this.bn = paramwv;
/* 860:882 */     if ((!this.o.D) && (paramBoolean) && ((this.o instanceof qt))) {
/* 861:883 */       ((qt)this.o).s().a(this, new ky(1, this, this.bn));
/* 862:    */     }
/* 863:    */   }
/* 864:    */   
/* 865:    */   private void n()
/* 866:    */   {
/* 867:889 */     if ((this.bm) && (this.bo != null))
/* 868:    */     {
/* 869:    */       Object localObject1;
/* 870:    */       Object localObject2;
/* 871:890 */       if ((this.bo.b("UUIDMost", 4)) && (this.bo.b("UUIDLeast", 4)))
/* 872:    */       {
/* 873:891 */         localObject1 = new UUID(this.bo.g("UUIDMost"), this.bo.g("UUIDLeast"));
/* 874:892 */         localObject2 = this.o.a(xm.class, aQ().b(10.0D, 10.0D, 10.0D));
/* 875:893 */         for (xm localxm : (List)localObject2) {
/* 876:894 */           if (localxm.aJ().equals(localObject1))
/* 877:    */           {
/* 878:895 */             this.bn = localxm;
/* 879:896 */             break;
/* 880:    */           }
/* 881:    */         }
/* 882:    */       }
/* 883:899 */       else if ((this.bo.b("X", 99)) && (this.bo.b("Y", 99)) && (this.bo.b("Z", 99)))
/* 884:    */       {
/* 885:900 */         localObject1 = new dt(this.bo.f("X"), this.bo.f("Y"), this.bo.f("Z"));
/* 886:    */         
/* 887:902 */         localObject2 = adl.b(this.o, (dt)localObject1);
/* 888:903 */         if (localObject2 == null) {
/* 889:904 */           localObject2 = adl.a(this.o, (dt)localObject1);
/* 890:    */         }
/* 891:906 */         this.bn = ((wv)localObject2);
/* 892:    */       }
/* 893:    */       else
/* 894:    */       {
/* 895:909 */         a(false, true);
/* 896:    */       }
/* 897:    */     }
/* 898:912 */     this.bo = null;
/* 899:    */   }
/* 900:    */   
/* 901:    */   public boolean d(int paramInt, amj paramamj)
/* 902:    */   {
/* 903:    */     int j;
/* 904:918 */     if (paramInt == 99)
/* 905:    */     {
/* 906:919 */       j = 0;
/* 907:    */     }
/* 908:    */     else
/* 909:    */     {
/* 910:921 */       j = paramInt - 100 + 1;
/* 911:922 */       if ((j < 0) || (j >= this.bj.length)) {
/* 912:923 */         return false;
/* 913:    */       }
/* 914:    */     }
/* 915:926 */     if ((paramamj == null) || (c(paramamj) == j) || ((j == 4) && ((paramamj.b() instanceof aju))))
/* 916:    */     {
/* 917:927 */       c(j, paramamj);
/* 918:928 */       return true;
/* 919:    */     }
/* 920:930 */     return false;
/* 921:    */   }
/* 922:    */   
/* 923:    */   public boolean bL()
/* 924:    */   {
/* 925:935 */     return (super.bL()) && (!cd());
/* 926:    */   }
/* 927:    */   
/* 928:    */   protected void k(boolean paramBoolean)
/* 929:    */   {
/* 930:939 */     this.ac.b(15, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 931:    */   }
/* 932:    */   
/* 933:    */   private boolean cd()
/* 934:    */   {
/* 935:943 */     return this.ac.a(15) != 0;
/* 936:    */   }
/* 937:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     xn
 * JD-Core Version:    0.7.0.1
 */