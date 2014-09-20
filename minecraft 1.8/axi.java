/*   1:    */ public class axi
/*   2:    */   extends atr
/*   3:    */ {
/*   4: 22 */   public static final bev a = bev.a("facing", axk.class);
/*   5: 23 */   public static final bet b = bet.a("powered");
/*   6:    */   
/*   7:    */   protected axi()
/*   8:    */   {
/*   9: 26 */     super(bof.q);
/*  10: 27 */     j(this.L.b().a(a, axk.e).a(b, Boolean.valueOf(false)));
/*  11: 28 */     a(akf.d);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  15:    */   {
/*  16: 34 */     return null;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean c()
/*  20:    */   {
/*  21: 39 */     return false;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public boolean d()
/*  25:    */   {
/*  26: 44 */     return false;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public boolean a(aqu paramaqu, dt paramdt, ej paramej)
/*  30:    */   {
/*  31: 49 */     if ((paramej == ej.b) && (aqu.a(paramaqu, paramdt.b()))) {
/*  32: 50 */       return true;
/*  33:    */     }
/*  34: 51 */     if (d(paramaqu, paramdt.a(paramej.d()))) {
/*  35: 52 */       return true;
/*  36:    */     }
/*  37: 54 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  41:    */   {
/*  42: 59 */     if (d(paramaqu, paramdt.e())) {
/*  43: 60 */       return true;
/*  44:    */     }
/*  45: 61 */     if (d(paramaqu, paramdt.f())) {
/*  46: 62 */       return true;
/*  47:    */     }
/*  48: 63 */     if (d(paramaqu, paramdt.c())) {
/*  49: 64 */       return true;
/*  50:    */     }
/*  51: 65 */     if (d(paramaqu, paramdt.d())) {
/*  52: 66 */       return true;
/*  53:    */     }
/*  54: 67 */     if (aqu.a(paramaqu, paramdt.b())) {
/*  55: 68 */       return true;
/*  56:    */     }
/*  57: 69 */     if (d(paramaqu, paramdt.a())) {
/*  58: 70 */       return true;
/*  59:    */     }
/*  60: 72 */     return false;
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected boolean d(aqu paramaqu, dt paramdt)
/*  64:    */   {
/*  65: 76 */     return paramaqu.p(paramdt).c().t();
/*  66:    */   }
/*  67:    */   
/*  68:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  69:    */   {
/*  70: 81 */     bec localbec = P().a(b, Boolean.valueOf(false));
/*  71: 83 */     if (d(paramaqu, paramdt.a(paramej.d()))) {
/*  72: 84 */       return localbec.a(a, axk.a(paramej, paramxm.aO()));
/*  73:    */     }
/*  74: 87 */     for (ej localej : en.a) {
/*  75: 88 */       if ((localej != paramej) && (d(paramaqu, paramdt.a(localej.d())))) {
/*  76: 89 */         return localbec.a(a, axk.a(localej, paramxm.aO()));
/*  77:    */       }
/*  78:    */     }
/*  79: 93 */     if (aqu.a(paramaqu, paramdt.b())) {
/*  80: 94 */       return localbec.a(a, axk.a(ej.b, paramxm.aO()));
/*  81:    */     }
/*  82: 97 */     return localbec;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public static int a(ej paramej)
/*  86:    */   {
/*  87:102 */     switch (axj.a[paramej.ordinal()])
/*  88:    */     {
/*  89:    */     case 1: 
/*  90:104 */       return 0;
/*  91:    */     case 2: 
/*  92:106 */       return 5;
/*  93:    */     case 3: 
/*  94:108 */       return 4;
/*  95:    */     case 4: 
/*  96:110 */       return 3;
/*  97:    */     case 5: 
/*  98:112 */       return 2;
/*  99:    */     case 6: 
/* 100:114 */       return 1;
/* 101:    */     }
/* 102:116 */     return -1;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 106:    */   {
/* 107:121 */     if ((e(paramaqu, paramdt)) && 
/* 108:122 */       (!d(paramaqu, paramdt.a(((axk)parambec.b(a)).c().d()))))
/* 109:    */     {
/* 110:123 */       b(paramaqu, paramdt, parambec, 0);
/* 111:124 */       paramaqu.g(paramdt);
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   private boolean e(aqu paramaqu, dt paramdt)
/* 116:    */   {
/* 117:130 */     if (c(paramaqu, paramdt)) {
/* 118:131 */       return true;
/* 119:    */     }
/* 120:134 */     b(paramaqu, paramdt, paramaqu.p(paramdt), 0);
/* 121:135 */     paramaqu.g(paramdt);
/* 122:136 */     return false;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void a(ard paramard, dt paramdt)
/* 126:    */   {
/* 127:141 */     float f = 0.1875F;
/* 128:142 */     switch (axj.b[((axk)paramard.p(paramdt).b(a)).ordinal()])
/* 129:    */     {
/* 130:    */     case 1: 
/* 131:144 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 132:145 */       break;
/* 133:    */     case 2: 
/* 134:147 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 135:148 */       break;
/* 136:    */     case 3: 
/* 137:150 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 138:151 */       break;
/* 139:    */     case 4: 
/* 140:153 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/* 141:154 */       break;
/* 142:    */     case 5: 
/* 143:    */     case 6: 
/* 144:157 */       f = 0.25F;
/* 145:158 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/* 146:159 */       break;
/* 147:    */     case 7: 
/* 148:    */     case 8: 
/* 149:162 */       f = 0.25F;
/* 150:163 */       a(0.5F - f, 0.4F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
/* 151:    */     }
/* 152:    */   }
/* 153:    */   
/* 154:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 155:    */   {
/* 156:170 */     if (paramaqu.D) {
/* 157:171 */       return true;
/* 158:    */     }
/* 159:174 */     parambec = parambec.a(b);
/* 160:175 */     paramaqu.a(paramdt, parambec, 3);
/* 161:176 */     paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "random.click", 0.3F, ((Boolean)parambec.b(b)).booleanValue() ? 0.6F : 0.5F);
/* 162:177 */     paramaqu.c(paramdt, this);
/* 163:    */     
/* 164:179 */     ej localej = ((axk)parambec.b(a)).c();
/* 165:180 */     paramaqu.c(paramdt.a(localej.d()), this);
/* 166:    */     
/* 167:182 */     return true;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 171:    */   {
/* 172:187 */     if (((Boolean)parambec.b(b)).booleanValue())
/* 173:    */     {
/* 174:188 */       paramaqu.c(paramdt, this);
/* 175:189 */       ej localej = ((axk)parambec.b(a)).c();
/* 176:190 */       paramaqu.c(paramdt.a(localej.d()), this);
/* 177:    */     }
/* 178:192 */     super.b(paramaqu, paramdt, parambec);
/* 179:    */   }
/* 180:    */   
/* 181:    */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 182:    */   {
/* 183:197 */     return ((Boolean)parambec.b(b)).booleanValue() ? 15 : 0;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public int b(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 187:    */   {
/* 188:202 */     if (!((Boolean)parambec.b(b)).booleanValue()) {
/* 189:203 */       return 0;
/* 190:    */     }
/* 191:206 */     if (((axk)parambec.b(a)).c() == paramej) {
/* 192:207 */       return 15;
/* 193:    */     }
/* 194:210 */     return 0;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public boolean g()
/* 198:    */   {
/* 199:215 */     return true;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public bec a(int paramInt)
/* 203:    */   {
/* 204:220 */     return P().a(a, axk.a(paramInt & 0x7)).a(b, Boolean.valueOf((paramInt & 0x8) > 0));
/* 205:    */   }
/* 206:    */   
/* 207:    */   public int c(bec parambec)
/* 208:    */   {
/* 209:227 */     int i = 0;
/* 210:    */     
/* 211:229 */     i |= ((axk)parambec.b(a)).a();
/* 212:231 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 213:232 */       i |= 0x8;
/* 214:    */     }
/* 215:235 */     return i;
/* 216:    */   }
/* 217:    */   
/* 218:    */   protected bed e()
/* 219:    */   {
/* 220:240 */     return new bed(this, new bex[] { a, b });
/* 221:    */   }
/* 222:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axi
 * JD-Core Version:    0.7.0.1
 */