/*   1:    */ import net.minecraft.server.MinecraftServer;
/*   2:    */ 
/*   3:    */ public class qx
/*   4:    */ {
/*   5:    */   public aqu a;
/*   6:    */   public qw b;
/*   7: 26 */   private arc c = arc.a;
/*   8:    */   private boolean d;
/*   9:    */   private int e;
/*  10: 30 */   private dt f = dt.a;
/*  11:    */   private int g;
/*  12:    */   private boolean h;
/*  13: 34 */   private dt i = dt.a;
/*  14:    */   private int j;
/*  15: 36 */   private int k = -1;
/*  16:    */   
/*  17:    */   public qx(aqu paramaqu)
/*  18:    */   {
/*  19: 39 */     this.a = paramaqu;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(arc paramarc)
/*  23:    */   {
/*  24: 43 */     this.c = paramarc;
/*  25:    */     
/*  26: 45 */     paramarc.a(this.b.by);
/*  27:    */     
/*  28: 47 */     this.b.t();
/*  29: 48 */     this.b.b.an().a(new kh(kj.b, new qw[] { this.b }));
/*  30:    */   }
/*  31:    */   
/*  32:    */   public arc b()
/*  33:    */   {
/*  34: 52 */     return this.c;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean c()
/*  38:    */   {
/*  39: 56 */     return this.c.e();
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean d()
/*  43:    */   {
/*  44: 60 */     return this.c.d();
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void b(arc paramarc)
/*  48:    */   {
/*  49: 64 */     if (this.c == arc.a) {
/*  50: 65 */       this.c = paramarc;
/*  51:    */     }
/*  52: 67 */     a(this.c);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a()
/*  56:    */   {
/*  57: 71 */     this.g += 1;
/*  58:    */     float f1;
/*  59:    */     int i1;
/*  60: 73 */     if (this.h)
/*  61:    */     {
/*  62: 74 */       int m = this.g - this.j;
/*  63: 75 */       atr localatr2 = this.a.p(this.i).c();
/*  64: 76 */       if (localatr2.r() == bof.a)
/*  65:    */       {
/*  66: 77 */         this.h = false;
/*  67:    */       }
/*  68:    */       else
/*  69:    */       {
/*  70: 79 */         f1 = localatr2.a(this.b, this.b.o, this.i) * (m + 1);
/*  71: 80 */         i1 = (int)(f1 * 10.0F);
/*  72: 82 */         if (i1 != this.k)
/*  73:    */         {
/*  74: 83 */           this.a.c(this.b.F(), this.i, i1);
/*  75: 84 */           this.k = i1;
/*  76:    */         }
/*  77: 87 */         if (f1 >= 1.0F)
/*  78:    */         {
/*  79: 88 */           this.h = false;
/*  80: 89 */           b(this.i);
/*  81:    */         }
/*  82:    */       }
/*  83:    */     }
/*  84: 92 */     else if (this.d)
/*  85:    */     {
/*  86: 93 */       atr localatr1 = this.a.p(this.f).c();
/*  87: 95 */       if (localatr1.r() == bof.a)
/*  88:    */       {
/*  89: 96 */         this.a.c(this.b.F(), this.f, -1);
/*  90: 97 */         this.k = -1;
/*  91: 98 */         this.d = false;
/*  92:    */       }
/*  93:    */       else
/*  94:    */       {
/*  95:100 */         int n = this.g - this.e;
/*  96:101 */         f1 = localatr1.a(this.b, this.b.o, this.i) * (n + 1);
/*  97:102 */         i1 = (int)(f1 * 10.0F);
/*  98:104 */         if (i1 != this.k)
/*  99:    */         {
/* 100:105 */           this.a.c(this.b.F(), this.f, i1);
/* 101:106 */           this.k = i1;
/* 102:    */         }
/* 103:    */       }
/* 104:    */     }
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void a(dt paramdt, ej paramej)
/* 108:    */   {
/* 109:113 */     if (d())
/* 110:    */     {
/* 111:114 */       if (!this.a.a(null, paramdt, paramej)) {
/* 112:115 */         b(paramdt);
/* 113:    */       }
/* 114:117 */       return;
/* 115:    */     }
/* 116:120 */     atr localatr = this.a.p(paramdt).c();
/* 117:121 */     if (this.c.c())
/* 118:    */     {
/* 119:122 */       if (this.c == arc.e) {
/* 120:123 */         return;
/* 121:    */       }
/* 122:125 */       if (!this.b.cm())
/* 123:    */       {
/* 124:126 */         amj localamj = this.b.bY();
/* 125:127 */         if (localamj == null) {
/* 126:128 */           return;
/* 127:    */         }
/* 128:130 */         if (!localamj.c(localatr)) {
/* 129:131 */           return;
/* 130:    */         }
/* 131:    */       }
/* 132:    */     }
/* 133:136 */     this.a.a(null, paramdt, paramej);
/* 134:137 */     this.e = this.g;
/* 135:138 */     float f1 = 1.0F;
/* 136:139 */     if (localatr.r() != bof.a)
/* 137:    */     {
/* 138:140 */       localatr.a(this.a, paramdt, this.b);
/* 139:141 */       f1 = localatr.a(this.b, this.b.o, paramdt);
/* 140:    */     }
/* 141:144 */     if ((localatr.r() != bof.a) && (f1 >= 1.0F))
/* 142:    */     {
/* 143:145 */       b(paramdt);
/* 144:    */     }
/* 145:    */     else
/* 146:    */     {
/* 147:147 */       this.d = true;
/* 148:148 */       this.f = paramdt;
/* 149:    */       
/* 150:150 */       int m = (int)(f1 * 10.0F);
/* 151:151 */       this.a.c(this.b.F(), paramdt, m);
/* 152:152 */       this.k = m;
/* 153:    */     }
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void a(dt paramdt)
/* 157:    */   {
/* 158:157 */     if (paramdt.equals(this.f))
/* 159:    */     {
/* 160:158 */       int m = this.g - this.e;
/* 161:    */       
/* 162:160 */       atr localatr = this.a.p(paramdt).c();
/* 163:161 */       if (localatr.r() != bof.a)
/* 164:    */       {
/* 165:162 */         float f1 = localatr.a(this.b, this.b.o, paramdt) * (m + 1);
/* 166:163 */         if (f1 >= 0.7F)
/* 167:    */         {
/* 168:164 */           this.d = false;
/* 169:165 */           this.a.c(this.b.F(), paramdt, -1);
/* 170:166 */           b(paramdt);
/* 171:    */         }
/* 172:167 */         else if (!this.h)
/* 173:    */         {
/* 174:168 */           this.d = false;
/* 175:169 */           this.h = true;
/* 176:170 */           this.i = paramdt;
/* 177:171 */           this.j = this.e;
/* 178:    */         }
/* 179:    */       }
/* 180:    */     }
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void e()
/* 184:    */   {
/* 185:178 */     this.d = false;
/* 186:    */     
/* 187:180 */     this.a.c(this.b.F(), this.f, -1);
/* 188:    */   }
/* 189:    */   
/* 190:    */   private boolean c(dt paramdt)
/* 191:    */   {
/* 192:184 */     bec localbec = this.a.p(paramdt);
/* 193:    */     
/* 194:186 */     localbec.c().a(this.a, paramdt, localbec, this.b);
/* 195:    */     
/* 196:188 */     boolean bool = this.a.g(paramdt);
/* 197:189 */     if (bool) {
/* 198:190 */       localbec.c().d(this.a, paramdt, localbec);
/* 199:    */     }
/* 200:192 */     return bool;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public boolean b(dt paramdt)
/* 204:    */   {
/* 205:196 */     if ((this.c.d()) && 
/* 206:197 */       (this.b.bz() != null) && ((this.b.bz().b() instanceof anm))) {
/* 207:198 */       return false;
/* 208:    */     }
/* 209:202 */     bec localbec = this.a.p(paramdt);
/* 210:203 */     bcm localbcm = this.a.s(paramdt);
/* 211:205 */     if (this.c.c())
/* 212:    */     {
/* 213:206 */       if (this.c == arc.e) {
/* 214:207 */         return false;
/* 215:    */       }
/* 216:209 */       if (!this.b.cm())
/* 217:    */       {
/* 218:210 */         amj localamj1 = this.b.bY();
/* 219:211 */         if (localamj1 == null) {
/* 220:212 */           return false;
/* 221:    */         }
/* 222:214 */         if (!localamj1.c(localbec.c())) {
/* 223:215 */           return false;
/* 224:    */         }
/* 225:    */       }
/* 226:    */     }
/* 227:220 */     this.a.a(this.b, 2001, paramdt, atr.f(localbec));
/* 228:    */     
/* 229:222 */     boolean bool1 = c(paramdt);
/* 230:224 */     if (d())
/* 231:    */     {
/* 232:225 */       this.b.a.a(new iw(this.a, paramdt));
/* 233:    */     }
/* 234:    */     else
/* 235:    */     {
/* 236:227 */       amj localamj2 = this.b.bY();
/* 237:228 */       boolean bool2 = this.b.b(localbec.c());
/* 238:229 */       if (localamj2 != null)
/* 239:    */       {
/* 240:230 */         localamj2.a(this.a, localbec.c(), paramdt, this.b);
/* 241:231 */         if (localamj2.b == 0) {
/* 242:232 */           this.b.bZ();
/* 243:    */         }
/* 244:    */       }
/* 245:235 */       if ((bool1) && (bool2)) {
/* 246:236 */         localbec.c().a(this.a, this.b, paramdt, localbec, localbcm);
/* 247:    */       }
/* 248:    */     }
/* 249:239 */     return bool1;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public boolean a(ahd paramahd, aqu paramaqu, amj paramamj)
/* 253:    */   {
/* 254:243 */     if (this.c == arc.e) {
/* 255:244 */       return false;
/* 256:    */     }
/* 257:246 */     int m = paramamj.b;
/* 258:247 */     int n = paramamj.i();
/* 259:248 */     amj localamj = paramamj.a(paramaqu, paramahd);
/* 260:249 */     if ((localamj != paramamj) || ((localamj != null) && ((localamj.b != m) || (localamj.l() > 0) || (localamj.i() != n))))
/* 261:    */     {
/* 262:250 */       paramahd.bg.a[paramahd.bg.c] = localamj;
/* 263:251 */       if (d())
/* 264:    */       {
/* 265:252 */         localamj.b = m;
/* 266:253 */         if (localamj.e()) {
/* 267:254 */           localamj.b(n);
/* 268:    */         }
/* 269:    */       }
/* 270:257 */       if (localamj.b == 0) {
/* 271:258 */         paramahd.bg.a[paramahd.bg.c] = null;
/* 272:    */       }
/* 273:260 */       if (!paramahd.bR()) {
/* 274:261 */         ((qw)paramahd).a(paramahd.bh);
/* 275:    */       }
/* 276:263 */       return true;
/* 277:    */     }
/* 278:265 */     return false;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public boolean a(ahd paramahd, aqu paramaqu, amj paramamj, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 282:    */   {
/* 283:    */     Object localObject;
/* 284:269 */     if (this.c == arc.e)
/* 285:    */     {
/* 286:270 */       localObject = paramaqu.s(paramdt);
/* 287:271 */       if ((localObject instanceof vy))
/* 288:    */       {
/* 289:272 */         atr localatr = paramaqu.p(paramdt).c();
/* 290:273 */         vy localvy = (vy)localObject;
/* 291:275 */         if (((localvy instanceof bcr)) && ((localatr instanceof auj))) {
/* 292:276 */           localvy = ((auj)localatr).d(paramaqu, paramdt);
/* 293:    */         }
/* 294:279 */         if (localvy != null)
/* 295:    */         {
/* 296:280 */           paramahd.a(localvy);
/* 297:281 */           return true;
/* 298:    */         }
/* 299:    */       }
/* 300:283 */       else if ((localObject instanceof vq))
/* 301:    */       {
/* 302:284 */         paramahd.a((vq)localObject);
/* 303:285 */         return true;
/* 304:    */       }
/* 305:287 */       return false;
/* 306:    */     }
/* 307:290 */     if ((!paramahd.aw()) || (paramahd.bz() == null))
/* 308:    */     {
/* 309:291 */       localObject = paramaqu.p(paramdt);
/* 310:292 */       if (((bec)localObject).c().a(paramaqu, paramdt, (bec)localObject, paramahd, paramej, paramFloat1, paramFloat2, paramFloat3)) {
/* 311:293 */         return true;
/* 312:    */       }
/* 313:    */     }
/* 314:297 */     if (paramamj == null) {
/* 315:298 */       return false;
/* 316:    */     }
/* 317:301 */     if (d())
/* 318:    */     {
/* 319:302 */       int m = paramamj.i();
/* 320:303 */       int n = paramamj.b;
/* 321:304 */       boolean bool = paramamj.a(paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/* 322:305 */       paramamj.b(m);
/* 323:306 */       paramamj.b = n;
/* 324:307 */       return bool;
/* 325:    */     }
/* 326:309 */     return paramamj.a(paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/* 327:    */   }
/* 328:    */   
/* 329:    */   public void a(qt paramqt)
/* 330:    */   {
/* 331:314 */     this.a = paramqt;
/* 332:    */   }
/* 333:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     qx
 * JD-Core Version:    0.7.0.1
 */