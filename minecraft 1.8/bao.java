/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bao
/*   4:    */   extends atr
/*   5:    */ {
/*   6: 26 */   public static final bew a = bew.a("layers", 1, 8);
/*   7:    */   
/*   8:    */   protected bao()
/*   9:    */   {
/*  10: 33 */     super(bof.y);
/*  11: 34 */     j(this.L.b().a(a, Integer.valueOf(1)));
/*  12: 35 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  13: 36 */     a(true);
/*  14: 37 */     a(akf.c);
/*  15: 38 */     h();
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean b(ard paramard, dt paramdt)
/*  19:    */   {
/*  20: 43 */     return ((Integer)paramard.p(paramdt).b(a)).intValue() < 5;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  24:    */   {
/*  25: 49 */     int i = ((Integer)parambec.b(a)).intValue() - 1;
/*  26: 50 */     float f = 0.125F;
/*  27: 51 */     return new brt(paramdt.n() + this.B, paramdt.o() + this.C, paramdt.p() + this.D, paramdt.n() + this.E, paramdt.o() + i * f, paramdt.p() + this.G);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean c()
/*  31:    */   {
/*  32: 61 */     return false;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean d()
/*  36:    */   {
/*  37: 66 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void h()
/*  41:    */   {
/*  42: 71 */     b(0);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(ard paramard, dt paramdt)
/*  46:    */   {
/*  47: 76 */     bec localbec = paramard.p(paramdt);
/*  48: 77 */     b(((Integer)localbec.b(a)).intValue());
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected void b(int paramInt)
/*  52:    */   {
/*  53: 81 */     a(0.0F, 0.0F, 0.0F, 1.0F, paramInt / 8.0F, 1.0F);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  57:    */   {
/*  58: 86 */     bec localbec = paramaqu.p(paramdt.b());
/*  59: 87 */     atr localatr = localbec.c();
/*  60: 89 */     if ((localatr == aty.aI) || (localatr == aty.cB)) {
/*  61: 90 */       return false;
/*  62:    */     }
/*  63: 93 */     if (localatr.r() == bof.j) {
/*  64: 94 */       return true;
/*  65:    */     }
/*  66: 97 */     if ((localatr == this) && (((Integer)localbec.b(a)).intValue() == 7)) {
/*  67: 98 */       return true;
/*  68:    */     }
/*  69:101 */     return (localatr.c()) && (localatr.J.c());
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  73:    */   {
/*  74:106 */     e(paramaqu, paramdt, parambec);
/*  75:    */   }
/*  76:    */   
/*  77:    */   private boolean e(aqu paramaqu, dt paramdt, bec parambec)
/*  78:    */   {
/*  79:110 */     if (!c(paramaqu, paramdt))
/*  80:    */     {
/*  81:111 */       b(paramaqu, paramdt, parambec, 0);
/*  82:112 */       paramaqu.g(paramdt);
/*  83:113 */       return false;
/*  84:    */     }
/*  85:115 */     return true;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void a(aqu paramaqu, ahd paramahd, dt paramdt, bec parambec, bcm parambcm)
/*  89:    */   {
/*  90:120 */     a(paramaqu, paramdt, new amj(amk.aD, ((Integer)parambec.b(a)).intValue() + 1, 0));
/*  91:121 */     paramaqu.g(paramdt);
/*  92:    */     
/*  93:123 */     paramahd.b(ty.H[atr.a(this)]);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  97:    */   {
/*  98:129 */     return amk.aD;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public int a(Random paramRandom)
/* 102:    */   {
/* 103:134 */     return 0;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 107:    */   {
/* 108:139 */     if (paramaqu.b(arf.b, paramdt) > 11)
/* 109:    */     {
/* 110:140 */       b(paramaqu, paramdt, paramaqu.p(paramdt), 0);
/* 111:141 */       paramaqu.g(paramdt);
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/* 116:    */   {
/* 117:147 */     if (paramej == ej.b) {
/* 118:148 */       return true;
/* 119:    */     }
/* 120:150 */     return super.a(paramard, paramdt, paramej);
/* 121:    */   }
/* 122:    */   
/* 123:    */   public bec a(int paramInt)
/* 124:    */   {
/* 125:155 */     return P().a(a, Integer.valueOf((paramInt & 0x7) + 1));
/* 126:    */   }
/* 127:    */   
/* 128:    */   public boolean f(aqu paramaqu, dt paramdt)
/* 129:    */   {
/* 130:161 */     return ((Integer)paramaqu.p(paramdt).b(a)).intValue() == 1;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public int c(bec parambec)
/* 134:    */   {
/* 135:166 */     return ((Integer)parambec.b(a)).intValue() - 1;
/* 136:    */   }
/* 137:    */   
/* 138:    */   protected bed e()
/* 139:    */   {
/* 140:171 */     return new bed(this, new bex[] { a });
/* 141:    */   }
/* 142:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bao
 * JD-Core Version:    0.7.0.1
 */