/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Random;
/*   5:    */ 
/*   6:    */ public class arh
/*   7:    */ {
/*   8:    */   private final qt a;
/*   9:    */   private final Random b;
/*  10: 23 */   private final ur c = new ur();
/*  11: 24 */   private final List d = Lists.newArrayList();
/*  12:    */   
/*  13:    */   public arh(qt paramqt)
/*  14:    */   {
/*  15: 27 */     this.a = paramqt;
/*  16: 28 */     this.b = new Random(paramqt.J());
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void a(wv paramwv, float paramFloat)
/*  20:    */   {
/*  21: 32 */     if (this.a.t.q() == 1)
/*  22:    */     {
/*  23: 33 */       int i = uv.c(paramwv.s);
/*  24: 34 */       int j = uv.c(paramwv.t) - 1;
/*  25: 35 */       int k = uv.c(paramwv.u);
/*  26:    */       
/*  27: 37 */       int m = 1;
/*  28: 38 */       int n = 0;
/*  29: 39 */       for (int i1 = -2; i1 <= 2; i1++) {
/*  30: 40 */         for (int i2 = -2; i2 <= 2; i2++) {
/*  31: 41 */           for (int i3 = -1; i3 < 3; i3++)
/*  32:    */           {
/*  33: 42 */             int i4 = i + i2 * m + i1 * n;
/*  34: 43 */             int i5 = j + i3;
/*  35: 44 */             int i6 = k + i2 * n - i1 * m;
/*  36:    */             
/*  37: 46 */             int i7 = i3 < 0 ? 1 : 0;
/*  38:    */             
/*  39: 48 */             this.a.a(new dt(i4, i5, i6), i7 != 0 ? aty.Z.P() : aty.a.P());
/*  40:    */           }
/*  41:    */         }
/*  42:    */       }
/*  43: 53 */       paramwv.b(i, j, k, paramwv.y, 0.0F);
/*  44: 54 */       paramwv.v = (paramwv.w = paramwv.x = 0.0D);
/*  45:    */       
/*  46: 56 */       return;
/*  47:    */     }
/*  48: 58 */     if (b(paramwv, paramFloat)) {
/*  49: 59 */       return;
/*  50:    */     }
/*  51: 62 */     a(paramwv);
/*  52: 63 */     b(paramwv, paramFloat);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public boolean b(wv paramwv, float paramFloat)
/*  56:    */   {
/*  57: 67 */     int i = 128;
/*  58: 68 */     double d1 = -1.0D;
/*  59:    */     
/*  60: 70 */     int j = uv.c(paramwv.s);
/*  61: 71 */     int k = uv.c(paramwv.u);
/*  62: 72 */     int m = 1;
/*  63:    */     
/*  64: 74 */     Object localObject1 = dt.a;
/*  65:    */     
/*  66: 76 */     long l = aqm.a(j, k);
/*  67:    */     Object localObject2;
/*  68: 77 */     if (this.c.b(l))
/*  69:    */     {
/*  70: 78 */       localObject2 = (ari)this.c.a(l);
/*  71:    */       
/*  72: 80 */       d1 = 0.0D;
/*  73:    */       
/*  74: 82 */       localObject1 = localObject2;
/*  75: 83 */       ((ari)localObject2).b = this.a.K();
/*  76: 84 */       m = 0;
/*  77:    */     }
/*  78:    */     else
/*  79:    */     {
/*  80: 86 */       localObject2 = new dt(paramwv);
/*  81: 88 */       for (int n = -128; n <= 128; n++) {
/*  82: 89 */         for (int i1 = -128; i1 <= 128; i1++)
/*  83:    */         {
/*  84: 90 */           Object localObject3 = ((dt)localObject2).a(n, this.a.V() - 1 - ((dt)localObject2).o(), i1);
/*  85: 91 */           while (((dt)localObject3).o() >= 0)
/*  86:    */           {
/*  87: 92 */             dt localdt1 = ((dt)localObject3).b();
/*  88: 94 */             if (this.a.p((dt)localObject3).c() == aty.aY)
/*  89:    */             {
/*  90: 96 */               while (this.a.p(localdt1 = ((dt)localObject3).b()).c() == aty.aY) {
/*  91: 97 */                 localObject3 = localdt1;
/*  92:    */               }
/*  93:100 */               double d5 = ((dt)localObject3).i((fd)localObject2);
/*  94:101 */               if ((d1 < 0.0D) || (d5 < d1))
/*  95:    */               {
/*  96:102 */                 d1 = d5;
/*  97:103 */                 localObject1 = localObject3;
/*  98:    */               }
/*  99:    */             }
/* 100:106 */             localObject3 = localdt1;
/* 101:    */           }
/* 102:    */         }
/* 103:    */       }
/* 104:    */     }
/* 105:112 */     if (d1 >= 0.0D)
/* 106:    */     {
/* 107:113 */       if (m != 0)
/* 108:    */       {
/* 109:114 */         this.c.a(l, new ari(this, (dt)localObject1, this.a.K()));
/* 110:115 */         this.d.add(Long.valueOf(l));
/* 111:    */       }
/* 112:118 */       double d2 = ((dt)localObject1).n() + 0.5D;
/* 113:119 */       double d3 = ((dt)localObject1).o() + 0.5D;
/* 114:120 */       double d4 = ((dt)localObject1).p() + 0.5D;
/* 115:    */       
/* 116:122 */       ej localej1 = null;
/* 117:123 */       if (this.a.p(((dt)localObject1).e()).c() == aty.aY) {
/* 118:124 */         localej1 = ej.c;
/* 119:    */       }
/* 120:126 */       if (this.a.p(((dt)localObject1).f()).c() == aty.aY) {
/* 121:127 */         localej1 = ej.d;
/* 122:    */       }
/* 123:129 */       if (this.a.p(((dt)localObject1).c()).c() == aty.aY) {
/* 124:130 */         localej1 = ej.f;
/* 125:    */       }
/* 126:132 */       if (this.a.p(((dt)localObject1).d()).c() == aty.aY) {
/* 127:133 */         localej1 = ej.e;
/* 128:    */       }
/* 129:136 */       ej localej2 = ej.b(paramwv.aG());
/* 130:138 */       if (localej1 != null)
/* 131:    */       {
/* 132:139 */         ej localej3 = localej1.f();
/* 133:    */         
/* 134:141 */         dt localdt2 = ((dt)localObject1).a(localej1);
/* 135:142 */         boolean bool1 = a(localdt2);
/* 136:143 */         boolean bool2 = a(localdt2.a(localej3));
/* 137:145 */         if ((bool2) && (bool1))
/* 138:    */         {
/* 139:146 */           localObject1 = ((dt)localObject1).a(localej3);
/* 140:    */           
/* 141:148 */           localej1 = localej1.d();
/* 142:149 */           localej3 = localej3.d();
/* 143:    */           
/* 144:151 */           dt localdt3 = ((dt)localObject1).a(localej1);
/* 145:152 */           bool1 = a(localdt3);
/* 146:153 */           bool2 = a(localdt3.a(localej3));
/* 147:    */         }
/* 148:156 */         float f1 = 0.5F;
/* 149:157 */         float f2 = 0.5F;
/* 150:159 */         if ((!bool2) && (bool1)) {
/* 151:160 */           f1 = 1.0F;
/* 152:161 */         } else if ((bool2) && (!bool1)) {
/* 153:162 */           f1 = 0.0F;
/* 154:163 */         } else if (bool2) {
/* 155:164 */           f2 = 0.0F;
/* 156:    */         }
/* 157:168 */         d2 = ((dt)localObject1).n() + 0.5D;
/* 158:169 */         d3 = ((dt)localObject1).o() + 0.5D;
/* 159:170 */         d4 = ((dt)localObject1).p() + 0.5D;
/* 160:    */         
/* 161:    */ 
/* 162:173 */         d2 += localej3.g() * f1 + localej1.g() * f2;
/* 163:174 */         d4 += localej3.i() * f1 + localej1.i() * f2;
/* 164:    */         
/* 165:176 */         float f3 = 0.0F;
/* 166:177 */         float f4 = 0.0F;
/* 167:178 */         float f5 = 0.0F;
/* 168:179 */         float f6 = 0.0F;
/* 169:181 */         if (localej1 == localej2)
/* 170:    */         {
/* 171:182 */           f3 = 1.0F;
/* 172:183 */           f4 = 1.0F;
/* 173:    */         }
/* 174:184 */         else if (localej1 == localej2.d())
/* 175:    */         {
/* 176:185 */           f3 = -1.0F;
/* 177:186 */           f4 = -1.0F;
/* 178:    */         }
/* 179:187 */         else if (localej1 == localej2.e())
/* 180:    */         {
/* 181:188 */           f5 = 1.0F;
/* 182:189 */           f6 = -1.0F;
/* 183:    */         }
/* 184:    */         else
/* 185:    */         {
/* 186:191 */           f5 = -1.0F;
/* 187:192 */           f6 = 1.0F;
/* 188:    */         }
/* 189:195 */         double d6 = paramwv.v;
/* 190:196 */         double d7 = paramwv.x;
/* 191:197 */         paramwv.v = (d6 * f3 + d7 * f6);
/* 192:198 */         paramwv.x = (d6 * f5 + d7 * f4);
/* 193:199 */         paramwv.y = (paramFloat - localej2.b() * 90 + localej1.b() * 90);
/* 194:    */       }
/* 195:    */       else
/* 196:    */       {
/* 197:201 */         paramwv.v = (paramwv.w = paramwv.x = 0.0D);
/* 198:    */       }
/* 199:204 */       paramwv.b(d2, d3, d4, paramwv.y, paramwv.z);
/* 200:205 */       return true;
/* 201:    */     }
/* 202:208 */     return false;
/* 203:    */   }
/* 204:    */   
/* 205:    */   private boolean a(dt paramdt)
/* 206:    */   {
/* 207:212 */     return (!this.a.d(paramdt)) || (!this.a.d(paramdt.a()));
/* 208:    */   }
/* 209:    */   
/* 210:    */   public boolean a(wv paramwv)
/* 211:    */   {
/* 212:216 */     int i = 16;
/* 213:217 */     double d1 = -1.0D;
/* 214:    */     
/* 215:219 */     double d2 = uv.c(paramwv.s);
/* 216:220 */     int j = uv.c(paramwv.t);
/* 217:221 */     int k = uv.c(paramwv.u);
/* 218:    */     
/* 219:223 */     double d3 = d2;
/* 220:224 */     int m = j;
/* 221:225 */     int n = k;
/* 222:226 */     double d4 = 0;
/* 223:    */     
/* 224:228 */     int i1 = this.b.nextInt(4);
/* 225:    */     double d7;
/* 226:    */     int i6;
/* 227:    */     int i8;
/* 228:    */     int i9;
/* 229:    */     int i13;
/* 230:    */     int i17;
/* 231:    */     int i18;
/* 232:230 */     for (double d5 = d2 - i; d5 <= d2 + i; d5++)
/* 233:    */     {
/* 234:231 */       d6 = d5 + 0.5D - paramwv.s;
/* 235:232 */       for (i3 = k - i; i3 <= k + i; i3++)
/* 236:    */       {
/* 237:233 */         d7 = i3 + 0.5D - paramwv.u;
/* 238:    */         label469:
/* 239:234 */         for (i6 = this.a.V() - 1; i6 >= 0; i6--) {
/* 240:235 */           if (this.a.d(new dt(d5, i6, i3)))
/* 241:    */           {
/* 242:236 */             while ((i6 > 0) && (this.a.d(new dt(d5, i6 - 1, i3)))) {
/* 243:237 */               i6--;
/* 244:    */             }
/* 245:240 */             for (i7 = i1; i7 < i1 + 4; i7++)
/* 246:    */             {
/* 247:241 */               i8 = i7 % 2;
/* 248:242 */               i9 = 1 - i8;
/* 249:244 */               if (i7 % 4 >= 2)
/* 250:    */               {
/* 251:245 */                 i8 = -i8;
/* 252:246 */                 i9 = -i9;
/* 253:    */               }
/* 254:249 */               for (int i10 = 0; i10 < 3; i10++) {
/* 255:250 */                 for (i13 = 0; i13 < 4; i13++) {
/* 256:251 */                   for (int i14 = -1; i14 < 4; i14++)
/* 257:    */                   {
/* 258:252 */                     i17 = d5 + (i13 - 1) * i8 + i10 * i9;
/* 259:253 */                     i18 = i6 + i14;
/* 260:254 */                     int i19 = i3 + (i13 - 1) * i9 - i10 * i8;
/* 261:256 */                     if ((i14 < 0) && (!this.a.p(new dt(i17, i18, i19)).c().r().a())) {
/* 262:    */                       break label469;
/* 263:    */                     }
/* 264:259 */                     if ((i14 >= 0) && (!this.a.d(new dt(i17, i18, i19)))) {
/* 265:    */                       break label469;
/* 266:    */                     }
/* 267:    */                   }
/* 268:    */                 }
/* 269:    */               }
/* 270:266 */               double d8 = i6 + 0.5D - paramwv.t;
/* 271:267 */               double d10 = d6 * d6 + d8 * d8 + d7 * d7;
/* 272:268 */               if ((d1 < 0.0D) || (d10 < d1))
/* 273:    */               {
/* 274:269 */                 d1 = d10;
/* 275:270 */                 d3 = d5;
/* 276:271 */                 m = i6;
/* 277:272 */                 n = i3;
/* 278:273 */                 d4 = i7 % 4;
/* 279:    */               }
/* 280:    */             }
/* 281:    */           }
/* 282:    */         }
/* 283:    */       }
/* 284:    */     }
/* 285:280 */     if (d1 < 0.0D) {
/* 286:281 */       for (d5 = d2 - i; d5 <= d2 + i; d5++)
/* 287:    */       {
/* 288:282 */         d6 = d5 + 0.5D - paramwv.s;
/* 289:283 */         for (i3 = k - i; i3 <= k + i; i3++)
/* 290:    */         {
/* 291:284 */           d7 = i3 + 0.5D - paramwv.u;
/* 292:    */           label858:
/* 293:285 */           for (i6 = this.a.V() - 1; i6 >= 0; i6--) {
/* 294:286 */             if (this.a.d(new dt(d5, i6, i3)))
/* 295:    */             {
/* 296:287 */               while ((i6 > 0) && (this.a.d(new dt(d5, i6 - 1, i3)))) {
/* 297:288 */                 i6--;
/* 298:    */               }
/* 299:291 */               for (i7 = i1; i7 < i1 + 2; i7++)
/* 300:    */               {
/* 301:292 */                 i8 = i7 % 2;
/* 302:293 */                 i9 = 1 - i8;
/* 303:294 */                 for (int i11 = 0; i11 < 4; i11++) {
/* 304:295 */                   for (i13 = -1; i13 < 4; i13++)
/* 305:    */                   {
/* 306:296 */                     int i15 = d5 + (i11 - 1) * i8;
/* 307:297 */                     i17 = i6 + i13;
/* 308:298 */                     i18 = i3 + (i11 - 1) * i9;
/* 309:300 */                     if ((i13 < 0) && (!this.a.p(new dt(i15, i17, i18)).c().r().a())) {
/* 310:    */                       break label858;
/* 311:    */                     }
/* 312:303 */                     if ((i13 >= 0) && (!this.a.d(new dt(i15, i17, i18)))) {
/* 313:    */                       break label858;
/* 314:    */                     }
/* 315:    */                   }
/* 316:    */                 }
/* 317:309 */                 double d9 = i6 + 0.5D - paramwv.t;
/* 318:310 */                 double d11 = d6 * d6 + d9 * d9 + d7 * d7;
/* 319:311 */                 if ((d1 < 0.0D) || (d11 < d1))
/* 320:    */                 {
/* 321:312 */                   d1 = d11;
/* 322:313 */                   d3 = d5;
/* 323:314 */                   m = i6;
/* 324:315 */                   n = i3;
/* 325:316 */                   d4 = i7 % 2;
/* 326:    */                 }
/* 327:    */               }
/* 328:    */             }
/* 329:    */           }
/* 330:    */         }
/* 331:    */       }
/* 332:    */     }
/* 333:325 */     d5 = d4;
/* 334:    */     
/* 335:327 */     double d6 = d3;
/* 336:328 */     int i2 = m;
/* 337:329 */     int i3 = n;
/* 338:    */     
/* 339:331 */     int i4 = d5 % 2;
/* 340:332 */     int i5 = 1 - i4;
/* 341:334 */     if (d5 % 4 >= 2)
/* 342:    */     {
/* 343:335 */       i4 = -i4;
/* 344:336 */       i5 = -i5;
/* 345:    */     }
/* 346:    */     int i12;
/* 347:    */     int i16;
/* 348:339 */     if (d1 < 0.0D)
/* 349:    */     {
/* 350:340 */       m = uv.a(m, 70, this.a.V() - 10);
/* 351:341 */       i2 = m;
/* 352:343 */       for (i6 = -1; i6 <= 1; i6++) {
/* 353:344 */         for (i7 = 1; i7 < 3; i7++) {
/* 354:345 */           for (i8 = -1; i8 < 3; i8++)
/* 355:    */           {
/* 356:346 */             i9 = d6 + (i7 - 1) * i4 + i6 * i5;
/* 357:347 */             i12 = i2 + i8;
/* 358:348 */             i13 = i3 + (i7 - 1) * i5 - i6 * i4;
/* 359:    */             
/* 360:350 */             i16 = i8 < 0 ? 1 : 0;
/* 361:    */             
/* 362:352 */             this.a.a(new dt(i9, i12, i13), i16 != 0 ? aty.Z.P() : aty.a.P());
/* 363:    */           }
/* 364:    */         }
/* 365:    */       }
/* 366:    */     }
/* 367:358 */     bec localbec = aty.aY.P().a(ayy.a, i4 != 0 ? el.a : el.c);
/* 368:359 */     for (int i7 = 0; i7 < 4; i7++)
/* 369:    */     {
/* 370:360 */       for (i8 = 0; i8 < 4; i8++) {
/* 371:361 */         for (i9 = -1; i9 < 4; i9++)
/* 372:    */         {
/* 373:362 */           i12 = d6 + (i8 - 1) * i4;
/* 374:363 */           i13 = i2 + i9;
/* 375:364 */           i16 = i3 + (i8 - 1) * i5;
/* 376:    */           
/* 377:366 */           i17 = (i8 == 0) || (i8 == 3) || (i9 == -1) || (i9 == 3) ? 1 : 0;
/* 378:367 */           this.a.a(new dt(i12, i13, i16), i17 != 0 ? aty.Z.P() : localbec, 2);
/* 379:    */         }
/* 380:    */       }
/* 381:371 */       for (i8 = 0; i8 < 4; i8++) {
/* 382:372 */         for (i9 = -1; i9 < 4; i9++)
/* 383:    */         {
/* 384:373 */           i12 = d6 + (i8 - 1) * i4;
/* 385:374 */           i13 = i2 + i9;
/* 386:375 */           i16 = i3 + (i8 - 1) * i5;
/* 387:    */           
/* 388:377 */           this.a.c(new dt(i12, i13, i16), this.a.p(new dt(i12, i13, i16)).c());
/* 389:    */         }
/* 390:    */       }
/* 391:    */     }
/* 392:382 */     return true;
/* 393:    */   }
/* 394:    */   
/* 395:    */   public void a(long paramLong)
/* 396:    */   {
/* 397:386 */     if (paramLong % 100L == 0L)
/* 398:    */     {
/* 399:387 */       Iterator localIterator = this.d.iterator();
/* 400:388 */       long l = paramLong - 600L;
/* 401:390 */       while (localIterator.hasNext())
/* 402:    */       {
/* 403:391 */         Long localLong = (Long)localIterator.next();
/* 404:392 */         ari localari = (ari)this.c.a(localLong.longValue());
/* 405:394 */         if ((localari == null) || (localari.b < l))
/* 406:    */         {
/* 407:395 */           localIterator.remove();
/* 408:396 */           this.c.d(localLong.longValue());
/* 409:    */         }
/* 410:    */       }
/* 411:    */     }
/* 412:    */   }
/* 413:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     arh
 * JD-Core Version:    0.7.0.1
 */