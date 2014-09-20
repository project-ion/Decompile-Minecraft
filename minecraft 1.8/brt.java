/*   1:    */ public class brt
/*   2:    */ {
/*   3:    */   public final double a;
/*   4:    */   public final double b;
/*   5:    */   public final double c;
/*   6:    */   public final double d;
/*   7:    */   public final double e;
/*   8:    */   public final double f;
/*   9:    */   
/*  10:    */   public brt(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  11:    */   {
/*  12: 11 */     this.a = Math.min(paramDouble1, paramDouble4);
/*  13: 12 */     this.b = Math.min(paramDouble2, paramDouble5);
/*  14: 13 */     this.c = Math.min(paramDouble3, paramDouble6);
/*  15: 14 */     this.d = Math.max(paramDouble1, paramDouble4);
/*  16: 15 */     this.e = Math.max(paramDouble2, paramDouble5);
/*  17: 16 */     this.f = Math.max(paramDouble3, paramDouble6);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public brt(dt paramdt1, dt paramdt2)
/*  21:    */   {
/*  22: 20 */     this.a = paramdt1.n();
/*  23: 21 */     this.b = paramdt1.o();
/*  24: 22 */     this.c = paramdt1.p();
/*  25: 23 */     this.d = paramdt2.n();
/*  26: 24 */     this.e = paramdt2.o();
/*  27: 25 */     this.f = paramdt2.p();
/*  28:    */   }
/*  29:    */   
/*  30:    */   public brt a(double paramDouble1, double paramDouble2, double paramDouble3)
/*  31:    */   {
/*  32: 29 */     double d1 = this.a;
/*  33: 30 */     double d2 = this.b;
/*  34: 31 */     double d3 = this.c;
/*  35: 32 */     double d4 = this.d;
/*  36: 33 */     double d5 = this.e;
/*  37: 34 */     double d6 = this.f;
/*  38: 36 */     if (paramDouble1 < 0.0D) {
/*  39: 37 */       d1 += paramDouble1;
/*  40: 38 */     } else if (paramDouble1 > 0.0D) {
/*  41: 39 */       d4 += paramDouble1;
/*  42:    */     }
/*  43: 42 */     if (paramDouble2 < 0.0D) {
/*  44: 43 */       d2 += paramDouble2;
/*  45: 44 */     } else if (paramDouble2 > 0.0D) {
/*  46: 45 */       d5 += paramDouble2;
/*  47:    */     }
/*  48: 48 */     if (paramDouble3 < 0.0D) {
/*  49: 49 */       d3 += paramDouble3;
/*  50: 50 */     } else if (paramDouble3 > 0.0D) {
/*  51: 51 */       d6 += paramDouble3;
/*  52:    */     }
/*  53: 54 */     return new brt(d1, d2, d3, d4, d5, d6);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public brt b(double paramDouble1, double paramDouble2, double paramDouble3)
/*  57:    */   {
/*  58: 58 */     double d1 = this.a - paramDouble1;
/*  59: 59 */     double d2 = this.b - paramDouble2;
/*  60: 60 */     double d3 = this.c - paramDouble3;
/*  61: 61 */     double d4 = this.d + paramDouble1;
/*  62: 62 */     double d5 = this.e + paramDouble2;
/*  63: 63 */     double d6 = this.f + paramDouble3;
/*  64:    */     
/*  65: 65 */     return new brt(d1, d2, d3, d4, d5, d6);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public brt a(brt parambrt)
/*  69:    */   {
/*  70: 69 */     double d1 = Math.min(this.a, parambrt.a);
/*  71: 70 */     double d2 = Math.min(this.b, parambrt.b);
/*  72: 71 */     double d3 = Math.min(this.c, parambrt.c);
/*  73: 72 */     double d4 = Math.max(this.d, parambrt.d);
/*  74: 73 */     double d5 = Math.max(this.e, parambrt.e);
/*  75: 74 */     double d6 = Math.max(this.f, parambrt.f);
/*  76:    */     
/*  77: 76 */     return new brt(d1, d2, d3, d4, d5, d6);
/*  78:    */   }
/*  79:    */   
/*  80:    */   public static brt a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  81:    */   {
/*  82: 80 */     double d1 = Math.min(paramDouble1, paramDouble4);
/*  83: 81 */     double d2 = Math.min(paramDouble2, paramDouble5);
/*  84: 82 */     double d3 = Math.min(paramDouble3, paramDouble6);
/*  85: 83 */     double d4 = Math.max(paramDouble1, paramDouble4);
/*  86: 84 */     double d5 = Math.max(paramDouble2, paramDouble5);
/*  87: 85 */     double d6 = Math.max(paramDouble3, paramDouble6);
/*  88:    */     
/*  89: 87 */     return new brt(d1, d2, d3, d4, d5, d6);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public brt c(double paramDouble1, double paramDouble2, double paramDouble3)
/*  93:    */   {
/*  94: 91 */     return new brt(this.a + paramDouble1, this.b + paramDouble2, this.c + paramDouble3, this.d + paramDouble1, this.e + paramDouble2, this.f + paramDouble3);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public double a(brt parambrt, double paramDouble)
/*  98:    */   {
/*  99: 96 */     if ((parambrt.e <= this.b) || (parambrt.b >= this.e) || (parambrt.f <= this.c) || (parambrt.c >= this.f)) {
/* 100: 97 */       return paramDouble;
/* 101:    */     }
/* 102:    */     double d1;
/* 103:101 */     if ((paramDouble > 0.0D) && (parambrt.d <= this.a))
/* 104:    */     {
/* 105:102 */       d1 = this.a - parambrt.d;
/* 106:103 */       if (d1 < paramDouble) {
/* 107:104 */         paramDouble = d1;
/* 108:    */       }
/* 109:    */     }
/* 110:106 */     else if ((paramDouble < 0.0D) && (parambrt.a >= this.d))
/* 111:    */     {
/* 112:107 */       d1 = this.d - parambrt.a;
/* 113:108 */       if (d1 > paramDouble) {
/* 114:109 */         paramDouble = d1;
/* 115:    */       }
/* 116:    */     }
/* 117:113 */     return paramDouble;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public double b(brt parambrt, double paramDouble)
/* 121:    */   {
/* 122:118 */     if ((parambrt.d <= this.a) || (parambrt.a >= this.d) || (parambrt.f <= this.c) || (parambrt.c >= this.f)) {
/* 123:119 */       return paramDouble;
/* 124:    */     }
/* 125:    */     double d1;
/* 126:123 */     if ((paramDouble > 0.0D) && (parambrt.e <= this.b))
/* 127:    */     {
/* 128:124 */       d1 = this.b - parambrt.e;
/* 129:125 */       if (d1 < paramDouble) {
/* 130:126 */         paramDouble = d1;
/* 131:    */       }
/* 132:    */     }
/* 133:128 */     else if ((paramDouble < 0.0D) && (parambrt.b >= this.e))
/* 134:    */     {
/* 135:129 */       d1 = this.e - parambrt.b;
/* 136:130 */       if (d1 > paramDouble) {
/* 137:131 */         paramDouble = d1;
/* 138:    */       }
/* 139:    */     }
/* 140:135 */     return paramDouble;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public double c(brt parambrt, double paramDouble)
/* 144:    */   {
/* 145:140 */     if ((parambrt.d <= this.a) || (parambrt.a >= this.d) || (parambrt.e <= this.b) || (parambrt.b >= this.e)) {
/* 146:141 */       return paramDouble;
/* 147:    */     }
/* 148:    */     double d1;
/* 149:145 */     if ((paramDouble > 0.0D) && (parambrt.f <= this.c))
/* 150:    */     {
/* 151:146 */       d1 = this.c - parambrt.f;
/* 152:147 */       if (d1 < paramDouble) {
/* 153:148 */         paramDouble = d1;
/* 154:    */       }
/* 155:    */     }
/* 156:150 */     else if ((paramDouble < 0.0D) && (parambrt.c >= this.f))
/* 157:    */     {
/* 158:151 */       d1 = this.f - parambrt.c;
/* 159:152 */       if (d1 > paramDouble) {
/* 160:153 */         paramDouble = d1;
/* 161:    */       }
/* 162:    */     }
/* 163:157 */     return paramDouble;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public boolean b(brt parambrt)
/* 167:    */   {
/* 168:161 */     if ((parambrt.d <= this.a) || (parambrt.a >= this.d)) {
/* 169:162 */       return false;
/* 170:    */     }
/* 171:164 */     if ((parambrt.e <= this.b) || (parambrt.b >= this.e)) {
/* 172:165 */       return false;
/* 173:    */     }
/* 174:167 */     if ((parambrt.f <= this.c) || (parambrt.c >= this.f)) {
/* 175:168 */       return false;
/* 176:    */     }
/* 177:170 */     return true;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public boolean a(brw parambrw)
/* 181:    */   {
/* 182:200 */     if ((parambrw.a <= this.a) || (parambrw.a >= this.d)) {
/* 183:201 */       return false;
/* 184:    */     }
/* 185:203 */     if ((parambrw.b <= this.b) || (parambrw.b >= this.e)) {
/* 186:204 */       return false;
/* 187:    */     }
/* 188:206 */     if ((parambrw.c <= this.c) || (parambrw.c >= this.f)) {
/* 189:207 */       return false;
/* 190:    */     }
/* 191:209 */     return true;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public double a()
/* 195:    */   {
/* 196:213 */     double d1 = this.d - this.a;
/* 197:214 */     double d2 = this.e - this.b;
/* 198:215 */     double d3 = this.f - this.c;
/* 199:216 */     return (d1 + d2 + d3) / 3.0D;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public brt d(double paramDouble1, double paramDouble2, double paramDouble3)
/* 203:    */   {
/* 204:220 */     double d1 = this.a + paramDouble1;
/* 205:221 */     double d2 = this.b + paramDouble2;
/* 206:222 */     double d3 = this.c + paramDouble3;
/* 207:223 */     double d4 = this.d - paramDouble1;
/* 208:224 */     double d5 = this.e - paramDouble2;
/* 209:225 */     double d6 = this.f - paramDouble3;
/* 210:    */     
/* 211:227 */     return new brt(d1, d2, d3, d4, d5, d6);
/* 212:    */   }
/* 213:    */   
/* 214:    */   public bru a(brw parambrw1, brw parambrw2)
/* 215:    */   {
/* 216:231 */     brw localbrw1 = parambrw1.a(parambrw2, this.a);
/* 217:232 */     brw localbrw2 = parambrw1.a(parambrw2, this.d);
/* 218:    */     
/* 219:234 */     brw localbrw3 = parambrw1.b(parambrw2, this.b);
/* 220:235 */     brw localbrw4 = parambrw1.b(parambrw2, this.e);
/* 221:    */     
/* 222:237 */     brw localbrw5 = parambrw1.c(parambrw2, this.c);
/* 223:238 */     brw localbrw6 = parambrw1.c(parambrw2, this.f);
/* 224:240 */     if (!b(localbrw1)) {
/* 225:241 */       localbrw1 = null;
/* 226:    */     }
/* 227:243 */     if (!b(localbrw2)) {
/* 228:244 */       localbrw2 = null;
/* 229:    */     }
/* 230:246 */     if (!c(localbrw3)) {
/* 231:247 */       localbrw3 = null;
/* 232:    */     }
/* 233:249 */     if (!c(localbrw4)) {
/* 234:250 */       localbrw4 = null;
/* 235:    */     }
/* 236:252 */     if (!d(localbrw5)) {
/* 237:253 */       localbrw5 = null;
/* 238:    */     }
/* 239:255 */     if (!d(localbrw6)) {
/* 240:256 */       localbrw6 = null;
/* 241:    */     }
/* 242:259 */     brw localbrw7 = null;
/* 243:261 */     if (localbrw1 != null) {
/* 244:262 */       localbrw7 = localbrw1;
/* 245:    */     }
/* 246:264 */     if ((localbrw2 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw2) < parambrw1.g(localbrw7)))) {
/* 247:265 */       localbrw7 = localbrw2;
/* 248:    */     }
/* 249:267 */     if ((localbrw3 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw3) < parambrw1.g(localbrw7)))) {
/* 250:268 */       localbrw7 = localbrw3;
/* 251:    */     }
/* 252:270 */     if ((localbrw4 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw4) < parambrw1.g(localbrw7)))) {
/* 253:271 */       localbrw7 = localbrw4;
/* 254:    */     }
/* 255:273 */     if ((localbrw5 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw5) < parambrw1.g(localbrw7)))) {
/* 256:274 */       localbrw7 = localbrw5;
/* 257:    */     }
/* 258:276 */     if ((localbrw6 != null) && ((localbrw7 == null) || (parambrw1.g(localbrw6) < parambrw1.g(localbrw7)))) {
/* 259:277 */       localbrw7 = localbrw6;
/* 260:    */     }
/* 261:280 */     if (localbrw7 == null) {
/* 262:281 */       return null;
/* 263:    */     }
/* 264:284 */     ej localej = null;
/* 265:286 */     if (localbrw7 == localbrw1) {
/* 266:287 */       localej = ej.e;
/* 267:288 */     } else if (localbrw7 == localbrw2) {
/* 268:289 */       localej = ej.f;
/* 269:290 */     } else if (localbrw7 == localbrw3) {
/* 270:291 */       localej = ej.a;
/* 271:292 */     } else if (localbrw7 == localbrw4) {
/* 272:293 */       localej = ej.b;
/* 273:294 */     } else if (localbrw7 == localbrw5) {
/* 274:295 */       localej = ej.c;
/* 275:    */     } else {
/* 276:297 */       localej = ej.d;
/* 277:    */     }
/* 278:300 */     return new bru(localbrw7, localej);
/* 279:    */   }
/* 280:    */   
/* 281:    */   private boolean b(brw parambrw)
/* 282:    */   {
/* 283:304 */     if (parambrw == null) {
/* 284:305 */       return false;
/* 285:    */     }
/* 286:307 */     return (parambrw.b >= this.b) && (parambrw.b <= this.e) && (parambrw.c >= this.c) && (parambrw.c <= this.f);
/* 287:    */   }
/* 288:    */   
/* 289:    */   private boolean c(brw parambrw)
/* 290:    */   {
/* 291:311 */     if (parambrw == null) {
/* 292:312 */       return false;
/* 293:    */     }
/* 294:314 */     return (parambrw.a >= this.a) && (parambrw.a <= this.d) && (parambrw.c >= this.c) && (parambrw.c <= this.f);
/* 295:    */   }
/* 296:    */   
/* 297:    */   private boolean d(brw parambrw)
/* 298:    */   {
/* 299:318 */     if (parambrw == null) {
/* 300:319 */       return false;
/* 301:    */     }
/* 302:321 */     return (parambrw.a >= this.a) && (parambrw.a <= this.d) && (parambrw.b >= this.b) && (parambrw.b <= this.e);
/* 303:    */   }
/* 304:    */   
/* 305:    */   public String toString()
/* 306:    */   {
/* 307:325 */     return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
/* 308:    */   }
/* 309:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     brt
 * JD-Core Version:    0.7.0.1
 */