/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bgr
/*   5:    */   implements bfe
/*   6:    */ {
/*   7:    */   private final aqu h;
/*   8:    */   private final boolean i;
/*   9:    */   private final Random j;
/*  10: 33 */   private double[] k = new double[256];
/*  11: 34 */   private double[] l = new double[256];
/*  12: 35 */   private double[] m = new double[256];
/*  13:    */   private double[] n;
/*  14:    */   private final bnv o;
/*  15:    */   private final bnv p;
/*  16:    */   private final bnv q;
/*  17:    */   private final bnv r;
/*  18:    */   private final bnv s;
/*  19:    */   public final bnv a;
/*  20:    */   public final bnv b;
/*  21: 46 */   private final bhs t = new bhs();
/*  22: 47 */   private final bhz u = new bhz();
/*  23: 48 */   private final bht v = new bht();
/*  24: 49 */   private final bhp w = new bif(aty.co.P(), 14, bep.a(aty.aV));
/*  25: 50 */   private final bhu x = new bhu(aty.k, true);
/*  26: 51 */   private final bhu y = new bhu(aty.k, false);
/*  27: 52 */   private final bhi z = new bhi(aty.P);
/*  28: 53 */   private final bhi A = new bhi(aty.Q);
/*  29: 54 */   private final bjl B = new bjl();
/*  30: 55 */   private final bgt C = new bgu();
/*  31:    */   double[] c;
/*  32:    */   double[] d;
/*  33:    */   double[] e;
/*  34:    */   double[] f;
/*  35:    */   double[] g;
/*  36:    */   
/*  37:    */   public bgr(aqu paramaqu, boolean paramBoolean, long paramLong)
/*  38:    */   {
/*  39: 58 */     this.h = paramaqu;
/*  40: 59 */     this.i = paramBoolean;
/*  41:    */     
/*  42: 61 */     this.j = new Random(paramLong);
/*  43: 62 */     this.o = new bnv(this.j, 16);
/*  44: 63 */     this.p = new bnv(this.j, 16);
/*  45: 64 */     this.q = new bnv(this.j, 8);
/*  46: 65 */     this.r = new bnv(this.j, 4);
/*  47: 66 */     this.s = new bnv(this.j, 4);
/*  48:    */     
/*  49: 68 */     this.a = new bnv(this.j, 10);
/*  50: 69 */     this.b = new bnv(this.j, 16);
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void a(int paramInt1, int paramInt2, bgk parambgk)
/*  54:    */   {
/*  55: 73 */     int i1 = 4;
/*  56: 74 */     int i2 = 32;
/*  57:    */     
/*  58: 76 */     int i3 = i1 + 1;
/*  59: 77 */     int i4 = 17;
/*  60: 78 */     int i5 = i1 + 1;
/*  61: 79 */     this.n = a(this.n, paramInt1 * i1, 0, paramInt2 * i1, i3, i4, i5);
/*  62: 81 */     for (int i6 = 0; i6 < i1; i6++) {
/*  63: 82 */       for (int i7 = 0; i7 < i1; i7++) {
/*  64: 83 */         for (int i8 = 0; i8 < 16; i8++)
/*  65:    */         {
/*  66: 84 */           double d1 = 0.125D;
/*  67: 85 */           double d2 = this.n[(((i6 + 0) * i5 + (i7 + 0)) * i4 + (i8 + 0))];
/*  68: 86 */           double d3 = this.n[(((i6 + 0) * i5 + (i7 + 1)) * i4 + (i8 + 0))];
/*  69: 87 */           double d4 = this.n[(((i6 + 1) * i5 + (i7 + 0)) * i4 + (i8 + 0))];
/*  70: 88 */           double d5 = this.n[(((i6 + 1) * i5 + (i7 + 1)) * i4 + (i8 + 0))];
/*  71:    */           
/*  72: 90 */           double d6 = (this.n[(((i6 + 0) * i5 + (i7 + 0)) * i4 + (i8 + 1))] - d2) * d1;
/*  73: 91 */           double d7 = (this.n[(((i6 + 0) * i5 + (i7 + 1)) * i4 + (i8 + 1))] - d3) * d1;
/*  74: 92 */           double d8 = (this.n[(((i6 + 1) * i5 + (i7 + 0)) * i4 + (i8 + 1))] - d4) * d1;
/*  75: 93 */           double d9 = (this.n[(((i6 + 1) * i5 + (i7 + 1)) * i4 + (i8 + 1))] - d5) * d1;
/*  76: 95 */           for (int i9 = 0; i9 < 8; i9++)
/*  77:    */           {
/*  78: 96 */             double d10 = 0.25D;
/*  79:    */             
/*  80: 98 */             double d11 = d2;
/*  81: 99 */             double d12 = d3;
/*  82:100 */             double d13 = (d4 - d2) * d10;
/*  83:101 */             double d14 = (d5 - d3) * d10;
/*  84:103 */             for (int i10 = 0; i10 < 4; i10++)
/*  85:    */             {
/*  86:104 */               double d15 = 0.25D;
/*  87:    */               
/*  88:106 */               double d16 = d11;
/*  89:107 */               double d17 = (d12 - d11) * d15;
/*  90:108 */               for (int i11 = 0; i11 < 4; i11++)
/*  91:    */               {
/*  92:109 */                 bec localbec = null;
/*  93:110 */                 if (i8 * 8 + i9 < i2) {
/*  94:111 */                   localbec = aty.l.P();
/*  95:    */                 }
/*  96:113 */                 if (d16 > 0.0D) {
/*  97:114 */                   localbec = aty.aV.P();
/*  98:    */                 }
/*  99:117 */                 int i12 = i10 + i6 * 4;
/* 100:118 */                 int i13 = i9 + i8 * 8;
/* 101:119 */                 int i14 = i11 + i7 * 4;
/* 102:120 */                 parambgk.a(i12, i13, i14, localbec);
/* 103:121 */                 d16 += d17;
/* 104:    */               }
/* 105:123 */               d11 += d13;
/* 106:124 */               d12 += d14;
/* 107:    */             }
/* 108:127 */             d2 += d6;
/* 109:128 */             d3 += d7;
/* 110:129 */             d4 += d8;
/* 111:130 */             d5 += d9;
/* 112:    */           }
/* 113:    */         }
/* 114:    */       }
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void b(int paramInt1, int paramInt2, bgk parambgk)
/* 119:    */   {
/* 120:138 */     int i1 = 64;
/* 121:    */     
/* 122:140 */     double d1 = 0.03125D;
/* 123:141 */     this.k = this.r.a(this.k, paramInt1 * 16, paramInt2 * 16, 0, 16, 16, 1, d1, d1, 1.0D);
/* 124:142 */     this.l = this.r.a(this.l, paramInt1 * 16, 109, paramInt2 * 16, 16, 1, 16, d1, 1.0D, d1);
/* 125:143 */     this.m = this.s.a(this.m, paramInt1 * 16, paramInt2 * 16, 0, 16, 16, 1, d1 * 2.0D, d1 * 2.0D, d1 * 2.0D);
/* 126:145 */     for (int i2 = 0; i2 < 16; i2++) {
/* 127:146 */       for (int i3 = 0; i3 < 16; i3++)
/* 128:    */       {
/* 129:147 */         int i4 = this.k[(i2 + i3 * 16)] + this.j.nextDouble() * 0.2D > 0.0D ? 1 : 0;
/* 130:148 */         int i5 = this.l[(i2 + i3 * 16)] + this.j.nextDouble() * 0.2D > 0.0D ? 1 : 0;
/* 131:149 */         int i6 = (int)(this.m[(i2 + i3 * 16)] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D);
/* 132:    */         
/* 133:151 */         int i7 = -1;
/* 134:    */         
/* 135:153 */         bec localbec1 = aty.aV.P();
/* 136:154 */         bec localbec2 = aty.aV.P();
/* 137:156 */         for (int i8 = 127; i8 >= 0; i8--) {
/* 138:157 */           if ((i8 >= 127 - this.j.nextInt(5)) || (i8 <= this.j.nextInt(5)))
/* 139:    */           {
/* 140:158 */             parambgk.a(i3, i8, i2, aty.h.P());
/* 141:    */           }
/* 142:    */           else
/* 143:    */           {
/* 144:160 */             bec localbec3 = parambgk.a(i3, i8, i2);
/* 145:161 */             if ((localbec3.c() == null) || (localbec3.c().r() == bof.a)) {
/* 146:162 */               i7 = -1;
/* 147:163 */             } else if (localbec3.c() == aty.aV) {
/* 148:164 */               if (i7 == -1)
/* 149:    */               {
/* 150:165 */                 if (i6 <= 0)
/* 151:    */                 {
/* 152:166 */                   localbec1 = null;
/* 153:167 */                   localbec2 = aty.aV.P();
/* 154:    */                 }
/* 155:168 */                 else if ((i8 >= i1 - 4) && (i8 <= i1 + 1))
/* 156:    */                 {
/* 157:169 */                   localbec1 = aty.aV.P();
/* 158:170 */                   localbec2 = aty.aV.P();
/* 159:171 */                   if (i5 != 0)
/* 160:    */                   {
/* 161:172 */                     localbec1 = aty.n.P();
/* 162:173 */                     localbec2 = aty.aV.P();
/* 163:    */                   }
/* 164:175 */                   if (i4 != 0)
/* 165:    */                   {
/* 166:176 */                     localbec1 = aty.aW.P();
/* 167:177 */                     localbec2 = aty.aW.P();
/* 168:    */                   }
/* 169:    */                 }
/* 170:181 */                 if ((i8 < i1) && ((localbec1 == null) || (localbec1.c().r() == bof.a))) {
/* 171:182 */                   localbec1 = aty.l.P();
/* 172:    */                 }
/* 173:185 */                 i7 = i6;
/* 174:186 */                 if (i8 >= i1 - 1) {
/* 175:187 */                   parambgk.a(i3, i8, i2, localbec1);
/* 176:    */                 } else {
/* 177:189 */                   parambgk.a(i3, i8, i2, localbec2);
/* 178:    */                 }
/* 179:    */               }
/* 180:191 */               else if (i7 > 0)
/* 181:    */               {
/* 182:192 */                 i7--;
/* 183:193 */                 parambgk.a(i3, i8, i2, localbec2);
/* 184:    */               }
/* 185:    */             }
/* 186:    */           }
/* 187:    */         }
/* 188:    */       }
/* 189:    */     }
/* 190:    */   }
/* 191:    */   
/* 192:    */   public bfh d(int paramInt1, int paramInt2)
/* 193:    */   {
/* 194:209 */     this.j.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
/* 195:    */     
/* 196:211 */     bgk localbgk = new bgk();
/* 197:    */     
/* 198:213 */     a(paramInt1, paramInt2, localbgk);
/* 199:214 */     b(paramInt1, paramInt2, localbgk);
/* 200:    */     
/* 201:216 */     this.C.a(this, this.h, paramInt1, paramInt2, localbgk);
/* 202:217 */     if (this.i) {
/* 203:218 */       this.B.a(this, this.h, paramInt1, paramInt2, localbgk);
/* 204:    */     }
/* 205:221 */     bfh localbfh = new bfh(this.h, localbgk, paramInt1, paramInt2);
/* 206:222 */     arm[] arrayOfarm = this.h.v().b(null, paramInt1 * 16, paramInt2 * 16, 16, 16);
/* 207:223 */     byte[] arrayOfByte = localbfh.k();
/* 208:225 */     for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
/* 209:226 */       arrayOfByte[i1] = ((byte)arrayOfarm[i1].az);
/* 210:    */     }
/* 211:229 */     localbfh.l();
/* 212:    */     
/* 213:231 */     return localbfh;
/* 214:    */   }
/* 215:    */   
/* 216:    */   private double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 217:    */   {
/* 218:237 */     if (paramArrayOfDouble == null) {
/* 219:238 */       paramArrayOfDouble = new double[paramInt4 * paramInt5 * paramInt6];
/* 220:    */     }
/* 221:241 */     double d1 = 684.41200000000003D;
/* 222:242 */     double d2 = 2053.2359999999999D;
/* 223:    */     
/* 224:244 */     this.f = this.a.a(this.f, paramInt1, paramInt2, paramInt3, paramInt4, 1, paramInt6, 1.0D, 0.0D, 1.0D);
/* 225:245 */     this.g = this.b.a(this.g, paramInt1, paramInt2, paramInt3, paramInt4, 1, paramInt6, 100.0D, 0.0D, 100.0D);
/* 226:    */     
/* 227:247 */     this.c = this.q.a(this.c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 60.0D, d1 / 80.0D);
/* 228:248 */     this.d = this.o.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
/* 229:249 */     this.e = this.p.a(this.e, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
/* 230:    */     
/* 231:251 */     int i1 = 0;
/* 232:252 */     double[] arrayOfDouble = new double[paramInt5];
/* 233:253 */     for (int i2 = 0; i2 < paramInt5; i2++)
/* 234:    */     {
/* 235:254 */       arrayOfDouble[i2] = (Math.cos(i2 * 3.141592653589793D * 6.0D / paramInt5) * 2.0D);
/* 236:    */       
/* 237:256 */       double d3 = i2;
/* 238:257 */       if (i2 > paramInt5 / 2) {
/* 239:258 */         d3 = paramInt5 - 1 - i2;
/* 240:    */       }
/* 241:260 */       if (d3 < 4.0D)
/* 242:    */       {
/* 243:261 */         d3 = 4.0D - d3;
/* 244:262 */         arrayOfDouble[i2] -= d3 * d3 * d3 * 10.0D;
/* 245:    */       }
/* 246:    */     }
/* 247:266 */     for (i2 = 0; i2 < paramInt4; i2++) {
/* 248:267 */       for (int i3 = 0; i3 < paramInt6; i3++)
/* 249:    */       {
/* 250:268 */         double d4 = 0.0D;
/* 251:270 */         for (int i4 = 0; i4 < paramInt5; i4++)
/* 252:    */         {
/* 253:271 */           double d5 = 0.0D;
/* 254:272 */           double d6 = arrayOfDouble[i4];
/* 255:273 */           double d7 = this.d[i1] / 512.0D;
/* 256:274 */           double d8 = this.e[i1] / 512.0D;
/* 257:275 */           double d9 = (this.c[i1] / 10.0D + 1.0D) / 2.0D;
/* 258:277 */           if (d9 < 0.0D) {
/* 259:278 */             d5 = d7;
/* 260:279 */           } else if (d9 > 1.0D) {
/* 261:280 */             d5 = d8;
/* 262:    */           } else {
/* 263:282 */             d5 = d7 + (d8 - d7) * d9;
/* 264:    */           }
/* 265:285 */           d5 -= d6;
/* 266:    */           double d10;
/* 267:287 */           if (i4 > paramInt5 - 4)
/* 268:    */           {
/* 269:288 */             d10 = (i4 - (paramInt5 - 4)) / 3.0F;
/* 270:289 */             d5 = d5 * (1.0D - d10) + -10.0D * d10;
/* 271:    */           }
/* 272:292 */           if (i4 < d4)
/* 273:    */           {
/* 274:293 */             d10 = (d4 - i4) / 4.0D;
/* 275:294 */             d10 = uv.a(d10, 0.0D, 1.0D);
/* 276:295 */             d5 = d5 * (1.0D - d10) + -10.0D * d10;
/* 277:    */           }
/* 278:298 */           paramArrayOfDouble[i1] = d5;
/* 279:299 */           i1++;
/* 280:    */         }
/* 281:    */       }
/* 282:    */     }
/* 283:304 */     return paramArrayOfDouble;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public boolean a(int paramInt1, int paramInt2)
/* 287:    */   {
/* 288:309 */     return true;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public void a(bfe parambfe, int paramInt1, int paramInt2)
/* 292:    */   {
/* 293:314 */     avt.M = true;
/* 294:315 */     dt localdt = new dt(paramInt1 * 16, 0, paramInt2 * 16);
/* 295:    */     
/* 296:317 */     aqm localaqm = new aqm(paramInt1, paramInt2);
/* 297:    */     
/* 298:319 */     this.B.a(this.h, this.j, localaqm);
/* 299:321 */     for (int i1 = 0; i1 < 8; i1++) {
/* 300:322 */       this.y.b(this.h, this.j, localdt.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
/* 301:    */     }
/* 302:325 */     for (i1 = 0; i1 < this.j.nextInt(this.j.nextInt(10) + 1) + 1; i1++) {
/* 303:326 */       this.t.b(this.h, this.j, localdt.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
/* 304:    */     }
/* 305:329 */     for (i1 = 0; i1 < this.j.nextInt(this.j.nextInt(10) + 1); i1++) {
/* 306:330 */       this.u.b(this.h, this.j, localdt.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
/* 307:    */     }
/* 308:333 */     for (i1 = 0; i1 < 10; i1++) {
/* 309:334 */       this.v.b(this.h, this.j, localdt.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
/* 310:    */     }
/* 311:337 */     if (this.j.nextBoolean()) {
/* 312:338 */       this.z.b(this.h, this.j, localdt.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
/* 313:    */     }
/* 314:341 */     if (this.j.nextBoolean()) {
/* 315:342 */       this.A.b(this.h, this.j, localdt.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
/* 316:    */     }
/* 317:345 */     for (i1 = 0; i1 < 16; i1++) {
/* 318:346 */       this.w.b(this.h, this.j, localdt.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
/* 319:    */     }
/* 320:349 */     for (i1 = 0; i1 < 16; i1++) {
/* 321:350 */       this.x.b(this.h, this.j, localdt.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
/* 322:    */     }
/* 323:353 */     avt.M = false;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public boolean a(bfe parambfe, bfh parambfh, int paramInt1, int paramInt2)
/* 327:    */   {
/* 328:358 */     return false;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public boolean a(boolean paramBoolean, uy paramuy)
/* 332:    */   {
/* 333:363 */     return true;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public void c() {}
/* 337:    */   
/* 338:    */   public boolean d()
/* 339:    */   {
/* 340:372 */     return false;
/* 341:    */   }
/* 342:    */   
/* 343:    */   public boolean e()
/* 344:    */   {
/* 345:377 */     return true;
/* 346:    */   }
/* 347:    */   
/* 348:    */   public String f()
/* 349:    */   {
/* 350:382 */     return "HellRandomLevelSource";
/* 351:    */   }
/* 352:    */   
/* 353:    */   public List a(xp paramxp, dt paramdt)
/* 354:    */   {
/* 355:388 */     if (paramxp == xp.a)
/* 356:    */     {
/* 357:389 */       if (this.B.b(paramdt)) {
/* 358:390 */         return this.B.b();
/* 359:    */       }
/* 360:392 */       if ((this.B.a(this.h, paramdt)) && (this.h.p(paramdt.b()).c() == aty.by)) {
/* 361:393 */         return this.B.b();
/* 362:    */       }
/* 363:    */     }
/* 364:397 */     arm localarm = this.h.b(paramdt);
/* 365:398 */     return localarm.a(paramxp);
/* 366:    */   }
/* 367:    */   
/* 368:    */   public dt a(aqu paramaqu, String paramString, dt paramdt)
/* 369:    */   {
/* 370:403 */     return null;
/* 371:    */   }
/* 372:    */   
/* 373:    */   public int g()
/* 374:    */   {
/* 375:408 */     return 0;
/* 376:    */   }
/* 377:    */   
/* 378:    */   public void a(bfh parambfh, int paramInt1, int paramInt2)
/* 379:    */   {
/* 380:413 */     this.B.a(this, this.h, paramInt1, paramInt2, null);
/* 381:    */   }
/* 382:    */   
/* 383:    */   public bfh a(dt paramdt)
/* 384:    */   {
/* 385:418 */     return d(paramdt.n() >> 4, paramdt.p() >> 4);
/* 386:    */   }
/* 387:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bgr
 * JD-Core Version:    0.7.0.1
 */