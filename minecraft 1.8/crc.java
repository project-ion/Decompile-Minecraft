/*   1:    */ public class crc
/*   2:    */   extends cpu
/*   3:    */ {
/*   4: 14 */   private static final oa a = new oa("textures/painting/paintings_kristoffer_zetterstrand.png");
/*   5:    */   
/*   6:    */   public crc(cpt paramcpt)
/*   7:    */   {
/*   8: 17 */     super(paramcpt);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public void a(adm paramadm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  12:    */   {
/*  13: 22 */     cjm.E();
/*  14: 23 */     cjm.b(paramDouble1, paramDouble2, paramDouble3);
/*  15: 24 */     cjm.b(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
/*  16: 25 */     cjm.B();
/*  17:    */     
/*  18: 27 */     c(paramadm);
/*  19: 28 */     adn localadn = paramadm.c;
/*  20:    */     
/*  21: 30 */     float f = 0.0625F;
/*  22: 31 */     cjm.a(f, f, f);
/*  23: 32 */     a(paramadm, localadn.C, localadn.D, localadn.E, localadn.F);
/*  24: 33 */     cjm.C();
/*  25: 34 */     cjm.F();
/*  26:    */     
/*  27: 36 */     super.a(paramadm, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected oa a(adm paramadm)
/*  31:    */   {
/*  32: 41 */     return a;
/*  33:    */   }
/*  34:    */   
/*  35:    */   private void a(adm paramadm, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  36:    */   {
/*  37: 45 */     float f1 = -paramInt1 / 2.0F;
/*  38: 46 */     float f2 = -paramInt2 / 2.0F;
/*  39:    */     
/*  40: 48 */     float f3 = 0.5F;
/*  41:    */     
/*  42:    */ 
/*  43: 51 */     float f4 = 0.75F;
/*  44: 52 */     float f5 = 0.8125F;
/*  45: 53 */     float f6 = 0.0F;
/*  46: 54 */     float f7 = 0.0625F;
/*  47:    */     
/*  48:    */ 
/*  49: 57 */     float f8 = 0.75F;
/*  50: 58 */     float f9 = 0.8125F;
/*  51: 59 */     float f10 = 0.00195313F;
/*  52: 60 */     float f11 = 0.00195313F;
/*  53:    */     
/*  54:    */ 
/*  55: 63 */     float f12 = 0.7519531F;
/*  56: 64 */     float f13 = 0.7519531F;
/*  57: 65 */     float f14 = 0.0F;
/*  58: 66 */     float f15 = 0.0625F;
/*  59: 68 */     for (int i = 0; i < paramInt1 / 16; i++) {
/*  60: 69 */       for (int j = 0; j < paramInt2 / 16; j++)
/*  61:    */       {
/*  62: 70 */         float f16 = f1 + (i + 1) * 16;
/*  63: 71 */         float f17 = f1 + i * 16;
/*  64: 72 */         float f18 = f2 + (j + 1) * 16;
/*  65: 73 */         float f19 = f2 + j * 16;
/*  66:    */         
/*  67: 75 */         a(paramadm, (f16 + f17) / 2.0F, (f18 + f19) / 2.0F);
/*  68:    */         
/*  69:    */ 
/*  70: 78 */         float f20 = (paramInt3 + paramInt1 - i * 16) / 256.0F;
/*  71: 79 */         float f21 = (paramInt3 + paramInt1 - (i + 1) * 16) / 256.0F;
/*  72: 80 */         float f22 = (paramInt4 + paramInt2 - j * 16) / 256.0F;
/*  73: 81 */         float f23 = (paramInt4 + paramInt2 - (j + 1) * 16) / 256.0F;
/*  74:    */         
/*  75: 83 */         ckx localckx = ckx.a();
/*  76: 84 */         civ localciv = localckx.c();
/*  77:    */         
/*  78: 86 */         localciv.b();
/*  79: 87 */         localciv.d(0.0F, 0.0F, -1.0F);
/*  80: 88 */         localciv.a(f16, f19, -f3, f21, f22);
/*  81: 89 */         localciv.a(f17, f19, -f3, f20, f22);
/*  82: 90 */         localciv.a(f17, f18, -f3, f20, f23);
/*  83: 91 */         localciv.a(f16, f18, -f3, f21, f23);
/*  84:    */         
/*  85: 93 */         localciv.d(0.0F, 0.0F, 1.0F);
/*  86: 94 */         localciv.a(f16, f18, f3, f4, f6);
/*  87: 95 */         localciv.a(f17, f18, f3, f5, f6);
/*  88: 96 */         localciv.a(f17, f19, f3, f5, f7);
/*  89: 97 */         localciv.a(f16, f19, f3, f4, f7);
/*  90:    */         
/*  91: 99 */         localciv.d(0.0F, 1.0F, 0.0F);
/*  92:100 */         localciv.a(f16, f18, -f3, f8, f10);
/*  93:101 */         localciv.a(f17, f18, -f3, f9, f10);
/*  94:102 */         localciv.a(f17, f18, f3, f9, f11);
/*  95:103 */         localciv.a(f16, f18, f3, f8, f11);
/*  96:    */         
/*  97:105 */         localciv.d(0.0F, -1.0F, 0.0F);
/*  98:106 */         localciv.a(f16, f19, f3, f8, f10);
/*  99:107 */         localciv.a(f17, f19, f3, f9, f10);
/* 100:108 */         localciv.a(f17, f19, -f3, f9, f11);
/* 101:109 */         localciv.a(f16, f19, -f3, f8, f11);
/* 102:    */         
/* 103:111 */         localciv.d(-1.0F, 0.0F, 0.0F);
/* 104:112 */         localciv.a(f16, f18, f3, f13, f14);
/* 105:113 */         localciv.a(f16, f19, f3, f13, f15);
/* 106:114 */         localciv.a(f16, f19, -f3, f12, f15);
/* 107:115 */         localciv.a(f16, f18, -f3, f12, f14);
/* 108:    */         
/* 109:117 */         localciv.d(1.0F, 0.0F, 0.0F);
/* 110:118 */         localciv.a(f17, f18, -f3, f13, f14);
/* 111:119 */         localciv.a(f17, f19, -f3, f13, f15);
/* 112:120 */         localciv.a(f17, f19, f3, f12, f15);
/* 113:121 */         localciv.a(f17, f18, f3, f12, f14);
/* 114:122 */         localckx.b();
/* 115:    */       }
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   private void a(adm paramadm, float paramFloat1, float paramFloat2)
/* 120:    */   {
/* 121:128 */     int i = uv.c(paramadm.s);
/* 122:129 */     int j = uv.c(paramadm.t + paramFloat2 / 16.0F);
/* 123:130 */     int k = uv.c(paramadm.u);
/* 124:    */     
/* 125:132 */     ej localej = paramadm.b;
/* 126:133 */     if (localej == ej.c) {
/* 127:134 */       i = uv.c(paramadm.s + paramFloat1 / 16.0F);
/* 128:    */     }
/* 129:136 */     if (localej == ej.e) {
/* 130:137 */       k = uv.c(paramadm.u - paramFloat1 / 16.0F);
/* 131:    */     }
/* 132:139 */     if (localej == ej.d) {
/* 133:140 */       i = uv.c(paramadm.s - paramFloat1 / 16.0F);
/* 134:    */     }
/* 135:142 */     if (localej == ej.f) {
/* 136:143 */       k = uv.c(paramadm.u + paramFloat1 / 16.0F);
/* 137:    */     }
/* 138:145 */     int m = this.b.b.b(new dt(i, j, k), 0);
/* 139:146 */     int n = m % 65536;
/* 140:147 */     int i1 = m / 65536;
/* 141:148 */     dax.a(dax.q, n, i1);
/* 142:149 */     cjm.c(1.0F, 1.0F, 1.0F);
/* 143:    */   }
/* 144:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     crc
 * JD-Core Version:    0.7.0.1
 */