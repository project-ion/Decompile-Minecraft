/*   1:    */ import com.google.common.collect.Sets;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Random;
/*   5:    */ import java.util.Set;
/*   6:    */ 
/*   7:    */ public class cen
/*   8:    */   extends aqu
/*   9:    */ {
/*  10:    */   private cee a;
/*  11:    */   private cel b;
/*  12: 45 */   private final Set c = Sets.newHashSet();
/*  13: 46 */   private final Set d = Sets.newHashSet();
/*  14: 47 */   private final bsu I = bsu.z();
/*  15: 48 */   private final Set J = Sets.newHashSet();
/*  16:    */   
/*  17:    */   public cen(cee paramcee, arb paramarb, int paramInt, vt paramvt, uw paramuw)
/*  18:    */   {
/*  19: 52 */     super(new brk(), new bqo(paramarb, "MpServer"), bgd.a(paramInt), paramuw, true);
/*  20:    */     
/*  21: 54 */     this.a = paramcee;
/*  22: 55 */     P().a(paramvt);
/*  23: 56 */     B(new dt(8, 64, 8));
/*  24:    */     
/*  25: 58 */     this.t.a(this);
/*  26: 59 */     this.v = k();
/*  27:    */     
/*  28: 61 */     this.z = new brm();
/*  29: 62 */     B();
/*  30: 63 */     C();
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void c()
/*  34:    */   {
/*  35: 68 */     super.c();
/*  36: 69 */     a(K() + 1L);
/*  37: 70 */     if (Q().b("doDaylightCycle")) {
/*  38: 71 */       b(L() + 1L);
/*  39:    */     }
/*  40: 74 */     this.B.a("reEntryProcessing");
/*  41: 75 */     for (int i = 0; (i < 10) && (!this.d.isEmpty()); i++)
/*  42:    */     {
/*  43: 76 */       wv localwv = (wv)this.d.iterator().next();
/*  44: 77 */       this.d.remove(localwv);
/*  45: 78 */       if (!this.f.contains(localwv)) {
/*  46: 79 */         d(localwv);
/*  47:    */       }
/*  48:    */     }
/*  49: 83 */     this.B.c("chunkCache");
/*  50: 84 */     this.b.d();
/*  51:    */     
/*  52: 86 */     this.B.c("blocks");
/*  53: 87 */     h();
/*  54:    */     
/*  55: 89 */     this.B.b();
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/*  59:    */   
/*  60:    */   protected bfe k()
/*  61:    */   {
/*  62: 97 */     this.b = new cel(this);
/*  63: 98 */     return this.b;
/*  64:    */   }
/*  65:    */   
/*  66:    */   protected void h()
/*  67:    */   {
/*  68:103 */     super.h();
/*  69:    */     
/*  70:105 */     this.J.retainAll(this.E);
/*  71:106 */     if (this.J.size() == this.E.size()) {
/*  72:107 */       this.J.clear();
/*  73:    */     }
/*  74:110 */     int i = 0;
/*  75:112 */     for (aqm localaqm : this.E) {
/*  76:113 */       if (!this.J.contains(localaqm))
/*  77:    */       {
/*  78:116 */         int j = localaqm.a * 16;
/*  79:117 */         int k = localaqm.b * 16;
/*  80:    */         
/*  81:119 */         this.B.a("getChunk");
/*  82:120 */         bfh localbfh = a(localaqm.a, localaqm.b);
/*  83:    */         
/*  84:122 */         a(j, k, localbfh);
/*  85:    */         
/*  86:124 */         this.B.b();
/*  87:    */         
/*  88:126 */         this.J.add(localaqm);
/*  89:127 */         i++;
/*  90:127 */         if (i >= 10) {
/*  91:128 */           return;
/*  92:    */         }
/*  93:    */       }
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void b(int paramInt1, int paramInt2, boolean paramBoolean)
/*  98:    */   {
/*  99:134 */     if (paramBoolean) {
/* 100:135 */       this.b.c(paramInt1, paramInt2);
/* 101:    */     } else {
/* 102:137 */       this.b.b(paramInt1, paramInt2);
/* 103:    */     }
/* 104:139 */     if (!paramBoolean) {
/* 105:140 */       b(paramInt1 * 16, 0, paramInt2 * 16, paramInt1 * 16 + 15, 256, paramInt2 * 16 + 15);
/* 106:    */     }
/* 107:    */   }
/* 108:    */   
/* 109:    */   public boolean d(wv paramwv)
/* 110:    */   {
/* 111:146 */     boolean bool = super.d(paramwv);
/* 112:147 */     this.c.add(paramwv);
/* 113:149 */     if (!bool) {
/* 114:150 */       this.d.add(paramwv);
/* 115:152 */     } else if ((paramwv instanceof adx)) {
/* 116:153 */       this.I.U().a(new cxw((adx)paramwv));
/* 117:    */     }
/* 118:157 */     return bool;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void e(wv paramwv)
/* 122:    */   {
/* 123:162 */     super.e(paramwv);
/* 124:163 */     this.c.remove(paramwv);
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected void a(wv paramwv)
/* 128:    */   {
/* 129:168 */     super.a(paramwv);
/* 130:169 */     if (this.d.contains(paramwv)) {
/* 131:170 */       this.d.remove(paramwv);
/* 132:    */     }
/* 133:    */   }
/* 134:    */   
/* 135:    */   protected void b(wv paramwv)
/* 136:    */   {
/* 137:176 */     super.b(paramwv);
/* 138:177 */     int i = 0;
/* 139:178 */     if (this.c.contains(paramwv)) {
/* 140:179 */       if (paramwv.ai())
/* 141:    */       {
/* 142:180 */         this.d.add(paramwv);
/* 143:181 */         i = 1;
/* 144:    */       }
/* 145:    */       else
/* 146:    */       {
/* 147:183 */         this.c.remove(paramwv);
/* 148:    */       }
/* 149:    */     }
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void a(int paramInt, wv paramwv)
/* 153:    */   {
/* 154:189 */     wv localwv = a(paramInt);
/* 155:190 */     if (localwv != null) {
/* 156:191 */       e(localwv);
/* 157:    */     }
/* 158:194 */     this.c.add(paramwv);
/* 159:195 */     paramwv.d(paramInt);
/* 160:196 */     if (!d(paramwv)) {
/* 161:197 */       this.d.add(paramwv);
/* 162:    */     }
/* 163:199 */     this.l.a(paramInt, paramwv);
/* 164:    */   }
/* 165:    */   
/* 166:    */   public wv a(int paramInt)
/* 167:    */   {
/* 168:205 */     if (paramInt == this.I.h.F()) {
/* 169:206 */       return this.I.h;
/* 170:    */     }
/* 171:208 */     return super.a(paramInt);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public wv d(int paramInt)
/* 175:    */   {
/* 176:212 */     wv localwv = (wv)this.l.d(paramInt);
/* 177:213 */     if (localwv != null)
/* 178:    */     {
/* 179:214 */       this.c.remove(localwv);
/* 180:215 */       e(localwv);
/* 181:    */     }
/* 182:217 */     return localwv;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public boolean b(dt paramdt, bec parambec)
/* 186:    */   {
/* 187:222 */     int i = paramdt.n();
/* 188:223 */     int j = paramdt.o();
/* 189:224 */     int k = paramdt.p();
/* 190:225 */     a(i, j, k, i, j, k);
/* 191:    */     
/* 192:227 */     return super.a(paramdt, parambec, 3);
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void H()
/* 196:    */   {
/* 197:232 */     this.a.a().a(new hy("Quitting"));
/* 198:    */   }
/* 199:    */   
/* 200:    */   protected void p() {}
/* 201:    */   
/* 202:    */   protected int q()
/* 203:    */   {
/* 204:241 */     return this.I.t.c;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void b(int paramInt1, int paramInt2, int paramInt3)
/* 208:    */   {
/* 209:245 */     int i = 16;
/* 210:246 */     Random localRandom = new Random();
/* 211:    */     
/* 212:248 */     amj localamj = this.I.h.bz();
/* 213:249 */     int j = (this.I.c.l() == arc.c) && (localamj != null) && (atr.a(localamj.b()) == aty.cv) ? 1 : 0;
/* 214:251 */     for (int k = 0; k < 1000; k++)
/* 215:    */     {
/* 216:252 */       int m = paramInt1 + this.s.nextInt(i) - this.s.nextInt(i);
/* 217:253 */       int n = paramInt2 + this.s.nextInt(i) - this.s.nextInt(i);
/* 218:254 */       int i1 = paramInt3 + this.s.nextInt(i) - this.s.nextInt(i);
/* 219:    */       
/* 220:256 */       dt localdt = new dt(m, n, i1);
/* 221:257 */       bec localbec = p(localdt);
/* 222:258 */       localbec.c().c(this, localdt, localbec, localRandom);
/* 223:260 */       if ((j != 0) && (localbec.c() == aty.cv)) {
/* 224:261 */         a(ew.J, m + 0.5F, n + 0.5F, i1 + 0.5F, 0.0D, 0.0D, 0.0D, new int[0]);
/* 225:    */       }
/* 226:    */     }
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void a()
/* 230:    */   {
/* 231:267 */     this.f.removeAll(this.g);
/* 232:    */     wv localwv;
/* 233:    */     int j;
/* 234:    */     int k;
/* 235:268 */     for (int i = 0; i < this.g.size(); i++)
/* 236:    */     {
/* 237:269 */       localwv = (wv)this.g.get(i);
/* 238:270 */       j = localwv.ae;
/* 239:271 */       k = localwv.ag;
/* 240:272 */       if ((localwv.ad) && (a(j, k, true))) {
/* 241:273 */         a(j, k).b(localwv);
/* 242:    */       }
/* 243:    */     }
/* 244:277 */     for (i = 0; i < this.g.size(); i++) {
/* 245:278 */       b((wv)this.g.get(i));
/* 246:    */     }
/* 247:280 */     this.g.clear();
/* 248:282 */     for (i = 0; i < this.f.size(); i++)
/* 249:    */     {
/* 250:283 */       localwv = (wv)this.f.get(i);
/* 251:285 */       if (localwv.m != null)
/* 252:    */       {
/* 253:286 */         if ((localwv.m.I) || (localwv.m.l != localwv))
/* 254:    */         {
/* 255:287 */           localwv.m.l = null;
/* 256:288 */           localwv.m = null;
/* 257:    */         }
/* 258:    */       }
/* 259:294 */       else if (localwv.I)
/* 260:    */       {
/* 261:295 */         j = localwv.ae;
/* 262:296 */         k = localwv.ag;
/* 263:297 */         if ((localwv.ad) && (a(j, k, true))) {
/* 264:298 */           a(j, k).b(localwv);
/* 265:    */         }
/* 266:300 */         this.f.remove(i--);
/* 267:301 */         b(localwv);
/* 268:    */       }
/* 269:    */     }
/* 270:    */   }
/* 271:    */   
/* 272:    */   public j a(b paramb)
/* 273:    */   {
/* 274:308 */     j localj = super.a(paramb);
/* 275:    */     
/* 276:310 */     localj.a("Forced entities", new ceo(this));
/* 277:    */     
/* 278:    */ 
/* 279:    */ 
/* 280:    */ 
/* 281:    */ 
/* 282:    */ 
/* 283:317 */     localj.a("Retry entities", new cep(this));
/* 284:    */     
/* 285:    */ 
/* 286:    */ 
/* 287:    */ 
/* 288:    */ 
/* 289:    */ 
/* 290:324 */     localj.a("Server brand", new ceq(this));
/* 291:    */     
/* 292:    */ 
/* 293:    */ 
/* 294:    */ 
/* 295:    */ 
/* 296:    */ 
/* 297:331 */     localj.a("Server type", new cer(this));
/* 298:    */     
/* 299:    */ 
/* 300:    */ 
/* 301:    */ 
/* 302:    */ 
/* 303:    */ 
/* 304:338 */     return localj;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public void a(dt paramdt, String paramString, float paramFloat1, float paramFloat2, boolean paramBoolean)
/* 308:    */   {
/* 309:342 */     a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, paramString, paramFloat1, paramFloat2, paramBoolean);
/* 310:    */   }
/* 311:    */   
/* 312:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2, boolean paramBoolean)
/* 313:    */   {
/* 314:347 */     double d1 = this.I.aa().e(paramDouble1, paramDouble2, paramDouble3);
/* 315:348 */     cxy localcxy = new cxy(new oa(paramString), paramFloat1, paramFloat2, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 316:350 */     if ((paramBoolean) && (d1 > 100.0D))
/* 317:    */     {
/* 318:352 */       double d2 = Math.sqrt(d1) / 40.0D;
/* 319:353 */       this.I.U().a(localcxy, (int)(d2 * 20.0D));
/* 320:    */     }
/* 321:    */     else
/* 322:    */     {
/* 323:355 */       this.I.U().a(localcxy);
/* 324:    */     }
/* 325:    */   }
/* 326:    */   
/* 327:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, fn paramfn)
/* 328:    */   {
/* 329:361 */     this.I.j.a(new cga(this, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, this.I.j, paramfn));
/* 330:    */   }
/* 331:    */   
/* 332:    */   public void a(bsd parambsd)
/* 333:    */   {
/* 334:365 */     this.C = parambsd;
/* 335:    */   }
/* 336:    */   
/* 337:    */   public void b(long paramLong)
/* 338:    */   {
/* 339:370 */     if (paramLong < 0L)
/* 340:    */     {
/* 341:371 */       paramLong = -paramLong;
/* 342:372 */       Q().a("doDaylightCycle", "false");
/* 343:    */     }
/* 344:    */     else
/* 345:    */     {
/* 346:374 */       Q().a("doDaylightCycle", "true");
/* 347:    */     }
/* 348:376 */     super.b(paramLong);
/* 349:    */   }
/* 350:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cen
 * JD-Core Version:    0.7.0.1
 */