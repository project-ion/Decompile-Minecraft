/*   1:    */ import java.util.Arrays;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bat
/*   6:    */   extends atr
/*   7:    */ {
/*   8: 29 */   public static final beu a = beu.a("facing", en.a);
/*   9: 30 */   public static final bev b = bev.a("half", bau.class);
/*  10: 31 */   public static final bev M = bev.a("shape", bav.class);
/*  11: 33 */   private static final int[][] N = { { 4, 5 }, { 5, 7 }, { 6, 7 }, { 4, 6 }, { 0, 1 }, { 1, 3 }, { 2, 3 }, { 0, 2 } };
/*  12:    */   private final atr O;
/*  13:    */   private final bec P;
/*  14:    */   private boolean Q;
/*  15:    */   private int R;
/*  16:    */   
/*  17:    */   protected bat(bec parambec)
/*  18:    */   {
/*  19: 49 */     super(parambec.c().J);
/*  20: 50 */     j(this.L.b().a(a, ej.c).a(b, bau.b).a(M, bav.a));
/*  21: 51 */     this.O = parambec.c();
/*  22: 52 */     this.P = parambec;
/*  23: 53 */     c(this.O.w);
/*  24: 54 */     b(this.O.x / 3.0F);
/*  25: 55 */     a(this.O.H);
/*  26: 56 */     e(255);
/*  27: 57 */     a(akf.b);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(ard paramard, dt paramdt)
/*  31:    */   {
/*  32: 62 */     if (this.Q) {
/*  33: 63 */       a(0.5F * (this.R % 2), 0.5F * (this.R / 4 % 2), 0.5F * (this.R / 2 % 2), 0.5F + 0.5F * (this.R % 2), 0.5F + 0.5F * (this.R / 4 % 2), 0.5F + 0.5F * (this.R / 2 % 2));
/*  34:    */     } else {
/*  35: 72 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  36:    */     }
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean c()
/*  40:    */   {
/*  41: 78 */     return false;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean d()
/*  45:    */   {
/*  46: 83 */     return false;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void e(ard paramard, dt paramdt)
/*  50:    */   {
/*  51: 87 */     if (paramard.p(paramdt).b(b) == bau.a) {
/*  52: 88 */       a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  53:    */     } else {
/*  54: 90 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public static boolean c(atr paramatr)
/*  59:    */   {
/*  60: 95 */     return paramatr instanceof bat;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static boolean a(ard paramard, dt paramdt, bec parambec)
/*  64:    */   {
/*  65: 99 */     bec localbec = paramard.p(paramdt);
/*  66:100 */     atr localatr = localbec.c();
/*  67:101 */     if ((c(localatr)) && (localbec.b(b) == parambec.b(b)) && (localbec.b(a) == parambec.b(a))) {
/*  68:102 */       return true;
/*  69:    */     }
/*  70:105 */     return false;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public int f(ard paramard, dt paramdt)
/*  74:    */   {
/*  75:109 */     bec localbec1 = paramard.p(paramdt);
/*  76:110 */     ej localej1 = (ej)localbec1.b(a);
/*  77:111 */     bau localbau = (bau)localbec1.b(b);
/*  78:112 */     int i = localbau == bau.a ? 1 : 0;
/*  79:    */     bec localbec2;
/*  80:    */     atr localatr;
/*  81:    */     ej localej2;
/*  82:114 */     if (localej1 == ej.f)
/*  83:    */     {
/*  84:115 */       localbec2 = paramard.p(paramdt.f());
/*  85:116 */       localatr = localbec2.c();
/*  86:117 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/*  87:    */       {
/*  88:118 */         localej2 = (ej)localbec2.b(a);
/*  89:119 */         if ((localej2 == ej.c) && (!a(paramard, paramdt.d(), localbec1))) {
/*  90:120 */           return i != 0 ? 1 : 2;
/*  91:    */         }
/*  92:121 */         if ((localej2 == ej.d) && (!a(paramard, paramdt.c(), localbec1))) {
/*  93:122 */           return i != 0 ? 2 : 1;
/*  94:    */         }
/*  95:    */       }
/*  96:    */     }
/*  97:125 */     else if (localej1 == ej.e)
/*  98:    */     {
/*  99:126 */       localbec2 = paramard.p(paramdt.e());
/* 100:127 */       localatr = localbec2.c();
/* 101:128 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 102:    */       {
/* 103:129 */         localej2 = (ej)localbec2.b(a);
/* 104:130 */         if ((localej2 == ej.c) && (!a(paramard, paramdt.d(), localbec1))) {
/* 105:131 */           return i != 0 ? 2 : 1;
/* 106:    */         }
/* 107:132 */         if ((localej2 == ej.d) && (!a(paramard, paramdt.c(), localbec1))) {
/* 108:133 */           return i != 0 ? 1 : 2;
/* 109:    */         }
/* 110:    */       }
/* 111:    */     }
/* 112:136 */     else if (localej1 == ej.d)
/* 113:    */     {
/* 114:137 */       localbec2 = paramard.p(paramdt.d());
/* 115:138 */       localatr = localbec2.c();
/* 116:139 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 117:    */       {
/* 118:140 */         localej2 = (ej)localbec2.b(a);
/* 119:141 */         if ((localej2 == ej.e) && (!a(paramard, paramdt.f(), localbec1))) {
/* 120:142 */           return i != 0 ? 2 : 1;
/* 121:    */         }
/* 122:143 */         if ((localej2 == ej.f) && (!a(paramard, paramdt.e(), localbec1))) {
/* 123:144 */           return i != 0 ? 1 : 2;
/* 124:    */         }
/* 125:    */       }
/* 126:    */     }
/* 127:147 */     else if (localej1 == ej.c)
/* 128:    */     {
/* 129:148 */       localbec2 = paramard.p(paramdt.c());
/* 130:149 */       localatr = localbec2.c();
/* 131:150 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 132:    */       {
/* 133:151 */         localej2 = (ej)localbec2.b(a);
/* 134:152 */         if ((localej2 == ej.e) && (!a(paramard, paramdt.f(), localbec1))) {
/* 135:153 */           return i != 0 ? 1 : 2;
/* 136:    */         }
/* 137:154 */         if ((localej2 == ej.f) && (!a(paramard, paramdt.e(), localbec1))) {
/* 138:155 */           return i != 0 ? 2 : 1;
/* 139:    */         }
/* 140:    */       }
/* 141:    */     }
/* 142:160 */     return 0;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public int g(ard paramard, dt paramdt)
/* 146:    */   {
/* 147:164 */     bec localbec1 = paramard.p(paramdt);
/* 148:165 */     ej localej1 = (ej)localbec1.b(a);
/* 149:166 */     bau localbau = (bau)localbec1.b(b);
/* 150:167 */     int i = localbau == bau.a ? 1 : 0;
/* 151:    */     bec localbec2;
/* 152:    */     atr localatr;
/* 153:    */     ej localej2;
/* 154:169 */     if (localej1 == ej.f)
/* 155:    */     {
/* 156:170 */       localbec2 = paramard.p(paramdt.e());
/* 157:171 */       localatr = localbec2.c();
/* 158:172 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 159:    */       {
/* 160:173 */         localej2 = (ej)localbec2.b(a);
/* 161:174 */         if ((localej2 == ej.c) && (!a(paramard, paramdt.c(), localbec1))) {
/* 162:175 */           return i != 0 ? 1 : 2;
/* 163:    */         }
/* 164:176 */         if ((localej2 == ej.d) && (!a(paramard, paramdt.d(), localbec1))) {
/* 165:177 */           return i != 0 ? 2 : 1;
/* 166:    */         }
/* 167:    */       }
/* 168:    */     }
/* 169:180 */     else if (localej1 == ej.e)
/* 170:    */     {
/* 171:181 */       localbec2 = paramard.p(paramdt.f());
/* 172:182 */       localatr = localbec2.c();
/* 173:183 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 174:    */       {
/* 175:184 */         localej2 = (ej)localbec2.b(a);
/* 176:185 */         if ((localej2 == ej.c) && (!a(paramard, paramdt.c(), localbec1))) {
/* 177:186 */           return i != 0 ? 2 : 1;
/* 178:    */         }
/* 179:187 */         if ((localej2 == ej.d) && (!a(paramard, paramdt.d(), localbec1))) {
/* 180:188 */           return i != 0 ? 1 : 2;
/* 181:    */         }
/* 182:    */       }
/* 183:    */     }
/* 184:191 */     else if (localej1 == ej.d)
/* 185:    */     {
/* 186:192 */       localbec2 = paramard.p(paramdt.c());
/* 187:193 */       localatr = localbec2.c();
/* 188:194 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 189:    */       {
/* 190:195 */         localej2 = (ej)localbec2.b(a);
/* 191:196 */         if ((localej2 == ej.e) && (!a(paramard, paramdt.e(), localbec1))) {
/* 192:197 */           return i != 0 ? 2 : 1;
/* 193:    */         }
/* 194:198 */         if ((localej2 == ej.f) && (!a(paramard, paramdt.f(), localbec1))) {
/* 195:199 */           return i != 0 ? 1 : 2;
/* 196:    */         }
/* 197:    */       }
/* 198:    */     }
/* 199:202 */     else if (localej1 == ej.c)
/* 200:    */     {
/* 201:203 */       localbec2 = paramard.p(paramdt.d());
/* 202:204 */       localatr = localbec2.c();
/* 203:205 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 204:    */       {
/* 205:206 */         localej2 = (ej)localbec2.b(a);
/* 206:207 */         if ((localej2 == ej.e) && (!a(paramard, paramdt.e(), localbec1))) {
/* 207:208 */           return i != 0 ? 1 : 2;
/* 208:    */         }
/* 209:209 */         if ((localej2 == ej.f) && (!a(paramard, paramdt.f(), localbec1))) {
/* 210:210 */           return i != 0 ? 2 : 1;
/* 211:    */         }
/* 212:    */       }
/* 213:    */     }
/* 214:215 */     return 0;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public boolean h(ard paramard, dt paramdt)
/* 218:    */   {
/* 219:219 */     bec localbec1 = paramard.p(paramdt);
/* 220:220 */     ej localej1 = (ej)localbec1.b(a);
/* 221:221 */     bau localbau = (bau)localbec1.b(b);
/* 222:222 */     int i = localbau == bau.a ? 1 : 0;
/* 223:    */     
/* 224:224 */     float f1 = 0.5F;
/* 225:225 */     float f2 = 1.0F;
/* 226:227 */     if (i != 0)
/* 227:    */     {
/* 228:228 */       f1 = 0.0F;
/* 229:229 */       f2 = 0.5F;
/* 230:    */     }
/* 231:232 */     float f3 = 0.0F;
/* 232:233 */     float f4 = 1.0F;
/* 233:234 */     float f5 = 0.0F;
/* 234:235 */     float f6 = 0.5F;
/* 235:    */     
/* 236:237 */     boolean bool = true;
/* 237:    */     bec localbec2;
/* 238:    */     atr localatr;
/* 239:    */     ej localej2;
/* 240:239 */     if (localej1 == ej.f)
/* 241:    */     {
/* 242:240 */       f3 = 0.5F;
/* 243:241 */       f6 = 1.0F;
/* 244:    */       
/* 245:243 */       localbec2 = paramard.p(paramdt.f());
/* 246:244 */       localatr = localbec2.c();
/* 247:245 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 248:    */       {
/* 249:246 */         localej2 = (ej)localbec2.b(a);
/* 250:247 */         if ((localej2 == ej.c) && (!a(paramard, paramdt.d(), localbec1)))
/* 251:    */         {
/* 252:248 */           f6 = 0.5F;
/* 253:249 */           bool = false;
/* 254:    */         }
/* 255:250 */         else if ((localej2 == ej.d) && (!a(paramard, paramdt.c(), localbec1)))
/* 256:    */         {
/* 257:251 */           f5 = 0.5F;
/* 258:252 */           bool = false;
/* 259:    */         }
/* 260:    */       }
/* 261:    */     }
/* 262:255 */     else if (localej1 == ej.e)
/* 263:    */     {
/* 264:256 */       f4 = 0.5F;
/* 265:257 */       f6 = 1.0F;
/* 266:    */       
/* 267:259 */       localbec2 = paramard.p(paramdt.e());
/* 268:260 */       localatr = localbec2.c();
/* 269:261 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 270:    */       {
/* 271:262 */         localej2 = (ej)localbec2.b(a);
/* 272:263 */         if ((localej2 == ej.c) && (!a(paramard, paramdt.d(), localbec1)))
/* 273:    */         {
/* 274:264 */           f6 = 0.5F;
/* 275:265 */           bool = false;
/* 276:    */         }
/* 277:266 */         else if ((localej2 == ej.d) && (!a(paramard, paramdt.c(), localbec1)))
/* 278:    */         {
/* 279:267 */           f5 = 0.5F;
/* 280:268 */           bool = false;
/* 281:    */         }
/* 282:    */       }
/* 283:    */     }
/* 284:271 */     else if (localej1 == ej.d)
/* 285:    */     {
/* 286:272 */       f5 = 0.5F;
/* 287:273 */       f6 = 1.0F;
/* 288:    */       
/* 289:275 */       localbec2 = paramard.p(paramdt.d());
/* 290:276 */       localatr = localbec2.c();
/* 291:277 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 292:    */       {
/* 293:278 */         localej2 = (ej)localbec2.b(a);
/* 294:279 */         if ((localej2 == ej.e) && (!a(paramard, paramdt.f(), localbec1)))
/* 295:    */         {
/* 296:280 */           f4 = 0.5F;
/* 297:281 */           bool = false;
/* 298:    */         }
/* 299:282 */         else if ((localej2 == ej.f) && (!a(paramard, paramdt.e(), localbec1)))
/* 300:    */         {
/* 301:283 */           f3 = 0.5F;
/* 302:284 */           bool = false;
/* 303:    */         }
/* 304:    */       }
/* 305:    */     }
/* 306:287 */     else if (localej1 == ej.c)
/* 307:    */     {
/* 308:288 */       localbec2 = paramard.p(paramdt.c());
/* 309:289 */       localatr = localbec2.c();
/* 310:290 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 311:    */       {
/* 312:291 */         localej2 = (ej)localbec2.b(a);
/* 313:292 */         if ((localej2 == ej.e) && (!a(paramard, paramdt.f(), localbec1)))
/* 314:    */         {
/* 315:293 */           f4 = 0.5F;
/* 316:294 */           bool = false;
/* 317:    */         }
/* 318:295 */         else if ((localej2 == ej.f) && (!a(paramard, paramdt.e(), localbec1)))
/* 319:    */         {
/* 320:296 */           f3 = 0.5F;
/* 321:297 */           bool = false;
/* 322:    */         }
/* 323:    */       }
/* 324:    */     }
/* 325:302 */     a(f3, f1, f5, f4, f2, f6);
/* 326:303 */     return bool;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public boolean i(ard paramard, dt paramdt)
/* 330:    */   {
/* 331:311 */     bec localbec1 = paramard.p(paramdt);
/* 332:312 */     ej localej1 = (ej)localbec1.b(a);
/* 333:313 */     bau localbau = (bau)localbec1.b(b);
/* 334:314 */     int i = localbau == bau.a ? 1 : 0;
/* 335:    */     
/* 336:316 */     float f1 = 0.5F;
/* 337:317 */     float f2 = 1.0F;
/* 338:319 */     if (i != 0)
/* 339:    */     {
/* 340:320 */       f1 = 0.0F;
/* 341:321 */       f2 = 0.5F;
/* 342:    */     }
/* 343:324 */     float f3 = 0.0F;
/* 344:325 */     float f4 = 0.5F;
/* 345:326 */     float f5 = 0.5F;
/* 346:327 */     float f6 = 1.0F;
/* 347:    */     
/* 348:329 */     boolean bool = false;
/* 349:    */     bec localbec2;
/* 350:    */     atr localatr;
/* 351:    */     ej localej2;
/* 352:331 */     if (localej1 == ej.f)
/* 353:    */     {
/* 354:332 */       localbec2 = paramard.p(paramdt.e());
/* 355:333 */       localatr = localbec2.c();
/* 356:334 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 357:    */       {
/* 358:335 */         localej2 = (ej)localbec2.b(a);
/* 359:336 */         if ((localej2 == ej.c) && (!a(paramard, paramdt.c(), localbec1)))
/* 360:    */         {
/* 361:337 */           f5 = 0.0F;
/* 362:338 */           f6 = 0.5F;
/* 363:339 */           bool = true;
/* 364:    */         }
/* 365:340 */         else if ((localej2 == ej.d) && (!a(paramard, paramdt.d(), localbec1)))
/* 366:    */         {
/* 367:341 */           f5 = 0.5F;
/* 368:342 */           f6 = 1.0F;
/* 369:343 */           bool = true;
/* 370:    */         }
/* 371:    */       }
/* 372:    */     }
/* 373:346 */     else if (localej1 == ej.e)
/* 374:    */     {
/* 375:347 */       localbec2 = paramard.p(paramdt.f());
/* 376:348 */       localatr = localbec2.c();
/* 377:349 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 378:    */       {
/* 379:350 */         f3 = 0.5F;
/* 380:351 */         f4 = 1.0F;
/* 381:352 */         localej2 = (ej)localbec2.b(a);
/* 382:353 */         if ((localej2 == ej.c) && (!a(paramard, paramdt.c(), localbec1)))
/* 383:    */         {
/* 384:354 */           f5 = 0.0F;
/* 385:355 */           f6 = 0.5F;
/* 386:356 */           bool = true;
/* 387:    */         }
/* 388:357 */         else if ((localej2 == ej.d) && (!a(paramard, paramdt.d(), localbec1)))
/* 389:    */         {
/* 390:358 */           f5 = 0.5F;
/* 391:359 */           f6 = 1.0F;
/* 392:360 */           bool = true;
/* 393:    */         }
/* 394:    */       }
/* 395:    */     }
/* 396:363 */     else if (localej1 == ej.d)
/* 397:    */     {
/* 398:364 */       localbec2 = paramard.p(paramdt.c());
/* 399:365 */       localatr = localbec2.c();
/* 400:366 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 401:    */       {
/* 402:367 */         f5 = 0.0F;
/* 403:368 */         f6 = 0.5F;
/* 404:    */         
/* 405:370 */         localej2 = (ej)localbec2.b(a);
/* 406:371 */         if ((localej2 == ej.e) && (!a(paramard, paramdt.e(), localbec1)))
/* 407:    */         {
/* 408:372 */           bool = true;
/* 409:    */         }
/* 410:373 */         else if ((localej2 == ej.f) && (!a(paramard, paramdt.f(), localbec1)))
/* 411:    */         {
/* 412:374 */           f3 = 0.5F;
/* 413:375 */           f4 = 1.0F;
/* 414:376 */           bool = true;
/* 415:    */         }
/* 416:    */       }
/* 417:    */     }
/* 418:379 */     else if (localej1 == ej.c)
/* 419:    */     {
/* 420:380 */       localbec2 = paramard.p(paramdt.d());
/* 421:381 */       localatr = localbec2.c();
/* 422:382 */       if ((c(localatr)) && (localbau == localbec2.b(b)))
/* 423:    */       {
/* 424:383 */         localej2 = (ej)localbec2.b(a);
/* 425:384 */         if ((localej2 == ej.e) && (!a(paramard, paramdt.e(), localbec1)))
/* 426:    */         {
/* 427:385 */           bool = true;
/* 428:    */         }
/* 429:386 */         else if ((localej2 == ej.f) && (!a(paramard, paramdt.f(), localbec1)))
/* 430:    */         {
/* 431:387 */           f3 = 0.5F;
/* 432:388 */           f4 = 1.0F;
/* 433:389 */           bool = true;
/* 434:    */         }
/* 435:    */       }
/* 436:    */     }
/* 437:394 */     if (bool) {
/* 438:395 */       a(f3, f1, f5, f4, f2, f6);
/* 439:    */     }
/* 440:397 */     return bool;
/* 441:    */   }
/* 442:    */   
/* 443:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/* 444:    */   {
/* 445:402 */     e(paramaqu, paramdt);
/* 446:403 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 447:    */     
/* 448:405 */     boolean bool = h(paramaqu, paramdt);
/* 449:406 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 450:408 */     if ((bool) && 
/* 451:409 */       (i(paramaqu, paramdt))) {
/* 452:410 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 453:    */     }
/* 454:414 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 455:    */   }
/* 456:    */   
/* 457:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 458:    */   {
/* 459:427 */     this.O.c(paramaqu, paramdt, parambec, paramRandom);
/* 460:    */   }
/* 461:    */   
/* 462:    */   public void a(aqu paramaqu, dt paramdt, ahd paramahd)
/* 463:    */   {
/* 464:432 */     this.O.a(paramaqu, paramdt, paramahd);
/* 465:    */   }
/* 466:    */   
/* 467:    */   public void d(aqu paramaqu, dt paramdt, bec parambec)
/* 468:    */   {
/* 469:437 */     this.O.d(paramaqu, paramdt, parambec);
/* 470:    */   }
/* 471:    */   
/* 472:    */   public int c(ard paramard, dt paramdt)
/* 473:    */   {
/* 474:442 */     return this.O.c(paramard, paramdt);
/* 475:    */   }
/* 476:    */   
/* 477:    */   public float a(wv paramwv)
/* 478:    */   {
/* 479:447 */     return this.O.a(paramwv);
/* 480:    */   }
/* 481:    */   
/* 482:    */   public aql k()
/* 483:    */   {
/* 484:452 */     return this.O.k();
/* 485:    */   }
/* 486:    */   
/* 487:    */   public int a(aqu paramaqu)
/* 488:    */   {
/* 489:457 */     return this.O.a(paramaqu);
/* 490:    */   }
/* 491:    */   
/* 492:    */   public brt a(aqu paramaqu, dt paramdt)
/* 493:    */   {
/* 494:462 */     return this.O.a(paramaqu, paramdt);
/* 495:    */   }
/* 496:    */   
/* 497:    */   public brw a(aqu paramaqu, dt paramdt, wv paramwv, brw parambrw)
/* 498:    */   {
/* 499:467 */     return this.O.a(paramaqu, paramdt, paramwv, parambrw);
/* 500:    */   }
/* 501:    */   
/* 502:    */   public boolean y()
/* 503:    */   {
/* 504:472 */     return this.O.y();
/* 505:    */   }
/* 506:    */   
/* 507:    */   public boolean a(bec parambec, boolean paramBoolean)
/* 508:    */   {
/* 509:477 */     return this.O.a(parambec, paramBoolean);
/* 510:    */   }
/* 511:    */   
/* 512:    */   public boolean c(aqu paramaqu, dt paramdt)
/* 513:    */   {
/* 514:482 */     return this.O.c(paramaqu, paramdt);
/* 515:    */   }
/* 516:    */   
/* 517:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 518:    */   {
/* 519:487 */     a(paramaqu, paramdt, this.P, aty.a);
/* 520:488 */     this.O.c(paramaqu, paramdt, this.P);
/* 521:    */   }
/* 522:    */   
/* 523:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 524:    */   {
/* 525:493 */     this.O.b(paramaqu, paramdt, this.P);
/* 526:    */   }
/* 527:    */   
/* 528:    */   public void a(aqu paramaqu, dt paramdt, wv paramwv)
/* 529:    */   {
/* 530:503 */     this.O.a(paramaqu, paramdt, paramwv);
/* 531:    */   }
/* 532:    */   
/* 533:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 534:    */   {
/* 535:508 */     this.O.b(paramaqu, paramdt, parambec, paramRandom);
/* 536:    */   }
/* 537:    */   
/* 538:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 539:    */   {
/* 540:513 */     return this.O.a(paramaqu, paramdt, this.P, paramahd, ej.a, 0.0F, 0.0F, 0.0F);
/* 541:    */   }
/* 542:    */   
/* 543:    */   public void a(aqu paramaqu, dt paramdt, aqo paramaqo)
/* 544:    */   {
/* 545:518 */     this.O.a(paramaqu, paramdt, paramaqo);
/* 546:    */   }
/* 547:    */   
/* 548:    */   public boh g(bec parambec)
/* 549:    */   {
/* 550:523 */     return this.O.g(this.P);
/* 551:    */   }
/* 552:    */   
/* 553:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 554:    */   {
/* 555:528 */     bec localbec = super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm);
/* 556:    */     
/* 557:530 */     localbec = localbec.a(a, paramxm.aO()).a(M, bav.a);
/* 558:532 */     if ((paramej == ej.a) || ((paramej != ej.b) && (paramFloat2 > 0.5D))) {
/* 559:533 */       return localbec.a(b, bau.a);
/* 560:    */     }
/* 561:536 */     return localbec.a(b, bau.b);
/* 562:    */   }
/* 563:    */   
/* 564:    */   public bru a(aqu paramaqu, dt paramdt, brw parambrw1, brw parambrw2)
/* 565:    */   {
/* 566:542 */     bru[] arrayOfbru1 = new bru[8];
/* 567:543 */     bec localbec = paramaqu.p(paramdt);
/* 568:544 */     int i = ((ej)localbec.b(a)).b();
/* 569:545 */     int j = localbec.b(b) == bau.a ? 1 : 0;
/* 570:546 */     int[] arrayOfInt = N[(i + 0)];
/* 571:    */     
/* 572:548 */     this.Q = true;
/* 573:549 */     for (int k = 0; k < 8; k++)
/* 574:    */     {
/* 575:550 */       this.R = k;
/* 576:552 */       if (Arrays.binarySearch(arrayOfInt, k) < 0) {
/* 577:556 */         arrayOfbru1[k] = super.a(paramaqu, paramdt, parambrw1, parambrw2);
/* 578:    */       }
/* 579:    */     }
/* 580:559 */     for (int i1 : arrayOfInt) {
/* 581:560 */       arrayOfbru1[i1] = null;
/* 582:    */     }
/* 583:564 */     ??? = null;
/* 584:565 */     double d1 = 0.0D;
/* 585:567 */     for (bru localbru : arrayOfbru1) {
/* 586:568 */       if (localbru != null)
/* 587:    */       {
/* 588:571 */         double d2 = localbru.c.g(parambrw2);
/* 589:573 */         if (d2 > d1)
/* 590:    */         {
/* 591:574 */           ??? = localbru;
/* 592:575 */           d1 = d2;
/* 593:    */         }
/* 594:    */       }
/* 595:    */     }
/* 596:579 */     return ???;
/* 597:    */   }
/* 598:    */   
/* 599:    */   public bec a(int paramInt)
/* 600:    */   {
/* 601:584 */     bec localbec = P().a(b, (paramInt & 0x4) > 0 ? bau.a : bau.b);
/* 602:    */     
/* 603:    */ 
/* 604:587 */     localbec = localbec.a(a, ej.a(5 - (paramInt & 0x3)));
/* 605:    */     
/* 606:589 */     return localbec;
/* 607:    */   }
/* 608:    */   
/* 609:    */   public int c(bec parambec)
/* 610:    */   {
/* 611:594 */     int i = 0;
/* 612:596 */     if (parambec.b(b) == bau.a) {
/* 613:597 */       i |= 0x4;
/* 614:    */     }
/* 615:600 */     i |= 5 - ((ej)parambec.b(a)).a();
/* 616:    */     
/* 617:602 */     return i;
/* 618:    */   }
/* 619:    */   
/* 620:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/* 621:    */   {
/* 622:607 */     if (h(paramard, paramdt)) {
/* 623:608 */       switch (g(paramard, paramdt))
/* 624:    */       {
/* 625:    */       case 0: 
/* 626:610 */         parambec = parambec.a(M, bav.a);
/* 627:611 */         break;
/* 628:    */       case 1: 
/* 629:613 */         parambec = parambec.a(M, bav.c);
/* 630:614 */         break;
/* 631:    */       case 2: 
/* 632:616 */         parambec = parambec.a(M, bav.b);
/* 633:    */       }
/* 634:    */     } else {
/* 635:620 */       switch (f(paramard, paramdt))
/* 636:    */       {
/* 637:    */       case 0: 
/* 638:622 */         parambec = parambec.a(M, bav.a);
/* 639:623 */         break;
/* 640:    */       case 1: 
/* 641:625 */         parambec = parambec.a(M, bav.e);
/* 642:626 */         break;
/* 643:    */       case 2: 
/* 644:628 */         parambec = parambec.a(M, bav.d);
/* 645:    */       }
/* 646:    */     }
/* 647:633 */     return parambec;
/* 648:    */   }
/* 649:    */   
/* 650:    */   protected bed e()
/* 651:    */   {
/* 652:638 */     return new bed(this, new bex[] { a, b, M });
/* 653:    */   }
/* 654:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bat
 * JD-Core Version:    0.7.0.1
 */