/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bdq
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 27 */   public static final beu a = beu.a("facing");
/*   8: 28 */   public static final bet b = bet.a("extended");
/*   9:    */   private final boolean M;
/*  10:    */   
/*  11:    */   public bdq(boolean paramBoolean)
/*  12:    */   {
/*  13: 40 */     super(bof.H);
/*  14: 41 */     j(this.L.b().a(a, ej.c).a(b, Boolean.valueOf(false)));
/*  15: 42 */     this.M = paramBoolean;
/*  16: 43 */     a(i);
/*  17: 44 */     c(0.5F);
/*  18: 45 */     a(akf.d);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean c()
/*  22:    */   {
/*  23: 54 */     return false;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj)
/*  27:    */   {
/*  28: 59 */     paramaqu.a(paramdt, parambec.a(a, a(paramaqu, paramdt, paramxm)), 2);
/*  29: 60 */     if (!paramaqu.D) {
/*  30: 61 */       e(paramaqu, paramdt, parambec);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  35:    */   {
/*  36: 67 */     if (!paramaqu.D) {
/*  37: 68 */       e(paramaqu, paramdt, parambec);
/*  38:    */     }
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/*  42:    */   {
/*  43: 74 */     if ((!paramaqu.D) && (paramaqu.s(paramdt) == null)) {
/*  44: 75 */       e(paramaqu, paramdt, parambec);
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  49:    */   {
/*  50: 81 */     return P().a(a, a(paramaqu, paramdt, paramxm)).a(b, Boolean.valueOf(false));
/*  51:    */   }
/*  52:    */   
/*  53:    */   private void e(aqu paramaqu, dt paramdt, bec parambec)
/*  54:    */   {
/*  55: 85 */     ej localej = (ej)parambec.b(a);
/*  56:    */     
/*  57: 87 */     boolean bool = b(paramaqu, paramdt, localej);
/*  58: 89 */     if ((bool) && (!((Boolean)parambec.b(b)).booleanValue()))
/*  59:    */     {
/*  60: 90 */       if (new bdy(paramaqu, paramdt, localej, true).a()) {
/*  61: 91 */         paramaqu.c(paramdt, this, 0, localej.a());
/*  62:    */       }
/*  63:    */     }
/*  64: 93 */     else if ((!bool) && (((Boolean)parambec.b(b)).booleanValue()))
/*  65:    */     {
/*  66: 94 */       paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(false)), 2);
/*  67: 95 */       paramaqu.c(paramdt, this, 1, localej.a());
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   private boolean b(aqu paramaqu, dt paramdt, ej paramej)
/*  72:    */   {
/*  73:111 */     for (ej localej1 : ) {
/*  74:112 */       if ((localej1 != paramej) && (paramaqu.b(paramdt.a(localej1), localej1))) {
/*  75:113 */         return true;
/*  76:    */       }
/*  77:    */     }
/*  78:118 */     if (paramaqu.b(paramdt, ej.c)) {
/*  79:119 */       return true;
/*  80:    */     }
/*  81:122 */     ??? = paramdt.a();
/*  82:123 */     for (ej localej2 : ej.values()) {
/*  83:124 */       if ((localej2 != ej.a) && (paramaqu.b(((dt)???).a(localej2), localej2))) {
/*  84:125 */         return true;
/*  85:    */       }
/*  86:    */     }
/*  87:129 */     return false;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, int paramInt1, int paramInt2)
/*  91:    */   {
/*  92:134 */     ej localej = (ej)parambec.b(a);
/*  93:135 */     if (!paramaqu.D)
/*  94:    */     {
/*  95:136 */       boolean bool = b(paramaqu, paramdt, localej);
/*  96:138 */       if ((bool) && (paramInt1 == 1))
/*  97:    */       {
/*  98:139 */         paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(true)), 2);
/*  99:140 */         return false;
/* 100:    */       }
/* 101:141 */       if ((!bool) && (paramInt1 == 0)) {
/* 102:142 */         return false;
/* 103:    */       }
/* 104:    */     }
/* 105:146 */     if (paramInt1 == 0)
/* 106:    */     {
/* 107:147 */       if (a(paramaqu, paramdt, localej, true))
/* 108:    */       {
/* 109:148 */         paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(true)), 2);
/* 110:149 */         paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "tile.piston.out", 0.5F, paramaqu.s.nextFloat() * 0.25F + 0.6F);
/* 111:    */       }
/* 112:    */       else
/* 113:    */       {
/* 114:151 */         return false;
/* 115:    */       }
/* 116:    */     }
/* 117:153 */     else if (paramInt1 == 1)
/* 118:    */     {
/* 119:154 */       bcm localbcm1 = paramaqu.s(paramdt.a(localej));
/* 120:155 */       if ((localbcm1 instanceof bdv)) {
/* 121:156 */         ((bdv)localbcm1).h();
/* 122:    */       }
/* 123:159 */       paramaqu.a(paramdt, aty.M.P().a(bdx.a, localej).a(bdx.b, this.M ? bdu.b : bdu.a), 3);
/* 124:160 */       paramaqu.a(paramdt, bdx.a(a(paramInt2), localej, false, true));
/* 125:163 */       if (this.M)
/* 126:    */       {
/* 127:164 */         dt localdt = paramdt.a(localej.g() * 2, localej.h() * 2, localej.i() * 2);
/* 128:165 */         atr localatr = paramaqu.p(localdt).c();
/* 129:166 */         int i = 0;
/* 130:168 */         if (localatr == aty.M)
/* 131:    */         {
/* 132:171 */           bcm localbcm2 = paramaqu.s(localdt);
/* 133:172 */           if ((localbcm2 instanceof bdv))
/* 134:    */           {
/* 135:173 */             bdv localbdv = (bdv)localbcm2;
/* 136:175 */             if ((localbdv.e() == localej) && (localbdv.d()))
/* 137:    */             {
/* 138:177 */               localbdv.h();
/* 139:178 */               i = 1;
/* 140:    */             }
/* 141:    */           }
/* 142:    */         }
/* 143:183 */         if ((i == 0) && (localatr.r() != bof.a) && (a(localatr, paramaqu, localdt, localej.d(), false)) && ((localatr.i() == 0) || (localatr == aty.J) || (localatr == aty.F))) {
/* 144:184 */           a(paramaqu, paramdt, localej, false);
/* 145:    */         }
/* 146:    */       }
/* 147:    */       else
/* 148:    */       {
/* 149:187 */         paramaqu.g(paramdt.a(localej));
/* 150:    */       }
/* 151:190 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "tile.piston.in", 0.5F, paramaqu.s.nextFloat() * 0.15F + 0.6F);
/* 152:    */     }
/* 153:192 */     return true;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void a(ard paramard, dt paramdt)
/* 157:    */   {
/* 158:197 */     bec localbec = paramard.p(paramdt);
/* 159:198 */     if ((localbec.c() == this) && (((Boolean)localbec.b(b)).booleanValue()))
/* 160:    */     {
/* 161:199 */       float f = 0.25F;
/* 162:200 */       ej localej = (ej)localbec.b(a);
/* 163:201 */       if (localej != null) {
/* 164:202 */         switch (bdr.a[localej.ordinal()])
/* 165:    */         {
/* 166:    */         case 1: 
/* 167:204 */           a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 168:205 */           break;
/* 169:    */         case 2: 
/* 170:207 */           a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
/* 171:208 */           break;
/* 172:    */         case 3: 
/* 173:210 */           a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
/* 174:211 */           break;
/* 175:    */         case 4: 
/* 176:213 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
/* 177:214 */           break;
/* 178:    */         case 5: 
/* 179:216 */           a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 180:217 */           break;
/* 181:    */         case 6: 
/* 182:219 */           a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
/* 183:    */         }
/* 184:    */       }
/* 185:    */     }
/* 186:    */     else
/* 187:    */     {
/* 188:224 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 189:    */     }
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void h()
/* 193:    */   {
/* 194:230 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/* 198:    */   {
/* 199:235 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 200:236 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 201:    */   }
/* 202:    */   
/* 203:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/* 204:    */   {
/* 205:242 */     a(paramaqu, paramdt);
/* 206:243 */     return super.a(paramaqu, paramdt, parambec);
/* 207:    */   }
/* 208:    */   
/* 209:    */   public boolean d()
/* 210:    */   {
/* 211:248 */     return false;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public static ej b(int paramInt)
/* 215:    */   {
/* 216:253 */     int i = paramInt & 0x7;
/* 217:254 */     if (i > 5) {
/* 218:255 */       return null;
/* 219:    */     }
/* 220:257 */     return ej.a(i);
/* 221:    */   }
/* 222:    */   
/* 223:    */   public static ej a(aqu paramaqu, dt paramdt, xm paramxm)
/* 224:    */   {
/* 225:265 */     if ((uv.e((float)paramxm.s - paramdt.n()) < 2.0F) && (uv.e((float)paramxm.u - paramdt.p()) < 2.0F))
/* 226:    */     {
/* 227:267 */       double d = paramxm.t + paramxm.aR();
/* 228:268 */       if (d - paramdt.o() > 2.0D) {
/* 229:269 */         return ej.b;
/* 230:    */       }
/* 231:272 */       if (paramdt.o() - d > 0.0D) {
/* 232:273 */         return ej.a;
/* 233:    */       }
/* 234:    */     }
/* 235:277 */     return paramxm.aO().d();
/* 236:    */   }
/* 237:    */   
/* 238:    */   public static boolean a(atr paramatr, aqu paramaqu, dt paramdt, ej paramej, boolean paramBoolean)
/* 239:    */   {
/* 240:282 */     if (paramatr == aty.Z) {
/* 241:283 */       return false;
/* 242:    */     }
/* 243:286 */     if (!paramaqu.af().a(paramdt)) {
/* 244:287 */       return false;
/* 245:    */     }
/* 246:288 */     if ((paramdt.o() < 0) || ((paramej == ej.a) && (paramdt.o() == 0))) {
/* 247:289 */       return false;
/* 248:    */     }
/* 249:290 */     if ((paramdt.o() > paramaqu.U() - 1) || ((paramej == ej.b) && (paramdt.o() == paramaqu.U() - 1))) {
/* 250:291 */       return false;
/* 251:    */     }
/* 252:294 */     if ((paramatr == aty.J) || (paramatr == aty.F))
/* 253:    */     {
/* 254:296 */       if (((Boolean)paramaqu.p(paramdt).b(b)).booleanValue()) {
/* 255:297 */         return false;
/* 256:    */       }
/* 257:    */     }
/* 258:    */     else
/* 259:    */     {
/* 260:300 */       if (paramatr.g(paramaqu, paramdt) == -1.0F) {
/* 261:301 */         return false;
/* 262:    */       }
/* 263:304 */       if (paramatr.i() == 2) {
/* 264:305 */         return false;
/* 265:    */       }
/* 266:308 */       if (paramatr.i() == 1)
/* 267:    */       {
/* 268:309 */         if (!paramBoolean) {
/* 269:310 */           return false;
/* 270:    */         }
/* 271:312 */         return true;
/* 272:    */       }
/* 273:    */     }
/* 274:316 */     if ((paramatr instanceof avs)) {
/* 275:318 */       return false;
/* 276:    */     }
/* 277:321 */     return true;
/* 278:    */   }
/* 279:    */   
/* 280:    */   private boolean a(aqu paramaqu, dt paramdt, ej paramej, boolean paramBoolean)
/* 281:    */   {
/* 282:325 */     if (!paramBoolean) {
/* 283:328 */       paramaqu.g(paramdt.a(paramej));
/* 284:    */     }
/* 285:331 */     bdy localbdy = new bdy(paramaqu, paramdt, paramej, paramBoolean);
/* 286:332 */     List localList1 = localbdy.c();
/* 287:333 */     List localList2 = localbdy.d();
/* 288:335 */     if (!localbdy.a()) {
/* 289:336 */       return false;
/* 290:    */     }
/* 291:339 */     int i = localList1.size() + localList2.size();
/* 292:340 */     atr[] arrayOfatr = new atr[i];
/* 293:341 */     ej localej = paramBoolean ? paramej : paramej.d();
/* 294:    */     Object localObject1;
/* 295:    */     Object localObject2;
/* 296:344 */     for (int j = localList2.size() - 1; j >= 0; j--)
/* 297:    */     {
/* 298:345 */       localObject1 = (dt)localList2.get(j);
/* 299:346 */       localObject2 = paramaqu.p((dt)localObject1).c();
/* 300:    */       
/* 301:348 */       ((atr)localObject2).b(paramaqu, (dt)localObject1, paramaqu.p((dt)localObject1), 0);
/* 302:349 */       paramaqu.g((dt)localObject1);
/* 303:    */       
/* 304:351 */       arrayOfatr[(--i)] = localObject2;
/* 305:    */     }
/* 306:    */     Object localObject3;
/* 307:355 */     for (j = localList1.size() - 1; j >= 0; j--)
/* 308:    */     {
/* 309:356 */       localObject1 = (dt)localList1.get(j);
/* 310:357 */       localObject2 = paramaqu.p((dt)localObject1);
/* 311:358 */       localObject3 = ((bec)localObject2).c();
/* 312:359 */       int m = ((atr)localObject3).c((bec)localObject2);
/* 313:    */       
/* 314:361 */       paramaqu.g((dt)localObject1);
/* 315:362 */       localObject1 = ((dt)localObject1).a(localej);
/* 316:    */       
/* 317:364 */       paramaqu.a((dt)localObject1, aty.M.P().a(a, paramej), 4);
/* 318:365 */       paramaqu.a((dt)localObject1, bdx.a((bec)localObject2, paramej, paramBoolean, false));
/* 319:    */       
/* 320:367 */       arrayOfatr[(--i)] = localObject3;
/* 321:    */     }
/* 322:370 */     dt localdt = paramdt.a(paramej);
/* 323:372 */     if (paramBoolean)
/* 324:    */     {
/* 325:373 */       localObject1 = this.M ? bdu.b : bdu.a;
/* 326:374 */       localObject2 = aty.K.P().a(bds.a, paramej).a(bds.b, (Comparable)localObject1);
/* 327:    */       
/* 328:376 */       localObject3 = aty.M.P().a(bdx.a, paramej).a(bdx.b, this.M ? bdu.b : bdu.a);
/* 329:    */       
/* 330:    */ 
/* 331:379 */       paramaqu.a(localdt, (bec)localObject3, 4);
/* 332:380 */       paramaqu.a(localdt, bdx.a((bec)localObject2, paramej, true, false));
/* 333:    */     }
/* 334:384 */     for (int k = localList2.size() - 1; k >= 0; k--) {
/* 335:385 */       paramaqu.c((dt)localList2.get(k), arrayOfatr[(i++)]);
/* 336:    */     }
/* 337:389 */     for (k = localList1.size() - 1; k >= 0; k--) {
/* 338:390 */       paramaqu.c((dt)localList1.get(k), arrayOfatr[(i++)]);
/* 339:    */     }
/* 340:393 */     if (paramBoolean)
/* 341:    */     {
/* 342:395 */       paramaqu.c(localdt, aty.K);
/* 343:396 */       paramaqu.c(paramdt, this);
/* 344:    */     }
/* 345:399 */     return true;
/* 346:    */   }
/* 347:    */   
/* 348:    */   public bec b(bec parambec)
/* 349:    */   {
/* 350:404 */     return P().a(a, ej.b);
/* 351:    */   }
/* 352:    */   
/* 353:    */   public bec a(int paramInt)
/* 354:    */   {
/* 355:409 */     return P().a(a, b(paramInt)).a(b, Boolean.valueOf((paramInt & 0x8) > 0));
/* 356:    */   }
/* 357:    */   
/* 358:    */   public int c(bec parambec)
/* 359:    */   {
/* 360:416 */     int i = 0;
/* 361:    */     
/* 362:418 */     i |= ((ej)parambec.b(a)).a();
/* 363:420 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 364:421 */       i |= 0x8;
/* 365:    */     }
/* 366:424 */     return i;
/* 367:    */   }
/* 368:    */   
/* 369:    */   protected bed e()
/* 370:    */   {
/* 371:429 */     return new bed(this, new bex[] { a, b });
/* 372:    */   }
/* 373:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bdq
 * JD-Core Version:    0.7.0.1
 */