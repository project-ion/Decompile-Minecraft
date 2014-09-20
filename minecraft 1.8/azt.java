/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.EnumSet;
/*   5:    */ import java.util.Iterator;
/*   6:    */ import java.util.Random;
/*   7:    */ import java.util.Set;
/*   8:    */ 
/*   9:    */ public class azt
/*  10:    */   extends atr
/*  11:    */ {
/*  12: 30 */   public static final bev a = bev.a("north", azu.class);
/*  13: 31 */   public static final bev b = bev.a("east", azu.class);
/*  14: 32 */   public static final bev M = bev.a("south", azu.class);
/*  15: 33 */   public static final bev N = bev.a("west", azu.class);
/*  16: 34 */   public static final bew O = bew.a("power", 0, 15);
/*  17: 36 */   private boolean P = true;
/*  18: 37 */   private final Set Q = Sets.newHashSet();
/*  19:    */   
/*  20:    */   public azt()
/*  21:    */   {
/*  22: 40 */     super(bof.q);
/*  23: 41 */     j(this.L.b().a(a, azu.c).a(b, azu.c).a(M, azu.c).a(N, azu.c).a(O, Integer.valueOf(0)));
/*  24: 42 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*  25:    */   }
/*  26:    */   
/*  27:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  28:    */   {
/*  29: 47 */     parambec = parambec.a(N, c(paramard, paramdt, ej.e));
/*  30: 48 */     parambec = parambec.a(b, c(paramard, paramdt, ej.f));
/*  31: 49 */     parambec = parambec.a(a, c(paramard, paramdt, ej.c));
/*  32: 50 */     parambec = parambec.a(M, c(paramard, paramdt, ej.d));
/*  33:    */     
/*  34: 52 */     return parambec;
/*  35:    */   }
/*  36:    */   
/*  37:    */   private azu c(ard paramard, dt paramdt, ej paramej)
/*  38:    */   {
/*  39: 56 */     dt localdt = paramdt.a(paramej);
/*  40: 57 */     atr localatr1 = paramard.p(paramdt.a(paramej)).c();
/*  41: 59 */     if ((a(paramard.p(localdt), paramej)) || ((!localatr1.s()) && (d(paramard.p(localdt.b()))))) {
/*  42: 60 */       return azu.b;
/*  43:    */     }
/*  44: 63 */     atr localatr2 = paramard.p(paramdt.a()).c();
/*  45: 64 */     if ((!localatr2.s()) && (localatr1.s()) && (d(paramard.p(localdt.a())))) {
/*  46: 65 */       return azu.a;
/*  47:    */     }
/*  48: 68 */     return azu.c;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  52:    */   {
/*  53: 74 */     return null;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean c()
/*  57:    */   {
/*  58: 79 */     return false;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public boolean d()
/*  62:    */   {
/*  63: 84 */     return false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public int a(ard paramard, dt paramdt, int paramInt)
/*  67:    */   {
/*  68: 89 */     bec localbec = paramard.p(paramdt);
/*  69: 91 */     if (localbec.c() != this) {
/*  70: 92 */       return super.a(paramard, paramdt, paramInt);
/*  71:    */     }
/*  72: 95 */     return b(((Integer)localbec.b(O)).intValue());
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  76:    */   {
/*  77:100 */     return (aqu.a(paramaqu, paramdt.b())) || (paramaqu.p(paramdt.b()).c() == aty.aX);
/*  78:    */   }
/*  79:    */   
/*  80:    */   private bec e(aqu paramaqu, dt paramdt, bec parambec)
/*  81:    */   {
/*  82:104 */     parambec = a(paramaqu, paramdt, paramdt, parambec);
/*  83:    */     
/*  84:106 */     ArrayList localArrayList = Lists.newArrayList(this.Q);
/*  85:107 */     this.Q.clear();
/*  86:108 */     for (dt localdt : localArrayList) {
/*  87:109 */       paramaqu.c(localdt, this);
/*  88:    */     }
/*  89:112 */     return parambec;
/*  90:    */   }
/*  91:    */   
/*  92:    */   private bec a(aqu paramaqu, dt paramdt1, dt paramdt2, bec parambec)
/*  93:    */   {
/*  94:116 */     bec localbec = parambec;
/*  95:117 */     int i = ((Integer)localbec.b(O)).intValue();
/*  96:118 */     int j = 0;
/*  97:    */     
/*  98:120 */     j = a(paramaqu, paramdt2, j);
/*  99:    */     
/* 100:122 */     this.P = false;
/* 101:123 */     int k = paramaqu.A(paramdt1);
/* 102:124 */     this.P = true;
/* 103:126 */     if ((k > 0) && (k > j - 1)) {
/* 104:127 */       j = k;
/* 105:    */     }
/* 106:130 */     int m = 0;
/* 107:131 */     for (Object localObject = en.a.iterator(); ((Iterator)localObject).hasNext();)
/* 108:    */     {
/* 109:131 */       ej localej1 = (ej)((Iterator)localObject).next();
/* 110:132 */       dt localdt = paramdt1.a(localej1);
/* 111:133 */       int i2 = (localdt.n() != paramdt2.n()) || (localdt.p() != paramdt2.p()) ? 1 : 0;
/* 112:135 */       if (i2 != 0) {
/* 113:136 */         m = a(paramaqu, localdt, m);
/* 114:    */       }
/* 115:138 */       if ((paramaqu.p(localdt).c().t()) && (!paramaqu.p(paramdt1.a()).c().t()))
/* 116:    */       {
/* 117:139 */         if ((i2 != 0) && (paramdt1.o() >= paramdt2.o())) {
/* 118:140 */           m = a(paramaqu, localdt.a(), m);
/* 119:    */         }
/* 120:    */       }
/* 121:142 */       else if ((!paramaqu.p(localdt).c().t()) && 
/* 122:143 */         (i2 != 0) && (paramdt1.o() <= paramdt2.o())) {
/* 123:144 */         m = a(paramaqu, localdt.b(), m);
/* 124:    */       }
/* 125:    */     }
/* 126:148 */     if (m > j) {
/* 127:149 */       j = m - 1;
/* 128:150 */     } else if (j > 0) {
/* 129:151 */       j--;
/* 130:    */     } else {
/* 131:153 */       j = 0;
/* 132:    */     }
/* 133:156 */     if (k > j - 1) {
/* 134:157 */       j = k;
/* 135:    */     }
/* 136:160 */     if (i != j)
/* 137:    */     {
/* 138:161 */       parambec = parambec.a(O, Integer.valueOf(j));
/* 139:163 */       if (paramaqu.p(paramdt1) == localbec) {
/* 140:164 */         paramaqu.a(paramdt1, parambec, 2);
/* 141:    */       }
/* 142:167 */       this.Q.add(paramdt1);
/* 143:168 */       for (ej localej2 : ej.values()) {
/* 144:169 */         this.Q.add(paramdt1.a(localej2));
/* 145:    */       }
/* 146:    */     }
/* 147:173 */     return parambec;
/* 148:    */   }
/* 149:    */   
/* 150:    */   private void d(aqu paramaqu, dt paramdt)
/* 151:    */   {
/* 152:177 */     if (paramaqu.p(paramdt).c() != this) {
/* 153:178 */       return;
/* 154:    */     }
/* 155:181 */     paramaqu.c(paramdt, this);
/* 156:182 */     for (ej localej : ej.values()) {
/* 157:183 */       paramaqu.c(paramdt.a(localej), this);
/* 158:    */     }
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 162:    */   {
/* 163:189 */     if (paramaqu.D) {
/* 164:190 */       return;
/* 165:    */     }
/* 166:193 */     e(paramaqu, paramdt, parambec);
/* 167:195 */     for (Iterator localIterator = en.b.iterator(); localIterator.hasNext();)
/* 168:    */     {
/* 169:195 */       localej = (ej)localIterator.next();
/* 170:196 */       paramaqu.c(paramdt.a(localej), this);
/* 171:    */     }
/* 172:    */     ej localej;
/* 173:199 */     for (localIterator = en.a.iterator(); localIterator.hasNext();)
/* 174:    */     {
/* 175:199 */       localej = (ej)localIterator.next();
/* 176:200 */       d(paramaqu, paramdt.a(localej));
/* 177:    */     }
/* 178:203 */     for (localIterator = en.a.iterator(); localIterator.hasNext();)
/* 179:    */     {
/* 180:203 */       localej = (ej)localIterator.next();
/* 181:204 */       dt localdt = paramdt.a(localej);
/* 182:206 */       if (paramaqu.p(localdt).c().t()) {
/* 183:207 */         d(paramaqu, localdt.a());
/* 184:    */       } else {
/* 185:209 */         d(paramaqu, localdt.b());
/* 186:    */       }
/* 187:    */     }
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 191:    */   {
/* 192:216 */     super.b(paramaqu, paramdt, parambec);
/* 193:217 */     if (paramaqu.D) {
/* 194:218 */       return;
/* 195:    */     }
/* 196:221 */     for (ej localej2 : ej.values()) {
/* 197:222 */       paramaqu.c(paramdt.a(localej2), this);
/* 198:    */     }
/* 199:224 */     e(paramaqu, paramdt, parambec);
/* 200:226 */     for (??? = en.a.iterator(); ((Iterator)???).hasNext();)
/* 201:    */     {
/* 202:226 */       localej1 = (ej)((Iterator)???).next();
/* 203:227 */       d(paramaqu, paramdt.a(localej1));
/* 204:    */     }
/* 205:    */     ej localej1;
/* 206:230 */     for (??? = en.a.iterator(); ((Iterator)???).hasNext();)
/* 207:    */     {
/* 208:230 */       localej1 = (ej)((Iterator)???).next();
/* 209:231 */       dt localdt = paramdt.a(localej1);
/* 210:233 */       if (paramaqu.p(localdt).c().t()) {
/* 211:234 */         d(paramaqu, localdt.a());
/* 212:    */       } else {
/* 213:236 */         d(paramaqu, localdt.b());
/* 214:    */       }
/* 215:    */     }
/* 216:    */   }
/* 217:    */   
/* 218:    */   private int a(aqu paramaqu, dt paramdt, int paramInt)
/* 219:    */   {
/* 220:242 */     if (paramaqu.p(paramdt).c() != this) {
/* 221:243 */       return paramInt;
/* 222:    */     }
/* 223:245 */     int i = ((Integer)paramaqu.p(paramdt).b(O)).intValue();
/* 224:246 */     if (i > paramInt) {
/* 225:247 */       return i;
/* 226:    */     }
/* 227:249 */     return paramInt;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 231:    */   {
/* 232:254 */     if (paramaqu.D) {
/* 233:255 */       return;
/* 234:    */     }
/* 235:258 */     if (c(paramaqu, paramdt))
/* 236:    */     {
/* 237:259 */       e(paramaqu, paramdt, parambec);
/* 238:    */     }
/* 239:    */     else
/* 240:    */     {
/* 241:261 */       b(paramaqu, paramdt, parambec, 0);
/* 242:262 */       paramaqu.g(paramdt);
/* 243:    */     }
/* 244:    */   }
/* 245:    */   
/* 246:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 247:    */   {
/* 248:269 */     return amk.aC;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public int b(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 252:    */   {
/* 253:274 */     if (!this.P) {
/* 254:275 */       return 0;
/* 255:    */     }
/* 256:277 */     return a(paramard, paramdt, parambec, paramej);
/* 257:    */   }
/* 258:    */   
/* 259:    */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 260:    */   {
/* 261:282 */     if (!this.P) {
/* 262:283 */       return 0;
/* 263:    */     }
/* 264:286 */     int i = ((Integer)parambec.b(O)).intValue();
/* 265:287 */     if (i == 0) {
/* 266:288 */       return 0;
/* 267:    */     }
/* 268:291 */     if (paramej == ej.b) {
/* 269:292 */       return i;
/* 270:    */     }
/* 271:295 */     EnumSet localEnumSet = EnumSet.noneOf(ej.class);
/* 272:296 */     for (ej localej : en.a) {
/* 273:297 */       if (d(paramard, paramdt, localej)) {
/* 274:298 */         localEnumSet.add(localej);
/* 275:    */       }
/* 276:    */     }
/* 277:302 */     if ((paramej.k().c()) && (localEnumSet.isEmpty())) {
/* 278:303 */       return i;
/* 279:    */     }
/* 280:306 */     if ((localEnumSet.contains(paramej)) && (!localEnumSet.contains(paramej.f())) && (!localEnumSet.contains(paramej.e()))) {
/* 281:307 */       return i;
/* 282:    */     }
/* 283:310 */     return 0;
/* 284:    */   }
/* 285:    */   
/* 286:    */   private boolean d(ard paramard, dt paramdt, ej paramej)
/* 287:    */   {
/* 288:314 */     dt localdt = paramdt.a(paramej);
/* 289:315 */     bec localbec = paramard.p(localdt);
/* 290:316 */     atr localatr = localbec.c();
/* 291:317 */     boolean bool1 = localatr.t();
/* 292:    */     
/* 293:319 */     boolean bool2 = paramard.p(paramdt.a()).c().t();
/* 294:320 */     if ((!bool2) && (bool1) && (e(paramard, localdt.a()))) {
/* 295:321 */       return true;
/* 296:    */     }
/* 297:323 */     if (a(localbec, paramej)) {
/* 298:324 */       return true;
/* 299:    */     }
/* 300:326 */     if ((localatr == aty.bc) && (localbec.b(ava.N) == paramej)) {
/* 301:327 */       return true;
/* 302:    */     }
/* 303:329 */     if ((!bool1) && (e(paramard, localdt.b()))) {
/* 304:330 */       return true;
/* 305:    */     }
/* 306:333 */     return false;
/* 307:    */   }
/* 308:    */   
/* 309:    */   protected static boolean e(ard paramard, dt paramdt)
/* 310:    */   {
/* 311:337 */     return d(paramard.p(paramdt));
/* 312:    */   }
/* 313:    */   
/* 314:    */   protected static boolean d(bec parambec)
/* 315:    */   {
/* 316:341 */     return a(parambec, null);
/* 317:    */   }
/* 318:    */   
/* 319:    */   protected static boolean a(bec parambec, ej paramej)
/* 320:    */   {
/* 321:345 */     atr localatr = parambec.c();
/* 322:346 */     if (localatr == aty.af) {
/* 323:347 */       return true;
/* 324:    */     }
/* 325:350 */     if (aty.bb.e(localatr))
/* 326:    */     {
/* 327:351 */       ej localej = (ej)parambec.b(azz.N);
/* 328:352 */       return (localej == paramej) || (localej.d() == paramej);
/* 329:    */     }
/* 330:355 */     return (localatr.g()) && (paramej != null);
/* 331:    */   }
/* 332:    */   
/* 333:    */   public boolean g()
/* 334:    */   {
/* 335:360 */     return this.P;
/* 336:    */   }
/* 337:    */   
/* 338:    */   private int b(int paramInt)
/* 339:    */   {
/* 340:364 */     float f1 = paramInt / 15.0F;
/* 341:365 */     float f2 = f1 * 0.6F + 0.4F;
/* 342:366 */     if (paramInt == 0) {
/* 343:367 */       f2 = 0.3F;
/* 344:    */     }
/* 345:370 */     float f3 = f1 * f1 * 0.7F - 0.5F;
/* 346:371 */     float f4 = f1 * f1 * 0.6F - 0.7F;
/* 347:372 */     if (f3 < 0.0F) {
/* 348:373 */       f3 = 0.0F;
/* 349:    */     }
/* 350:375 */     if (f4 < 0.0F) {
/* 351:376 */       f4 = 0.0F;
/* 352:    */     }
/* 353:379 */     int i = uv.a((int)(f2 * 255.0F), 0, 255);
/* 354:380 */     int j = uv.a((int)(f3 * 255.0F), 0, 255);
/* 355:381 */     int k = uv.a((int)(f4 * 255.0F), 0, 255);
/* 356:382 */     return 0xFF000000 | i << 16 | j << 8 | k;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 360:    */   {
/* 361:387 */     int i = ((Integer)parambec.b(O)).intValue();
/* 362:388 */     if (i == 0) {
/* 363:389 */       return;
/* 364:    */     }
/* 365:392 */     double d1 = paramdt.n() + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
/* 366:393 */     double d2 = paramdt.o() + 0.0625F;
/* 367:394 */     double d3 = paramdt.p() + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
/* 368:    */     
/* 369:    */ 
/* 370:397 */     float f1 = i / 15.0F;
/* 371:398 */     float f2 = f1 * 0.6F + 0.4F;
/* 372:399 */     float f3 = Math.max(0.0F, f1 * f1 * 0.7F - 0.5F);
/* 373:400 */     float f4 = Math.max(0.0F, f1 * f1 * 0.6F - 0.7F);
/* 374:    */     
/* 375:402 */     paramaqu.a(ew.E, d1, d2, d3, f2, f3, f4, new int[0]);
/* 376:    */   }
/* 377:    */   
/* 378:    */   public alq b(aqu paramaqu, dt paramdt)
/* 379:    */   {
/* 380:407 */     return amk.aC;
/* 381:    */   }
/* 382:    */   
/* 383:    */   public aql k()
/* 384:    */   {
/* 385:412 */     return aql.c;
/* 386:    */   }
/* 387:    */   
/* 388:    */   public bec a(int paramInt)
/* 389:    */   {
/* 390:417 */     return P().a(O, Integer.valueOf(paramInt));
/* 391:    */   }
/* 392:    */   
/* 393:    */   public int c(bec parambec)
/* 394:    */   {
/* 395:423 */     return ((Integer)parambec.b(O)).intValue();
/* 396:    */   }
/* 397:    */   
/* 398:    */   protected bed e()
/* 399:    */   {
/* 400:428 */     return new bed(this, new bex[] { a, b, M, N, O });
/* 401:    */   }
/* 402:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     azt
 * JD-Core Version:    0.7.0.1
 */