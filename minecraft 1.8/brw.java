/*   1:    */ public class brw
/*   2:    */ {
/*   3:    */   public final double a;
/*   4:    */   public final double b;
/*   5:    */   public final double c;
/*   6:    */   
/*   7:    */   public brw(double paramDouble1, double paramDouble2, double paramDouble3)
/*   8:    */   {
/*   9: 11 */     if (paramDouble1 == -0.0D) {
/*  10: 12 */       paramDouble1 = 0.0D;
/*  11:    */     }
/*  12: 14 */     if (paramDouble2 == -0.0D) {
/*  13: 15 */       paramDouble2 = 0.0D;
/*  14:    */     }
/*  15: 17 */     if (paramDouble3 == -0.0D) {
/*  16: 18 */       paramDouble3 = 0.0D;
/*  17:    */     }
/*  18: 20 */     this.a = paramDouble1;
/*  19: 21 */     this.b = paramDouble2;
/*  20: 22 */     this.c = paramDouble3;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public brw a(brw parambrw)
/*  24:    */   {
/*  25: 26 */     return new brw(parambrw.a - this.a, parambrw.b - this.b, parambrw.c - this.c);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public brw a()
/*  29:    */   {
/*  30: 30 */     double d = uv.a(this.a * this.a + this.b * this.b + this.c * this.c);
/*  31: 31 */     if (d < 0.0001D) {
/*  32: 32 */       return new brw(0.0D, 0.0D, 0.0D);
/*  33:    */     }
/*  34: 34 */     return new brw(this.a / d, this.b / d, this.c / d);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public double b(brw parambrw)
/*  38:    */   {
/*  39: 38 */     return this.a * parambrw.a + this.b * parambrw.b + this.c * parambrw.c;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public brw c(brw parambrw)
/*  43:    */   {
/*  44: 42 */     return new brw(this.b * parambrw.c - this.c * parambrw.b, this.c * parambrw.a - this.a * parambrw.c, this.a * parambrw.b - this.b * parambrw.a);
/*  45:    */   }
/*  46:    */   
/*  47:    */   public brw d(brw parambrw)
/*  48:    */   {
/*  49: 46 */     return a(parambrw.a, parambrw.b, parambrw.c);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public brw a(double paramDouble1, double paramDouble2, double paramDouble3)
/*  53:    */   {
/*  54: 50 */     return b(-paramDouble1, -paramDouble2, -paramDouble3);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public brw e(brw parambrw)
/*  58:    */   {
/*  59: 54 */     return b(parambrw.a, parambrw.b, parambrw.c);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public brw b(double paramDouble1, double paramDouble2, double paramDouble3)
/*  63:    */   {
/*  64: 58 */     return new brw(this.a + paramDouble1, this.b + paramDouble2, this.c + paramDouble3);
/*  65:    */   }
/*  66:    */   
/*  67:    */   public double f(brw parambrw)
/*  68:    */   {
/*  69: 62 */     double d1 = parambrw.a - this.a;
/*  70: 63 */     double d2 = parambrw.b - this.b;
/*  71: 64 */     double d3 = parambrw.c - this.c;
/*  72: 65 */     return uv.a(d1 * d1 + d2 * d2 + d3 * d3);
/*  73:    */   }
/*  74:    */   
/*  75:    */   public double g(brw parambrw)
/*  76:    */   {
/*  77: 69 */     double d1 = parambrw.a - this.a;
/*  78: 70 */     double d2 = parambrw.b - this.b;
/*  79: 71 */     double d3 = parambrw.c - this.c;
/*  80: 72 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public double b()
/*  84:    */   {
/*  85: 87 */     return uv.a(this.a * this.a + this.b * this.b + this.c * this.c);
/*  86:    */   }
/*  87:    */   
/*  88:    */   public brw a(brw parambrw, double paramDouble)
/*  89:    */   {
/*  90: 91 */     double d1 = parambrw.a - this.a;
/*  91: 92 */     double d2 = parambrw.b - this.b;
/*  92: 93 */     double d3 = parambrw.c - this.c;
/*  93: 95 */     if (d1 * d1 < 1.000000011686097E-007D) {
/*  94: 96 */       return null;
/*  95:    */     }
/*  96: 99 */     double d4 = (paramDouble - this.a) / d1;
/*  97:100 */     if ((d4 < 0.0D) || (d4 > 1.0D)) {
/*  98:101 */       return null;
/*  99:    */     }
/* 100:103 */     return new brw(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/* 101:    */   }
/* 102:    */   
/* 103:    */   public brw b(brw parambrw, double paramDouble)
/* 104:    */   {
/* 105:107 */     double d1 = parambrw.a - this.a;
/* 106:108 */     double d2 = parambrw.b - this.b;
/* 107:109 */     double d3 = parambrw.c - this.c;
/* 108:111 */     if (d2 * d2 < 1.000000011686097E-007D) {
/* 109:112 */       return null;
/* 110:    */     }
/* 111:115 */     double d4 = (paramDouble - this.b) / d2;
/* 112:116 */     if ((d4 < 0.0D) || (d4 > 1.0D)) {
/* 113:117 */       return null;
/* 114:    */     }
/* 115:119 */     return new brw(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/* 116:    */   }
/* 117:    */   
/* 118:    */   public brw c(brw parambrw, double paramDouble)
/* 119:    */   {
/* 120:123 */     double d1 = parambrw.a - this.a;
/* 121:124 */     double d2 = parambrw.b - this.b;
/* 122:125 */     double d3 = parambrw.c - this.c;
/* 123:127 */     if (d3 * d3 < 1.000000011686097E-007D) {
/* 124:128 */       return null;
/* 125:    */     }
/* 126:131 */     double d4 = (paramDouble - this.c) / d3;
/* 127:132 */     if ((d4 < 0.0D) || (d4 > 1.0D)) {
/* 128:133 */       return null;
/* 129:    */     }
/* 130:135 */     return new brw(this.a + d1 * d4, this.b + d2 * d4, this.c + d3 * d4);
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String toString()
/* 134:    */   {
/* 135:139 */     return "(" + this.a + ", " + this.b + ", " + this.c + ")";
/* 136:    */   }
/* 137:    */   
/* 138:    */   public brw a(float paramFloat)
/* 139:    */   {
/* 140:147 */     float f1 = uv.b(paramFloat);
/* 141:148 */     float f2 = uv.a(paramFloat);
/* 142:    */     
/* 143:150 */     double d1 = this.a;
/* 144:151 */     double d2 = this.b * f1 + this.c * f2;
/* 145:152 */     double d3 = this.c * f1 - this.b * f2;
/* 146:    */     
/* 147:154 */     return new brw(d1, d2, d3);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public brw b(float paramFloat)
/* 151:    */   {
/* 152:158 */     float f1 = uv.b(paramFloat);
/* 153:159 */     float f2 = uv.a(paramFloat);
/* 154:    */     
/* 155:161 */     double d1 = this.a * f1 + this.c * f2;
/* 156:162 */     double d2 = this.b;
/* 157:163 */     double d3 = this.c * f1 - this.a * f2;
/* 158:    */     
/* 159:165 */     return new brw(d1, d2, d3);
/* 160:    */   }
/* 161:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     brw
 * JD-Core Version:    0.7.0.1
 */