/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class auu
/*   4:    */   extends auc
/*   5:    */   implements atz
/*   6:    */ {
/*   7: 18 */   public static final bew a = bew.a("age", 0, 7);
/*   8:    */   
/*   9:    */   protected auu()
/*  10:    */   {
/*  11: 21 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  12: 22 */     a(true);
/*  13: 23 */     float f = 0.5F;
/*  14: 24 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*  15: 25 */     a(null);
/*  16: 26 */     c(0.0F);
/*  17: 27 */     a(h);
/*  18: 28 */     J();
/*  19:    */   }
/*  20:    */   
/*  21:    */   protected boolean c(atr paramatr)
/*  22:    */   {
/*  23: 33 */     return paramatr == aty.ak;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  27:    */   {
/*  28: 38 */     super.b(paramaqu, paramdt, parambec, paramRandom);
/*  29: 39 */     if (paramaqu.l(paramdt.a()) >= 9)
/*  30:    */     {
/*  31: 40 */       int i = ((Integer)parambec.b(a)).intValue();
/*  32: 41 */       if (i < 7)
/*  33:    */       {
/*  34: 42 */         float f = a(this, paramaqu, paramdt);
/*  35: 44 */         if (paramRandom.nextInt((int)(25.0F / f) + 1) == 0) {
/*  36: 45 */           paramaqu.a(paramdt, parambec.a(a, Integer.valueOf(i + 1)), 2);
/*  37:    */         }
/*  38:    */       }
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void g(aqu paramaqu, dt paramdt, bec parambec)
/*  43:    */   {
/*  44: 52 */     int i = ((Integer)parambec.b(a)).intValue() + uv.a(paramaqu.s, 2, 5);
/*  45: 53 */     if (i > 7) {
/*  46: 54 */       i = 7;
/*  47:    */     }
/*  48: 56 */     paramaqu.a(paramdt, parambec.a(a, Integer.valueOf(i)), 2);
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected static float a(atr paramatr, aqu paramaqu, dt paramdt)
/*  52:    */   {
/*  53: 60 */     float f1 = 1.0F;
/*  54:    */     
/*  55: 62 */     dt localdt1 = paramdt.b();
/*  56: 63 */     for (int i = -1; i <= 1; i++) {
/*  57: 64 */       for (int j = -1; j <= 1; j++)
/*  58:    */       {
/*  59: 65 */         float f2 = 0.0F;
/*  60:    */         
/*  61: 67 */         localObject = paramaqu.p(localdt1.a(i, 0, j));
/*  62: 68 */         if (((bec)localObject).c() == aty.ak)
/*  63:    */         {
/*  64: 69 */           f2 = 1.0F;
/*  65: 70 */           if (((Integer)((bec)localObject).b(avu.a)).intValue() > 0) {
/*  66: 71 */             f2 = 3.0F;
/*  67:    */           }
/*  68:    */         }
/*  69: 75 */         if ((i != 0) || (j != 0)) {
/*  70: 76 */           f2 /= 4.0F;
/*  71:    */         }
/*  72: 79 */         f1 += f2;
/*  73:    */       }
/*  74:    */     }
/*  75: 83 */     dt localdt2 = paramdt.c();
/*  76: 84 */     dt localdt3 = paramdt.d();
/*  77: 85 */     dt localdt4 = paramdt.e();
/*  78: 86 */     Object localObject = paramdt.f();
/*  79:    */     
/*  80: 88 */     int k = (paramatr == paramaqu.p(localdt4).c()) || (paramatr == paramaqu.p((dt)localObject).c()) ? 1 : 0;
/*  81: 89 */     int m = (paramatr == paramaqu.p(localdt2).c()) || (paramatr == paramaqu.p(localdt3).c()) ? 1 : 0;
/*  82: 91 */     if ((k != 0) && (m != 0))
/*  83:    */     {
/*  84: 92 */       f1 /= 2.0F;
/*  85:    */     }
/*  86:    */     else
/*  87:    */     {
/*  88: 95 */       int n = (paramatr == paramaqu.p(localdt4.c()).c()) || (paramatr == paramaqu.p(((dt)localObject).c()).c()) || (paramatr == paramaqu.p(((dt)localObject).d()).c()) || (paramatr == paramaqu.p(localdt4.d()).c()) ? 1 : 0;
/*  89:100 */       if (n != 0) {
/*  90:101 */         f1 /= 2.0F;
/*  91:    */       }
/*  92:    */     }
/*  93:105 */     return f1;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean f(aqu paramaqu, dt paramdt, bec parambec)
/*  97:    */   {
/*  98:110 */     return ((paramaqu.k(paramdt) >= 8) || (paramaqu.i(paramdt))) && (c(paramaqu.p(paramdt.b()).c()));
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected alq j()
/* 102:    */   {
/* 103:114 */     return amk.N;
/* 104:    */   }
/* 105:    */   
/* 106:    */   protected alq l()
/* 107:    */   {
/* 108:118 */     return amk.O;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/* 112:    */   {
/* 113:128 */     super.a(paramaqu, paramdt, parambec, paramFloat, 0);
/* 114:130 */     if (paramaqu.D) {
/* 115:131 */       return;
/* 116:    */     }
/* 117:134 */     int i = ((Integer)parambec.b(a)).intValue();
/* 118:135 */     if (i >= 7)
/* 119:    */     {
/* 120:137 */       int j = 3 + paramInt;
/* 121:138 */       for (int k = 0; k < j; k++) {
/* 122:139 */         if (paramaqu.s.nextInt(15) <= i) {
/* 123:142 */           a(paramaqu, paramdt, new amj(j(), 1, 0));
/* 124:    */         }
/* 125:    */       }
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 130:    */   {
/* 131:150 */     if (((Integer)parambec.b(a)).intValue() == 7) {
/* 132:151 */       return l();
/* 133:    */     }
/* 134:154 */     return j();
/* 135:    */   }
/* 136:    */   
/* 137:    */   public alq b(aqu paramaqu, dt paramdt)
/* 138:    */   {
/* 139:159 */     return j();
/* 140:    */   }
/* 141:    */   
/* 142:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, boolean paramBoolean)
/* 143:    */   {
/* 144:164 */     return ((Integer)parambec.b(a)).intValue() < 7;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public boolean a(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/* 148:    */   {
/* 149:169 */     return true;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void b(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/* 153:    */   {
/* 154:174 */     g(paramaqu, paramdt, parambec);
/* 155:    */   }
/* 156:    */   
/* 157:    */   public bec a(int paramInt)
/* 158:    */   {
/* 159:179 */     return P().a(a, Integer.valueOf(paramInt));
/* 160:    */   }
/* 161:    */   
/* 162:    */   public int c(bec parambec)
/* 163:    */   {
/* 164:185 */     return ((Integer)parambec.b(a)).intValue();
/* 165:    */   }
/* 166:    */   
/* 167:    */   protected bed e()
/* 168:    */   {
/* 169:190 */     return new bed(this, new bex[] { a });
/* 170:    */   }
/* 171:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     auu
 * JD-Core Version:    0.7.0.1
 */