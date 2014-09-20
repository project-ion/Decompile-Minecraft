/*   1:    */ public class cpq
/*   2:    */   extends cqz
/*   3:    */ {
/*   4: 19 */   private static final oa e = new oa("textures/entity/endercrystal/endercrystal_beam.png");
/*   5: 20 */   private static final oa j = new oa("textures/entity/enderdragon/dragon_exploding.png");
/*   6: 21 */   private static final oa k = new oa("textures/entity/enderdragon/dragon.png");
/*   7:    */   protected cdq a;
/*   8:    */   
/*   9:    */   public cpq(cpt paramcpt)
/*  10:    */   {
/*  11: 26 */     super(paramcpt, new cdq(0.0F), 0.5F);
/*  12:    */     
/*  13: 28 */     this.a = ((cdq)this.f);
/*  14:    */     
/*  15: 30 */     a(new csk(this));
/*  16: 31 */     a(new csj());
/*  17:    */   }
/*  18:    */   
/*  19:    */   protected void a(adb paramadb, float paramFloat1, float paramFloat2, float paramFloat3)
/*  20:    */   {
/*  21: 36 */     float f1 = (float)paramadb.b(7, paramFloat3)[0];
/*  22: 37 */     float f2 = (float)(paramadb.b(5, paramFloat3)[1] - paramadb.b(10, paramFloat3)[1]);
/*  23: 38 */     cjm.b(-f1, 0.0F, 1.0F, 0.0F);
/*  24: 39 */     cjm.b(f2 * 10.0F, 1.0F, 0.0F, 0.0F);
/*  25: 40 */     cjm.b(0.0F, 0.0F, 1.0F);
/*  26: 41 */     if (paramadb.av > 0)
/*  27:    */     {
/*  28: 42 */       float f3 = (paramadb.av + paramFloat3 - 1.0F) / 20.0F * 1.6F;
/*  29: 43 */       f3 = uv.c(f3);
/*  30: 44 */       if (f3 > 1.0F) {
/*  31: 45 */         f3 = 1.0F;
/*  32:    */       }
/*  33: 47 */       cjm.b(f3 * b(paramadb), 0.0F, 0.0F, 1.0F);
/*  34:    */     }
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected void a(adb paramadb, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  38:    */   {
/*  39: 53 */     if (paramadb.bw > 0)
/*  40:    */     {
/*  41: 54 */       float f = paramadb.bw / 200.0F;
/*  42: 55 */       cjm.c(515);
/*  43: 56 */       cjm.d();
/*  44: 57 */       cjm.a(516, f);
/*  45: 58 */       a(j);
/*  46: 59 */       this.f.a(paramadb, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  47: 60 */       cjm.a(516, 0.1F);
/*  48:    */       
/*  49: 62 */       cjm.c(514);
/*  50:    */     }
/*  51: 65 */     c(paramadb);
/*  52: 66 */     this.f.a(paramadb, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  53: 68 */     if (paramadb.as > 0)
/*  54:    */     {
/*  55: 69 */       cjm.c(514);
/*  56: 70 */       cjm.x();
/*  57: 71 */       cjm.l();
/*  58: 72 */       cjm.b(770, 771);
/*  59: 73 */       cjm.c(1.0F, 0.0F, 0.0F, 0.5F);
/*  60: 74 */       this.f.a(paramadb, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  61: 75 */       cjm.w();
/*  62: 76 */       cjm.k();
/*  63: 77 */       cjm.c(515);
/*  64:    */     }
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void a(adb paramadb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  68:    */   {
/*  69: 83 */     ciu.a(paramadb, false);
/*  70: 84 */     super.a(paramadb, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  71: 86 */     if (paramadb.bx != null) {
/*  72: 87 */       a(paramadb, paramDouble1, paramDouble2, paramDouble3, paramFloat2);
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   protected void a(adb paramadb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*  77:    */   {
/*  78: 92 */     float f1 = paramadb.bx.a + paramFloat;
/*  79: 93 */     float f2 = uv.a(f1 * 0.2F) / 2.0F + 0.5F;
/*  80: 94 */     f2 = (f2 * f2 + f2) * 0.2F;
/*  81:    */     
/*  82: 96 */     float f3 = (float)(paramadb.bx.s - paramadb.s - (paramadb.p - paramadb.s) * (1.0F - paramFloat));
/*  83: 97 */     float f4 = (float)(f2 + paramadb.bx.t - 1.0D - paramadb.t - (paramadb.q - paramadb.t) * (1.0F - paramFloat));
/*  84: 98 */     float f5 = (float)(paramadb.bx.u - paramadb.u - (paramadb.r - paramadb.u) * (1.0F - paramFloat));
/*  85:    */     
/*  86:100 */     float f6 = uv.c(f3 * f3 + f5 * f5);
/*  87:101 */     float f7 = uv.c(f3 * f3 + f4 * f4 + f5 * f5);
/*  88:    */     
/*  89:103 */     cjm.E();
/*  90:104 */     cjm.b((float)paramDouble1, (float)paramDouble2 + 2.0F, (float)paramDouble3);
/*  91:105 */     cjm.b((float)-Math.atan2(f5, f3) * 180.0F / 3.141593F - 90.0F, 0.0F, 1.0F, 0.0F);
/*  92:106 */     cjm.b((float)-Math.atan2(f6, f4) * 180.0F / 3.141593F - 90.0F, 1.0F, 0.0F, 0.0F);
/*  93:    */     
/*  94:108 */     ckx localckx = ckx.a();
/*  95:109 */     civ localciv = localckx.c();
/*  96:    */     
/*  97:111 */     bss.a();
/*  98:112 */     cjm.p();
/*  99:    */     
/* 100:114 */     a(e);
/* 101:    */     
/* 102:116 */     cjm.j(7425);
/* 103:    */     
/* 104:118 */     float f8 = 0.0F - (paramadb.W + paramFloat) * 0.01F;
/* 105:119 */     float f9 = uv.c(f3 * f3 + f4 * f4 + f5 * f5) / 32.0F - (paramadb.W + paramFloat) * 0.01F;
/* 106:120 */     localciv.a(5);
/* 107:    */     
/* 108:122 */     int i = 8;
/* 109:123 */     for (int m = 0; m <= i; m++)
/* 110:    */     {
/* 111:124 */       float f10 = uv.a(m % i * 3.141593F * 2.0F / i) * 0.75F;
/* 112:125 */       float f11 = uv.b(m % i * 3.141593F * 2.0F / i) * 0.75F;
/* 113:126 */       float f12 = m % i * 1.0F / i;
/* 114:127 */       localciv.c(0);
/* 115:128 */       localciv.a(f10 * 0.2F, f11 * 0.2F, 0.0D, f12, f9);
/* 116:129 */       localciv.c(16777215);
/* 117:130 */       localciv.a(f10, f11, f7, f12, f8);
/* 118:    */     }
/* 119:133 */     localckx.b();
/* 120:134 */     cjm.o();
/* 121:135 */     cjm.j(7424);
/* 122:    */     
/* 123:137 */     bss.b();
/* 124:138 */     cjm.F();
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected oa a(adb paramadb)
/* 128:    */   {
/* 129:143 */     return k;
/* 130:    */   }
/* 131:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cpq
 * JD-Core Version:    0.7.0.1
 */