/*   1:    */ public class cqx
/*   2:    */   extends cpu
/*   3:    */ {
/*   4: 16 */   private static final oa e = new oa("textures/entity/minecart.png");
/*   5: 18 */   protected ccq a = new ccp();
/*   6:    */   
/*   7:    */   public cqx(cpt paramcpt)
/*   8:    */   {
/*   9: 21 */     super(paramcpt);
/*  10: 22 */     this.c = 0.5F;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void a(adx paramadx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  14:    */   {
/*  15: 27 */     cjm.E();
/*  16:    */     
/*  17: 29 */     c(paramadx);
/*  18:    */     
/*  19: 31 */     long l = paramadx.F() * 493286711L;
/*  20: 32 */     l = l * l * 4392167121L + l * 98761L;
/*  21:    */     
/*  22: 34 */     float f1 = (((float)(l >> 16 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*  23: 35 */     float f2 = (((float)(l >> 20 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*  24: 36 */     float f3 = (((float)(l >> 24 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*  25:    */     
/*  26: 38 */     cjm.b(f1, f2, f3);
/*  27:    */     
/*  28: 40 */     double d1 = paramadx.P + (paramadx.s - paramadx.P) * paramFloat2;
/*  29: 41 */     double d2 = paramadx.Q + (paramadx.t - paramadx.Q) * paramFloat2;
/*  30: 42 */     double d3 = paramadx.R + (paramadx.u - paramadx.R) * paramFloat2;
/*  31:    */     
/*  32: 44 */     double d4 = 0.300000011920929D;
/*  33:    */     
/*  34: 46 */     brw localbrw1 = paramadx.k(d1, d2, d3);
/*  35:    */     
/*  36: 48 */     float f4 = paramadx.B + (paramadx.z - paramadx.B) * paramFloat2;
/*  37: 50 */     if (localbrw1 != null)
/*  38:    */     {
/*  39: 51 */       brw localbrw2 = paramadx.a(d1, d2, d3, d4);
/*  40: 52 */       brw localbrw3 = paramadx.a(d1, d2, d3, -d4);
/*  41: 53 */       if (localbrw2 == null) {
/*  42: 54 */         localbrw2 = localbrw1;
/*  43:    */       }
/*  44: 56 */       if (localbrw3 == null) {
/*  45: 57 */         localbrw3 = localbrw1;
/*  46:    */       }
/*  47: 60 */       paramDouble1 += localbrw1.a - d1;
/*  48: 61 */       paramDouble2 += (localbrw2.b + localbrw3.b) / 2.0D - d2;
/*  49: 62 */       paramDouble3 += localbrw1.c - d3;
/*  50:    */       
/*  51: 64 */       brw localbrw4 = localbrw3.b(-localbrw2.a, -localbrw2.b, -localbrw2.c);
/*  52: 65 */       if (localbrw4.b() != 0.0D)
/*  53:    */       {
/*  54: 66 */         localbrw4 = localbrw4.a();
/*  55: 67 */         paramFloat1 = (float)(Math.atan2(localbrw4.c, localbrw4.a) * 180.0D / 3.141592653589793D);
/*  56: 68 */         f4 = (float)(Math.atan(localbrw4.b) * 73.0D);
/*  57:    */       }
/*  58:    */     }
/*  59: 71 */     cjm.b((float)paramDouble1, (float)paramDouble2 + 0.375F, (float)paramDouble3);
/*  60:    */     
/*  61: 73 */     cjm.b(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
/*  62: 74 */     cjm.b(-f4, 0.0F, 0.0F, 1.0F);
/*  63: 75 */     float f5 = paramadx.q() - paramFloat2;
/*  64: 76 */     float f6 = paramadx.p() - paramFloat2;
/*  65: 77 */     if (f6 < 0.0F) {
/*  66: 78 */       f6 = 0.0F;
/*  67:    */     }
/*  68: 80 */     if (f5 > 0.0F) {
/*  69: 81 */       cjm.b(uv.a(f5) * f5 * f6 / 10.0F * paramadx.r(), 1.0F, 0.0F, 0.0F);
/*  70:    */     }
/*  71: 83 */     int i = paramadx.v();
/*  72:    */     
/*  73: 85 */     bec localbec = paramadx.t();
/*  74: 86 */     if (localbec.c().b() != -1)
/*  75:    */     {
/*  76: 87 */       cjm.E();
/*  77:    */       
/*  78: 89 */       a(cua.g);
/*  79: 90 */       float f7 = 0.75F;
/*  80:    */       
/*  81: 92 */       cjm.a(f7, f7, f7);
/*  82: 93 */       cjm.b(-0.5F, (i - 8) / 16.0F, 0.5F);
/*  83: 94 */       a(paramadx, paramFloat2, localbec);
/*  84:    */       
/*  85: 96 */       cjm.F();
/*  86: 97 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  87: 98 */       c(paramadx);
/*  88:    */     }
/*  89:101 */     cjm.a(-1.0F, -1.0F, 1.0F);
/*  90:102 */     this.a.a(paramadx, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
/*  91:103 */     cjm.F();
/*  92:    */     
/*  93:105 */     super.a(paramadx, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  94:    */   }
/*  95:    */   
/*  96:    */   protected oa a(adx paramadx)
/*  97:    */   {
/*  98:110 */     return e;
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected void a(adx paramadx, float paramFloat, bec parambec)
/* 102:    */   {
/* 103:114 */     cjm.E();
/* 104:115 */     bsu.z().ab().a(parambec, paramadx.c(paramFloat));
/* 105:116 */     cjm.F();
/* 106:    */   }
/* 107:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cqx
 * JD-Core Version:    0.7.0.1
 */