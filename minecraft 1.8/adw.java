/*   1:    */ import java.util.Random;
/*   2:    */ import org.apache.logging.log4j.LogManager;
/*   3:    */ import org.apache.logging.log4j.Logger;
/*   4:    */ 
/*   5:    */ public class adw
/*   6:    */   extends wv
/*   7:    */ {
/*   8: 23 */   private static final Logger b = ;
/*   9:    */   private int c;
/*  10:    */   private int d;
/*  11: 33 */   private int e = 5;
/*  12:    */   private String f;
/*  13:    */   private String g;
/*  14: 36 */   public float a = (float)(Math.random() * 3.141592653589793D * 2.0D);
/*  15:    */   
/*  16:    */   public adw(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  17:    */   {
/*  18: 39 */     super(paramaqu);
/*  19: 40 */     a(0.25F, 0.25F);
/*  20: 41 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  21:    */     
/*  22: 43 */     this.y = ((float)(Math.random() * 360.0D));
/*  23:    */     
/*  24: 45 */     this.v = ((float)(Math.random() * 0.2000000029802322D - 0.1000000014901161D));
/*  25: 46 */     this.w = 0.2000000029802322D;
/*  26: 47 */     this.x = ((float)(Math.random() * 0.2000000029802322D - 0.1000000014901161D));
/*  27:    */   }
/*  28:    */   
/*  29:    */   public adw(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, amj paramamj)
/*  30:    */   {
/*  31: 51 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  32: 52 */     a(paramamj);
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected boolean r_()
/*  36:    */   {
/*  37: 57 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public adw(aqu paramaqu)
/*  41:    */   {
/*  42: 61 */     super(paramaqu);
/*  43: 62 */     a(0.25F, 0.25F);
/*  44: 63 */     a(new amj(aty.a, 0));
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected void h()
/*  48:    */   {
/*  49: 68 */     H().a(10, 5);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void s_()
/*  53:    */   {
/*  54: 73 */     if (l() == null)
/*  55:    */     {
/*  56: 74 */       J();
/*  57: 75 */       return;
/*  58:    */     }
/*  59: 77 */     super.s_();
/*  60: 78 */     if ((this.d > 0) && (this.d != 32767)) {
/*  61: 79 */       this.d -= 1;
/*  62:    */     }
/*  63: 81 */     this.p = this.s;
/*  64: 82 */     this.q = this.t;
/*  65: 83 */     this.r = this.u;
/*  66:    */     
/*  67: 85 */     this.w -= 0.03999999910593033D;
/*  68: 86 */     this.T = j(this.s, (aQ().b + aQ().e) / 2.0D, this.u);
/*  69: 87 */     d(this.v, this.w, this.x);
/*  70:    */     
/*  71: 89 */     int i = ((int)this.p != (int)this.s) || ((int)this.q != (int)this.t) || ((int)this.r != (int)this.u) ? 1 : 0;
/*  72: 91 */     if ((i != 0) || (this.W % 25 == 0))
/*  73:    */     {
/*  74: 92 */       if (this.o.p(new dt(this)).c().r() == bof.i)
/*  75:    */       {
/*  76: 93 */         this.w = 0.2000000029802322D;
/*  77: 94 */         this.v = ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
/*  78: 95 */         this.x = ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
/*  79: 96 */         a("random.fizz", 0.4F, 2.0F + this.V.nextFloat() * 0.4F);
/*  80:    */       }
/*  81: 99 */       if (!this.o.D) {
/*  82:100 */         w();
/*  83:    */       }
/*  84:    */     }
/*  85:104 */     float f1 = 0.98F;
/*  86:105 */     if (this.C) {
/*  87:106 */       f1 = this.o.p(new dt(uv.c(this.s), uv.c(aQ().b) - 1, uv.c(this.u))).c().K * 0.98F;
/*  88:    */     }
/*  89:109 */     this.v *= f1;
/*  90:110 */     this.w *= 0.9800000190734863D;
/*  91:111 */     this.x *= f1;
/*  92:113 */     if (this.C) {
/*  93:114 */       this.w *= -0.5D;
/*  94:    */     }
/*  95:117 */     if (this.c != -32768) {
/*  96:118 */       this.c += 1;
/*  97:    */     }
/*  98:121 */     W();
/*  99:123 */     if ((!this.o.D) && (this.c >= 6000)) {
/* 100:124 */       J();
/* 101:    */     }
/* 102:    */   }
/* 103:    */   
/* 104:    */   private void w()
/* 105:    */   {
/* 106:129 */     for (adw localadw : this.o.a(adw.class, aQ().b(0.5D, 0.0D, 0.5D))) {
/* 107:130 */       a(localadw);
/* 108:    */     }
/* 109:    */   }
/* 110:    */   
/* 111:    */   private boolean a(adw paramadw)
/* 112:    */   {
/* 113:135 */     if (paramadw == this) {
/* 114:136 */       return false;
/* 115:    */     }
/* 116:138 */     if ((!paramadw.ai()) || (!ai())) {
/* 117:139 */       return false;
/* 118:    */     }
/* 119:141 */     amj localamj1 = l();
/* 120:142 */     amj localamj2 = paramadw.l();
/* 121:144 */     if ((this.d == 32767) || (paramadw.d == 32767)) {
/* 122:145 */       return false;
/* 123:    */     }
/* 124:147 */     if ((this.c == -32768) || (paramadw.c == -32768)) {
/* 125:148 */       return false;
/* 126:    */     }
/* 127:150 */     if (localamj2.b() != localamj1.b()) {
/* 128:151 */       return false;
/* 129:    */     }
/* 130:153 */     if ((localamj2.n() ^ localamj1.n())) {
/* 131:154 */       return false;
/* 132:    */     }
/* 133:156 */     if ((localamj2.n()) && (!localamj2.o().equals(localamj1.o()))) {
/* 134:157 */       return false;
/* 135:    */     }
/* 136:159 */     if (localamj2.b() == null) {
/* 137:160 */       return false;
/* 138:    */     }
/* 139:162 */     if ((localamj2.b().k()) && (localamj2.i() != localamj1.i())) {
/* 140:163 */       return false;
/* 141:    */     }
/* 142:165 */     if (localamj2.b < localamj1.b) {
/* 143:166 */       return paramadw.a(this);
/* 144:    */     }
/* 145:168 */     if (localamj2.b + localamj1.b > localamj2.c()) {
/* 146:169 */       return false;
/* 147:    */     }
/* 148:172 */     localamj2.b += localamj1.b;
/* 149:173 */     paramadw.d = Math.max(paramadw.d, this.d);
/* 150:174 */     paramadw.c = Math.min(paramadw.c, this.c);
/* 151:175 */     paramadw.a(localamj2);
/* 152:176 */     J();
/* 153:    */     
/* 154:178 */     return true;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void j()
/* 158:    */   {
/* 159:183 */     this.c = 4800;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public boolean W()
/* 163:    */   {
/* 164:188 */     if (this.o.a(aQ(), bof.h, this))
/* 165:    */     {
/* 166:189 */       if ((!this.Y) && (!this.aa)) {
/* 167:190 */         X();
/* 168:    */       }
/* 169:192 */       this.Y = true;
/* 170:    */     }
/* 171:    */     else
/* 172:    */     {
/* 173:194 */       this.Y = false;
/* 174:    */     }
/* 175:196 */     return this.Y;
/* 176:    */   }
/* 177:    */   
/* 178:    */   protected void f(int paramInt)
/* 179:    */   {
/* 180:201 */     a(wh.a, paramInt);
/* 181:    */   }
/* 182:    */   
/* 183:    */   public boolean a(wh paramwh, float paramFloat)
/* 184:    */   {
/* 185:206 */     if (b(paramwh)) {
/* 186:207 */       return false;
/* 187:    */     }
/* 188:209 */     if ((l() != null) && (l().b() == amk.bZ) && (paramwh.c())) {
/* 189:210 */       return false;
/* 190:    */     }
/* 191:212 */     ac();
/* 192:213 */     this.e = ((int)(this.e - paramFloat));
/* 193:214 */     if (this.e <= 0) {
/* 194:215 */       J();
/* 195:    */     }
/* 196:217 */     return false;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void b(fn paramfn)
/* 200:    */   {
/* 201:222 */     paramfn.a("Health", (short)(byte)this.e);
/* 202:223 */     paramfn.a("Age", (short)this.c);
/* 203:224 */     paramfn.a("PickupDelay", (short)this.d);
/* 204:225 */     if (n() != null) {
/* 205:226 */       paramfn.a("Thrower", this.f);
/* 206:    */     }
/* 207:228 */     if (m() != null) {
/* 208:229 */       paramfn.a("Owner", this.g);
/* 209:    */     }
/* 210:231 */     if (l() != null) {
/* 211:232 */       paramfn.a("Item", l().b(new fn()));
/* 212:    */     }
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void a(fn paramfn)
/* 216:    */   {
/* 217:238 */     this.e = (paramfn.e("Health") & 0xFF);
/* 218:239 */     this.c = paramfn.e("Age");
/* 219:240 */     if (paramfn.c("PickupDelay")) {
/* 220:241 */       this.d = paramfn.e("PickupDelay");
/* 221:    */     }
/* 222:243 */     if (paramfn.c("Owner")) {
/* 223:244 */       this.g = paramfn.j("Owner");
/* 224:    */     }
/* 225:246 */     if (paramfn.c("Thrower")) {
/* 226:247 */       this.f = paramfn.j("Thrower");
/* 227:    */     }
/* 228:249 */     fn localfn = paramfn.m("Item");
/* 229:250 */     a(amj.a(localfn));
/* 230:251 */     if (l() == null) {
/* 231:252 */       J();
/* 232:    */     }
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void d(ahd paramahd)
/* 236:    */   {
/* 237:258 */     if (this.o.D) {
/* 238:259 */       return;
/* 239:    */     }
/* 240:262 */     amj localamj = l();
/* 241:263 */     int i = localamj.b;
/* 242:264 */     if ((this.d == 0) && ((this.g == null) || (6000 - this.c <= 200) || (this.g.equals(paramahd.d_()))) && (paramahd.bg.a(localamj)))
/* 243:    */     {
/* 244:265 */       if (localamj.b() == alq.a(aty.r)) {
/* 245:266 */         paramahd.b(tl.g);
/* 246:    */       }
/* 247:268 */       if (localamj.b() == alq.a(aty.s)) {
/* 248:269 */         paramahd.b(tl.g);
/* 249:    */       }
/* 250:271 */       if (localamj.b() == amk.aF) {
/* 251:272 */         paramahd.b(tl.t);
/* 252:    */       }
/* 253:274 */       if (localamj.b() == amk.i) {
/* 254:275 */         paramahd.b(tl.w);
/* 255:    */       }
/* 256:277 */       if (localamj.b() == amk.bv) {
/* 257:278 */         paramahd.b(tl.A);
/* 258:    */       }
/* 259:280 */       if ((localamj.b() == amk.i) && (n() != null))
/* 260:    */       {
/* 261:281 */         ahd localahd = this.o.a(n());
/* 262:282 */         if ((localahd != null) && (localahd != paramahd)) {
/* 263:283 */           localahd.b(tl.x);
/* 264:    */         }
/* 265:    */       }
/* 266:286 */       if (!R()) {
/* 267:287 */         this.o.a(paramahd, "random.pop", 0.2F, ((this.V.nextFloat() - this.V.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 268:    */       }
/* 269:289 */       paramahd.a(this, i);
/* 270:290 */       if (localamj.b <= 0) {
/* 271:291 */         J();
/* 272:    */       }
/* 273:    */     }
/* 274:    */   }
/* 275:    */   
/* 276:    */   public String d_()
/* 277:    */   {
/* 278:298 */     if (k_()) {
/* 279:299 */       return aL();
/* 280:    */     }
/* 281:302 */     return fi.a("item." + l().a());
/* 282:    */   }
/* 283:    */   
/* 284:    */   public boolean aE()
/* 285:    */   {
/* 286:307 */     return false;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void c(int paramInt)
/* 290:    */   {
/* 291:312 */     super.c(paramInt);
/* 292:314 */     if (!this.o.D) {
/* 293:315 */       w();
/* 294:    */     }
/* 295:    */   }
/* 296:    */   
/* 297:    */   public amj l()
/* 298:    */   {
/* 299:320 */     amj localamj = H().f(10);
/* 300:322 */     if (localamj == null)
/* 301:    */     {
/* 302:323 */       if (this.o != null) {
/* 303:324 */         b.error("Item entity " + F() + " has no item?!");
/* 304:    */       }
/* 305:326 */       return new amj(aty.b);
/* 306:    */     }
/* 307:329 */     return localamj;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public void a(amj paramamj)
/* 311:    */   {
/* 312:333 */     H().b(10, paramamj);
/* 313:334 */     H().i(10);
/* 314:    */   }
/* 315:    */   
/* 316:    */   public String m()
/* 317:    */   {
/* 318:338 */     return this.g;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public void b(String paramString)
/* 322:    */   {
/* 323:342 */     this.g = paramString;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public String n()
/* 327:    */   {
/* 328:346 */     return this.f;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public void c(String paramString)
/* 332:    */   {
/* 333:350 */     this.f = paramString;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public int o()
/* 337:    */   {
/* 338:354 */     return this.c;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public void p()
/* 342:    */   {
/* 343:358 */     this.d = 10;
/* 344:    */   }
/* 345:    */   
/* 346:    */   public void q()
/* 347:    */   {
/* 348:362 */     this.d = 0;
/* 349:    */   }
/* 350:    */   
/* 351:    */   public void r()
/* 352:    */   {
/* 353:366 */     this.d = 32767;
/* 354:    */   }
/* 355:    */   
/* 356:    */   public void a(int paramInt)
/* 357:    */   {
/* 358:370 */     this.d = paramInt;
/* 359:    */   }
/* 360:    */   
/* 361:    */   public boolean s()
/* 362:    */   {
/* 363:374 */     return this.d > 0;
/* 364:    */   }
/* 365:    */   
/* 366:    */   public void u()
/* 367:    */   {
/* 368:382 */     this.c = -6000;
/* 369:    */   }
/* 370:    */   
/* 371:    */   public void v()
/* 372:    */   {
/* 373:386 */     r();
/* 374:387 */     this.c = 5999;
/* 375:    */   }
/* 376:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adw
 * JD-Core Version:    0.7.0.1
 */