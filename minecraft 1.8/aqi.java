/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Random;
/*   5:    */ import java.util.Set;
/*   6:    */ 
/*   7:    */ public abstract class aqi
/*   8:    */ {
/*   9:    */   private int a;
/*  10:    */   private String b;
/*  11:    */   private final List c;
/*  12:    */   private aqj d;
/*  13:    */   private double e;
/*  14:    */   private double f;
/*  15:    */   private int g;
/*  16:    */   private int h;
/*  17:    */   private int i;
/*  18:    */   private wv j;
/*  19:    */   private int k;
/*  20:    */   private int l;
/*  21:    */   private int m;
/*  22:    */   
/*  23:    */   public aqi()
/*  24:    */   {
/*  25: 24 */     this.a = 20;
/*  26: 25 */     this.b = "Pig";
/*  27: 26 */     this.c = Lists.newArrayList();
/*  28:    */     
/*  29:    */ 
/*  30:    */ 
/*  31: 30 */     this.g = 200;
/*  32: 31 */     this.h = 800;
/*  33: 32 */     this.i = 4;
/*  34:    */     
/*  35: 34 */     this.k = 6;
/*  36: 35 */     this.l = 16;
/*  37: 36 */     this.m = 4;
/*  38:    */   }
/*  39:    */   
/*  40:    */   private String f()
/*  41:    */   {
/*  42: 39 */     if (i() == null)
/*  43:    */     {
/*  44: 40 */       if (this.b.equals("Minecart")) {
/*  45: 41 */         this.b = "MinecartRideable";
/*  46:    */       }
/*  47: 43 */       return this.b;
/*  48:    */     }
/*  49: 45 */     return aqj.a(i());
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void a(String paramString)
/*  53:    */   {
/*  54: 50 */     this.b = paramString;
/*  55:    */   }
/*  56:    */   
/*  57:    */   private boolean g()
/*  58:    */   {
/*  59: 54 */     dt localdt = b();
/*  60: 55 */     return a().b(localdt.n() + 0.5D, localdt.o() + 0.5D, localdt.p() + 0.5D, this.l);
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void c()
/*  64:    */   {
/*  65: 59 */     if (!g()) {
/*  66: 60 */       return;
/*  67:    */     }
/*  68: 63 */     dt localdt = b();
/*  69:    */     double d3;
/*  70: 64 */     if (a().D)
/*  71:    */     {
/*  72: 65 */       double d1 = localdt.n() + a().s.nextFloat();
/*  73: 66 */       double d2 = localdt.o() + a().s.nextFloat();
/*  74: 67 */       d3 = localdt.p() + a().s.nextFloat();
/*  75: 68 */       a().a(ew.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*  76: 69 */       a().a(ew.A, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*  77: 71 */       if (this.a > 0) {
/*  78: 72 */         this.a -= 1;
/*  79:    */       }
/*  80: 74 */       this.f = this.e;
/*  81: 75 */       this.e = ((this.e + 1000.0F / (this.a + 200.0F)) % 360.0D);
/*  82:    */     }
/*  83:    */     else
/*  84:    */     {
/*  85: 77 */       if (this.a == -1) {
/*  86: 78 */         h();
/*  87:    */       }
/*  88: 81 */       if (this.a > 0)
/*  89:    */       {
/*  90: 82 */         this.a -= 1;
/*  91: 83 */         return;
/*  92:    */       }
/*  93: 86 */       int n = 0;
/*  94: 88 */       for (int i1 = 0; i1 < this.i; i1++)
/*  95:    */       {
/*  96: 89 */         wv localwv = xb.a(f(), a());
/*  97: 90 */         if (localwv == null) {
/*  98: 91 */           return;
/*  99:    */         }
/* 100: 94 */         int i2 = a().a(localwv.getClass(), new brt(localdt.n(), localdt.o(), localdt.p(), localdt.n() + 1, localdt.o() + 1, localdt.p() + 1).b(this.m, this.m, this.m)).size();
/* 101: 95 */         if (i2 >= this.k)
/* 102:    */         {
/* 103: 96 */           h();
/* 104: 97 */           return;
/* 105:    */         }
/* 106:100 */         d3 = localdt.n() + (a().s.nextDouble() - a().s.nextDouble()) * this.m + 0.5D;
/* 107:101 */         double d4 = localdt.o() + a().s.nextInt(3) - 1;
/* 108:102 */         double d5 = localdt.p() + (a().s.nextDouble() - a().s.nextDouble()) * this.m + 0.5D;
/* 109:103 */         Object localObject = (localwv instanceof xn) ? (xn)localwv : null;
/* 110:    */         
/* 111:105 */         localwv.b(d3, d4, d5, a().s.nextFloat() * 360.0F, 0.0F);
/* 112:107 */         if ((localObject == null) || ((localObject.bQ()) && (localObject.bR())))
/* 113:    */         {
/* 114:108 */           a(localwv, true);
/* 115:109 */           a().b(2004, localdt, 0);
/* 116:111 */           if (localObject != null) {
/* 117:112 */             localObject.y();
/* 118:    */           }
/* 119:115 */           n = 1;
/* 120:    */         }
/* 121:    */       }
/* 122:119 */       if (n != 0) {
/* 123:120 */         h();
/* 124:    */       }
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   private wv a(wv paramwv, boolean paramBoolean)
/* 129:    */   {
/* 130:126 */     if (i() != null)
/* 131:    */     {
/* 132:127 */       Object localObject1 = new fn();
/* 133:128 */       paramwv.d((fn)localObject1);
/* 134:130 */       for (Object localObject2 = aqj.b(i()).c().iterator(); ((Iterator)localObject2).hasNext();)
/* 135:    */       {
/* 136:130 */         localObject3 = (String)((Iterator)localObject2).next();
/* 137:131 */         localObject4 = aqj.b(i()).a((String)localObject3);
/* 138:132 */         ((fn)localObject1).a((String)localObject3, ((gd)localObject4).b());
/* 139:    */       }
/* 140:    */       Object localObject3;
/* 141:    */       Object localObject4;
/* 142:135 */       paramwv.f((fn)localObject1);
/* 143:136 */       if ((paramwv.o != null) && (paramBoolean)) {
/* 144:137 */         paramwv.o.d(paramwv);
/* 145:    */       }
/* 146:141 */       localObject2 = paramwv;
/* 147:142 */       while (((fn)localObject1).b("Riding", 10))
/* 148:    */       {
/* 149:143 */         localObject3 = ((fn)localObject1).m("Riding");
/* 150:144 */         localObject4 = xb.a(((fn)localObject3).j("id"), paramwv.o);
/* 151:145 */         if (localObject4 != null)
/* 152:    */         {
/* 153:146 */           fn localfn = new fn();
/* 154:147 */           ((wv)localObject4).d(localfn);
/* 155:149 */           for (String str : ((fn)localObject3).c())
/* 156:    */           {
/* 157:150 */             gd localgd = ((fn)localObject3).a(str);
/* 158:151 */             localfn.a(str, localgd.b());
/* 159:    */           }
/* 160:153 */           ((wv)localObject4).f(localfn);
/* 161:154 */           ((wv)localObject4).b(((wv)localObject2).s, ((wv)localObject2).t, ((wv)localObject2).u, ((wv)localObject2).y, ((wv)localObject2).z);
/* 162:156 */           if ((paramwv.o != null) && (paramBoolean)) {
/* 163:157 */             paramwv.o.d((wv)localObject4);
/* 164:    */           }
/* 165:159 */           ((wv)localObject2).a((wv)localObject4);
/* 166:    */         }
/* 167:161 */         localObject2 = localObject4;
/* 168:162 */         localObject1 = localObject3;
/* 169:    */       }
/* 170:    */     }
/* 171:164 */     else if (((paramwv instanceof xm)) && (paramwv.o != null) && (paramBoolean))
/* 172:    */     {
/* 173:165 */       ((xn)paramwv).a(paramwv.o.E(new dt(paramwv)), null);
/* 174:166 */       paramwv.o.d(paramwv);
/* 175:    */     }
/* 176:169 */     return paramwv;
/* 177:    */   }
/* 178:    */   
/* 179:    */   private void h()
/* 180:    */   {
/* 181:173 */     if (this.h <= this.g) {
/* 182:174 */       this.a = this.g;
/* 183:    */     } else {
/* 184:176 */       this.a = (this.g + a().s.nextInt(this.h - this.g));
/* 185:    */     }
/* 186:179 */     if (this.c.size() > 0) {
/* 187:180 */       a((aqj)vj.a(a().s, this.c));
/* 188:    */     }
/* 189:183 */     a(1);
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void a(fn paramfn)
/* 193:    */   {
/* 194:187 */     this.b = paramfn.j("EntityId");
/* 195:188 */     this.a = paramfn.e("Delay");
/* 196:    */     
/* 197:190 */     this.c.clear();
/* 198:191 */     if (paramfn.b("SpawnPotentials", 9))
/* 199:    */     {
/* 200:192 */       fv localfv = paramfn.c("SpawnPotentials", 10);
/* 201:194 */       for (int n = 0; n < localfv.c(); n++) {
/* 202:195 */         this.c.add(new aqj(this, localfv.b(n)));
/* 203:    */       }
/* 204:    */     }
/* 205:199 */     if (paramfn.b("SpawnData", 10)) {
/* 206:200 */       a(new aqj(this, paramfn.m("SpawnData"), this.b));
/* 207:    */     } else {
/* 208:202 */       a(null);
/* 209:    */     }
/* 210:205 */     if (paramfn.b("MinSpawnDelay", 99))
/* 211:    */     {
/* 212:206 */       this.g = paramfn.e("MinSpawnDelay");
/* 213:207 */       this.h = paramfn.e("MaxSpawnDelay");
/* 214:208 */       this.i = paramfn.e("SpawnCount");
/* 215:    */     }
/* 216:211 */     if (paramfn.b("MaxNearbyEntities", 99))
/* 217:    */     {
/* 218:212 */       this.k = paramfn.e("MaxNearbyEntities");
/* 219:213 */       this.l = paramfn.e("RequiredPlayerRange");
/* 220:    */     }
/* 221:216 */     if (paramfn.b("SpawnRange", 99)) {
/* 222:217 */       this.m = paramfn.e("SpawnRange");
/* 223:    */     }
/* 224:220 */     if (a() != null) {
/* 225:221 */       this.j = null;
/* 226:    */     }
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void b(fn paramfn)
/* 230:    */   {
/* 231:226 */     paramfn.a("EntityId", f());
/* 232:227 */     paramfn.a("Delay", (short)this.a);
/* 233:228 */     paramfn.a("MinSpawnDelay", (short)this.g);
/* 234:229 */     paramfn.a("MaxSpawnDelay", (short)this.h);
/* 235:230 */     paramfn.a("SpawnCount", (short)this.i);
/* 236:231 */     paramfn.a("MaxNearbyEntities", (short)this.k);
/* 237:232 */     paramfn.a("RequiredPlayerRange", (short)this.l);
/* 238:233 */     paramfn.a("SpawnRange", (short)this.m);
/* 239:235 */     if (i() != null) {
/* 240:236 */       paramfn.a("SpawnData", aqj.b(i()).b());
/* 241:    */     }
/* 242:239 */     if ((i() != null) || (this.c.size() > 0))
/* 243:    */     {
/* 244:240 */       fv localfv = new fv();
/* 245:242 */       if (this.c.size() > 0) {
/* 246:243 */         for (aqj localaqj : this.c) {
/* 247:244 */           localfv.a(localaqj.a());
/* 248:    */         }
/* 249:    */       } else {
/* 250:247 */         localfv.a(i().a());
/* 251:    */       }
/* 252:250 */       paramfn.a("SpawnPotentials", localfv);
/* 253:    */     }
/* 254:    */   }
/* 255:    */   
/* 256:    */   public wv a(aqu paramaqu)
/* 257:    */   {
/* 258:255 */     if (this.j == null)
/* 259:    */     {
/* 260:256 */       wv localwv = xb.a(f(), paramaqu);
/* 261:257 */       if (localwv != null)
/* 262:    */       {
/* 263:258 */         localwv = a(localwv, false);
/* 264:259 */         this.j = localwv;
/* 265:    */       }
/* 266:    */     }
/* 267:263 */     return this.j;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public boolean b(int paramInt)
/* 271:    */   {
/* 272:267 */     if ((paramInt == 1) && (a().D))
/* 273:    */     {
/* 274:268 */       this.a = this.g;
/* 275:269 */       return true;
/* 276:    */     }
/* 277:271 */     return false;
/* 278:    */   }
/* 279:    */   
/* 280:    */   private aqj i()
/* 281:    */   {
/* 282:275 */     return this.d;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public void a(aqj paramaqj)
/* 286:    */   {
/* 287:279 */     this.d = paramaqj;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public abstract void a(int paramInt);
/* 291:    */   
/* 292:    */   public abstract aqu a();
/* 293:    */   
/* 294:    */   public abstract dt b();
/* 295:    */   
/* 296:    */   public double d()
/* 297:    */   {
/* 298:289 */     return this.e;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public double e()
/* 302:    */   {
/* 303:293 */     return this.f;
/* 304:    */   }
/* 305:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aqi
 * JD-Core Version:    0.7.0.1
 */