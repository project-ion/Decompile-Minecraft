/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class aup
/*   5:    */   extends ava
/*   6:    */   implements avs
/*   7:    */ {
/*   8: 30 */   public static final bet a = bet.a("powered");
/*   9: 31 */   public static final bev b = bev.a("mode", aur.class);
/*  10:    */   
/*  11:    */   public aup(boolean paramBoolean)
/*  12:    */   {
/*  13: 34 */     super(paramBoolean);
/*  14: 35 */     j(this.L.b().a(N, ej.c).a(a, Boolean.valueOf(false)).a(b, aur.a));
/*  15: 36 */     this.A = true;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  19:    */   {
/*  20: 42 */     return amk.ce;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public alq b(aqu paramaqu, dt paramdt)
/*  24:    */   {
/*  25: 47 */     return amk.ce;
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected int d(bec parambec)
/*  29:    */   {
/*  30: 52 */     return 2;
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected bec e(bec parambec)
/*  34:    */   {
/*  35: 57 */     Boolean localBoolean = (Boolean)parambec.b(a);
/*  36: 58 */     aur localaur = (aur)parambec.b(b);
/*  37: 59 */     ej localej = (ej)parambec.b(N);
/*  38:    */     
/*  39: 61 */     return aty.ck.P().a(N, localej).a(a, localBoolean).a(b, localaur);
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected bec k(bec parambec)
/*  43:    */   {
/*  44: 66 */     Boolean localBoolean = (Boolean)parambec.b(a);
/*  45: 67 */     aur localaur = (aur)parambec.b(b);
/*  46: 68 */     ej localej = (ej)parambec.b(N);
/*  47:    */     
/*  48: 70 */     return aty.cj.P().a(N, localej).a(a, localBoolean).a(b, localaur);
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected boolean l(bec parambec)
/*  52:    */   {
/*  53: 75 */     return (this.M) || (((Boolean)parambec.b(a)).booleanValue());
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected int a(ard paramard, dt paramdt, bec parambec)
/*  57:    */   {
/*  58: 80 */     bcm localbcm = paramard.s(paramdt);
/*  59: 81 */     if ((localbcm instanceof bcv)) {
/*  60: 82 */       return ((bcv)localbcm).b();
/*  61:    */     }
/*  62: 85 */     return 0;
/*  63:    */   }
/*  64:    */   
/*  65:    */   private int j(aqu paramaqu, dt paramdt, bec parambec)
/*  66:    */   {
/*  67: 89 */     if (parambec.b(b) == aur.b) {
/*  68: 90 */       return Math.max(f(paramaqu, paramdt, parambec) - c(paramaqu, paramdt, parambec), 0);
/*  69:    */     }
/*  70: 93 */     return f(paramaqu, paramdt, parambec);
/*  71:    */   }
/*  72:    */   
/*  73:    */   protected boolean e(aqu paramaqu, dt paramdt, bec parambec)
/*  74:    */   {
/*  75: 98 */     int i = f(paramaqu, paramdt, parambec);
/*  76: 99 */     if (i >= 15) {
/*  77:100 */       return true;
/*  78:    */     }
/*  79:102 */     if (i == 0) {
/*  80:103 */       return false;
/*  81:    */     }
/*  82:106 */     int j = c(paramaqu, paramdt, parambec);
/*  83:107 */     if (j == 0) {
/*  84:108 */       return true;
/*  85:    */     }
/*  86:111 */     return i >= j;
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected int f(aqu paramaqu, dt paramdt, bec parambec)
/*  90:    */   {
/*  91:116 */     int i = super.f(paramaqu, paramdt, parambec);
/*  92:    */     
/*  93:118 */     ej localej = (ej)parambec.b(N);
/*  94:119 */     dt localdt = paramdt.a(localej);
/*  95:120 */     atr localatr = paramaqu.p(localdt).c();
/*  96:122 */     if (localatr.N())
/*  97:    */     {
/*  98:123 */       i = localatr.l(paramaqu, localdt);
/*  99:    */     }
/* 100:124 */     else if ((i < 15) && (localatr.t()))
/* 101:    */     {
/* 102:125 */       localdt = localdt.a(localej);
/* 103:126 */       localatr = paramaqu.p(localdt).c();
/* 104:128 */       if (localatr.N())
/* 105:    */       {
/* 106:129 */         i = localatr.l(paramaqu, localdt);
/* 107:    */       }
/* 108:130 */       else if (localatr.r() == bof.a)
/* 109:    */       {
/* 110:131 */         adk localadk = a(paramaqu, localej, localdt);
/* 111:132 */         if (localadk != null) {
/* 112:133 */           i = localadk.q();
/* 113:    */         }
/* 114:    */       }
/* 115:    */     }
/* 116:138 */     return i;
/* 117:    */   }
/* 118:    */   
/* 119:    */   private adk a(aqu paramaqu, ej paramej, dt paramdt)
/* 120:    */   {
/* 121:143 */     List localList = paramaqu.a(adk.class, new brt(paramdt.n(), paramdt.o(), paramdt.p(), paramdt.n() + 1, paramdt.o() + 1, paramdt.p() + 1), new auq(this, paramej));
/* 122:150 */     if (localList.size() == 1) {
/* 123:151 */       return (adk)localList.get(0);
/* 124:    */     }
/* 125:154 */     return null;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 129:    */   {
/* 130:159 */     if (!paramahd.by.e) {
/* 131:160 */       return false;
/* 132:    */     }
/* 133:163 */     parambec = parambec.a(b);
/* 134:164 */     paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.5D, paramdt.p() + 0.5D, "random.click", 0.3F, parambec.b(b) == aur.b ? 0.55F : 0.5F);
/* 135:    */     
/* 136:166 */     paramaqu.a(paramdt, parambec, 2);
/* 137:167 */     k(paramaqu, paramdt, parambec);
/* 138:168 */     return true;
/* 139:    */   }
/* 140:    */   
/* 141:    */   protected void g(aqu paramaqu, dt paramdt, bec parambec)
/* 142:    */   {
/* 143:173 */     if (paramaqu.a(paramdt, this)) {
/* 144:174 */       return;
/* 145:    */     }
/* 146:177 */     int i = j(paramaqu, paramdt, parambec);
/* 147:178 */     bcm localbcm = paramaqu.s(paramdt);
/* 148:179 */     int j = (localbcm instanceof bcv) ? ((bcv)localbcm).b() : 0;
/* 149:181 */     if ((i != j) || (l(parambec) != e(paramaqu, paramdt, parambec))) {
/* 150:183 */       if (i(paramaqu, paramdt, parambec)) {
/* 151:184 */         paramaqu.a(paramdt, this, 2, -1);
/* 152:    */       } else {
/* 153:186 */         paramaqu.a(paramdt, this, 2, 0);
/* 154:    */       }
/* 155:    */     }
/* 156:    */   }
/* 157:    */   
/* 158:    */   private void k(aqu paramaqu, dt paramdt, bec parambec)
/* 159:    */   {
/* 160:192 */     int i = j(paramaqu, paramdt, parambec);
/* 161:    */     
/* 162:194 */     bcm localbcm = paramaqu.s(paramdt);
/* 163:195 */     int j = 0;
/* 164:196 */     if ((localbcm instanceof bcv))
/* 165:    */     {
/* 166:197 */       bcv localbcv = (bcv)localbcm;
/* 167:    */       
/* 168:199 */       j = localbcv.b();
/* 169:200 */       localbcv.a(i);
/* 170:    */     }
/* 171:205 */     if ((j != i) || (parambec.b(b) == aur.a))
/* 172:    */     {
/* 173:206 */       boolean bool1 = e(paramaqu, paramdt, parambec);
/* 174:207 */       boolean bool2 = l(parambec);
/* 175:209 */       if ((bool2) && (!bool1)) {
/* 176:210 */         paramaqu.a(paramdt, parambec.a(a, Boolean.valueOf(false)), 2);
/* 177:211 */       } else if ((!bool2) && (bool1)) {
/* 178:212 */         paramaqu.a(paramdt, parambec.a(a, Boolean.valueOf(true)), 2);
/* 179:    */       }
/* 180:215 */       h(paramaqu, paramdt, parambec);
/* 181:    */     }
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 185:    */   {
/* 186:221 */     if (this.M) {
/* 187:223 */       paramaqu.a(paramdt, k(parambec).a(a, Boolean.valueOf(true)), 4);
/* 188:    */     }
/* 189:225 */     k(paramaqu, paramdt, parambec);
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/* 193:    */   {
/* 194:230 */     super.c(paramaqu, paramdt, parambec);
/* 195:231 */     paramaqu.a(paramdt, a(paramaqu, 0));
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 199:    */   {
/* 200:236 */     super.b(paramaqu, paramdt, parambec);
/* 201:237 */     paramaqu.t(paramdt);
/* 202:    */     
/* 203:239 */     h(paramaqu, paramdt, parambec);
/* 204:    */   }
/* 205:    */   
/* 206:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, int paramInt1, int paramInt2)
/* 207:    */   {
/* 208:244 */     super.a(paramaqu, paramdt, parambec, paramInt1, paramInt2);
/* 209:    */     
/* 210:246 */     bcm localbcm = paramaqu.s(paramdt);
/* 211:247 */     if (localbcm == null) {
/* 212:248 */       return false;
/* 213:    */     }
/* 214:251 */     return localbcm.c(paramInt1, paramInt2);
/* 215:    */   }
/* 216:    */   
/* 217:    */   public bcm a(aqu paramaqu, int paramInt)
/* 218:    */   {
/* 219:256 */     return new bcv();
/* 220:    */   }
/* 221:    */   
/* 222:    */   public bec a(int paramInt)
/* 223:    */   {
/* 224:261 */     return P().a(N, ej.b(paramInt)).a(a, Boolean.valueOf((paramInt & 0x8) > 0)).a(b, (paramInt & 0x4) > 0 ? aur.b : aur.a);
/* 225:    */   }
/* 226:    */   
/* 227:    */   public int c(bec parambec)
/* 228:    */   {
/* 229:269 */     int i = 0;
/* 230:    */     
/* 231:271 */     i |= ((ej)parambec.b(N)).b();
/* 232:273 */     if (((Boolean)parambec.b(a)).booleanValue()) {
/* 233:274 */       i |= 0x8;
/* 234:    */     }
/* 235:277 */     if (parambec.b(b) == aur.b) {
/* 236:278 */       i |= 0x4;
/* 237:    */     }
/* 238:281 */     return i;
/* 239:    */   }
/* 240:    */   
/* 241:    */   protected bed e()
/* 242:    */   {
/* 243:286 */     return new bed(this, new bex[] { N, b, a });
/* 244:    */   }
/* 245:    */   
/* 246:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 247:    */   {
/* 248:313 */     return P().a(N, paramxm.aO().d()).a(a, Boolean.valueOf(false)).a(b, aur.a);
/* 249:    */   }
/* 250:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aup
 * JD-Core Version:    0.7.0.1
 */