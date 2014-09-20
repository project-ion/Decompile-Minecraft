/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class azs
/*   4:    */   extends atr
/*   5:    */ {
/*   6:    */   private final boolean a;
/*   7:    */   
/*   8:    */   public azs(boolean paramBoolean)
/*   9:    */   {
/*  10: 22 */     super(bof.e);
/*  11: 23 */     if (paramBoolean) {
/*  12: 24 */       a(true);
/*  13:    */     }
/*  14: 26 */     this.a = paramBoolean;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public int a(aqu paramaqu)
/*  18:    */   {
/*  19: 31 */     return 30;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(aqu paramaqu, dt paramdt, ahd paramahd)
/*  23:    */   {
/*  24: 36 */     d(paramaqu, paramdt);
/*  25: 37 */     super.a(paramaqu, paramdt, paramahd);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(aqu paramaqu, dt paramdt, wv paramwv)
/*  29:    */   {
/*  30: 42 */     d(paramaqu, paramdt);
/*  31: 43 */     super.a(paramaqu, paramdt, paramwv);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  35:    */   {
/*  36: 48 */     d(paramaqu, paramdt);
/*  37: 49 */     return super.a(paramaqu, paramdt, parambec, paramahd, paramej, paramFloat1, paramFloat2, paramFloat3);
/*  38:    */   }
/*  39:    */   
/*  40:    */   private void d(aqu paramaqu, dt paramdt)
/*  41:    */   {
/*  42: 53 */     e(paramaqu, paramdt);
/*  43: 54 */     if (this == aty.aC) {
/*  44: 55 */       paramaqu.a(paramdt, aty.aD.P());
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  49:    */   {
/*  50: 61 */     if (this == aty.aD) {
/*  51: 62 */       paramaqu.a(paramdt, aty.aC.P());
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  56:    */   {
/*  57: 69 */     return amk.aC;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public int a(int paramInt, Random paramRandom)
/*  61:    */   {
/*  62: 74 */     return a(paramRandom) + paramRandom.nextInt(paramInt + 1);
/*  63:    */   }
/*  64:    */   
/*  65:    */   public int a(Random paramRandom)
/*  66:    */   {
/*  67: 79 */     return 4 + paramRandom.nextInt(2);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/*  71:    */   {
/*  72: 84 */     super.a(paramaqu, paramdt, parambec, paramFloat, paramInt);
/*  73: 87 */     if (a(parambec, paramaqu.s, paramInt) != alq.a(this))
/*  74:    */     {
/*  75: 88 */       int i = 1 + paramaqu.s.nextInt(5);
/*  76: 89 */       b(paramaqu, paramdt, i);
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  81:    */   {
/*  82: 95 */     if (this.a) {
/*  83: 96 */       e(paramaqu, paramdt);
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   private void e(aqu paramaqu, dt paramdt)
/*  88:    */   {
/*  89:101 */     Random localRandom = paramaqu.s;
/*  90:102 */     double d1 = 0.0625D;
/*  91:103 */     for (int i = 0; i < 6; i++)
/*  92:    */     {
/*  93:104 */       double d2 = paramdt.n() + localRandom.nextFloat();
/*  94:105 */       double d3 = paramdt.o() + localRandom.nextFloat();
/*  95:106 */       double d4 = paramdt.p() + localRandom.nextFloat();
/*  96:107 */       if ((i == 0) && (!paramaqu.p(paramdt.a()).c().c())) {
/*  97:108 */         d3 = paramdt.o() + d1 + 1.0D;
/*  98:    */       }
/*  99:110 */       if ((i == 1) && (!paramaqu.p(paramdt.b()).c().c())) {
/* 100:111 */         d3 = paramdt.o() - d1;
/* 101:    */       }
/* 102:113 */       if ((i == 2) && (!paramaqu.p(paramdt.d()).c().c())) {
/* 103:114 */         d4 = paramdt.p() + d1 + 1.0D;
/* 104:    */       }
/* 105:116 */       if ((i == 3) && (!paramaqu.p(paramdt.c()).c().c())) {
/* 106:117 */         d4 = paramdt.p() - d1;
/* 107:    */       }
/* 108:119 */       if ((i == 4) && (!paramaqu.p(paramdt.f()).c().c())) {
/* 109:120 */         d2 = paramdt.n() + d1 + 1.0D;
/* 110:    */       }
/* 111:122 */       if ((i == 5) && (!paramaqu.p(paramdt.e()).c().c())) {
/* 112:123 */         d2 = paramdt.n() - d1;
/* 113:    */       }
/* 114:125 */       if ((d2 < paramdt.n()) || (d2 > paramdt.n() + 1) || (d3 < 0.0D) || (d3 > paramdt.o() + 1) || (d4 < paramdt.p()) || (d4 > paramdt.p() + 1)) {
/* 115:126 */         paramaqu.a(ew.E, d2, d3, d4, 0.0D, 0.0D, 0.0D, new int[0]);
/* 116:    */       }
/* 117:    */     }
/* 118:    */   }
/* 119:    */   
/* 120:    */   protected amj i(bec parambec)
/* 121:    */   {
/* 122:133 */     return new amj(aty.aC);
/* 123:    */   }
/* 124:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     azs
 * JD-Core Version:    0.7.0.1
 */