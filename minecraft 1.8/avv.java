/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class avv
/*   4:    */   extends atr
/*   5:    */ {
/*   6: 20 */   public static final bet a = bet.a("north");
/*   7: 21 */   public static final bet b = bet.a("east");
/*   8: 22 */   public static final bet M = bet.a("south");
/*   9: 23 */   public static final bet N = bet.a("west");
/*  10:    */   
/*  11:    */   public avv(bof parambof)
/*  12:    */   {
/*  13: 26 */     super(parambof);
/*  14: 27 */     j(this.L.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)));
/*  15: 28 */     a(akf.c);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/*  19:    */   {
/*  20: 33 */     boolean bool1 = e(paramaqu, paramdt.c());
/*  21: 34 */     boolean bool2 = e(paramaqu, paramdt.d());
/*  22: 35 */     boolean bool3 = e(paramaqu, paramdt.e());
/*  23: 36 */     boolean bool4 = e(paramaqu, paramdt.f());
/*  24:    */     
/*  25: 38 */     float f1 = 0.375F;
/*  26: 39 */     float f2 = 0.625F;
/*  27: 40 */     float f3 = 0.375F;
/*  28: 41 */     float f4 = 0.625F;
/*  29: 43 */     if (bool1) {
/*  30: 44 */       f3 = 0.0F;
/*  31:    */     }
/*  32: 46 */     if (bool2) {
/*  33: 47 */       f4 = 1.0F;
/*  34:    */     }
/*  35: 49 */     if ((bool1) || (bool2))
/*  36:    */     {
/*  37: 50 */       a(f1, 0.0F, f3, f2, 1.5F, f4);
/*  38: 51 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  39:    */     }
/*  40: 53 */     f3 = 0.375F;
/*  41: 54 */     f4 = 0.625F;
/*  42: 55 */     if (bool3) {
/*  43: 56 */       f1 = 0.0F;
/*  44:    */     }
/*  45: 58 */     if (bool4) {
/*  46: 59 */       f2 = 1.0F;
/*  47:    */     }
/*  48: 61 */     if ((bool3) || (bool4) || ((!bool1) && (!bool2)))
/*  49:    */     {
/*  50: 62 */       a(f1, 0.0F, f3, f2, 1.5F, f4);
/*  51: 63 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  52:    */     }
/*  53: 66 */     if (bool1) {
/*  54: 67 */       f3 = 0.0F;
/*  55:    */     }
/*  56: 69 */     if (bool2) {
/*  57: 70 */       f4 = 1.0F;
/*  58:    */     }
/*  59: 73 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(ard paramard, dt paramdt)
/*  63:    */   {
/*  64: 78 */     boolean bool1 = e(paramard, paramdt.c());
/*  65: 79 */     boolean bool2 = e(paramard, paramdt.d());
/*  66: 80 */     boolean bool3 = e(paramard, paramdt.e());
/*  67: 81 */     boolean bool4 = e(paramard, paramdt.f());
/*  68:    */     
/*  69: 83 */     float f1 = 0.375F;
/*  70: 84 */     float f2 = 0.625F;
/*  71: 85 */     float f3 = 0.375F;
/*  72: 86 */     float f4 = 0.625F;
/*  73: 88 */     if (bool1) {
/*  74: 89 */       f3 = 0.0F;
/*  75:    */     }
/*  76: 91 */     if (bool2) {
/*  77: 92 */       f4 = 1.0F;
/*  78:    */     }
/*  79: 94 */     if (bool3) {
/*  80: 95 */       f1 = 0.0F;
/*  81:    */     }
/*  82: 97 */     if (bool4) {
/*  83: 98 */       f2 = 1.0F;
/*  84:    */     }
/*  85:101 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/*  86:    */   }
/*  87:    */   
/*  88:    */   public boolean c()
/*  89:    */   {
/*  90:106 */     return false;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public boolean d()
/*  94:    */   {
/*  95:111 */     return false;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public boolean b(ard paramard, dt paramdt)
/*  99:    */   {
/* 100:116 */     return false;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public boolean e(ard paramard, dt paramdt)
/* 104:    */   {
/* 105:120 */     atr localatr = paramard.p(paramdt).c();
/* 106:121 */     if (localatr == aty.cv) {
/* 107:122 */       return false;
/* 108:    */     }
/* 109:124 */     if ((((localatr instanceof avv)) && (localatr.J == this.J)) || ((localatr instanceof avw))) {
/* 110:125 */       return true;
/* 111:    */     }
/* 112:127 */     if ((localatr.J.k()) && (localatr.d())) {
/* 113:128 */       return localatr.J != bof.C;
/* 114:    */     }
/* 115:130 */     return false;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/* 119:    */   {
/* 120:135 */     return true;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 124:    */   {
/* 125:140 */     if (paramaqu.D) {
/* 126:141 */       return true;
/* 127:    */     }
/* 128:144 */     return aml.a(paramahd, paramaqu, paramdt);
/* 129:    */   }
/* 130:    */   
/* 131:    */   public int c(bec parambec)
/* 132:    */   {
/* 133:149 */     return 0;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/* 137:    */   {
/* 138:154 */     return parambec.a(a, Boolean.valueOf(e(paramard, paramdt.c()))).a(b, Boolean.valueOf(e(paramard, paramdt.f()))).a(M, Boolean.valueOf(e(paramard, paramdt.d()))).a(N, Boolean.valueOf(e(paramard, paramdt.e())));
/* 139:    */   }
/* 140:    */   
/* 141:    */   protected bed e()
/* 142:    */   {
/* 143:163 */     return new bed(this, new bex[] { a, b, N, M });
/* 144:    */   }
/* 145:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avv
 * JD-Core Version:    0.7.0.1
 */