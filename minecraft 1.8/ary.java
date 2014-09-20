/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ary
/*   4:    */ {
/*   5:    */   protected aqu a;
/*   6:    */   protected Random b;
/*   7:    */   protected dt c;
/*   8:    */   protected bgl d;
/*   9:    */   
/*  10:    */   public void a(aqu paramaqu, Random paramRandom, arm paramarm, dt paramdt)
/*  11:    */   {
/*  12: 24 */     if (this.a != null) {
/*  13: 25 */       throw new RuntimeException("Already decorating");
/*  14:    */     }
/*  15: 27 */     this.a = paramaqu;
/*  16: 28 */     String str = paramaqu.P().B();
/*  17: 29 */     if (str != null) {
/*  18: 30 */       this.d = bgn.a(str).b();
/*  19:    */     } else {
/*  20: 32 */       this.d = bgn.a("").b();
/*  21:    */     }
/*  22: 34 */     this.b = paramRandom;
/*  23: 35 */     this.c = paramdt;
/*  24:    */     
/*  25: 37 */     this.h = new bif(aty.d.P(), this.d.I);
/*  26: 38 */     this.i = new bif(aty.n.P(), this.d.M);
/*  27: 39 */     this.j = new bif(aty.b.P().a(bba.a, bbb.b), this.d.Q);
/*  28: 40 */     this.k = new bif(aty.b.P().a(bba.a, bbb.d), this.d.U);
/*  29: 41 */     this.l = new bif(aty.b.P().a(bba.a, bbb.f), this.d.Y);
/*  30: 42 */     this.m = new bif(aty.q.P(), this.d.ac);
/*  31: 43 */     this.n = new bif(aty.p.P(), this.d.ag);
/*  32: 44 */     this.o = new bif(aty.o.P(), this.d.ak);
/*  33: 45 */     this.p = new bif(aty.aC.P(), this.d.ao);
/*  34: 46 */     this.q = new bif(aty.ag.P(), this.d.as);
/*  35: 47 */     this.r = new bif(aty.x.P(), this.d.aw);
/*  36:    */     
/*  37: 49 */     a(paramarm);
/*  38:    */     
/*  39: 51 */     this.a = null;
/*  40: 52 */     this.b = null;
/*  41:    */   }
/*  42:    */   
/*  43: 55 */   protected bhp e = new bhl(4);
/*  44: 56 */   protected bhp f = new bik(aty.m, 7);
/*  45: 57 */   protected bhp g = new bik(aty.n, 6);
/*  46:    */   protected bhp h;
/*  47:    */   protected bhp i;
/*  48:    */   protected bhp j;
/*  49:    */   protected bhp k;
/*  50:    */   protected bhp l;
/*  51:    */   protected bhp m;
/*  52:    */   protected bhp n;
/*  53:    */   protected bhp o;
/*  54:    */   protected bhp p;
/*  55:    */   protected bhp q;
/*  56:    */   protected bhp r;
/*  57: 69 */   protected bhq s = new bhq(aty.N, awa.a);
/*  58: 70 */   protected bhp t = new bhi(aty.P);
/*  59: 71 */   protected bhp u = new bhi(aty.Q);
/*  60: 72 */   protected bhp v = new bhv();
/*  61: 73 */   protected bhp w = new bii();
/*  62: 74 */   protected bhp x = new bhj();
/*  63: 75 */   protected bhp y = new bit();
/*  64:    */   protected int z;
/*  65:    */   protected int A;
/*  66: 79 */   protected int B = 2;
/*  67: 80 */   protected int C = 1;
/*  68:    */   protected int D;
/*  69:    */   protected int E;
/*  70:    */   protected int F;
/*  71:    */   protected int G;
/*  72: 85 */   protected int H = 1;
/*  73: 86 */   protected int I = 3;
/*  74: 87 */   protected int J = 1;
/*  75:    */   protected int K;
/*  76: 89 */   public boolean L = true;
/*  77:    */   
/*  78:    */   protected void a(arm paramarm)
/*  79:    */   {
/*  80: 92 */     a();
/*  81:    */     int i3;
/*  82: 94 */     for (int i1 = 0; i1 < this.I; i1++)
/*  83:    */     {
/*  84: 95 */       i2 = this.b.nextInt(16) + 8;
/*  85: 96 */       i3 = this.b.nextInt(16) + 8;
/*  86: 97 */       this.f.b(this.a, this.b, this.a.r(this.c.a(i2, 0, i3)));
/*  87:    */     }
/*  88:100 */     for (i1 = 0; i1 < this.J; i1++)
/*  89:    */     {
/*  90:101 */       i2 = this.b.nextInt(16) + 8;
/*  91:102 */       i3 = this.b.nextInt(16) + 8;
/*  92:103 */       this.e.b(this.a, this.b, this.a.r(this.c.a(i2, 0, i3)));
/*  93:    */     }
/*  94:106 */     for (i1 = 0; i1 < this.H; i1++)
/*  95:    */     {
/*  96:107 */       i2 = this.b.nextInt(16) + 8;
/*  97:108 */       i3 = this.b.nextInt(16) + 8;
/*  98:109 */       this.g.b(this.a, this.b, this.a.r(this.c.a(i2, 0, i3)));
/*  99:    */     }
/* 100:112 */     i1 = this.A;
/* 101:113 */     if (this.b.nextInt(10) == 0) {
/* 102:114 */       i1++;
/* 103:    */     }
/* 104:    */     int i4;
/* 105:    */     Object localObject1;
/* 106:117 */     for (int i2 = 0; i2 < i1; i2++)
/* 107:    */     {
/* 108:118 */       i3 = this.b.nextInt(16) + 8;
/* 109:119 */       i4 = this.b.nextInt(16) + 8;
/* 110:    */       
/* 111:121 */       bhc localbhc = paramarm.a(this.b);
/* 112:122 */       localbhc.e();
/* 113:    */       
/* 114:124 */       localObject1 = this.a.m(this.c.a(i3, 0, i4));
/* 115:125 */       if (localbhc.b(this.a, this.b, (dt)localObject1)) {
/* 116:126 */         localbhc.a(this.a, this.b, (dt)localObject1);
/* 117:    */       }
/* 118:    */     }
/* 119:130 */     for (i2 = 0; i2 < this.K; i2++)
/* 120:    */     {
/* 121:131 */       i3 = this.b.nextInt(16) + 8;
/* 122:132 */       i4 = this.b.nextInt(16) + 8;
/* 123:133 */       this.v.b(this.a, this.b, this.a.m(this.c.a(i3, 0, i4)));
/* 124:    */     }
/* 125:    */     int i5;
/* 126:    */     Object localObject2;
/* 127:136 */     for (i2 = 0; i2 < this.B; i2++)
/* 128:    */     {
/* 129:137 */       i3 = this.b.nextInt(16) + 8;
/* 130:138 */       i4 = this.b.nextInt(16) + 8;
/* 131:139 */       i5 = this.b.nextInt(this.a.m(this.c.a(i3, 0, i4)).o() + 32);
/* 132:    */       
/* 133:141 */       localObject1 = this.c.a(i3, i5, i4);
/* 134:142 */       localObject2 = paramarm.a(this.b, (dt)localObject1);
/* 135:143 */       avy localavy = ((awa)localObject2).a().a();
/* 136:144 */       if (localavy.r() != bof.a)
/* 137:    */       {
/* 138:145 */         this.s.a(localavy, (awa)localObject2);
/* 139:146 */         this.s.b(this.a, this.b, (dt)localObject1);
/* 140:    */       }
/* 141:    */     }
/* 142:150 */     for (i2 = 0; i2 < this.C; i2++)
/* 143:    */     {
/* 144:151 */       i3 = this.b.nextInt(16) + 8;
/* 145:152 */       i4 = this.b.nextInt(16) + 8;
/* 146:153 */       i5 = this.b.nextInt(this.a.m(this.c.a(i3, 0, i4)).o() * 2);
/* 147:    */       
/* 148:155 */       paramarm.b(this.b).b(this.a, this.b, this.c.a(i3, i5, i4));
/* 149:    */     }
/* 150:158 */     for (i2 = 0; i2 < this.D; i2++)
/* 151:    */     {
/* 152:159 */       i3 = this.b.nextInt(16) + 8;
/* 153:160 */       i4 = this.b.nextInt(16) + 8;
/* 154:161 */       i5 = this.b.nextInt(this.a.m(this.c.a(i3, 0, i4)).o() * 2);
/* 155:    */       
/* 156:163 */       new bhm().b(this.a, this.b, this.c.a(i3, i5, i4));
/* 157:    */     }
/* 158:166 */     for (i2 = 0; i2 < this.z; i2++)
/* 159:    */     {
/* 160:167 */       i3 = this.b.nextInt(16) + 8;
/* 161:168 */       i4 = this.b.nextInt(16) + 8;
/* 162:169 */       i5 = this.b.nextInt(this.a.m(this.c.a(i3, 0, i4)).o() * 2);
/* 163:    */       
/* 164:171 */       localObject1 = this.c.a(i3, i5, i4);
/* 165:172 */       while (((dt)localObject1).o() > 0)
/* 166:    */       {
/* 167:173 */         localObject2 = ((dt)localObject1).b();
/* 168:174 */         if (!this.a.d((dt)localObject2)) {
/* 169:    */           break;
/* 170:    */         }
/* 171:178 */         localObject1 = localObject2;
/* 172:    */       }
/* 173:180 */       this.y.b(this.a, this.b, (dt)localObject1);
/* 174:    */     }
/* 175:    */     int i6;
/* 176:183 */     for (i2 = 0; i2 < this.E; i2++)
/* 177:    */     {
/* 178:184 */       if (this.b.nextInt(4) == 0)
/* 179:    */       {
/* 180:185 */         i3 = this.b.nextInt(16) + 8;
/* 181:186 */         i4 = this.b.nextInt(16) + 8;
/* 182:187 */         dt localdt2 = this.a.m(this.c.a(i3, 0, i4));
/* 183:188 */         this.t.b(this.a, this.b, localdt2);
/* 184:    */       }
/* 185:191 */       if (this.b.nextInt(8) == 0)
/* 186:    */       {
/* 187:192 */         i3 = this.b.nextInt(16) + 8;
/* 188:193 */         i4 = this.b.nextInt(16) + 8;
/* 189:194 */         i6 = this.b.nextInt(this.a.m(this.c.a(i3, 0, i4)).o() * 2);
/* 190:195 */         localObject1 = this.c.a(i3, i6, i4);
/* 191:196 */         this.u.b(this.a, this.b, (dt)localObject1);
/* 192:    */       }
/* 193:    */     }
/* 194:200 */     if (this.b.nextInt(4) == 0)
/* 195:    */     {
/* 196:201 */       i2 = this.b.nextInt(16) + 8;
/* 197:202 */       i3 = this.b.nextInt(16) + 8;
/* 198:203 */       i4 = this.b.nextInt(this.a.m(this.c.a(i2, 0, i3)).o() * 2);
/* 199:204 */       this.t.b(this.a, this.b, this.c.a(i2, i4, i3));
/* 200:    */     }
/* 201:207 */     if (this.b.nextInt(8) == 0)
/* 202:    */     {
/* 203:208 */       i2 = this.b.nextInt(16) + 8;
/* 204:209 */       i3 = this.b.nextInt(16) + 8;
/* 205:210 */       i4 = this.b.nextInt(this.a.m(this.c.a(i2, 0, i3)).o() * 2);
/* 206:211 */       this.u.b(this.a, this.b, this.c.a(i2, i4, i3));
/* 207:    */     }
/* 208:214 */     for (i2 = 0; i2 < this.F; i2++)
/* 209:    */     {
/* 210:215 */       i3 = this.b.nextInt(16) + 8;
/* 211:216 */       i4 = this.b.nextInt(16) + 8;
/* 212:217 */       i6 = this.b.nextInt(this.a.m(this.c.a(i3, 0, i4)).o() * 2);
/* 213:218 */       this.w.b(this.a, this.b, this.c.a(i3, i6, i4));
/* 214:    */     }
/* 215:221 */     for (i2 = 0; i2 < 10; i2++)
/* 216:    */     {
/* 217:222 */       i3 = this.b.nextInt(16) + 8;
/* 218:223 */       i4 = this.b.nextInt(16) + 8;
/* 219:224 */       i6 = this.b.nextInt(this.a.m(this.c.a(i3, 0, i4)).o() * 2);
/* 220:225 */       this.w.b(this.a, this.b, this.c.a(i3, i6, i4));
/* 221:    */     }
/* 222:228 */     if (this.b.nextInt(32) == 0)
/* 223:    */     {
/* 224:229 */       i2 = this.b.nextInt(16) + 8;
/* 225:230 */       i3 = this.b.nextInt(16) + 8;
/* 226:231 */       i4 = this.b.nextInt(this.a.m(this.c.a(i2, 0, i3)).o() * 2);
/* 227:232 */       new bih().b(this.a, this.b, this.c.a(i2, i4, i3));
/* 228:    */     }
/* 229:235 */     for (i2 = 0; i2 < this.G; i2++)
/* 230:    */     {
/* 231:236 */       i3 = this.b.nextInt(16) + 8;
/* 232:237 */       i4 = this.b.nextInt(16) + 8;
/* 233:238 */       i6 = this.b.nextInt(this.a.m(this.c.a(i3, 0, i4)).o() * 2);
/* 234:239 */       this.x.b(this.a, this.b, this.c.a(i3, i6, i4));
/* 235:    */     }
/* 236:242 */     if (this.L)
/* 237:    */     {
/* 238:    */       dt localdt1;
/* 239:243 */       for (i2 = 0; i2 < 50; i2++)
/* 240:    */       {
/* 241:244 */         localdt1 = this.c.a(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8);
/* 242:245 */         new bin(aty.i).b(this.a, this.b, localdt1);
/* 243:    */       }
/* 244:248 */       for (i2 = 0; i2 < 20; i2++)
/* 245:    */       {
/* 246:249 */         localdt1 = this.c.a(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(this.b.nextInt(240) + 8) + 8), this.b.nextInt(16) + 8);
/* 247:    */         
/* 248:251 */         new bin(aty.k).b(this.a, this.b, localdt1);
/* 249:    */       }
/* 250:    */     }
/* 251:    */   }
/* 252:    */   
/* 253:    */   protected void a(int paramInt1, bhp parambhp, int paramInt2, int paramInt3)
/* 254:    */   {
/* 255:261 */     if (paramInt3 < paramInt2)
/* 256:    */     {
/* 257:262 */       i1 = paramInt2;
/* 258:263 */       paramInt2 = paramInt3;
/* 259:264 */       paramInt3 = i1;
/* 260:    */     }
/* 261:265 */     else if (paramInt3 == paramInt2)
/* 262:    */     {
/* 263:266 */       if (paramInt2 < 255) {
/* 264:267 */         paramInt3++;
/* 265:    */       } else {
/* 266:269 */         paramInt2--;
/* 267:    */       }
/* 268:    */     }
/* 269:273 */     for (int i1 = 0; i1 < paramInt1; i1++)
/* 270:    */     {
/* 271:274 */       dt localdt = this.c.a(this.b.nextInt(16), this.b.nextInt(paramInt3 - paramInt2) + paramInt2, this.b.nextInt(16));
/* 272:275 */       parambhp.b(this.a, this.b, localdt);
/* 273:    */     }
/* 274:    */   }
/* 275:    */   
/* 276:    */   protected void b(int paramInt1, bhp parambhp, int paramInt2, int paramInt3)
/* 277:    */   {
/* 278:280 */     for (int i1 = 0; i1 < paramInt1; i1++)
/* 279:    */     {
/* 280:281 */       dt localdt = this.c.a(this.b.nextInt(16), this.b.nextInt(paramInt3) + this.b.nextInt(paramInt3) + paramInt2 - paramInt3, this.b.nextInt(16));
/* 281:282 */       parambhp.b(this.a, this.b, localdt);
/* 282:    */     }
/* 283:    */   }
/* 284:    */   
/* 285:    */   protected void a()
/* 286:    */   {
/* 287:287 */     a(this.d.J, this.h, this.d.K, this.d.L);
/* 288:288 */     a(this.d.N, this.i, this.d.O, this.d.P);
/* 289:289 */     a(this.d.V, this.k, this.d.W, this.d.X);
/* 290:290 */     a(this.d.R, this.j, this.d.S, this.d.T);
/* 291:291 */     a(this.d.Z, this.l, this.d.aa, this.d.ab);
/* 292:292 */     a(this.d.ad, this.m, this.d.ae, this.d.af);
/* 293:293 */     a(this.d.ah, this.n, this.d.ai, this.d.aj);
/* 294:294 */     a(this.d.al, this.o, this.d.am, this.d.an);
/* 295:295 */     a(this.d.ap, this.p, this.d.aq, this.d.ar);
/* 296:296 */     a(this.d.at, this.q, this.d.au, this.d.av);
/* 297:297 */     b(this.d.ax, this.r, this.d.ay, this.d.az);
/* 298:    */   }
/* 299:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ary
 * JD-Core Version:    0.7.0.1
 */