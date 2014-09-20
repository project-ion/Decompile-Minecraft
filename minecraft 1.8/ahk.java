/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ahk
/*   4:    */   extends wv
/*   5:    */ {
/*   6:    */   private double a;
/*   7:    */   private double b;
/*   8:    */   private double c;
/*   9:    */   private int d;
/*  10:    */   private boolean e;
/*  11:    */   
/*  12:    */   public ahk(aqu paramaqu)
/*  13:    */   {
/*  14: 22 */     super(paramaqu);
/*  15: 23 */     a(0.25F, 0.25F);
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected void h() {}
/*  19:    */   
/*  20:    */   public boolean a(double paramDouble)
/*  21:    */   {
/*  22: 32 */     double d1 = aQ().a() * 4.0D;
/*  23: 33 */     d1 *= 64.0D;
/*  24: 34 */     return paramDouble < d1 * d1;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public ahk(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  28:    */   {
/*  29: 38 */     super(paramaqu);
/*  30: 39 */     this.d = 0;
/*  31:    */     
/*  32: 41 */     a(0.25F, 0.25F);
/*  33:    */     
/*  34: 43 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void a(dt paramdt)
/*  38:    */   {
/*  39: 47 */     double d1 = paramdt.n();
/*  40: 48 */     int i = paramdt.o();
/*  41: 49 */     double d2 = paramdt.p();
/*  42:    */     
/*  43: 51 */     double d3 = d1 - this.s;double d4 = d2 - this.u;
/*  44: 52 */     float f = uv.a(d3 * d3 + d4 * d4);
/*  45: 54 */     if (f > 12.0F)
/*  46:    */     {
/*  47: 55 */       this.a = (this.s + d3 / f * 12.0D);
/*  48: 56 */       this.c = (this.u + d4 / f * 12.0D);
/*  49: 57 */       this.b = (this.t + 8.0D);
/*  50:    */     }
/*  51:    */     else
/*  52:    */     {
/*  53: 59 */       this.a = d1;
/*  54: 60 */       this.b = i;
/*  55: 61 */       this.c = d2;
/*  56:    */     }
/*  57: 64 */     this.d = 0;
/*  58: 65 */     this.e = (this.V.nextInt(5) > 0);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*  62:    */   {
/*  63: 70 */     this.v = paramDouble1;
/*  64: 71 */     this.w = paramDouble2;
/*  65: 72 */     this.x = paramDouble3;
/*  66: 73 */     if ((this.B == 0.0F) && (this.A == 0.0F))
/*  67:    */     {
/*  68: 74 */       float f = uv.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*  69: 75 */       this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/*  70: 76 */       this.B = (this.z = (float)(Math.atan2(paramDouble2, f) * 180.0D / 3.141592741012573D));
/*  71:    */     }
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void s_()
/*  75:    */   {
/*  76: 82 */     this.P = this.s;
/*  77: 83 */     this.Q = this.t;
/*  78: 84 */     this.R = this.u;
/*  79: 85 */     super.s_();
/*  80:    */     
/*  81: 87 */     this.s += this.v;
/*  82: 88 */     this.t += this.w;
/*  83: 89 */     this.u += this.x;
/*  84:    */     
/*  85: 91 */     float f1 = uv.a(this.v * this.v + this.x * this.x);
/*  86: 92 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.141592741012573D));
/*  87: 93 */     this.z = ((float)(Math.atan2(this.w, f1) * 180.0D / 3.141592741012573D));
/*  88: 95 */     while (this.z - this.B < -180.0F) {
/*  89: 96 */       this.B -= 360.0F;
/*  90:    */     }
/*  91: 98 */     while (this.z - this.B >= 180.0F) {
/*  92: 99 */       this.B += 360.0F;
/*  93:    */     }
/*  94:102 */     while (this.y - this.A < -180.0F) {
/*  95:103 */       this.A -= 360.0F;
/*  96:    */     }
/*  97:105 */     while (this.y - this.A >= 180.0F) {
/*  98:106 */       this.A += 360.0F;
/*  99:    */     }
/* 100:109 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 101:110 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/* 102:112 */     if (!this.o.D)
/* 103:    */     {
/* 104:113 */       double d1 = this.a - this.s;double d2 = this.c - this.u;
/* 105:114 */       float f3 = (float)Math.sqrt(d1 * d1 + d2 * d2);
/* 106:115 */       float f4 = (float)Math.atan2(d2, d1);
/* 107:116 */       double d3 = f1 + (f3 - f1) * 0.0025D;
/* 108:117 */       if (f3 < 1.0F)
/* 109:    */       {
/* 110:118 */         d3 *= 0.8D;
/* 111:119 */         this.w *= 0.8D;
/* 112:    */       }
/* 113:121 */       this.v = (Math.cos(f4) * d3);
/* 114:122 */       this.x = (Math.sin(f4) * d3);
/* 115:124 */       if (this.t < this.b) {
/* 116:125 */         this.w += (1.0D - this.w) * 0.01499999966472387D;
/* 117:    */       } else {
/* 118:127 */         this.w += (-1.0D - this.w) * 0.01499999966472387D;
/* 119:    */       }
/* 120:    */     }
/* 121:131 */     float f2 = 0.25F;
/* 122:132 */     if (V()) {
/* 123:133 */       for (int i = 0; i < 4; i++) {
/* 124:134 */         this.o.a(ew.e, this.s - this.v * f2, this.t - this.w * f2, this.u - this.x * f2, this.v, this.w, this.x, new int[0]);
/* 125:    */       }
/* 126:    */     } else {
/* 127:137 */       this.o.a(ew.y, this.s - this.v * f2 + this.V.nextDouble() * 0.6D - 0.3D, this.t - this.w * f2 - 0.5D, this.u - this.x * f2 + this.V.nextDouble() * 0.6D - 0.3D, this.v, this.w, this.x, new int[0]);
/* 128:    */     }
/* 129:140 */     if (!this.o.D)
/* 130:    */     {
/* 131:141 */       b(this.s, this.t, this.u);
/* 132:    */       
/* 133:143 */       this.d += 1;
/* 134:144 */       if ((this.d > 80) && (!this.o.D))
/* 135:    */       {
/* 136:145 */         J();
/* 137:146 */         if (this.e) {
/* 138:147 */           this.o.d(new adw(this.o, this.s, this.t, this.u, new amj(amk.bH)));
/* 139:    */         } else {
/* 140:149 */           this.o.b(2003, new dt(this), 0);
/* 141:    */         }
/* 142:    */       }
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void b(fn paramfn) {}
/* 147:    */   
/* 148:    */   public void a(fn paramfn) {}
/* 149:    */   
/* 150:    */   public float c(float paramFloat)
/* 151:    */   {
/* 152:165 */     return 1.0F;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public int b(float paramFloat)
/* 156:    */   {
/* 157:170 */     return 15728880;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public boolean aE()
/* 161:    */   {
/* 162:175 */     return false;
/* 163:    */   }
/* 164:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahk
 * JD-Core Version:    0.7.0.1
 */