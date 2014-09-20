/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class avi
/*   5:    */   extends auc
/*   6:    */   implements atz
/*   7:    */ {
/*   8: 26 */   public static final bev a = bev.a("variant", avk.class);
/*   9: 27 */   public static final bev b = bev.a("half", avj.class);
/*  10:    */   
/*  11:    */   public avi()
/*  12:    */   {
/*  13: 30 */     super(bof.l);
/*  14: 31 */     j(this.L.b().a(a, avk.a).a(b, avj.b));
/*  15: 32 */     c(0.0F);
/*  16: 33 */     a(h);
/*  17: 34 */     c("doublePlant");
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void a(ard paramard, dt paramdt)
/*  21:    */   {
/*  22: 39 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public avk e(ard paramard, dt paramdt)
/*  26:    */   {
/*  27: 43 */     bec localbec = paramard.p(paramdt);
/*  28: 45 */     if (localbec.c() == this)
/*  29:    */     {
/*  30: 46 */       localbec = a(localbec, paramard, paramdt);
/*  31:    */       
/*  32: 48 */       return (avk)localbec.b(a);
/*  33:    */     }
/*  34: 51 */     return avk.d;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  38:    */   {
/*  39: 56 */     return (super.c(paramaqu, paramdt)) && (paramaqu.d(paramdt.a()));
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean f(aqu paramaqu, dt paramdt)
/*  43:    */   {
/*  44: 61 */     bec localbec = paramaqu.p(paramdt);
/*  45: 62 */     if (localbec.c() == this)
/*  46:    */     {
/*  47: 63 */       avk localavk = (avk)a(localbec, paramaqu, paramdt).b(a);
/*  48: 64 */       return (localavk == avk.d) || (localavk == avk.c);
/*  49:    */     }
/*  50: 66 */     return true;
/*  51:    */   }
/*  52:    */   
/*  53:    */   protected void e(aqu paramaqu, dt paramdt, bec parambec)
/*  54:    */   {
/*  55: 71 */     if (f(paramaqu, paramdt, parambec)) {
/*  56: 72 */       return;
/*  57:    */     }
/*  58: 75 */     int i = parambec.b(b) == avj.a ? 1 : 0;
/*  59: 76 */     dt localdt1 = i != 0 ? paramdt : paramdt.a();
/*  60: 77 */     dt localdt2 = i != 0 ? paramdt.b() : paramdt;
/*  61: 78 */     atr localatr = i != 0 ? this : paramaqu.p(localdt1).c();
/*  62: 79 */     avi localavi = i != 0 ? paramaqu.p(localdt2).c() : this;
/*  63: 81 */     if (localatr == this) {
/*  64: 82 */       paramaqu.a(localdt1, aty.a.P(), 3);
/*  65:    */     }
/*  66: 84 */     if (localavi == this)
/*  67:    */     {
/*  68: 85 */       paramaqu.a(localdt2, aty.a.P(), 3);
/*  69: 86 */       if (i == 0) {
/*  70: 87 */         b(paramaqu, localdt2, parambec, 0);
/*  71:    */       }
/*  72:    */     }
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean f(aqu paramaqu, dt paramdt, bec parambec)
/*  76:    */   {
/*  77: 94 */     if (parambec.b(b) == avj.a) {
/*  78: 95 */       return paramaqu.p(paramdt.b()).c() == this;
/*  79:    */     }
/*  80: 98 */     bec localbec = paramaqu.p(paramdt.a());
/*  81: 99 */     return (localbec.c() == this) && (super.f(paramaqu, paramdt, localbec));
/*  82:    */   }
/*  83:    */   
/*  84:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  85:    */   {
/*  86:105 */     if (parambec.b(b) == avj.a) {
/*  87:106 */       return null;
/*  88:    */     }
/*  89:108 */     avk localavk = (avk)parambec.b(a);
/*  90:109 */     if (localavk == avk.d) {
/*  91:111 */       return null;
/*  92:    */     }
/*  93:114 */     if (localavk == avk.c)
/*  94:    */     {
/*  95:115 */       if (paramRandom.nextInt(8) == 0) {
/*  96:116 */         return amk.N;
/*  97:    */       }
/*  98:118 */       return null;
/*  99:    */     }
/* 100:120 */     return alq.a(this);
/* 101:    */   }
/* 102:    */   
/* 103:    */   public int a(bec parambec)
/* 104:    */   {
/* 105:125 */     if ((parambec.b(b) == avj.a) || (parambec.b(a) == avk.c)) {
/* 106:126 */       return 0;
/* 107:    */     }
/* 108:128 */     return ((avk)parambec.b(a)).a();
/* 109:    */   }
/* 110:    */   
/* 111:    */   public int a(ard paramard, dt paramdt, int paramInt)
/* 112:    */   {
/* 113:133 */     avk localavk = e(paramard, paramdt);
/* 114:134 */     if ((localavk == avk.c) || (localavk == avk.d)) {
/* 115:135 */       return art.a(paramard, paramdt);
/* 116:    */     }
/* 117:137 */     return 16777215;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void a(aqu paramaqu, dt paramdt, avk paramavk, int paramInt)
/* 121:    */   {
/* 122:141 */     paramaqu.a(paramdt, P().a(b, avj.b).a(a, paramavk), paramInt);
/* 123:142 */     paramaqu.a(paramdt.a(), P().a(b, avj.a), paramInt);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj)
/* 127:    */   {
/* 128:147 */     paramaqu.a(paramdt.a(), P().a(b, avj.a), 2);
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void a(aqu paramaqu, ahd paramahd, dt paramdt, bec parambec, bcm parambcm)
/* 132:    */   {
/* 133:152 */     if ((!paramaqu.D) && (paramahd.bY() != null) && (paramahd.bY().b() == amk.be)) {
/* 134:156 */       if ((parambec.b(b) == avj.b) && 
/* 135:157 */         (b(paramaqu, paramdt, parambec, paramahd))) {
/* 136:158 */         return;
/* 137:    */       }
/* 138:    */     }
/* 139:162 */     super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd)
/* 143:    */   {
/* 144:167 */     if (parambec.b(b) == avj.a)
/* 145:    */     {
/* 146:168 */       if (paramaqu.p(paramdt.b()).c() == this) {
/* 147:169 */         if (!paramahd.by.d)
/* 148:    */         {
/* 149:171 */           bec localbec = paramaqu.p(paramdt.b());
/* 150:172 */           avk localavk = (avk)localbec.b(a);
/* 151:173 */           if ((localavk == avk.d) || (localavk == avk.c))
/* 152:    */           {
/* 153:174 */             if (!paramaqu.D)
/* 154:    */             {
/* 155:175 */               if ((paramahd.bY() != null) && (paramahd.bY().b() == amk.be))
/* 156:    */               {
/* 157:176 */                 b(paramaqu, paramdt, localbec, paramahd);
/* 158:177 */                 paramaqu.g(paramdt.b());
/* 159:    */               }
/* 160:    */               else
/* 161:    */               {
/* 162:179 */                 paramaqu.b(paramdt.b(), true);
/* 163:    */               }
/* 164:    */             }
/* 165:    */             else {
/* 166:182 */               paramaqu.g(paramdt.b());
/* 167:    */             }
/* 168:    */           }
/* 169:    */           else {
/* 170:185 */             paramaqu.b(paramdt.b(), true);
/* 171:    */           }
/* 172:    */         }
/* 173:    */         else
/* 174:    */         {
/* 175:188 */           paramaqu.g(paramdt.b());
/* 176:    */         }
/* 177:    */       }
/* 178:    */     }
/* 179:192 */     else if ((paramahd.by.d) && (paramaqu.p(paramdt.a()).c() == this)) {
/* 180:194 */       paramaqu.a(paramdt.a(), aty.a.P(), 2);
/* 181:    */     }
/* 182:197 */     super.a(paramaqu, paramdt, parambec, paramahd);
/* 183:    */   }
/* 184:    */   
/* 185:    */   private boolean b(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd)
/* 186:    */   {
/* 187:201 */     avk localavk = (avk)parambec.b(a);
/* 188:202 */     if ((localavk == avk.d) || (localavk == avk.c))
/* 189:    */     {
/* 190:203 */       paramahd.b(ty.H[atr.a(this)]);
/* 191:    */       
/* 192:205 */       int i = (localavk == avk.c ? bbi.b : bbi.c).a();
/* 193:206 */       a(paramaqu, paramdt, new amj(aty.H, 2, i));
/* 194:207 */       return true;
/* 195:    */     }
/* 196:209 */     return false;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void a(alq paramalq, akf paramakf, List paramList)
/* 200:    */   {
/* 201:214 */     for (avk localavk : ) {
/* 202:215 */       paramList.add(new amj(paramalq, 1, localavk.a()));
/* 203:    */     }
/* 204:    */   }
/* 205:    */   
/* 206:    */   public int j(aqu paramaqu, dt paramdt)
/* 207:    */   {
/* 208:221 */     return e(paramaqu, paramdt).a();
/* 209:    */   }
/* 210:    */   
/* 211:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, boolean paramBoolean)
/* 212:    */   {
/* 213:226 */     avk localavk = e(paramaqu, paramdt);
/* 214:    */     
/* 215:228 */     return (localavk != avk.c) && (localavk != avk.d);
/* 216:    */   }
/* 217:    */   
/* 218:    */   public boolean a(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/* 219:    */   {
/* 220:233 */     return true;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void b(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/* 224:    */   {
/* 225:238 */     a(paramaqu, paramdt, new amj(this, 1, e(paramaqu, paramdt).a()));
/* 226:    */   }
/* 227:    */   
/* 228:    */   public bec a(int paramInt)
/* 229:    */   {
/* 230:247 */     if ((paramInt & 0x8) > 0) {
/* 231:248 */       return P().a(b, avj.a);
/* 232:    */     }
/* 233:251 */     return P().a(b, avj.b).a(a, avk.a(paramInt & 0x7));
/* 234:    */   }
/* 235:    */   
/* 236:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/* 237:    */   {
/* 238:259 */     if (parambec.b(b) == avj.a)
/* 239:    */     {
/* 240:260 */       bec localbec = paramard.p(paramdt.b());
/* 241:261 */       if (localbec.c() == this) {
/* 242:262 */         parambec = parambec.a(a, localbec.b(a));
/* 243:    */       }
/* 244:    */     }
/* 245:266 */     return parambec;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public int c(bec parambec)
/* 249:    */   {
/* 250:271 */     if (parambec.b(b) == avj.a) {
/* 251:272 */       return 8;
/* 252:    */     }
/* 253:274 */     return ((avk)parambec.b(a)).a();
/* 254:    */   }
/* 255:    */   
/* 256:    */   protected bed e()
/* 257:    */   {
/* 258:279 */     return new bed(this, new bex[] { b, a });
/* 259:    */   }
/* 260:    */   
/* 261:    */   public atw Q()
/* 262:    */   {
/* 263:362 */     return atw.b;
/* 264:    */   }
/* 265:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avi
 * JD-Core Version:    0.7.0.1
 */