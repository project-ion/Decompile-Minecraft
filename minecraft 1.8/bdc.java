/*   1:    */ public class bdc
/*   2:    */   extends bdf
/*   3:    */   implements pm, we
/*   4:    */ {
/*   5: 32 */   private static final int[] a = { 0 };
/*   6: 35 */   private static final int[] f = { 2, 1 };
/*   7: 38 */   private static final int[] g = { 1 };
/*   8: 51 */   private amj[] h = new amj[3];
/*   9:    */   private int i;
/*  10:    */   private int j;
/*  11:    */   private int k;
/*  12:    */   private int l;
/*  13:    */   private String m;
/*  14:    */   
/*  15:    */   public int n_()
/*  16:    */   {
/*  17: 60 */     return this.h.length;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public amj a(int paramInt)
/*  21:    */   {
/*  22: 66 */     return this.h[paramInt];
/*  23:    */   }
/*  24:    */   
/*  25:    */   public amj a(int paramInt1, int paramInt2)
/*  26:    */   {
/*  27: 72 */     if (this.h[paramInt1] != null)
/*  28:    */     {
/*  29: 73 */       if (this.h[paramInt1].b <= paramInt2)
/*  30:    */       {
/*  31: 74 */         localamj = this.h[paramInt1];
/*  32: 75 */         this.h[paramInt1] = null;
/*  33: 76 */         return localamj;
/*  34:    */       }
/*  35: 78 */       amj localamj = this.h[paramInt1].a(paramInt2);
/*  36: 79 */       if (this.h[paramInt1].b == 0) {
/*  37: 80 */         this.h[paramInt1] = null;
/*  38:    */       }
/*  39: 82 */       return localamj;
/*  40:    */     }
/*  41: 85 */     return null;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public amj b(int paramInt)
/*  45:    */   {
/*  46: 91 */     if (this.h[paramInt] != null)
/*  47:    */     {
/*  48: 92 */       amj localamj = this.h[paramInt];
/*  49: 93 */       this.h[paramInt] = null;
/*  50: 94 */       return localamj;
/*  51:    */     }
/*  52: 96 */     return null;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a(int paramInt, amj paramamj)
/*  56:    */   {
/*  57:101 */     int n = (paramamj != null) && (paramamj.a(this.h[paramInt])) && (amj.a(paramamj, this.h[paramInt])) ? 1 : 0;
/*  58:102 */     this.h[paramInt] = paramamj;
/*  59:103 */     if ((paramamj != null) && (paramamj.b > p_())) {
/*  60:104 */       paramamj.b = p_();
/*  61:    */     }
/*  62:107 */     if ((paramInt == 0) && (n == 0))
/*  63:    */     {
/*  64:108 */       this.l = a(paramamj);
/*  65:109 */       this.k = 0;
/*  66:110 */       o_();
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String d_()
/*  71:    */   {
/*  72:116 */     return k_() ? this.m : "container.furnace";
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean k_()
/*  76:    */   {
/*  77:121 */     return (this.m != null) && (this.m.length() > 0);
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void a(String paramString)
/*  81:    */   {
/*  82:125 */     this.m = paramString;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void a(fn paramfn)
/*  86:    */   {
/*  87:131 */     super.a(paramfn);
/*  88:132 */     fv localfv = paramfn.c("Items", 10);
/*  89:133 */     this.h = new amj[n_()];
/*  90:134 */     for (int n = 0; n < localfv.c(); n++)
/*  91:    */     {
/*  92:135 */       fn localfn = localfv.b(n);
/*  93:136 */       int i1 = localfn.d("Slot");
/*  94:137 */       if ((i1 >= 0) && (i1 < this.h.length)) {
/*  95:138 */         this.h[i1] = amj.a(localfn);
/*  96:    */       }
/*  97:    */     }
/*  98:142 */     this.i = paramfn.e("BurnTime");
/*  99:143 */     this.k = paramfn.e("CookTime");
/* 100:144 */     this.l = paramfn.e("CookTimeTotal");
/* 101:145 */     this.j = b(this.h[1]);
/* 102:146 */     if (paramfn.b("CustomName", 8)) {
/* 103:147 */       this.m = paramfn.j("CustomName");
/* 104:    */     }
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void b(fn paramfn)
/* 108:    */   {
/* 109:153 */     super.b(paramfn);
/* 110:154 */     paramfn.a("BurnTime", (short)this.i);
/* 111:155 */     paramfn.a("CookTime", (short)this.k);
/* 112:156 */     paramfn.a("CookTimeTotal", (short)this.l);
/* 113:157 */     fv localfv = new fv();
/* 114:159 */     for (int n = 0; n < this.h.length; n++) {
/* 115:160 */       if (this.h[n] != null)
/* 116:    */       {
/* 117:161 */         fn localfn = new fn();
/* 118:162 */         localfn.a("Slot", (byte)n);
/* 119:163 */         this.h[n].b(localfn);
/* 120:164 */         localfv.a(localfn);
/* 121:    */       }
/* 122:    */     }
/* 123:167 */     paramfn.a("Items", localfv);
/* 124:168 */     if (k_()) {
/* 125:169 */       paramfn.a("CustomName", this.m);
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public int p_()
/* 130:    */   {
/* 131:175 */     return 64;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public boolean m()
/* 135:    */   {
/* 136:179 */     return this.i > 0;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public static boolean a(vq paramvq)
/* 140:    */   {
/* 141:183 */     return paramvq.a_(0) > 0;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void c()
/* 145:    */   {
/* 146:188 */     boolean bool = m();
/* 147:189 */     int n = 0;
/* 148:191 */     if (m()) {
/* 149:193 */       this.i -= 1;
/* 150:    */     }
/* 151:196 */     if (!this.b.D)
/* 152:    */     {
/* 153:197 */       if ((m()) || ((this.h[1] != null) && (this.h[0] != null)))
/* 154:    */       {
/* 155:200 */         if ((!m()) && (o()))
/* 156:    */         {
/* 157:202 */           this.j = (this.i = b(this.h[1]));
/* 158:204 */           if (m())
/* 159:    */           {
/* 160:205 */             n = 1;
/* 161:207 */             if (this.h[1] != null)
/* 162:    */             {
/* 163:208 */               this.h[1].b -= 1;
/* 164:209 */               if (this.h[1].b == 0)
/* 165:    */               {
/* 166:210 */                 alq localalq = this.h[1].b().q();
/* 167:211 */                 this.h[1] = (localalq != null ? new amj(localalq) : null);
/* 168:    */               }
/* 169:    */             }
/* 170:    */           }
/* 171:    */         }
/* 172:217 */         if ((m()) && (o()))
/* 173:    */         {
/* 174:218 */           this.k += 1;
/* 175:220 */           if (this.k == this.l)
/* 176:    */           {
/* 177:221 */             this.k = 0;
/* 178:222 */             this.l = a(this.h[0]);
/* 179:223 */             n();
/* 180:224 */             n = 1;
/* 181:    */           }
/* 182:    */         }
/* 183:    */         else
/* 184:    */         {
/* 185:227 */           this.k = 0;
/* 186:    */         }
/* 187:    */       }
/* 188:229 */       else if ((!m()) && 
/* 189:230 */         (this.k > 0))
/* 190:    */       {
/* 191:231 */         this.k = uv.a(this.k - 2, 0, this.l);
/* 192:    */       }
/* 193:235 */       if (bool != m())
/* 194:    */       {
/* 195:236 */         n = 1;
/* 196:237 */         awj.a(m(), this.b, this.c);
/* 197:    */       }
/* 198:    */     }
/* 199:241 */     if (n != 0) {
/* 200:242 */       o_();
/* 201:    */     }
/* 202:    */   }
/* 203:    */   
/* 204:    */   public int a(amj paramamj)
/* 205:    */   {
/* 206:247 */     return 200;
/* 207:    */   }
/* 208:    */   
/* 209:    */   private boolean o()
/* 210:    */   {
/* 211:251 */     if (this.h[0] == null) {
/* 212:252 */       return false;
/* 213:    */     }
/* 214:254 */     amj localamj = aok.a().a(this.h[0]);
/* 215:255 */     if (localamj == null) {
/* 216:256 */       return false;
/* 217:    */     }
/* 218:258 */     if (this.h[2] == null) {
/* 219:259 */       return true;
/* 220:    */     }
/* 221:261 */     if (!this.h[2].a(localamj)) {
/* 222:262 */       return false;
/* 223:    */     }
/* 224:264 */     if ((this.h[2].b < p_()) && (this.h[2].b < this.h[2].c())) {
/* 225:265 */       return true;
/* 226:    */     }
/* 227:267 */     if (this.h[2].b < localamj.c()) {
/* 228:268 */       return true;
/* 229:    */     }
/* 230:270 */     return false;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public void n()
/* 234:    */   {
/* 235:274 */     if (!o()) {
/* 236:275 */       return;
/* 237:    */     }
/* 238:278 */     amj localamj = aok.a().a(this.h[0]);
/* 239:279 */     if (this.h[2] == null) {
/* 240:280 */       this.h[2] = localamj.k();
/* 241:281 */     } else if (this.h[2].b() == localamj.b()) {
/* 242:282 */       this.h[2].b += 1;
/* 243:    */     }
/* 244:285 */     if ((this.h[0].b() == alq.a(aty.v)) && (this.h[0].i() == 1) && (this.h[1] != null) && (this.h[1].b() == amk.aw)) {
/* 245:286 */       this.h[1] = new amj(amk.ax);
/* 246:    */     }
/* 247:289 */     this.h[0].b -= 1;
/* 248:290 */     if (this.h[0].b <= 0) {
/* 249:291 */       this.h[0] = null;
/* 250:    */     }
/* 251:    */   }
/* 252:    */   
/* 253:    */   public static int b(amj paramamj)
/* 254:    */   {
/* 255:296 */     if (paramamj == null) {
/* 256:297 */       return 0;
/* 257:    */     }
/* 258:299 */     alq localalq = paramamj.b();
/* 259:302 */     if (((localalq instanceof aju)) && (atr.a(localalq) != aty.a))
/* 260:    */     {
/* 261:303 */       atr localatr = atr.a(localalq);
/* 262:305 */       if (localatr == aty.bM) {
/* 263:306 */         return 150;
/* 264:    */       }
/* 265:309 */       if (localatr.r() == bof.d) {
/* 266:310 */         return 300;
/* 267:    */       }
/* 268:313 */       if (localatr == aty.cA) {
/* 269:314 */         return 16000;
/* 270:    */       }
/* 271:    */     }
/* 272:318 */     if (((localalq instanceof aks)) && (((aks)localalq).h().equals("WOOD"))) {
/* 273:319 */       return 200;
/* 274:    */     }
/* 275:320 */     if (((localalq instanceof anm)) && (((anm)localalq).h().equals("WOOD"))) {
/* 276:321 */       return 200;
/* 277:    */     }
/* 278:322 */     if (((localalq instanceof alo)) && (((alo)localalq).g().equals("WOOD"))) {
/* 279:323 */       return 200;
/* 280:    */     }
/* 281:326 */     if (localalq == amk.y) {
/* 282:327 */       return 100;
/* 283:    */     }
/* 284:330 */     if (localalq == amk.h) {
/* 285:331 */       return 1600;
/* 286:    */     }
/* 287:334 */     if (localalq == amk.ay) {
/* 288:335 */       return 20000;
/* 289:    */     }
/* 290:338 */     if (localalq == alq.a(aty.g)) {
/* 291:339 */       return 100;
/* 292:    */     }
/* 293:342 */     if (localalq == amk.bv) {
/* 294:343 */       return 2400;
/* 295:    */     }
/* 296:346 */     return 0;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public static boolean c(amj paramamj)
/* 300:    */   {
/* 301:350 */     return b(paramamj) > 0;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public boolean a(ahd paramahd)
/* 305:    */   {
/* 306:355 */     if (this.b.s(this.c) != this) {
/* 307:356 */       return false;
/* 308:    */     }
/* 309:358 */     if (paramahd.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 310:359 */       return false;
/* 311:    */     }
/* 312:361 */     return true;
/* 313:    */   }
/* 314:    */   
/* 315:    */   public void b(ahd paramahd) {}
/* 316:    */   
/* 317:    */   public void c(ahd paramahd) {}
/* 318:    */   
/* 319:    */   public boolean b(int paramInt, amj paramamj)
/* 320:    */   {
/* 321:374 */     if (paramInt == 2) {
/* 322:375 */       return false;
/* 323:    */     }
/* 324:377 */     if (paramInt == 1) {
/* 325:378 */       return (c(paramamj)) || (aiu.c_(paramamj));
/* 326:    */     }
/* 327:380 */     return true;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public int[] a(ej paramej)
/* 331:    */   {
/* 332:385 */     if (paramej == ej.a) {
/* 333:386 */       return f;
/* 334:    */     }
/* 335:387 */     if (paramej == ej.b) {
/* 336:388 */       return a;
/* 337:    */     }
/* 338:390 */     return g;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public boolean a(int paramInt, amj paramamj, ej paramej)
/* 342:    */   {
/* 343:396 */     return b(paramInt, paramamj);
/* 344:    */   }
/* 345:    */   
/* 346:    */   public boolean b(int paramInt, amj paramamj, ej paramej)
/* 347:    */   {
/* 348:401 */     if ((paramej == ej.a) && (paramInt == 1))
/* 349:    */     {
/* 350:402 */       alq localalq = paramamj.b();
/* 351:403 */       if ((localalq != amk.ax) && (localalq != amk.aw)) {
/* 352:404 */         return false;
/* 353:    */       }
/* 354:    */     }
/* 355:408 */     return true;
/* 356:    */   }
/* 357:    */   
/* 358:    */   public String k()
/* 359:    */   {
/* 360:413 */     return "minecraft:furnace";
/* 361:    */   }
/* 362:    */   
/* 363:    */   public aib a(ahb paramahb, ahd paramahd)
/* 364:    */   {
/* 365:418 */     return new aiv(paramahb, this);
/* 366:    */   }
/* 367:    */   
/* 368:    */   public int a_(int paramInt)
/* 369:    */   {
/* 370:423 */     switch (paramInt)
/* 371:    */     {
/* 372:    */     case 0: 
/* 373:425 */       return this.i;
/* 374:    */     case 1: 
/* 375:427 */       return this.j;
/* 376:    */     case 2: 
/* 377:429 */       return this.k;
/* 378:    */     case 3: 
/* 379:431 */       return this.l;
/* 380:    */     }
/* 381:433 */     return 0;
/* 382:    */   }
/* 383:    */   
/* 384:    */   public void b(int paramInt1, int paramInt2)
/* 385:    */   {
/* 386:438 */     switch (paramInt1)
/* 387:    */     {
/* 388:    */     case 0: 
/* 389:440 */       this.i = paramInt2;
/* 390:441 */       break;
/* 391:    */     case 1: 
/* 392:443 */       this.j = paramInt2;
/* 393:444 */       break;
/* 394:    */     case 2: 
/* 395:446 */       this.k = paramInt2;
/* 396:447 */       break;
/* 397:    */     case 3: 
/* 398:449 */       this.l = paramInt2;
/* 399:    */     }
/* 400:    */   }
/* 401:    */   
/* 402:    */   public int g()
/* 403:    */   {
/* 404:456 */     return 4;
/* 405:    */   }
/* 406:    */   
/* 407:    */   public void l()
/* 408:    */   {
/* 409:461 */     for (int n = 0; n < this.h.length; n++) {
/* 410:462 */       this.h[n] = null;
/* 411:    */     }
/* 412:    */   }
/* 413:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bdc
 * JD-Core Version:    0.7.0.1
 */