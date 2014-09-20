/*   1:    */ public class axe
/*   2:    */   extends atr
/*   3:    */ {
/*   4: 19 */   public static final beu a = beu.a("facing", en.a);
/*   5:    */   
/*   6:    */   protected axe()
/*   7:    */   {
/*   8: 22 */     super(bof.q);
/*   9: 23 */     j(this.L.b().a(a, ej.c));
/*  10: 24 */     a(akf.c);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  14:    */   {
/*  15: 30 */     a(paramaqu, paramdt);
/*  16: 31 */     return super.a(paramaqu, paramdt, parambec);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public brt a(aqu paramaqu, dt paramdt)
/*  20:    */   {
/*  21: 36 */     a(paramaqu, paramdt);
/*  22: 37 */     return super.a(paramaqu, paramdt);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(ard paramard, dt paramdt)
/*  26:    */   {
/*  27: 42 */     bec localbec = paramard.p(paramdt);
/*  28: 43 */     if (localbec.c() != this) {
/*  29: 44 */       return;
/*  30:    */     }
/*  31: 47 */     float f = 0.125F;
/*  32: 48 */     switch (axf.a[((ej)localbec.b(a)).ordinal()])
/*  33:    */     {
/*  34:    */     case 1: 
/*  35: 50 */       a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  36: 51 */       break;
/*  37:    */     case 2: 
/*  38: 53 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  39: 54 */       break;
/*  40:    */     case 3: 
/*  41: 56 */       a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  42: 57 */       break;
/*  43:    */     case 4: 
/*  44:    */     default: 
/*  45: 60 */       a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  46:    */     }
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean c()
/*  50:    */   {
/*  51: 67 */     return false;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public boolean d()
/*  55:    */   {
/*  56: 72 */     return false;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  60:    */   {
/*  61: 77 */     if (paramaqu.p(paramdt.e()).c().t()) {
/*  62: 78 */       return true;
/*  63:    */     }
/*  64: 79 */     if (paramaqu.p(paramdt.f()).c().t()) {
/*  65: 80 */       return true;
/*  66:    */     }
/*  67: 81 */     if (paramaqu.p(paramdt.c()).c().t()) {
/*  68: 82 */       return true;
/*  69:    */     }
/*  70: 83 */     if (paramaqu.p(paramdt.d()).c().t()) {
/*  71: 84 */       return true;
/*  72:    */     }
/*  73: 86 */     return false;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  77:    */   {
/*  78: 91 */     if ((paramej.k().c()) && (b(paramaqu, paramdt, paramej))) {
/*  79: 92 */       return P().a(a, paramej);
/*  80:    */     }
/*  81: 95 */     for (ej localej : en.a) {
/*  82: 96 */       if (b(paramaqu, paramdt, localej)) {
/*  83: 97 */         return P().a(a, localej);
/*  84:    */       }
/*  85:    */     }
/*  86:101 */     return P();
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  90:    */   {
/*  91:106 */     ej localej = (ej)parambec.b(a);
/*  92:107 */     if (!b(paramaqu, paramdt, localej))
/*  93:    */     {
/*  94:108 */       b(paramaqu, paramdt, parambec, 0);
/*  95:109 */       paramaqu.g(paramdt);
/*  96:    */     }
/*  97:112 */     super.a(paramaqu, paramdt, parambec, paramatr);
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected boolean b(aqu paramaqu, dt paramdt, ej paramej)
/* 101:    */   {
/* 102:116 */     return paramaqu.p(paramdt.a(paramej.d())).c().t();
/* 103:    */   }
/* 104:    */   
/* 105:    */   public aql k()
/* 106:    */   {
/* 107:121 */     return aql.c;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public bec a(int paramInt)
/* 111:    */   {
/* 112:126 */     ej localej = ej.a(paramInt);
/* 113:127 */     if (localej.k() == el.b) {
/* 114:128 */       localej = ej.c;
/* 115:    */     }
/* 116:130 */     return P().a(a, localej);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int c(bec parambec)
/* 120:    */   {
/* 121:136 */     return ((ej)parambec.b(a)).a();
/* 122:    */   }
/* 123:    */   
/* 124:    */   protected bed e()
/* 125:    */   {
/* 126:141 */     return new bed(this, new bex[] { a });
/* 127:    */   }
/* 128:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axe
 * JD-Core Version:    0.7.0.1
 */