/*   1:    */ public class avw
/*   2:    */   extends avb
/*   3:    */ {
/*   4: 19 */   public static final bet a = bet.a("open");
/*   5: 20 */   public static final bet b = bet.a("powered");
/*   6: 21 */   public static final bet M = bet.a("in_wall");
/*   7:    */   
/*   8:    */   public avw()
/*   9:    */   {
/*  10: 24 */     super(bof.d);
/*  11:    */     
/*  12: 26 */     j(this.L.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)));
/*  13: 27 */     a(akf.d);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  17:    */   {
/*  18: 32 */     el localel = ((ej)parambec.b(N)).k();
/*  19: 33 */     if (((localel == el.c) && ((paramard.p(paramdt.e()).c() == aty.bZ) || (paramard.p(paramdt.f()).c() == aty.bZ))) || ((localel == el.a) && ((paramard.p(paramdt.c()).c() == aty.bZ) || (paramard.p(paramdt.d()).c() == aty.bZ)))) {
/*  20: 37 */       parambec = parambec.a(M, Boolean.valueOf(true));
/*  21:    */     }
/*  22: 40 */     return parambec;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  26:    */   {
/*  27: 45 */     if (paramaqu.p(paramdt.b()).c().r().a()) {
/*  28: 46 */       return super.c(paramaqu, paramdt);
/*  29:    */     }
/*  30: 49 */     return false;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  34:    */   {
/*  35: 55 */     if (((Boolean)parambec.b(a)).booleanValue()) {
/*  36: 56 */       return null;
/*  37:    */     }
/*  38: 59 */     el localel = ((ej)parambec.b(N)).k();
/*  39: 60 */     if (localel == el.c) {
/*  40: 61 */       return new brt(paramdt.n(), paramdt.o(), paramdt.p() + 0.375F, paramdt.n() + 1, paramdt.o() + 1.5F, paramdt.p() + 0.625F);
/*  41:    */     }
/*  42: 64 */     return new brt(paramdt.n() + 0.375F, paramdt.o(), paramdt.p(), paramdt.n() + 0.625F, paramdt.o() + 1.5F, paramdt.p() + 1);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(ard paramard, dt paramdt)
/*  46:    */   {
/*  47: 69 */     el localel = ((ej)paramard.p(paramdt).b(N)).k();
/*  48: 70 */     if (localel == el.c) {
/*  49: 71 */       a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
/*  50:    */     } else {
/*  51: 73 */       a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public boolean c()
/*  56:    */   {
/*  57: 79 */     return false;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean d()
/*  61:    */   {
/*  62: 84 */     return false;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public boolean b(ard paramard, dt paramdt)
/*  66:    */   {
/*  67: 89 */     return ((Boolean)paramard.p(paramdt).b(a)).booleanValue();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  71:    */   {
/*  72: 94 */     return P().a(N, paramxm.aO()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false));
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  76:    */   {
/*  77: 99 */     if (((Boolean)parambec.b(a)).booleanValue())
/*  78:    */     {
/*  79:100 */       parambec = parambec.a(a, Boolean.valueOf(false));
/*  80:101 */       paramaqu.a(paramdt, parambec, 2);
/*  81:    */     }
/*  82:    */     else
/*  83:    */     {
/*  84:104 */       ej localej = ej.a(paramahd.y);
/*  85:105 */       if (parambec.b(N) == localej.d()) {
/*  86:106 */         parambec = parambec.a(N, localej);
/*  87:    */       }
/*  88:108 */       parambec = parambec.a(a, Boolean.valueOf(true));
/*  89:109 */       paramaqu.a(paramdt, parambec, 2);
/*  90:    */     }
/*  91:112 */     paramaqu.a(paramahd, ((Boolean)parambec.b(a)).booleanValue() ? 1003 : 1006, paramdt, 0);
/*  92:113 */     return true;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  96:    */   {
/*  97:118 */     if (paramaqu.D) {
/*  98:119 */       return;
/*  99:    */     }
/* 100:122 */     boolean bool = paramaqu.z(paramdt);
/* 101:123 */     if ((bool) || (paramatr.g())) {
/* 102:124 */       if ((bool) && (!((Boolean)parambec.b(a)).booleanValue()) && (!((Boolean)parambec.b(b)).booleanValue()))
/* 103:    */       {
/* 104:125 */         paramaqu.a(paramdt, parambec.a(a, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)), 2);
/* 105:126 */         paramaqu.a(null, 1003, paramdt, 0);
/* 106:    */       }
/* 107:127 */       else if ((!bool) && (((Boolean)parambec.b(a)).booleanValue()) && (((Boolean)parambec.b(b)).booleanValue()))
/* 108:    */       {
/* 109:128 */         paramaqu.a(paramdt, parambec.a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
/* 110:129 */         paramaqu.a(null, 1006, paramdt, 0);
/* 111:    */       }
/* 112:130 */       else if (bool != ((Boolean)parambec.b(b)).booleanValue())
/* 113:    */       {
/* 114:131 */         paramaqu.a(paramdt, parambec.a(b, Boolean.valueOf(bool)), 2);
/* 115:    */       }
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/* 120:    */   {
/* 121:138 */     return true;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public bec a(int paramInt)
/* 125:    */   {
/* 126:143 */     return P().a(N, ej.b(paramInt)).a(a, Boolean.valueOf((paramInt & 0x4) != 0)).a(b, Boolean.valueOf((paramInt & 0x8) != 0));
/* 127:    */   }
/* 128:    */   
/* 129:    */   public int c(bec parambec)
/* 130:    */   {
/* 131:151 */     int i = 0;
/* 132:    */     
/* 133:153 */     i |= ((ej)parambec.b(N)).b();
/* 134:155 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 135:156 */       i |= 0x8;
/* 136:    */     }
/* 137:159 */     if (((Boolean)parambec.b(a)).booleanValue()) {
/* 138:160 */       i |= 0x4;
/* 139:    */     }
/* 140:163 */     return i;
/* 141:    */   }
/* 142:    */   
/* 143:    */   protected bed e()
/* 144:    */   {
/* 145:168 */     return new bed(this, new bex[] { N, a, b, M });
/* 146:    */   }
/* 147:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avw
 * JD-Core Version:    0.7.0.1
 */