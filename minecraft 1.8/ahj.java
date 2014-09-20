/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class ahj
/*   5:    */   extends wv
/*   6:    */   implements aho
/*   7:    */ {
/*   8: 41 */   private int d = -1;
/*   9: 42 */   private int e = -1;
/*  10: 43 */   private int f = -1;
/*  11:    */   private atr g;
/*  12:    */   private int h;
/*  13:    */   private boolean i;
/*  14:    */   public int a;
/*  15:    */   public int b;
/*  16:    */   public wv c;
/*  17:    */   private int ap;
/*  18:    */   private int aq;
/*  19: 52 */   private double ar = 2.0D;
/*  20:    */   private int as;
/*  21:    */   
/*  22:    */   public ahj(aqu paramaqu)
/*  23:    */   {
/*  24: 57 */     super(paramaqu);
/*  25: 58 */     this.j = 10.0D;
/*  26: 59 */     a(0.5F, 0.5F);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public ahj(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  30:    */   {
/*  31: 63 */     super(paramaqu);
/*  32: 64 */     this.j = 10.0D;
/*  33:    */     
/*  34: 66 */     a(0.5F, 0.5F);
/*  35:    */     
/*  36: 68 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public ahj(aqu paramaqu, xm paramxm1, xm paramxm2, float paramFloat1, float paramFloat2)
/*  40:    */   {
/*  41: 72 */     super(paramaqu);
/*  42: 73 */     this.j = 10.0D;
/*  43: 74 */     this.c = paramxm1;
/*  44: 75 */     if ((paramxm1 instanceof ahd)) {
/*  45: 76 */       this.a = 1;
/*  46:    */     }
/*  47: 79 */     this.t = (paramxm1.t + paramxm1.aR() - 0.1000000014901161D);
/*  48:    */     
/*  49: 81 */     double d1 = paramxm2.s - paramxm1.s;
/*  50: 82 */     double d2 = paramxm2.aQ().b + paramxm2.K / 3.0F - this.t;
/*  51: 83 */     double d3 = paramxm2.u - paramxm1.u;
/*  52: 84 */     double d4 = uv.a(d1 * d1 + d3 * d3);
/*  53: 85 */     if (d4 < 1.0E-007D) {
/*  54: 86 */       return;
/*  55:    */     }
/*  56: 89 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.141592741012573D) - 90.0F;
/*  57: 90 */     float f2 = (float)-(Math.atan2(d2, d4) * 180.0D / 3.141592741012573D);
/*  58:    */     
/*  59: 92 */     double d5 = d1 / d4;
/*  60: 93 */     double d6 = d3 / d4;
/*  61: 94 */     b(paramxm1.s + d5, this.t, paramxm1.u + d6, f1, f2);
/*  62:    */     
/*  63: 96 */     float f3 = (float)(d4 * 0.2000000029802322D);
/*  64: 97 */     c(d1, d2 + f3, d3, paramFloat1, paramFloat2);
/*  65:    */   }
/*  66:    */   
/*  67:    */   public ahj(aqu paramaqu, xm paramxm, float paramFloat)
/*  68:    */   {
/*  69:101 */     super(paramaqu);
/*  70:102 */     this.j = 10.0D;
/*  71:103 */     this.c = paramxm;
/*  72:104 */     if ((paramxm instanceof ahd)) {
/*  73:105 */       this.a = 1;
/*  74:    */     }
/*  75:108 */     a(0.5F, 0.5F);
/*  76:    */     
/*  77:110 */     b(paramxm.s, paramxm.t + paramxm.aR(), paramxm.u, paramxm.y, paramxm.z);
/*  78:    */     
/*  79:112 */     this.s -= uv.b(this.y / 180.0F * 3.141593F) * 0.16F;
/*  80:113 */     this.t -= 0.1000000014901161D;
/*  81:114 */     this.u -= uv.a(this.y / 180.0F * 3.141593F) * 0.16F;
/*  82:115 */     b(this.s, this.t, this.u);
/*  83:    */     
/*  84:117 */     this.v = (-uv.a(this.y / 180.0F * 3.141593F) * uv.b(this.z / 180.0F * 3.141593F));
/*  85:118 */     this.x = (uv.b(this.y / 180.0F * 3.141593F) * uv.b(this.z / 180.0F * 3.141593F));
/*  86:119 */     this.w = (-uv.a(this.z / 180.0F * 3.141593F));
/*  87:    */     
/*  88:121 */     c(this.v, this.w, this.x, paramFloat * 1.5F, 1.0F);
/*  89:    */   }
/*  90:    */   
/*  91:    */   protected void h()
/*  92:    */   {
/*  93:126 */     this.ac.a(16, Byte.valueOf((byte)0));
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  97:    */   {
/*  98:131 */     float f1 = uv.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  99:    */     
/* 100:133 */     paramDouble1 /= f1;
/* 101:134 */     paramDouble2 /= f1;
/* 102:135 */     paramDouble3 /= f1;
/* 103:    */     
/* 104:137 */     paramDouble1 += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/* 105:138 */     paramDouble2 += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/* 106:139 */     paramDouble3 += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/* 107:    */     
/* 108:141 */     paramDouble1 *= paramFloat1;
/* 109:142 */     paramDouble2 *= paramFloat1;
/* 110:143 */     paramDouble3 *= paramFloat1;
/* 111:    */     
/* 112:145 */     this.v = paramDouble1;
/* 113:146 */     this.w = paramDouble2;
/* 114:147 */     this.x = paramDouble3;
/* 115:    */     
/* 116:149 */     float f2 = uv.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 117:    */     
/* 118:151 */     this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/* 119:152 */     this.B = (this.z = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.141592741012573D));
/* 120:153 */     this.ap = 0;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 124:    */   {
/* 125:158 */     b(paramDouble1, paramDouble2, paramDouble3);
/* 126:159 */     b(paramFloat1, paramFloat2);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 130:    */   {
/* 131:164 */     this.v = paramDouble1;
/* 132:165 */     this.w = paramDouble2;
/* 133:166 */     this.x = paramDouble3;
/* 134:167 */     if ((this.B == 0.0F) && (this.A == 0.0F))
/* 135:    */     {
/* 136:168 */       float f1 = uv.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 137:169 */       this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/* 138:170 */       this.B = (this.z = (float)(Math.atan2(paramDouble2, f1) * 180.0D / 3.141592741012573D));
/* 139:171 */       this.B = this.z;
/* 140:172 */       this.A = this.y;
/* 141:173 */       b(this.s, this.t, this.u, this.y, this.z);
/* 142:174 */       this.ap = 0;
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void s_()
/* 147:    */   {
/* 148:180 */     super.s_();
/* 149:182 */     if ((this.B == 0.0F) && (this.A == 0.0F))
/* 150:    */     {
/* 151:183 */       float f1 = uv.a(this.v * this.v + this.x * this.x);
/* 152:184 */       this.A = (this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.141592741012573D));
/* 153:185 */       this.B = (this.z = (float)(Math.atan2(this.w, f1) * 180.0D / 3.141592741012573D));
/* 154:    */     }
/* 155:188 */     dt localdt1 = new dt(this.d, this.e, this.f);
/* 156:189 */     bec localbec = this.o.p(localdt1);
/* 157:190 */     atr localatr = localbec.c();
/* 158:191 */     if (localatr.r() != bof.a)
/* 159:    */     {
/* 160:192 */       localatr.a(this.o, localdt1);
/* 161:193 */       brt localbrt = localatr.a(this.o, localdt1, localbec);
/* 162:194 */       if ((localbrt != null) && (localbrt.a(new brw(this.s, this.t, this.u)))) {
/* 163:195 */         this.i = true;
/* 164:    */       }
/* 165:    */     }
/* 166:199 */     if (this.b > 0) {
/* 167:200 */       this.b -= 1;
/* 168:    */     }
/* 169:203 */     if (this.i)
/* 170:    */     {
/* 171:204 */       int j = localatr.c(localbec);
/* 172:205 */       if ((localatr != this.g) || (j != this.h))
/* 173:    */       {
/* 174:206 */         this.i = false;
/* 175:    */         
/* 176:208 */         this.v *= this.V.nextFloat() * 0.2F;
/* 177:209 */         this.w *= this.V.nextFloat() * 0.2F;
/* 178:210 */         this.x *= this.V.nextFloat() * 0.2F;
/* 179:211 */         this.ap = 0;
/* 180:212 */         this.aq = 0;
/* 181:213 */         return;
/* 182:    */       }
/* 183:215 */       this.ap += 1;
/* 184:216 */       if (this.ap >= 1200) {
/* 185:217 */         J();
/* 186:    */       }
/* 187:219 */       return;
/* 188:    */     }
/* 189:222 */     this.aq += 1;
/* 190:    */     
/* 191:    */ 
/* 192:225 */     brw localbrw1 = new brw(this.s, this.t, this.u);
/* 193:226 */     brw localbrw2 = new brw(this.s + this.v, this.t + this.w, this.u + this.x);
/* 194:227 */     bru localbru1 = this.o.a(localbrw1, localbrw2, false, true, false);
/* 195:    */     
/* 196:229 */     localbrw1 = new brw(this.s, this.t, this.u);
/* 197:230 */     localbrw2 = new brw(this.s + this.v, this.t + this.w, this.u + this.x);
/* 198:231 */     if (localbru1 != null) {
/* 199:232 */       localbrw2 = new brw(localbru1.c.a, localbru1.c.b, localbru1.c.c);
/* 200:    */     }
/* 201:234 */     Object localObject1 = null;
/* 202:235 */     List localList = this.o.b(this, aQ().a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
/* 203:236 */     double d1 = 0.0D;
/* 204:    */     Object localObject2;
/* 205:237 */     for (int k = 0; k < localList.size(); k++)
/* 206:    */     {
/* 207:238 */       wv localwv = (wv)localList.get(k);
/* 208:239 */       if ((localwv.ad()) && ((localwv != this.c) || (this.aq >= 5)))
/* 209:    */       {
/* 210:243 */         float f5 = 0.3F;
/* 211:244 */         localObject2 = localwv.aQ().b(f5, f5, f5);
/* 212:245 */         bru localbru2 = ((brt)localObject2).a(localbrw1, localbrw2);
/* 213:246 */         if (localbru2 != null)
/* 214:    */         {
/* 215:247 */           double d2 = localbrw1.f(localbru2.c);
/* 216:248 */           if ((d2 < d1) || (d1 == 0.0D))
/* 217:    */           {
/* 218:249 */             localObject1 = localwv;
/* 219:250 */             d1 = d2;
/* 220:    */           }
/* 221:    */         }
/* 222:    */       }
/* 223:    */     }
/* 224:255 */     if (localObject1 != null) {
/* 225:256 */       localbru1 = new bru(localObject1);
/* 226:    */     }
/* 227:259 */     if ((localbru1 != null) && (localbru1.d != null) && ((localbru1.d instanceof ahd)))
/* 228:    */     {
/* 229:260 */       ahd localahd = (ahd)localbru1.d;
/* 230:261 */       if ((localahd.by.a) || (((this.c instanceof ahd)) && (!((ahd)this.c).a(localahd)))) {
/* 231:262 */         localbru1 = null;
/* 232:    */       }
/* 233:    */     }
/* 234:    */     float f7;
/* 235:266 */     if (localbru1 != null) {
/* 236:267 */       if (localbru1.d != null)
/* 237:    */       {
/* 238:268 */         float f2 = uv.a(this.v * this.v + this.w * this.w + this.x * this.x);
/* 239:269 */         int n = uv.f(f2 * this.ar);
/* 240:271 */         if (l()) {
/* 241:272 */           n += this.V.nextInt(n / 2 + 2);
/* 242:    */         }
/* 243:    */         wh localwh;
/* 244:276 */         if (this.c == null) {
/* 245:277 */           localwh = wh.a(this, this);
/* 246:    */         } else {
/* 247:279 */           localwh = wh.a(this, this.c);
/* 248:    */         }
/* 249:284 */         if ((au()) && (!(localbru1.d instanceof aer))) {
/* 250:285 */           localbru1.d.e(5);
/* 251:    */         }
/* 252:287 */         if (localbru1.d.a(localwh, n))
/* 253:    */         {
/* 254:288 */           if ((localbru1.d instanceof xm))
/* 255:    */           {
/* 256:289 */             localObject2 = (xm)localbru1.d;
/* 257:291 */             if (!this.o.D) {
/* 258:292 */               ((xm)localObject2).o(((xm)localObject2).bu() + 1);
/* 259:    */             }
/* 260:295 */             if (this.as > 0)
/* 261:    */             {
/* 262:296 */               f7 = uv.a(this.v * this.v + this.x * this.x);
/* 263:297 */               if (f7 > 0.0F) {
/* 264:298 */                 localbru1.d.g(this.v * this.as * 0.6000000238418579D / f7, 0.1D, this.x * this.as * 0.6000000238418579D / f7);
/* 265:    */               }
/* 266:    */             }
/* 267:302 */             if ((this.c instanceof xm))
/* 268:    */             {
/* 269:303 */               aph.a((xm)localObject2, this.c);
/* 270:304 */               aph.b((xm)this.c, (wv)localObject2);
/* 271:    */             }
/* 272:307 */             if ((this.c != null) && (localbru1.d != this.c) && ((localbru1.d instanceof ahd)) && ((this.c instanceof qw))) {
/* 273:308 */               ((qw)this.c).a.a(new jo(6, 0.0F));
/* 274:    */             }
/* 275:    */           }
/* 276:311 */           a("random.bowhit", 1.0F, 1.2F / (this.V.nextFloat() * 0.2F + 0.9F));
/* 277:312 */           if (!(localbru1.d instanceof aer)) {
/* 278:313 */             J();
/* 279:    */           }
/* 280:    */         }
/* 281:    */         else
/* 282:    */         {
/* 283:316 */           this.v *= -0.1000000014901161D;
/* 284:317 */           this.w *= -0.1000000014901161D;
/* 285:318 */           this.x *= -0.1000000014901161D;
/* 286:319 */           this.y += 180.0F;
/* 287:320 */           this.A += 180.0F;
/* 288:321 */           this.aq = 0;
/* 289:    */         }
/* 290:    */       }
/* 291:    */       else
/* 292:    */       {
/* 293:324 */         dt localdt2 = localbru1.a();
/* 294:325 */         this.d = localdt2.n();
/* 295:326 */         this.e = localdt2.o();
/* 296:327 */         this.f = localdt2.p();
/* 297:328 */         localbec = this.o.p(localdt2);
/* 298:329 */         this.g = localbec.c();
/* 299:330 */         this.h = this.g.c(localbec);
/* 300:331 */         this.v = ((float)(localbru1.c.a - this.s));
/* 301:332 */         this.w = ((float)(localbru1.c.b - this.t));
/* 302:333 */         this.x = ((float)(localbru1.c.c - this.u));
/* 303:334 */         f4 = uv.a(this.v * this.v + this.w * this.w + this.x * this.x);
/* 304:335 */         this.s -= this.v / f4 * 0.0500000007450581D;
/* 305:336 */         this.t -= this.w / f4 * 0.0500000007450581D;
/* 306:337 */         this.u -= this.x / f4 * 0.0500000007450581D;
/* 307:    */         
/* 308:339 */         a("random.bowhit", 1.0F, 1.2F / (this.V.nextFloat() * 0.2F + 0.9F));
/* 309:340 */         this.i = true;
/* 310:341 */         this.b = 7;
/* 311:342 */         a(false);
/* 312:344 */         if (this.g.r() != bof.a) {
/* 313:345 */           this.g.a(this.o, localdt2, localbec, this);
/* 314:    */         }
/* 315:    */       }
/* 316:    */     }
/* 317:350 */     if (l()) {
/* 318:351 */       for (int m = 0; m < 4; m++) {
/* 319:352 */         this.o.a(ew.j, this.s + this.v * m / 4.0D, this.t + this.w * m / 4.0D, this.u + this.x * m / 4.0D, -this.v, -this.w + 0.2D, -this.x, new int[0]);
/* 320:    */       }
/* 321:    */     }
/* 322:356 */     this.s += this.v;
/* 323:357 */     this.t += this.w;
/* 324:358 */     this.u += this.x;
/* 325:    */     
/* 326:360 */     float f3 = uv.a(this.v * this.v + this.x * this.x);
/* 327:361 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.141592741012573D));
/* 328:362 */     this.z = ((float)(Math.atan2(this.w, f3) * 180.0D / 3.141592741012573D));
/* 329:364 */     while (this.z - this.B < -180.0F) {
/* 330:365 */       this.B -= 360.0F;
/* 331:    */     }
/* 332:367 */     while (this.z - this.B >= 180.0F) {
/* 333:368 */       this.B += 360.0F;
/* 334:    */     }
/* 335:371 */     while (this.y - this.A < -180.0F) {
/* 336:372 */       this.A -= 360.0F;
/* 337:    */     }
/* 338:374 */     while (this.y - this.A >= 180.0F) {
/* 339:375 */       this.A += 360.0F;
/* 340:    */     }
/* 341:378 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 342:379 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/* 343:    */     
/* 344:381 */     float f4 = 0.99F;
/* 345:382 */     float f6 = 0.05F;
/* 346:384 */     if (V())
/* 347:    */     {
/* 348:385 */       for (int i1 = 0; i1 < 4; i1++)
/* 349:    */       {
/* 350:386 */         f7 = 0.25F;
/* 351:387 */         this.o.a(ew.e, this.s - this.v * f7, this.t - this.w * f7, this.u - this.x * f7, this.v, this.w, this.x, new int[0]);
/* 352:    */       }
/* 353:389 */       f4 = 0.6F;
/* 354:    */     }
/* 355:392 */     if (U()) {
/* 356:393 */       N();
/* 357:    */     }
/* 358:396 */     this.v *= f4;
/* 359:397 */     this.w *= f4;
/* 360:398 */     this.x *= f4;
/* 361:399 */     this.w -= f6;
/* 362:    */     
/* 363:401 */     b(this.s, this.t, this.u);
/* 364:    */     
/* 365:403 */     Q();
/* 366:    */   }
/* 367:    */   
/* 368:    */   public void b(fn paramfn)
/* 369:    */   {
/* 370:408 */     paramfn.a("xTile", (short)this.d);
/* 371:409 */     paramfn.a("yTile", (short)this.e);
/* 372:410 */     paramfn.a("zTile", (short)this.f);
/* 373:411 */     paramfn.a("life", (short)this.ap);
/* 374:412 */     oa localoa = (oa)atr.c.c(this.g);
/* 375:413 */     paramfn.a("inTile", localoa == null ? "" : localoa.toString());
/* 376:414 */     paramfn.a("inData", (byte)this.h);
/* 377:415 */     paramfn.a("shake", (byte)this.b);
/* 378:416 */     paramfn.a("inGround", (byte)(this.i ? 1 : 0));
/* 379:417 */     paramfn.a("pickup", (byte)this.a);
/* 380:418 */     paramfn.a("damage", this.ar);
/* 381:    */   }
/* 382:    */   
/* 383:    */   public void a(fn paramfn)
/* 384:    */   {
/* 385:423 */     this.d = paramfn.e("xTile");
/* 386:424 */     this.e = paramfn.e("yTile");
/* 387:425 */     this.f = paramfn.e("zTile");
/* 388:426 */     this.ap = paramfn.e("life");
/* 389:427 */     if (paramfn.b("inTile", 8)) {
/* 390:428 */       this.g = atr.b(paramfn.j("inTile"));
/* 391:    */     } else {
/* 392:430 */       this.g = atr.c(paramfn.d("inTile") & 0xFF);
/* 393:    */     }
/* 394:432 */     this.h = (paramfn.d("inData") & 0xFF);
/* 395:433 */     this.b = (paramfn.d("shake") & 0xFF);
/* 396:434 */     this.i = (paramfn.d("inGround") == 1);
/* 397:435 */     if (paramfn.b("damage", 99)) {
/* 398:436 */       this.ar = paramfn.i("damage");
/* 399:    */     }
/* 400:439 */     if (paramfn.b("pickup", 99)) {
/* 401:440 */       this.a = paramfn.d("pickup");
/* 402:441 */     } else if (paramfn.b("player", 99)) {
/* 403:442 */       this.a = (paramfn.n("player") ? 1 : 0);
/* 404:    */     }
/* 405:    */   }
/* 406:    */   
/* 407:    */   public void d(ahd paramahd)
/* 408:    */   {
/* 409:448 */     if ((this.o.D) || (!this.i) || (this.b > 0)) {
/* 410:449 */       return;
/* 411:    */     }
/* 412:452 */     int j = (this.a == 1) || ((this.a == 2) && (paramahd.by.d)) ? 1 : 0;
/* 413:454 */     if ((this.a == 1) && 
/* 414:455 */       (!paramahd.bg.a(new amj(amk.g, 1)))) {
/* 415:456 */       j = 0;
/* 416:    */     }
/* 417:460 */     if (j != 0)
/* 418:    */     {
/* 419:461 */       a("random.pop", 0.2F, ((this.V.nextFloat() - this.V.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 420:462 */       paramahd.a(this, 1);
/* 421:463 */       J();
/* 422:    */     }
/* 423:    */   }
/* 424:    */   
/* 425:    */   protected boolean r_()
/* 426:    */   {
/* 427:469 */     return false;
/* 428:    */   }
/* 429:    */   
/* 430:    */   public void b(double paramDouble)
/* 431:    */   {
/* 432:473 */     this.ar = paramDouble;
/* 433:    */   }
/* 434:    */   
/* 435:    */   public double j()
/* 436:    */   {
/* 437:477 */     return this.ar;
/* 438:    */   }
/* 439:    */   
/* 440:    */   public void a(int paramInt)
/* 441:    */   {
/* 442:481 */     this.as = paramInt;
/* 443:    */   }
/* 444:    */   
/* 445:    */   public boolean aE()
/* 446:    */   {
/* 447:486 */     return false;
/* 448:    */   }
/* 449:    */   
/* 450:    */   public void a(boolean paramBoolean)
/* 451:    */   {
/* 452:490 */     int j = this.ac.a(16);
/* 453:491 */     if (paramBoolean) {
/* 454:492 */       this.ac.b(16, Byte.valueOf((byte)(j | 0x1)));
/* 455:    */     } else {
/* 456:494 */       this.ac.b(16, Byte.valueOf((byte)(j & 0xFFFFFFFE)));
/* 457:    */     }
/* 458:    */   }
/* 459:    */   
/* 460:    */   public boolean l()
/* 461:    */   {
/* 462:499 */     int j = this.ac.a(16);
/* 463:500 */     return (j & 0x1) != 0;
/* 464:    */   }
/* 465:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahj
 * JD-Core Version:    0.7.0.1
 */