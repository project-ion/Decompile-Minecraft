/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class awd
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 26 */   public static final bew a = bew.a("legacy_data", 0, 15);
/*   7: 27 */   public static final bev b = bev.a("contents", awf.class);
/*   8:    */   
/*   9:    */   public awd()
/*  10:    */   {
/*  11: 30 */     super(bof.q);
/*  12: 31 */     j(this.L.b().a(b, awf.a).a(a, Integer.valueOf(0)));
/*  13: 32 */     h();
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void h()
/*  17:    */   {
/*  18: 37 */     float f1 = 0.375F;
/*  19: 38 */     float f2 = f1 / 2.0F;
/*  20: 39 */     a(0.5F - f2, 0.0F, 0.5F - f2, 0.5F + f2, f1, 0.5F + f2);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean c()
/*  24:    */   {
/*  25: 44 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public int b()
/*  29:    */   {
/*  30: 49 */     return 3;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean d()
/*  34:    */   {
/*  35: 54 */     return false;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public int a(ard paramard, dt paramdt, int paramInt)
/*  39:    */   {
/*  40: 59 */     bcm localbcm = paramard.s(paramdt);
/*  41: 60 */     if ((localbcm instanceof bdb))
/*  42:    */     {
/*  43: 61 */       alq localalq = ((bdb)localbcm).b();
/*  44: 63 */       if ((localalq instanceof aju)) {
/*  45: 64 */         return atr.a(localalq).a(paramard, paramdt, paramInt);
/*  46:    */       }
/*  47:    */     }
/*  48: 68 */     return 16777215;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  52:    */   {
/*  53: 73 */     amj localamj = paramahd.bg.h();
/*  54: 74 */     if ((localamj == null) || (!(localamj.b() instanceof aju))) {
/*  55: 75 */       return false;
/*  56:    */     }
/*  57: 78 */     bdb localbdb = d(paramaqu, paramdt);
/*  58: 79 */     if (localbdb == null) {
/*  59: 80 */       return false;
/*  60:    */     }
/*  61: 83 */     if (localbdb.b() != null) {
/*  62: 84 */       return false;
/*  63:    */     }
/*  64: 87 */     atr localatr = atr.a(localamj.b());
/*  65: 88 */     if (!a(localatr, localamj.i())) {
/*  66: 89 */       return false;
/*  67:    */     }
/*  68: 91 */     localbdb.a(localamj.b(), localamj.i());
/*  69: 92 */     localbdb.o_();
/*  70: 93 */     paramaqu.h(paramdt);
/*  71: 95 */     if (!paramahd.by.d) {
/*  72: 96 */       if (--localamj.b <= 0) {
/*  73: 97 */         paramahd.bg.a(paramahd.bg.c, null);
/*  74:    */       }
/*  75:    */     }
/*  76:101 */     return true;
/*  77:    */   }
/*  78:    */   
/*  79:    */   private boolean a(atr paramatr, int paramInt)
/*  80:    */   {
/*  81:105 */     if ((paramatr == aty.N) || (paramatr == aty.O) || (paramatr == aty.aK) || (paramatr == aty.P) || (paramatr == aty.Q) || (paramatr == aty.g) || (paramatr == aty.I)) {
/*  82:106 */       return true;
/*  83:    */     }
/*  84:108 */     if ((paramatr == aty.H) && (paramInt == bbi.c.a())) {
/*  85:109 */       return true;
/*  86:    */     }
/*  87:111 */     return false;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public alq b(aqu paramaqu, dt paramdt)
/*  91:    */   {
/*  92:116 */     bdb localbdb = d(paramaqu, paramdt);
/*  93:117 */     if ((localbdb != null) && (localbdb.b() != null)) {
/*  94:118 */       return localbdb.b();
/*  95:    */     }
/*  96:121 */     return amk.bQ;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public int j(aqu paramaqu, dt paramdt)
/* 100:    */   {
/* 101:126 */     bdb localbdb = d(paramaqu, paramdt);
/* 102:127 */     if ((localbdb != null) && (localbdb.b() != null)) {
/* 103:128 */       return localbdb.c();
/* 104:    */     }
/* 105:131 */     return 0;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean L()
/* 109:    */   {
/* 110:136 */     return true;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean c(aqu paramaqu, dt paramdt)
/* 114:    */   {
/* 115:141 */     return (super.c(paramaqu, paramdt)) && (aqu.a(paramaqu, paramdt.b()));
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 119:    */   {
/* 120:146 */     if (!aqu.a(paramaqu, paramdt.b()))
/* 121:    */     {
/* 122:147 */       b(paramaqu, paramdt, parambec, 0);
/* 123:    */       
/* 124:149 */       paramaqu.g(paramdt);
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 129:    */   {
/* 130:157 */     bdb localbdb = d(paramaqu, paramdt);
/* 131:158 */     if ((localbdb != null) && (localbdb.b() != null)) {
/* 132:159 */       a(paramaqu, paramdt, new amj(localbdb.b(), 1, localbdb.c()));
/* 133:    */     }
/* 134:161 */     super.b(paramaqu, paramdt, parambec);
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd)
/* 138:    */   {
/* 139:166 */     super.a(paramaqu, paramdt, parambec, paramahd);
/* 140:168 */     if (paramahd.by.d)
/* 141:    */     {
/* 142:169 */       bdb localbdb = d(paramaqu, paramdt);
/* 143:170 */       if (localbdb != null) {
/* 144:172 */         localbdb.a(null, 0);
/* 145:    */       }
/* 146:    */     }
/* 147:    */   }
/* 148:    */   
/* 149:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 150:    */   {
/* 151:180 */     return amk.bQ;
/* 152:    */   }
/* 153:    */   
/* 154:    */   private bdb d(aqu paramaqu, dt paramdt)
/* 155:    */   {
/* 156:185 */     bcm localbcm = paramaqu.s(paramdt);
/* 157:186 */     if ((localbcm instanceof bdb)) {
/* 158:187 */       return (bdb)localbcm;
/* 159:    */     }
/* 160:190 */     return null;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public bcm a(aqu paramaqu, int paramInt)
/* 164:    */   {
/* 165:196 */     Object localObject = null;
/* 166:197 */     int i = 0;
/* 167:198 */     switch (paramInt)
/* 168:    */     {
/* 169:    */     default: 
/* 170:    */       break;
/* 171:    */     case 1: 
/* 172:202 */       localObject = aty.O;
/* 173:203 */       i = awa.b.b();
/* 174:204 */       break;
/* 175:    */     case 2: 
/* 176:206 */       localObject = aty.N;
/* 177:207 */       break;
/* 178:    */     case 3: 
/* 179:209 */       localObject = aty.g;
/* 180:210 */       i = ayx.a.a();
/* 181:211 */       break;
/* 182:    */     case 4: 
/* 183:213 */       localObject = aty.g;
/* 184:214 */       i = ayx.b.a();
/* 185:215 */       break;
/* 186:    */     case 5: 
/* 187:217 */       localObject = aty.g;
/* 188:218 */       i = ayx.c.a();
/* 189:219 */       break;
/* 190:    */     case 6: 
/* 191:221 */       localObject = aty.g;
/* 192:222 */       i = ayx.d.a();
/* 193:223 */       break;
/* 194:    */     case 12: 
/* 195:225 */       localObject = aty.g;
/* 196:226 */       i = ayx.e.a();
/* 197:227 */       break;
/* 198:    */     case 13: 
/* 199:229 */       localObject = aty.g;
/* 200:230 */       i = ayx.f.a();
/* 201:231 */       break;
/* 202:    */     case 7: 
/* 203:233 */       localObject = aty.Q;
/* 204:234 */       break;
/* 205:    */     case 8: 
/* 206:236 */       localObject = aty.P;
/* 207:237 */       break;
/* 208:    */     case 9: 
/* 209:239 */       localObject = aty.aK;
/* 210:240 */       break;
/* 211:    */     case 10: 
/* 212:242 */       localObject = aty.I;
/* 213:243 */       break;
/* 214:    */     case 11: 
/* 215:245 */       localObject = aty.H;
/* 216:246 */       i = bbi.c.a();
/* 217:    */     }
/* 218:249 */     return new bdb(alq.a((atr)localObject), i);
/* 219:    */   }
/* 220:    */   
/* 221:    */   protected bed e()
/* 222:    */   {
/* 223:254 */     return new bed(this, new bex[] { b, a });
/* 224:    */   }
/* 225:    */   
/* 226:    */   public int c(bec parambec)
/* 227:    */   {
/* 228:259 */     return ((Integer)parambec.b(a)).intValue();
/* 229:    */   }
/* 230:    */   
/* 231:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/* 232:    */   {
/* 233:264 */     awf localawf = awf.a;
/* 234:    */     
/* 235:266 */     bcm localbcm = paramard.s(paramdt);
/* 236:267 */     if ((localbcm instanceof bdb))
/* 237:    */     {
/* 238:268 */       bdb localbdb = (bdb)localbcm;
/* 239:269 */       alq localalq = localbdb.b();
/* 240:271 */       if ((localalq instanceof aju))
/* 241:    */       {
/* 242:272 */         int i = localbdb.c();
/* 243:273 */         atr localatr = atr.a(localalq);
/* 244:274 */         if (localatr == aty.g) {
/* 245:275 */           switch (awe.a[ayx.a(i).ordinal()])
/* 246:    */           {
/* 247:    */           case 1: 
/* 248:277 */             localawf = awf.l;
/* 249:278 */             break;
/* 250:    */           case 2: 
/* 251:280 */             localawf = awf.m;
/* 252:281 */             break;
/* 253:    */           case 3: 
/* 254:283 */             localawf = awf.n;
/* 255:284 */             break;
/* 256:    */           case 4: 
/* 257:286 */             localawf = awf.o;
/* 258:287 */             break;
/* 259:    */           case 5: 
/* 260:289 */             localawf = awf.p;
/* 261:290 */             break;
/* 262:    */           case 6: 
/* 263:292 */             localawf = awf.q;
/* 264:293 */             break;
/* 265:    */           default: 
/* 266:295 */             localawf = awf.a; break;
/* 267:    */           }
/* 268:297 */         } else if (localatr == aty.H) {
/* 269:298 */           switch (i)
/* 270:    */           {
/* 271:    */           case 0: 
/* 272:300 */             localawf = awf.t;
/* 273:301 */             break;
/* 274:    */           case 2: 
/* 275:303 */             localawf = awf.u;
/* 276:304 */             break;
/* 277:    */           default: 
/* 278:306 */             localawf = awf.a; break;
/* 279:    */           }
/* 280:308 */         } else if (localatr == aty.N) {
/* 281:309 */           localawf = awf.k;
/* 282:310 */         } else if (localatr == aty.O) {
/* 283:311 */           switch (awe.b[awa.a(awc.b, i).ordinal()])
/* 284:    */           {
/* 285:    */           case 1: 
/* 286:313 */             localawf = awf.b;
/* 287:314 */             break;
/* 288:    */           case 2: 
/* 289:316 */             localawf = awf.c;
/* 290:317 */             break;
/* 291:    */           case 3: 
/* 292:319 */             localawf = awf.d;
/* 293:320 */             break;
/* 294:    */           case 4: 
/* 295:322 */             localawf = awf.e;
/* 296:323 */             break;
/* 297:    */           case 5: 
/* 298:325 */             localawf = awf.f;
/* 299:326 */             break;
/* 300:    */           case 6: 
/* 301:328 */             localawf = awf.g;
/* 302:329 */             break;
/* 303:    */           case 7: 
/* 304:331 */             localawf = awf.h;
/* 305:332 */             break;
/* 306:    */           case 8: 
/* 307:334 */             localawf = awf.i;
/* 308:335 */             break;
/* 309:    */           case 9: 
/* 310:337 */             localawf = awf.j;
/* 311:338 */             break;
/* 312:    */           default: 
/* 313:340 */             localawf = awf.a; break;
/* 314:    */           }
/* 315:342 */         } else if (localatr == aty.Q) {
/* 316:343 */           localawf = awf.r;
/* 317:344 */         } else if (localatr == aty.P) {
/* 318:345 */           localawf = awf.s;
/* 319:346 */         } else if (localatr == aty.I) {
/* 320:347 */           localawf = awf.t;
/* 321:348 */         } else if (localatr == aty.aK) {
/* 322:349 */           localawf = awf.v;
/* 323:    */         }
/* 324:    */       }
/* 325:    */     }
/* 326:354 */     return parambec.a(b, localawf);
/* 327:    */   }
/* 328:    */   
/* 329:    */   public aql k()
/* 330:    */   {
/* 331:401 */     return aql.c;
/* 332:    */   }
/* 333:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     awd
 * JD-Core Version:    0.7.0.1
 */