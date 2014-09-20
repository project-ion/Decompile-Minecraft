/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ abstract class bnn
/*   5:    */   extends bms
/*   6:    */ {
/*   7:226 */   protected int h = -1;
/*   8:    */   private int a;
/*   9:    */   private boolean b;
/*  10:    */   
/*  11:    */   public bnn() {}
/*  12:    */   
/*  13:    */   protected bnn(bnk parambnk, int paramInt)
/*  14:    */   {
/*  15:235 */     super(paramInt);
/*  16:236 */     if (parambnk != null) {
/*  17:237 */       this.b = parambnk.b;
/*  18:    */     }
/*  19:    */   }
/*  20:    */   
/*  21:    */   protected void a(fn paramfn)
/*  22:    */   {
/*  23:243 */     paramfn.a("HPos", this.h);
/*  24:244 */     paramfn.a("VCount", this.a);
/*  25:245 */     paramfn.a("Desert", this.b);
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected void b(fn paramfn)
/*  29:    */   {
/*  30:250 */     this.h = paramfn.f("HPos");
/*  31:251 */     this.a = paramfn.f("VCount");
/*  32:252 */     this.b = paramfn.n("Desert");
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected bms a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2)
/*  36:    */   {
/*  37:256 */     if (this.m != null) {
/*  38:257 */       switch (bmz.a[this.m.ordinal()])
/*  39:    */       {
/*  40:    */       case 1: 
/*  41:259 */         return bmy.a(parambnk, paramList, paramRandom, this.l.a - 1, this.l.b + paramInt1, this.l.c + paramInt2, ej.e, d());
/*  42:    */       case 2: 
/*  43:261 */         return bmy.a(parambnk, paramList, paramRandom, this.l.a - 1, this.l.b + paramInt1, this.l.c + paramInt2, ej.e, d());
/*  44:    */       case 3: 
/*  45:263 */         return bmy.a(parambnk, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.c - 1, ej.c, d());
/*  46:    */       case 4: 
/*  47:265 */         return bmy.a(parambnk, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.c - 1, ej.c, d());
/*  48:    */       }
/*  49:    */     }
/*  50:268 */     return null;
/*  51:    */   }
/*  52:    */   
/*  53:    */   protected bms b(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2)
/*  54:    */   {
/*  55:272 */     if (this.m != null) {
/*  56:273 */       switch (bmz.a[this.m.ordinal()])
/*  57:    */       {
/*  58:    */       case 1: 
/*  59:275 */         return bmy.a(parambnk, paramList, paramRandom, this.l.d + 1, this.l.b + paramInt1, this.l.c + paramInt2, ej.f, d());
/*  60:    */       case 2: 
/*  61:277 */         return bmy.a(parambnk, paramList, paramRandom, this.l.d + 1, this.l.b + paramInt1, this.l.c + paramInt2, ej.f, d());
/*  62:    */       case 3: 
/*  63:279 */         return bmy.a(parambnk, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.f + 1, ej.d, d());
/*  64:    */       case 4: 
/*  65:281 */         return bmy.a(parambnk, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.f + 1, ej.d, d());
/*  66:    */       }
/*  67:    */     }
/*  68:284 */     return null;
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected int b(aqu paramaqu, bjb parambjb)
/*  72:    */   {
/*  73:288 */     int i = 0;
/*  74:289 */     int j = 0;
/*  75:290 */     for (int k = this.l.c; k <= this.l.f; k++) {
/*  76:291 */       for (int m = this.l.a; m <= this.l.d; m++)
/*  77:    */       {
/*  78:292 */         dt localdt = new dt(m, 64, k);
/*  79:293 */         if (parambjb.b(localdt))
/*  80:    */         {
/*  81:294 */           i += Math.max(paramaqu.r(localdt).o(), paramaqu.t.i());
/*  82:295 */           j++;
/*  83:    */         }
/*  84:    */       }
/*  85:    */     }
/*  86:300 */     if (j == 0) {
/*  87:301 */       return -1;
/*  88:    */     }
/*  89:303 */     return i / j;
/*  90:    */   }
/*  91:    */   
/*  92:    */   protected static boolean a(bjb parambjb)
/*  93:    */   {
/*  94:307 */     return (parambjb != null) && (parambjb.b > 10);
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected void a(aqu paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  98:    */   {
/*  99:322 */     if (this.a >= paramInt4) {
/* 100:323 */       return;
/* 101:    */     }
/* 102:326 */     for (int i = this.a; i < paramInt4; i++)
/* 103:    */     {
/* 104:327 */       int j = a(paramInt1 + i, paramInt3);
/* 105:328 */       int k = d(paramInt2);
/* 106:329 */       int m = b(paramInt1 + i, paramInt3);
/* 107:331 */       if (!parambjb.b(new dt(j, k, m))) {
/* 108:    */         break;
/* 109:    */       }
/* 110:332 */       this.a += 1;
/* 111:    */       
/* 112:334 */       agp localagp = new agp(paramaqu);
/* 113:335 */       localagp.b(j + 0.5D, k, m + 0.5D, 0.0F, 0.0F);
/* 114:336 */       localagp.a(paramaqu.E(new dt(localagp)), null);
/* 115:337 */       localagp.r(c(i, localagp.cj()));
/* 116:338 */       paramaqu.d(localagp);
/* 117:    */     }
/* 118:    */   }
/* 119:    */   
/* 120:    */   protected int c(int paramInt1, int paramInt2)
/* 121:    */   {
/* 122:347 */     return paramInt2;
/* 123:    */   }
/* 124:    */   
/* 125:    */   protected bec a(bec parambec)
/* 126:    */   {
/* 127:351 */     if (this.b)
/* 128:    */     {
/* 129:352 */       if ((parambec.c() == aty.r) || (parambec.c() == aty.s)) {
/* 130:353 */         return aty.A.P();
/* 131:    */       }
/* 132:354 */       if (parambec.c() == aty.e) {
/* 133:355 */         return aty.A.a(bae.a.a());
/* 134:    */       }
/* 135:356 */       if (parambec.c() == aty.f) {
/* 136:357 */         return aty.A.a(bae.c.a());
/* 137:    */       }
/* 138:358 */       if (parambec.c() == aty.ad) {
/* 139:359 */         return aty.bO.P().a(bat.a, parambec.b(bat.a));
/* 140:    */       }
/* 141:360 */       if (parambec.c() == aty.aw) {
/* 142:361 */         return aty.bO.P().a(bat.a, parambec.b(bat.a));
/* 143:    */       }
/* 144:362 */       if (parambec.c() == aty.n) {
/* 145:363 */         return aty.A.P();
/* 146:    */       }
/* 147:    */     }
/* 148:366 */     return parambec;
/* 149:    */   }
/* 150:    */   
/* 151:    */   protected void a(aqu paramaqu, bec parambec, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 152:    */   {
/* 153:371 */     bec localbec = a(parambec);
/* 154:372 */     super.a(paramaqu, localbec, paramInt1, paramInt2, paramInt3, parambjb);
/* 155:    */   }
/* 156:    */   
/* 157:    */   protected void a(aqu paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, bec parambec1, bec parambec2, boolean paramBoolean)
/* 158:    */   {
/* 159:377 */     bec localbec1 = a(parambec1);
/* 160:378 */     bec localbec2 = a(parambec2);
/* 161:379 */     super.a(paramaqu, parambjb, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, localbec1, localbec2, paramBoolean);
/* 162:    */   }
/* 163:    */   
/* 164:    */   protected void b(aqu paramaqu, bec parambec, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 165:    */   {
/* 166:384 */     bec localbec = a(parambec);
/* 167:385 */     super.b(paramaqu, localbec, paramInt1, paramInt2, paramInt3, parambjb);
/* 168:    */   }
/* 169:    */   
/* 170:    */   protected void a(boolean paramBoolean)
/* 171:    */   {
/* 172:389 */     this.b = paramBoolean;
/* 173:    */   }
/* 174:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bnn
 * JD-Core Version:    0.7.0.1
 */