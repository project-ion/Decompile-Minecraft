/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ahm
/*   4:    */   extends wv
/*   5:    */ {
/*   6:    */   private int a;
/*   7:    */   private int b;
/*   8:    */   
/*   9:    */   public ahm(aqu paramaqu)
/*  10:    */   {
/*  11: 22 */     super(paramaqu);
/*  12: 23 */     a(0.25F, 0.25F);
/*  13:    */   }
/*  14:    */   
/*  15:    */   protected void h()
/*  16:    */   {
/*  17: 28 */     this.ac.a(8, 5);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean a(double paramDouble)
/*  21:    */   {
/*  22: 33 */     return paramDouble < 4096.0D;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public ahm(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, amj paramamj)
/*  26:    */   {
/*  27: 37 */     super(paramaqu);
/*  28: 38 */     this.a = 0;
/*  29:    */     
/*  30: 40 */     a(0.25F, 0.25F);
/*  31:    */     
/*  32: 42 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  33:    */     
/*  34: 44 */     int i = 1;
/*  35: 45 */     if ((paramamj != null) && (paramamj.n()))
/*  36:    */     {
/*  37: 46 */       this.ac.b(8, paramamj);
/*  38:    */       
/*  39: 48 */       fn localfn1 = paramamj.o();
/*  40: 49 */       fn localfn2 = localfn1.m("Fireworks");
/*  41: 50 */       if (localfn2 != null) {
/*  42: 51 */         i += localfn2.d("Flight");
/*  43:    */       }
/*  44:    */     }
/*  45: 54 */     this.v = (this.V.nextGaussian() * 0.001D);
/*  46: 55 */     this.x = (this.V.nextGaussian() * 0.001D);
/*  47: 56 */     this.w = 0.05D;
/*  48:    */     
/*  49: 58 */     this.b = (10 * i + this.V.nextInt(6) + this.V.nextInt(7));
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*  53:    */   {
/*  54: 63 */     this.v = paramDouble1;
/*  55: 64 */     this.w = paramDouble2;
/*  56: 65 */     this.x = paramDouble3;
/*  57: 66 */     if ((this.B == 0.0F) && (this.A == 0.0F))
/*  58:    */     {
/*  59: 67 */       float f = uv.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*  60: 68 */       this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/*  61: 69 */       this.B = (this.z = (float)(Math.atan2(paramDouble2, f) * 180.0D / 3.141592741012573D));
/*  62:    */     }
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void s_()
/*  66:    */   {
/*  67: 75 */     this.P = this.s;
/*  68: 76 */     this.Q = this.t;
/*  69: 77 */     this.R = this.u;
/*  70: 78 */     super.s_();
/*  71:    */     
/*  72: 80 */     this.v *= 1.15D;
/*  73: 81 */     this.x *= 1.15D;
/*  74: 82 */     this.w += 0.04D;
/*  75: 83 */     d(this.v, this.w, this.x);
/*  76:    */     
/*  77: 85 */     float f = uv.a(this.v * this.v + this.x * this.x);
/*  78: 86 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.141592741012573D));
/*  79: 87 */     this.z = ((float)(Math.atan2(this.w, f) * 180.0D / 3.141592741012573D));
/*  80: 89 */     while (this.z - this.B < -180.0F) {
/*  81: 90 */       this.B -= 360.0F;
/*  82:    */     }
/*  83: 92 */     while (this.z - this.B >= 180.0F) {
/*  84: 93 */       this.B += 360.0F;
/*  85:    */     }
/*  86: 96 */     while (this.y - this.A < -180.0F) {
/*  87: 97 */       this.A -= 360.0F;
/*  88:    */     }
/*  89: 99 */     while (this.y - this.A >= 180.0F) {
/*  90:100 */       this.A += 360.0F;
/*  91:    */     }
/*  92:103 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/*  93:104 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/*  94:106 */     if ((this.a == 0) && (!R())) {
/*  95:107 */       this.o.a(this, "fireworks.launch", 3.0F, 1.0F);
/*  96:    */     }
/*  97:110 */     this.a += 1;
/*  98:111 */     if ((this.o.D) && (this.a % 2 < 2)) {
/*  99:112 */       this.o.a(ew.d, this.s, this.t - 0.3D, this.u, this.V.nextGaussian() * 0.05D, -this.w * 0.5D, this.V.nextGaussian() * 0.05D, new int[0]);
/* 100:    */     }
/* 101:114 */     if ((!this.o.D) && (this.a > this.b))
/* 102:    */     {
/* 103:115 */       this.o.a(this, (byte)17);
/* 104:116 */       J();
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void a(byte paramByte)
/* 109:    */   {
/* 110:122 */     if ((paramByte == 17) && (this.o.D))
/* 111:    */     {
/* 112:123 */       amj localamj = this.ac.f(8);
/* 113:124 */       fn localfn = null;
/* 114:125 */       if ((localamj != null) && (localamj.n())) {
/* 115:126 */         localfn = localamj.o().m("Fireworks");
/* 116:    */       }
/* 117:128 */       this.o.a(this.s, this.t, this.u, this.v, this.w, this.x, localfn);
/* 118:    */     }
/* 119:130 */     super.a(paramByte);
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void b(fn paramfn)
/* 123:    */   {
/* 124:135 */     paramfn.a("Life", this.a);
/* 125:136 */     paramfn.a("LifeTime", this.b);
/* 126:137 */     amj localamj = this.ac.f(8);
/* 127:138 */     if (localamj != null)
/* 128:    */     {
/* 129:139 */       fn localfn = new fn();
/* 130:140 */       localamj.b(localfn);
/* 131:141 */       paramfn.a("FireworksItem", localfn);
/* 132:    */     }
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void a(fn paramfn)
/* 136:    */   {
/* 137:147 */     this.a = paramfn.f("Life");
/* 138:148 */     this.b = paramfn.f("LifeTime");
/* 139:    */     
/* 140:150 */     fn localfn = paramfn.m("FireworksItem");
/* 141:151 */     if (localfn != null)
/* 142:    */     {
/* 143:152 */       amj localamj = amj.a(localfn);
/* 144:153 */       if (localamj != null) {
/* 145:154 */         this.ac.b(8, localamj);
/* 146:    */       }
/* 147:    */     }
/* 148:    */   }
/* 149:    */   
/* 150:    */   public float c(float paramFloat)
/* 151:    */   {
/* 152:161 */     return super.c(paramFloat);
/* 153:    */   }
/* 154:    */   
/* 155:    */   public int b(float paramFloat)
/* 156:    */   {
/* 157:166 */     return super.b(paramFloat);
/* 158:    */   }
/* 159:    */   
/* 160:    */   public boolean aE()
/* 161:    */   {
/* 162:171 */     return false;
/* 163:    */   }
/* 164:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahm
 * JD-Core Version:    0.7.0.1
 */