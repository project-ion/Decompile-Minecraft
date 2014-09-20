/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bhd
/*   6:    */   extends bhc
/*   7:    */ {
/*   8:    */   private Random k;
/*   9:    */   private aqu l;
/*  10: 31 */   private dt m = dt.a;
/*  11:    */   int a;
/*  12:    */   int b;
/*  13: 35 */   double c = 0.618D;
/*  14: 36 */   double d = 0.381D;
/*  15: 37 */   double e = 1.0D;
/*  16: 38 */   double f = 1.0D;
/*  17: 39 */   int g = 1;
/*  18: 40 */   int h = 12;
/*  19: 41 */   int i = 4;
/*  20:    */   List j;
/*  21:    */   
/*  22:    */   public bhd(boolean paramBoolean)
/*  23:    */   {
/*  24: 46 */     super(paramBoolean);
/*  25:    */   }
/*  26:    */   
/*  27:    */   void a()
/*  28:    */   {
/*  29: 50 */     this.b = ((int)(this.a * this.c));
/*  30: 51 */     if (this.b >= this.a) {
/*  31: 52 */       this.b = (this.a - 1);
/*  32:    */     }
/*  33: 56 */     int n = (int)(1.382D + Math.pow(this.f * this.a / 13.0D, 2.0D));
/*  34: 57 */     if (n < 1) {
/*  35: 58 */       n = 1;
/*  36:    */     }
/*  37: 61 */     int i1 = this.m.o() + this.b;
/*  38: 62 */     int i2 = this.a - this.i;
/*  39:    */     
/*  40: 64 */     this.j = Lists.newArrayList();
/*  41: 65 */     this.j.add(new bhe(this.m.b(i2), i1));
/*  42: 67 */     for (; i2 >= 0; i2--)
/*  43:    */     {
/*  44: 68 */       float f1 = a(i2);
/*  45: 69 */       if (f1 >= 0.0F) {
/*  46: 73 */         for (int i3 = 0; i3 < n; i3++)
/*  47:    */         {
/*  48: 74 */           double d1 = this.e * f1 * (this.k.nextFloat() + 0.328D);
/*  49: 75 */           double d2 = this.k.nextFloat() * 2.0F * 3.141592653589793D;
/*  50:    */           
/*  51: 77 */           double d3 = d1 * Math.sin(d2) + 0.5D;
/*  52: 78 */           double d4 = d1 * Math.cos(d2) + 0.5D;
/*  53:    */           
/*  54: 80 */           dt localdt1 = this.m.a(d3, i2 - 1, d4);
/*  55: 81 */           dt localdt2 = localdt1.b(this.i);
/*  56: 84 */           if (a(localdt1, localdt2) == -1)
/*  57:    */           {
/*  58: 86 */             int i4 = this.m.n() - localdt1.n();
/*  59: 87 */             int i5 = this.m.p() - localdt1.p();
/*  60:    */             
/*  61: 89 */             double d5 = localdt1.o() - Math.sqrt(i4 * i4 + i5 * i5) * this.d;
/*  62: 90 */             int i6 = d5 > i1 ? i1 : (int)d5;
/*  63: 91 */             dt localdt3 = new dt(this.m.n(), i6, this.m.p());
/*  64: 94 */             if (a(localdt3, localdt1) == -1) {
/*  65: 96 */               this.j.add(new bhe(localdt1, localdt3.o()));
/*  66:    */             }
/*  67:    */           }
/*  68:    */         }
/*  69:    */       }
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   void a(dt paramdt, float paramFloat, atr paramatr)
/*  74:    */   {
/*  75:105 */     int n = (int)(paramFloat + 0.618D);
/*  76:107 */     for (int i1 = -n; i1 <= n; i1++) {
/*  77:108 */       for (int i2 = -n; i2 <= n; i2++) {
/*  78:109 */         if (Math.pow(Math.abs(i1) + 0.5D, 2.0D) + Math.pow(Math.abs(i2) + 0.5D, 2.0D) <= paramFloat * paramFloat)
/*  79:    */         {
/*  80:110 */           dt localdt = paramdt.a(i1, 0, i2);
/*  81:    */           
/*  82:    */ 
/*  83:    */ 
/*  84:114 */           bof localbof = this.l.p(localdt).c().r();
/*  85:115 */           if ((localbof == bof.a) || (localbof == bof.j)) {
/*  86:116 */             a(this.l, localdt, paramatr, 0);
/*  87:    */           }
/*  88:    */         }
/*  89:    */       }
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   float a(int paramInt)
/*  94:    */   {
/*  95:125 */     if (paramInt < this.a * 0.3F) {
/*  96:126 */       return -1.0F;
/*  97:    */     }
/*  98:129 */     float f1 = this.a / 2.0F;
/*  99:130 */     float f2 = f1 - paramInt;
/* 100:    */     
/* 101:132 */     float f3 = uv.c(f1 * f1 - f2 * f2);
/* 102:133 */     if (f2 == 0.0F) {
/* 103:134 */       f3 = f1;
/* 104:135 */     } else if (Math.abs(f2) >= f1) {
/* 105:136 */       return 0.0F;
/* 106:    */     }
/* 107:139 */     return f3 * 0.5F;
/* 108:    */   }
/* 109:    */   
/* 110:    */   float b(int paramInt)
/* 111:    */   {
/* 112:143 */     if ((paramInt < 0) || (paramInt >= this.i)) {
/* 113:144 */       return -1.0F;
/* 114:    */     }
/* 115:146 */     if ((paramInt == 0) || (paramInt == this.i - 1)) {
/* 116:147 */       return 2.0F;
/* 117:    */     }
/* 118:156 */     return 3.0F;
/* 119:    */   }
/* 120:    */   
/* 121:    */   void a(dt paramdt)
/* 122:    */   {
/* 123:161 */     for (int n = 0; n < this.i; n++) {
/* 124:162 */       a(paramdt.b(n), b(n), aty.t);
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   void a(dt paramdt1, dt paramdt2, atr paramatr)
/* 129:    */   {
/* 130:167 */     dt localdt1 = paramdt2.a(-paramdt1.n(), -paramdt1.o(), -paramdt1.p());
/* 131:    */     
/* 132:169 */     int n = b(localdt1);
/* 133:    */     
/* 134:171 */     float f1 = localdt1.n() / n;
/* 135:172 */     float f2 = localdt1.o() / n;
/* 136:173 */     float f3 = localdt1.p() / n;
/* 137:175 */     for (int i1 = 0; i1 <= n; i1++)
/* 138:    */     {
/* 139:176 */       dt localdt2 = paramdt1.a(0.5F + i1 * f1, 0.5F + i1 * f2, 0.5F + i1 * f3);
/* 140:177 */       axo localaxo = b(paramdt1, localdt2);
/* 141:    */       
/* 142:179 */       a(this.l, localdt2, paramatr.P().a(axm.a, localaxo));
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   private int b(dt paramdt)
/* 147:    */   {
/* 148:184 */     int n = uv.a(paramdt.n());
/* 149:185 */     int i1 = uv.a(paramdt.o());
/* 150:186 */     int i2 = uv.a(paramdt.p());
/* 151:188 */     if ((i2 > n) && (i2 > i1)) {
/* 152:189 */       return i2;
/* 153:    */     }
/* 154:190 */     if (i1 > n) {
/* 155:191 */       return i1;
/* 156:    */     }
/* 157:194 */     return n;
/* 158:    */   }
/* 159:    */   
/* 160:    */   private axo b(dt paramdt1, dt paramdt2)
/* 161:    */   {
/* 162:198 */     axo localaxo = axo.b;
/* 163:199 */     int n = Math.abs(paramdt2.n() - paramdt1.n());
/* 164:200 */     int i1 = Math.abs(paramdt2.p() - paramdt1.p());
/* 165:201 */     int i2 = Math.max(n, i1);
/* 166:203 */     if (i2 > 0) {
/* 167:204 */       if (n == i2) {
/* 168:205 */         localaxo = axo.a;
/* 169:206 */       } else if (i1 == i2) {
/* 170:207 */         localaxo = axo.c;
/* 171:    */       }
/* 172:    */     }
/* 173:210 */     return localaxo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   void b()
/* 177:    */   {
/* 178:215 */     for (bhe localbhe : this.j) {
/* 179:216 */       a(localbhe);
/* 180:    */     }
/* 181:    */   }
/* 182:    */   
/* 183:    */   boolean c(int paramInt)
/* 184:    */   {
/* 185:221 */     return paramInt >= this.a * 0.2D;
/* 186:    */   }
/* 187:    */   
/* 188:    */   void c()
/* 189:    */   {
/* 190:226 */     dt localdt1 = this.m;
/* 191:227 */     dt localdt2 = this.m.b(this.b);
/* 192:228 */     atr localatr = aty.r;
/* 193:    */     
/* 194:230 */     a(localdt1, localdt2, localatr);
/* 195:231 */     if (this.g == 2)
/* 196:    */     {
/* 197:232 */       a(localdt1.f(), localdt2.f(), localatr);
/* 198:233 */       a(localdt1.f().d(), localdt2.f().d(), localatr);
/* 199:234 */       a(localdt1.d(), localdt2.d(), localatr);
/* 200:    */     }
/* 201:    */   }
/* 202:    */   
/* 203:    */   void d()
/* 204:    */   {
/* 205:239 */     for (bhe localbhe : this.j)
/* 206:    */     {
/* 207:240 */       int n = localbhe.q();
/* 208:241 */       dt localdt = new dt(this.m.n(), n, this.m.p());
/* 209:243 */       if (c(n - this.m.o())) {
/* 210:244 */         a(localdt, localbhe, aty.r);
/* 211:    */       }
/* 212:    */     }
/* 213:    */   }
/* 214:    */   
/* 215:    */   int a(dt paramdt1, dt paramdt2)
/* 216:    */   {
/* 217:250 */     dt localdt1 = paramdt2.a(-paramdt1.n(), -paramdt1.o(), -paramdt1.p());
/* 218:    */     
/* 219:252 */     int n = b(localdt1);
/* 220:    */     
/* 221:254 */     float f1 = localdt1.n() / n;
/* 222:255 */     float f2 = localdt1.o() / n;
/* 223:256 */     float f3 = localdt1.p() / n;
/* 224:259 */     if (n == 0) {
/* 225:260 */       return -1;
/* 226:    */     }
/* 227:263 */     for (int i1 = 0; i1 <= n; i1++)
/* 228:    */     {
/* 229:264 */       dt localdt2 = paramdt1.a(0.5F + i1 * f1, 0.5F + i1 * f2, 0.5F + i1 * f3);
/* 230:266 */       if (!a(this.l.p(localdt2).c())) {
/* 231:267 */         return i1;
/* 232:    */       }
/* 233:    */     }
/* 234:271 */     return -1;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public void e()
/* 238:    */   {
/* 239:291 */     this.i = 5;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 243:    */   {
/* 244:296 */     this.l = paramaqu;
/* 245:297 */     this.m = paramdt;
/* 246:    */     
/* 247:299 */     this.k = new Random(paramRandom.nextLong());
/* 248:301 */     if (this.a == 0) {
/* 249:302 */       this.a = (5 + this.k.nextInt(this.h));
/* 250:    */     }
/* 251:305 */     if (!f()) {
/* 252:306 */       return false;
/* 253:    */     }
/* 254:309 */     a();
/* 255:310 */     b();
/* 256:311 */     c();
/* 257:312 */     d();
/* 258:    */     
/* 259:314 */     return true;
/* 260:    */   }
/* 261:    */   
/* 262:    */   private boolean f()
/* 263:    */   {
/* 264:320 */     atr localatr = this.l.p(this.m.b()).c();
/* 265:321 */     if ((localatr != aty.d) && (localatr != aty.c) && (localatr != aty.ak)) {
/* 266:322 */       return false;
/* 267:    */     }
/* 268:325 */     int n = a(this.m, this.m.b(this.a - 1));
/* 269:328 */     if (n == -1) {
/* 270:329 */       return true;
/* 271:    */     }
/* 272:333 */     if (n < 6) {
/* 273:334 */       return false;
/* 274:    */     }
/* 275:337 */     this.a = n;
/* 276:338 */     return true;
/* 277:    */   }
/* 278:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhd
 * JD-Core Version:    0.7.0.1
 */