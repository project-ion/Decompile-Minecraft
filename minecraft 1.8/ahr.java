/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class ahr
/*   5:    */   extends wv
/*   6:    */   implements aho
/*   7:    */ {
/*   8: 22 */   private int c = -1;
/*   9: 23 */   private int d = -1;
/*  10: 24 */   private int e = -1;
/*  11:    */   private atr f;
/*  12:    */   protected boolean a;
/*  13:    */   public int b;
/*  14:    */   private xm g;
/*  15:    */   private String h;
/*  16:    */   private int i;
/*  17:    */   private int ap;
/*  18:    */   
/*  19:    */   public ahr(aqu paramaqu)
/*  20:    */   {
/*  21: 34 */     super(paramaqu);
/*  22: 35 */     a(0.25F, 0.25F);
/*  23:    */   }
/*  24:    */   
/*  25:    */   protected void h() {}
/*  26:    */   
/*  27:    */   public boolean a(double paramDouble)
/*  28:    */   {
/*  29: 44 */     double d1 = aQ().a() * 4.0D;
/*  30: 45 */     d1 *= 64.0D;
/*  31: 46 */     return paramDouble < d1 * d1;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public ahr(aqu paramaqu, xm paramxm)
/*  35:    */   {
/*  36: 50 */     super(paramaqu);
/*  37: 51 */     this.g = paramxm;
/*  38:    */     
/*  39: 53 */     a(0.25F, 0.25F);
/*  40:    */     
/*  41: 55 */     b(paramxm.s, paramxm.t + paramxm.aR(), paramxm.u, paramxm.y, paramxm.z);
/*  42:    */     
/*  43: 57 */     this.s -= uv.b(this.y / 180.0F * 3.141593F) * 0.16F;
/*  44: 58 */     this.t -= 0.1000000014901161D;
/*  45: 59 */     this.u -= uv.a(this.y / 180.0F * 3.141593F) * 0.16F;
/*  46: 60 */     b(this.s, this.t, this.u);
/*  47:    */     
/*  48: 62 */     float f1 = 0.4F;
/*  49: 63 */     this.v = (-uv.a(this.y / 180.0F * 3.141593F) * uv.b(this.z / 180.0F * 3.141593F) * f1);
/*  50: 64 */     this.x = (uv.b(this.y / 180.0F * 3.141593F) * uv.b(this.z / 180.0F * 3.141593F) * f1);
/*  51: 65 */     this.w = (-uv.a((this.z + l()) / 180.0F * 3.141593F) * f1);
/*  52:    */     
/*  53: 67 */     c(this.v, this.w, this.x, j(), 1.0F);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public ahr(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  57:    */   {
/*  58: 71 */     super(paramaqu);
/*  59: 72 */     this.i = 0;
/*  60:    */     
/*  61: 74 */     a(0.25F, 0.25F);
/*  62:    */     
/*  63: 76 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  64:    */   }
/*  65:    */   
/*  66:    */   protected float j()
/*  67:    */   {
/*  68: 80 */     return 1.5F;
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected float l()
/*  72:    */   {
/*  73: 84 */     return 0.0F;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  77:    */   {
/*  78: 89 */     float f1 = uv.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  79:    */     
/*  80: 91 */     paramDouble1 /= f1;
/*  81: 92 */     paramDouble2 /= f1;
/*  82: 93 */     paramDouble3 /= f1;
/*  83:    */     
/*  84: 95 */     paramDouble1 += this.V.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  85: 96 */     paramDouble2 += this.V.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  86: 97 */     paramDouble3 += this.V.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  87:    */     
/*  88: 99 */     paramDouble1 *= paramFloat1;
/*  89:100 */     paramDouble2 *= paramFloat1;
/*  90:101 */     paramDouble3 *= paramFloat1;
/*  91:    */     
/*  92:103 */     this.v = paramDouble1;
/*  93:104 */     this.w = paramDouble2;
/*  94:105 */     this.x = paramDouble3;
/*  95:    */     
/*  96:107 */     float f2 = uv.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*  97:    */     
/*  98:109 */     this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/*  99:110 */     this.B = (this.z = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.141592741012573D));
/* 100:111 */     this.i = 0;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 104:    */   {
/* 105:116 */     this.v = paramDouble1;
/* 106:117 */     this.w = paramDouble2;
/* 107:118 */     this.x = paramDouble3;
/* 108:119 */     if ((this.B == 0.0F) && (this.A == 0.0F))
/* 109:    */     {
/* 110:120 */       float f1 = uv.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 111:121 */       this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/* 112:122 */       this.B = (this.z = (float)(Math.atan2(paramDouble2, f1) * 180.0D / 3.141592741012573D));
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void s_()
/* 117:    */   {
/* 118:128 */     this.P = this.s;
/* 119:129 */     this.Q = this.t;
/* 120:130 */     this.R = this.u;
/* 121:131 */     super.s_();
/* 122:133 */     if (this.b > 0) {
/* 123:134 */       this.b -= 1;
/* 124:    */     }
/* 125:137 */     if (this.a)
/* 126:    */     {
/* 127:138 */       if (this.o.p(new dt(this.c, this.d, this.e)).c() == this.f)
/* 128:    */       {
/* 129:139 */         this.i += 1;
/* 130:140 */         if (this.i == 1200) {
/* 131:141 */           J();
/* 132:    */         }
/* 133:143 */         return;
/* 134:    */       }
/* 135:145 */       this.a = false;
/* 136:    */       
/* 137:147 */       this.v *= this.V.nextFloat() * 0.2F;
/* 138:148 */       this.w *= this.V.nextFloat() * 0.2F;
/* 139:149 */       this.x *= this.V.nextFloat() * 0.2F;
/* 140:150 */       this.i = 0;
/* 141:151 */       this.ap = 0;
/* 142:    */     }
/* 143:    */     else
/* 144:    */     {
/* 145:154 */       this.ap += 1;
/* 146:    */     }
/* 147:157 */     brw localbrw1 = new brw(this.s, this.t, this.u);
/* 148:158 */     brw localbrw2 = new brw(this.s + this.v, this.t + this.w, this.u + this.x);
/* 149:159 */     bru localbru1 = this.o.a(localbrw1, localbrw2);
/* 150:    */     
/* 151:161 */     localbrw1 = new brw(this.s, this.t, this.u);
/* 152:162 */     localbrw2 = new brw(this.s + this.v, this.t + this.w, this.u + this.x);
/* 153:163 */     if (localbru1 != null) {
/* 154:164 */       localbrw2 = new brw(localbru1.c.a, localbru1.c.b, localbru1.c.c);
/* 155:    */     }
/* 156:167 */     if (!this.o.D)
/* 157:    */     {
/* 158:168 */       Object localObject = null;
/* 159:169 */       List localList = this.o.b(this, aQ().a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
/* 160:170 */       double d1 = 0.0D;
/* 161:171 */       xm localxm = n();
/* 162:172 */       for (int k = 0; k < localList.size(); k++)
/* 163:    */       {
/* 164:173 */         wv localwv = (wv)localList.get(k);
/* 165:174 */         if ((localwv.ad()) && ((localwv != localxm) || (this.ap >= 5)))
/* 166:    */         {
/* 167:178 */           float f5 = 0.3F;
/* 168:179 */           brt localbrt = localwv.aQ().b(f5, f5, f5);
/* 169:180 */           bru localbru2 = localbrt.a(localbrw1, localbrw2);
/* 170:181 */           if (localbru2 != null)
/* 171:    */           {
/* 172:182 */             double d2 = localbrw1.f(localbru2.c);
/* 173:183 */             if ((d2 < d1) || (d1 == 0.0D))
/* 174:    */             {
/* 175:184 */               localObject = localwv;
/* 176:185 */               d1 = d2;
/* 177:    */             }
/* 178:    */           }
/* 179:    */         }
/* 180:    */       }
/* 181:190 */       if (localObject != null) {
/* 182:191 */         localbru1 = new bru(localObject);
/* 183:    */       }
/* 184:    */     }
/* 185:195 */     if (localbru1 != null) {
/* 186:196 */       if ((localbru1.a == brv.b) && (this.o.p(localbru1.a()).c() == aty.aY)) {
/* 187:197 */         aq();
/* 188:    */       } else {
/* 189:199 */         a(localbru1);
/* 190:    */       }
/* 191:    */     }
/* 192:202 */     this.s += this.v;
/* 193:203 */     this.t += this.w;
/* 194:204 */     this.u += this.x;
/* 195:    */     
/* 196:206 */     float f1 = uv.a(this.v * this.v + this.x * this.x);
/* 197:207 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.141592741012573D));
/* 198:208 */     this.z = ((float)(Math.atan2(this.w, f1) * 180.0D / 3.141592741012573D));
/* 199:210 */     while (this.z - this.B < -180.0F) {
/* 200:211 */       this.B -= 360.0F;
/* 201:    */     }
/* 202:213 */     while (this.z - this.B >= 180.0F) {
/* 203:214 */       this.B += 360.0F;
/* 204:    */     }
/* 205:217 */     while (this.y - this.A < -180.0F) {
/* 206:218 */       this.A -= 360.0F;
/* 207:    */     }
/* 208:220 */     while (this.y - this.A >= 180.0F) {
/* 209:221 */       this.A += 360.0F;
/* 210:    */     }
/* 211:224 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 212:225 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/* 213:    */     
/* 214:227 */     float f2 = 0.99F;
/* 215:228 */     float f3 = m();
/* 216:230 */     if (V())
/* 217:    */     {
/* 218:231 */       for (int j = 0; j < 4; j++)
/* 219:    */       {
/* 220:232 */         float f4 = 0.25F;
/* 221:233 */         this.o.a(ew.e, this.s - this.v * f4, this.t - this.w * f4, this.u - this.x * f4, this.v, this.w, this.x, new int[0]);
/* 222:    */       }
/* 223:235 */       f2 = 0.8F;
/* 224:    */     }
/* 225:238 */     this.v *= f2;
/* 226:239 */     this.w *= f2;
/* 227:240 */     this.x *= f2;
/* 228:241 */     this.w -= f3;
/* 229:    */     
/* 230:243 */     b(this.s, this.t, this.u);
/* 231:    */   }
/* 232:    */   
/* 233:    */   protected float m()
/* 234:    */   {
/* 235:247 */     return 0.03F;
/* 236:    */   }
/* 237:    */   
/* 238:    */   protected abstract void a(bru parambru);
/* 239:    */   
/* 240:    */   public void b(fn paramfn)
/* 241:    */   {
/* 242:254 */     paramfn.a("xTile", (short)this.c);
/* 243:255 */     paramfn.a("yTile", (short)this.d);
/* 244:256 */     paramfn.a("zTile", (short)this.e);
/* 245:257 */     oa localoa = (oa)atr.c.c(this.f);
/* 246:258 */     paramfn.a("inTile", localoa == null ? "" : localoa.toString());
/* 247:259 */     paramfn.a("shake", (byte)this.b);
/* 248:260 */     paramfn.a("inGround", (byte)(this.a ? 1 : 0));
/* 249:262 */     if (((this.h == null) || (this.h.length() == 0)) && ((this.g instanceof ahd))) {
/* 250:263 */       this.h = this.g.d_();
/* 251:    */     }
/* 252:265 */     paramfn.a("ownerName", this.h == null ? "" : this.h);
/* 253:    */   }
/* 254:    */   
/* 255:    */   public void a(fn paramfn)
/* 256:    */   {
/* 257:270 */     this.c = paramfn.e("xTile");
/* 258:271 */     this.d = paramfn.e("yTile");
/* 259:272 */     this.e = paramfn.e("zTile");
/* 260:273 */     if (paramfn.b("inTile", 8)) {
/* 261:274 */       this.f = atr.b(paramfn.j("inTile"));
/* 262:    */     } else {
/* 263:276 */       this.f = atr.c(paramfn.d("inTile") & 0xFF);
/* 264:    */     }
/* 265:278 */     this.b = (paramfn.d("shake") & 0xFF);
/* 266:279 */     this.a = (paramfn.d("inGround") == 1);
/* 267:280 */     this.h = paramfn.j("ownerName");
/* 268:281 */     if ((this.h != null) && (this.h.length() == 0)) {
/* 269:282 */       this.h = null;
/* 270:    */     }
/* 271:    */   }
/* 272:    */   
/* 273:    */   public xm n()
/* 274:    */   {
/* 275:287 */     if ((this.g == null) && (this.h != null) && (this.h.length() > 0)) {
/* 276:288 */       this.g = this.o.a(this.h);
/* 277:    */     }
/* 278:290 */     return this.g;
/* 279:    */   }
/* 280:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahr
 * JD-Core Version:    0.7.0.1
 */