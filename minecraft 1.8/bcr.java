/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bcr
/*   5:    */   extends bdf
/*   6:    */   implements pm, vq
/*   7:    */ {
/*   8: 27 */   private amj[] m = new amj[27];
/*   9:    */   public boolean a;
/*  10:    */   public bcr f;
/*  11:    */   public bcr g;
/*  12:    */   public bcr h;
/*  13:    */   public bcr i;
/*  14:    */   public float j;
/*  15:    */   public float k;
/*  16:    */   public int l;
/*  17:    */   private int n;
/*  18:    */   private int o;
/*  19:    */   private String p;
/*  20:    */   
/*  21:    */   public bcr()
/*  22:    */   {
/*  23: 43 */     this.o = -1;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public bcr(int paramInt)
/*  27:    */   {
/*  28: 48 */     this.o = paramInt;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int n_()
/*  32:    */   {
/*  33: 53 */     return 27;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public amj a(int paramInt)
/*  37:    */   {
/*  38: 59 */     return this.m[paramInt];
/*  39:    */   }
/*  40:    */   
/*  41:    */   public amj a(int paramInt1, int paramInt2)
/*  42:    */   {
/*  43: 65 */     if (this.m[paramInt1] != null)
/*  44:    */     {
/*  45: 66 */       if (this.m[paramInt1].b <= paramInt2)
/*  46:    */       {
/*  47: 67 */         localamj = this.m[paramInt1];
/*  48: 68 */         this.m[paramInt1] = null;
/*  49: 69 */         o_();
/*  50: 70 */         return localamj;
/*  51:    */       }
/*  52: 72 */       amj localamj = this.m[paramInt1].a(paramInt2);
/*  53: 73 */       if (this.m[paramInt1].b == 0) {
/*  54: 74 */         this.m[paramInt1] = null;
/*  55:    */       }
/*  56: 76 */       o_();
/*  57: 77 */       return localamj;
/*  58:    */     }
/*  59: 80 */     return null;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public amj b(int paramInt)
/*  63:    */   {
/*  64: 86 */     if (this.m[paramInt] != null)
/*  65:    */     {
/*  66: 87 */       amj localamj = this.m[paramInt];
/*  67: 88 */       this.m[paramInt] = null;
/*  68: 89 */       return localamj;
/*  69:    */     }
/*  70: 91 */     return null;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(int paramInt, amj paramamj)
/*  74:    */   {
/*  75: 96 */     this.m[paramInt] = paramamj;
/*  76: 97 */     if ((paramamj != null) && (paramamj.b > p_())) {
/*  77: 98 */       paramamj.b = p_();
/*  78:    */     }
/*  79:100 */     o_();
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String d_()
/*  83:    */   {
/*  84:105 */     return k_() ? this.p : "container.chest";
/*  85:    */   }
/*  86:    */   
/*  87:    */   public boolean k_()
/*  88:    */   {
/*  89:110 */     return (this.p != null) && (this.p.length() > 0);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void a(String paramString)
/*  93:    */   {
/*  94:114 */     this.p = paramString;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void a(fn paramfn)
/*  98:    */   {
/*  99:120 */     super.a(paramfn);
/* 100:121 */     fv localfv = paramfn.c("Items", 10);
/* 101:122 */     this.m = new amj[n_()];
/* 102:123 */     if (paramfn.b("CustomName", 8)) {
/* 103:124 */       this.p = paramfn.j("CustomName");
/* 104:    */     }
/* 105:126 */     for (int i1 = 0; i1 < localfv.c(); i1++)
/* 106:    */     {
/* 107:127 */       fn localfn = localfv.b(i1);
/* 108:128 */       int i2 = localfn.d("Slot") & 0xFF;
/* 109:129 */       if ((i2 >= 0) && (i2 < this.m.length)) {
/* 110:130 */         this.m[i2] = amj.a(localfn);
/* 111:    */       }
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void b(fn paramfn)
/* 116:    */   {
/* 117:137 */     super.b(paramfn);
/* 118:138 */     fv localfv = new fv();
/* 119:140 */     for (int i1 = 0; i1 < this.m.length; i1++) {
/* 120:141 */       if (this.m[i1] != null)
/* 121:    */       {
/* 122:142 */         fn localfn = new fn();
/* 123:143 */         localfn.a("Slot", (byte)i1);
/* 124:144 */         this.m[i1].b(localfn);
/* 125:145 */         localfv.a(localfn);
/* 126:    */       }
/* 127:    */     }
/* 128:148 */     paramfn.a("Items", localfv);
/* 129:149 */     if (k_()) {
/* 130:150 */       paramfn.a("CustomName", this.p);
/* 131:    */     }
/* 132:    */   }
/* 133:    */   
/* 134:    */   public int p_()
/* 135:    */   {
/* 136:156 */     return 64;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public boolean a(ahd paramahd)
/* 140:    */   {
/* 141:161 */     if (this.b.s(this.c) != this) {
/* 142:162 */       return false;
/* 143:    */     }
/* 144:164 */     if (paramahd.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
/* 145:165 */       return false;
/* 146:    */     }
/* 147:167 */     return true;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void E()
/* 151:    */   {
/* 152:172 */     super.E();
/* 153:173 */     this.a = false;
/* 154:    */   }
/* 155:    */   
/* 156:    */   private void a(bcr parambcr, ej paramej)
/* 157:    */   {
/* 158:177 */     if (parambcr.x()) {
/* 159:178 */       this.a = false;
/* 160:179 */     } else if (this.a) {
/* 161:180 */       switch (bcs.a[paramej.ordinal()])
/* 162:    */       {
/* 163:    */       case 1: 
/* 164:182 */         if (this.f != parambcr) {
/* 165:183 */           this.a = false;
/* 166:    */         }
/* 167:    */         break;
/* 168:    */       case 2: 
/* 169:187 */         if (this.i != parambcr) {
/* 170:188 */           this.a = false;
/* 171:    */         }
/* 172:    */         break;
/* 173:    */       case 3: 
/* 174:192 */         if (this.g != parambcr) {
/* 175:193 */           this.a = false;
/* 176:    */         }
/* 177:    */         break;
/* 178:    */       case 4: 
/* 179:197 */         if (this.h != parambcr) {
/* 180:198 */           this.a = false;
/* 181:    */         }
/* 182:    */         break;
/* 183:    */       }
/* 184:    */     }
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void m()
/* 188:    */   {
/* 189:206 */     if (this.a) {
/* 190:207 */       return;
/* 191:    */     }
/* 192:210 */     this.a = true;
/* 193:211 */     this.h = a(ej.e);
/* 194:212 */     this.g = a(ej.f);
/* 195:213 */     this.f = a(ej.c);
/* 196:214 */     this.i = a(ej.d);
/* 197:    */   }
/* 198:    */   
/* 199:    */   protected bcr a(ej paramej)
/* 200:    */   {
/* 201:219 */     dt localdt = this.c.a(paramej);
/* 202:221 */     if (b(localdt))
/* 203:    */     {
/* 204:222 */       bcm localbcm = this.b.s(localdt);
/* 205:223 */       if ((localbcm instanceof bcr))
/* 206:    */       {
/* 207:224 */         bcr localbcr = (bcr)localbcm;
/* 208:225 */         localbcr.a(this, paramej.d());
/* 209:    */         
/* 210:227 */         return localbcr;
/* 211:    */       }
/* 212:    */     }
/* 213:231 */     return null;
/* 214:    */   }
/* 215:    */   
/* 216:    */   private boolean b(dt paramdt)
/* 217:    */   {
/* 218:235 */     if (this.b == null) {
/* 219:236 */       return false;
/* 220:    */     }
/* 221:239 */     atr localatr = this.b.p(paramdt).c();
/* 222:    */     
/* 223:241 */     return ((localatr instanceof auj)) && (((auj)localatr).b == n());
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void c()
/* 227:    */   {
/* 228:246 */     m();
/* 229:    */     
/* 230:248 */     int i1 = this.c.n();
/* 231:249 */     int i2 = this.c.o();
/* 232:250 */     int i3 = this.c.p();
/* 233:    */     
/* 234:252 */     this.n += 1;
/* 235:253 */     if ((!this.b.D) && (this.l != 0) && ((this.n + i1 + i2 + i3) % 200 == 0))
/* 236:    */     {
/* 237:254 */       this.l = 0;
/* 238:    */       
/* 239:256 */       f1 = 5.0F;
/* 240:257 */       List localList = this.b.a(ahd.class, new brt(i1 - f1, i2 - f1, i3 - f1, i1 + 1 + f1, i2 + 1 + f1, i3 + 1 + f1));
/* 241:258 */       for (ahd localahd : localList) {
/* 242:259 */         if ((localahd.bi instanceof aim))
/* 243:    */         {
/* 244:260 */           vq localvq = ((aim)localahd.bi).e();
/* 245:261 */           if ((localvq == this) || (((localvq instanceof vp)) && (((vp)localvq).a(this)))) {
/* 246:262 */             this.l += 1;
/* 247:    */           }
/* 248:    */         }
/* 249:    */       }
/* 250:    */     }
/* 251:268 */     this.k = this.j;
/* 252:    */     
/* 253:270 */     float f1 = 0.1F;
/* 254:    */     double d2;
/* 255:271 */     if ((this.l > 0) && (this.j == 0.0F) && 
/* 256:272 */       (this.f == null) && (this.h == null))
/* 257:    */     {
/* 258:273 */       double d1 = i1 + 0.5D;
/* 259:274 */       d2 = i3 + 0.5D;
/* 260:275 */       if (this.i != null) {
/* 261:276 */         d2 += 0.5D;
/* 262:    */       }
/* 263:278 */       if (this.g != null) {
/* 264:279 */         d1 += 0.5D;
/* 265:    */       }
/* 266:282 */       this.b.a(d1, i2 + 0.5D, d2, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/* 267:    */     }
/* 268:285 */     if (((this.l == 0) && (this.j > 0.0F)) || ((this.l > 0) && (this.j < 1.0F)))
/* 269:    */     {
/* 270:286 */       float f2 = this.j;
/* 271:287 */       if (this.l > 0) {
/* 272:288 */         this.j += f1;
/* 273:    */       } else {
/* 274:290 */         this.j -= f1;
/* 275:    */       }
/* 276:292 */       if (this.j > 1.0F) {
/* 277:293 */         this.j = 1.0F;
/* 278:    */       }
/* 279:295 */       float f3 = 0.5F;
/* 280:296 */       if ((this.j < f3) && (f2 >= f3) && 
/* 281:297 */         (this.f == null) && (this.h == null))
/* 282:    */       {
/* 283:298 */         d2 = i1 + 0.5D;
/* 284:299 */         double d3 = i3 + 0.5D;
/* 285:300 */         if (this.i != null) {
/* 286:301 */           d3 += 0.5D;
/* 287:    */         }
/* 288:303 */         if (this.g != null) {
/* 289:304 */           d2 += 0.5D;
/* 290:    */         }
/* 291:307 */         this.b.a(d2, i2 + 0.5D, d3, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/* 292:    */       }
/* 293:310 */       if (this.j < 0.0F) {
/* 294:311 */         this.j = 0.0F;
/* 295:    */       }
/* 296:    */     }
/* 297:    */   }
/* 298:    */   
/* 299:    */   public boolean c(int paramInt1, int paramInt2)
/* 300:    */   {
/* 301:318 */     if (paramInt1 == 1)
/* 302:    */     {
/* 303:319 */       this.l = paramInt2;
/* 304:320 */       return true;
/* 305:    */     }
/* 306:322 */     return super.c(paramInt1, paramInt2);
/* 307:    */   }
/* 308:    */   
/* 309:    */   public void b(ahd paramahd)
/* 310:    */   {
/* 311:327 */     if (!paramahd.v())
/* 312:    */     {
/* 313:328 */       if (this.l < 0) {
/* 314:329 */         this.l = 0;
/* 315:    */       }
/* 316:331 */       this.l += 1;
/* 317:332 */       this.b.c(this.c, w(), 1, this.l);
/* 318:333 */       this.b.c(this.c, w());
/* 319:334 */       this.b.c(this.c.b(), w());
/* 320:    */     }
/* 321:    */   }
/* 322:    */   
/* 323:    */   public void c(ahd paramahd)
/* 324:    */   {
/* 325:340 */     if ((!paramahd.v()) && 
/* 326:341 */       ((w() instanceof auj)))
/* 327:    */     {
/* 328:342 */       this.l -= 1;
/* 329:343 */       this.b.c(this.c, w(), 1, this.l);
/* 330:344 */       this.b.c(this.c, w());
/* 331:345 */       this.b.c(this.c.b(), w());
/* 332:    */     }
/* 333:    */   }
/* 334:    */   
/* 335:    */   public boolean b(int paramInt, amj paramamj)
/* 336:    */   {
/* 337:352 */     return true;
/* 338:    */   }
/* 339:    */   
/* 340:    */   public void y()
/* 341:    */   {
/* 342:357 */     super.y();
/* 343:358 */     E();
/* 344:359 */     m();
/* 345:    */   }
/* 346:    */   
/* 347:    */   public int n()
/* 348:    */   {
/* 349:363 */     if (this.o == -1) {
/* 350:364 */       if ((this.b != null) && ((w() instanceof auj))) {
/* 351:365 */         this.o = ((auj)w()).b;
/* 352:    */       } else {
/* 353:367 */         return 0;
/* 354:    */       }
/* 355:    */     }
/* 356:371 */     return this.o;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public String k()
/* 360:    */   {
/* 361:376 */     return "minecraft:chest";
/* 362:    */   }
/* 363:    */   
/* 364:    */   public aib a(ahb paramahb, ahd paramahd)
/* 365:    */   {
/* 366:381 */     return new aim(paramahb, this, paramahd);
/* 367:    */   }
/* 368:    */   
/* 369:    */   public int a_(int paramInt)
/* 370:    */   {
/* 371:386 */     return 0;
/* 372:    */   }
/* 373:    */   
/* 374:    */   public void b(int paramInt1, int paramInt2) {}
/* 375:    */   
/* 376:    */   public int g()
/* 377:    */   {
/* 378:395 */     return 0;
/* 379:    */   }
/* 380:    */   
/* 381:    */   public void l()
/* 382:    */   {
/* 383:400 */     for (int i1 = 0; i1 < this.m.length; i1++) {
/* 384:401 */       this.m[i1] = null;
/* 385:    */     }
/* 386:    */   }
/* 387:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcr
 * JD-Core Version:    0.7.0.1
 */