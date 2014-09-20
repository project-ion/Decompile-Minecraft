/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bbj
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 22 */   public static final bet b = bet.a("north");
/*   8: 23 */   public static final bet M = bet.a("east");
/*   9: 24 */   public static final bet N = bet.a("south");
/*  10: 25 */   public static final bet O = bet.a("west");
/*  11:    */   private final boolean a;
/*  12:    */   
/*  13:    */   protected bbj(bof parambof, boolean paramBoolean)
/*  14:    */   {
/*  15: 30 */     super(parambof);
/*  16: 31 */     j(this.L.b().a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)));
/*  17: 32 */     this.a = paramBoolean;
/*  18: 33 */     a(akf.c);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  22:    */   {
/*  23: 38 */     return parambec.a(b, Boolean.valueOf(c(paramard.p(paramdt.c()).c()))).a(N, Boolean.valueOf(c(paramard.p(paramdt.d()).c()))).a(O, Boolean.valueOf(c(paramard.p(paramdt.e()).c()))).a(M, Boolean.valueOf(c(paramard.p(paramdt.f()).c())));
/*  24:    */   }
/*  25:    */   
/*  26:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  27:    */   {
/*  28: 48 */     if (!this.a) {
/*  29: 49 */       return null;
/*  30:    */     }
/*  31: 51 */     return super.a(parambec, paramRandom, paramInt);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public boolean c()
/*  35:    */   {
/*  36: 56 */     return false;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean d()
/*  40:    */   {
/*  41: 61 */     return false;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/*  45:    */   {
/*  46: 66 */     if (paramard.p(paramdt).c() == this) {
/*  47: 67 */       return false;
/*  48:    */     }
/*  49: 69 */     return super.a(paramard, paramdt, paramej);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/*  53:    */   {
/*  54: 74 */     boolean bool1 = c(paramaqu.p(paramdt.c()).c());
/*  55: 75 */     boolean bool2 = c(paramaqu.p(paramdt.d()).c());
/*  56: 76 */     boolean bool3 = c(paramaqu.p(paramdt.e()).c());
/*  57: 77 */     boolean bool4 = c(paramaqu.p(paramdt.f()).c());
/*  58: 79 */     if (((bool3) && (bool4)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2)))
/*  59:    */     {
/*  60: 80 */       a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
/*  61: 81 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  62:    */     }
/*  63: 82 */     else if (bool3)
/*  64:    */     {
/*  65: 83 */       a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
/*  66: 84 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  67:    */     }
/*  68: 85 */     else if (bool4)
/*  69:    */     {
/*  70: 86 */       a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
/*  71: 87 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  72:    */     }
/*  73: 89 */     if (((bool1) && (bool2)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2)))
/*  74:    */     {
/*  75: 90 */       a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
/*  76: 91 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  77:    */     }
/*  78: 92 */     else if (bool1)
/*  79:    */     {
/*  80: 93 */       a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
/*  81: 94 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  82:    */     }
/*  83: 95 */     else if (bool2)
/*  84:    */     {
/*  85: 96 */       a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
/*  86: 97 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  87:    */     }
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void h()
/*  91:    */   {
/*  92:103 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void a(ard paramard, dt paramdt)
/*  96:    */   {
/*  97:108 */     float f1 = 0.4375F;
/*  98:109 */     float f2 = 0.5625F;
/*  99:110 */     float f3 = 0.4375F;
/* 100:111 */     float f4 = 0.5625F;
/* 101:    */     
/* 102:113 */     boolean bool1 = c(paramard.p(paramdt.c()).c());
/* 103:114 */     boolean bool2 = c(paramard.p(paramdt.d()).c());
/* 104:115 */     boolean bool3 = c(paramard.p(paramdt.e()).c());
/* 105:116 */     boolean bool4 = c(paramard.p(paramdt.f()).c());
/* 106:118 */     if (((bool3) && (bool4)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2)))
/* 107:    */     {
/* 108:119 */       f1 = 0.0F;
/* 109:120 */       f2 = 1.0F;
/* 110:    */     }
/* 111:121 */     else if (bool3)
/* 112:    */     {
/* 113:122 */       f1 = 0.0F;
/* 114:    */     }
/* 115:123 */     else if (bool4)
/* 116:    */     {
/* 117:124 */       f2 = 1.0F;
/* 118:    */     }
/* 119:126 */     if (((bool1) && (bool2)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2)))
/* 120:    */     {
/* 121:127 */       f3 = 0.0F;
/* 122:128 */       f4 = 1.0F;
/* 123:    */     }
/* 124:129 */     else if (bool1)
/* 125:    */     {
/* 126:130 */       f3 = 0.0F;
/* 127:    */     }
/* 128:131 */     else if (bool2)
/* 129:    */     {
/* 130:132 */       f4 = 1.0F;
/* 131:    */     }
/* 132:135 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/* 133:    */   }
/* 134:    */   
/* 135:    */   public final boolean c(atr paramatr)
/* 136:    */   {
/* 137:139 */     return (paramatr.m()) || (paramatr == this) || (paramatr == aty.w) || (paramatr == aty.cG) || (paramatr == aty.cH) || ((paramatr instanceof bbj));
/* 138:    */   }
/* 139:    */   
/* 140:    */   protected boolean G()
/* 141:    */   {
/* 142:144 */     return true;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public aql k()
/* 146:    */   {
/* 147:149 */     return aql.b;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public int c(bec parambec)
/* 151:    */   {
/* 152:154 */     return 0;
/* 153:    */   }
/* 154:    */   
/* 155:    */   protected bed e()
/* 156:    */   {
/* 157:159 */     return new bed(this, new bex[] { b, M, O, N });
/* 158:    */   }
/* 159:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbj
 * JD-Core Version:    0.7.0.1
 */