/*   1:    */ public class aay
/*   2:    */   extends aaz
/*   3:    */ {
/*   4:    */   protected bpy a;
/*   5:    */   private boolean f;
/*   6:    */   
/*   7:    */   public aay(xn paramxn, aqu paramaqu)
/*   8:    */   {
/*   9: 23 */     super(paramxn, paramaqu);
/*  10:    */   }
/*  11:    */   
/*  12:    */   protected bpw a()
/*  13:    */   {
/*  14: 28 */     this.a = new bpy();
/*  15: 29 */     this.a.a(true);
/*  16: 30 */     return new bpw(this.a);
/*  17:    */   }
/*  18:    */   
/*  19:    */   protected boolean b()
/*  20:    */   {
/*  21: 35 */     return (this.b.C) || ((h()) && (o())) || ((this.b.av()) && ((this.b instanceof agj)) && ((this.b.m instanceof abr)));
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected brw c()
/*  25:    */   {
/*  26: 40 */     return new brw(this.b.s, p(), this.b.u);
/*  27:    */   }
/*  28:    */   
/*  29:    */   private int p()
/*  30:    */   {
/*  31: 44 */     if ((!this.b.V()) || (!h())) {
/*  32: 45 */       return (int)(this.b.aQ().b + 0.5D);
/*  33:    */     }
/*  34: 48 */     int i = (int)this.b.aQ().b;
/*  35: 49 */     atr localatr = this.c.p(new dt(uv.c(this.b.s), i, uv.c(this.b.u))).c();
/*  36: 50 */     int j = 0;
/*  37: 51 */     while ((localatr == aty.i) || (localatr == aty.j))
/*  38:    */     {
/*  39: 52 */       i++;
/*  40: 53 */       localatr = this.c.p(new dt(uv.c(this.b.s), i, uv.c(this.b.u))).c();
/*  41: 54 */       j++;
/*  42: 54 */       if (j > 16) {
/*  43: 55 */         return (int)this.b.aQ().b;
/*  44:    */       }
/*  45:    */     }
/*  46: 58 */     return i;
/*  47:    */   }
/*  48:    */   
/*  49:    */   protected void d()
/*  50:    */   {
/*  51: 63 */     super.d();
/*  52: 64 */     if (this.f)
/*  53:    */     {
/*  54: 65 */       if (this.c.i(new dt(uv.c(this.b.s), (int)(this.b.aQ().b + 0.5D), uv.c(this.b.u)))) {
/*  55: 66 */         return;
/*  56:    */       }
/*  57: 69 */       for (int i = 0; i < this.d.d(); i++)
/*  58:    */       {
/*  59: 70 */         bpt localbpt = this.d.a(i);
/*  60: 71 */         if (this.c.i(new dt(localbpt.a, localbpt.b, localbpt.c)))
/*  61:    */         {
/*  62: 72 */           this.d.b(i - 1);
/*  63: 73 */           return;
/*  64:    */         }
/*  65:    */       }
/*  66:    */     }
/*  67:    */   }
/*  68:    */   
/*  69:    */   protected boolean a(brw parambrw1, brw parambrw2, int paramInt1, int paramInt2, int paramInt3)
/*  70:    */   {
/*  71: 81 */     int i = uv.c(parambrw1.a);
/*  72: 82 */     int j = uv.c(parambrw1.c);
/*  73:    */     
/*  74: 84 */     double d1 = parambrw2.a - parambrw1.a;
/*  75: 85 */     double d2 = parambrw2.c - parambrw1.c;
/*  76: 86 */     double d3 = d1 * d1 + d2 * d2;
/*  77: 87 */     if (d3 < 1.0E-008D) {
/*  78: 88 */       return false;
/*  79:    */     }
/*  80: 91 */     double d4 = 1.0D / Math.sqrt(d3);
/*  81: 92 */     d1 *= d4;
/*  82: 93 */     d2 *= d4;
/*  83:    */     
/*  84: 95 */     paramInt1 += 2;
/*  85: 96 */     paramInt3 += 2;
/*  86: 97 */     if (!a(i, (int)parambrw1.b, j, paramInt1, paramInt2, paramInt3, parambrw1, d1, d2)) {
/*  87: 98 */       return false;
/*  88:    */     }
/*  89:100 */     paramInt1 -= 2;
/*  90:101 */     paramInt3 -= 2;
/*  91:    */     
/*  92:103 */     double d5 = 1.0D / Math.abs(d1);
/*  93:104 */     double d6 = 1.0D / Math.abs(d2);
/*  94:    */     
/*  95:106 */     double d7 = i * 1 - parambrw1.a;
/*  96:107 */     double d8 = j * 1 - parambrw1.c;
/*  97:108 */     if (d1 >= 0.0D) {
/*  98:109 */       d7 += 1.0D;
/*  99:    */     }
/* 100:111 */     if (d2 >= 0.0D) {
/* 101:112 */       d8 += 1.0D;
/* 102:    */     }
/* 103:114 */     d7 /= d1;
/* 104:115 */     d8 /= d2;
/* 105:    */     
/* 106:117 */     int k = d1 < 0.0D ? -1 : 1;
/* 107:118 */     int m = d2 < 0.0D ? -1 : 1;
/* 108:119 */     int n = uv.c(parambrw2.a);
/* 109:120 */     int i1 = uv.c(parambrw2.c);
/* 110:121 */     int i2 = n - i;
/* 111:122 */     int i3 = i1 - j;
/* 112:123 */     while ((i2 * k > 0) || (i3 * m > 0))
/* 113:    */     {
/* 114:124 */       if (d7 < d8)
/* 115:    */       {
/* 116:125 */         d7 += d5;
/* 117:126 */         i += k;
/* 118:127 */         i2 = n - i;
/* 119:    */       }
/* 120:    */       else
/* 121:    */       {
/* 122:129 */         d8 += d6;
/* 123:130 */         j += m;
/* 124:131 */         i3 = i1 - j;
/* 125:    */       }
/* 126:134 */       if (!a(i, (int)parambrw1.b, j, paramInt1, paramInt2, paramInt3, parambrw1, d1, d2)) {
/* 127:135 */         return false;
/* 128:    */       }
/* 129:    */     }
/* 130:138 */     return true;
/* 131:    */   }
/* 132:    */   
/* 133:    */   private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, brw parambrw, double paramDouble1, double paramDouble2)
/* 134:    */   {
/* 135:142 */     int i = paramInt1 - paramInt4 / 2;
/* 136:143 */     int j = paramInt3 - paramInt6 / 2;
/* 137:145 */     if (!b(i, paramInt2, j, paramInt4, paramInt5, paramInt6, parambrw, paramDouble1, paramDouble2)) {
/* 138:146 */       return false;
/* 139:    */     }
/* 140:150 */     for (int k = i; k < i + paramInt4; k++) {
/* 141:151 */       for (int m = j; m < j + paramInt6; m++)
/* 142:    */       {
/* 143:152 */         double d1 = k + 0.5D - parambrw.a;
/* 144:153 */         double d2 = m + 0.5D - parambrw.c;
/* 145:154 */         if (d1 * paramDouble1 + d2 * paramDouble2 >= 0.0D)
/* 146:    */         {
/* 147:157 */           atr localatr = this.c.p(new dt(k, paramInt2 - 1, m)).c();
/* 148:158 */           bof localbof = localatr.r();
/* 149:159 */           if (localbof == bof.a) {
/* 150:160 */             return false;
/* 151:    */           }
/* 152:162 */           if ((localbof == bof.h) && (!this.b.V())) {
/* 153:163 */             return false;
/* 154:    */           }
/* 155:165 */           if (localbof == bof.i) {
/* 156:166 */             return false;
/* 157:    */           }
/* 158:    */         }
/* 159:    */       }
/* 160:    */     }
/* 161:171 */     return true;
/* 162:    */   }
/* 163:    */   
/* 164:    */   private boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, brw parambrw, double paramDouble1, double paramDouble2)
/* 165:    */   {
/* 166:175 */     for (dt localdt : dt.a(new dt(paramInt1, paramInt2, paramInt3), new dt(paramInt1 + paramInt4 - 1, paramInt2 + paramInt5 - 1, paramInt3 + paramInt6 - 1)))
/* 167:    */     {
/* 168:176 */       double d1 = localdt.n() + 0.5D - parambrw.a;
/* 169:177 */       double d2 = localdt.p() + 0.5D - parambrw.c;
/* 170:178 */       if (d1 * paramDouble1 + d2 * paramDouble2 >= 0.0D)
/* 171:    */       {
/* 172:181 */         atr localatr = this.c.p(localdt).c();
/* 173:182 */         if (!localatr.b(this.c, localdt)) {
/* 174:183 */           return false;
/* 175:    */         }
/* 176:    */       }
/* 177:    */     }
/* 178:186 */     return true;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void a(boolean paramBoolean)
/* 182:    */   {
/* 183:190 */     this.a.c(paramBoolean);
/* 184:    */   }
/* 185:    */   
/* 186:    */   public boolean e()
/* 187:    */   {
/* 188:194 */     return this.a.e();
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void b(boolean paramBoolean)
/* 192:    */   {
/* 193:198 */     this.a.b(paramBoolean);
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void c(boolean paramBoolean)
/* 197:    */   {
/* 198:206 */     this.a.a(paramBoolean);
/* 199:    */   }
/* 200:    */   
/* 201:    */   public boolean g()
/* 202:    */   {
/* 203:210 */     return this.a.b();
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void d(boolean paramBoolean)
/* 207:    */   {
/* 208:214 */     this.a.d(paramBoolean);
/* 209:    */   }
/* 210:    */   
/* 211:    */   public boolean h()
/* 212:    */   {
/* 213:218 */     return this.a.d();
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void e(boolean paramBoolean)
/* 217:    */   {
/* 218:222 */     this.f = paramBoolean;
/* 219:    */   }
/* 220:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aay
 * JD-Core Version:    0.7.0.1
 */