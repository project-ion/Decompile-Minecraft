/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ayy
/*   4:    */   extends awt
/*   5:    */ {
/*   6: 23 */   public static final bev a = bev.a("axis", el.class, new el[] { el.a, el.c });
/*   7:    */   
/*   8:    */   public ayy()
/*   9:    */   {
/*  10: 31 */     super(bof.E, false);
/*  11: 32 */     j(this.L.b().a(a, el.a));
/*  12: 33 */     a(true);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  16:    */   {
/*  17: 38 */     super.b(paramaqu, paramdt, parambec, paramRandom);
/*  18: 40 */     if ((paramaqu.t.d()) && (paramaqu.Q().b("doMobSpawning")) && (paramRandom.nextInt(2000) < paramaqu.aa().a()))
/*  19:    */     {
/*  20: 42 */       int i = paramdt.o();
/*  21: 43 */       dt localdt = paramdt;
/*  22: 44 */       while ((!aqu.a(paramaqu, localdt)) && (localdt.o() > 0)) {
/*  23: 45 */         localdt = localdt.b();
/*  24:    */       }
/*  25: 47 */       if ((i > 0) && (!paramaqu.p(localdt.a()).c().t()))
/*  26:    */       {
/*  27: 49 */         wv localwv = anl.a(paramaqu, 57, localdt.n() + 0.5D, localdt.o() + 1.1D, localdt.p() + 0.5D);
/*  28: 50 */         if (localwv != null) {
/*  29: 51 */           localwv.aj = localwv.ar();
/*  30:    */         }
/*  31:    */       }
/*  32:    */     }
/*  33:    */   }
/*  34:    */   
/*  35:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  36:    */   {
/*  37: 60 */     return null;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void a(ard paramard, dt paramdt)
/*  41:    */   {
/*  42: 65 */     el localel = (el)paramard.p(paramdt).b(a);
/*  43:    */     
/*  44: 67 */     float f1 = 0.125F;
/*  45: 68 */     float f2 = 0.125F;
/*  46: 70 */     if (localel == el.a) {
/*  47: 71 */       f1 = 0.5F;
/*  48:    */     }
/*  49: 73 */     if (localel == el.c) {
/*  50: 74 */       f2 = 0.5F;
/*  51:    */     }
/*  52: 77 */     a(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, 1.0F, 0.5F + f2);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public static int a(el paramel)
/*  56:    */   {
/*  57: 81 */     if (paramel == el.a) {
/*  58: 82 */       return 1;
/*  59:    */     }
/*  60: 84 */     if (paramel == el.c) {
/*  61: 85 */       return 2;
/*  62:    */     }
/*  63: 87 */     return 0;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean d()
/*  67:    */   {
/*  68: 92 */     return false;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean d(aqu paramaqu, dt paramdt)
/*  72:    */   {
/*  73: 96 */     ayz localayz1 = new ayz(paramaqu, paramdt, el.a);
/*  74: 97 */     if ((localayz1.b()) && (ayz.a(localayz1) == 0))
/*  75:    */     {
/*  76: 98 */       localayz1.c();
/*  77: 99 */       return true;
/*  78:    */     }
/*  79:102 */     ayz localayz2 = new ayz(paramaqu, paramdt, el.c);
/*  80:103 */     if ((localayz2.b()) && (ayz.a(localayz2) == 0))
/*  81:    */     {
/*  82:104 */       localayz2.c();
/*  83:105 */       return true;
/*  84:    */     }
/*  85:108 */     return false;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  89:    */   {
/*  90:113 */     el localel = (el)parambec.b(a);
/*  91:    */     ayz localayz;
/*  92:115 */     if (localel == el.a)
/*  93:    */     {
/*  94:116 */       localayz = new ayz(paramaqu, paramdt, el.a);
/*  95:117 */       if ((!localayz.b()) || (ayz.a(localayz) < ayz.b(localayz) * ayz.c(localayz))) {
/*  96:118 */         paramaqu.a(paramdt, aty.a.P());
/*  97:    */       }
/*  98:    */     }
/*  99:120 */     else if (localel == el.c)
/* 100:    */     {
/* 101:121 */       localayz = new ayz(paramaqu, paramdt, el.c);
/* 102:122 */       if ((!localayz.b()) || (ayz.a(localayz) < ayz.b(localayz) * ayz.c(localayz))) {
/* 103:123 */         paramaqu.a(paramdt, aty.a.P());
/* 104:    */       }
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/* 109:    */   {
/* 110:131 */     el localel = null;
/* 111:132 */     bec localbec = paramard.p(paramdt);
/* 112:133 */     if (paramard.p(paramdt).c() == this)
/* 113:    */     {
/* 114:134 */       localel = (el)localbec.b(a);
/* 115:136 */       if (localel == null) {
/* 116:137 */         return false;
/* 117:    */       }
/* 118:139 */       if ((localel == el.c) && (paramej != ej.f) && (paramej != ej.e)) {
/* 119:140 */         return false;
/* 120:    */       }
/* 121:142 */       if ((localel == el.a) && (paramej != ej.d) && (paramej != ej.c)) {
/* 122:143 */         return false;
/* 123:    */       }
/* 124:    */     }
/* 125:147 */     int i = (paramard.p(paramdt.e()).c() == this) && (paramard.p(paramdt.f(2)).c() != this) ? 1 : 0;
/* 126:148 */     int j = (paramard.p(paramdt.f()).c() == this) && (paramard.p(paramdt.g(2)).c() != this) ? 1 : 0;
/* 127:    */     
/* 128:150 */     int k = (paramard.p(paramdt.c()).c() == this) && (paramard.p(paramdt.d(2)).c() != this) ? 1 : 0;
/* 129:151 */     int m = (paramard.p(paramdt.d()).c() == this) && (paramard.p(paramdt.e(2)).c() != this) ? 1 : 0;
/* 130:    */     
/* 131:153 */     int n = (i != 0) || (j != 0) || (localel == el.a) ? 1 : 0;
/* 132:154 */     int i1 = (k != 0) || (m != 0) || (localel == el.c) ? 1 : 0;
/* 133:156 */     if ((n != 0) && (paramej == ej.e)) {
/* 134:157 */       return true;
/* 135:    */     }
/* 136:159 */     if ((n != 0) && (paramej == ej.f)) {
/* 137:160 */       return true;
/* 138:    */     }
/* 139:162 */     if ((i1 != 0) && (paramej == ej.c)) {
/* 140:163 */       return true;
/* 141:    */     }
/* 142:165 */     if ((i1 != 0) && (paramej == ej.d)) {
/* 143:166 */       return true;
/* 144:    */     }
/* 145:169 */     return false;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public int a(Random paramRandom)
/* 149:    */   {
/* 150:174 */     return 0;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public aql k()
/* 154:    */   {
/* 155:179 */     return aql.d;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, wv paramwv)
/* 159:    */   {
/* 160:184 */     if ((paramwv.m == null) && (paramwv.l == null)) {
/* 161:185 */       paramwv.aq();
/* 162:    */     }
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 166:    */   {
/* 167:191 */     if (paramRandom.nextInt(100) == 0) {
/* 168:192 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "portal.portal", 0.5F, paramRandom.nextFloat() * 0.4F + 0.8F, false);
/* 169:    */     }
/* 170:195 */     for (int i = 0; i < 4; i++)
/* 171:    */     {
/* 172:196 */       double d1 = paramdt.n() + paramRandom.nextFloat();
/* 173:197 */       double d2 = paramdt.o() + paramRandom.nextFloat();
/* 174:198 */       double d3 = paramdt.p() + paramRandom.nextFloat();
/* 175:199 */       double d4 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 176:200 */       double d5 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 177:201 */       double d6 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 178:    */       
/* 179:203 */       int j = paramRandom.nextInt(2) * 2 - 1;
/* 180:204 */       if ((paramaqu.p(paramdt.e()).c() == this) || (paramaqu.p(paramdt.f()).c() == this))
/* 181:    */       {
/* 182:205 */         d3 = paramdt.p() + 0.5D + 0.25D * j;
/* 183:206 */         d6 = paramRandom.nextFloat() * 2.0F * j;
/* 184:    */       }
/* 185:    */       else
/* 186:    */       {
/* 187:208 */         d1 = paramdt.n() + 0.5D + 0.25D * j;
/* 188:209 */         d4 = paramRandom.nextFloat() * 2.0F * j;
/* 189:    */       }
/* 190:212 */       paramaqu.a(ew.y, d1, d2, d3, d4, d5, d6, new int[0]);
/* 191:    */     }
/* 192:    */   }
/* 193:    */   
/* 194:    */   public alq b(aqu paramaqu, dt paramdt)
/* 195:    */   {
/* 196:218 */     return null;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public bec a(int paramInt)
/* 200:    */   {
/* 201:223 */     return P().a(a, (paramInt & 0x3) == 2 ? el.c : el.a);
/* 202:    */   }
/* 203:    */   
/* 204:    */   public int c(bec parambec)
/* 205:    */   {
/* 206:229 */     return a((el)parambec.b(a));
/* 207:    */   }
/* 208:    */   
/* 209:    */   protected bed e()
/* 210:    */   {
/* 211:234 */     return new bed(this, new bex[] { a });
/* 212:    */   }
/* 213:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayy
 * JD-Core Version:    0.7.0.1
 */