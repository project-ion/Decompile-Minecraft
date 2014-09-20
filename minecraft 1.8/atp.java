/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class atp
/*   4:    */   extends avb
/*   5:    */ {
/*   6: 25 */   public static final bev a = bev.a("part", atq.class);
/*   7: 26 */   public static final bet b = bet.a("occupied");
/*   8:    */   
/*   9:    */   public atp()
/*  10:    */   {
/*  11: 29 */     super(bof.n);
/*  12: 30 */     j(this.L.b().a(a, atq.b).a(b, Boolean.valueOf(false)));
/*  13: 31 */     j();
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  17:    */   {
/*  18: 36 */     if (paramaqu.D) {
/*  19: 37 */       return true;
/*  20:    */     }
/*  21: 40 */     if (parambec.b(a) != atq.a)
/*  22:    */     {
/*  23: 42 */       paramdt = paramdt.a((ej)parambec.b(N));
/*  24: 43 */       parambec = paramaqu.p(paramdt);
/*  25: 44 */       if (parambec.c() != this) {
/*  26: 45 */         return true;
/*  27:    */       }
/*  28:    */     }
/*  29: 49 */     if ((!paramaqu.t.e()) || (paramaqu.b(paramdt) == arm.x))
/*  30:    */     {
/*  31: 51 */       paramaqu.g(paramdt);
/*  32:    */       
/*  33:    */ 
/*  34: 54 */       localObject = paramdt.a(((ej)parambec.b(N)).d());
/*  35: 55 */       if (paramaqu.p((dt)localObject).c() == this) {
/*  36: 56 */         paramaqu.g((dt)localObject);
/*  37:    */       }
/*  38: 59 */       paramaqu.a(null, paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, 5.0F, true, true);
/*  39: 60 */       return true;
/*  40:    */     }
/*  41: 63 */     if (((Boolean)parambec.b(b)).booleanValue())
/*  42:    */     {
/*  43: 64 */       localObject = e(paramaqu, paramdt);
/*  44: 65 */       if (localObject == null)
/*  45:    */       {
/*  46: 66 */         parambec = parambec.a(b, Boolean.valueOf(false));
/*  47: 67 */         paramaqu.a(paramdt, parambec, 4);
/*  48:    */       }
/*  49:    */       else
/*  50:    */       {
/*  51: 69 */         paramahd.b(new hz("tile.bed.occupied", new Object[0]));
/*  52: 70 */         return true;
/*  53:    */       }
/*  54:    */     }
/*  55: 74 */     Object localObject = paramahd.a(paramdt);
/*  56: 75 */     if (localObject == ahf.a)
/*  57:    */     {
/*  58: 76 */       parambec = parambec.a(b, Boolean.valueOf(true));
/*  59: 77 */       paramaqu.a(paramdt, parambec, 4);
/*  60: 78 */       return true;
/*  61:    */     }
/*  62: 81 */     if (localObject == ahf.c) {
/*  63: 82 */       paramahd.b(new hz("tile.bed.noSleep", new Object[0]));
/*  64: 83 */     } else if (localObject == ahf.f) {
/*  65: 84 */       paramahd.b(new hz("tile.bed.notSafe", new Object[0]));
/*  66:    */     }
/*  67: 86 */     return true;
/*  68:    */   }
/*  69:    */   
/*  70:    */   private ahd e(aqu paramaqu, dt paramdt)
/*  71:    */   {
/*  72: 91 */     for (ahd localahd : paramaqu.j) {
/*  73: 92 */       if ((localahd.bI()) && (localahd.bv.equals(paramdt))) {
/*  74: 93 */         return localahd;
/*  75:    */       }
/*  76:    */     }
/*  77: 97 */     return null;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean d()
/*  81:    */   {
/*  82:102 */     return false;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public boolean c()
/*  86:    */   {
/*  87:107 */     return false;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void a(ard paramard, dt paramdt)
/*  91:    */   {
/*  92:112 */     j();
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  96:    */   {
/*  97:117 */     ej localej = (ej)parambec.b(N);
/*  98:119 */     if (parambec.b(a) == atq.a)
/*  99:    */     {
/* 100:120 */       if (paramaqu.p(paramdt.a(localej.d())).c() != this) {
/* 101:121 */         paramaqu.g(paramdt);
/* 102:    */       }
/* 103:    */     }
/* 104:124 */     else if (paramaqu.p(paramdt.a(localej)).c() != this)
/* 105:    */     {
/* 106:125 */       paramaqu.g(paramdt);
/* 107:126 */       if (!paramaqu.D) {
/* 108:127 */         b(paramaqu, paramdt, parambec, 0);
/* 109:    */       }
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 114:    */   {
/* 115:136 */     if (parambec.b(a) == atq.a) {
/* 116:137 */       return null;
/* 117:    */     }
/* 118:139 */     return amk.ba;
/* 119:    */   }
/* 120:    */   
/* 121:    */   private void j()
/* 122:    */   {
/* 123:143 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public static dt a(aqu paramaqu, dt paramdt, int paramInt)
/* 127:    */   {
/* 128:148 */     ej localej = (ej)paramaqu.p(paramdt).b(N);
/* 129:    */     
/* 130:    */ 
/* 131:151 */     int i = paramdt.n();
/* 132:152 */     int j = paramdt.o();
/* 133:153 */     int k = paramdt.p();
/* 134:156 */     for (int m = 0; m <= 1; m++)
/* 135:    */     {
/* 136:157 */       int n = i - localej.g() * m - 1;
/* 137:158 */       int i1 = k - localej.i() * m - 1;
/* 138:159 */       int i2 = n + 2;
/* 139:160 */       int i3 = i1 + 2;
/* 140:162 */       for (int i4 = n; i4 <= i2; i4++) {
/* 141:163 */         for (int i5 = i1; i5 <= i3; i5++)
/* 142:    */         {
/* 143:164 */           dt localdt = new dt(i4, j, i5);
/* 144:165 */           if (d(paramaqu, localdt)) {
/* 145:166 */             if (paramInt > 0) {
/* 146:167 */               paramInt--;
/* 147:    */             } else {
/* 148:170 */               return localdt;
/* 149:    */             }
/* 150:    */           }
/* 151:    */         }
/* 152:    */       }
/* 153:    */     }
/* 154:176 */     return null;
/* 155:    */   }
/* 156:    */   
/* 157:    */   protected static boolean d(aqu paramaqu, dt paramdt)
/* 158:    */   {
/* 159:180 */     return (aqu.a(paramaqu, paramdt.b())) && (!paramaqu.p(paramdt).c().r().a()) && (!paramaqu.p(paramdt.a()).c().r().a());
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/* 163:    */   {
/* 164:187 */     if (parambec.b(a) == atq.b) {
/* 165:188 */       super.a(paramaqu, paramdt, parambec, paramFloat, 0);
/* 166:    */     }
/* 167:    */   }
/* 168:    */   
/* 169:    */   public int i()
/* 170:    */   {
/* 171:194 */     return 1;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public aql k()
/* 175:    */   {
/* 176:199 */     return aql.c;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public alq b(aqu paramaqu, dt paramdt)
/* 180:    */   {
/* 181:204 */     return amk.ba;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd)
/* 185:    */   {
/* 186:211 */     if ((paramahd.by.d) && 
/* 187:212 */       (parambec.b(a) == atq.a))
/* 188:    */     {
/* 189:213 */       dt localdt = paramdt.a(((ej)parambec.b(N)).d());
/* 190:214 */       if (paramaqu.p(localdt).c() == this) {
/* 191:215 */         paramaqu.g(localdt);
/* 192:    */       }
/* 193:    */     }
/* 194:    */   }
/* 195:    */   
/* 196:    */   public bec a(int paramInt)
/* 197:    */   {
/* 198:223 */     ej localej = ej.b(paramInt);
/* 199:224 */     if ((paramInt & 0x8) > 0) {
/* 200:225 */       return P().a(a, atq.a).a(N, localej).a(b, Boolean.valueOf((paramInt & 0x4) > 0));
/* 201:    */     }
/* 202:230 */     return P().a(a, atq.b).a(N, localej);
/* 203:    */   }
/* 204:    */   
/* 205:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/* 206:    */   {
/* 207:238 */     if (parambec.b(a) == atq.b)
/* 208:    */     {
/* 209:239 */       bec localbec = paramard.p(paramdt.a((ej)parambec.b(N)));
/* 210:240 */       if (localbec.c() == this) {
/* 211:241 */         parambec = parambec.a(b, localbec.b(b));
/* 212:    */       }
/* 213:    */     }
/* 214:245 */     return parambec;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public int c(bec parambec)
/* 218:    */   {
/* 219:250 */     int i = 0;
/* 220:    */     
/* 221:252 */     i |= ((ej)parambec.b(N)).b();
/* 222:254 */     if (parambec.b(a) == atq.a)
/* 223:    */     {
/* 224:255 */       i |= 0x8;
/* 225:257 */       if (((Boolean)parambec.b(b)).booleanValue()) {
/* 226:258 */         i |= 0x4;
/* 227:    */       }
/* 228:    */     }
/* 229:262 */     return i;
/* 230:    */   }
/* 231:    */   
/* 232:    */   protected bed e()
/* 233:    */   {
/* 234:267 */     return new bed(this, new bex[] { N, a, b });
/* 235:    */   }
/* 236:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     atp
 * JD-Core Version:    0.7.0.1
 */