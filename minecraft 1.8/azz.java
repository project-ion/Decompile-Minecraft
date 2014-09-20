/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class azz
/*   4:    */   extends ava
/*   5:    */ {
/*   6: 21 */   public static final bet a = bet.a("locked");
/*   7: 22 */   public static final bew b = bew.a("delay", 1, 4);
/*   8:    */   
/*   9:    */   protected azz(boolean paramBoolean)
/*  10:    */   {
/*  11: 25 */     super(paramBoolean);
/*  12: 26 */     j(this.L.b().a(N, ej.c).a(b, Integer.valueOf(1)).a(a, Boolean.valueOf(false)));
/*  13:    */   }
/*  14:    */   
/*  15:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  16:    */   {
/*  17: 31 */     return parambec.a(a, Boolean.valueOf(b(paramard, paramdt, parambec)));
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  21:    */   {
/*  22: 36 */     if (!paramahd.by.e) {
/*  23: 37 */       return false;
/*  24:    */     }
/*  25: 40 */     paramaqu.a(paramdt, parambec.a(b), 3);
/*  26: 41 */     return true;
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected int d(bec parambec)
/*  30:    */   {
/*  31: 46 */     return ((Integer)parambec.b(b)).intValue() * 2;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected bec e(bec parambec)
/*  35:    */   {
/*  36: 51 */     Integer localInteger = (Integer)parambec.b(b);
/*  37: 52 */     Boolean localBoolean = (Boolean)parambec.b(a);
/*  38: 53 */     ej localej = (ej)parambec.b(N);
/*  39: 54 */     return aty.bc.P().a(N, localej).a(b, localInteger).a(a, localBoolean);
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected bec k(bec parambec)
/*  43:    */   {
/*  44: 59 */     Integer localInteger = (Integer)parambec.b(b);
/*  45: 60 */     Boolean localBoolean = (Boolean)parambec.b(a);
/*  46: 61 */     ej localej = (ej)parambec.b(N);
/*  47: 62 */     return aty.bb.P().a(N, localej).a(b, localInteger).a(a, localBoolean);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  51:    */   {
/*  52: 68 */     return amk.bb;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public alq b(aqu paramaqu, dt paramdt)
/*  56:    */   {
/*  57: 73 */     return amk.bb;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean b(ard paramard, dt paramdt, bec parambec)
/*  61:    */   {
/*  62: 78 */     return c(paramard, paramdt, parambec) > 0;
/*  63:    */   }
/*  64:    */   
/*  65:    */   protected boolean c(atr paramatr)
/*  66:    */   {
/*  67: 83 */     return d(paramatr);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  71:    */   {
/*  72: 88 */     if (!this.M) {
/*  73: 89 */       return;
/*  74:    */     }
/*  75: 91 */     ej localej = (ej)parambec.b(N);
/*  76:    */     
/*  77: 93 */     double d1 = paramdt.n() + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*  78: 94 */     double d2 = paramdt.o() + 0.4F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*  79: 95 */     double d3 = paramdt.p() + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*  80:    */     
/*  81: 97 */     float f = -5.0F;
/*  82: 98 */     if (paramRandom.nextBoolean()) {
/*  83: 99 */       f = ((Integer)parambec.b(b)).intValue() * 2 - 1;
/*  84:    */     }
/*  85:101 */     f /= 16.0F;
/*  86:    */     
/*  87:103 */     double d4 = f * localej.g();
/*  88:104 */     double d5 = f * localej.i();
/*  89:    */     
/*  90:106 */     paramaqu.a(ew.E, d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D, new int[0]);
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/*  94:    */   {
/*  95:111 */     super.b(paramaqu, paramdt, parambec);
/*  96:112 */     h(paramaqu, paramdt, parambec);
/*  97:    */   }
/*  98:    */   
/*  99:    */   public bec a(int paramInt)
/* 100:    */   {
/* 101:117 */     return P().a(N, ej.b(paramInt)).a(a, Boolean.valueOf(false)).a(b, Integer.valueOf(1 + (paramInt >> 2)));
/* 102:    */   }
/* 103:    */   
/* 104:    */   public int c(bec parambec)
/* 105:    */   {
/* 106:125 */     int i = 0;
/* 107:    */     
/* 108:127 */     i |= ((ej)parambec.b(N)).b();
/* 109:128 */     i |= ((Integer)parambec.b(b)).intValue() - 1 << 2;
/* 110:    */     
/* 111:130 */     return i;
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected bed e()
/* 115:    */   {
/* 116:135 */     return new bed(this, new bex[] { N, b, a });
/* 117:    */   }
/* 118:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     azz
 * JD-Core Version:    0.7.0.1
 */