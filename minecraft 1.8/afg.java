/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class afg
/*   5:    */   extends afm
/*   6:    */ {
/*   7:    */   private float b;
/*   8:    */   private float c;
/*   9:    */   private float bk;
/*  10:    */   private float bl;
/*  11:    */   private float bm;
/*  12:    */   private xm bn;
/*  13:    */   private int bo;
/*  14:    */   private boolean bp;
/*  15:    */   private zy bq;
/*  16:    */   
/*  17:    */   public afg(aqu paramaqu)
/*  18:    */   {
/*  19: 63 */     super(paramaqu);
/*  20:    */     
/*  21: 65 */     this.b_ = 10;
/*  22: 66 */     a(0.85F, 0.85F);
/*  23:    */     
/*  24:    */ 
/*  25:    */ 
/*  26: 70 */     this.i.a(4, new afi(this));
/*  27:    */     zo localzo;
/*  28: 71 */     this.i.a(5, localzo = new zo(this, 1.0D));
/*  29: 72 */     this.i.a(7, this.bq = new zy(this, 1.0D, 80));
/*  30: 73 */     this.i.a(8, new zh(this, ahd.class, 8.0F));
/*  31: 74 */     this.i.a(8, new zh(this, afg.class, 12.0F, 0.01F));
/*  32: 75 */     this.i.a(9, new zx(this));
/*  33:    */     
/*  34:    */ 
/*  35: 78 */     this.bq.a(3);
/*  36: 79 */     localzo.a(3);
/*  37:    */     
/*  38: 81 */     this.bg.a(1, new aaq(this, xm.class, 10, true, false, new afj(this)));
/*  39:    */     
/*  40: 83 */     this.f = new afk(this);
/*  41:    */     
/*  42: 85 */     this.c = (this.b = this.V.nextFloat());
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected void aW()
/*  46:    */   {
/*  47: 90 */     super.aW();
/*  48: 91 */     a(afs.e).a(6.0D);
/*  49: 92 */     a(afs.d).a(0.5D);
/*  50: 93 */     a(afs.b).a(16.0D);
/*  51: 94 */     a(afs.a).a(30.0D);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void a(fn paramfn)
/*  55:    */   {
/*  56: 99 */     super.a(paramfn);
/*  57:    */     
/*  58:101 */     a(paramfn.n("Elder"));
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void b(fn paramfn)
/*  62:    */   {
/*  63:106 */     super.b(paramfn);
/*  64:    */     
/*  65:108 */     paramfn.a("Elder", cl());
/*  66:    */   }
/*  67:    */   
/*  68:    */   protected aaz b(aqu paramaqu)
/*  69:    */   {
/*  70:113 */     return new abb(this, paramaqu);
/*  71:    */   }
/*  72:    */   
/*  73:    */   protected void h()
/*  74:    */   {
/*  75:118 */     super.h();
/*  76:    */     
/*  77:120 */     this.ac.a(16, Integer.valueOf(0));
/*  78:121 */     this.ac.a(17, Integer.valueOf(0));
/*  79:    */   }
/*  80:    */   
/*  81:    */   private boolean a(int paramInt)
/*  82:    */   {
/*  83:125 */     return (this.ac.c(16) & paramInt) != 0;
/*  84:    */   }
/*  85:    */   
/*  86:    */   private void a(int paramInt, boolean paramBoolean)
/*  87:    */   {
/*  88:129 */     int i = this.ac.c(16);
/*  89:130 */     if (paramBoolean) {
/*  90:131 */       this.ac.b(16, Integer.valueOf(i | paramInt));
/*  91:    */     } else {
/*  92:133 */       this.ac.b(16, Integer.valueOf(i & (paramInt ^ 0xFFFFFFFF)));
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean n()
/*  97:    */   {
/*  98:138 */     return a(2);
/*  99:    */   }
/* 100:    */   
/* 101:    */   private void l(boolean paramBoolean)
/* 102:    */   {
/* 103:142 */     a(2, paramBoolean);
/* 104:    */   }
/* 105:    */   
/* 106:    */   public int ck()
/* 107:    */   {
/* 108:146 */     if (cl()) {
/* 109:147 */       return 60;
/* 110:    */     }
/* 111:149 */     return 80;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public boolean cl()
/* 115:    */   {
/* 116:153 */     return a(4);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void a(boolean paramBoolean)
/* 120:    */   {
/* 121:157 */     a(4, paramBoolean);
/* 122:159 */     if (paramBoolean)
/* 123:    */     {
/* 124:160 */       a(1.9975F, 1.9975F);
/* 125:161 */       a(afs.d).a(0.300000011920929D);
/* 126:162 */       a(afs.e).a(8.0D);
/* 127:163 */       a(afs.a).a(80.0D);
/* 128:164 */       bW();
/* 129:    */       
/* 130:    */ 
/* 131:167 */       this.bq.b(400);
/* 132:    */     }
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void cm()
/* 136:    */   {
/* 137:172 */     a(true);
/* 138:173 */     this.bm = (this.bl = 1.0F);
/* 139:    */   }
/* 140:    */   
/* 141:    */   private void b(int paramInt)
/* 142:    */   {
/* 143:177 */     this.ac.b(17, Integer.valueOf(paramInt));
/* 144:    */   }
/* 145:    */   
/* 146:    */   public boolean cn()
/* 147:    */   {
/* 148:181 */     return this.ac.c(17) != 0;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public xm co()
/* 152:    */   {
/* 153:185 */     if (!cn()) {
/* 154:186 */       return null;
/* 155:    */     }
/* 156:188 */     if (this.o.D)
/* 157:    */     {
/* 158:189 */       if (this.bn != null) {
/* 159:190 */         return this.bn;
/* 160:    */       }
/* 161:192 */       wv localwv = this.o.a(this.ac.c(17));
/* 162:193 */       if ((localwv instanceof xm))
/* 163:    */       {
/* 164:194 */         this.bn = ((xm)localwv);
/* 165:195 */         return this.bn;
/* 166:    */       }
/* 167:197 */       return null;
/* 168:    */     }
/* 169:199 */     return u();
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void i(int paramInt)
/* 173:    */   {
/* 174:205 */     super.i(paramInt);
/* 175:207 */     if (paramInt == 16)
/* 176:    */     {
/* 177:208 */       if ((cl()) && (this.J < 1.0F)) {
/* 178:209 */         a(1.9975F, 1.9975F);
/* 179:    */       }
/* 180:    */     }
/* 181:211 */     else if (paramInt == 17)
/* 182:    */     {
/* 183:212 */       this.bo = 0;
/* 184:213 */       this.bn = null;
/* 185:    */     }
/* 186:    */   }
/* 187:    */   
/* 188:    */   public int w()
/* 189:    */   {
/* 190:219 */     return 160;
/* 191:    */   }
/* 192:    */   
/* 193:    */   protected String z()
/* 194:    */   {
/* 195:224 */     if (!V()) {
/* 196:225 */       return "mob.guardian.land.idle";
/* 197:    */     }
/* 198:227 */     if (cl()) {
/* 199:228 */       return "mob.guardian.elder.idle";
/* 200:    */     }
/* 201:230 */     return "mob.guardian.idle";
/* 202:    */   }
/* 203:    */   
/* 204:    */   protected String bn()
/* 205:    */   {
/* 206:235 */     if (!V()) {
/* 207:236 */       return "mob.guardian.land.hit";
/* 208:    */     }
/* 209:238 */     if (cl()) {
/* 210:239 */       return "mob.guardian.elder.hit";
/* 211:    */     }
/* 212:241 */     return "mob.guardian.hit";
/* 213:    */   }
/* 214:    */   
/* 215:    */   protected String bo()
/* 216:    */   {
/* 217:246 */     if (!V()) {
/* 218:247 */       return "mob.guardian.land.death";
/* 219:    */     }
/* 220:249 */     if (cl()) {
/* 221:250 */       return "mob.guardian.elder.death";
/* 222:    */     }
/* 223:252 */     return "mob.guardian.death";
/* 224:    */   }
/* 225:    */   
/* 226:    */   protected boolean r_()
/* 227:    */   {
/* 228:257 */     return false;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public float aR()
/* 232:    */   {
/* 233:262 */     return this.K * 0.5F;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public float a(dt paramdt)
/* 237:    */   {
/* 238:267 */     if (this.o.p(paramdt).c().r() == bof.h) {
/* 239:268 */       return 10.0F + this.o.o(paramdt) - 0.5F;
/* 240:    */     }
/* 241:270 */     return super.a(paramdt);
/* 242:    */   }
/* 243:    */   
/* 244:    */   public void m()
/* 245:    */   {
/* 246:275 */     if (this.o.D)
/* 247:    */     {
/* 248:277 */       this.c = this.b;
/* 249:278 */       if (!V())
/* 250:    */       {
/* 251:279 */         this.bk = 2.0F;
/* 252:280 */         if ((this.w > 0.0D) && (this.bp) && (!R())) {
/* 253:281 */           this.o.a(this.s, this.t, this.u, "mob.guardian.flop", 1.0F, 1.0F, false);
/* 254:    */         }
/* 255:283 */         this.bp = ((this.w < 0.0D) && (this.o.d(new dt(this).b(), false)));
/* 256:    */       }
/* 257:284 */       else if (n())
/* 258:    */       {
/* 259:285 */         if (this.bk < 0.5F) {
/* 260:286 */           this.bk = 4.0F;
/* 261:    */         } else {
/* 262:288 */           this.bk += (0.5F - this.bk) * 0.1F;
/* 263:    */         }
/* 264:    */       }
/* 265:    */       else
/* 266:    */       {
/* 267:291 */         this.bk += (0.125F - this.bk) * 0.2F;
/* 268:    */       }
/* 269:293 */       this.b += this.bk;
/* 270:    */       
/* 271:    */ 
/* 272:296 */       this.bm = this.bl;
/* 273:297 */       if (!V()) {
/* 274:298 */         this.bl = this.V.nextFloat();
/* 275:299 */       } else if (n()) {
/* 276:300 */         this.bl += (0.0F - this.bl) * 0.25F;
/* 277:    */       } else {
/* 278:302 */         this.bl += (1.0F - this.bl) * 0.06F;
/* 279:    */       }
/* 280:    */       Object localObject;
/* 281:305 */       if ((n()) && (V()))
/* 282:    */       {
/* 283:306 */         localObject = d(0.0F);
/* 284:307 */         for (int i = 0; i < 2; i++) {
/* 285:308 */           this.o.a(ew.e, this.s + (this.V.nextDouble() - 0.5D) * this.J - ((brw)localObject).a * 1.5D, this.t + this.V.nextDouble() * this.K - ((brw)localObject).b * 1.5D, this.u + (this.V.nextDouble() - 0.5D) * this.J - ((brw)localObject).c * 1.5D, 0.0D, 0.0D, 0.0D, new int[0]);
/* 286:    */         }
/* 287:    */       }
/* 288:312 */       if (cn())
/* 289:    */       {
/* 290:313 */         if (this.bo < ck()) {
/* 291:314 */           this.bo += 1;
/* 292:    */         }
/* 293:316 */         localObject = co();
/* 294:317 */         if (localObject != null)
/* 295:    */         {
/* 296:318 */           p().a((wv)localObject, 90.0F, 90.0F);
/* 297:319 */           p().a();
/* 298:    */           
/* 299:321 */           double d1 = p(0.0F);
/* 300:322 */           double d2 = ((xm)localObject).s - this.s;
/* 301:323 */           double d3 = ((xm)localObject).t + ((xm)localObject).K * 0.5F - (this.t + aR());
/* 302:324 */           double d4 = ((xm)localObject).u - this.u;
/* 303:325 */           double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
/* 304:326 */           d2 /= d5;
/* 305:327 */           d3 /= d5;
/* 306:328 */           d4 /= d5;
/* 307:329 */           double d6 = this.V.nextDouble();
/* 308:330 */           while (d6 < d5)
/* 309:    */           {
/* 310:331 */             d6 += 1.8D - d1 + this.V.nextDouble() * (1.7D - d1);
/* 311:332 */             this.o.a(ew.e, this.s + d2 * d6, this.t + d3 * d6 + aR(), this.u + d4 * d6, 0.0D, 0.0D, 0.0D, new int[0]);
/* 312:    */           }
/* 313:    */         }
/* 314:    */       }
/* 315:    */     }
/* 316:338 */     if (this.Y)
/* 317:    */     {
/* 318:339 */       h(300);
/* 319:    */     }
/* 320:346 */     else if (this.C)
/* 321:    */     {
/* 322:347 */       this.w += 0.5D;
/* 323:348 */       this.v += (this.V.nextFloat() * 2.0F - 1.0F) * 0.4F;
/* 324:349 */       this.x += (this.V.nextFloat() * 2.0F - 1.0F) * 0.4F;
/* 325:350 */       this.y = (this.V.nextFloat() * 360.0F);
/* 326:351 */       this.C = false;
/* 327:352 */       this.ai = true;
/* 328:    */     }
/* 329:356 */     if (cn()) {
/* 330:357 */       this.y = this.aI;
/* 331:    */     }
/* 332:362 */     super.m();
/* 333:    */   }
/* 334:    */   
/* 335:    */   public float a(float paramFloat)
/* 336:    */   {
/* 337:366 */     return this.c + (this.b - this.c) * paramFloat;
/* 338:    */   }
/* 339:    */   
/* 340:    */   public float o(float paramFloat)
/* 341:    */   {
/* 342:370 */     return this.bm + (this.bl - this.bm) * paramFloat;
/* 343:    */   }
/* 344:    */   
/* 345:    */   public float p(float paramFloat)
/* 346:    */   {
/* 347:374 */     return (this.bo + paramFloat) / ck();
/* 348:    */   }
/* 349:    */   
/* 350:    */   protected void E()
/* 351:    */   {
/* 352:379 */     super.E();
/* 353:381 */     if (cl())
/* 354:    */     {
/* 355:383 */       int i = 1200;
/* 356:384 */       int j = 1200;
/* 357:385 */       int k = 6000;
/* 358:386 */       int m = 2;
/* 359:    */       wp localwp;
/* 360:387 */       if ((this.W + F()) % 1200 == 0)
/* 361:    */       {
/* 362:388 */         localwp = wp.f;
/* 363:    */         
/* 364:390 */         List localList = this.o.b(qw.class, new afh(this));
/* 365:396 */         for (qw localqw : localList) {
/* 366:397 */           if ((!localqw.a(localwp)) || (localqw.b(localwp).c() < 2) || (localqw.b(localwp).b() < 1200))
/* 367:    */           {
/* 368:398 */             localqw.a.a(new jo(10, 0.0F));
/* 369:399 */             localqw.c(new wq(localwp.H, 6000, 2));
/* 370:    */           }
/* 371:    */         }
/* 372:    */       }
/* 373:405 */       if (!ci()) {
/* 374:406 */         a(new dt(this), 16);
/* 375:    */       }
/* 376:    */     }
/* 377:    */   }
/* 378:    */   
/* 379:    */   protected void b(boolean paramBoolean, int paramInt)
/* 380:    */   {
/* 381:413 */     int i = this.V.nextInt(3) + this.V.nextInt(paramInt + 1);
/* 382:414 */     if (i > 0) {
/* 383:415 */       a(new amj(amk.cC, i, 0), 1.0F);
/* 384:    */     }
/* 385:417 */     if (this.V.nextInt(3 + paramInt) > 1) {
/* 386:418 */       a(new amj(amk.aU, 1, ali.a.a()), 1.0F);
/* 387:419 */     } else if (this.V.nextInt(3 + paramInt) > 1) {
/* 388:420 */       a(new amj(amk.cD, 1, 0), 1.0F);
/* 389:    */     }
/* 390:423 */     if ((paramBoolean) && 
/* 391:424 */       (cl())) {
/* 392:425 */       a(new amj(aty.v, 1, 1), 1.0F);
/* 393:    */     }
/* 394:    */   }
/* 395:    */   
/* 396:    */   protected void bp()
/* 397:    */   {
/* 398:433 */     amj localamj = ((adp)vj.a(this.V, ado.j())).a(this.V);
/* 399:434 */     a(localamj, 1.0F);
/* 400:    */   }
/* 401:    */   
/* 402:    */   protected boolean m_()
/* 403:    */   {
/* 404:439 */     return true;
/* 405:    */   }
/* 406:    */   
/* 407:    */   public boolean bR()
/* 408:    */   {
/* 409:444 */     return (this.o.a(aQ(), this)) && (this.o.a(this, aQ()).isEmpty());
/* 410:    */   }
/* 411:    */   
/* 412:    */   public boolean bQ()
/* 413:    */   {
/* 414:450 */     return ((this.V.nextInt(20) == 0) || (!this.o.j(new dt(this)))) && (super.bQ());
/* 415:    */   }
/* 416:    */   
/* 417:    */   public boolean a(wh paramwh, float paramFloat)
/* 418:    */   {
/* 419:455 */     if ((!n()) && (!paramwh.s()) && ((paramwh.i() instanceof xm)))
/* 420:    */     {
/* 421:456 */       xm localxm = (xm)paramwh.i();
/* 422:459 */       if (!paramwh.c())
/* 423:    */       {
/* 424:460 */         localxm.a(wh.a(this), 2.0F);
/* 425:461 */         localxm.a("damage.thorns", 0.5F, 1.0F);
/* 426:    */       }
/* 427:    */     }
/* 428:464 */     this.bq.f();
/* 429:465 */     return super.a(paramwh, paramFloat);
/* 430:    */   }
/* 431:    */   
/* 432:    */   public int bP()
/* 433:    */   {
/* 434:470 */     return 180;
/* 435:    */   }
/* 436:    */   
/* 437:    */   public void g(float paramFloat1, float paramFloat2)
/* 438:    */   {
/* 439:475 */     if (bL())
/* 440:    */     {
/* 441:476 */       if (V())
/* 442:    */       {
/* 443:477 */         a(paramFloat1, paramFloat2, 0.1F);
/* 444:478 */         d(this.v, this.w, this.x);
/* 445:    */         
/* 446:480 */         this.v *= 0.8999999761581421D;
/* 447:481 */         this.w *= 0.8999999761581421D;
/* 448:482 */         this.x *= 0.8999999761581421D;
/* 449:483 */         if ((!n()) && (u() == null)) {
/* 450:484 */           this.w -= 0.005D;
/* 451:    */         }
/* 452:    */       }
/* 453:    */       else
/* 454:    */       {
/* 455:487 */         super.g(paramFloat1, paramFloat2);
/* 456:    */       }
/* 457:    */     }
/* 458:    */     else {
/* 459:490 */       super.g(paramFloat1, paramFloat2);
/* 460:    */     }
/* 461:    */   }
/* 462:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afg
 * JD-Core Version:    0.7.0.1
 */