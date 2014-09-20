/*   1:    */ import java.util.Calendar;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ import java.util.UUID;
/*   5:    */ 
/*   6:    */ public class agj
/*   7:    */   extends afm
/*   8:    */ {
/*   9: 43 */   protected static final xy b = new yg(null, "zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D).a("Spawn Reinforcements Chance");
/*  10: 44 */   private static final UUID c = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
/*  11: 45 */   private static final ya bk = new ya(c, "Baby speed boost", 0.5D, 1);
/*  12: 58 */   private final ys bl = new ys(this);
/*  13:    */   private int bm;
/*  14: 60 */   private boolean bn = false;
/*  15:    */   
/*  16:    */   public agj(aqu paramaqu)
/*  17:    */   {
/*  18: 63 */     super(paramaqu);
/*  19:    */     
/*  20: 65 */     ((aay)s()).b(true);
/*  21: 66 */     this.i.a(0, new yy(this));
/*  22: 67 */     this.i.a(2, new zk(this, ahd.class, 1.0D, false));
/*  23: 68 */     this.i.a(2, this.a);
/*  24: 69 */     this.i.a(5, new zo(this, 1.0D));
/*  25: 70 */     this.i.a(7, new zy(this, 1.0D));
/*  26: 71 */     this.i.a(8, new zh(this, ahd.class, 8.0F));
/*  27: 72 */     this.i.a(8, new zx(this));
/*  28:    */     
/*  29: 74 */     n();
/*  30:    */     
/*  31: 76 */     a(0.6F, 1.95F);
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void n()
/*  35:    */   {
/*  36: 83 */     this.i.a(4, new zk(this, agp.class, 1.0D, true));
/*  37: 84 */     this.i.a(4, new zk(this, acq.class, 1.0D, true));
/*  38: 85 */     this.i.a(6, new zm(this, 1.0D, false));
/*  39:    */     
/*  40: 87 */     this.bg.a(1, new aal(this, true, new Class[] { afo.class }));
/*  41: 88 */     this.bg.a(2, new aaq(this, ahd.class, true));
/*  42: 89 */     this.bg.a(2, new aaq(this, agp.class, false));
/*  43: 90 */     this.bg.a(2, new aaq(this, acq.class, true));
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected void aW()
/*  47:    */   {
/*  48: 95 */     super.aW();
/*  49:    */     
/*  50: 97 */     a(afs.b).a(35.0D);
/*  51: 98 */     a(afs.d).a(0.2300000041723251D);
/*  52: 99 */     a(afs.e).a(3.0D);
/*  53:    */     
/*  54:101 */     bx().b(b).a(this.V.nextDouble() * 0.1000000014901161D);
/*  55:    */   }
/*  56:    */   
/*  57:    */   protected void h()
/*  58:    */   {
/*  59:106 */     super.h();
/*  60:    */     
/*  61:108 */     H().a(12, Byte.valueOf((byte)0));
/*  62:109 */     H().a(13, Byte.valueOf((byte)0));
/*  63:110 */     H().a(14, Byte.valueOf((byte)0));
/*  64:    */   }
/*  65:    */   
/*  66:    */   public int bq()
/*  67:    */   {
/*  68:115 */     int i = super.bq() + 2;
/*  69:116 */     if (i > 20) {
/*  70:117 */       i = 20;
/*  71:    */     }
/*  72:119 */     return i;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean cl()
/*  76:    */   {
/*  77:123 */     return this.bn;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void a(boolean paramBoolean)
/*  81:    */   {
/*  82:127 */     if (this.bn != paramBoolean)
/*  83:    */     {
/*  84:128 */       this.bn = paramBoolean;
/*  85:130 */       if (paramBoolean) {
/*  86:131 */         this.i.a(1, this.bl);
/*  87:    */       } else {
/*  88:133 */         this.i.a(this.bl);
/*  89:    */       }
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   public boolean i_()
/*  94:    */   {
/*  95:140 */     return H().a(12) == 1;
/*  96:    */   }
/*  97:    */   
/*  98:    */   protected int b(ahd paramahd)
/*  99:    */   {
/* 100:145 */     if (i_()) {
/* 101:146 */       this.b_ = ((int)(this.b_ * 2.5F));
/* 102:    */     }
/* 103:149 */     return super.b(paramahd);
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void l(boolean paramBoolean)
/* 107:    */   {
/* 108:153 */     H().b(12, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 109:155 */     if ((this.o != null) && (!this.o.D))
/* 110:    */     {
/* 111:156 */       xz localxz = a(afs.d);
/* 112:157 */       localxz.c(bk);
/* 113:158 */       if (paramBoolean) {
/* 114:159 */         localxz.b(bk);
/* 115:    */       }
/* 116:    */     }
/* 117:163 */     n(paramBoolean);
/* 118:    */   }
/* 119:    */   
/* 120:    */   public boolean cm()
/* 121:    */   {
/* 122:167 */     return H().a(13) == 1;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void m(boolean paramBoolean)
/* 126:    */   {
/* 127:171 */     H().b(13, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void m()
/* 131:    */   {
/* 132:176 */     if ((this.o.w()) && (!this.o.D) && (!i_()))
/* 133:    */     {
/* 134:177 */       float f = c(1.0F);
/* 135:178 */       dt localdt = new dt(this.s, Math.round(this.t), this.u);
/* 136:179 */       if ((f > 0.5F) && (this.V.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) && (this.o.i(localdt)))
/* 137:    */       {
/* 138:180 */         int i = 1;
/* 139:    */         
/* 140:182 */         amj localamj = p(4);
/* 141:183 */         if (localamj != null)
/* 142:    */         {
/* 143:184 */           if (localamj.e())
/* 144:    */           {
/* 145:185 */             localamj.b(localamj.h() + this.V.nextInt(2));
/* 146:186 */             if (localamj.h() >= localamj.j())
/* 147:    */             {
/* 148:187 */               b(localamj);
/* 149:188 */               c(4, null);
/* 150:    */             }
/* 151:    */           }
/* 152:192 */           i = 0;
/* 153:    */         }
/* 154:195 */         if (i != 0) {
/* 155:196 */           e(8);
/* 156:    */         }
/* 157:    */       }
/* 158:    */     }
/* 159:200 */     if ((av()) && (u() != null) && ((this.m instanceof abr))) {
/* 160:201 */       ((xn)this.m).s().a(s().j(), 1.5D);
/* 161:    */     }
/* 162:203 */     super.m();
/* 163:    */   }
/* 164:    */   
/* 165:    */   public boolean a(wh paramwh, float paramFloat)
/* 166:    */   {
/* 167:208 */     if (super.a(paramwh, paramFloat))
/* 168:    */     {
/* 169:209 */       xm localxm = u();
/* 170:210 */       if ((localxm == null) && ((paramwh.j() instanceof xm))) {
/* 171:211 */         localxm = (xm)paramwh.j();
/* 172:    */       }
/* 173:214 */       if ((localxm != null) && (this.o.aa() == vt.d) && (this.V.nextFloat() < a(b).e()))
/* 174:    */       {
/* 175:215 */         int i = uv.c(this.s);
/* 176:216 */         int j = uv.c(this.t);
/* 177:217 */         int k = uv.c(this.u);
/* 178:218 */         agj localagj = new agj(this.o);
/* 179:220 */         for (int m = 0; m < 50; m++)
/* 180:    */         {
/* 181:221 */           int n = i + uv.a(this.V, 7, 40) * uv.a(this.V, -1, 1);
/* 182:222 */           int i1 = j + uv.a(this.V, 7, 40) * uv.a(this.V, -1, 1);
/* 183:223 */           int i2 = k + uv.a(this.V, 7, 40) * uv.a(this.V, -1, 1);
/* 184:225 */           if ((aqu.a(this.o, new dt(n, i1 - 1, i2))) && (this.o.l(new dt(n, i1, i2)) < 10))
/* 185:    */           {
/* 186:226 */             localagj.b(n, i1, i2);
/* 187:228 */             if ((!this.o.b(n, i1, i2, 7.0D)) && (this.o.a(localagj.aQ(), localagj)) && (this.o.a(localagj, localagj.aQ()).isEmpty()) && (!this.o.d(localagj.aQ())))
/* 188:    */             {
/* 189:229 */               this.o.d(localagj);
/* 190:230 */               localagj.d(localxm);
/* 191:231 */               localagj.a(this.o.E(new dt(localagj)), null);
/* 192:    */               
/* 193:233 */               a(b).b(new ya("Zombie reinforcement caller charge", -0.0500000007450581D, 0));
/* 194:234 */               localagj.a(b).b(new ya("Zombie reinforcement callee charge", -0.0500000007450581D, 0));
/* 195:235 */               break;
/* 196:    */             }
/* 197:    */           }
/* 198:    */         }
/* 199:    */       }
/* 200:241 */       return true;
/* 201:    */     }
/* 202:244 */     return false;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void s_()
/* 206:    */   {
/* 207:249 */     if ((!this.o.D) && (cn()))
/* 208:    */     {
/* 209:250 */       int i = cp();
/* 210:    */       
/* 211:252 */       this.bm -= i;
/* 212:254 */       if (this.bm <= 0) {
/* 213:255 */         co();
/* 214:    */       }
/* 215:    */     }
/* 216:259 */     super.s_();
/* 217:    */   }
/* 218:    */   
/* 219:    */   public boolean r(wv paramwv)
/* 220:    */   {
/* 221:264 */     boolean bool = super.r(paramwv);
/* 222:266 */     if (bool)
/* 223:    */     {
/* 224:267 */       int i = this.o.aa().a();
/* 225:268 */       if ((bz() == null) && (au()) && (this.V.nextFloat() < i * 0.3F)) {
/* 226:269 */         paramwv.e(2 * i);
/* 227:    */       }
/* 228:    */     }
/* 229:273 */     return bool;
/* 230:    */   }
/* 231:    */   
/* 232:    */   protected String z()
/* 233:    */   {
/* 234:278 */     return "mob.zombie.say";
/* 235:    */   }
/* 236:    */   
/* 237:    */   protected String bn()
/* 238:    */   {
/* 239:283 */     return "mob.zombie.hurt";
/* 240:    */   }
/* 241:    */   
/* 242:    */   protected String bo()
/* 243:    */   {
/* 244:288 */     return "mob.zombie.death";
/* 245:    */   }
/* 246:    */   
/* 247:    */   protected void a(dt paramdt, atr paramatr)
/* 248:    */   {
/* 249:293 */     a("mob.zombie.step", 0.15F, 1.0F);
/* 250:    */   }
/* 251:    */   
/* 252:    */   protected alq A()
/* 253:    */   {
/* 254:298 */     return amk.bt;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public xs by()
/* 258:    */   {
/* 259:303 */     return xs.b;
/* 260:    */   }
/* 261:    */   
/* 262:    */   protected void bp()
/* 263:    */   {
/* 264:308 */     switch (this.V.nextInt(3))
/* 265:    */     {
/* 266:    */     case 0: 
/* 267:310 */       a(amk.j, 1);
/* 268:311 */       break;
/* 269:    */     case 1: 
/* 270:313 */       a(amk.bR, 1);
/* 271:314 */       break;
/* 272:    */     case 2: 
/* 273:316 */       a(amk.bS, 1);
/* 274:    */     }
/* 275:    */   }
/* 276:    */   
/* 277:    */   protected void a(vu paramvu)
/* 278:    */   {
/* 279:323 */     super.a(paramvu);
/* 280:325 */     if (this.V.nextFloat() < (this.o.aa() == vt.d ? 0.05F : 0.01F))
/* 281:    */     {
/* 282:326 */       int i = this.V.nextInt(3);
/* 283:327 */       if (i == 0) {
/* 284:328 */         c(0, new amj(amk.l));
/* 285:    */       } else {
/* 286:330 */         c(0, new amj(amk.a));
/* 287:    */       }
/* 288:    */     }
/* 289:    */   }
/* 290:    */   
/* 291:    */   public void b(fn paramfn)
/* 292:    */   {
/* 293:337 */     super.b(paramfn);
/* 294:339 */     if (i_()) {
/* 295:340 */       paramfn.a("IsBaby", true);
/* 296:    */     }
/* 297:342 */     if (cm()) {
/* 298:343 */       paramfn.a("IsVillager", true);
/* 299:    */     }
/* 300:345 */     paramfn.a("ConversionTime", cn() ? this.bm : -1);
/* 301:346 */     paramfn.a("CanBreakDoors", cl());
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void a(fn paramfn)
/* 305:    */   {
/* 306:351 */     super.a(paramfn);
/* 307:353 */     if (paramfn.n("IsBaby")) {
/* 308:354 */       l(true);
/* 309:    */     }
/* 310:356 */     if (paramfn.n("IsVillager")) {
/* 311:357 */       m(true);
/* 312:    */     }
/* 313:359 */     if ((paramfn.b("ConversionTime", 99)) && (paramfn.f("ConversionTime") > -1)) {
/* 314:360 */       a(paramfn.f("ConversionTime"));
/* 315:    */     }
/* 316:362 */     a(paramfn.n("CanBreakDoors"));
/* 317:    */   }
/* 318:    */   
/* 319:    */   public void a(xm paramxm)
/* 320:    */   {
/* 321:367 */     super.a(paramxm);
/* 322:369 */     if (((this.o.aa() == vt.c) || (this.o.aa() == vt.d)) && ((paramxm instanceof agp)))
/* 323:    */     {
/* 324:370 */       if ((this.o.aa() != vt.d) && (this.V.nextBoolean())) {
/* 325:371 */         return;
/* 326:    */       }
/* 327:374 */       agj localagj = new agj(this.o);
/* 328:375 */       localagj.m(paramxm);
/* 329:376 */       this.o.e(paramxm);
/* 330:377 */       localagj.a(this.o.E(new dt(localagj)), null);
/* 331:378 */       localagj.m(true);
/* 332:379 */       if (paramxm.i_()) {
/* 333:380 */         localagj.l(true);
/* 334:    */       }
/* 335:382 */       this.o.d(localagj);
/* 336:    */       
/* 337:384 */       this.o.a(null, 1016, new dt((int)this.s, (int)this.t, (int)this.u), 0);
/* 338:    */     }
/* 339:    */   }
/* 340:    */   
/* 341:    */   public float aR()
/* 342:    */   {
/* 343:390 */     float f = 1.74F;
/* 344:391 */     if (i_()) {
/* 345:392 */       f = (float)(f - 0.8100000000000001D);
/* 346:    */     }
/* 347:394 */     return f;
/* 348:    */   }
/* 349:    */   
/* 350:    */   protected boolean a(amj paramamj)
/* 351:    */   {
/* 352:399 */     if ((paramamj.b() == amk.aP) && (i_()) && (av())) {
/* 353:400 */       return false;
/* 354:    */     }
/* 355:402 */     return super.a(paramamj);
/* 356:    */   }
/* 357:    */   
/* 358:    */   public xq a(vu paramvu, xq paramxq)
/* 359:    */   {
/* 360:408 */     paramxq = super.a(paramvu, paramxq);
/* 361:409 */     float f = paramvu.c();
/* 362:    */     
/* 363:411 */     j(this.V.nextFloat() < 0.55F * f);
/* 364:413 */     if (paramxq == null) {
/* 365:414 */       paramxq = new agl(this, this.o.s.nextFloat() < 0.05F, this.o.s.nextFloat() < 0.05F, null);
/* 366:    */     }
/* 367:    */     Object localObject1;
/* 368:417 */     if ((paramxq instanceof agl))
/* 369:    */     {
/* 370:418 */       localObject1 = (agl)paramxq;
/* 371:420 */       if (((agl)localObject1).b) {
/* 372:421 */         m(true);
/* 373:    */       }
/* 374:424 */       if (((agl)localObject1).a)
/* 375:    */       {
/* 376:425 */         l(true);
/* 377:    */         Object localObject2;
/* 378:427 */         if (this.o.s.nextFloat() < 0.05D)
/* 379:    */         {
/* 380:428 */           localObject2 = this.o.a(abr.class, aQ().b(5.0D, 3.0D, 5.0D), xe.b);
/* 381:430 */           if (!((List)localObject2).isEmpty())
/* 382:    */           {
/* 383:431 */             abr localabr = (abr)((List)localObject2).get(0);
/* 384:432 */             localabr.l(true);
/* 385:433 */             a(localabr);
/* 386:    */           }
/* 387:    */         }
/* 388:435 */         else if (this.o.s.nextFloat() < 0.05D)
/* 389:    */         {
/* 390:436 */           localObject2 = new abr(this.o);
/* 391:437 */           ((abr)localObject2).b(this.s, this.t, this.u, this.y, 0.0F);
/* 392:438 */           ((abr)localObject2).a(paramvu, null);
/* 393:439 */           ((abr)localObject2).l(true);
/* 394:440 */           this.o.d((wv)localObject2);
/* 395:441 */           a((wv)localObject2);
/* 396:    */         }
/* 397:    */       }
/* 398:    */     }
/* 399:446 */     a(this.V.nextFloat() < f * 0.1F);
/* 400:    */     
/* 401:448 */     a(paramvu);
/* 402:449 */     b(paramvu);
/* 403:451 */     if (p(4) == null)
/* 404:    */     {
/* 405:452 */       localObject1 = this.o.Y();
/* 406:455 */       if ((((Calendar)localObject1).get(2) + 1 == 10) && (((Calendar)localObject1).get(5) == 31) && (this.V.nextFloat() < 0.25F))
/* 407:    */       {
/* 408:457 */         c(4, new amj(this.V.nextFloat() < 0.1F ? aty.aZ : aty.aU));
/* 409:458 */         this.bh[4] = 0.0F;
/* 410:    */       }
/* 411:    */     }
/* 412:462 */     a(afs.c).b(new ya("Random spawn bonus", this.V.nextDouble() * 0.0500000007450581D, 0));
/* 413:463 */     double d = this.V.nextDouble() * 1.5D * f;
/* 414:464 */     if (d > 1.0D) {
/* 415:465 */       a(afs.b).b(new ya("Random zombie-spawn bonus", d, 2));
/* 416:    */     }
/* 417:468 */     if (this.V.nextFloat() < f * 0.05F)
/* 418:    */     {
/* 419:469 */       a(b).b(new ya("Leader zombie bonus", this.V.nextDouble() * 0.25D + 0.5D, 0));
/* 420:470 */       a(afs.a).b(new ya("Leader zombie bonus", this.V.nextDouble() * 3.0D + 1.0D, 2));
/* 421:471 */       a(true);
/* 422:    */     }
/* 423:474 */     return paramxq;
/* 424:    */   }
/* 425:    */   
/* 426:    */   public boolean a(ahd paramahd)
/* 427:    */   {
/* 428:479 */     amj localamj = paramahd.bY();
/* 429:481 */     if ((localamj != null) && (localamj.b() == amk.ao) && (localamj.i() == 0) && (cm()) && (a(wp.t)))
/* 430:    */     {
/* 431:482 */       if (!paramahd.by.d) {
/* 432:483 */         localamj.b -= 1;
/* 433:    */       }
/* 434:485 */       if (localamj.b <= 0) {
/* 435:486 */         paramahd.bg.a(paramahd.bg.c, null);
/* 436:    */       }
/* 437:489 */       if (!this.o.D) {
/* 438:490 */         a(this.V.nextInt(2401) + 3600);
/* 439:    */       }
/* 440:493 */       return true;
/* 441:    */     }
/* 442:496 */     return false;
/* 443:    */   }
/* 444:    */   
/* 445:    */   protected void a(int paramInt)
/* 446:    */   {
/* 447:500 */     this.bm = paramInt;
/* 448:501 */     H().b(14, Byte.valueOf((byte)1));
/* 449:    */     
/* 450:503 */     m(wp.t.H);
/* 451:504 */     c(new wq(wp.g.H, paramInt, Math.min(this.o.aa().a() - 1, 0)));
/* 452:    */     
/* 453:506 */     this.o.a(this, (byte)16);
/* 454:    */   }
/* 455:    */   
/* 456:    */   public void a(byte paramByte)
/* 457:    */   {
/* 458:511 */     if (paramByte == 16)
/* 459:    */     {
/* 460:512 */       if (!R()) {
/* 461:513 */         this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "mob.zombie.remedy", 1.0F + this.V.nextFloat(), this.V.nextFloat() * 0.7F + 0.3F, false);
/* 462:    */       }
/* 463:    */     }
/* 464:    */     else {
/* 465:516 */       super.a(paramByte);
/* 466:    */     }
/* 467:    */   }
/* 468:    */   
/* 469:    */   protected boolean C()
/* 470:    */   {
/* 471:522 */     return !cn();
/* 472:    */   }
/* 473:    */   
/* 474:    */   public boolean cn()
/* 475:    */   {
/* 476:526 */     return H().a(14) == 1;
/* 477:    */   }
/* 478:    */   
/* 479:    */   protected void co()
/* 480:    */   {
/* 481:530 */     agp localagp = new agp(this.o);
/* 482:531 */     localagp.m(this);
/* 483:532 */     localagp.a(this.o.E(new dt(localagp)), null);
/* 484:533 */     localagp.cn();
/* 485:534 */     if (i_()) {
/* 486:535 */       localagp.b(-24000);
/* 487:    */     }
/* 488:537 */     this.o.e(this);
/* 489:538 */     this.o.d(localagp);
/* 490:    */     
/* 491:540 */     localagp.c(new wq(wp.k.H, 200, 0));
/* 492:541 */     this.o.a(null, 1017, new dt((int)this.s, (int)this.t, (int)this.u), 0);
/* 493:    */   }
/* 494:    */   
/* 495:    */   protected int cp()
/* 496:    */   {
/* 497:545 */     int i = 1;
/* 498:547 */     if (this.V.nextFloat() < 0.01F)
/* 499:    */     {
/* 500:548 */       int j = 0;
/* 501:550 */       for (int k = (int)this.s - 4; (k < (int)this.s + 4) && (j < 14); k++) {
/* 502:551 */         for (int m = (int)this.t - 4; (m < (int)this.t + 4) && (j < 14); m++) {
/* 503:552 */           for (int n = (int)this.u - 4; (n < (int)this.u + 4) && (j < 14); n++)
/* 504:    */           {
/* 505:553 */             atr localatr = this.o.p(new dt(k, m, n)).c();
/* 506:554 */             if ((localatr == aty.bi) || (localatr == aty.C))
/* 507:    */             {
/* 508:555 */               if (this.V.nextFloat() < 0.3F) {
/* 509:556 */                 i++;
/* 510:    */               }
/* 511:558 */               j++;
/* 512:    */             }
/* 513:    */           }
/* 514:    */         }
/* 515:    */       }
/* 516:    */     }
/* 517:564 */     return i;
/* 518:    */   }
/* 519:    */   
/* 520:    */   public void n(boolean paramBoolean)
/* 521:    */   {
/* 522:579 */     a(paramBoolean ? 0.5F : 1.0F);
/* 523:    */   }
/* 524:    */   
/* 525:582 */   private float bo = -1.0F;
/* 526:    */   private float bp;
/* 527:    */   
/* 528:    */   protected final void a(float paramFloat1, float paramFloat2)
/* 529:    */   {
/* 530:587 */     int i = (this.bo > 0.0F) && (this.bp > 0.0F) ? 1 : 0;
/* 531:    */     
/* 532:589 */     this.bo = paramFloat1;
/* 533:590 */     this.bp = paramFloat2;
/* 534:592 */     if (i == 0) {
/* 535:593 */       a(1.0F);
/* 536:    */     }
/* 537:    */   }
/* 538:    */   
/* 539:    */   protected final void a(float paramFloat)
/* 540:    */   {
/* 541:598 */     super.a(this.bo * paramFloat, this.bp * paramFloat);
/* 542:    */   }
/* 543:    */   
/* 544:    */   public double am()
/* 545:    */   {
/* 546:603 */     return super.am() - 0.5D;
/* 547:    */   }
/* 548:    */   
/* 549:    */   public void a(wh paramwh)
/* 550:    */   {
/* 551:608 */     super.a(paramwh);
/* 552:610 */     if (((paramwh.j() instanceof aep)) && (!(this instanceof afo)) && 
/* 553:611 */       (((aep)paramwh.j()).n()) && (((aep)paramwh.j()).cn()))
/* 554:    */     {
/* 555:612 */       ((aep)paramwh.j()).co();
/* 556:613 */       a(new amj(amk.bX, 1, 2), 0.0F);
/* 557:    */     }
/* 558:    */   }
/* 559:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     agj
 * JD-Core Version:    0.7.0.1
 */