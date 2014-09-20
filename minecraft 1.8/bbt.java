/*   1:    */ import com.google.common.base.Objects;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bbt
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 24 */   public static final beu a = beu.a("facing", en.a);
/*   8: 25 */   public static final bet b = bet.a("powered");
/*   9: 26 */   public static final bet M = bet.a("attached");
/*  10: 27 */   public static final bet N = bet.a("suspended");
/*  11:    */   
/*  12:    */   public bbt()
/*  13:    */   {
/*  14: 33 */     super(bof.q);
/*  15: 34 */     j(this.L.b().a(a, ej.c).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)));
/*  16: 35 */     a(akf.d);
/*  17: 36 */     a(true);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  21:    */   {
/*  22: 41 */     return parambec.a(N, Boolean.valueOf(!aqu.a(paramard, paramdt.b())));
/*  23:    */   }
/*  24:    */   
/*  25:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  26:    */   {
/*  27: 47 */     return null;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean c()
/*  31:    */   {
/*  32: 52 */     return false;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean d()
/*  36:    */   {
/*  37: 57 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean a(aqu paramaqu, dt paramdt, ej paramej)
/*  41:    */   {
/*  42: 62 */     return (paramej.k().c()) && (paramaqu.p(paramdt.a(paramej.d())).c().t());
/*  43:    */   }
/*  44:    */   
/*  45:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  46:    */   {
/*  47: 67 */     for (ej localej : en.a) {
/*  48: 68 */       if (paramaqu.p(paramdt.a(localej)).c().t()) {
/*  49: 69 */         return true;
/*  50:    */       }
/*  51:    */     }
/*  52: 72 */     return false;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  56:    */   {
/*  57: 77 */     bec localbec = P().a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false));
/*  58: 78 */     if (paramej.k().c()) {
/*  59: 79 */       localbec = localbec.a(a, paramej);
/*  60:    */     }
/*  61: 81 */     return localbec;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj)
/*  65:    */   {
/*  66: 86 */     a(paramaqu, paramdt, parambec, false, false, -1, null);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  70:    */   {
/*  71: 91 */     if (paramatr == this) {
/*  72: 92 */       return;
/*  73:    */     }
/*  74: 94 */     if (e(paramaqu, paramdt, parambec))
/*  75:    */     {
/*  76: 95 */       ej localej = (ej)parambec.b(a);
/*  77: 96 */       if (!paramaqu.p(paramdt.a(localej.d())).c().t())
/*  78:    */       {
/*  79: 97 */         b(paramaqu, paramdt, parambec, 0);
/*  80: 98 */         paramaqu.g(paramdt);
/*  81:    */       }
/*  82:    */     }
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void a(aqu paramaqu, dt paramdt, bec parambec1, boolean paramBoolean1, boolean paramBoolean2, int paramInt, bec parambec2)
/*  86:    */   {
/*  87:104 */     ej localej = (ej)parambec1.b(a);
/*  88:105 */     boolean bool1 = ((Boolean)parambec1.b(M)).booleanValue();
/*  89:106 */     boolean bool2 = ((Boolean)parambec1.b(b)).booleanValue();
/*  90:107 */     boolean bool3 = !aqu.a(paramaqu, paramdt.b());
/*  91:    */     
/*  92:109 */     boolean bool4 = !paramBoolean1;
/*  93:110 */     boolean bool5 = false;
/*  94:111 */     int i = 0;
/*  95:    */     
/*  96:113 */     bec[] arrayOfbec = new bec[42];
/*  97:    */     dt localdt;
/*  98:    */     Object localObject;
/*  99:114 */     for (int j = 1; j < 42; j++)
/* 100:    */     {
/* 101:115 */       localdt = paramdt.a(localej, j);
/* 102:116 */       localObject = paramaqu.p(localdt);
/* 103:118 */       if (((bec)localObject).c() == aty.bR)
/* 104:    */       {
/* 105:119 */         if (((bec)localObject).b(a) != localej.d()) {
/* 106:    */           break;
/* 107:    */         }
/* 108:120 */         i = j; break;
/* 109:    */       }
/* 110:124 */       if ((((bec)localObject).c() == aty.bS) || (j == paramInt))
/* 111:    */       {
/* 112:125 */         if (j == paramInt) {
/* 113:126 */           localObject = (bec)Objects.firstNonNull(parambec2, localObject);
/* 114:    */         }
/* 115:128 */         boolean bool6 = !((Boolean)((bec)localObject).b(bbs.N)).booleanValue();
/* 116:129 */         boolean bool7 = ((Boolean)((bec)localObject).b(bbs.a)).booleanValue();
/* 117:130 */         boolean bool8 = ((Boolean)((bec)localObject).b(bbs.b)).booleanValue();
/* 118:131 */         bool4 &= bool8 == bool3;
/* 119:132 */         bool5 |= ((bool6) && (bool7));
/* 120:    */         
/* 121:134 */         arrayOfbec[j] = localObject;
/* 122:136 */         if (j == paramInt)
/* 123:    */         {
/* 124:137 */           paramaqu.a(paramdt, this, a(paramaqu));
/* 125:138 */           bool4 &= bool6;
/* 126:    */         }
/* 127:    */       }
/* 128:    */       else
/* 129:    */       {
/* 130:141 */         arrayOfbec[j] = null;
/* 131:142 */         bool4 = false;
/* 132:    */       }
/* 133:    */     }
/* 134:146 */     bool4 &= i > 1;
/* 135:147 */     bool5 &= bool4;
/* 136:148 */     bec localbec1 = P().a(M, Boolean.valueOf(bool4)).a(b, Boolean.valueOf(bool5));
/* 137:150 */     if (i > 0)
/* 138:    */     {
/* 139:151 */       localdt = paramdt.a(localej, i);
/* 140:152 */       localObject = localej.d();
/* 141:153 */       paramaqu.a(localdt, localbec1.a(a, (Comparable)localObject), 3);
/* 142:154 */       b(paramaqu, localdt, (ej)localObject);
/* 143:    */       
/* 144:156 */       a(paramaqu, localdt, bool4, bool5, bool1, bool2);
/* 145:    */     }
/* 146:159 */     a(paramaqu, paramdt, bool4, bool5, bool1, bool2);
/* 147:161 */     if (!paramBoolean1)
/* 148:    */     {
/* 149:162 */       paramaqu.a(paramdt, localbec1.a(a, localej), 3);
/* 150:163 */       if (paramBoolean2) {
/* 151:164 */         b(paramaqu, paramdt, localej);
/* 152:    */       }
/* 153:    */     }
/* 154:168 */     if (bool1 != bool4) {
/* 155:169 */       for (int k = 1; k < i; k++)
/* 156:    */       {
/* 157:170 */         localObject = paramdt.a(localej, k);
/* 158:171 */         bec localbec2 = arrayOfbec[k];
/* 159:172 */         if (localbec2 != null) {
/* 160:176 */           if (paramaqu.p((dt)localObject).c() != aty.a) {
/* 161:177 */             paramaqu.a((dt)localObject, localbec2.a(M, Boolean.valueOf(bool4)), 3);
/* 162:    */           }
/* 163:    */         }
/* 164:    */       }
/* 165:    */     }
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom) {}
/* 169:    */   
/* 170:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 171:    */   {
/* 172:189 */     a(paramaqu, paramdt, parambec, false, true, -1, null);
/* 173:    */   }
/* 174:    */   
/* 175:    */   private void a(aqu paramaqu, dt paramdt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
/* 176:    */   {
/* 177:193 */     if ((paramBoolean2) && (!paramBoolean4)) {
/* 178:194 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.1D, paramdt.p() + 0.5D, "random.click", 0.4F, 0.6F);
/* 179:195 */     } else if ((!paramBoolean2) && (paramBoolean4)) {
/* 180:196 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.1D, paramdt.p() + 0.5D, "random.click", 0.4F, 0.5F);
/* 181:197 */     } else if ((paramBoolean1) && (!paramBoolean3)) {
/* 182:198 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.1D, paramdt.p() + 0.5D, "random.click", 0.4F, 0.7F);
/* 183:199 */     } else if ((!paramBoolean1) && (paramBoolean3)) {
/* 184:200 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.1D, paramdt.p() + 0.5D, "random.bowhit", 0.4F, 1.2F / (paramaqu.s.nextFloat() * 0.2F + 0.9F));
/* 185:    */     }
/* 186:    */   }
/* 187:    */   
/* 188:    */   private void b(aqu paramaqu, dt paramdt, ej paramej)
/* 189:    */   {
/* 190:205 */     paramaqu.c(paramdt, this);
/* 191:206 */     paramaqu.c(paramdt.a(paramej.d()), this);
/* 192:    */   }
/* 193:    */   
/* 194:    */   private boolean e(aqu paramaqu, dt paramdt, bec parambec)
/* 195:    */   {
/* 196:210 */     if (!c(paramaqu, paramdt))
/* 197:    */     {
/* 198:211 */       b(paramaqu, paramdt, parambec, 0);
/* 199:212 */       paramaqu.g(paramdt);
/* 200:213 */       return false;
/* 201:    */     }
/* 202:216 */     return true;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void a(ard paramard, dt paramdt)
/* 206:    */   {
/* 207:221 */     float f = 0.1875F;
/* 208:223 */     switch (bbu.a[((ej)paramard.p(paramdt).b(a)).ordinal()])
/* 209:    */     {
/* 210:    */     case 1: 
/* 211:225 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 212:226 */       break;
/* 213:    */     case 2: 
/* 214:228 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 215:229 */       break;
/* 216:    */     case 3: 
/* 217:231 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 218:232 */       break;
/* 219:    */     case 4: 
/* 220:234 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/* 221:    */     }
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 225:    */   {
/* 226:241 */     boolean bool1 = ((Boolean)parambec.b(M)).booleanValue();
/* 227:242 */     boolean bool2 = ((Boolean)parambec.b(b)).booleanValue();
/* 228:244 */     if ((bool1) || (bool2)) {
/* 229:245 */       a(paramaqu, paramdt, parambec, true, false, -1, null);
/* 230:    */     }
/* 231:248 */     if (bool2)
/* 232:    */     {
/* 233:249 */       paramaqu.c(paramdt, this);
/* 234:250 */       paramaqu.c(paramdt.a(((ej)parambec.b(a)).d()), this);
/* 235:    */     }
/* 236:253 */     super.b(paramaqu, paramdt, parambec);
/* 237:    */   }
/* 238:    */   
/* 239:    */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 240:    */   {
/* 241:258 */     return ((Boolean)parambec.b(b)).booleanValue() ? 15 : 0;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public int b(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 245:    */   {
/* 246:263 */     if (!((Boolean)parambec.b(b)).booleanValue()) {
/* 247:264 */       return 0;
/* 248:    */     }
/* 249:267 */     if (parambec.b(a) == paramej) {
/* 250:268 */       return 15;
/* 251:    */     }
/* 252:271 */     return 0;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public boolean g()
/* 256:    */   {
/* 257:276 */     return true;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public aql k()
/* 261:    */   {
/* 262:281 */     return aql.b;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public bec a(int paramInt)
/* 266:    */   {
/* 267:286 */     return P().a(a, ej.b(paramInt & 0x3)).a(b, Boolean.valueOf((paramInt & 0x8) > 0)).a(M, Boolean.valueOf((paramInt & 0x4) > 0));
/* 268:    */   }
/* 269:    */   
/* 270:    */   public int c(bec parambec)
/* 271:    */   {
/* 272:294 */     int i = 0;
/* 273:    */     
/* 274:296 */     i |= ((ej)parambec.b(a)).b();
/* 275:298 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 276:299 */       i |= 0x8;
/* 277:    */     }
/* 278:302 */     if (((Boolean)parambec.b(M)).booleanValue()) {
/* 279:303 */       i |= 0x4;
/* 280:    */     }
/* 281:306 */     return i;
/* 282:    */   }
/* 283:    */   
/* 284:    */   protected bed e()
/* 285:    */   {
/* 286:311 */     return new bed(this, new bex[] { a, b, M, N });
/* 287:    */   }
/* 288:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbt
 * JD-Core Version:    0.7.0.1
 */