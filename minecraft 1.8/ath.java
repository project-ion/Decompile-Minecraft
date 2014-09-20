/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class ath
/*   4:    */   extends atr
/*   5:    */ {
/*   6:    */   protected ath(bof parambof)
/*   7:    */   {
/*   8: 20 */     super(parambof);
/*   9: 21 */     a(akf.d);
/*  10: 22 */     a(true);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void a(ard paramard, dt paramdt)
/*  14:    */   {
/*  15: 27 */     d(paramard.p(paramdt));
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected void d(bec parambec)
/*  19:    */   {
/*  20: 31 */     int i = e(parambec) > 0 ? 1 : 0;
/*  21: 32 */     float f = 0.0625F;
/*  22: 34 */     if (i != 0) {
/*  23: 35 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.03125F, 0.9375F);
/*  24:    */     } else {
/*  25: 37 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.0625F, 0.9375F);
/*  26:    */     }
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a(aqu paramaqu)
/*  30:    */   {
/*  31: 43 */     return 20;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  35:    */   {
/*  36: 49 */     return null;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean c()
/*  40:    */   {
/*  41: 54 */     return false;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean d()
/*  45:    */   {
/*  46: 59 */     return false;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean b(ard paramard, dt paramdt)
/*  50:    */   {
/*  51: 64 */     return true;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  55:    */   {
/*  56: 69 */     return m(paramaqu, paramdt.b());
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  60:    */   {
/*  61: 74 */     if (!m(paramaqu, paramdt.b()))
/*  62:    */     {
/*  63: 75 */       b(paramaqu, paramdt, parambec, 0);
/*  64: 76 */       paramaqu.g(paramdt);
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   private boolean m(aqu paramaqu, dt paramdt)
/*  69:    */   {
/*  70: 81 */     return (aqu.a(paramaqu, paramdt)) || ((paramaqu.p(paramdt).c() instanceof avv));
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom) {}
/*  74:    */   
/*  75:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  76:    */   {
/*  77: 90 */     if (paramaqu.D) {
/*  78: 91 */       return;
/*  79:    */     }
/*  80: 94 */     int i = e(parambec);
/*  81: 95 */     if (i > 0) {
/*  82: 96 */       a(paramaqu, paramdt, parambec, i);
/*  83:    */     }
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, wv paramwv)
/*  87:    */   {
/*  88:102 */     if (paramaqu.D) {
/*  89:103 */       return;
/*  90:    */     }
/*  91:106 */     int i = e(parambec);
/*  92:107 */     if (i == 0) {
/*  93:108 */       a(paramaqu, paramdt, parambec, i);
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected void a(aqu paramaqu, dt paramdt, bec parambec, int paramInt)
/*  98:    */   {
/*  99:113 */     int i = e(paramaqu, paramdt);
/* 100:114 */     int j = paramInt > 0 ? 1 : 0;
/* 101:115 */     int k = i > 0 ? 1 : 0;
/* 102:117 */     if (paramInt != i)
/* 103:    */     {
/* 104:118 */       parambec = a(parambec, i);
/* 105:119 */       paramaqu.a(paramdt, parambec, 2);
/* 106:120 */       d(paramaqu, paramdt);
/* 107:121 */       paramaqu.b(paramdt, paramdt);
/* 108:    */     }
/* 109:124 */     if ((k == 0) && (j != 0)) {
/* 110:125 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.1D, paramdt.p() + 0.5D, "random.click", 0.3F, 0.5F);
/* 111:126 */     } else if ((k != 0) && (j == 0)) {
/* 112:127 */       paramaqu.a(paramdt.n() + 0.5D, paramdt.o() + 0.1D, paramdt.p() + 0.5D, "random.click", 0.3F, 0.6F);
/* 113:    */     }
/* 114:130 */     if (k != 0) {
/* 115:131 */       paramaqu.a(paramdt, this, a(paramaqu));
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   protected brt a(dt paramdt)
/* 120:    */   {
/* 121:136 */     float f = 0.125F;
/* 122:137 */     return new brt(paramdt.n() + 0.125F, paramdt.o(), paramdt.p() + 0.125F, paramdt.n() + 1 - 0.125F, paramdt.o() + 0.25D, paramdt.p() + 1 - 0.125F);
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 126:    */   {
/* 127:142 */     if (e(parambec) > 0) {
/* 128:143 */       d(paramaqu, paramdt);
/* 129:    */     }
/* 130:146 */     super.b(paramaqu, paramdt, parambec);
/* 131:    */   }
/* 132:    */   
/* 133:    */   protected void d(aqu paramaqu, dt paramdt)
/* 134:    */   {
/* 135:150 */     paramaqu.c(paramdt, this);
/* 136:151 */     paramaqu.c(paramdt.b(), this);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 140:    */   {
/* 141:156 */     return e(parambec);
/* 142:    */   }
/* 143:    */   
/* 144:    */   public int b(ard paramard, dt paramdt, bec parambec, ej paramej)
/* 145:    */   {
/* 146:161 */     if (paramej == ej.b) {
/* 147:162 */       return e(parambec);
/* 148:    */     }
/* 149:165 */     return 0;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public boolean g()
/* 153:    */   {
/* 154:170 */     return true;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void h()
/* 158:    */   {
/* 159:175 */     float f1 = 0.5F;
/* 160:176 */     float f2 = 0.125F;
/* 161:177 */     float f3 = 0.5F;
/* 162:178 */     a(0.0F, 0.375F, 0.0F, 1.0F, 0.625F, 1.0F);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public int i()
/* 166:    */   {
/* 167:183 */     return 1;
/* 168:    */   }
/* 169:    */   
/* 170:    */   protected abstract int e(aqu paramaqu, dt paramdt);
/* 171:    */   
/* 172:    */   protected abstract int e(bec parambec);
/* 173:    */   
/* 174:    */   protected abstract bec a(bec parambec, int paramInt);
/* 175:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ath
 * JD-Core Version:    0.7.0.1
 */