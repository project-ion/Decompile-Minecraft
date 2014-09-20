/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class xk
/*   4:    */   extends wv
/*   5:    */ {
/*   6:    */   public int a;
/*   7:    */   public int b;
/*   8:    */   public int c;
/*   9: 19 */   private int d = 5;
/*  10:    */   private int e;
/*  11:    */   private ahd f;
/*  12:    */   private int g;
/*  13:    */   
/*  14:    */   public xk(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
/*  15:    */   {
/*  16: 25 */     super(paramaqu);
/*  17: 26 */     a(0.5F, 0.5F);
/*  18: 27 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  19:    */     
/*  20: 29 */     this.y = ((float)(Math.random() * 360.0D));
/*  21:    */     
/*  22: 31 */     this.v = ((float)(Math.random() * 0.2000000029802322D - 0.1000000014901161D) * 2.0F);
/*  23: 32 */     this.w = ((float)(Math.random() * 0.2D) * 2.0F);
/*  24: 33 */     this.x = ((float)(Math.random() * 0.2000000029802322D - 0.1000000014901161D) * 2.0F);
/*  25:    */     
/*  26: 35 */     this.e = paramInt;
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected boolean r_()
/*  30:    */   {
/*  31: 40 */     return false;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public xk(aqu paramaqu)
/*  35:    */   {
/*  36: 44 */     super(paramaqu);
/*  37: 45 */     a(0.25F, 0.25F);
/*  38:    */   }
/*  39:    */   
/*  40:    */   protected void h() {}
/*  41:    */   
/*  42:    */   public int b(float paramFloat)
/*  43:    */   {
/*  44: 54 */     float f1 = 0.5F;
/*  45: 55 */     f1 = uv.a(f1, 0.0F, 1.0F);
/*  46: 56 */     int i = super.b(paramFloat);
/*  47:    */     
/*  48: 58 */     int j = i & 0xFF;
/*  49: 59 */     int k = i >> 16 & 0xFF;
/*  50: 60 */     j += (int)(f1 * 15.0F * 16.0F);
/*  51: 61 */     if (j > 240) {
/*  52: 62 */       j = 240;
/*  53:    */     }
/*  54: 64 */     return j | k << 16;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void s_()
/*  58:    */   {
/*  59: 69 */     super.s_();
/*  60: 70 */     if (this.c > 0) {
/*  61: 71 */       this.c -= 1;
/*  62:    */     }
/*  63: 73 */     this.p = this.s;
/*  64: 74 */     this.q = this.t;
/*  65: 75 */     this.r = this.u;
/*  66:    */     
/*  67: 77 */     this.w -= 0.02999999932944775D;
/*  68: 78 */     if (this.o.p(new dt(this)).c().r() == bof.i)
/*  69:    */     {
/*  70: 79 */       this.w = 0.2000000029802322D;
/*  71: 80 */       this.v = ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
/*  72: 81 */       this.x = ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
/*  73: 82 */       a("random.fizz", 0.4F, 2.0F + this.V.nextFloat() * 0.4F);
/*  74:    */     }
/*  75: 84 */     j(this.s, (aQ().b + aQ().e) / 2.0D, this.u);
/*  76:    */     
/*  77: 86 */     double d1 = 8.0D;
/*  78: 89 */     if (this.g < this.a - 20 + F() % 100)
/*  79:    */     {
/*  80: 90 */       if ((this.f == null) || (this.f.h(this) > d1 * d1)) {
/*  81: 91 */         this.f = this.o.a(this, d1);
/*  82:    */       }
/*  83: 93 */       this.g = this.a;
/*  84:    */     }
/*  85: 96 */     if ((this.f != null) && (this.f.v())) {
/*  86: 97 */       this.f = null;
/*  87:    */     }
/*  88:100 */     if (this.f != null)
/*  89:    */     {
/*  90:101 */       double d2 = (this.f.s - this.s) / d1;
/*  91:102 */       double d3 = (this.f.t + this.f.aR() - this.t) / d1;
/*  92:103 */       double d4 = (this.f.u - this.u) / d1;
/*  93:104 */       double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
/*  94:105 */       double d6 = 1.0D - d5;
/*  95:106 */       if (d6 > 0.0D)
/*  96:    */       {
/*  97:107 */         d6 *= d6;
/*  98:108 */         this.v += d2 / d5 * d6 * 0.1D;
/*  99:109 */         this.w += d3 / d5 * d6 * 0.1D;
/* 100:110 */         this.x += d4 / d5 * d6 * 0.1D;
/* 101:    */       }
/* 102:    */     }
/* 103:114 */     d(this.v, this.w, this.x);
/* 104:    */     
/* 105:116 */     float f1 = 0.98F;
/* 106:117 */     if (this.C) {
/* 107:118 */       f1 = this.o.p(new dt(uv.c(this.s), uv.c(aQ().b) - 1, uv.c(this.u))).c().K * 0.98F;
/* 108:    */     }
/* 109:121 */     this.v *= f1;
/* 110:122 */     this.w *= 0.9800000190734863D;
/* 111:123 */     this.x *= f1;
/* 112:125 */     if (this.C) {
/* 113:126 */       this.w *= -0.8999999761581421D;
/* 114:    */     }
/* 115:129 */     this.a += 1;
/* 116:    */     
/* 117:131 */     this.b += 1;
/* 118:132 */     if (this.b >= 6000) {
/* 119:133 */       J();
/* 120:    */     }
/* 121:    */   }
/* 122:    */   
/* 123:    */   public boolean W()
/* 124:    */   {
/* 125:139 */     return this.o.a(aQ(), bof.h, this);
/* 126:    */   }
/* 127:    */   
/* 128:    */   protected void f(int paramInt)
/* 129:    */   {
/* 130:144 */     a(wh.a, paramInt);
/* 131:    */   }
/* 132:    */   
/* 133:    */   public boolean a(wh paramwh, float paramFloat)
/* 134:    */   {
/* 135:149 */     if (b(paramwh)) {
/* 136:150 */       return false;
/* 137:    */     }
/* 138:152 */     ac();
/* 139:153 */     this.d = ((int)(this.d - paramFloat));
/* 140:154 */     if (this.d <= 0) {
/* 141:155 */       J();
/* 142:    */     }
/* 143:157 */     return false;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void b(fn paramfn)
/* 147:    */   {
/* 148:162 */     paramfn.a("Health", (short)(byte)this.d);
/* 149:163 */     paramfn.a("Age", (short)this.b);
/* 150:164 */     paramfn.a("Value", (short)this.e);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void a(fn paramfn)
/* 154:    */   {
/* 155:169 */     this.d = (paramfn.e("Health") & 0xFF);
/* 156:170 */     this.b = paramfn.e("Age");
/* 157:171 */     this.e = paramfn.e("Value");
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void d(ahd paramahd)
/* 161:    */   {
/* 162:176 */     if (this.o.D) {
/* 163:177 */       return;
/* 164:    */     }
/* 165:180 */     if ((this.c == 0) && (paramahd.bn == 0))
/* 166:    */     {
/* 167:181 */       paramahd.bn = 2;
/* 168:182 */       this.o.a(paramahd, "random.orb", 0.1F, 0.5F * ((this.V.nextFloat() - this.V.nextFloat()) * 0.7F + 1.8F));
/* 169:183 */       paramahd.a(this, 1);
/* 170:184 */       paramahd.u(this.e);
/* 171:185 */       J();
/* 172:    */     }
/* 173:    */   }
/* 174:    */   
/* 175:    */   public int j()
/* 176:    */   {
/* 177:190 */     return this.e;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public int l()
/* 181:    */   {
/* 182:194 */     if (this.e >= 2477) {
/* 183:195 */       return 10;
/* 184:    */     }
/* 185:196 */     if (this.e >= 1237) {
/* 186:197 */       return 9;
/* 187:    */     }
/* 188:198 */     if (this.e >= 617) {
/* 189:199 */       return 8;
/* 190:    */     }
/* 191:200 */     if (this.e >= 307) {
/* 192:201 */       return 7;
/* 193:    */     }
/* 194:202 */     if (this.e >= 149) {
/* 195:203 */       return 6;
/* 196:    */     }
/* 197:204 */     if (this.e >= 73) {
/* 198:205 */       return 5;
/* 199:    */     }
/* 200:206 */     if (this.e >= 37) {
/* 201:207 */       return 4;
/* 202:    */     }
/* 203:208 */     if (this.e >= 17) {
/* 204:209 */       return 3;
/* 205:    */     }
/* 206:210 */     if (this.e >= 7) {
/* 207:211 */       return 2;
/* 208:    */     }
/* 209:212 */     if (this.e >= 3) {
/* 210:213 */       return 1;
/* 211:    */     }
/* 212:216 */     return 0;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public static int a(int paramInt)
/* 216:    */   {
/* 217:228 */     if (paramInt >= 2477) {
/* 218:229 */       return 2477;
/* 219:    */     }
/* 220:230 */     if (paramInt >= 1237) {
/* 221:231 */       return 1237;
/* 222:    */     }
/* 223:232 */     if (paramInt >= 617) {
/* 224:233 */       return 617;
/* 225:    */     }
/* 226:234 */     if (paramInt >= 307) {
/* 227:235 */       return 307;
/* 228:    */     }
/* 229:236 */     if (paramInt >= 149) {
/* 230:237 */       return 149;
/* 231:    */     }
/* 232:238 */     if (paramInt >= 73) {
/* 233:239 */       return 73;
/* 234:    */     }
/* 235:240 */     if (paramInt >= 37) {
/* 236:241 */       return 37;
/* 237:    */     }
/* 238:242 */     if (paramInt >= 17) {
/* 239:243 */       return 17;
/* 240:    */     }
/* 241:244 */     if (paramInt >= 7) {
/* 242:245 */       return 7;
/* 243:    */     }
/* 244:246 */     if (paramInt >= 3) {
/* 245:247 */       return 3;
/* 246:    */     }
/* 247:250 */     return 1;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public boolean aE()
/* 251:    */   {
/* 252:255 */     return false;
/* 253:    */   }
/* 254:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     xk
 * JD-Core Version:    0.7.0.1
 */