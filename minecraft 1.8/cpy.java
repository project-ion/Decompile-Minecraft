/*   1:    */ public class cpy
/*   2:    */   extends cpu
/*   3:    */ {
/*   4: 15 */   private static final oa a = new oa("textures/particle/particles.png");
/*   5:    */   
/*   6:    */   public cpy(cpt paramcpt)
/*   7:    */   {
/*   8: 18 */     super(paramcpt);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public void a(ado paramado, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  12:    */   {
/*  13: 23 */     cjm.E();
/*  14:    */     
/*  15: 25 */     cjm.b((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*  16: 26 */     cjm.B();
/*  17: 27 */     cjm.a(0.5F, 0.5F, 0.5F);
/*  18: 28 */     c(paramado);
/*  19:    */     
/*  20: 30 */     ckx localckx = ckx.a();
/*  21: 31 */     civ localciv = localckx.c();
/*  22:    */     
/*  23: 33 */     int i = 1;
/*  24: 34 */     int j = 2;
/*  25: 35 */     float f1 = (i * 8 + 0) / 128.0F;
/*  26: 36 */     float f2 = (i * 8 + 8) / 128.0F;
/*  27: 37 */     float f3 = (j * 8 + 0) / 128.0F;
/*  28: 38 */     float f4 = (j * 8 + 8) / 128.0F;
/*  29:    */     
/*  30: 40 */     float f5 = 1.0F;
/*  31: 41 */     float f6 = 0.5F;
/*  32: 42 */     float f7 = 0.5F;
/*  33:    */     
/*  34: 44 */     cjm.b(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
/*  35: 45 */     cjm.b(-this.b.f, 1.0F, 0.0F, 0.0F);
/*  36: 46 */     localciv.b();
/*  37: 47 */     localciv.d(0.0F, 1.0F, 0.0F);
/*  38: 48 */     localciv.a(0.0F - f6, 0.0F - f7, 0.0D, f1, f4);
/*  39: 49 */     localciv.a(f5 - f6, 0.0F - f7, 0.0D, f2, f4);
/*  40: 50 */     localciv.a(f5 - f6, 1.0F - f7, 0.0D, f2, f3);
/*  41: 51 */     localciv.a(0.0F - f6, 1.0F - f7, 0.0D, f1, f3);
/*  42: 52 */     localckx.b();
/*  43:    */     
/*  44: 54 */     cjm.C();
/*  45: 55 */     cjm.F();
/*  46: 57 */     if (paramado.b != null)
/*  47:    */     {
/*  48: 58 */       float f8 = paramado.b.k(paramFloat2);
/*  49: 59 */       float f9 = uv.a(uv.c(f8) * 3.141593F);
/*  50:    */       
/*  51: 61 */       brw localbrw = new brw(-0.36D, 0.03D, 0.35D);
/*  52: 62 */       localbrw = localbrw.a(-(paramado.b.B + (paramado.b.z - paramado.b.B) * paramFloat2) * 3.141593F / 180.0F);
/*  53: 63 */       localbrw = localbrw.b(-(paramado.b.A + (paramado.b.y - paramado.b.A) * paramFloat2) * 3.141593F / 180.0F);
/*  54: 64 */       localbrw = localbrw.b(f9 * 0.5F);
/*  55: 65 */       localbrw = localbrw.a(-f9 * 0.7F);
/*  56:    */       
/*  57: 67 */       double d1 = paramado.b.p + (paramado.b.s - paramado.b.p) * paramFloat2 + localbrw.a;
/*  58: 68 */       double d2 = paramado.b.q + (paramado.b.t - paramado.b.q) * paramFloat2 + localbrw.b;
/*  59: 69 */       double d3 = paramado.b.r + (paramado.b.u - paramado.b.r) * paramFloat2 + localbrw.c;
/*  60: 70 */       double d4 = paramado.b.aR();
/*  61: 72 */       if (((this.b.g != null) && (this.b.g.ax > 0)) || (paramado.b != bsu.z().h))
/*  62:    */       {
/*  63: 73 */         float f10 = (paramado.b.aH + (paramado.b.aG - paramado.b.aH) * paramFloat2) * 3.141593F / 180.0F;
/*  64: 74 */         double d6 = uv.a(f10);
/*  65: 75 */         double d8 = uv.b(f10);
/*  66: 76 */         double d10 = 0.35D;
/*  67: 77 */         double d12 = 0.8D;
/*  68: 78 */         d1 = paramado.b.p + (paramado.b.s - paramado.b.p) * paramFloat2 - d8 * 0.35D - d6 * 0.8D;
/*  69: 79 */         d2 = paramado.b.q + d4 + (paramado.b.t - paramado.b.q) * paramFloat2 - 0.45D;
/*  70: 80 */         d3 = paramado.b.r + (paramado.b.u - paramado.b.r) * paramFloat2 - d6 * 0.35D + d8 * 0.8D;
/*  71:    */         
/*  72: 82 */         d4 = paramado.b.aw() ? -0.1875D : 0.0D;
/*  73:    */       }
/*  74: 85 */       double d5 = paramado.p + (paramado.s - paramado.p) * paramFloat2;
/*  75: 86 */       double d7 = paramado.q + (paramado.t - paramado.q) * paramFloat2 + 0.25D;
/*  76: 87 */       double d9 = paramado.r + (paramado.u - paramado.r) * paramFloat2;
/*  77:    */       
/*  78: 89 */       double d11 = (float)(d1 - d5);
/*  79: 90 */       double d13 = (float)(d2 - d7) + d4;
/*  80: 91 */       double d14 = (float)(d3 - d9);
/*  81:    */       
/*  82: 93 */       cjm.x();
/*  83: 94 */       cjm.f();
/*  84: 95 */       localciv.a(3);
/*  85: 96 */       localciv.c(0);
/*  86: 97 */       int k = 16;
/*  87: 98 */       for (int m = 0; m <= k; m++)
/*  88:    */       {
/*  89: 99 */         float f11 = m / k;
/*  90:100 */         localciv.b(paramDouble1 + d11 * f11, paramDouble2 + d13 * (f11 * f11 + f11) * 0.5D + 0.25D, paramDouble3 + d14 * f11);
/*  91:    */       }
/*  92:102 */       localckx.b();
/*  93:103 */       cjm.e();
/*  94:104 */       cjm.w();
/*  95:    */       
/*  96:106 */       super.a(paramado, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  97:    */     }
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected oa a(ado paramado)
/* 101:    */   {
/* 102:112 */     return a;
/* 103:    */   }
/* 104:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cpy
 * JD-Core Version:    0.7.0.1
 */