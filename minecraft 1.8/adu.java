/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class adu
/*   5:    */   extends wv
/*   6:    */ {
/*   7: 33 */   private boolean a = true;
/*   8: 34 */   private double b = 0.07000000000000001D;
/*   9:    */   private int c;
/*  10:    */   private double d;
/*  11:    */   private double e;
/*  12:    */   private double f;
/*  13:    */   private double g;
/*  14:    */   private double h;
/*  15:    */   private double i;
/*  16:    */   private double ap;
/*  17:    */   private double aq;
/*  18:    */   
/*  19:    */   public adu(aqu paramaqu)
/*  20:    */   {
/*  21: 37 */     super(paramaqu);
/*  22: 38 */     this.k = true;
/*  23: 39 */     a(1.5F, 0.6F);
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected boolean r_()
/*  27:    */   {
/*  28: 44 */     return false;
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected void h()
/*  32:    */   {
/*  33: 49 */     this.ac.a(17, new Integer(0));
/*  34: 50 */     this.ac.a(18, new Integer(1));
/*  35: 51 */     this.ac.a(19, new Float(0.0F));
/*  36:    */   }
/*  37:    */   
/*  38:    */   public brt j(wv paramwv)
/*  39:    */   {
/*  40: 56 */     return paramwv.aQ();
/*  41:    */   }
/*  42:    */   
/*  43:    */   public brt S()
/*  44:    */   {
/*  45: 61 */     return aQ();
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean ae()
/*  49:    */   {
/*  50: 66 */     return true;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public adu(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  54:    */   {
/*  55: 70 */     this(paramaqu);
/*  56: 71 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  57:    */     
/*  58: 73 */     this.v = 0.0D;
/*  59: 74 */     this.w = 0.0D;
/*  60: 75 */     this.x = 0.0D;
/*  61:    */     
/*  62: 77 */     this.p = paramDouble1;
/*  63: 78 */     this.q = paramDouble2;
/*  64: 79 */     this.r = paramDouble3;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public double an()
/*  68:    */   {
/*  69: 84 */     return this.K * 0.0D - 0.300000011920929D;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public boolean a(wh paramwh, float paramFloat)
/*  73:    */   {
/*  74: 89 */     if (b(paramwh)) {
/*  75: 90 */       return false;
/*  76:    */     }
/*  77: 92 */     if ((this.o.D) || (this.I)) {
/*  78: 93 */       return true;
/*  79:    */     }
/*  80: 95 */     if ((this.l != null) && (this.l == paramwh.j()) && ((paramwh instanceof wj))) {
/*  81: 96 */       return false;
/*  82:    */     }
/*  83: 98 */     b(-m());
/*  84: 99 */     a(10);
/*  85:100 */     a(j() + paramFloat * 10.0F);
/*  86:101 */     ac();
/*  87:102 */     int j = ((paramwh.j() instanceof ahd)) && (((ahd)paramwh.j()).by.d) ? 1 : 0;
/*  88:103 */     if ((j != 0) || (j() > 40.0F))
/*  89:    */     {
/*  90:104 */       if (this.l != null) {
/*  91:105 */         this.l.a(this);
/*  92:    */       }
/*  93:107 */       if (j == 0) {
/*  94:108 */         a(amk.aE, 1, 0.0F);
/*  95:    */       }
/*  96:110 */       J();
/*  97:    */     }
/*  98:112 */     return true;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void as()
/* 102:    */   {
/* 103:117 */     b(-m());
/* 104:118 */     a(10);
/* 105:119 */     a(j() * 11.0F);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean ad()
/* 109:    */   {
/* 110:124 */     return !this.I;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 114:    */   {
/* 115:133 */     if ((paramBoolean) && (this.l != null))
/* 116:    */     {
/* 117:135 */       this.p = (this.s = paramDouble1);
/* 118:136 */       this.q = (this.t = paramDouble2);
/* 119:137 */       this.r = (this.u = paramDouble3);
/* 120:138 */       this.y = paramFloat1;
/* 121:139 */       this.z = paramFloat2;
/* 122:140 */       this.c = 0;
/* 123:141 */       b(paramDouble1, paramDouble2, paramDouble3);
/* 124:    */       
/* 125:143 */       this.v = (this.i = 0.0D);
/* 126:144 */       this.w = (this.ap = 0.0D);
/* 127:145 */       this.x = (this.aq = 0.0D);
/* 128:    */       
/* 129:147 */       return;
/* 130:    */     }
/* 131:148 */     if (this.a)
/* 132:    */     {
/* 133:149 */       this.c = (paramInt + 5);
/* 134:    */     }
/* 135:    */     else
/* 136:    */     {
/* 137:151 */       double d1 = paramDouble1 - this.s;
/* 138:152 */       double d2 = paramDouble2 - this.t;
/* 139:153 */       double d3 = paramDouble3 - this.u;
/* 140:154 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 141:156 */       if (d4 > 1.0D) {
/* 142:157 */         this.c = 3;
/* 143:    */       } else {
/* 144:159 */         return;
/* 145:    */       }
/* 146:    */     }
/* 147:163 */     this.d = paramDouble1;
/* 148:164 */     this.e = paramDouble2;
/* 149:165 */     this.f = paramDouble3;
/* 150:166 */     this.g = paramFloat1;
/* 151:167 */     this.h = paramFloat2;
/* 152:    */     
/* 153:169 */     this.v = this.i;
/* 154:170 */     this.w = this.ap;
/* 155:171 */     this.x = this.aq;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 159:    */   {
/* 160:176 */     this.i = (this.v = paramDouble1);
/* 161:177 */     this.ap = (this.w = paramDouble2);
/* 162:178 */     this.aq = (this.x = paramDouble3);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void s_()
/* 166:    */   {
/* 167:183 */     super.s_();
/* 168:184 */     if (l() > 0) {
/* 169:185 */       a(l() - 1);
/* 170:    */     }
/* 171:187 */     if (j() > 0.0F) {
/* 172:188 */       a(j() - 1.0F);
/* 173:    */     }
/* 174:190 */     this.p = this.s;
/* 175:191 */     this.q = this.t;
/* 176:192 */     this.r = this.u;
/* 177:    */     
/* 178:194 */     int j = 5;
/* 179:195 */     double d1 = 0.0D;
/* 180:196 */     for (int k = 0; k < j; k++)
/* 181:    */     {
/* 182:197 */       double d3 = aQ().b + (aQ().e - aQ().b) * (k + 0) / j - 0.125D;
/* 183:198 */       double d6 = aQ().b + (aQ().e - aQ().b) * (k + 1) / j - 0.125D;
/* 184:199 */       brt localbrt = new brt(aQ().a, d3, aQ().c, aQ().d, d6, aQ().f);
/* 185:200 */       if (this.o.b(localbrt, bof.h)) {
/* 186:201 */         d1 += 1.0D / j;
/* 187:    */       }
/* 188:    */     }
/* 189:205 */     double d2 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 190:    */     double d4;
/* 191:    */     double d7;
/* 192:207 */     if (d2 > 0.2975D)
/* 193:    */     {
/* 194:208 */       d4 = Math.cos(this.y * 3.141592653589793D / 180.0D);
/* 195:209 */       d7 = Math.sin(this.y * 3.141592653589793D / 180.0D);
/* 196:211 */       for (int i1 = 0; i1 < 1.0D + d2 * 60.0D; i1++)
/* 197:    */       {
/* 198:212 */         double d11 = this.V.nextFloat() * 2.0F - 1.0F;
/* 199:    */         
/* 200:214 */         double d14 = (this.V.nextInt(2) * 2 - 1) * 0.7D;
/* 201:    */         double d16;
/* 202:    */         double d17;
/* 203:215 */         if (this.V.nextBoolean())
/* 204:    */         {
/* 205:216 */           d16 = this.s - d4 * d11 * 0.8D + d7 * d14;
/* 206:217 */           d17 = this.u - d7 * d11 * 0.8D - d4 * d14;
/* 207:218 */           this.o.a(ew.f, d16, this.t - 0.125D, d17, this.v, this.w, this.x, new int[0]);
/* 208:    */         }
/* 209:    */         else
/* 210:    */         {
/* 211:220 */           d16 = this.s + d4 + d7 * d11 * 0.7D;
/* 212:221 */           d17 = this.u + d7 - d4 * d11 * 0.7D;
/* 213:222 */           this.o.a(ew.f, d16, this.t - 0.125D, d17, this.v, this.w, this.x, new int[0]);
/* 214:    */         }
/* 215:    */       }
/* 216:    */     }
/* 217:227 */     if ((this.o.D) && (this.a))
/* 218:    */     {
/* 219:    */       double d9;
/* 220:228 */       if (this.c > 0)
/* 221:    */       {
/* 222:229 */         d4 = this.s + (this.d - this.s) / this.c;
/* 223:230 */         d7 = this.t + (this.e - this.t) / this.c;
/* 224:231 */         d9 = this.u + (this.f - this.u) / this.c;
/* 225:    */         
/* 226:233 */         double d12 = uv.g(this.g - this.y);
/* 227:    */         
/* 228:235 */         this.y = ((float)(this.y + d12 / this.c));
/* 229:236 */         this.z = ((float)(this.z + (this.h - this.z) / this.c));
/* 230:    */         
/* 231:238 */         this.c -= 1;
/* 232:239 */         b(d4, d7, d9);
/* 233:240 */         b(this.y, this.z);
/* 234:    */       }
/* 235:    */       else
/* 236:    */       {
/* 237:242 */         d4 = this.s + this.v;
/* 238:243 */         d7 = this.t + this.w;
/* 239:244 */         d9 = this.u + this.x;
/* 240:245 */         b(d4, d7, d9);
/* 241:246 */         if (this.C)
/* 242:    */         {
/* 243:247 */           this.v *= 0.5D;
/* 244:248 */           this.w *= 0.5D;
/* 245:249 */           this.x *= 0.5D;
/* 246:    */         }
/* 247:251 */         this.v *= 0.9900000095367432D;
/* 248:252 */         this.w *= 0.949999988079071D;
/* 249:253 */         this.x *= 0.9900000095367432D;
/* 250:    */       }
/* 251:256 */       return;
/* 252:    */     }
/* 253:259 */     if (d1 < 1.0D)
/* 254:    */     {
/* 255:260 */       d4 = d1 * 2.0D - 1.0D;
/* 256:261 */       this.w += 0.03999999910593033D * d4;
/* 257:    */     }
/* 258:    */     else
/* 259:    */     {
/* 260:263 */       if (this.w < 0.0D) {
/* 261:264 */         this.w /= 2.0D;
/* 262:    */       }
/* 263:266 */       this.w += 0.007000000216066837D;
/* 264:    */     }
/* 265:269 */     if ((this.l instanceof xm))
/* 266:    */     {
/* 267:270 */       xm localxm = (xm)this.l;
/* 268:271 */       float f1 = this.l.y + -localxm.aX * 90.0F;
/* 269:272 */       this.v += -Math.sin(f1 * 3.141593F / 180.0F) * this.b * localxm.aY * 0.0500000007450581D;
/* 270:273 */       this.x += Math.cos(f1 * 3.141593F / 180.0F) * this.b * localxm.aY * 0.0500000007450581D;
/* 271:    */     }
/* 272:276 */     double d5 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 273:278 */     if (d5 > 0.35D)
/* 274:    */     {
/* 275:279 */       d7 = 0.35D / d5;
/* 276:    */       
/* 277:281 */       this.v *= d7;
/* 278:282 */       this.x *= d7;
/* 279:283 */       d5 = 0.35D;
/* 280:    */     }
/* 281:286 */     if ((d5 > d2) && (this.b < 0.35D))
/* 282:    */     {
/* 283:287 */       this.b += (0.35D - this.b) / 35.0D;
/* 284:288 */       if (this.b > 0.35D) {
/* 285:289 */         this.b = 0.35D;
/* 286:    */       }
/* 287:    */     }
/* 288:    */     else
/* 289:    */     {
/* 290:292 */       this.b -= (this.b - 0.07000000000000001D) / 35.0D;
/* 291:293 */       if (this.b < 0.07000000000000001D) {
/* 292:294 */         this.b = 0.07000000000000001D;
/* 293:    */       }
/* 294:    */     }
/* 295:298 */     for (int m = 0; m < 4; m++)
/* 296:    */     {
/* 297:299 */       int n = uv.c(this.s + (m % 2 - 0.5D) * 0.8D);
/* 298:300 */       int i2 = uv.c(this.u + (m / 2 - 0.5D) * 0.8D);
/* 299:302 */       for (int i3 = 0; i3 < 2; i3++)
/* 300:    */       {
/* 301:303 */         int i4 = uv.c(this.t) + i3;
/* 302:    */         
/* 303:305 */         dt localdt = new dt(n, i4, i2);
/* 304:306 */         atr localatr = this.o.p(localdt).c();
/* 305:307 */         if (localatr == aty.aH)
/* 306:    */         {
/* 307:308 */           this.o.g(localdt);
/* 308:309 */           this.D = false;
/* 309:    */         }
/* 310:310 */         else if (localatr == aty.bx)
/* 311:    */         {
/* 312:311 */           this.o.b(localdt, true);
/* 313:312 */           this.D = false;
/* 314:    */         }
/* 315:    */       }
/* 316:    */     }
/* 317:317 */     if (this.C)
/* 318:    */     {
/* 319:318 */       this.v *= 0.5D;
/* 320:319 */       this.w *= 0.5D;
/* 321:320 */       this.x *= 0.5D;
/* 322:    */     }
/* 323:322 */     d(this.v, this.w, this.x);
/* 324:324 */     if ((this.D) && (d2 > 0.2D))
/* 325:    */     {
/* 326:325 */       if ((!this.o.D) && (!this.I))
/* 327:    */       {
/* 328:326 */         J();
/* 329:327 */         for (m = 0; m < 3; m++) {
/* 330:328 */           a(alq.a(aty.f), 1, 0.0F);
/* 331:    */         }
/* 332:330 */         for (m = 0; m < 2; m++) {
/* 333:331 */           a(amk.y, 1, 0.0F);
/* 334:    */         }
/* 335:    */       }
/* 336:    */     }
/* 337:    */     else
/* 338:    */     {
/* 339:335 */       this.v *= 0.9900000095367432D;
/* 340:336 */       this.w *= 0.949999988079071D;
/* 341:337 */       this.x *= 0.9900000095367432D;
/* 342:    */     }
/* 343:340 */     this.z = 0.0F;
/* 344:341 */     double d8 = this.y;
/* 345:342 */     double d10 = this.p - this.s;
/* 346:343 */     double d13 = this.r - this.u;
/* 347:344 */     if (d10 * d10 + d13 * d13 > 0.001D) {
/* 348:345 */       d8 = (float)(Math.atan2(d13, d10) * 180.0D / 3.141592653589793D);
/* 349:    */     }
/* 350:348 */     double d15 = uv.g(d8 - this.y);
/* 351:350 */     if (d15 > 20.0D) {
/* 352:351 */       d15 = 20.0D;
/* 353:    */     }
/* 354:353 */     if (d15 < -20.0D) {
/* 355:354 */       d15 = -20.0D;
/* 356:    */     }
/* 357:357 */     this.y = ((float)(this.y + d15));
/* 358:358 */     b(this.y, this.z);
/* 359:360 */     if (this.o.D) {
/* 360:361 */       return;
/* 361:    */     }
/* 362:364 */     List localList = this.o.b(this, aQ().b(0.2000000029802322D, 0.0D, 0.2000000029802322D));
/* 363:365 */     if ((localList != null) && (!localList.isEmpty())) {
/* 364:366 */       for (int i5 = 0; i5 < localList.size(); i5++)
/* 365:    */       {
/* 366:367 */         wv localwv = (wv)localList.get(i5);
/* 367:368 */         if ((localwv != this.l) && (localwv.ae()) && ((localwv instanceof adu))) {
/* 368:369 */           localwv.i(this);
/* 369:    */         }
/* 370:    */       }
/* 371:    */     }
/* 372:374 */     if ((this.l != null) && 
/* 373:375 */       (this.l.I)) {
/* 374:376 */       this.l = null;
/* 375:    */     }
/* 376:    */   }
/* 377:    */   
/* 378:    */   public void al()
/* 379:    */   {
/* 380:383 */     if (this.l == null) {
/* 381:384 */       return;
/* 382:    */     }
/* 383:387 */     double d1 = Math.cos(this.y * 3.141592653589793D / 180.0D) * 0.4D;
/* 384:388 */     double d2 = Math.sin(this.y * 3.141592653589793D / 180.0D) * 0.4D;
/* 385:389 */     this.l.b(this.s + d1, this.t + an() + this.l.am(), this.u + d2);
/* 386:    */   }
/* 387:    */   
/* 388:    */   protected void b(fn paramfn) {}
/* 389:    */   
/* 390:    */   protected void a(fn paramfn) {}
/* 391:    */   
/* 392:    */   public boolean e(ahd paramahd)
/* 393:    */   {
/* 394:402 */     if ((this.l != null) && ((this.l instanceof ahd)) && (this.l != paramahd)) {
/* 395:403 */       return true;
/* 396:    */     }
/* 397:405 */     if (!this.o.D) {
/* 398:406 */       paramahd.a(this);
/* 399:    */     }
/* 400:408 */     return true;
/* 401:    */   }
/* 402:    */   
/* 403:    */   protected void a(double paramDouble, boolean paramBoolean, atr paramatr, dt paramdt)
/* 404:    */   {
/* 405:413 */     if (paramBoolean)
/* 406:    */     {
/* 407:414 */       if (this.O > 3.0F)
/* 408:    */       {
/* 409:415 */         e(this.O, 1.0F);
/* 410:416 */         if ((!this.o.D) && (!this.I))
/* 411:    */         {
/* 412:417 */           J();
/* 413:418 */           for (int j = 0; j < 3; j++) {
/* 414:419 */             a(alq.a(aty.f), 1, 0.0F);
/* 415:    */           }
/* 416:421 */           for (j = 0; j < 2; j++) {
/* 417:422 */             a(amk.y, 1, 0.0F);
/* 418:    */           }
/* 419:    */         }
/* 420:425 */         this.O = 0.0F;
/* 421:    */       }
/* 422:    */     }
/* 423:427 */     else if ((this.o.p(new dt(this).b()).c().r() != bof.h) && 
/* 424:428 */       (paramDouble < 0.0D)) {
/* 425:429 */       this.O = ((float)(this.O - paramDouble));
/* 426:    */     }
/* 427:    */   }
/* 428:    */   
/* 429:    */   public void a(float paramFloat)
/* 430:    */   {
/* 431:435 */     this.ac.b(19, Float.valueOf(paramFloat));
/* 432:    */   }
/* 433:    */   
/* 434:    */   public float j()
/* 435:    */   {
/* 436:439 */     return this.ac.d(19);
/* 437:    */   }
/* 438:    */   
/* 439:    */   public void a(int paramInt)
/* 440:    */   {
/* 441:443 */     this.ac.b(17, Integer.valueOf(paramInt));
/* 442:    */   }
/* 443:    */   
/* 444:    */   public int l()
/* 445:    */   {
/* 446:447 */     return this.ac.c(17);
/* 447:    */   }
/* 448:    */   
/* 449:    */   public void b(int paramInt)
/* 450:    */   {
/* 451:451 */     this.ac.b(18, Integer.valueOf(paramInt));
/* 452:    */   }
/* 453:    */   
/* 454:    */   public int m()
/* 455:    */   {
/* 456:455 */     return this.ac.c(18);
/* 457:    */   }
/* 458:    */   
/* 459:    */   public void a(boolean paramBoolean)
/* 460:    */   {
/* 461:463 */     this.a = paramBoolean;
/* 462:    */   }
/* 463:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adu
 * JD-Core Version:    0.7.0.1
 */