/*   1:    */ import com.google.common.collect.Sets;
/*   2:    */ import java.util.Collection;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Set;
/*   6:    */ import org.apache.logging.log4j.LogManager;
/*   7:    */ import org.apache.logging.log4j.Logger;
/*   8:    */ 
/*   9:    */ public class qy
/*  10:    */ {
/*  11: 36 */   private static final Logger p = ;
/*  12:    */   public wv a;
/*  13:    */   public int b;
/*  14:    */   public int c;
/*  15:    */   public int d;
/*  16:    */   public int e;
/*  17:    */   public int f;
/*  18:    */   public int g;
/*  19:    */   public int h;
/*  20:    */   public int i;
/*  21:    */   public double j;
/*  22:    */   public double k;
/*  23:    */   public double l;
/*  24:    */   public int m;
/*  25:    */   private double q;
/*  26:    */   private double r;
/*  27:    */   private double s;
/*  28:    */   private boolean t;
/*  29:    */   private boolean u;
/*  30:    */   private int v;
/*  31:    */   private wv w;
/*  32:    */   private boolean x;
/*  33:    */   private boolean y;
/*  34:    */   public boolean n;
/*  35: 56 */   public Set o = Sets.newHashSet();
/*  36:    */   
/*  37:    */   public qy(wv paramwv, int paramInt1, int paramInt2, boolean paramBoolean)
/*  38:    */   {
/*  39: 59 */     this.a = paramwv;
/*  40: 60 */     this.b = paramInt1;
/*  41: 61 */     this.c = paramInt2;
/*  42: 62 */     this.u = paramBoolean;
/*  43:    */     
/*  44: 64 */     this.d = uv.c(paramwv.s * 32.0D);
/*  45: 65 */     this.e = uv.c(paramwv.t * 32.0D);
/*  46: 66 */     this.f = uv.c(paramwv.u * 32.0D);
/*  47: 67 */     this.g = uv.d(paramwv.y * 256.0F / 360.0F);
/*  48: 68 */     this.h = uv.d(paramwv.z * 256.0F / 360.0F);
/*  49:    */     
/*  50: 70 */     this.i = uv.d(paramwv.aD() * 256.0F / 360.0F);
/*  51: 71 */     this.y = paramwv.C;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public boolean equals(Object paramObject)
/*  55:    */   {
/*  56: 75 */     if ((paramObject instanceof qy)) {
/*  57: 76 */       return ((qy)paramObject).a.F() == this.a.F();
/*  58:    */     }
/*  59: 79 */     return false;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public int hashCode()
/*  63:    */   {
/*  64: 83 */     return this.a.F();
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void a(List paramList)
/*  68:    */   {
/*  69: 87 */     this.n = false;
/*  70: 88 */     if ((!this.t) || (this.a.e(this.q, this.r, this.s) > 16.0D))
/*  71:    */     {
/*  72: 89 */       this.q = this.a.s;
/*  73: 90 */       this.r = this.a.t;
/*  74: 91 */       this.s = this.a.u;
/*  75: 92 */       this.t = true;
/*  76: 93 */       this.n = true;
/*  77: 94 */       b(paramList);
/*  78:    */     }
/*  79: 97 */     if ((this.w != this.a.m) || ((this.a.m != null) && (this.m % 60 == 0)))
/*  80:    */     {
/*  81: 98 */       this.w = this.a.m;
/*  82: 99 */       a(new ky(0, this.a, this.a.m));
/*  83:    */     }
/*  84:102 */     if (((this.a instanceof adk)) && (this.m % 10 == 0))
/*  85:    */     {
/*  86:103 */       adk localadk = (adk)this.a;
/*  87:104 */       amj localamj = localadk.o();
/*  88:    */       bqe localbqe;
/*  89:106 */       if ((localamj != null) && ((localamj.b() instanceof amn)))
/*  90:    */       {
/*  91:107 */         localbqe = amk.bd.a(localamj, this.a.o);
/*  92:108 */         for (ahd localahd : paramList)
/*  93:    */         {
/*  94:109 */           qw localqw = (qw)localahd;
/*  95:110 */           localbqe.a(localqw, localamj);
/*  96:    */           
/*  97:112 */           id localid = amk.bd.c(localamj, this.a.o, localqw);
/*  98:113 */           if (localid != null) {
/*  99:114 */             localqw.a.a(localid);
/* 100:    */           }
/* 101:    */         }
/* 102:    */       }
/* 103:119 */       b();
/* 104:    */     }
/* 105:122 */     if ((this.m % this.c == 0) || (this.a.ai) || (this.a.H().a()))
/* 106:    */     {
/* 107:    */       int i2;
/* 108:    */       int i3;
/* 109:123 */       if (this.a.m == null)
/* 110:    */       {
/* 111:124 */         this.v += 1;
/* 112:125 */         i1 = uv.c(this.a.s * 32.0D);
/* 113:126 */         i2 = uv.c(this.a.t * 32.0D);
/* 114:127 */         i3 = uv.c(this.a.u * 32.0D);
/* 115:128 */         int i4 = uv.d(this.a.y * 256.0F / 360.0F);
/* 116:129 */         int i5 = uv.d(this.a.z * 256.0F / 360.0F);
/* 117:    */         
/* 118:131 */         int i6 = i1 - this.d;
/* 119:132 */         int i7 = i2 - this.e;
/* 120:133 */         int i8 = i3 - this.f;
/* 121:    */         
/* 122:135 */         Object localObject = null;
/* 123:    */         
/* 124:137 */         int i9 = (Math.abs(i6) >= 4) || (Math.abs(i7) >= 4) || (Math.abs(i8) >= 4) || (this.m % 60 == 0) ? 1 : 0;
/* 125:138 */         int i10 = (Math.abs(i4 - this.g) >= 4) || (Math.abs(i5 - this.h) >= 4) ? 1 : 0;
/* 126:143 */         if ((this.m > 0) || ((this.a instanceof ahj))) {
/* 127:144 */           if ((i6 < -128) || (i6 >= 128) || (i7 < -128) || (i7 >= 128) || (i8 < -128) || (i8 >= 128) || (this.v > 400) || (this.x) || (this.y != this.a.C))
/* 128:    */           {
/* 129:145 */             this.y = this.a.C;
/* 130:146 */             this.v = 0;
/* 131:147 */             localObject = new lo(this.a.F(), i1, i2, i3, (byte)i4, (byte)i5, this.a.C);
/* 132:    */           }
/* 133:149 */           else if ((i9 != 0) && (i10 != 0))
/* 134:    */           {
/* 135:150 */             localObject = new ka(this.a.F(), (byte)i6, (byte)i7, (byte)i8, (byte)i4, (byte)i5, this.a.C);
/* 136:    */           }
/* 137:151 */           else if (i9 != 0)
/* 138:    */           {
/* 139:152 */             localObject = new jz(this.a.F(), (byte)i6, (byte)i7, (byte)i8, this.a.C);
/* 140:    */           }
/* 141:153 */           else if (i10 != 0)
/* 142:    */           {
/* 143:154 */             localObject = new kb(this.a.F(), (byte)i4, (byte)i5, this.a.C);
/* 144:    */           }
/* 145:    */         }
/* 146:159 */         if (this.u)
/* 147:    */         {
/* 148:160 */           double d1 = this.a.v - this.j;
/* 149:161 */           double d2 = this.a.w - this.k;
/* 150:162 */           double d3 = this.a.x - this.l;
/* 151:    */           
/* 152:164 */           double d4 = 0.02D;
/* 153:    */           
/* 154:166 */           double d5 = d1 * d1 + d2 * d2 + d3 * d3;
/* 155:168 */           if ((d5 > d4 * d4) || ((d5 > 0.0D) && (this.a.v == 0.0D) && (this.a.w == 0.0D) && (this.a.x == 0.0D)))
/* 156:    */           {
/* 157:169 */             this.j = this.a.v;
/* 158:170 */             this.k = this.a.w;
/* 159:171 */             this.l = this.a.x;
/* 160:172 */             a(new kz(this.a.F(), this.j, this.k, this.l));
/* 161:    */           }
/* 162:    */         }
/* 163:176 */         if (localObject != null) {
/* 164:177 */           a((id)localObject);
/* 165:    */         }
/* 166:180 */         b();
/* 167:182 */         if (i9 != 0)
/* 168:    */         {
/* 169:183 */           this.d = i1;
/* 170:184 */           this.e = i2;
/* 171:185 */           this.f = i3;
/* 172:    */         }
/* 173:187 */         if (i10 != 0)
/* 174:    */         {
/* 175:188 */           this.g = i4;
/* 176:189 */           this.h = i5;
/* 177:    */         }
/* 178:192 */         this.x = false;
/* 179:    */       }
/* 180:    */       else
/* 181:    */       {
/* 182:195 */         i1 = uv.d(this.a.y * 256.0F / 360.0F);
/* 183:196 */         i2 = uv.d(this.a.z * 256.0F / 360.0F);
/* 184:197 */         i3 = (Math.abs(i1 - this.g) >= 4) || (Math.abs(i2 - this.h) >= 4) ? 1 : 0;
/* 185:198 */         if (i3 != 0)
/* 186:    */         {
/* 187:199 */           a(new kb(this.a.F(), (byte)i1, (byte)i2, this.a.C));
/* 188:200 */           this.g = i1;
/* 189:201 */           this.h = i2;
/* 190:    */         }
/* 191:204 */         this.d = uv.c(this.a.s * 32.0D);
/* 192:205 */         this.e = uv.c(this.a.t * 32.0D);
/* 193:206 */         this.f = uv.c(this.a.u * 32.0D);
/* 194:    */         
/* 195:208 */         b();
/* 196:    */         
/* 197:210 */         this.x = true;
/* 198:    */       }
/* 199:213 */       int i1 = uv.d(this.a.aD() * 256.0F / 360.0F);
/* 200:214 */       if (Math.abs(i1 - this.i) >= 4)
/* 201:    */       {
/* 202:215 */         a(new kq(this.a, (byte)i1));
/* 203:216 */         this.i = i1;
/* 204:    */       }
/* 205:218 */       this.a.ai = false;
/* 206:    */     }
/* 207:221 */     this.m += 1;
/* 208:223 */     if (this.a.G)
/* 209:    */     {
/* 210:224 */       b(new kz(this.a));
/* 211:225 */       this.a.G = false;
/* 212:    */     }
/* 213:    */   }
/* 214:    */   
/* 215:    */   private void b()
/* 216:    */   {
/* 217:230 */     xv localxv = this.a.H();
/* 218:231 */     if (localxv.a()) {
/* 219:232 */       b(new kx(this.a.F(), localxv, false));
/* 220:    */     }
/* 221:235 */     if ((this.a instanceof xm))
/* 222:    */     {
/* 223:236 */       yf localyf = (yf)((xm)this.a).bx();
/* 224:237 */       Set localSet = localyf.b();
/* 225:239 */       if (!localSet.isEmpty()) {
/* 226:240 */         b(new lp(this.a.F(), localSet));
/* 227:    */       }
/* 228:243 */       localSet.clear();
/* 229:    */     }
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void a(id paramid)
/* 233:    */   {
/* 234:248 */     for (qw localqw : this.o) {
/* 235:249 */       localqw.a.a(paramid);
/* 236:    */     }
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void b(id paramid)
/* 240:    */   {
/* 241:254 */     a(paramid);
/* 242:255 */     if ((this.a instanceof qw)) {
/* 243:256 */       ((qw)this.a).a.a(paramid);
/* 244:    */     }
/* 245:    */   }
/* 246:    */   
/* 247:    */   public void a()
/* 248:    */   {
/* 249:261 */     for (qw localqw : this.o) {
/* 250:262 */       localqw.d(this.a);
/* 251:    */     }
/* 252:    */   }
/* 253:    */   
/* 254:    */   public void a(qw paramqw)
/* 255:    */   {
/* 256:267 */     if (this.o.contains(paramqw))
/* 257:    */     {
/* 258:268 */       paramqw.d(this.a);
/* 259:269 */       this.o.remove(paramqw);
/* 260:    */     }
/* 261:    */   }
/* 262:    */   
/* 263:    */   public void b(qw paramqw)
/* 264:    */   {
/* 265:274 */     if (paramqw == this.a) {
/* 266:    */       return;
/* 267:    */     }
/* 268:    */     Object localObject2;
/* 269:278 */     if (c(paramqw))
/* 270:    */     {
/* 271:279 */       if ((!this.o.contains(paramqw)) && ((e(paramqw)) || (this.a.n)))
/* 272:    */       {
/* 273:280 */         this.o.add(paramqw);
/* 274:281 */         id localid = c();
/* 275:282 */         paramqw.a.a(localid);
/* 276:284 */         if (!this.a.H().d()) {
/* 277:285 */           paramqw.a.a(new kx(this.a.F(), this.a.H(), true));
/* 278:    */         }
/* 279:288 */         fn localfn = this.a.aU();
/* 280:289 */         if (localfn != null) {
/* 281:290 */           paramqw.a.a(new jl(this.a.F(), localfn));
/* 282:    */         }
/* 283:293 */         if ((this.a instanceof xm))
/* 284:    */         {
/* 285:294 */           yf localyf = (yf)((xm)this.a).bx();
/* 286:295 */           localObject2 = localyf.c();
/* 287:297 */           if (!((Collection)localObject2).isEmpty()) {
/* 288:298 */             paramqw.a.a(new lp(this.a.F(), (Collection)localObject2));
/* 289:    */           }
/* 290:    */         }
/* 291:302 */         this.j = this.a.v;
/* 292:303 */         this.k = this.a.w;
/* 293:304 */         this.l = this.a.x;
/* 294:306 */         if ((this.u) && (!(localid instanceof io))) {
/* 295:307 */           paramqw.a.a(new kz(this.a.F(), this.a.v, this.a.w, this.a.x));
/* 296:    */         }
/* 297:310 */         if (this.a.m != null) {
/* 298:311 */           paramqw.a.a(new ky(0, this.a, this.a.m));
/* 299:    */         }
/* 300:313 */         if (((this.a instanceof xn)) && (((xn)this.a).cc() != null)) {
/* 301:314 */           paramqw.a.a(new ky(1, this.a, ((xn)this.a).cc()));
/* 302:    */         }
/* 303:317 */         if ((this.a instanceof xm)) {
/* 304:318 */           for (int i1 = 0; i1 < 5; i1++)
/* 305:    */           {
/* 306:319 */             localObject2 = ((xm)this.a).p(i1);
/* 307:320 */             if (localObject2 != null) {
/* 308:321 */               paramqw.a.a(new la(this.a.F(), i1, (amj)localObject2));
/* 309:    */             }
/* 310:    */           }
/* 311:    */         }
/* 312:    */         Object localObject1;
/* 313:326 */         if ((this.a instanceof ahd))
/* 314:    */         {
/* 315:327 */           localObject1 = (ahd)this.a;
/* 316:328 */           if (((ahd)localObject1).bI()) {
/* 317:329 */             paramqw.a.a(new kl((ahd)localObject1, new dt(this.a)));
/* 318:    */           }
/* 319:    */         }
/* 320:333 */         if ((this.a instanceof xm))
/* 321:    */         {
/* 322:334 */           localObject1 = (xm)this.a;
/* 323:335 */           for (localObject2 = ((xm)localObject1).bk().iterator(); ((Iterator)localObject2).hasNext();)
/* 324:    */           {
/* 325:335 */             wq localwq = (wq)((Iterator)localObject2).next();
/* 326:336 */             paramqw.a.a(new lr(this.a.F(), localwq));
/* 327:    */           }
/* 328:    */         }
/* 329:    */       }
/* 330:    */     }
/* 331:341 */     else if (this.o.contains(paramqw))
/* 332:    */     {
/* 333:342 */       this.o.remove(paramqw);
/* 334:343 */       paramqw.d(this.a);
/* 335:    */     }
/* 336:    */   }
/* 337:    */   
/* 338:    */   public boolean c(qw paramqw)
/* 339:    */   {
/* 340:349 */     double d1 = paramqw.s - this.d / 32;
/* 341:350 */     double d2 = paramqw.u - this.f / 32;
/* 342:351 */     return (d1 >= -this.b) && (d1 <= this.b) && (d2 >= -this.b) && (d2 <= this.b) && (this.a.a(paramqw));
/* 343:    */   }
/* 344:    */   
/* 345:    */   private boolean e(qw paramqw)
/* 346:    */   {
/* 347:355 */     return paramqw.u().t().a(paramqw, this.a.ae, this.a.ag);
/* 348:    */   }
/* 349:    */   
/* 350:    */   public void b(List paramList)
/* 351:    */   {
/* 352:359 */     for (int i1 = 0; i1 < paramList.size(); i1++) {
/* 353:360 */       b((qw)paramList.get(i1));
/* 354:    */     }
/* 355:    */   }
/* 356:    */   
/* 357:    */   private id c()
/* 358:    */   {
/* 359:365 */     if (this.a.I) {
/* 360:366 */       p.warn("Fetching addPacket for removed entity");
/* 361:    */     }
/* 362:369 */     if ((this.a instanceof adw)) {
/* 363:370 */       return new il(this.a, 2, 1);
/* 364:    */     }
/* 365:372 */     if ((this.a instanceof qw)) {
/* 366:373 */       return new iq((ahd)this.a);
/* 367:    */     }
/* 368:    */     Object localObject;
/* 369:375 */     if ((this.a instanceof adx))
/* 370:    */     {
/* 371:376 */       localObject = (adx)this.a;
/* 372:377 */       return new il(this.a, 10, ((adx)localObject).s().a());
/* 373:    */     }
/* 374:379 */     if ((this.a instanceof adu)) {
/* 375:380 */       return new il(this.a, 1);
/* 376:    */     }
/* 377:382 */     if ((this.a instanceof wt))
/* 378:    */     {
/* 379:383 */       this.i = uv.d(this.a.aD() * 256.0F / 360.0F);
/* 380:384 */       return new io((xm)this.a);
/* 381:    */     }
/* 382:386 */     if ((this.a instanceof ado))
/* 383:    */     {
/* 384:387 */       localObject = ((ado)this.a).b;
/* 385:388 */       return new il(this.a, 90, localObject != null ? ((wv)localObject).F() : this.a.F());
/* 386:    */     }
/* 387:390 */     if ((this.a instanceof ahj))
/* 388:    */     {
/* 389:391 */       localObject = ((ahj)this.a).c;
/* 390:392 */       return new il(this.a, 60, localObject != null ? ((wv)localObject).F() : this.a.F());
/* 391:    */     }
/* 392:394 */     if ((this.a instanceof ahq)) {
/* 393:395 */       return new il(this.a, 61);
/* 394:    */     }
/* 395:397 */     if ((this.a instanceof ahv)) {
/* 396:398 */       return new il(this.a, 73, ((ahv)this.a).o());
/* 397:    */     }
/* 398:400 */     if ((this.a instanceof ahu)) {
/* 399:401 */       return new il(this.a, 75);
/* 400:    */     }
/* 401:403 */     if ((this.a instanceof aht)) {
/* 402:404 */       return new il(this.a, 65);
/* 403:    */     }
/* 404:406 */     if ((this.a instanceof ahk)) {
/* 405:407 */       return new il(this.a, 72);
/* 406:    */     }
/* 407:409 */     if ((this.a instanceof ahm)) {
/* 408:410 */       return new il(this.a, 76);
/* 409:    */     }
/* 410:    */     il localil;
/* 411:412 */     if ((this.a instanceof ahl))
/* 412:    */     {
/* 413:413 */       localObject = (ahl)this.a;
/* 414:414 */       localil = null;
/* 415:415 */       int i1 = 63;
/* 416:416 */       if ((this.a instanceof ahp)) {
/* 417:417 */         i1 = 64;
/* 418:418 */       } else if ((this.a instanceof ahw)) {
/* 419:419 */         i1 = 66;
/* 420:    */       }
/* 421:421 */       if (((ahl)localObject).a != null) {
/* 422:422 */         localil = new il(this.a, i1, ((ahl)this.a).a.F());
/* 423:    */       } else {
/* 424:424 */         localil = new il(this.a, i1, 0);
/* 425:    */       }
/* 426:426 */       localil.d((int)(((ahl)localObject).b * 8000.0D));
/* 427:427 */       localil.e((int)(((ahl)localObject).c * 8000.0D));
/* 428:428 */       localil.f((int)(((ahl)localObject).d * 8000.0D));
/* 429:429 */       return localil;
/* 430:    */     }
/* 431:431 */     if ((this.a instanceof ahs)) {
/* 432:432 */       return new il(this.a, 62);
/* 433:    */     }
/* 434:434 */     if ((this.a instanceof aek)) {
/* 435:435 */       return new il(this.a, 50);
/* 436:    */     }
/* 437:437 */     if ((this.a instanceof ada)) {
/* 438:438 */       return new il(this.a, 51);
/* 439:    */     }
/* 440:440 */     if ((this.a instanceof adv))
/* 441:    */     {
/* 442:441 */       localObject = (adv)this.a;
/* 443:442 */       return new il(this.a, 70, atr.f(((adv)localObject).l()));
/* 444:    */     }
/* 445:444 */     if ((this.a instanceof adi)) {
/* 446:445 */       return new il(this.a, 78);
/* 447:    */     }
/* 448:447 */     if ((this.a instanceof adm)) {
/* 449:448 */       return new ip((adm)this.a);
/* 450:    */     }
/* 451:    */     dt localdt;
/* 452:450 */     if ((this.a instanceof adk))
/* 453:    */     {
/* 454:451 */       localObject = (adk)this.a;
/* 455:452 */       localil = new il(this.a, 71, ((adk)localObject).b.b());
/* 456:453 */       localdt = ((adk)localObject).n();
/* 457:454 */       localil.a(uv.d(localdt.n() * 32));
/* 458:455 */       localil.b(uv.d(localdt.o() * 32));
/* 459:456 */       localil.c(uv.d(localdt.p() * 32));
/* 460:457 */       return localil;
/* 461:    */     }
/* 462:459 */     if ((this.a instanceof adl))
/* 463:    */     {
/* 464:460 */       localObject = (adl)this.a;
/* 465:461 */       localil = new il(this.a, 77);
/* 466:462 */       localdt = ((adl)localObject).n();
/* 467:463 */       localil.a(uv.d(localdt.n() * 32));
/* 468:464 */       localil.b(uv.d(localdt.o() * 32));
/* 469:465 */       localil.c(uv.d(localdt.p() * 32));
/* 470:466 */       return localil;
/* 471:    */     }
/* 472:468 */     if ((this.a instanceof xk)) {
/* 473:469 */       return new im((xk)this.a);
/* 474:    */     }
/* 475:471 */     throw new IllegalArgumentException("Don't know how to add " + this.a.getClass() + "!");
/* 476:    */   }
/* 477:    */   
/* 478:    */   public void d(qw paramqw)
/* 479:    */   {
/* 480:475 */     if (this.o.contains(paramqw))
/* 481:    */     {
/* 482:476 */       this.o.remove(paramqw);
/* 483:477 */       paramqw.d(this.a);
/* 484:    */     }
/* 485:    */   }
/* 486:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     qy
 * JD-Core Version:    0.7.0.1
 */