/*   1:    */ public class clm
/*   2:    */ {
/*   3: 17 */   private cue[] a = new cue[2];
/*   4: 18 */   private cue[] b = new cue[2];
/*   5:    */   
/*   6:    */   public clm()
/*   7:    */   {
/*   8: 21 */     a();
/*   9:    */   }
/*  10:    */   
/*  11:    */   protected void a()
/*  12:    */   {
/*  13: 25 */     cua localcua = bsu.z().R();
/*  14: 26 */     this.a[0] = localcua.a("minecraft:blocks/lava_still");
/*  15: 27 */     this.a[1] = localcua.a("minecraft:blocks/lava_flow");
/*  16: 28 */     this.b[0] = localcua.a("minecraft:blocks/water_still");
/*  17: 29 */     this.b[1] = localcua.a("minecraft:blocks/water_flow");
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean a(ard paramard, bec parambec, dt paramdt, civ paramciv)
/*  21:    */   {
/*  22: 33 */     axl localaxl = (axl)parambec.c();
/*  23: 34 */     localaxl.a(paramard, paramdt);
/*  24:    */     
/*  25: 36 */     cue[] arrayOfcue = localaxl.r() == bof.i ? this.a : this.b;
/*  26:    */     
/*  27:    */ 
/*  28: 39 */     int i = localaxl.d(paramard, paramdt);
/*  29: 40 */     float f1 = (i >> 16 & 0xFF) / 255.0F;
/*  30: 41 */     float f2 = (i >> 8 & 0xFF) / 255.0F;
/*  31: 42 */     float f3 = (i & 0xFF) / 255.0F;
/*  32: 43 */     boolean bool1 = localaxl.a(paramard, paramdt.a(), ej.b);
/*  33: 44 */     boolean bool2 = localaxl.a(paramard, paramdt.b(), ej.a);
/*  34: 45 */     boolean[] arrayOfBoolean = new boolean[4];
/*  35: 46 */     arrayOfBoolean[0] = localaxl.a(paramard, paramdt.c(), ej.c);
/*  36: 47 */     arrayOfBoolean[1] = localaxl.a(paramard, paramdt.d(), ej.d);
/*  37: 48 */     arrayOfBoolean[2] = localaxl.a(paramard, paramdt.e(), ej.e);
/*  38: 49 */     arrayOfBoolean[3] = localaxl.a(paramard, paramdt.f(), ej.f);
/*  39: 51 */     if ((!bool1) && (!bool2) && (arrayOfBoolean[0] == 0) && (arrayOfBoolean[1] == 0) && (arrayOfBoolean[2] == 0) && (arrayOfBoolean[3] == 0)) {
/*  40: 52 */       return false;
/*  41:    */     }
/*  42: 55 */     boolean bool3 = false;
/*  43: 56 */     float f4 = 0.5F;
/*  44: 57 */     float f5 = 1.0F;
/*  45: 58 */     float f6 = 0.8F;
/*  46: 59 */     float f7 = 0.6F;
/*  47:    */     
/*  48: 61 */     bof localbof = localaxl.r();
/*  49:    */     
/*  50: 63 */     float f8 = a(paramard, paramdt, localbof);
/*  51: 64 */     float f9 = a(paramard, paramdt.d(), localbof);
/*  52: 65 */     float f10 = a(paramard, paramdt.f().d(), localbof);
/*  53: 66 */     float f11 = a(paramard, paramdt.f(), localbof);
/*  54:    */     
/*  55: 68 */     double d1 = paramdt.n();
/*  56: 69 */     double d2 = paramdt.o();
/*  57: 70 */     double d3 = paramdt.p();
/*  58:    */     
/*  59: 72 */     float f12 = 0.001F;
/*  60:    */     cue localcue;
/*  61:    */     float f13;
/*  62:    */     float f14;
/*  63:    */     float f18;
/*  64:    */     float f15;
/*  65:    */     float f16;
/*  66:    */     float f17;
/*  67: 75 */     if (bool1)
/*  68:    */     {
/*  69: 76 */       bool3 = true;
/*  70: 77 */       localcue = arrayOfcue[0];
/*  71: 78 */       f13 = (float)axl.a(paramard, paramdt, localbof);
/*  72: 79 */       if (f13 > -999.0F) {
/*  73: 80 */         localcue = arrayOfcue[1];
/*  74:    */       }
/*  75: 83 */       f8 -= f12;
/*  76: 84 */       f9 -= f12;
/*  77: 85 */       f10 -= f12;
/*  78: 86 */       f11 -= f12;
/*  79:    */       float f19;
/*  80:    */       float f20;
/*  81:    */       float f21;
/*  82: 91 */       if (f13 < -999.0F)
/*  83:    */       {
/*  84: 92 */         f14 = localcue.a(0.0D);
/*  85: 93 */         f18 = localcue.b(0.0D);
/*  86: 94 */         f15 = f14;
/*  87: 95 */         f19 = localcue.b(16.0D);
/*  88: 96 */         f16 = localcue.a(16.0D);
/*  89: 97 */         f20 = f19;
/*  90: 98 */         f17 = f16;
/*  91: 99 */         f21 = f18;
/*  92:    */       }
/*  93:    */       else
/*  94:    */       {
/*  95:101 */         float f22 = uv.a(f13) * 0.25F;
/*  96:102 */         float f23 = uv.b(f13) * 0.25F;
/*  97:103 */         float f24 = 8.0F;
/*  98:104 */         f14 = localcue.a(8.0F + (-f23 - f22) * 16.0F);
/*  99:105 */         f18 = localcue.b(8.0F + (-f23 + f22) * 16.0F);
/* 100:106 */         f15 = localcue.a(8.0F + (-f23 + f22) * 16.0F);
/* 101:107 */         f19 = localcue.b(8.0F + (f23 + f22) * 16.0F);
/* 102:108 */         f16 = localcue.a(8.0F + (f23 + f22) * 16.0F);
/* 103:109 */         f20 = localcue.b(8.0F + (f23 - f22) * 16.0F);
/* 104:110 */         f17 = localcue.a(8.0F + (f23 - f22) * 16.0F);
/* 105:111 */         f21 = localcue.b(8.0F + (-f23 - f22) * 16.0F);
/* 106:    */       }
/* 107:114 */       paramciv.b(localaxl.c(paramard, paramdt));
/* 108:115 */       paramciv.b(f5 * f1, f5 * f2, f5 * f3);
/* 109:116 */       paramciv.a(d1 + 0.0D, d2 + f8, d3 + 0.0D, f14, f18);
/* 110:117 */       paramciv.a(d1 + 0.0D, d2 + f9, d3 + 1.0D, f15, f19);
/* 111:118 */       paramciv.a(d1 + 1.0D, d2 + f10, d3 + 1.0D, f16, f20);
/* 112:119 */       paramciv.a(d1 + 1.0D, d2 + f11, d3 + 0.0D, f17, f21);
/* 113:121 */       if (localaxl.g(paramard, paramdt.a()))
/* 114:    */       {
/* 115:123 */         paramciv.a(d1 + 0.0D, d2 + f8, d3 + 0.0D, f14, f18);
/* 116:124 */         paramciv.a(d1 + 1.0D, d2 + f11, d3 + 0.0D, f17, f21);
/* 117:125 */         paramciv.a(d1 + 1.0D, d2 + f10, d3 + 1.0D, f16, f20);
/* 118:126 */         paramciv.a(d1 + 0.0D, d2 + f9, d3 + 1.0D, f15, f19);
/* 119:    */       }
/* 120:    */     }
/* 121:130 */     if (bool2)
/* 122:    */     {
/* 123:131 */       paramciv.b(localaxl.c(paramard, paramdt.b()));
/* 124:132 */       paramciv.b(f4, f4, f4);
/* 125:    */       
/* 126:134 */       f13 = arrayOfcue[0].e();
/* 127:135 */       f14 = arrayOfcue[0].f();
/* 128:136 */       f15 = arrayOfcue[0].g();
/* 129:137 */       f16 = arrayOfcue[0].h();
/* 130:    */       
/* 131:139 */       paramciv.a(d1, d2, d3 + 1.0D, f13, f16);
/* 132:140 */       paramciv.a(d1, d2, d3, f13, f15);
/* 133:141 */       paramciv.a(d1 + 1.0D, d2, d3, f14, f15);
/* 134:142 */       paramciv.a(d1 + 1.0D, d2, d3 + 1.0D, f14, f16);
/* 135:143 */       bool3 = true;
/* 136:    */     }
/* 137:146 */     for (int j = 0; j < 4; j++)
/* 138:    */     {
/* 139:147 */       int k = 0;
/* 140:148 */       int m = 0;
/* 141:149 */       if (j == 0) {
/* 142:150 */         m--;
/* 143:    */       }
/* 144:152 */       if (j == 1) {
/* 145:153 */         m++;
/* 146:    */       }
/* 147:155 */       if (j == 2) {
/* 148:156 */         k--;
/* 149:    */       }
/* 150:158 */       if (j == 3) {
/* 151:159 */         k++;
/* 152:    */       }
/* 153:162 */       dt localdt = paramdt.a(k, 0, m);
/* 154:    */       
/* 155:164 */       localcue = arrayOfcue[1];
/* 156:166 */       if (arrayOfBoolean[j] != 0)
/* 157:    */       {
/* 158:    */         double d4;
/* 159:    */         double d6;
/* 160:    */         double d5;
/* 161:    */         double d7;
/* 162:170 */         if (j == 0)
/* 163:    */         {
/* 164:171 */           f17 = f8;
/* 165:172 */           f18 = f11;
/* 166:173 */           d4 = d1;
/* 167:174 */           d6 = d1 + 1.0D;
/* 168:175 */           d5 = d3 + f12;
/* 169:176 */           d7 = d3 + f12;
/* 170:    */         }
/* 171:177 */         else if (j == 1)
/* 172:    */         {
/* 173:178 */           f17 = f10;
/* 174:179 */           f18 = f9;
/* 175:180 */           d4 = d1 + 1.0D;
/* 176:181 */           d6 = d1;
/* 177:182 */           d5 = d3 + 1.0D - f12;
/* 178:183 */           d7 = d3 + 1.0D - f12;
/* 179:    */         }
/* 180:184 */         else if (j == 2)
/* 181:    */         {
/* 182:185 */           f17 = f9;
/* 183:186 */           f18 = f8;
/* 184:187 */           d4 = d1 + f12;
/* 185:188 */           d6 = d1 + f12;
/* 186:189 */           d5 = d3 + 1.0D;
/* 187:190 */           d7 = d3;
/* 188:    */         }
/* 189:    */         else
/* 190:    */         {
/* 191:192 */           f17 = f11;
/* 192:193 */           f18 = f10;
/* 193:194 */           d4 = d1 + 1.0D - f12;
/* 194:195 */           d6 = d1 + 1.0D - f12;
/* 195:196 */           d5 = d3;
/* 196:197 */           d7 = d3 + 1.0D;
/* 197:    */         }
/* 198:200 */         bool3 = true;
/* 199:201 */         float f25 = localcue.a(0.0D);
/* 200:202 */         float f26 = localcue.a(8.0D);
/* 201:    */         
/* 202:204 */         float f27 = localcue.b((1.0F - f17) * 16.0F * 0.5F);
/* 203:205 */         float f28 = localcue.b((1.0F - f18) * 16.0F * 0.5F);
/* 204:206 */         float f29 = localcue.b(8.0D);
/* 205:    */         
/* 206:208 */         paramciv.b(localaxl.c(paramard, localdt));
/* 207:    */         
/* 208:210 */         float f30 = 1.0F;
/* 209:211 */         f30 *= (j < 2 ? f6 : f7);
/* 210:    */         
/* 211:213 */         paramciv.b(f5 * f30 * f1, f5 * f30 * f2, f5 * f30 * f3);
/* 212:214 */         paramciv.a(d4, d2 + f17, d5, f25, f27);
/* 213:215 */         paramciv.a(d6, d2 + f18, d7, f26, f28);
/* 214:216 */         paramciv.a(d6, d2 + 0.0D, d7, f26, f29);
/* 215:217 */         paramciv.a(d4, d2 + 0.0D, d5, f25, f29);
/* 216:    */         
/* 217:219 */         paramciv.a(d4, d2 + 0.0D, d5, f25, f29);
/* 218:220 */         paramciv.a(d6, d2 + 0.0D, d7, f26, f29);
/* 219:221 */         paramciv.a(d6, d2 + f18, d7, f26, f28);
/* 220:222 */         paramciv.a(d4, d2 + f17, d5, f25, f27);
/* 221:    */       }
/* 222:    */     }
/* 223:226 */     return bool3;
/* 224:    */   }
/* 225:    */   
/* 226:    */   private float a(ard paramard, dt paramdt, bof parambof)
/* 227:    */   {
/* 228:230 */     int i = 0;
/* 229:231 */     float f = 0.0F;
/* 230:232 */     for (int j = 0; j < 4; j++)
/* 231:    */     {
/* 232:233 */       dt localdt = paramdt.a(-(j & 0x1), 0, -(j >> 1 & 0x1));
/* 233:234 */       if (paramard.p(localdt.a()).c().r() == parambof) {
/* 234:235 */         return 1.0F;
/* 235:    */       }
/* 236:237 */       bec localbec = paramard.p(localdt);
/* 237:238 */       bof localbof = localbec.c().r();
/* 238:239 */       if (localbof == parambof)
/* 239:    */       {
/* 240:240 */         int k = ((Integer)localbec.b(axl.b)).intValue();
/* 241:241 */         if ((k >= 8) || (k == 0))
/* 242:    */         {
/* 243:242 */           f += axl.b(k) * 10.0F;
/* 244:243 */           i += 10;
/* 245:    */         }
/* 246:245 */         f += axl.b(k);
/* 247:246 */         i++;
/* 248:    */       }
/* 249:247 */       else if (!localbof.a())
/* 250:    */       {
/* 251:248 */         f += 1.0F;
/* 252:249 */         i++;
/* 253:    */       }
/* 254:    */     }
/* 255:252 */     return 1.0F - f / i;
/* 256:    */   }
/* 257:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     clm
 * JD-Core Version:    0.7.0.1
 */