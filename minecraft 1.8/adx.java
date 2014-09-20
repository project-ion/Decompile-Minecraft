/*   1:    */ import java.util.UUID;
/*   2:    */ import net.minecraft.server.MinecraftServer;
/*   3:    */ 
/*   4:    */ public abstract class adx
/*   5:    */   extends wv
/*   6:    */   implements vz
/*   7:    */ {
/*   8:    */   private boolean a;
/*   9:    */   private String b;
/*  10:    */   
/*  11:    */   public adx(aqu paramaqu)
/*  12:    */   {
/*  13: 86 */     super(paramaqu);
/*  14: 87 */     this.k = true;
/*  15: 88 */     a(0.98F, 0.7F);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public static adx a(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, adz paramadz)
/*  19:    */   {
/*  20: 92 */     switch (ady.a[paramadz.ordinal()])
/*  21:    */     {
/*  22:    */     case 1: 
/*  23: 94 */       return new aea(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  24:    */     case 2: 
/*  25: 96 */       return new aee(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  26:    */     case 3: 
/*  27: 98 */       return new aej(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  28:    */     case 4: 
/*  29:100 */       return new aeh(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  30:    */     case 5: 
/*  31:102 */       return new aef(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  32:    */     case 6: 
/*  33:104 */       return new aeb(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  34:    */     }
/*  35:106 */     return new aeg(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected boolean r_()
/*  39:    */   {
/*  40:112 */     return false;
/*  41:    */   }
/*  42:    */   
/*  43:    */   protected void h()
/*  44:    */   {
/*  45:117 */     this.ac.a(17, new Integer(0));
/*  46:118 */     this.ac.a(18, new Integer(1));
/*  47:119 */     this.ac.a(19, new Float(0.0F));
/*  48:120 */     this.ac.a(20, new Integer(0));
/*  49:121 */     this.ac.a(21, new Integer(6));
/*  50:122 */     this.ac.a(22, Byte.valueOf((byte)0));
/*  51:    */   }
/*  52:    */   
/*  53:    */   public brt j(wv paramwv)
/*  54:    */   {
/*  55:127 */     if (paramwv.ae()) {
/*  56:128 */       return paramwv.aQ();
/*  57:    */     }
/*  58:130 */     return null;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public brt S()
/*  62:    */   {
/*  63:135 */     return null;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean ae()
/*  67:    */   {
/*  68:140 */     return true;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public adx(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  72:    */   {
/*  73:144 */     this(paramaqu);
/*  74:145 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  75:    */     
/*  76:147 */     this.v = 0.0D;
/*  77:148 */     this.w = 0.0D;
/*  78:149 */     this.x = 0.0D;
/*  79:    */     
/*  80:151 */     this.p = paramDouble1;
/*  81:152 */     this.q = paramDouble2;
/*  82:153 */     this.r = paramDouble3;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public double an()
/*  86:    */   {
/*  87:158 */     return this.K * 0.5D - 0.2000000029802322D;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean a(wh paramwh, float paramFloat)
/*  91:    */   {
/*  92:163 */     if ((this.o.D) || (this.I)) {
/*  93:164 */       return true;
/*  94:    */     }
/*  95:166 */     if (b(paramwh)) {
/*  96:167 */       return false;
/*  97:    */     }
/*  98:169 */     k(-r());
/*  99:170 */     j(10);
/* 100:171 */     ac();
/* 101:172 */     a(p() + paramFloat * 10.0F);
/* 102:173 */     int j = ((paramwh.j() instanceof ahd)) && (((ahd)paramwh.j()).by.d) ? 1 : 0;
/* 103:175 */     if ((j != 0) || (p() > 40.0F))
/* 104:    */     {
/* 105:176 */       if (this.l != null) {
/* 106:177 */         this.l.a(null);
/* 107:    */       }
/* 108:180 */       if ((j == 0) || (k_())) {
/* 109:181 */         a(paramwh);
/* 110:    */       } else {
/* 111:183 */         J();
/* 112:    */       }
/* 113:    */     }
/* 114:186 */     return true;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void a(wh paramwh)
/* 118:    */   {
/* 119:190 */     J();
/* 120:191 */     amj localamj = new amj(amk.az, 1);
/* 121:192 */     if (this.b != null) {
/* 122:193 */       localamj.c(this.b);
/* 123:    */     }
/* 124:195 */     a(localamj, 0.0F);
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void as()
/* 128:    */   {
/* 129:200 */     k(-r());
/* 130:201 */     j(10);
/* 131:202 */     a(p() + p() * 10.0F);
/* 132:    */   }
/* 133:    */   
/* 134:    */   public boolean ad()
/* 135:    */   {
/* 136:207 */     return !this.I;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void J()
/* 140:    */   {
/* 141:212 */     super.J();
/* 142:    */   }
/* 143:    */   
/* 144:216 */   private static final int[][][] c = { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
/* 145:    */   private int d;
/* 146:    */   private double e;
/* 147:    */   private double f;
/* 148:    */   private double g;
/* 149:    */   private double h;
/* 150:    */   private double i;
/* 151:    */   private double ap;
/* 152:    */   private double aq;
/* 153:    */   private double ar;
/* 154:    */   
/* 155:    */   public void s_()
/* 156:    */   {
/* 157:232 */     if (q() > 0) {
/* 158:233 */       j(q() - 1);
/* 159:    */     }
/* 160:235 */     if (p() > 0.0F) {
/* 161:236 */       a(p() - 1.0F);
/* 162:    */     }
/* 163:238 */     if (this.t < -64.0D) {
/* 164:239 */       O();
/* 165:    */     }
/* 166:242 */     if ((!this.o.D) && ((this.o instanceof qt)))
/* 167:    */     {
/* 168:243 */       this.o.B.a("portal");
/* 169:244 */       MinecraftServer localMinecraftServer = ((qt)this.o).r();
/* 170:245 */       k = L();
/* 171:247 */       if (this.ak)
/* 172:    */       {
/* 173:248 */         if (localMinecraftServer.A())
/* 174:    */         {
/* 175:249 */           if ((this.m == null) && 
/* 176:250 */             (this.al++ >= k))
/* 177:    */           {
/* 178:251 */             this.al = k;
/* 179:252 */             this.aj = ar();
/* 180:    */             int m;
/* 181:256 */             if (this.o.t.q() == -1) {
/* 182:257 */               m = 0;
/* 183:    */             } else {
/* 184:259 */               m = -1;
/* 185:    */             }
/* 186:262 */             c(m);
/* 187:    */           }
/* 188:265 */           this.ak = false;
/* 189:    */         }
/* 190:    */       }
/* 191:    */       else
/* 192:    */       {
/* 193:268 */         if (this.al > 0) {
/* 194:269 */           this.al -= 4;
/* 195:    */         }
/* 196:271 */         if (this.al < 0) {
/* 197:272 */           this.al = 0;
/* 198:    */         }
/* 199:    */       }
/* 200:275 */       if (this.aj > 0) {
/* 201:276 */         this.aj -= 1;
/* 202:    */       }
/* 203:278 */       this.o.B.b();
/* 204:    */     }
/* 205:281 */     if (this.o.D)
/* 206:    */     {
/* 207:282 */       if (this.d > 0)
/* 208:    */       {
/* 209:283 */         double d1 = this.s + (this.e - this.s) / this.d;
/* 210:284 */         double d2 = this.t + (this.f - this.t) / this.d;
/* 211:285 */         double d3 = this.u + (this.g - this.u) / this.d;
/* 212:    */         
/* 213:287 */         double d5 = uv.g(this.h - this.y);
/* 214:    */         
/* 215:289 */         this.y = ((float)(this.y + d5 / this.d));
/* 216:290 */         this.z = ((float)(this.z + (this.i - this.z) / this.d));
/* 217:    */         
/* 218:292 */         this.d -= 1;
/* 219:293 */         b(d1, d2, d3);
/* 220:294 */         b(this.y, this.z);
/* 221:    */       }
/* 222:    */       else
/* 223:    */       {
/* 224:296 */         b(this.s, this.t, this.u);
/* 225:297 */         b(this.y, this.z);
/* 226:    */       }
/* 227:300 */       return;
/* 228:    */     }
/* 229:302 */     this.p = this.s;
/* 230:303 */     this.q = this.t;
/* 231:304 */     this.r = this.u;
/* 232:    */     
/* 233:306 */     this.w -= 0.03999999910593033D;
/* 234:    */     
/* 235:308 */     int j = uv.c(this.s);
/* 236:309 */     int k = uv.c(this.t);
/* 237:310 */     int n = uv.c(this.u);
/* 238:311 */     if (ati.d(this.o, new dt(j, k - 1, n))) {
/* 239:312 */       k--;
/* 240:    */     }
/* 241:315 */     dt localdt = new dt(j, k, n);
/* 242:316 */     bec localbec = this.o.p(localdt);
/* 243:317 */     if (ati.d(localbec))
/* 244:    */     {
/* 245:318 */       a(localdt, localbec);
/* 246:320 */       if (localbec.c() == aty.cs) {
/* 247:321 */         a(j, k, n, ((Boolean)localbec.b(azc.M)).booleanValue());
/* 248:    */       }
/* 249:    */     }
/* 250:    */     else
/* 251:    */     {
/* 252:324 */       n();
/* 253:    */     }
/* 254:327 */     Q();
/* 255:    */     
/* 256:329 */     this.z = 0.0F;
/* 257:330 */     double d4 = this.p - this.s;
/* 258:331 */     double d6 = this.r - this.u;
/* 259:332 */     if (d4 * d4 + d6 * d6 > 0.001D)
/* 260:    */     {
/* 261:333 */       this.y = ((float)(Math.atan2(d6, d4) * 180.0D / 3.141592653589793D));
/* 262:334 */       if (this.a) {
/* 263:335 */         this.y += 180.0F;
/* 264:    */       }
/* 265:    */     }
/* 266:339 */     double d7 = uv.g(this.y - this.A);
/* 267:340 */     if ((d7 < -170.0D) || (d7 >= 170.0D))
/* 268:    */     {
/* 269:341 */       this.y += 180.0F;
/* 270:342 */       this.a = (!this.a);
/* 271:    */     }
/* 272:344 */     b(this.y, this.z);
/* 273:346 */     for (wv localwv : this.o.b(this, aQ().b(0.2000000029802322D, 0.0D, 0.2000000029802322D))) {
/* 274:347 */       if ((localwv != this.l) && (localwv.ae()) && ((localwv instanceof adx))) {
/* 275:348 */         localwv.i(this);
/* 276:    */       }
/* 277:    */     }
/* 278:352 */     if ((this.l != null) && 
/* 279:353 */       (this.l.I))
/* 280:    */     {
/* 281:354 */       if (this.l.m == this) {
/* 282:355 */         this.l.m = null;
/* 283:    */       }
/* 284:357 */       this.l = null;
/* 285:    */     }
/* 286:361 */     W();
/* 287:    */   }
/* 288:    */   
/* 289:    */   protected double m()
/* 290:    */   {
/* 291:365 */     return 0.4D;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {}
/* 295:    */   
/* 296:    */   protected void n()
/* 297:    */   {
/* 298:372 */     double d1 = m();
/* 299:373 */     this.v = uv.a(this.v, -d1, d1);
/* 300:374 */     this.x = uv.a(this.x, -d1, d1);
/* 301:375 */     if (this.C)
/* 302:    */     {
/* 303:376 */       this.v *= 0.5D;
/* 304:377 */       this.w *= 0.5D;
/* 305:378 */       this.x *= 0.5D;
/* 306:    */     }
/* 307:380 */     d(this.v, this.w, this.x);
/* 308:382 */     if (!this.C)
/* 309:    */     {
/* 310:383 */       this.v *= 0.949999988079071D;
/* 311:384 */       this.w *= 0.949999988079071D;
/* 312:385 */       this.x *= 0.949999988079071D;
/* 313:    */     }
/* 314:    */   }
/* 315:    */   
/* 316:    */   protected void a(dt paramdt, bec parambec)
/* 317:    */   {
/* 318:390 */     this.O = 0.0F;
/* 319:    */     
/* 320:392 */     brw localbrw1 = k(this.s, this.t, this.u);
/* 321:393 */     this.t = paramdt.o();
/* 322:    */     
/* 323:395 */     boolean bool = false;
/* 324:396 */     int j = 0;
/* 325:397 */     ati localati = (ati)parambec.c();
/* 326:399 */     if (localati == aty.D)
/* 327:    */     {
/* 328:400 */       bool = ((Boolean)parambec.b(azc.M)).booleanValue();
/* 329:401 */       j = !bool ? 1 : 0;
/* 330:    */     }
/* 331:404 */     double d1 = 0.0078125D;
/* 332:405 */     atl localatl = (atl)parambec.b(localati.l());
/* 333:406 */     switch (ady.b[localatl.ordinal()])
/* 334:    */     {
/* 335:    */     case 1: 
/* 336:408 */       this.v -= 0.0078125D;
/* 337:409 */       this.t += 1.0D;
/* 338:410 */       break;
/* 339:    */     case 2: 
/* 340:412 */       this.v += 0.0078125D;
/* 341:413 */       this.t += 1.0D;
/* 342:414 */       break;
/* 343:    */     case 3: 
/* 344:416 */       this.x += 0.0078125D;
/* 345:417 */       this.t += 1.0D;
/* 346:418 */       break;
/* 347:    */     case 4: 
/* 348:420 */       this.x -= 0.0078125D;
/* 349:421 */       this.t += 1.0D;
/* 350:    */     }
/* 351:425 */     int[][] arrayOfInt = c[localatl.a()];
/* 352:    */     
/* 353:427 */     double d2 = arrayOfInt[1][0] - arrayOfInt[0][0];
/* 354:428 */     double d3 = arrayOfInt[1][2] - arrayOfInt[0][2];
/* 355:429 */     double d4 = Math.sqrt(d2 * d2 + d3 * d3);
/* 356:    */     
/* 357:431 */     double d5 = this.v * d2 + this.x * d3;
/* 358:432 */     if (d5 < 0.0D)
/* 359:    */     {
/* 360:433 */       d2 = -d2;
/* 361:434 */       d3 = -d3;
/* 362:    */     }
/* 363:437 */     double d6 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 364:438 */     if (d6 > 2.0D) {
/* 365:439 */       d6 = 2.0D;
/* 366:    */     }
/* 367:442 */     this.v = (d6 * d2 / d4);
/* 368:443 */     this.x = (d6 * d3 / d4);
/* 369:445 */     if ((this.l instanceof xm))
/* 370:    */     {
/* 371:446 */       d7 = ((xm)this.l).aY;
/* 372:448 */       if (d7 > 0.0D)
/* 373:    */       {
/* 374:449 */         d8 = -Math.sin(this.l.y * 3.141593F / 180.0F);
/* 375:450 */         d9 = Math.cos(this.l.y * 3.141593F / 180.0F);
/* 376:    */         
/* 377:452 */         d10 = this.v * this.v + this.x * this.x;
/* 378:454 */         if (d10 < 0.01D)
/* 379:    */         {
/* 380:455 */           this.v += d8 * 0.1D;
/* 381:456 */           this.x += d9 * 0.1D;
/* 382:    */           
/* 383:458 */           j = 0;
/* 384:    */         }
/* 385:    */       }
/* 386:    */     }
/* 387:464 */     if (j != 0)
/* 388:    */     {
/* 389:465 */       d7 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 390:466 */       if (d7 < 0.03D)
/* 391:    */       {
/* 392:467 */         this.v *= 0.0D;
/* 393:468 */         this.w *= 0.0D;
/* 394:469 */         this.x *= 0.0D;
/* 395:    */       }
/* 396:    */       else
/* 397:    */       {
/* 398:471 */         this.v *= 0.5D;
/* 399:472 */         this.w *= 0.0D;
/* 400:473 */         this.x *= 0.5D;
/* 401:    */       }
/* 402:    */     }
/* 403:477 */     double d7 = 0.0D;
/* 404:478 */     double d8 = paramdt.n() + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 405:479 */     double d9 = paramdt.p() + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 406:480 */     double d10 = paramdt.n() + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 407:481 */     double d11 = paramdt.p() + 0.5D + arrayOfInt[1][2] * 0.5D;
/* 408:    */     
/* 409:483 */     d2 = d10 - d8;
/* 410:484 */     d3 = d11 - d9;
/* 411:486 */     if (d2 == 0.0D)
/* 412:    */     {
/* 413:487 */       this.s = (paramdt.n() + 0.5D);
/* 414:488 */       d7 = this.u - paramdt.p();
/* 415:    */     }
/* 416:489 */     else if (d3 == 0.0D)
/* 417:    */     {
/* 418:490 */       this.u = (paramdt.p() + 0.5D);
/* 419:491 */       d7 = this.s - paramdt.n();
/* 420:    */     }
/* 421:    */     else
/* 422:    */     {
/* 423:493 */       d12 = this.s - d8;
/* 424:494 */       d13 = this.u - d9;
/* 425:    */       
/* 426:496 */       d7 = (d12 * d2 + d13 * d3) * 2.0D;
/* 427:    */     }
/* 428:499 */     this.s = (d8 + d2 * d7);
/* 429:500 */     this.u = (d9 + d3 * d7);
/* 430:    */     
/* 431:502 */     b(this.s, this.t, this.u);
/* 432:    */     
/* 433:504 */     double d12 = this.v;
/* 434:505 */     double d13 = this.x;
/* 435:506 */     if (this.l != null)
/* 436:    */     {
/* 437:507 */       d12 *= 0.75D;
/* 438:508 */       d13 *= 0.75D;
/* 439:    */     }
/* 440:511 */     double d14 = m();
/* 441:512 */     d12 = uv.a(d12, -d14, d14);
/* 442:513 */     d13 = uv.a(d13, -d14, d14);
/* 443:    */     
/* 444:515 */     d(d12, 0.0D, d13);
/* 445:517 */     if ((arrayOfInt[0][1] != 0) && (uv.c(this.s) - paramdt.n() == arrayOfInt[0][0]) && (uv.c(this.u) - paramdt.p() == arrayOfInt[0][2])) {
/* 446:518 */       b(this.s, this.t + arrayOfInt[0][1], this.u);
/* 447:519 */     } else if ((arrayOfInt[1][1] != 0) && (uv.c(this.s) - paramdt.n() == arrayOfInt[1][0]) && (uv.c(this.u) - paramdt.p() == arrayOfInt[1][2])) {
/* 448:520 */       b(this.s, this.t + arrayOfInt[1][1], this.u);
/* 449:    */     }
/* 450:523 */     o();
/* 451:    */     
/* 452:525 */     brw localbrw2 = k(this.s, this.t, this.u);
/* 453:526 */     if ((localbrw2 != null) && (localbrw1 != null))
/* 454:    */     {
/* 455:527 */       double d15 = (localbrw1.b - localbrw2.b) * 0.05D;
/* 456:    */       
/* 457:529 */       d6 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 458:530 */       if (d6 > 0.0D)
/* 459:    */       {
/* 460:531 */         this.v = (this.v / d6 * (d6 + d15));
/* 461:532 */         this.x = (this.x / d6 * (d6 + d15));
/* 462:    */       }
/* 463:534 */       b(this.s, localbrw2.b, this.u);
/* 464:    */     }
/* 465:537 */     int k = uv.c(this.s);
/* 466:538 */     int m = uv.c(this.u);
/* 467:539 */     if ((k != paramdt.n()) || (m != paramdt.p()))
/* 468:    */     {
/* 469:540 */       d6 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 470:    */       
/* 471:542 */       this.v = (d6 * (k - paramdt.n()));
/* 472:543 */       this.x = (d6 * (m - paramdt.p()));
/* 473:    */     }
/* 474:547 */     if (bool)
/* 475:    */     {
/* 476:548 */       double d16 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 477:549 */       if (d16 > 0.01D)
/* 478:    */       {
/* 479:550 */         double d17 = 0.06D;
/* 480:551 */         this.v += this.v / d16 * d17;
/* 481:552 */         this.x += this.x / d16 * d17;
/* 482:    */       }
/* 483:556 */       else if (localatl == atl.b)
/* 484:    */       {
/* 485:557 */         if (this.o.p(paramdt.e()).c().t()) {
/* 486:558 */           this.v = 0.02D;
/* 487:559 */         } else if (this.o.p(paramdt.f()).c().t()) {
/* 488:560 */           this.v = -0.02D;
/* 489:    */         }
/* 490:    */       }
/* 491:562 */       else if (localatl == atl.a)
/* 492:    */       {
/* 493:563 */         if (this.o.p(paramdt.c()).c().t()) {
/* 494:564 */           this.x = 0.02D;
/* 495:565 */         } else if (this.o.p(paramdt.d()).c().t()) {
/* 496:566 */           this.x = -0.02D;
/* 497:    */         }
/* 498:    */       }
/* 499:    */     }
/* 500:    */   }
/* 501:    */   
/* 502:    */   protected void o()
/* 503:    */   {
/* 504:574 */     if (this.l != null)
/* 505:    */     {
/* 506:575 */       this.v *= 0.996999979019165D;
/* 507:576 */       this.w *= 0.0D;
/* 508:577 */       this.x *= 0.996999979019165D;
/* 509:    */     }
/* 510:    */     else
/* 511:    */     {
/* 512:579 */       this.v *= 0.9599999785423279D;
/* 513:580 */       this.w *= 0.0D;
/* 514:581 */       this.x *= 0.9599999785423279D;
/* 515:    */     }
/* 516:    */   }
/* 517:    */   
/* 518:    */   public void b(double paramDouble1, double paramDouble2, double paramDouble3)
/* 519:    */   {
/* 520:587 */     this.s = paramDouble1;
/* 521:588 */     this.t = paramDouble2;
/* 522:589 */     this.u = paramDouble3;
/* 523:590 */     float f1 = this.J / 2.0F;
/* 524:591 */     float f2 = this.K;
/* 525:592 */     a(new brt(paramDouble1 - f1, paramDouble2, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 + f2, paramDouble3 + f1));
/* 526:    */   }
/* 527:    */   
/* 528:    */   public brw a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/* 529:    */   {
/* 530:596 */     int j = uv.c(paramDouble1);
/* 531:597 */     int k = uv.c(paramDouble2);
/* 532:598 */     int m = uv.c(paramDouble3);
/* 533:599 */     if (ati.d(this.o, new dt(j, k - 1, m))) {
/* 534:600 */       k--;
/* 535:    */     }
/* 536:603 */     bec localbec = this.o.p(new dt(j, k, m));
/* 537:604 */     if (ati.d(localbec))
/* 538:    */     {
/* 539:605 */       atl localatl = (atl)localbec.b(((ati)localbec.c()).l());
/* 540:606 */       paramDouble2 = k;
/* 541:607 */       if (localatl.c()) {
/* 542:608 */         paramDouble2 = k + 1;
/* 543:    */       }
/* 544:611 */       int[][] arrayOfInt = c[localatl.a()];
/* 545:    */       
/* 546:613 */       double d1 = arrayOfInt[1][0] - arrayOfInt[0][0];
/* 547:614 */       double d2 = arrayOfInt[1][2] - arrayOfInt[0][2];
/* 548:615 */       double d3 = Math.sqrt(d1 * d1 + d2 * d2);
/* 549:616 */       d1 /= d3;
/* 550:617 */       d2 /= d3;
/* 551:    */       
/* 552:619 */       paramDouble1 += d1 * paramDouble4;
/* 553:620 */       paramDouble3 += d2 * paramDouble4;
/* 554:622 */       if ((arrayOfInt[0][1] != 0) && (uv.c(paramDouble1) - j == arrayOfInt[0][0]) && (uv.c(paramDouble3) - m == arrayOfInt[0][2])) {
/* 555:623 */         paramDouble2 += arrayOfInt[0][1];
/* 556:624 */       } else if ((arrayOfInt[1][1] != 0) && (uv.c(paramDouble1) - j == arrayOfInt[1][0]) && (uv.c(paramDouble3) - m == arrayOfInt[1][2])) {
/* 557:625 */         paramDouble2 += arrayOfInt[1][1];
/* 558:    */       }
/* 559:628 */       return k(paramDouble1, paramDouble2, paramDouble3);
/* 560:    */     }
/* 561:630 */     return null;
/* 562:    */   }
/* 563:    */   
/* 564:    */   public brw k(double paramDouble1, double paramDouble2, double paramDouble3)
/* 565:    */   {
/* 566:634 */     int j = uv.c(paramDouble1);
/* 567:635 */     int k = uv.c(paramDouble2);
/* 568:636 */     int m = uv.c(paramDouble3);
/* 569:637 */     if (ati.d(this.o, new dt(j, k - 1, m))) {
/* 570:638 */       k--;
/* 571:    */     }
/* 572:641 */     bec localbec = this.o.p(new dt(j, k, m));
/* 573:642 */     if (ati.d(localbec))
/* 574:    */     {
/* 575:643 */       atl localatl = (atl)localbec.b(((ati)localbec.c()).l());
/* 576:644 */       int[][] arrayOfInt = c[localatl.a()];
/* 577:    */       
/* 578:646 */       double d1 = 0.0D;
/* 579:647 */       double d2 = j + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 580:648 */       double d3 = k + 0.0625D + arrayOfInt[0][1] * 0.5D;
/* 581:649 */       double d4 = m + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 582:650 */       double d5 = j + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 583:651 */       double d6 = k + 0.0625D + arrayOfInt[1][1] * 0.5D;
/* 584:652 */       double d7 = m + 0.5D + arrayOfInt[1][2] * 0.5D;
/* 585:    */       
/* 586:654 */       double d8 = d5 - d2;
/* 587:655 */       double d9 = (d6 - d3) * 2.0D;
/* 588:656 */       double d10 = d7 - d4;
/* 589:658 */       if (d8 == 0.0D)
/* 590:    */       {
/* 591:659 */         paramDouble1 = j + 0.5D;
/* 592:660 */         d1 = paramDouble3 - m;
/* 593:    */       }
/* 594:661 */       else if (d10 == 0.0D)
/* 595:    */       {
/* 596:662 */         paramDouble3 = m + 0.5D;
/* 597:663 */         d1 = paramDouble1 - j;
/* 598:    */       }
/* 599:    */       else
/* 600:    */       {
/* 601:665 */         double d11 = paramDouble1 - d2;
/* 602:666 */         double d12 = paramDouble3 - d4;
/* 603:    */         
/* 604:668 */         d1 = (d11 * d8 + d12 * d10) * 2.0D;
/* 605:    */       }
/* 606:671 */       paramDouble1 = d2 + d8 * d1;
/* 607:672 */       paramDouble2 = d3 + d9 * d1;
/* 608:673 */       paramDouble3 = d4 + d10 * d1;
/* 609:674 */       if (d9 < 0.0D) {
/* 610:675 */         paramDouble2 += 1.0D;
/* 611:    */       }
/* 612:677 */       if (d9 > 0.0D) {
/* 613:678 */         paramDouble2 += 0.5D;
/* 614:    */       }
/* 615:680 */       return new brw(paramDouble1, paramDouble2, paramDouble3);
/* 616:    */     }
/* 617:682 */     return null;
/* 618:    */   }
/* 619:    */   
/* 620:    */   protected void a(fn paramfn)
/* 621:    */   {
/* 622:687 */     if (paramfn.n("CustomDisplayTile"))
/* 623:    */     {
/* 624:688 */       int j = paramfn.f("DisplayData");
/* 625:    */       atr localatr;
/* 626:689 */       if (paramfn.b("DisplayTile", 8))
/* 627:    */       {
/* 628:690 */         localatr = atr.b(paramfn.j("DisplayTile"));
/* 629:691 */         if (localatr == null) {
/* 630:692 */           a(aty.a.P());
/* 631:    */         } else {
/* 632:694 */           a(localatr.a(j));
/* 633:    */         }
/* 634:    */       }
/* 635:    */       else
/* 636:    */       {
/* 637:697 */         localatr = atr.c(paramfn.f("DisplayTile"));
/* 638:698 */         if (localatr == null) {
/* 639:699 */           a(aty.a.P());
/* 640:    */         } else {
/* 641:701 */           a(localatr.a(j));
/* 642:    */         }
/* 643:    */       }
/* 644:704 */       l(paramfn.f("DisplayOffset"));
/* 645:    */     }
/* 646:707 */     if ((paramfn.b("CustomName", 8)) && (paramfn.j("CustomName").length() > 0)) {
/* 647:708 */       this.b = paramfn.j("CustomName");
/* 648:    */     }
/* 649:    */   }
/* 650:    */   
/* 651:    */   protected void b(fn paramfn)
/* 652:    */   {
/* 653:714 */     if (x())
/* 654:    */     {
/* 655:715 */       paramfn.a("CustomDisplayTile", true);
/* 656:716 */       bec localbec = t();
/* 657:717 */       oa localoa = (oa)atr.c.c(localbec.c());
/* 658:718 */       paramfn.a("DisplayTile", localoa == null ? "" : localoa.toString());
/* 659:719 */       paramfn.a("DisplayData", localbec.c().c(localbec));
/* 660:720 */       paramfn.a("DisplayOffset", v());
/* 661:    */     }
/* 662:723 */     if ((this.b != null) && (this.b.length() > 0)) {
/* 663:724 */       paramfn.a("CustomName", this.b);
/* 664:    */     }
/* 665:    */   }
/* 666:    */   
/* 667:    */   public void i(wv paramwv)
/* 668:    */   {
/* 669:730 */     if (this.o.D) {
/* 670:731 */       return;
/* 671:    */     }
/* 672:733 */     if ((paramwv.T) || (this.T)) {
/* 673:734 */       return;
/* 674:    */     }
/* 675:737 */     if (paramwv == this.l) {
/* 676:738 */       return;
/* 677:    */     }
/* 678:740 */     if (((paramwv instanceof xm)) && (!(paramwv instanceof ahd)) && (!(paramwv instanceof acq)) && (s() == adz.a) && (this.v * this.v + this.x * this.x > 0.01D) && 
/* 679:741 */       (this.l == null) && (paramwv.m == null)) {
/* 680:742 */       paramwv.a(this);
/* 681:    */     }
/* 682:746 */     double d1 = paramwv.s - this.s;
/* 683:747 */     double d2 = paramwv.u - this.u;
/* 684:    */     
/* 685:749 */     double d3 = d1 * d1 + d2 * d2;
/* 686:750 */     if (d3 >= 9.999999747378752E-005D)
/* 687:    */     {
/* 688:751 */       d3 = uv.a(d3);
/* 689:752 */       d1 /= d3;
/* 690:753 */       d2 /= d3;
/* 691:754 */       double d4 = 1.0D / d3;
/* 692:755 */       if (d4 > 1.0D) {
/* 693:756 */         d4 = 1.0D;
/* 694:    */       }
/* 695:758 */       d1 *= d4;
/* 696:759 */       d2 *= d4;
/* 697:760 */       d1 *= 0.1000000014901161D;
/* 698:761 */       d2 *= 0.1000000014901161D;
/* 699:    */       
/* 700:763 */       d1 *= (1.0F - this.U);
/* 701:764 */       d2 *= (1.0F - this.U);
/* 702:765 */       d1 *= 0.5D;
/* 703:766 */       d2 *= 0.5D;
/* 704:768 */       if ((paramwv instanceof adx))
/* 705:    */       {
/* 706:769 */         double d5 = paramwv.s - this.s;
/* 707:770 */         double d6 = paramwv.u - this.u;
/* 708:    */         
/* 709:772 */         brw localbrw1 = new brw(d5, 0.0D, d6).a();
/* 710:773 */         brw localbrw2 = new brw(uv.b(this.y * 3.141593F / 180.0F), 0.0D, uv.a(this.y * 3.141593F / 180.0F)).a();
/* 711:    */         
/* 712:775 */         double d7 = Math.abs(localbrw1.b(localbrw2));
/* 713:777 */         if (d7 < 0.800000011920929D) {
/* 714:778 */           return;
/* 715:    */         }
/* 716:781 */         double d8 = paramwv.v + this.v;
/* 717:782 */         double d9 = paramwv.x + this.x;
/* 718:784 */         if ((((adx)paramwv).s() == adz.c) && (s() != adz.c))
/* 719:    */         {
/* 720:785 */           this.v *= 0.2000000029802322D;
/* 721:786 */           this.x *= 0.2000000029802322D;
/* 722:787 */           g(paramwv.v - d1, 0.0D, paramwv.x - d2);
/* 723:788 */           paramwv.v *= 0.949999988079071D;
/* 724:789 */           paramwv.x *= 0.949999988079071D;
/* 725:    */         }
/* 726:790 */         else if ((((adx)paramwv).s() != adz.c) && (s() == adz.c))
/* 727:    */         {
/* 728:791 */           paramwv.v *= 0.2000000029802322D;
/* 729:792 */           paramwv.x *= 0.2000000029802322D;
/* 730:793 */           paramwv.g(this.v + d1, 0.0D, this.x + d2);
/* 731:794 */           this.v *= 0.949999988079071D;
/* 732:795 */           this.x *= 0.949999988079071D;
/* 733:    */         }
/* 734:    */         else
/* 735:    */         {
/* 736:797 */           d8 /= 2.0D;
/* 737:798 */           d9 /= 2.0D;
/* 738:799 */           this.v *= 0.2000000029802322D;
/* 739:800 */           this.x *= 0.2000000029802322D;
/* 740:801 */           g(d8 - d1, 0.0D, d9 - d2);
/* 741:802 */           paramwv.v *= 0.2000000029802322D;
/* 742:803 */           paramwv.x *= 0.2000000029802322D;
/* 743:804 */           paramwv.g(d8 + d1, 0.0D, d9 + d2);
/* 744:    */         }
/* 745:    */       }
/* 746:    */       else
/* 747:    */       {
/* 748:807 */         g(-d1, 0.0D, -d2);
/* 749:808 */         paramwv.g(d1 / 4.0D, 0.0D, d2 / 4.0D);
/* 750:    */       }
/* 751:    */     }
/* 752:    */   }
/* 753:    */   
/* 754:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 755:    */   {
/* 756:819 */     this.e = paramDouble1;
/* 757:820 */     this.f = paramDouble2;
/* 758:821 */     this.g = paramDouble3;
/* 759:822 */     this.h = paramFloat1;
/* 760:823 */     this.i = paramFloat2;
/* 761:    */     
/* 762:825 */     this.d = (paramInt + 2);
/* 763:    */     
/* 764:827 */     this.v = this.ap;
/* 765:828 */     this.w = this.aq;
/* 766:829 */     this.x = this.ar;
/* 767:    */   }
/* 768:    */   
/* 769:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 770:    */   {
/* 771:834 */     this.ap = (this.v = paramDouble1);
/* 772:835 */     this.aq = (this.w = paramDouble2);
/* 773:836 */     this.ar = (this.x = paramDouble3);
/* 774:    */   }
/* 775:    */   
/* 776:    */   public void a(float paramFloat)
/* 777:    */   {
/* 778:840 */     this.ac.b(19, Float.valueOf(paramFloat));
/* 779:    */   }
/* 780:    */   
/* 781:    */   public float p()
/* 782:    */   {
/* 783:844 */     return this.ac.d(19);
/* 784:    */   }
/* 785:    */   
/* 786:    */   public void j(int paramInt)
/* 787:    */   {
/* 788:848 */     this.ac.b(17, Integer.valueOf(paramInt));
/* 789:    */   }
/* 790:    */   
/* 791:    */   public int q()
/* 792:    */   {
/* 793:852 */     return this.ac.c(17);
/* 794:    */   }
/* 795:    */   
/* 796:    */   public void k(int paramInt)
/* 797:    */   {
/* 798:856 */     this.ac.b(18, Integer.valueOf(paramInt));
/* 799:    */   }
/* 800:    */   
/* 801:    */   public int r()
/* 802:    */   {
/* 803:860 */     return this.ac.c(18);
/* 804:    */   }
/* 805:    */   
/* 806:    */   public abstract adz s();
/* 807:    */   
/* 808:    */   public bec t()
/* 809:    */   {
/* 810:866 */     if (!x()) {
/* 811:867 */       return u();
/* 812:    */     }
/* 813:869 */     return atr.d(H().c(20));
/* 814:    */   }
/* 815:    */   
/* 816:    */   public bec u()
/* 817:    */   {
/* 818:873 */     return aty.a.P();
/* 819:    */   }
/* 820:    */   
/* 821:    */   public int v()
/* 822:    */   {
/* 823:877 */     if (!x()) {
/* 824:878 */       return w();
/* 825:    */     }
/* 826:880 */     return H().c(21);
/* 827:    */   }
/* 828:    */   
/* 829:    */   public int w()
/* 830:    */   {
/* 831:884 */     return 6;
/* 832:    */   }
/* 833:    */   
/* 834:    */   public void a(bec parambec)
/* 835:    */   {
/* 836:888 */     H().b(20, Integer.valueOf(atr.f(parambec)));
/* 837:889 */     a(true);
/* 838:    */   }
/* 839:    */   
/* 840:    */   public void l(int paramInt)
/* 841:    */   {
/* 842:893 */     H().b(21, Integer.valueOf(paramInt));
/* 843:894 */     a(true);
/* 844:    */   }
/* 845:    */   
/* 846:    */   public boolean x()
/* 847:    */   {
/* 848:898 */     return H().a(22) == 1;
/* 849:    */   }
/* 850:    */   
/* 851:    */   public void a(boolean paramBoolean)
/* 852:    */   {
/* 853:902 */     H().b(22, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 854:    */   }
/* 855:    */   
/* 856:    */   public void a(String paramString)
/* 857:    */   {
/* 858:907 */     this.b = paramString;
/* 859:    */   }
/* 860:    */   
/* 861:    */   public String d_()
/* 862:    */   {
/* 863:912 */     if (this.b != null) {
/* 864:913 */       return this.b;
/* 865:    */     }
/* 866:915 */     return super.d_();
/* 867:    */   }
/* 868:    */   
/* 869:    */   public boolean k_()
/* 870:    */   {
/* 871:920 */     return this.b != null;
/* 872:    */   }
/* 873:    */   
/* 874:    */   public String aL()
/* 875:    */   {
/* 876:925 */     return this.b;
/* 877:    */   }
/* 878:    */   
/* 879:    */   public ho e_()
/* 880:    */   {
/* 881:930 */     if (k_())
/* 882:    */     {
/* 883:931 */       localObject = new hy(this.b);
/* 884:932 */       ((hy)localObject).b().a(aP());
/* 885:933 */       ((hy)localObject).b().a(aJ().toString());
/* 886:934 */       return localObject;
/* 887:    */     }
/* 888:938 */     Object localObject = new hz(d_(), new Object[0]);
/* 889:939 */     ((hz)localObject).b().a(aP());
/* 890:940 */     ((hz)localObject).b().a(aJ().toString());
/* 891:941 */     return localObject;
/* 892:    */   }
/* 893:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adx
 * JD-Core Version:    0.7.0.1
 */