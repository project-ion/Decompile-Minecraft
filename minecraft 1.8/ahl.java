/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class ahl
/*   5:    */   extends wv
/*   6:    */ {
/*   7: 23 */   private int e = -1;
/*   8: 24 */   private int f = -1;
/*   9: 25 */   private int g = -1;
/*  10:    */   private atr h;
/*  11:    */   private boolean i;
/*  12:    */   public xm a;
/*  13:    */   private int ap;
/*  14:    */   private int aq;
/*  15:    */   public double b;
/*  16:    */   public double c;
/*  17:    */   public double d;
/*  18:    */   
/*  19:    */   public ahl(aqu paramaqu)
/*  20:    */   {
/*  21: 34 */     super(paramaqu);
/*  22: 35 */     a(1.0F, 1.0F);
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
/*  34:    */   public ahl(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  35:    */   {
/*  36: 50 */     super(paramaqu);
/*  37: 51 */     a(1.0F, 1.0F);
/*  38:    */     
/*  39: 53 */     b(paramDouble1, paramDouble2, paramDouble3, this.y, this.z);
/*  40: 54 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  41:    */     
/*  42: 56 */     double d1 = uv.a(paramDouble4 * paramDouble4 + paramDouble5 * paramDouble5 + paramDouble6 * paramDouble6);
/*  43: 57 */     this.b = (paramDouble4 / d1 * 0.1D);
/*  44: 58 */     this.c = (paramDouble5 / d1 * 0.1D);
/*  45: 59 */     this.d = (paramDouble6 / d1 * 0.1D);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public ahl(aqu paramaqu, xm paramxm, double paramDouble1, double paramDouble2, double paramDouble3)
/*  49:    */   {
/*  50: 63 */     super(paramaqu);
/*  51: 64 */     this.a = paramxm;
/*  52:    */     
/*  53: 66 */     a(1.0F, 1.0F);
/*  54:    */     
/*  55: 68 */     b(paramxm.s, paramxm.t, paramxm.u, paramxm.y, paramxm.z);
/*  56: 69 */     b(this.s, this.t, this.u);
/*  57:    */     
/*  58: 71 */     this.v = (this.w = this.x = 0.0D);
/*  59:    */     
/*  60: 73 */     paramDouble1 += this.V.nextGaussian() * 0.4D;
/*  61: 74 */     paramDouble2 += this.V.nextGaussian() * 0.4D;
/*  62: 75 */     paramDouble3 += this.V.nextGaussian() * 0.4D;
/*  63: 76 */     double d1 = uv.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  64: 77 */     this.b = (paramDouble1 / d1 * 0.1D);
/*  65: 78 */     this.c = (paramDouble2 / d1 * 0.1D);
/*  66: 79 */     this.d = (paramDouble3 / d1 * 0.1D);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void s_()
/*  70:    */   {
/*  71: 84 */     if ((!this.o.D) && (((this.a != null) && (this.a.I)) || (!this.o.e(new dt(this)))))
/*  72:    */     {
/*  73: 85 */       J();
/*  74: 86 */       return;
/*  75:    */     }
/*  76: 89 */     super.s_();
/*  77: 90 */     e(1);
/*  78: 92 */     if (this.i)
/*  79:    */     {
/*  80: 93 */       if (this.o.p(new dt(this.e, this.f, this.g)).c() == this.h)
/*  81:    */       {
/*  82: 94 */         this.ap += 1;
/*  83: 95 */         if (this.ap == 600) {
/*  84: 96 */           J();
/*  85:    */         }
/*  86: 98 */         return;
/*  87:    */       }
/*  88:100 */       this.i = false;
/*  89:    */       
/*  90:102 */       this.v *= this.V.nextFloat() * 0.2F;
/*  91:103 */       this.w *= this.V.nextFloat() * 0.2F;
/*  92:104 */       this.x *= this.V.nextFloat() * 0.2F;
/*  93:105 */       this.ap = 0;
/*  94:106 */       this.aq = 0;
/*  95:    */     }
/*  96:    */     else
/*  97:    */     {
/*  98:109 */       this.aq += 1;
/*  99:    */     }
/* 100:112 */     brw localbrw1 = new brw(this.s, this.t, this.u);
/* 101:113 */     brw localbrw2 = new brw(this.s + this.v, this.t + this.w, this.u + this.x);
/* 102:114 */     bru localbru1 = this.o.a(localbrw1, localbrw2);
/* 103:    */     
/* 104:116 */     localbrw1 = new brw(this.s, this.t, this.u);
/* 105:117 */     localbrw2 = new brw(this.s + this.v, this.t + this.w, this.u + this.x);
/* 106:118 */     if (localbru1 != null) {
/* 107:119 */       localbrw2 = new brw(localbru1.c.a, localbru1.c.b, localbru1.c.c);
/* 108:    */     }
/* 109:122 */     Object localObject = null;
/* 110:123 */     List localList = this.o.b(this, aQ().a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
/* 111:124 */     double d1 = 0.0D;
/* 112:125 */     for (int j = 0; j < localList.size(); j++)
/* 113:    */     {
/* 114:126 */       wv localwv = (wv)localList.get(j);
/* 115:127 */       if ((localwv.ad()) && ((!localwv.k(this.a)) || (this.aq >= 25)))
/* 116:    */       {
/* 117:131 */         float f3 = 0.3F;
/* 118:132 */         brt localbrt = localwv.aQ().b(f3, f3, f3);
/* 119:133 */         bru localbru2 = localbrt.a(localbrw1, localbrw2);
/* 120:134 */         if (localbru2 != null)
/* 121:    */         {
/* 122:135 */           double d2 = localbrw1.f(localbru2.c);
/* 123:136 */           if ((d2 < d1) || (d1 == 0.0D))
/* 124:    */           {
/* 125:137 */             localObject = localwv;
/* 126:138 */             d1 = d2;
/* 127:    */           }
/* 128:    */         }
/* 129:    */       }
/* 130:    */     }
/* 131:143 */     if (localObject != null) {
/* 132:144 */       localbru1 = new bru(localObject);
/* 133:    */     }
/* 134:147 */     if (localbru1 != null) {
/* 135:148 */       a(localbru1);
/* 136:    */     }
/* 137:150 */     this.s += this.v;
/* 138:151 */     this.t += this.w;
/* 139:152 */     this.u += this.x;
/* 140:    */     
/* 141:154 */     float f1 = uv.a(this.v * this.v + this.x * this.x);
/* 142:155 */     this.y = ((float)(Math.atan2(this.x, this.v) * 180.0D / 3.141592741012573D) + 90.0F);
/* 143:156 */     this.z = ((float)(Math.atan2(f1, this.w) * 180.0D / 3.141592741012573D) - 90.0F);
/* 144:158 */     while (this.z - this.B < -180.0F) {
/* 145:159 */       this.B -= 360.0F;
/* 146:    */     }
/* 147:161 */     while (this.z - this.B >= 180.0F) {
/* 148:162 */       this.B += 360.0F;
/* 149:    */     }
/* 150:165 */     while (this.y - this.A < -180.0F) {
/* 151:166 */       this.A -= 360.0F;
/* 152:    */     }
/* 153:168 */     while (this.y - this.A >= 180.0F) {
/* 154:169 */       this.A += 360.0F;
/* 155:    */     }
/* 156:172 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 157:173 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/* 158:    */     
/* 159:175 */     float f2 = j();
/* 160:176 */     if (V())
/* 161:    */     {
/* 162:177 */       for (int k = 0; k < 4; k++)
/* 163:    */       {
/* 164:178 */         float f4 = 0.25F;
/* 165:179 */         this.o.a(ew.e, this.s - this.v * f4, this.t - this.w * f4, this.u - this.x * f4, this.v, this.w, this.x, new int[0]);
/* 166:    */       }
/* 167:181 */       f2 = 0.8F;
/* 168:    */     }
/* 169:184 */     this.v += this.b;
/* 170:185 */     this.w += this.c;
/* 171:186 */     this.x += this.d;
/* 172:187 */     this.v *= f2;
/* 173:188 */     this.w *= f2;
/* 174:189 */     this.x *= f2;
/* 175:    */     
/* 176:191 */     this.o.a(ew.l, this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
/* 177:    */     
/* 178:193 */     b(this.s, this.t, this.u);
/* 179:    */   }
/* 180:    */   
/* 181:    */   protected float j()
/* 182:    */   {
/* 183:197 */     return 0.95F;
/* 184:    */   }
/* 185:    */   
/* 186:    */   protected abstract void a(bru parambru);
/* 187:    */   
/* 188:    */   public void b(fn paramfn)
/* 189:    */   {
/* 190:204 */     paramfn.a("xTile", (short)this.e);
/* 191:205 */     paramfn.a("yTile", (short)this.f);
/* 192:206 */     paramfn.a("zTile", (short)this.g);
/* 193:207 */     oa localoa = (oa)atr.c.c(this.h);
/* 194:208 */     paramfn.a("inTile", localoa == null ? "" : localoa.toString());
/* 195:209 */     paramfn.a("inGround", (byte)(this.i ? 1 : 0));
/* 196:210 */     paramfn.a("direction", a(new double[] { this.v, this.w, this.x }));
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void a(fn paramfn)
/* 200:    */   {
/* 201:215 */     this.e = paramfn.e("xTile");
/* 202:216 */     this.f = paramfn.e("yTile");
/* 203:217 */     this.g = paramfn.e("zTile");
/* 204:218 */     if (paramfn.b("inTile", 8)) {
/* 205:219 */       this.h = atr.b(paramfn.j("inTile"));
/* 206:    */     } else {
/* 207:221 */       this.h = atr.c(paramfn.d("inTile") & 0xFF);
/* 208:    */     }
/* 209:223 */     this.i = (paramfn.d("inGround") == 1);
/* 210:227 */     if (paramfn.b("direction", 9))
/* 211:    */     {
/* 212:228 */       fv localfv = paramfn.c("direction", 6);
/* 213:229 */       this.v = localfv.d(0);
/* 214:230 */       this.w = localfv.d(1);
/* 215:231 */       this.x = localfv.d(2);
/* 216:    */     }
/* 217:    */     else
/* 218:    */     {
/* 219:233 */       J();
/* 220:    */     }
/* 221:    */   }
/* 222:    */   
/* 223:    */   public boolean ad()
/* 224:    */   {
/* 225:239 */     return true;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public float ao()
/* 229:    */   {
/* 230:244 */     return 1.0F;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public boolean a(wh paramwh, float paramFloat)
/* 234:    */   {
/* 235:249 */     if (b(paramwh)) {
/* 236:250 */       return false;
/* 237:    */     }
/* 238:252 */     ac();
/* 239:254 */     if (paramwh.j() != null)
/* 240:    */     {
/* 241:255 */       brw localbrw = paramwh.j().ap();
/* 242:256 */       if (localbrw != null)
/* 243:    */       {
/* 244:257 */         this.v = localbrw.a;
/* 245:258 */         this.w = localbrw.b;
/* 246:259 */         this.x = localbrw.c;
/* 247:260 */         this.b = (this.v * 0.1D);
/* 248:261 */         this.c = (this.w * 0.1D);
/* 249:262 */         this.d = (this.x * 0.1D);
/* 250:    */       }
/* 251:264 */       if ((paramwh.j() instanceof xm)) {
/* 252:265 */         this.a = ((xm)paramwh.j());
/* 253:    */       }
/* 254:267 */       return true;
/* 255:    */     }
/* 256:269 */     return false;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public float c(float paramFloat)
/* 260:    */   {
/* 261:274 */     return 1.0F;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public int b(float paramFloat)
/* 265:    */   {
/* 266:279 */     return 15728880;
/* 267:    */   }
/* 268:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahl
 * JD-Core Version:    0.7.0.1
 */