/*   1:    */ public class bbp
/*   2:    */   extends atr
/*   3:    */ {
/*   4: 25 */   public static final beu a = beu.a("facing", en.a);
/*   5: 26 */   public static final bet b = bet.a("open");
/*   6: 27 */   public static final bev M = bev.a("half", bbr.class);
/*   7:    */   
/*   8:    */   protected bbp(bof parambof)
/*   9:    */   {
/*  10: 30 */     super(parambof);
/*  11: 31 */     j(this.L.b().a(a, ej.c).a(b, Boolean.valueOf(false)).a(M, bbr.b));
/*  12: 32 */     float f1 = 0.5F;
/*  13: 33 */     float f2 = 1.0F;
/*  14: 34 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  15: 35 */     a(akf.d);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean c()
/*  19:    */   {
/*  20: 40 */     return false;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean d()
/*  24:    */   {
/*  25: 45 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean b(ard paramard, dt paramdt)
/*  29:    */   {
/*  30: 50 */     return !((Boolean)paramard.p(paramdt).b(b)).booleanValue();
/*  31:    */   }
/*  32:    */   
/*  33:    */   public brt a(aqu paramaqu, dt paramdt)
/*  34:    */   {
/*  35: 55 */     a(paramaqu, paramdt);
/*  36: 56 */     return super.a(paramaqu, paramdt);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  40:    */   {
/*  41: 62 */     a(paramaqu, paramdt);
/*  42: 63 */     return super.a(paramaqu, paramdt, parambec);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(ard paramard, dt paramdt)
/*  46:    */   {
/*  47: 68 */     d(paramard.p(paramdt));
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void h()
/*  51:    */   {
/*  52: 73 */     float f = 0.1875F;
/*  53: 74 */     a(0.0F, 0.40625F, 0.0F, 1.0F, 0.59375F, 1.0F);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void d(bec parambec)
/*  57:    */   {
/*  58: 78 */     if (parambec.c() != this) {
/*  59: 79 */       return;
/*  60:    */     }
/*  61: 81 */     int i = parambec.b(M) == bbr.a ? 1 : 0;
/*  62: 82 */     Boolean localBoolean = (Boolean)parambec.b(b);
/*  63: 83 */     ej localej = (ej)parambec.b(a);
/*  64:    */     
/*  65: 85 */     float f = 0.1875F;
/*  66: 86 */     if (i != 0) {
/*  67: 87 */       a(0.0F, 0.8125F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  68:    */     } else {
/*  69: 89 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.1875F, 1.0F);
/*  70:    */     }
/*  71: 92 */     if (localBoolean.booleanValue())
/*  72:    */     {
/*  73: 93 */       if (localej == ej.c) {
/*  74: 94 */         a(0.0F, 0.0F, 0.8125F, 1.0F, 1.0F, 1.0F);
/*  75:    */       }
/*  76: 96 */       if (localej == ej.d) {
/*  77: 97 */         a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1875F);
/*  78:    */       }
/*  79: 99 */       if (localej == ej.e) {
/*  80:100 */         a(0.8125F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  81:    */       }
/*  82:102 */       if (localej == ej.f) {
/*  83:103 */         a(0.0F, 0.0F, 0.0F, 0.1875F, 1.0F, 1.0F);
/*  84:    */       }
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  89:    */   {
/*  90:110 */     if (this.J == bof.f) {
/*  91:111 */       return true;
/*  92:    */     }
/*  93:114 */     parambec = parambec.a(b);
/*  94:115 */     paramaqu.a(paramdt, parambec, 2);
/*  95:    */     
/*  96:117 */     paramaqu.a(paramahd, ((Boolean)parambec.b(b)).booleanValue() ? 1003 : 1006, paramdt, 0);
/*  97:118 */     return true;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 101:    */   {
/* 102:123 */     if (paramaqu.D) {
/* 103:124 */       return;
/* 104:    */     }
/* 105:127 */     dt localdt = paramdt.a(((ej)parambec.b(a)).d());
/* 106:129 */     if (!c(paramaqu.p(localdt).c()))
/* 107:    */     {
/* 108:130 */       paramaqu.g(paramdt);
/* 109:131 */       b(paramaqu, paramdt, parambec, 0);
/* 110:132 */       return;
/* 111:    */     }
/* 112:135 */     boolean bool1 = paramaqu.z(paramdt);
/* 113:136 */     if ((bool1) || (paramatr.g()))
/* 114:    */     {
/* 115:137 */       boolean bool2 = ((Boolean)parambec.b(b)).booleanValue();
/* 116:139 */       if (bool2 != bool1)
/* 117:    */       {
/* 118:140 */         paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(bool1)), 2);
/* 119:141 */         paramaqu.a(null, bool1 ? 1003 : 1006, paramdt, 0);
/* 120:    */       }
/* 121:    */     }
/* 122:    */   }
/* 123:    */   
/* 124:    */   public bru a(aqu paramaqu, dt paramdt, brw parambrw1, brw parambrw2)
/* 125:    */   {
/* 126:148 */     a(paramaqu, paramdt);
/* 127:149 */     return super.a(paramaqu, paramdt, parambrw1, parambrw2);
/* 128:    */   }
/* 129:    */   
/* 130:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 131:    */   {
/* 132:154 */     bec localbec = P();
/* 133:155 */     if (paramej.k().c())
/* 134:    */     {
/* 135:156 */       localbec = localbec.a(a, paramej).a(b, Boolean.valueOf(false));
/* 136:157 */       localbec = localbec.a(M, paramFloat2 > 0.5F ? bbr.a : bbr.b);
/* 137:    */     }
/* 138:159 */     return localbec;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public boolean a(aqu paramaqu, dt paramdt, ej paramej)
/* 142:    */   {
/* 143:164 */     return (!paramej.k().b()) && (c(paramaqu.p(paramdt.a(paramej.d())).c()));
/* 144:    */   }
/* 145:    */   
/* 146:    */   protected static ej b(int paramInt)
/* 147:    */   {
/* 148:168 */     switch (paramInt & 0x3)
/* 149:    */     {
/* 150:    */     case 0: 
/* 151:170 */       return ej.c;
/* 152:    */     case 1: 
/* 153:172 */       return ej.d;
/* 154:    */     case 2: 
/* 155:174 */       return ej.e;
/* 156:    */     }
/* 157:177 */     return ej.f;
/* 158:    */   }
/* 159:    */   
/* 160:    */   protected static int a(ej paramej)
/* 161:    */   {
/* 162:182 */     switch (bbq.a[paramej.ordinal()])
/* 163:    */     {
/* 164:    */     case 1: 
/* 165:184 */       return 0;
/* 166:    */     case 2: 
/* 167:186 */       return 1;
/* 168:    */     case 3: 
/* 169:188 */       return 2;
/* 170:    */     }
/* 171:191 */     return 3;
/* 172:    */   }
/* 173:    */   
/* 174:    */   private static boolean c(atr paramatr)
/* 175:    */   {
/* 176:196 */     return ((paramatr.J.k()) && (paramatr.d())) || (paramatr == aty.aX) || ((paramatr instanceof awq)) || ((paramatr instanceof bat));
/* 177:    */   }
/* 178:    */   
/* 179:    */   public aql k()
/* 180:    */   {
/* 181:201 */     return aql.c;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public bec a(int paramInt)
/* 185:    */   {
/* 186:206 */     return P().a(a, b(paramInt)).a(b, Boolean.valueOf((paramInt & 0x4) != 0)).a(M, (paramInt & 0x8) == 0 ? bbr.b : bbr.a);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public int c(bec parambec)
/* 190:    */   {
/* 191:214 */     int i = 0;
/* 192:    */     
/* 193:216 */     i |= a((ej)parambec.b(a));
/* 194:218 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 195:219 */       i |= 0x4;
/* 196:    */     }
/* 197:222 */     if (parambec.b(M) == bbr.a) {
/* 198:223 */       i |= 0x8;
/* 199:    */     }
/* 200:226 */     return i;
/* 201:    */   }
/* 202:    */   
/* 203:    */   protected bed e()
/* 204:    */   {
/* 205:231 */     return new bed(this, new bex[] { a, b, M });
/* 206:    */   }
/* 207:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbp
 * JD-Core Version:    0.7.0.1
 */