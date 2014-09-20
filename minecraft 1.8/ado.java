/*   1:    */ import java.util.Arrays;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class ado
/*   6:    */   extends wv
/*   7:    */ {
/*   8: 36 */   private static final List d = Arrays.asList(new adp[] { new adp(new amj(amk.T), 10).a(0.9F), new adp(new amj(amk.aF), 10), new adp(new amj(amk.aX), 10), new adp(new amj(amk.bz), 10), new adp(new amj(amk.F), 5), new adp(new amj(amk.aR), 2).a(0.9F), new adp(new amj(amk.z), 10), new adp(new amj(amk.y), 5), new adp(new amj(amk.aW, 10, akv.p.b()), 1), new adp(new amj(aty.bR), 10), new adp(new amj(amk.bt), 10) });
/*   9: 49 */   private static final List e = Arrays.asList(new adp[] { new adp(new amj(aty.bx), 1), new adp(new amj(amk.co), 1), new adp(new amj(amk.aA), 1), new adp(new amj(amk.f), 1).a(0.25F).a(), new adp(new amj(amk.aR), 1).a(0.25F).a(), new adp(new amj(amk.aL), 1).a() });
/*  10: 57 */   private static final List f = Arrays.asList(new adp[] { new adp(new amj(amk.aU, 1, ali.a.a()), 60), new adp(new amj(amk.aU, 1, ali.b.a()), 25), new adp(new amj(amk.aU, 1, ali.c.a()), 2), new adp(new amj(amk.aU, 1, ali.d.a()), 13) });
/*  11:    */   
/*  12:    */   public static List j()
/*  13:    */   {
/*  14: 66 */     return f;
/*  15:    */   }
/*  16:    */   
/*  17: 69 */   private int g = -1;
/*  18: 70 */   private int h = -1;
/*  19: 71 */   private int i = -1;
/*  20:    */   private atr ap;
/*  21:    */   private boolean aq;
/*  22:    */   public int a;
/*  23:    */   public ahd b;
/*  24:    */   private int ar;
/*  25:    */   private int as;
/*  26:    */   private int at;
/*  27:    */   private int au;
/*  28:    */   private int av;
/*  29:    */   private float aw;
/*  30:    */   public wv c;
/*  31:    */   private int ax;
/*  32:    */   private double ay;
/*  33:    */   private double az;
/*  34:    */   private double aA;
/*  35:    */   private double aB;
/*  36:    */   private double aC;
/*  37:    */   private double aD;
/*  38:    */   private double aE;
/*  39:    */   private double aF;
/*  40:    */   
/*  41:    */   public ado(aqu paramaqu)
/*  42:    */   {
/*  43: 85 */     super(paramaqu);
/*  44: 86 */     a(0.25F, 0.25F);
/*  45: 87 */     this.ah = true;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public ado(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, ahd paramahd)
/*  49:    */   {
/*  50: 91 */     this(paramaqu);
/*  51: 92 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  52: 93 */     this.ah = true;
/*  53: 94 */     this.b = paramahd;
/*  54: 95 */     paramahd.bE = this;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public ado(aqu paramaqu, ahd paramahd)
/*  58:    */   {
/*  59: 99 */     super(paramaqu);
/*  60:100 */     this.ah = true;
/*  61:101 */     this.b = paramahd;
/*  62:102 */     this.b.bE = this;
/*  63:    */     
/*  64:104 */     a(0.25F, 0.25F);
/*  65:    */     
/*  66:106 */     b(paramahd.s, paramahd.t + paramahd.aR(), paramahd.u, paramahd.y, paramahd.z);
/*  67:    */     
/*  68:108 */     this.s -= uv.b(this.y / 180.0F * 3.141593F) * 0.16F;
/*  69:109 */     this.t -= 0.1000000014901161D;
/*  70:110 */     this.u -= uv.a(this.y / 180.0F * 3.141593F) * 0.16F;
/*  71:111 */     b(this.s, this.t, this.u);
/*  72:    */     
/*  73:113 */     float f1 = 0.4F;
/*  74:114 */     this.v = (-uv.a(this.y / 180.0F * 3.141593F) * uv.b(this.z / 180.0F * 3.141593F) * f1);
/*  75:115 */     this.x = (uv.b(this.y / 180.0F * 3.141593F) * uv.b(this.z / 180.0F * 3.141593F) * f1);
/*  76:116 */     this.w = (-uv.a(this.z / 180.0F * 3.141593F) * f1);
/*  77:    */     
/*  78:118 */     c(this.v, this.w, this.x, 1.5F, 1.0F);
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected void h() {}
/*  82:    */   
/*  83:    */   public boolean a(double paramDouble)
/*  84:    */   {
/*  85:127 */     double d1 = aQ().a() * 4.0D;
/*  86:128 */     d1 *= 64.0D;
/*  87:129 */     return paramDouble < d1 * d1;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  91:    */   {
/*  92:133 */     float f1 = uv.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  93:    */     
/*  94:135 */     paramDouble1 /= f1;
/*  95:136 */     paramDouble2 /= f1;
/*  96:137 */     paramDouble3 /= f1;
/*  97:    */     
/*  98:139 */     paramDouble1 += this.V.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  99:140 */     paramDouble2 += this.V.nextGaussian() * 0.007499999832361937D * paramFloat2;
/* 100:141 */     paramDouble3 += this.V.nextGaussian() * 0.007499999832361937D * paramFloat2;
/* 101:    */     
/* 102:143 */     paramDouble1 *= paramFloat1;
/* 103:144 */     paramDouble2 *= paramFloat1;
/* 104:145 */     paramDouble3 *= paramFloat1;
/* 105:    */     
/* 106:147 */     this.v = paramDouble1;
/* 107:148 */     this.w = paramDouble2;
/* 108:149 */     this.x = paramDouble3;
/* 109:    */     
/* 110:151 */     float f2 = uv.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 111:    */     
/* 112:153 */     this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/* 113:154 */     this.B = (this.z = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.141592741012573D));
/* 114:155 */     this.ar = 0;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 118:    */   {
/* 119:164 */     this.ay = paramDouble1;
/* 120:165 */     this.az = paramDouble2;
/* 121:166 */     this.aA = paramDouble3;
/* 122:167 */     this.aB = paramFloat1;
/* 123:168 */     this.aC = paramFloat2;
/* 124:    */     
/* 125:170 */     this.ax = paramInt;
/* 126:    */     
/* 127:172 */     this.v = this.aD;
/* 128:173 */     this.w = this.aE;
/* 129:174 */     this.x = this.aF;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 133:    */   {
/* 134:179 */     this.aD = (this.v = paramDouble1);
/* 135:180 */     this.aE = (this.w = paramDouble2);
/* 136:181 */     this.aF = (this.x = paramDouble3);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void s_()
/* 140:    */   {
/* 141:186 */     super.s_();
/* 142:188 */     if (this.ax > 0)
/* 143:    */     {
/* 144:189 */       double d1 = this.s + (this.ay - this.s) / this.ax;
/* 145:190 */       double d2 = this.t + (this.az - this.t) / this.ax;
/* 146:191 */       double d3 = this.u + (this.aA - this.u) / this.ax;
/* 147:    */       
/* 148:193 */       double d5 = uv.g(this.aB - this.y);
/* 149:    */       
/* 150:195 */       this.y = ((float)(this.y + d5 / this.ax));
/* 151:196 */       this.z = ((float)(this.z + (this.aC - this.z) / this.ax));
/* 152:    */       
/* 153:198 */       this.ax -= 1;
/* 154:199 */       b(d1, d2, d3);
/* 155:200 */       b(this.y, this.z);
/* 156:201 */       return;
/* 157:    */     }
/* 158:204 */     if (!this.o.D)
/* 159:    */     {
/* 160:205 */       localObject1 = this.b.bY();
/* 161:206 */       if ((this.b.I) || (!this.b.ai()) || (localObject1 == null) || (((amj)localObject1).b() != amk.aR) || (h(this.b) > 1024.0D))
/* 162:    */       {
/* 163:207 */         J();
/* 164:208 */         this.b.bE = null;
/* 165:209 */         return;
/* 166:    */       }
/* 167:212 */       if (this.c != null) {
/* 168:213 */         if (this.c.I)
/* 169:    */         {
/* 170:214 */           this.c = null;
/* 171:    */         }
/* 172:    */         else
/* 173:    */         {
/* 174:216 */           this.s = this.c.s;
/* 175:217 */           this.t = (this.c.aQ().b + this.c.K * 0.8D);
/* 176:218 */           this.u = this.c.u;
/* 177:219 */           return;
/* 178:    */         }
/* 179:    */       }
/* 180:    */     }
/* 181:224 */     if (this.a > 0) {
/* 182:225 */       this.a -= 1;
/* 183:    */     }
/* 184:228 */     if (this.aq)
/* 185:    */     {
/* 186:229 */       if (this.o.p(new dt(this.g, this.h, this.i)).c() == this.ap)
/* 187:    */       {
/* 188:230 */         this.ar += 1;
/* 189:231 */         if (this.ar == 1200) {
/* 190:232 */           J();
/* 191:    */         }
/* 192:234 */         return;
/* 193:    */       }
/* 194:236 */       this.aq = false;
/* 195:    */       
/* 196:238 */       this.v *= this.V.nextFloat() * 0.2F;
/* 197:239 */       this.w *= this.V.nextFloat() * 0.2F;
/* 198:240 */       this.x *= this.V.nextFloat() * 0.2F;
/* 199:241 */       this.ar = 0;
/* 200:242 */       this.as = 0;
/* 201:    */     }
/* 202:    */     else
/* 203:    */     {
/* 204:245 */       this.as += 1;
/* 205:    */     }
/* 206:248 */     Object localObject1 = new brw(this.s, this.t, this.u);
/* 207:249 */     brw localbrw = new brw(this.s + this.v, this.t + this.w, this.u + this.x);
/* 208:250 */     bru localbru1 = this.o.a((brw)localObject1, localbrw);
/* 209:    */     
/* 210:252 */     localObject1 = new brw(this.s, this.t, this.u);
/* 211:253 */     localbrw = new brw(this.s + this.v, this.t + this.w, this.u + this.x);
/* 212:254 */     if (localbru1 != null) {
/* 213:255 */       localbrw = new brw(localbru1.c.a, localbru1.c.b, localbru1.c.c);
/* 214:    */     }
/* 215:257 */     Object localObject2 = null;
/* 216:258 */     List localList = this.o.b(this, aQ().a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
/* 217:259 */     double d4 = 0.0D;
/* 218:260 */     for (int j = 0; j < localList.size(); j++)
/* 219:    */     {
/* 220:261 */       wv localwv = (wv)localList.get(j);
/* 221:262 */       if ((localwv.ad()) && ((localwv != this.b) || (this.as >= 5)))
/* 222:    */       {
/* 223:266 */         float f3 = 0.3F;
/* 224:267 */         brt localbrt1 = localwv.aQ().b(f3, f3, f3);
/* 225:268 */         bru localbru2 = localbrt1.a((brw)localObject1, localbrw);
/* 226:269 */         if (localbru2 != null)
/* 227:    */         {
/* 228:270 */           double d7 = ((brw)localObject1).f(localbru2.c);
/* 229:271 */           if ((d7 < d4) || (d4 == 0.0D))
/* 230:    */           {
/* 231:272 */             localObject2 = localwv;
/* 232:273 */             d4 = d7;
/* 233:    */           }
/* 234:    */         }
/* 235:    */       }
/* 236:    */     }
/* 237:278 */     if (localObject2 != null) {
/* 238:279 */       localbru1 = new bru(localObject2);
/* 239:    */     }
/* 240:282 */     if (localbru1 != null) {
/* 241:283 */       if (localbru1.d != null)
/* 242:    */       {
/* 243:284 */         if (localbru1.d.a(wh.a(this, this.b), 0.0F)) {
/* 244:285 */           this.c = localbru1.d;
/* 245:    */         }
/* 246:    */       }
/* 247:    */       else {
/* 248:288 */         this.aq = true;
/* 249:    */       }
/* 250:    */     }
/* 251:292 */     if (this.aq) {
/* 252:293 */       return;
/* 253:    */     }
/* 254:296 */     d(this.v, this.w, this.x);
/* 255:    */     
/* 256:298 */     float f1 = uv.a(this.v * this.v + this.x * this.x);
/* 257:299 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.141592741012573D));
/* 258:300 */     this.z = ((float)(Math.atan2(this.w, f1) * 180.0D / 3.141592741012573D));
/* 259:302 */     while (this.z - this.B < -180.0F) {
/* 260:303 */       this.B -= 360.0F;
/* 261:    */     }
/* 262:305 */     while (this.z - this.B >= 180.0F) {
/* 263:306 */       this.B += 360.0F;
/* 264:    */     }
/* 265:309 */     while (this.y - this.A < -180.0F) {
/* 266:310 */       this.A -= 360.0F;
/* 267:    */     }
/* 268:312 */     while (this.y - this.A >= 180.0F) {
/* 269:313 */       this.A += 360.0F;
/* 270:    */     }
/* 271:316 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 272:317 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/* 273:    */     
/* 274:319 */     float f2 = 0.92F;
/* 275:321 */     if ((this.C) || (this.D)) {
/* 276:322 */       f2 = 0.5F;
/* 277:    */     }
/* 278:325 */     int k = 5;
/* 279:326 */     double d6 = 0.0D;
/* 280:    */     double d11;
/* 281:327 */     for (int m = 0; m < k; m++)
/* 282:    */     {
/* 283:328 */       brt localbrt2 = aQ();
/* 284:329 */       double d9 = localbrt2.e - localbrt2.b;
/* 285:330 */       double d10 = localbrt2.b + d9 * m / k;
/* 286:331 */       d11 = localbrt2.b + d9 * (m + 1) / k;
/* 287:332 */       brt localbrt3 = new brt(localbrt2.a, d10, localbrt2.c, localbrt2.d, d11, localbrt2.f);
/* 288:333 */       if (this.o.b(localbrt3, bof.h)) {
/* 289:334 */         d6 += 1.0D / k;
/* 290:    */       }
/* 291:    */     }
/* 292:338 */     if ((!this.o.D) && (d6 > 0.0D))
/* 293:    */     {
/* 294:339 */       qt localqt = (qt)this.o;
/* 295:    */       
/* 296:341 */       int n = 1;
/* 297:342 */       dt localdt = new dt(this).a();
/* 298:343 */       if ((this.V.nextFloat() < 0.25F) && (this.o.C(localdt))) {
/* 299:344 */         n = 2;
/* 300:    */       }
/* 301:346 */       if ((this.V.nextFloat() < 0.5F) && (!this.o.i(localdt))) {
/* 302:347 */         n--;
/* 303:    */       }
/* 304:350 */       if (this.at > 0)
/* 305:    */       {
/* 306:351 */         this.at -= 1;
/* 307:353 */         if (this.at <= 0)
/* 308:    */         {
/* 309:354 */           this.au = 0;
/* 310:355 */           this.av = 0;
/* 311:    */         }
/* 312:    */       }
/* 313:    */       else
/* 314:    */       {
/* 315:    */         float f4;
/* 316:    */         float f5;
/* 317:    */         float f6;
/* 318:    */         double d12;
/* 319:    */         double d13;
/* 320:357 */         if (this.av > 0)
/* 321:    */         {
/* 322:358 */           this.av -= n;
/* 323:360 */           if (this.av <= 0)
/* 324:    */           {
/* 325:361 */             this.w -= 0.2000000029802322D;
/* 326:362 */             a("random.splash", 0.25F, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
/* 327:363 */             f4 = uv.c(aQ().b);
/* 328:364 */             localqt.a(ew.e, this.s, f4 + 1.0F, this.u, (int)(1.0F + this.J * 20.0F), this.J, 0.0D, this.J, 0.2000000029802322D, new int[0]);
/* 329:365 */             localqt.a(ew.g, this.s, f4 + 1.0F, this.u, (int)(1.0F + this.J * 20.0F), this.J, 0.0D, this.J, 0.2000000029802322D, new int[0]);
/* 330:    */             
/* 331:367 */             this.at = uv.a(this.V, 10, 30);
/* 332:    */           }
/* 333:    */           else
/* 334:    */           {
/* 335:369 */             this.aw = ((float)(this.aw + this.V.nextGaussian() * 4.0D));
/* 336:    */             
/* 337:371 */             f4 = this.aw * 0.01745329F;
/* 338:372 */             f5 = uv.a(f4);
/* 339:373 */             f6 = uv.b(f4);
/* 340:374 */             d11 = this.s + f5 * this.av * 0.1F;
/* 341:375 */             d12 = uv.c(aQ().b) + 1.0F;
/* 342:376 */             d13 = this.u + f6 * this.av * 0.1F;
/* 343:378 */             if (this.V.nextFloat() < 0.15F) {
/* 344:379 */               localqt.a(ew.e, d11, d12 - 0.1000000014901161D, d13, 1, f5, 0.1D, f6, 0.0D, new int[0]);
/* 345:    */             }
/* 346:382 */             float f7 = f5 * 0.04F;
/* 347:383 */             float f8 = f6 * 0.04F;
/* 348:    */             
/* 349:385 */             localqt.a(ew.g, d11, d12, d13, 0, f8, 0.01D, -f7, 1.0D, new int[0]);
/* 350:386 */             localqt.a(ew.g, d11, d12, d13, 0, -f8, 0.01D, f7, 1.0D, new int[0]);
/* 351:    */           }
/* 352:    */         }
/* 353:388 */         else if (this.au > 0)
/* 354:    */         {
/* 355:389 */           this.au -= n;
/* 356:    */           
/* 357:391 */           f4 = 0.15F;
/* 358:393 */           if (this.au < 20) {
/* 359:394 */             f4 = (float)(f4 + (20 - this.au) * 0.05D);
/* 360:395 */           } else if (this.au < 40) {
/* 361:396 */             f4 = (float)(f4 + (40 - this.au) * 0.02D);
/* 362:397 */           } else if (this.au < 60) {
/* 363:398 */             f4 = (float)(f4 + (60 - this.au) * 0.01D);
/* 364:    */           }
/* 365:401 */           if (this.V.nextFloat() < f4)
/* 366:    */           {
/* 367:402 */             f5 = uv.a(this.V, 0.0F, 360.0F) * 0.01745329F;
/* 368:403 */             f6 = uv.a(this.V, 25.0F, 60.0F);
/* 369:404 */             d11 = this.s + uv.a(f5) * f6 * 0.1F;
/* 370:405 */             d12 = uv.c(aQ().b) + 1.0F;
/* 371:406 */             d13 = this.u + uv.b(f5) * f6 * 0.1F;
/* 372:    */             
/* 373:408 */             localqt.a(ew.f, d11, d12, d13, 2 + this.V.nextInt(2), 0.1000000014901161D, 0.0D, 0.1000000014901161D, 0.0D, new int[0]);
/* 374:    */           }
/* 375:411 */           if (this.au <= 0)
/* 376:    */           {
/* 377:412 */             this.aw = uv.a(this.V, 0.0F, 360.0F);
/* 378:413 */             this.av = uv.a(this.V, 20, 80);
/* 379:    */           }
/* 380:    */         }
/* 381:    */         else
/* 382:    */         {
/* 383:416 */           this.au = uv.a(this.V, 100, 900);
/* 384:417 */           this.au -= aph.h(this.b) * 20 * 5;
/* 385:    */         }
/* 386:    */       }
/* 387:420 */       if (this.at > 0) {
/* 388:421 */         this.w -= this.V.nextFloat() * this.V.nextFloat() * this.V.nextFloat() * 0.2D;
/* 389:    */       }
/* 390:    */     }
/* 391:425 */     double d8 = d6 * 2.0D - 1.0D;
/* 392:426 */     this.w += 0.03999999910593033D * d8;
/* 393:427 */     if (d6 > 0.0D)
/* 394:    */     {
/* 395:428 */       f2 = (float)(f2 * 0.9D);
/* 396:429 */       this.w *= 0.8D;
/* 397:    */     }
/* 398:432 */     this.v *= f2;
/* 399:433 */     this.w *= f2;
/* 400:434 */     this.x *= f2;
/* 401:    */     
/* 402:436 */     b(this.s, this.t, this.u);
/* 403:    */   }
/* 404:    */   
/* 405:    */   public void b(fn paramfn)
/* 406:    */   {
/* 407:441 */     paramfn.a("xTile", (short)this.g);
/* 408:442 */     paramfn.a("yTile", (short)this.h);
/* 409:443 */     paramfn.a("zTile", (short)this.i);
/* 410:444 */     oa localoa = (oa)atr.c.c(this.ap);
/* 411:445 */     paramfn.a("inTile", localoa == null ? "" : localoa.toString());
/* 412:446 */     paramfn.a("shake", (byte)this.a);
/* 413:447 */     paramfn.a("inGround", (byte)(this.aq ? 1 : 0));
/* 414:    */   }
/* 415:    */   
/* 416:    */   public void a(fn paramfn)
/* 417:    */   {
/* 418:452 */     this.g = paramfn.e("xTile");
/* 419:453 */     this.h = paramfn.e("yTile");
/* 420:454 */     this.i = paramfn.e("zTile");
/* 421:455 */     if (paramfn.b("inTile", 8)) {
/* 422:456 */       this.ap = atr.b(paramfn.j("inTile"));
/* 423:    */     } else {
/* 424:458 */       this.ap = atr.c(paramfn.d("inTile") & 0xFF);
/* 425:    */     }
/* 426:460 */     this.a = (paramfn.d("shake") & 0xFF);
/* 427:461 */     this.aq = (paramfn.d("inGround") == 1);
/* 428:    */   }
/* 429:    */   
/* 430:    */   public int l()
/* 431:    */   {
/* 432:465 */     if (this.o.D) {
/* 433:466 */       return 0;
/* 434:    */     }
/* 435:469 */     int j = 0;
/* 436:470 */     if (this.c != null)
/* 437:    */     {
/* 438:471 */       double d1 = this.b.s - this.s;
/* 439:472 */       double d3 = this.b.t - this.t;
/* 440:473 */       double d5 = this.b.u - this.u;
/* 441:    */       
/* 442:475 */       double d7 = uv.a(d1 * d1 + d3 * d3 + d5 * d5);
/* 443:476 */       double d9 = 0.1D;
/* 444:477 */       this.c.v += d1 * d9;
/* 445:478 */       this.c.w += d3 * d9 + uv.a(d7) * 0.08D;
/* 446:479 */       this.c.x += d5 * d9;
/* 447:480 */       j = 3;
/* 448:    */     }
/* 449:481 */     else if (this.at > 0)
/* 450:    */     {
/* 451:482 */       adw localadw = new adw(this.o, this.s, this.t, this.u, m());
/* 452:483 */       double d2 = this.b.s - this.s;
/* 453:484 */       double d4 = this.b.t - this.t;
/* 454:485 */       double d6 = this.b.u - this.u;
/* 455:    */       
/* 456:487 */       double d8 = uv.a(d2 * d2 + d4 * d4 + d6 * d6);
/* 457:488 */       double d10 = 0.1D;
/* 458:489 */       localadw.v = (d2 * d10);
/* 459:490 */       localadw.w = (d4 * d10 + uv.a(d8) * 0.08D);
/* 460:491 */       localadw.x = (d6 * d10);
/* 461:492 */       this.o.d(localadw);
/* 462:493 */       this.b.o.d(new xk(this.b.o, this.b.s, this.b.t + 0.5D, this.b.u + 0.5D, this.V.nextInt(6) + 1));
/* 463:494 */       j = 1;
/* 464:    */     }
/* 465:496 */     if (this.aq) {
/* 466:497 */       j = 2;
/* 467:    */     }
/* 468:500 */     J();
/* 469:501 */     this.b.bE = null;
/* 470:502 */     return j;
/* 471:    */   }
/* 472:    */   
/* 473:    */   private amj m()
/* 474:    */   {
/* 475:506 */     float f1 = this.o.s.nextFloat();
/* 476:507 */     int j = aph.g(this.b);
/* 477:508 */     int k = aph.h(this.b);
/* 478:509 */     float f2 = 0.1F - j * 0.025F - k * 0.01F;
/* 479:510 */     float f3 = 0.05F + j * 0.01F - k * 0.01F;
/* 480:    */     
/* 481:512 */     f2 = uv.a(f2, 0.0F, 1.0F);
/* 482:513 */     f3 = uv.a(f3, 0.0F, 1.0F);
/* 483:515 */     if (f1 < f2)
/* 484:    */     {
/* 485:516 */       this.b.b(ty.D);
/* 486:517 */       return ((adp)vj.a(this.V, d)).a(this.V);
/* 487:    */     }
/* 488:519 */     f1 -= f2;
/* 489:521 */     if (f1 < f3)
/* 490:    */     {
/* 491:522 */       this.b.b(ty.E);
/* 492:523 */       return ((adp)vj.a(this.V, e)).a(this.V);
/* 493:    */     }
/* 494:525 */     f1 -= f3;
/* 495:    */     
/* 496:527 */     this.b.b(ty.C);
/* 497:528 */     return ((adp)vj.a(this.V, f)).a(this.V);
/* 498:    */   }
/* 499:    */   
/* 500:    */   public void J()
/* 501:    */   {
/* 502:533 */     super.J();
/* 503:534 */     if (this.b != null) {
/* 504:535 */       this.b.bE = null;
/* 505:    */     }
/* 506:    */   }
/* 507:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ado
 * JD-Core Version:    0.7.0.1
 */