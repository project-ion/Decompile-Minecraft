/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class yu
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   private final xn a;
/*   7:    */   private final float b;
/*   8:    */   private float c;
/*   9:    */   private boolean d;
/*  10:    */   private int e;
/*  11:    */   private int f;
/*  12:    */   
/*  13:    */   public yu(xn paramxn, float paramFloat)
/*  14:    */   {
/*  15: 31 */     this.a = paramxn;
/*  16: 32 */     this.b = paramFloat;
/*  17: 33 */     a(7);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void c()
/*  21:    */   {
/*  22: 38 */     this.c = 0.0F;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void d()
/*  26:    */   {
/*  27: 43 */     this.d = false;
/*  28: 44 */     this.c = 0.0F;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean a()
/*  32:    */   {
/*  33: 49 */     return (this.a.ai()) && (this.a.l != null) && ((this.a.l instanceof ahd)) && ((this.d) || (this.a.bV()));
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void e()
/*  37:    */   {
/*  38: 54 */     ahd localahd = (ahd)this.a.l;
/*  39: 55 */     xu localxu = (xu)this.a;
/*  40:    */     
/*  41: 57 */     float f1 = uv.g(localahd.y - this.a.y) * 0.5F;
/*  42: 58 */     if (f1 > 5.0F) {
/*  43: 59 */       f1 = 5.0F;
/*  44:    */     }
/*  45: 61 */     if (f1 < -5.0F) {
/*  46: 62 */       f1 = -5.0F;
/*  47:    */     }
/*  48: 65 */     this.a.y = uv.g(this.a.y + f1);
/*  49: 66 */     if (this.c < this.b) {
/*  50: 67 */       this.c += (this.b - this.c) * 0.01F;
/*  51:    */     }
/*  52: 69 */     if (this.c > this.b) {
/*  53: 70 */       this.c = this.b;
/*  54:    */     }
/*  55: 73 */     int i = uv.c(this.a.s);
/*  56: 74 */     int j = uv.c(this.a.t);
/*  57: 75 */     int k = uv.c(this.a.u);
/*  58: 76 */     float f2 = this.c;
/*  59: 77 */     if (this.d)
/*  60:    */     {
/*  61: 78 */       if (this.e++ > this.f) {
/*  62: 79 */         this.d = false;
/*  63:    */       }
/*  64: 81 */       f2 += f2 * 1.15F * uv.a(this.e / this.f * 3.141593F);
/*  65:    */     }
/*  66: 84 */     float f3 = 0.91F;
/*  67: 85 */     if (this.a.C) {
/*  68: 86 */       f3 = this.a.o.p(new dt(uv.d(i), uv.d(j) - 1, uv.d(k))).c().K * 0.91F;
/*  69:    */     }
/*  70: 88 */     float f4 = 0.1627714F / (f3 * f3 * f3);
/*  71: 89 */     float f5 = uv.a(localxu.y * 3.141593F / 180.0F);
/*  72: 90 */     float f6 = uv.b(localxu.y * 3.141593F / 180.0F);
/*  73: 91 */     float f7 = localxu.bH() * f4;
/*  74: 92 */     float f8 = Math.max(f2, 1.0F);
/*  75: 93 */     f8 = f7 / f8;
/*  76: 94 */     float f9 = f2 * f8;
/*  77: 95 */     float f10 = -(f9 * f5);
/*  78: 96 */     float f11 = f9 * f6;
/*  79: 98 */     if (uv.e(f10) > uv.e(f11))
/*  80:    */     {
/*  81: 99 */       if (f10 < 0.0F) {
/*  82:100 */         f10 -= this.a.J / 2.0F;
/*  83:    */       }
/*  84:102 */       if (f10 > 0.0F) {
/*  85:103 */         f10 += this.a.J / 2.0F;
/*  86:    */       }
/*  87:105 */       f11 = 0.0F;
/*  88:    */     }
/*  89:    */     else
/*  90:    */     {
/*  91:107 */       f10 = 0.0F;
/*  92:108 */       if (f11 < 0.0F) {
/*  93:109 */         f11 -= this.a.J / 2.0F;
/*  94:    */       }
/*  95:111 */       if (f11 > 0.0F) {
/*  96:112 */         f11 += this.a.J / 2.0F;
/*  97:    */       }
/*  98:    */     }
/*  99:116 */     int m = uv.c(this.a.s + f10);
/* 100:117 */     int n = uv.c(this.a.u + f11);
/* 101:    */     
/* 102:119 */     int i1 = uv.d(this.a.J + 1.0F);
/* 103:120 */     int i2 = uv.d(this.a.K + localahd.K + 1.0F);
/* 104:121 */     int i3 = uv.d(this.a.J + 1.0F);
/* 105:    */     Object localObject;
/* 106:123 */     if ((i != m) || (k != n))
/* 107:    */     {
/* 108:126 */       localObject = this.a.o.p(new dt(i, j, k)).c();
/* 109:127 */       int i4 = (!a((atr)localObject)) && ((((atr)localObject).r() != bof.a) || (!a(this.a.o.p(new dt(i, j - 1, k)).c()))) ? 1 : 0;
/* 110:129 */       if ((i4 != 0) && (0 == bpy.a(this.a.o, this.a, m, j, n, i1, i2, i3, false, false, true)) && (1 == bpy.a(this.a.o, this.a, i, j + 1, k, i1, i2, i3, false, false, true)) && (1 == bpy.a(this.a.o, this.a, m, j + 1, n, i1, i2, i3, false, false, true))) {
/* 111:134 */         localxu.r().a();
/* 112:    */       }
/* 113:    */     }
/* 114:138 */     if ((!localahd.by.d) && (this.c >= this.b * 0.5F) && (this.a.bb().nextFloat() < 0.006F) && (!this.d))
/* 115:    */     {
/* 116:139 */       localObject = localahd.bz();
/* 117:141 */       if ((localObject != null) && (((amj)localObject).b() == amk.bY))
/* 118:    */       {
/* 119:142 */         ((amj)localObject).a(1, localahd);
/* 120:144 */         if (((amj)localObject).b == 0)
/* 121:    */         {
/* 122:145 */           amj localamj = new amj(amk.aR);
/* 123:146 */           localamj.d(((amj)localObject).o());
/* 124:147 */           localahd.bg.a[localahd.bg.c] = localamj;
/* 125:    */         }
/* 126:    */       }
/* 127:    */     }
/* 128:152 */     this.a.g(0.0F, f2);
/* 129:    */   }
/* 130:    */   
/* 131:    */   private boolean a(atr paramatr)
/* 132:    */   {
/* 133:156 */     return ((paramatr instanceof bat)) || ((paramatr instanceof awq));
/* 134:    */   }
/* 135:    */   
/* 136:    */   public boolean f()
/* 137:    */   {
/* 138:160 */     return this.d;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void g()
/* 142:    */   {
/* 143:164 */     this.d = true;
/* 144:165 */     this.e = 0;
/* 145:166 */     this.f = (this.a.bb().nextInt(841) + 140);
/* 146:    */   }
/* 147:    */   
/* 148:    */   public boolean h()
/* 149:    */   {
/* 150:170 */     return (!f()) && (this.c > this.b * 0.3F);
/* 151:    */   }
/* 152:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     yu
 * JD-Core Version:    0.7.0.1
 */