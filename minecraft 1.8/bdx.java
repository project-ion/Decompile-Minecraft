/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bdx
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 26 */   public static final beu a = bds.a;
/*   7: 27 */   public static final bev b = bds.b;
/*   8:    */   
/*   9:    */   public bdx()
/*  10:    */   {
/*  11: 30 */     super(bof.H);
/*  12: 31 */     j(this.L.b().a(a, ej.c).a(b, bdu.a));
/*  13: 32 */     c(-1.0F);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public bcm a(aqu paramaqu, int paramInt)
/*  17:    */   {
/*  18: 37 */     return null;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public static bcm a(bec parambec, ej paramej, boolean paramBoolean1, boolean paramBoolean2)
/*  22:    */   {
/*  23: 42 */     return new bdv(parambec, paramej, paramBoolean1, paramBoolean2);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/*  27:    */   {
/*  28: 47 */     bcm localbcm = paramaqu.s(paramdt);
/*  29: 48 */     if ((localbcm instanceof bdv)) {
/*  30: 49 */       ((bdv)localbcm).h();
/*  31:    */     } else {
/*  32: 51 */       super.b(paramaqu, paramdt, parambec);
/*  33:    */     }
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  37:    */   {
/*  38: 57 */     return false;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public boolean a(aqu paramaqu, dt paramdt, ej paramej)
/*  42:    */   {
/*  43: 62 */     return false;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void d(aqu paramaqu, dt paramdt, bec parambec)
/*  47:    */   {
/*  48: 68 */     dt localdt = paramdt.a(((ej)parambec.b(a)).d());
/*  49: 69 */     bec localbec = paramaqu.p(localdt);
/*  50: 70 */     if (((localbec.c() instanceof bdq)) && (((Boolean)localbec.b(bdq.b)).booleanValue())) {
/*  51: 71 */       paramaqu.g(localdt);
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public boolean c()
/*  56:    */   {
/*  57: 77 */     return false;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean d()
/*  61:    */   {
/*  62: 82 */     return false;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  66:    */   {
/*  67: 88 */     if ((!paramaqu.D) && (paramaqu.s(paramdt) == null))
/*  68:    */     {
/*  69: 90 */       paramaqu.g(paramdt);
/*  70: 91 */       return true;
/*  71:    */     }
/*  72: 93 */     return false;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  76:    */   {
/*  77: 99 */     return null;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/*  81:    */   {
/*  82:104 */     if (paramaqu.D) {
/*  83:105 */       return;
/*  84:    */     }
/*  85:108 */     bdv localbdv = e(paramaqu, paramdt);
/*  86:109 */     if (localbdv == null) {
/*  87:110 */       return;
/*  88:    */     }
/*  89:113 */     bec localbec = localbdv.b();
/*  90:114 */     localbec.c().b(paramaqu, paramdt, localbec, 0);
/*  91:    */   }
/*  92:    */   
/*  93:    */   public bru a(aqu paramaqu, dt paramdt, brw parambrw1, brw parambrw2)
/*  94:    */   {
/*  95:120 */     return null;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  99:    */   {
/* 100:125 */     if (!paramaqu.D) {
/* 101:126 */       paramaqu.s(paramdt);
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/* 106:    */   {
/* 107:133 */     bdv localbdv = e(paramaqu, paramdt);
/* 108:134 */     if (localbdv == null) {
/* 109:135 */       return null;
/* 110:    */     }
/* 111:139 */     float f = localbdv.a(0.0F);
/* 112:140 */     if (localbdv.d()) {
/* 113:141 */       f = 1.0F - f;
/* 114:    */     }
/* 115:143 */     return a(paramaqu, paramdt, localbdv.b(), f, localbdv.e());
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void a(ard paramard, dt paramdt)
/* 119:    */   {
/* 120:148 */     bdv localbdv = e(paramard, paramdt);
/* 121:149 */     if (localbdv != null)
/* 122:    */     {
/* 123:150 */       bec localbec = localbdv.b();
/* 124:151 */       atr localatr = localbec.c();
/* 125:152 */       if ((localatr == this) || (localatr.r() == bof.a)) {
/* 126:153 */         return;
/* 127:    */       }
/* 128:156 */       float f = localbdv.a(0.0F);
/* 129:157 */       if (localbdv.d()) {
/* 130:158 */         f = 1.0F - f;
/* 131:    */       }
/* 132:160 */       localatr.a(paramard, paramdt);
/* 133:161 */       if ((localatr == aty.J) || (localatr == aty.F)) {
/* 134:162 */         f = 0.0F;
/* 135:    */       }
/* 136:164 */       ej localej = localbdv.e();
/* 137:165 */       this.B = (localatr.z() - localej.g() * f);
/* 138:166 */       this.C = (localatr.B() - localej.h() * f);
/* 139:167 */       this.D = (localatr.D() - localej.i() * f);
/* 140:168 */       this.E = (localatr.A() - localej.g() * f);
/* 141:169 */       this.F = (localatr.C() - localej.h() * f);
/* 142:170 */       this.G = (localatr.E() - localej.i() * f);
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, ej paramej)
/* 147:    */   {
/* 148:175 */     if ((parambec.c() == this) || (parambec.c().r() == bof.a)) {
/* 149:176 */       return null;
/* 150:    */     }
/* 151:178 */     brt localbrt = parambec.c().a(paramaqu, paramdt, parambec);
/* 152:180 */     if (localbrt == null) {
/* 153:181 */       return null;
/* 154:    */     }
/* 155:184 */     double d1 = localbrt.a;
/* 156:185 */     double d2 = localbrt.b;
/* 157:186 */     double d3 = localbrt.c;
/* 158:187 */     double d4 = localbrt.d;
/* 159:188 */     double d5 = localbrt.e;
/* 160:189 */     double d6 = localbrt.f;
/* 161:192 */     if (paramej.g() < 0) {
/* 162:193 */       d1 -= paramej.g() * paramFloat;
/* 163:    */     } else {
/* 164:195 */       d4 -= paramej.g() * paramFloat;
/* 165:    */     }
/* 166:197 */     if (paramej.h() < 0) {
/* 167:198 */       d2 -= paramej.h() * paramFloat;
/* 168:    */     } else {
/* 169:200 */       d5 -= paramej.h() * paramFloat;
/* 170:    */     }
/* 171:202 */     if (paramej.i() < 0) {
/* 172:203 */       d3 -= paramej.i() * paramFloat;
/* 173:    */     } else {
/* 174:205 */       d6 -= paramej.i() * paramFloat;
/* 175:    */     }
/* 176:207 */     return new brt(d1, d2, d3, d4, d5, d6);
/* 177:    */   }
/* 178:    */   
/* 179:    */   private bdv e(ard paramard, dt paramdt)
/* 180:    */   {
/* 181:211 */     bcm localbcm = paramard.s(paramdt);
/* 182:212 */     if ((localbcm instanceof bdv)) {
/* 183:213 */       return (bdv)localbcm;
/* 184:    */     }
/* 185:215 */     return null;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public alq b(aqu paramaqu, dt paramdt)
/* 189:    */   {
/* 190:220 */     return null;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public bec a(int paramInt)
/* 194:    */   {
/* 195:225 */     return P().a(a, bds.b(paramInt)).a(b, (paramInt & 0x8) > 0 ? bdu.b : bdu.a);
/* 196:    */   }
/* 197:    */   
/* 198:    */   public int c(bec parambec)
/* 199:    */   {
/* 200:232 */     int i = 0;
/* 201:    */     
/* 202:234 */     i |= ((ej)parambec.b(a)).a();
/* 203:236 */     if (parambec.b(b) == bdu.b) {
/* 204:237 */       i |= 0x8;
/* 205:    */     }
/* 206:240 */     return i;
/* 207:    */   }
/* 208:    */   
/* 209:    */   protected bed e()
/* 210:    */   {
/* 211:245 */     return new bed(this, new bex[] { a, b });
/* 212:    */   }
/* 213:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bdx
 * JD-Core Version:    0.7.0.1
 */