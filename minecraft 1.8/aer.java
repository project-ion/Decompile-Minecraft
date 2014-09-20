/*   1:    */ import com.google.common.collect.Sets;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ import java.util.Set;
/*   5:    */ import java.util.UUID;
/*   6:    */ 
/*   7:    */ public class aer
/*   8:    */   extends afm
/*   9:    */ {
/*  10: 35 */   private static final UUID b = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
/*  11: 36 */   private static final ya c = new ya(b, "Attacking speed boost", 0.1500000059604645D, 0).a(false);
/*  12: 38 */   private static final Set bk = Sets.newIdentityHashSet();
/*  13:    */   private boolean bl;
/*  14:    */   
/*  15:    */   static
/*  16:    */   {
/*  17: 41 */     bk.add(aty.c);
/*  18: 42 */     bk.add(aty.d);
/*  19: 43 */     bk.add(aty.m);
/*  20: 44 */     bk.add(aty.n);
/*  21: 45 */     bk.add(aty.N);
/*  22: 46 */     bk.add(aty.O);
/*  23: 47 */     bk.add(aty.P);
/*  24: 48 */     bk.add(aty.Q);
/*  25: 49 */     bk.add(aty.W);
/*  26: 50 */     bk.add(aty.aK);
/*  27: 51 */     bk.add(aty.aL);
/*  28: 52 */     bk.add(aty.aU);
/*  29: 53 */     bk.add(aty.bk);
/*  30: 54 */     bk.add(aty.bw);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public aer(aqu paramaqu)
/*  34:    */   {
/*  35: 64 */     super(paramaqu);
/*  36: 65 */     a(0.6F, 2.9F);
/*  37: 66 */     this.S = 1.0F;
/*  38:    */     
/*  39: 68 */     this.i.a(0, new yy(this));
/*  40: 69 */     this.i.a(2, new zk(this, 1.0D, false));
/*  41:    */     
/*  42: 71 */     this.i.a(7, new zy(this, 1.0D));
/*  43: 72 */     this.i.a(8, new zh(this, ahd.class, 8.0F));
/*  44: 73 */     this.i.a(8, new zx(this));
/*  45:    */     
/*  46: 75 */     this.i.a(10, new aet(this));
/*  47: 76 */     this.i.a(11, new aev(this));
/*  48:    */     
/*  49: 78 */     this.bg.a(1, new aal(this, false, new Class[0]));
/*  50: 79 */     this.bg.a(2, new aeu(this));
/*  51: 80 */     this.bg.a(3, new aaq(this, aew.class, 10, true, false, new aes(this)));
/*  52:    */   }
/*  53:    */   
/*  54:    */   protected void aW()
/*  55:    */   {
/*  56: 90 */     super.aW();
/*  57:    */     
/*  58: 92 */     a(afs.a).a(40.0D);
/*  59: 93 */     a(afs.d).a(0.300000011920929D);
/*  60: 94 */     a(afs.e).a(7.0D);
/*  61: 95 */     a(afs.b).a(64.0D);
/*  62:    */   }
/*  63:    */   
/*  64:    */   protected void h()
/*  65:    */   {
/*  66:100 */     super.h();
/*  67:    */     
/*  68:102 */     this.ac.a(16, new Short((short)0));
/*  69:103 */     this.ac.a(17, new Byte((byte)0));
/*  70:104 */     this.ac.a(18, new Byte((byte)0));
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void b(fn paramfn)
/*  74:    */   {
/*  75:109 */     super.b(paramfn);
/*  76:110 */     bec localbec = ck();
/*  77:111 */     paramfn.a("carried", (short)atr.a(localbec.c()));
/*  78:112 */     paramfn.a("carriedData", (short)localbec.c().c(localbec));
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(fn paramfn)
/*  82:    */   {
/*  83:117 */     super.a(paramfn);
/*  84:    */     bec localbec;
/*  85:119 */     if (paramfn.b("carried", 8)) {
/*  86:120 */       localbec = atr.b(paramfn.j("carried")).a(paramfn.e("carriedData") & 0xFFFF);
/*  87:    */     } else {
/*  88:122 */       localbec = atr.c(paramfn.e("carried")).a(paramfn.e("carriedData") & 0xFFFF);
/*  89:    */     }
/*  90:124 */     a(localbec);
/*  91:    */   }
/*  92:    */   
/*  93:    */   private boolean c(ahd paramahd)
/*  94:    */   {
/*  95:128 */     amj localamj = paramahd.bg.b[3];
/*  96:129 */     if ((localamj != null) && (localamj.b() == alq.a(aty.aU))) {
/*  97:130 */       return false;
/*  98:    */     }
/*  99:133 */     brw localbrw1 = paramahd.d(1.0F).a();
/* 100:134 */     brw localbrw2 = new brw(this.s - paramahd.s, aQ().b + this.K / 2.0F - (paramahd.t + paramahd.aR()), this.u - paramahd.u);
/* 101:135 */     double d1 = localbrw2.b();
/* 102:136 */     localbrw2 = localbrw2.a();
/* 103:137 */     double d2 = localbrw1.b(localbrw2);
/* 104:138 */     if (d2 > 1.0D - 0.025D / d1) {
/* 105:139 */       return paramahd.t(this);
/* 106:    */     }
/* 107:141 */     return false;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public float aR()
/* 111:    */   {
/* 112:146 */     return 2.55F;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void m()
/* 116:    */   {
/* 117:151 */     if (this.o.D) {
/* 118:152 */       for (int i = 0; i < 2; i++) {
/* 119:153 */         this.o.a(ew.y, this.s + (this.V.nextDouble() - 0.5D) * this.J, this.t + this.V.nextDouble() * this.K - 0.25D, this.u + (this.V.nextDouble() - 0.5D) * this.J, (this.V.nextDouble() - 0.5D) * 2.0D, -this.V.nextDouble(), (this.V.nextDouble() - 0.5D) * 2.0D, new int[0]);
/* 120:    */       }
/* 121:    */     }
/* 122:157 */     this.aW = false;
/* 123:    */     
/* 124:159 */     super.m();
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected void E()
/* 128:    */   {
/* 129:164 */     if (U()) {
/* 130:165 */       a(wh.f, 1.0F);
/* 131:    */     }
/* 132:168 */     if ((cm()) && (!this.bl) && (this.V.nextInt(100) == 0)) {
/* 133:169 */       a(false);
/* 134:    */     }
/* 135:172 */     if (this.o.w())
/* 136:    */     {
/* 137:173 */       float f = c(1.0F);
/* 138:174 */       if ((f > 0.5F) && 
/* 139:175 */         (this.o.i(new dt(this))) && (this.V.nextFloat() * 30.0F < (f - 0.4F) * 2.0F))
/* 140:    */       {
/* 141:176 */         d(null);
/* 142:177 */         a(false);
/* 143:178 */         this.bl = false;
/* 144:179 */         n();
/* 145:    */       }
/* 146:    */     }
/* 147:184 */     super.E();
/* 148:    */   }
/* 149:    */   
/* 150:    */   protected boolean n()
/* 151:    */   {
/* 152:188 */     double d1 = this.s + (this.V.nextDouble() - 0.5D) * 64.0D;
/* 153:189 */     double d2 = this.t + (this.V.nextInt(64) - 32);
/* 154:190 */     double d3 = this.u + (this.V.nextDouble() - 0.5D) * 64.0D;
/* 155:191 */     return k(d1, d2, d3);
/* 156:    */   }
/* 157:    */   
/* 158:    */   protected boolean b(wv paramwv)
/* 159:    */   {
/* 160:195 */     brw localbrw = new brw(this.s - paramwv.s, aQ().b + this.K / 2.0F - paramwv.t + paramwv.aR(), this.u - paramwv.u);
/* 161:196 */     localbrw = localbrw.a();
/* 162:197 */     double d1 = 16.0D;
/* 163:198 */     double d2 = this.s + (this.V.nextDouble() - 0.5D) * 8.0D - localbrw.a * d1;
/* 164:199 */     double d3 = this.t + (this.V.nextInt(16) - 8) - localbrw.b * d1;
/* 165:200 */     double d4 = this.u + (this.V.nextDouble() - 0.5D) * 8.0D - localbrw.c * d1;
/* 166:201 */     return k(d2, d3, d4);
/* 167:    */   }
/* 168:    */   
/* 169:    */   protected boolean k(double paramDouble1, double paramDouble2, double paramDouble3)
/* 170:    */   {
/* 171:205 */     double d1 = this.s;
/* 172:206 */     double d2 = this.t;
/* 173:207 */     double d3 = this.u;
/* 174:    */     
/* 175:209 */     this.s = paramDouble1;
/* 176:210 */     this.t = paramDouble2;
/* 177:211 */     this.u = paramDouble3;
/* 178:212 */     int i = 0;
/* 179:213 */     Object localObject = new dt(this.s, this.t, this.u);
/* 180:    */     int j;
/* 181:215 */     if (this.o.e((dt)localObject))
/* 182:    */     {
/* 183:216 */       j = 0;
/* 184:217 */       while ((j == 0) && (((dt)localObject).o() > 0))
/* 185:    */       {
/* 186:218 */         dt localdt = ((dt)localObject).b();
/* 187:219 */         atr localatr = this.o.p(localdt).c();
/* 188:220 */         if (localatr.r().c())
/* 189:    */         {
/* 190:221 */           j = 1;
/* 191:    */         }
/* 192:    */         else
/* 193:    */         {
/* 194:223 */           this.t -= 1.0D;
/* 195:224 */           localObject = localdt;
/* 196:    */         }
/* 197:    */       }
/* 198:227 */       if (j != 0)
/* 199:    */       {
/* 200:228 */         super.a(this.s, this.t, this.u);
/* 201:230 */         if ((this.o.a(this, aQ()).isEmpty()) && (!this.o.d(aQ()))) {
/* 202:231 */           i = 1;
/* 203:    */         }
/* 204:    */       }
/* 205:    */     }
/* 206:236 */     if (i != 0)
/* 207:    */     {
/* 208:237 */       j = 128;
/* 209:239 */       for (int k = 0; k < j; k++)
/* 210:    */       {
/* 211:240 */         double d4 = k / (j - 1.0D);
/* 212:241 */         float f1 = (this.V.nextFloat() - 0.5F) * 0.2F;
/* 213:242 */         float f2 = (this.V.nextFloat() - 0.5F) * 0.2F;
/* 214:243 */         float f3 = (this.V.nextFloat() - 0.5F) * 0.2F;
/* 215:    */         
/* 216:245 */         double d5 = d1 + (this.s - d1) * d4 + (this.V.nextDouble() - 0.5D) * this.J * 2.0D;
/* 217:246 */         double d6 = d2 + (this.t - d2) * d4 + this.V.nextDouble() * this.K;
/* 218:247 */         double d7 = d3 + (this.u - d3) * d4 + (this.V.nextDouble() - 0.5D) * this.J * 2.0D;
/* 219:248 */         this.o.a(ew.y, d5, d6, d7, f1, f2, f3, new int[0]);
/* 220:    */       }
/* 221:251 */       this.o.a(d1, d2, d3, "mob.endermen.portal", 1.0F, 1.0F);
/* 222:252 */       a("mob.endermen.portal", 1.0F, 1.0F);
/* 223:    */       
/* 224:254 */       return true;
/* 225:    */     }
/* 226:256 */     b(d1, d2, d3);
/* 227:257 */     return false;
/* 228:    */   }
/* 229:    */   
/* 230:    */   protected String z()
/* 231:    */   {
/* 232:263 */     return cm() ? "mob.endermen.scream" : "mob.endermen.idle";
/* 233:    */   }
/* 234:    */   
/* 235:    */   protected String bn()
/* 236:    */   {
/* 237:268 */     return "mob.endermen.hit";
/* 238:    */   }
/* 239:    */   
/* 240:    */   protected String bo()
/* 241:    */   {
/* 242:273 */     return "mob.endermen.death";
/* 243:    */   }
/* 244:    */   
/* 245:    */   protected alq A()
/* 246:    */   {
/* 247:278 */     return amk.bu;
/* 248:    */   }
/* 249:    */   
/* 250:    */   protected void b(boolean paramBoolean, int paramInt)
/* 251:    */   {
/* 252:283 */     alq localalq = A();
/* 253:284 */     if (localalq != null)
/* 254:    */     {
/* 255:285 */       int i = this.V.nextInt(2 + paramInt);
/* 256:286 */       for (int j = 0; j < i; j++) {
/* 257:287 */         a(localalq, 1);
/* 258:    */       }
/* 259:    */     }
/* 260:    */   }
/* 261:    */   
/* 262:    */   public void a(bec parambec)
/* 263:    */   {
/* 264:293 */     this.ac.b(16, Short.valueOf((short)(atr.f(parambec) & 0xFFFF)));
/* 265:    */   }
/* 266:    */   
/* 267:    */   public bec ck()
/* 268:    */   {
/* 269:297 */     return atr.d(this.ac.b(16) & 0xFFFF);
/* 270:    */   }
/* 271:    */   
/* 272:    */   public boolean a(wh paramwh, float paramFloat)
/* 273:    */   {
/* 274:310 */     if (b(paramwh)) {
/* 275:311 */       return false;
/* 276:    */     }
/* 277:314 */     if ((paramwh.j() == null) || (!(paramwh.j() instanceof aew)))
/* 278:    */     {
/* 279:315 */       if (!this.o.D) {
/* 280:316 */         a(true);
/* 281:    */       }
/* 282:319 */       if (((paramwh instanceof wi)) && ((paramwh.j() instanceof ahd))) {
/* 283:321 */         if (((paramwh.j() instanceof qw)) && (((qw)paramwh.j()).c.d())) {
/* 284:322 */           a(false);
/* 285:    */         } else {
/* 286:324 */           this.bl = true;
/* 287:    */         }
/* 288:    */       }
/* 289:328 */       if ((paramwh instanceof wj))
/* 290:    */       {
/* 291:329 */         this.bl = false;
/* 292:330 */         for (bool = false; bool < true; bool++) {
/* 293:331 */           if (n()) {
/* 294:332 */             return true;
/* 295:    */           }
/* 296:    */         }
/* 297:335 */         return false;
/* 298:    */       }
/* 299:    */     }
/* 300:339 */     boolean bool = super.a(paramwh, paramFloat);
/* 301:340 */     if ((paramwh.e()) && (this.V.nextInt(10) != 0)) {
/* 302:341 */       n();
/* 303:    */     }
/* 304:343 */     return bool;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public boolean cm()
/* 308:    */   {
/* 309:347 */     return this.ac.a(18) > 0;
/* 310:    */   }
/* 311:    */   
/* 312:    */   public void a(boolean paramBoolean)
/* 313:    */   {
/* 314:351 */     this.ac.b(18, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 315:    */   }
/* 316:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aer
 * JD-Core Version:    0.7.0.1
 */