/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class avr
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 29 */   public static final beu a = beu.a("facing", en.a);
/*   7:    */   
/*   8:    */   protected avr()
/*   9:    */   {
/*  10: 32 */     super(bof.e);
/*  11: 33 */     j(this.L.b().a(a, ej.c));
/*  12: 34 */     a(akf.c);
/*  13: 35 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean c()
/*  17:    */   {
/*  18: 40 */     return false;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean d()
/*  22:    */   {
/*  23: 45 */     return false;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int b()
/*  27:    */   {
/*  28: 50 */     return 2;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  32:    */   {
/*  33: 56 */     return alq.a(aty.Z);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public int a(Random paramRandom)
/*  37:    */   {
/*  38: 61 */     return 8;
/*  39:    */   }
/*  40:    */   
/*  41:    */   protected boolean G()
/*  42:    */   {
/*  43: 66 */     return true;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  47:    */   {
/*  48: 71 */     return P().a(a, paramxm.aO().d());
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj)
/*  52:    */   {
/*  53: 76 */     paramaqu.a(paramdt, parambec.a(a, paramxm.aO().d()), 2);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  57:    */   {
/*  58: 81 */     ajh localajh = paramahd.cn();
/*  59: 82 */     bcm localbcm = paramaqu.s(paramdt);
/*  60: 83 */     if ((localajh == null) || (!(localbcm instanceof bda))) {
/*  61: 84 */       return true;
/*  62:    */     }
/*  63: 87 */     if (paramaqu.p(paramdt.a()).c().t()) {
/*  64: 88 */       return true;
/*  65:    */     }
/*  66: 91 */     if (paramaqu.D) {
/*  67: 92 */       return true;
/*  68:    */     }
/*  69: 95 */     localajh.a((bda)localbcm);
/*  70: 96 */     paramahd.a(localajh);
/*  71:    */     
/*  72: 98 */     return true;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public bcm a(aqu paramaqu, int paramInt)
/*  76:    */   {
/*  77:103 */     return new bda();
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  81:    */   {
/*  82:108 */     for (int i = 0; i < 3; i++)
/*  83:    */     {
/*  84:109 */       int j = paramRandom.nextInt(2) * 2 - 1;
/*  85:110 */       int k = paramRandom.nextInt(2) * 2 - 1;
/*  86:    */       
/*  87:112 */       double d1 = paramdt.n() + 0.5D + 0.25D * j;
/*  88:113 */       double d2 = paramdt.o() + paramRandom.nextFloat();
/*  89:114 */       double d3 = paramdt.p() + 0.5D + 0.25D * k;
/*  90:115 */       double d4 = paramRandom.nextFloat() * j;
/*  91:116 */       double d5 = (paramRandom.nextFloat() - 0.5D) * 0.125D;
/*  92:117 */       double d6 = paramRandom.nextFloat() * k;
/*  93:    */       
/*  94:119 */       paramaqu.a(ew.y, d1, d2, d3, d4, d5, d6, new int[0]);
/*  95:    */     }
/*  96:    */   }
/*  97:    */   
/*  98:    */   public bec a(int paramInt)
/*  99:    */   {
/* 100:125 */     ej localej = ej.a(paramInt);
/* 101:126 */     if (localej.k() == el.b) {
/* 102:127 */       localej = ej.c;
/* 103:    */     }
/* 104:129 */     return P().a(a, localej);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public int c(bec parambec)
/* 108:    */   {
/* 109:135 */     return ((ej)parambec.b(a)).a();
/* 110:    */   }
/* 111:    */   
/* 112:    */   protected bed e()
/* 113:    */   {
/* 114:140 */     return new bed(this, new bex[] { a });
/* 115:    */   }
/* 116:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avr
 * JD-Core Version:    0.7.0.1
 */