/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class aul
/*   4:    */   extends avb
/*   5:    */   implements atz
/*   6:    */ {
/*   7: 24 */   public static final bew a = bew.a("age", 0, 2);
/*   8:    */   
/*   9:    */   public aul()
/*  10:    */   {
/*  11: 27 */     super(bof.k);
/*  12: 28 */     j(this.L.b().a(N, ej.c).a(a, Integer.valueOf(0)));
/*  13: 29 */     a(true);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  17:    */   {
/*  18: 34 */     if (!e(paramaqu, paramdt, parambec))
/*  19:    */     {
/*  20: 35 */       f(paramaqu, paramdt, parambec);
/*  21:    */     }
/*  22: 36 */     else if (paramaqu.s.nextInt(5) == 0)
/*  23:    */     {
/*  24: 37 */       int i = ((Integer)parambec.b(a)).intValue();
/*  25: 38 */       if (i < 2) {
/*  26: 39 */         paramaqu.a(paramdt, parambec.a(a, Integer.valueOf(i + 1)), 2);
/*  27:    */       }
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean e(aqu paramaqu, dt paramdt, bec parambec)
/*  32:    */   {
/*  33: 45 */     paramdt = paramdt.a((ej)parambec.b(N));
/*  34:    */     
/*  35: 47 */     bec localbec = paramaqu.p(paramdt);
/*  36: 48 */     return (localbec.c() == aty.r) && (localbec.b(ayw.a) == ayx.d);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean d()
/*  40:    */   {
/*  41: 53 */     return false;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean c()
/*  45:    */   {
/*  46: 58 */     return false;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  50:    */   {
/*  51: 64 */     a(paramaqu, paramdt);
/*  52: 65 */     return super.a(paramaqu, paramdt, parambec);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public brt a(aqu paramaqu, dt paramdt)
/*  56:    */   {
/*  57: 70 */     a(paramaqu, paramdt);
/*  58: 71 */     return super.a(paramaqu, paramdt);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void a(ard paramard, dt paramdt)
/*  62:    */   {
/*  63: 76 */     bec localbec = paramard.p(paramdt);
/*  64: 77 */     ej localej = (ej)localbec.b(N);
/*  65: 78 */     int i = ((Integer)localbec.b(a)).intValue();
/*  66:    */     
/*  67: 80 */     int j = 4 + i * 2;
/*  68: 81 */     int k = 5 + i * 2;
/*  69:    */     
/*  70: 83 */     float f = j / 2.0F;
/*  71: 85 */     switch (aum.a[localej.ordinal()])
/*  72:    */     {
/*  73:    */     case 1: 
/*  74: 87 */       a((8.0F - f) / 16.0F, (12.0F - k) / 16.0F, (15.0F - j) / 16.0F, (8.0F + f) / 16.0F, 0.75F, 0.9375F);
/*  75: 88 */       break;
/*  76:    */     case 2: 
/*  77: 90 */       a((8.0F - f) / 16.0F, (12.0F - k) / 16.0F, 0.0625F, (8.0F + f) / 16.0F, 0.75F, (1.0F + j) / 16.0F);
/*  78: 91 */       break;
/*  79:    */     case 3: 
/*  80: 93 */       a(0.0625F, (12.0F - k) / 16.0F, (8.0F - f) / 16.0F, (1.0F + j) / 16.0F, 0.75F, (8.0F + f) / 16.0F);
/*  81: 94 */       break;
/*  82:    */     case 4: 
/*  83: 96 */       a((15.0F - j) / 16.0F, (12.0F - k) / 16.0F, (8.0F - f) / 16.0F, 0.9375F, 0.75F, (8.0F + f) / 16.0F);
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj)
/*  88:    */   {
/*  89:103 */     ej localej = ej.a(paramxm.y);
/*  90:104 */     paramaqu.a(paramdt, parambec.a(N, localej), 2);
/*  91:    */   }
/*  92:    */   
/*  93:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  94:    */   {
/*  95:109 */     if (!paramej.k().c()) {
/*  96:110 */       paramej = ej.c;
/*  97:    */     }
/*  98:112 */     return P().a(N, paramej.d()).a(a, Integer.valueOf(0));
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 102:    */   {
/* 103:117 */     if (!e(paramaqu, paramdt, parambec)) {
/* 104:118 */       f(paramaqu, paramdt, parambec);
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   private void f(aqu paramaqu, dt paramdt, bec parambec)
/* 109:    */   {
/* 110:123 */     paramaqu.a(paramdt, aty.a.P(), 3);
/* 111:124 */     b(paramaqu, paramdt, parambec, 0);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/* 115:    */   {
/* 116:129 */     int i = ((Integer)parambec.b(a)).intValue();
/* 117:130 */     int j = 1;
/* 118:131 */     if (i >= 2) {
/* 119:132 */       j = 3;
/* 120:    */     }
/* 121:134 */     for (int k = 0; k < j; k++) {
/* 122:135 */       a(paramaqu, paramdt, new amj(amk.aW, 1, akv.m.b()));
/* 123:    */     }
/* 124:    */   }
/* 125:    */   
/* 126:    */   public alq b(aqu paramaqu, dt paramdt)
/* 127:    */   {
/* 128:141 */     return amk.aW;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public int j(aqu paramaqu, dt paramdt)
/* 132:    */   {
/* 133:146 */     return akv.m.b();
/* 134:    */   }
/* 135:    */   
/* 136:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, boolean paramBoolean)
/* 137:    */   {
/* 138:151 */     return ((Integer)parambec.b(a)).intValue() < 2;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public boolean a(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/* 142:    */   {
/* 143:156 */     return true;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void b(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/* 147:    */   {
/* 148:161 */     paramaqu.a(paramdt, parambec.a(a, Integer.valueOf(((Integer)parambec.b(a)).intValue() + 1)), 2);
/* 149:    */   }
/* 150:    */   
/* 151:    */   public aql k()
/* 152:    */   {
/* 153:166 */     return aql.c;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public bec a(int paramInt)
/* 157:    */   {
/* 158:171 */     return P().a(N, ej.b(paramInt)).a(a, Integer.valueOf((paramInt & 0xF) >> 2));
/* 159:    */   }
/* 160:    */   
/* 161:    */   public int c(bec parambec)
/* 162:    */   {
/* 163:178 */     int i = 0;
/* 164:    */     
/* 165:180 */     i |= ((ej)parambec.b(N)).b();
/* 166:181 */     i |= ((Integer)parambec.b(a)).intValue() << 2;
/* 167:    */     
/* 168:183 */     return i;
/* 169:    */   }
/* 170:    */   
/* 171:    */   protected bed e()
/* 172:    */   {
/* 173:188 */     return new bed(this, new bex[] { N, a });
/* 174:    */   }
/* 175:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aul
 * JD-Core Version:    0.7.0.1
 */