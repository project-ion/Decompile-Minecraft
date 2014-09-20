/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bbx
/*   4:    */   extends atr
/*   5:    */ {
/*   6: 22 */   public static final bet a = bet.a("up");
/*   7: 23 */   public static final bet b = bet.a("north");
/*   8: 24 */   public static final bet M = bet.a("east");
/*   9: 25 */   public static final bet N = bet.a("south");
/*  10: 26 */   public static final bet O = bet.a("west");
/*  11: 27 */   public static final bev P = bev.a("variant", bby.class);
/*  12:    */   
/*  13:    */   public bbx(atr paramatr)
/*  14:    */   {
/*  15: 35 */     super(paramatr.J);
/*  16: 36 */     j(this.L.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, bby.a));
/*  17: 37 */     c(paramatr.w);
/*  18: 38 */     b(paramatr.x / 3.0F);
/*  19: 39 */     a(paramatr.H);
/*  20: 40 */     a(akf.b);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean d()
/*  24:    */   {
/*  25: 45 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean b(ard paramard, dt paramdt)
/*  29:    */   {
/*  30: 50 */     return false;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean c()
/*  34:    */   {
/*  35: 55 */     return false;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(ard paramard, dt paramdt)
/*  39:    */   {
/*  40: 60 */     boolean bool1 = e(paramard, paramdt.c());
/*  41: 61 */     boolean bool2 = e(paramard, paramdt.d());
/*  42: 62 */     boolean bool3 = e(paramard, paramdt.e());
/*  43: 63 */     boolean bool4 = e(paramard, paramdt.f());
/*  44:    */     
/*  45: 65 */     float f1 = 0.25F;
/*  46: 66 */     float f2 = 0.75F;
/*  47: 67 */     float f3 = 0.25F;
/*  48: 68 */     float f4 = 0.75F;
/*  49: 69 */     float f5 = 1.0F;
/*  50: 71 */     if (bool1) {
/*  51: 72 */       f3 = 0.0F;
/*  52:    */     }
/*  53: 74 */     if (bool2) {
/*  54: 75 */       f4 = 1.0F;
/*  55:    */     }
/*  56: 77 */     if (bool3) {
/*  57: 78 */       f1 = 0.0F;
/*  58:    */     }
/*  59: 80 */     if (bool4) {
/*  60: 81 */       f2 = 1.0F;
/*  61:    */     }
/*  62: 84 */     if ((bool1) && (bool2) && (!bool3) && (!bool4))
/*  63:    */     {
/*  64: 85 */       f5 = 0.8125F;
/*  65: 86 */       f1 = 0.3125F;
/*  66: 87 */       f2 = 0.6875F;
/*  67:    */     }
/*  68: 88 */     else if ((!bool1) && (!bool2) && (bool3) && (bool4))
/*  69:    */     {
/*  70: 89 */       f5 = 0.8125F;
/*  71: 90 */       f3 = 0.3125F;
/*  72: 91 */       f4 = 0.6875F;
/*  73:    */     }
/*  74: 94 */     a(f1, 0.0F, f3, f2, f5, f4);
/*  75:    */   }
/*  76:    */   
/*  77:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  78:    */   {
/*  79:100 */     a(paramaqu, paramdt);
/*  80:101 */     this.F = 1.5D;
/*  81:102 */     return super.a(paramaqu, paramdt, parambec);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public boolean e(ard paramard, dt paramdt)
/*  85:    */   {
/*  86:106 */     atr localatr = paramard.p(paramdt).c();
/*  87:107 */     if (localatr == aty.cv) {
/*  88:108 */       return false;
/*  89:    */     }
/*  90:110 */     if ((localatr == this) || ((localatr instanceof avw))) {
/*  91:111 */       return true;
/*  92:    */     }
/*  93:113 */     if ((localatr.J.k()) && (localatr.d())) {
/*  94:114 */       return localatr.J != bof.C;
/*  95:    */     }
/*  96:116 */     return false;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void a(alq paramalq, akf paramakf, List paramList)
/* 100:    */   {
/* 101:121 */     for (bby localbby : ) {
/* 102:122 */       paramList.add(new amj(paramalq, 1, localbby.a()));
/* 103:    */     }
/* 104:    */   }
/* 105:    */   
/* 106:    */   public int a(bec parambec)
/* 107:    */   {
/* 108:128 */     return ((bby)parambec.b(P)).a();
/* 109:    */   }
/* 110:    */   
/* 111:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/* 112:    */   {
/* 113:133 */     if (paramej == ej.a) {
/* 114:134 */       return super.a(paramard, paramdt, paramej);
/* 115:    */     }
/* 116:136 */     return true;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public bec a(int paramInt)
/* 120:    */   {
/* 121:141 */     return P().a(P, bby.a(paramInt));
/* 122:    */   }
/* 123:    */   
/* 124:    */   public int c(bec parambec)
/* 125:    */   {
/* 126:147 */     return ((bby)parambec.b(P)).a();
/* 127:    */   }
/* 128:    */   
/* 129:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/* 130:    */   {
/* 131:152 */     return parambec.a(a, Boolean.valueOf(!paramard.d(paramdt.a()))).a(b, Boolean.valueOf(e(paramard, paramdt.c()))).a(M, Boolean.valueOf(e(paramard, paramdt.f()))).a(N, Boolean.valueOf(e(paramard, paramdt.d()))).a(O, Boolean.valueOf(e(paramard, paramdt.e())));
/* 132:    */   }
/* 133:    */   
/* 134:    */   protected bed e()
/* 135:    */   {
/* 136:162 */     return new bed(this, new bex[] { a, b, M, O, N, P });
/* 137:    */   }
/* 138:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbx
 * JD-Core Version:    0.7.0.1
 */