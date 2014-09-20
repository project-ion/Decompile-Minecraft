/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.base.Predicates;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Random;
/*   5:    */ 
/*   6:    */ public class adf
/*   7:    */   extends afm
/*   8:    */   implements acx, afr
/*   9:    */ {
/*  10: 45 */   private float[] b = new float[2];
/*  11: 46 */   private float[] c = new float[2];
/*  12: 47 */   private float[] bk = new float[2];
/*  13: 48 */   private float[] bl = new float[2];
/*  14: 49 */   private int[] bm = new int[2];
/*  15: 50 */   private int[] bn = new int[2];
/*  16:    */   private int bo;
/*  17: 53 */   private static final Predicate bp = new adg();
/*  18:    */   
/*  19:    */   public adf(aqu paramaqu)
/*  20:    */   {
/*  21: 61 */     super(paramaqu);
/*  22:    */     
/*  23: 63 */     h(bt());
/*  24:    */     
/*  25: 65 */     a(0.9F, 3.5F);
/*  26:    */     
/*  27:    */ 
/*  28: 68 */     this.ab = true;
/*  29:    */     
/*  30:    */ 
/*  31:    */ 
/*  32: 72 */     ((aay)s()).d(true);
/*  33:    */     
/*  34: 74 */     this.i.a(0, new yy(this));
/*  35: 75 */     this.i.a(2, new zz(this, 1.0D, 40, 20.0F));
/*  36:    */     
/*  37: 77 */     this.i.a(5, new zy(this, 1.0D));
/*  38: 78 */     this.i.a(6, new zh(this, ahd.class, 8.0F));
/*  39: 79 */     this.i.a(7, new zx(this));
/*  40:    */     
/*  41: 81 */     this.bg.a(1, new aal(this, false, new Class[0]));
/*  42: 82 */     this.bg.a(2, new aaq(this, xn.class, 0, false, false, bp));
/*  43:    */     
/*  44: 84 */     this.b_ = 50;
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected void h()
/*  48:    */   {
/*  49: 89 */     super.h();
/*  50:    */     
/*  51: 91 */     this.ac.a(17, new Integer(0));
/*  52: 92 */     this.ac.a(18, new Integer(0));
/*  53: 93 */     this.ac.a(19, new Integer(0));
/*  54: 94 */     this.ac.a(20, new Integer(0));
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void b(fn paramfn)
/*  58:    */   {
/*  59: 99 */     super.b(paramfn);
/*  60:    */     
/*  61:101 */     paramfn.a("Invul", cj());
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void a(fn paramfn)
/*  65:    */   {
/*  66:106 */     super.a(paramfn);
/*  67:    */     
/*  68:108 */     r(paramfn.f("Invul"));
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected String z()
/*  72:    */   {
/*  73:113 */     return "mob.wither.idle";
/*  74:    */   }
/*  75:    */   
/*  76:    */   protected String bn()
/*  77:    */   {
/*  78:118 */     return "mob.wither.hurt";
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected String bo()
/*  82:    */   {
/*  83:123 */     return "mob.wither.death";
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void m()
/*  87:    */   {
/*  88:128 */     this.w *= 0.6000000238418579D;
/*  89:    */     double d3;
/*  90:    */     double d5;
/*  91:    */     double d7;
/*  92:130 */     if ((!this.o.D) && (s(0) > 0))
/*  93:    */     {
/*  94:131 */       wv localwv1 = this.o.a(s(0));
/*  95:132 */       if (localwv1 != null)
/*  96:    */       {
/*  97:133 */         if ((this.t < localwv1.t) || ((!ck()) && (this.t < localwv1.t + 5.0D)))
/*  98:    */         {
/*  99:134 */           if (this.w < 0.0D) {
/* 100:135 */             this.w = 0.0D;
/* 101:    */           }
/* 102:137 */           this.w += (0.5D - this.w) * 0.6000000238418579D;
/* 103:    */         }
/* 104:140 */         double d1 = localwv1.s - this.s;
/* 105:141 */         d3 = localwv1.u - this.u;
/* 106:142 */         d5 = d1 * d1 + d3 * d3;
/* 107:143 */         if (d5 > 9.0D)
/* 108:    */         {
/* 109:144 */           d7 = uv.a(d5);
/* 110:145 */           this.v += (d1 / d7 * 0.5D - this.v) * 0.6000000238418579D;
/* 111:146 */           this.x += (d3 / d7 * 0.5D - this.x) * 0.6000000238418579D;
/* 112:    */         }
/* 113:    */       }
/* 114:    */     }
/* 115:150 */     if (this.v * this.v + this.x * this.x > 0.0500000007450581D) {
/* 116:151 */       this.y = ((float)Math.atan2(this.x, this.v) * 57.295776F - 90.0F);
/* 117:    */     }
/* 118:153 */     super.m();
/* 119:155 */     for (boolean bool = false; bool < true; bool++)
/* 120:    */     {
/* 121:156 */       this.bl[bool] = this.c[bool];
/* 122:157 */       this.bk[bool] = this.b[bool];
/* 123:    */     }
/* 124:160 */     for (bool = false; bool < true; bool++)
/* 125:    */     {
/* 126:161 */       i = s(bool + true);
/* 127:162 */       wv localwv2 = null;
/* 128:163 */       if (i > 0) {
/* 129:164 */         localwv2 = this.o.a(i);
/* 130:    */       }
/* 131:166 */       if (localwv2 != null)
/* 132:    */       {
/* 133:167 */         d3 = t(bool + true);
/* 134:168 */         d5 = u(bool + true);
/* 135:169 */         d7 = v(bool + true);
/* 136:    */         
/* 137:171 */         double d8 = localwv2.s - d3;
/* 138:172 */         double d9 = localwv2.t + localwv2.aR() - d5;
/* 139:173 */         double d10 = localwv2.u - d7;
/* 140:174 */         double d11 = uv.a(d8 * d8 + d10 * d10);
/* 141:    */         
/* 142:176 */         float f1 = (float)(Math.atan2(d10, d8) * 180.0D / 3.141592741012573D) - 90.0F;
/* 143:177 */         float f2 = (float)-(Math.atan2(d9, d11) * 180.0D / 3.141592741012573D);
/* 144:178 */         this.b[bool] = b(this.b[bool], f2, 40.0F);
/* 145:179 */         this.c[bool] = b(this.c[bool], f1, 10.0F);
/* 146:    */       }
/* 147:    */       else
/* 148:    */       {
/* 149:182 */         this.c[bool] = b(this.c[bool], this.aG, 10.0F);
/* 150:    */       }
/* 151:    */     }
/* 152:185 */     bool = ck();
/* 153:186 */     for (int i = 0; i < 3; i++)
/* 154:    */     {
/* 155:187 */       double d2 = t(i);
/* 156:188 */       double d4 = u(i);
/* 157:189 */       double d6 = v(i);
/* 158:    */       
/* 159:191 */       this.o.a(ew.l, d2 + this.V.nextGaussian() * 0.300000011920929D, d4 + this.V.nextGaussian() * 0.300000011920929D, d6 + this.V.nextGaussian() * 0.300000011920929D, 0.0D, 0.0D, 0.0D, new int[0]);
/* 160:192 */       if ((bool) && (this.o.s.nextInt(4) == 0)) {
/* 161:193 */         this.o.a(ew.p, d2 + this.V.nextGaussian() * 0.300000011920929D, d4 + this.V.nextGaussian() * 0.300000011920929D, d6 + this.V.nextGaussian() * 0.300000011920929D, 0.699999988079071D, 0.699999988079071D, 0.5D, new int[0]);
/* 162:    */       }
/* 163:    */     }
/* 164:196 */     if (cj() > 0) {
/* 165:197 */       for (i = 0; i < 3; i++) {
/* 166:198 */         this.o.a(ew.p, this.s + this.V.nextGaussian() * 1.0D, this.t + this.V.nextFloat() * 3.3F, this.u + this.V.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D, new int[0]);
/* 167:    */       }
/* 168:    */     }
/* 169:    */   }
/* 170:    */   
/* 171:    */   protected void E()
/* 172:    */   {
/* 173:205 */     if (cj() > 0)
/* 174:    */     {
/* 175:206 */       i = cj() - 1;
/* 176:208 */       if (i <= 0)
/* 177:    */       {
/* 178:209 */         this.o.a(this, this.s, this.t + aR(), this.u, 7.0F, false, this.o.Q().b("mobGriefing"));
/* 179:210 */         this.o.a(1013, new dt(this), 0);
/* 180:    */       }
/* 181:213 */       r(i);
/* 182:214 */       if (this.W % 10 == 0) {
/* 183:215 */         g(10.0F);
/* 184:    */       }
/* 185:218 */       return;
/* 186:    */     }
/* 187:221 */     super.E();
/* 188:    */     int j;
/* 189:    */     int m;
/* 190:223 */     for (int i = 1; i < 3; i++) {
/* 191:224 */       if (this.W >= this.bm[(i - 1)])
/* 192:    */       {
/* 193:225 */         this.bm[(i - 1)] = (this.W + 10 + this.V.nextInt(10));
/* 194:227 */         if ((this.o.aa() == vt.c) || (this.o.aa() == vt.d))
/* 195:    */         {
/* 196:227 */           int tmp185_184 = (i - 1); int[] tmp185_179 = this.bn; int tmp187_186 = tmp185_179[tmp185_184];tmp185_179[tmp185_184] = (tmp187_186 + 1);
/* 197:227 */           if (tmp187_186 > 15)
/* 198:    */           {
/* 199:228 */             float f1 = 10.0F;
/* 200:229 */             float f2 = 5.0F;
/* 201:230 */             double d1 = uv.a(this.V, this.s - f1, this.s + f1);
/* 202:231 */             double d2 = uv.a(this.V, this.t - f2, this.t + f2);
/* 203:232 */             double d3 = uv.a(this.V, this.u - f1, this.u + f1);
/* 204:233 */             a(i + 1, d1, d2, d3, true);
/* 205:234 */             this.bn[(i - 1)] = 0;
/* 206:    */           }
/* 207:    */         }
/* 208:237 */         j = s(i);
/* 209:    */         Object localObject;
/* 210:238 */         if (j > 0)
/* 211:    */         {
/* 212:239 */           localObject = this.o.a(j);
/* 213:240 */           if ((localObject == null) || (!((wv)localObject).ai()) || (h((wv)localObject) > 900.0D) || (!t((wv)localObject)))
/* 214:    */           {
/* 215:241 */             b(i, 0);
/* 216:    */           }
/* 217:    */           else
/* 218:    */           {
/* 219:243 */             a(i + 1, (xm)localObject);
/* 220:244 */             this.bm[(i - 1)] = (this.W + 40 + this.V.nextInt(20));
/* 221:245 */             this.bn[(i - 1)] = 0;
/* 222:    */           }
/* 223:    */         }
/* 224:    */         else
/* 225:    */         {
/* 226:248 */           localObject = this.o.a(xm.class, aQ().b(20.0D, 8.0D, 20.0D), Predicates.and(bp, xe.d));
/* 227:250 */           for (m = 0; (m < 10) && (!((List)localObject).isEmpty()); m++)
/* 228:    */           {
/* 229:251 */             xm localxm = (xm)((List)localObject).get(this.V.nextInt(((List)localObject).size()));
/* 230:253 */             if ((localxm != this) && (localxm.ai()) && (t(localxm)))
/* 231:    */             {
/* 232:254 */               if ((localxm instanceof ahd))
/* 233:    */               {
/* 234:255 */                 if (((ahd)localxm).by.a) {
/* 235:    */                   break;
/* 236:    */                 }
/* 237:256 */                 b(i, localxm.F()); break;
/* 238:    */               }
/* 239:260 */               b(i, localxm.F());
/* 240:261 */               break;
/* 241:    */             }
/* 242:265 */             ((List)localObject).remove(localxm);
/* 243:    */           }
/* 244:    */         }
/* 245:    */       }
/* 246:    */     }
/* 247:270 */     if (u() != null) {
/* 248:271 */       b(0, u().F());
/* 249:    */     } else {
/* 250:273 */       b(0, 0);
/* 251:    */     }
/* 252:276 */     if (this.bo > 0)
/* 253:    */     {
/* 254:277 */       this.bo -= 1;
/* 255:279 */       if ((this.bo == 0) && (this.o.Q().b("mobGriefing")))
/* 256:    */       {
/* 257:283 */         i = uv.c(this.t);
/* 258:284 */         j = uv.c(this.s);
/* 259:285 */         int k = uv.c(this.u);
/* 260:286 */         m = 0;
/* 261:288 */         for (int n = -1; n <= 1; n++) {
/* 262:289 */           for (int i1 = -1; i1 <= 1; i1++) {
/* 263:290 */             for (int i2 = 0; i2 <= 3; i2++)
/* 264:    */             {
/* 265:291 */               int i3 = j + n;
/* 266:292 */               int i4 = i + i2;
/* 267:293 */               int i5 = k + i1;
/* 268:294 */               atr localatr = this.o.p(new dt(i3, i4, i5)).c();
/* 269:295 */               if ((localatr.r() != bof.a) && (localatr != aty.h) && (localatr != aty.bF) && (localatr != aty.bG) && (localatr != aty.bX) && (localatr != aty.cv)) {
/* 270:296 */                 m = (this.o.b(new dt(i3, i4, i5), true)) || (m != 0) ? 1 : 0;
/* 271:    */               }
/* 272:    */             }
/* 273:    */           }
/* 274:    */         }
/* 275:301 */         if (m != 0) {
/* 276:302 */           this.o.a(null, 1012, new dt(this), 0);
/* 277:    */         }
/* 278:    */       }
/* 279:    */     }
/* 280:307 */     if (this.W % 20 == 0) {
/* 281:308 */       g(1.0F);
/* 282:    */     }
/* 283:    */   }
/* 284:    */   
/* 285:    */   public void n()
/* 286:    */   {
/* 287:313 */     r(220);
/* 288:314 */     h(bt() / 3.0F);
/* 289:    */   }
/* 290:    */   
/* 291:    */   public void aB() {}
/* 292:    */   
/* 293:    */   public int bq()
/* 294:    */   {
/* 295:323 */     return 4;
/* 296:    */   }
/* 297:    */   
/* 298:    */   private double t(int paramInt)
/* 299:    */   {
/* 300:327 */     if (paramInt <= 0) {
/* 301:328 */       return this.s;
/* 302:    */     }
/* 303:330 */     float f1 = (this.aG + 180 * (paramInt - 1)) / 180.0F * 3.141593F;
/* 304:331 */     float f2 = uv.b(f1);
/* 305:332 */     return this.s + f2 * 1.3D;
/* 306:    */   }
/* 307:    */   
/* 308:    */   private double u(int paramInt)
/* 309:    */   {
/* 310:336 */     if (paramInt <= 0) {
/* 311:337 */       return this.t + 3.0D;
/* 312:    */     }
/* 313:339 */     return this.t + 2.2D;
/* 314:    */   }
/* 315:    */   
/* 316:    */   private double v(int paramInt)
/* 317:    */   {
/* 318:344 */     if (paramInt <= 0) {
/* 319:345 */       return this.u;
/* 320:    */     }
/* 321:347 */     float f1 = (this.aG + 180 * (paramInt - 1)) / 180.0F * 3.141593F;
/* 322:348 */     float f2 = uv.a(f1);
/* 323:349 */     return this.u + f2 * 1.3D;
/* 324:    */   }
/* 325:    */   
/* 326:    */   private float b(float paramFloat1, float paramFloat2, float paramFloat3)
/* 327:    */   {
/* 328:353 */     float f = uv.g(paramFloat2 - paramFloat1);
/* 329:354 */     if (f > paramFloat3) {
/* 330:355 */       f = paramFloat3;
/* 331:    */     }
/* 332:357 */     if (f < -paramFloat3) {
/* 333:358 */       f = -paramFloat3;
/* 334:    */     }
/* 335:360 */     return paramFloat1 + f;
/* 336:    */   }
/* 337:    */   
/* 338:    */   private void a(int paramInt, xm paramxm)
/* 339:    */   {
/* 340:364 */     a(paramInt, paramxm.s, paramxm.t + paramxm.aR() * 0.5D, paramxm.u, (paramInt == 0) && (this.V.nextFloat() < 0.001F));
/* 341:    */   }
/* 342:    */   
/* 343:    */   private void a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
/* 344:    */   {
/* 345:368 */     this.o.a(null, 1014, new dt(this), 0);
/* 346:    */     
/* 347:370 */     double d1 = t(paramInt);
/* 348:371 */     double d2 = u(paramInt);
/* 349:372 */     double d3 = v(paramInt);
/* 350:    */     
/* 351:374 */     double d4 = paramDouble1 - d1;
/* 352:375 */     double d5 = paramDouble2 - d2;
/* 353:376 */     double d6 = paramDouble3 - d3;
/* 354:    */     
/* 355:378 */     ahw localahw = new ahw(this.o, this, d4, d5, d6);
/* 356:379 */     if (paramBoolean) {
/* 357:380 */       localahw.a(true);
/* 358:    */     }
/* 359:382 */     localahw.t = d2;
/* 360:383 */     localahw.s = d1;
/* 361:384 */     localahw.u = d3;
/* 362:385 */     this.o.d(localahw);
/* 363:    */   }
/* 364:    */   
/* 365:    */   public void a(xm paramxm, float paramFloat)
/* 366:    */   {
/* 367:390 */     a(0, paramxm);
/* 368:    */   }
/* 369:    */   
/* 370:    */   public boolean a(wh paramwh, float paramFloat)
/* 371:    */   {
/* 372:395 */     if (b(paramwh)) {
/* 373:396 */       return false;
/* 374:    */     }
/* 375:398 */     if ((paramwh == wh.f) || ((paramwh.j() instanceof adf))) {
/* 376:399 */       return false;
/* 377:    */     }
/* 378:401 */     if ((cj() > 0) && (paramwh != wh.j)) {
/* 379:402 */       return false;
/* 380:    */     }
/* 381:405 */     if (ck())
/* 382:    */     {
/* 383:406 */       localwv = paramwh.i();
/* 384:407 */       if ((localwv instanceof ahj)) {
/* 385:408 */         return false;
/* 386:    */       }
/* 387:    */     }
/* 388:412 */     wv localwv = paramwh.j();
/* 389:413 */     if ((localwv != null) && 
/* 390:414 */       (!(localwv instanceof ahd)) && 
/* 391:415 */       ((localwv instanceof xm)) && (((xm)localwv).by() == by())) {
/* 392:417 */       return false;
/* 393:    */     }
/* 394:420 */     if (this.bo <= 0) {
/* 395:421 */       this.bo = 20;
/* 396:    */     }
/* 397:424 */     for (int i = 0; i < this.bn.length; i++) {
/* 398:425 */       this.bn[i] += 3;
/* 399:    */     }
/* 400:428 */     return super.a(paramwh, paramFloat);
/* 401:    */   }
/* 402:    */   
/* 403:    */   protected void b(boolean paramBoolean, int paramInt)
/* 404:    */   {
/* 405:433 */     adw localadw = a(amk.bZ, 1);
/* 406:434 */     if (localadw != null) {
/* 407:435 */       localadw.u();
/* 408:    */     }
/* 409:438 */     if (!this.o.D) {
/* 410:439 */       for (ahd localahd : this.o.a(ahd.class, aQ().b(50.0D, 100.0D, 50.0D))) {
/* 411:440 */         localahd.b(tl.J);
/* 412:    */       }
/* 413:    */     }
/* 414:    */   }
/* 415:    */   
/* 416:    */   protected void D()
/* 417:    */   {
/* 418:447 */     this.aO = 0;
/* 419:    */   }
/* 420:    */   
/* 421:    */   public int b(float paramFloat)
/* 422:    */   {
/* 423:452 */     return 15728880;
/* 424:    */   }
/* 425:    */   
/* 426:    */   public void e(float paramFloat1, float paramFloat2) {}
/* 427:    */   
/* 428:    */   public void c(wq paramwq) {}
/* 429:    */   
/* 430:    */   protected void aW()
/* 431:    */   {
/* 432:466 */     super.aW();
/* 433:    */     
/* 434:468 */     a(afs.a).a(300.0D);
/* 435:469 */     a(afs.d).a(0.6000000238418579D);
/* 436:470 */     a(afs.b).a(40.0D);
/* 437:    */   }
/* 438:    */   
/* 439:    */   public float a(int paramInt)
/* 440:    */   {
/* 441:474 */     return this.c[paramInt];
/* 442:    */   }
/* 443:    */   
/* 444:    */   public float b(int paramInt)
/* 445:    */   {
/* 446:478 */     return this.b[paramInt];
/* 447:    */   }
/* 448:    */   
/* 449:    */   public int cj()
/* 450:    */   {
/* 451:482 */     return this.ac.c(20);
/* 452:    */   }
/* 453:    */   
/* 454:    */   public void r(int paramInt)
/* 455:    */   {
/* 456:486 */     this.ac.b(20, Integer.valueOf(paramInt));
/* 457:    */   }
/* 458:    */   
/* 459:    */   public int s(int paramInt)
/* 460:    */   {
/* 461:490 */     return this.ac.c(17 + paramInt);
/* 462:    */   }
/* 463:    */   
/* 464:    */   public void b(int paramInt1, int paramInt2)
/* 465:    */   {
/* 466:494 */     this.ac.b(17 + paramInt1, Integer.valueOf(paramInt2));
/* 467:    */   }
/* 468:    */   
/* 469:    */   public boolean ck()
/* 470:    */   {
/* 471:498 */     return bm() <= bt() / 2.0F;
/* 472:    */   }
/* 473:    */   
/* 474:    */   public xs by()
/* 475:    */   {
/* 476:503 */     return xs.b;
/* 477:    */   }
/* 478:    */   
/* 479:    */   public void a(wv paramwv)
/* 480:    */   {
/* 481:508 */     this.m = null;
/* 482:    */   }
/* 483:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adf
 * JD-Core Version:    0.7.0.1
 */