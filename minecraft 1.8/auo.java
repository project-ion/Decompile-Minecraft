/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class auo
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 22 */   public static final bet a = bet.a("triggered");
/*   7:    */   
/*   8:    */   public auo()
/*   9:    */   {
/*  10: 25 */     super(bof.f);
/*  11: 26 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/*  12:    */   }
/*  13:    */   
/*  14:    */   public bcm a(aqu paramaqu, int paramInt)
/*  15:    */   {
/*  16: 31 */     return new bct();
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  20:    */   {
/*  21: 36 */     if (!paramaqu.D)
/*  22:    */     {
/*  23: 37 */       boolean bool1 = paramaqu.z(paramdt);
/*  24: 38 */       boolean bool2 = ((Boolean)parambec.b(a)).booleanValue();
/*  25: 40 */       if ((bool1) && (!bool2))
/*  26:    */       {
/*  27: 41 */         paramaqu.a(paramdt, parambec.a(a, Boolean.valueOf(true)), 4);
/*  28: 42 */         paramaqu.a(paramdt, this, a(paramaqu));
/*  29:    */       }
/*  30: 43 */       else if ((!bool1) && (bool2))
/*  31:    */       {
/*  32: 44 */         paramaqu.a(paramdt, parambec.a(a, Boolean.valueOf(false)), 4);
/*  33:    */       }
/*  34:    */     }
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  38:    */   {
/*  39: 51 */     bcm localbcm = paramaqu.s(paramdt);
/*  40: 52 */     if ((localbcm instanceof bct))
/*  41:    */     {
/*  42: 53 */       ((bct)localbcm).b().a(paramaqu);
/*  43:    */       
/*  44: 55 */       paramaqu.e(paramdt, this);
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public int a(aqu paramaqu)
/*  49:    */   {
/*  50: 61 */     return 1;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  54:    */   {
/*  55: 66 */     bcm localbcm = paramaqu.s(paramdt);
/*  56: 67 */     if ((localbcm instanceof bct)) {
/*  57: 68 */       return ((bct)localbcm).b().a(paramahd);
/*  58:    */     }
/*  59: 71 */     return false;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean N()
/*  63:    */   {
/*  64: 76 */     return true;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int l(aqu paramaqu, dt paramdt)
/*  68:    */   {
/*  69: 81 */     bcm localbcm = paramaqu.s(paramdt);
/*  70: 82 */     if ((localbcm instanceof bct)) {
/*  71: 83 */       return ((bct)localbcm).b().j();
/*  72:    */     }
/*  73: 86 */     return 0;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj)
/*  77:    */   {
/*  78: 91 */     bcm localbcm = paramaqu.s(paramdt);
/*  79: 92 */     if (!(localbcm instanceof bct)) {
/*  80: 93 */       return;
/*  81:    */     }
/*  82: 96 */     aqf localaqf = ((bct)localbcm).b();
/*  83: 98 */     if (paramamj.s()) {
/*  84: 99 */       localaqf.b(paramamj.q());
/*  85:    */     }
/*  86:102 */     if (!paramaqu.D) {
/*  87:103 */       localaqf.a(paramaqu.Q().b("sendCommandFeedback"));
/*  88:    */     }
/*  89:    */   }
/*  90:    */   
/*  91:    */   public int a(Random paramRandom)
/*  92:    */   {
/*  93:109 */     return 0;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public int b()
/*  97:    */   {
/*  98:114 */     return 3;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public bec a(int paramInt)
/* 102:    */   {
/* 103:119 */     return P().a(a, Boolean.valueOf((paramInt & 0x1) > 0));
/* 104:    */   }
/* 105:    */   
/* 106:    */   public int c(bec parambec)
/* 107:    */   {
/* 108:125 */     int i = 0;
/* 109:127 */     if (((Boolean)parambec.b(a)).booleanValue()) {
/* 110:128 */       i |= 0x1;
/* 111:    */     }
/* 112:131 */     return i;
/* 113:    */   }
/* 114:    */   
/* 115:    */   protected bed e()
/* 116:    */   {
/* 117:136 */     return new bed(this, new bex[] { a });
/* 118:    */   }
/* 119:    */   
/* 120:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 121:    */   {
/* 122:141 */     return P().a(a, Boolean.valueOf(false));
/* 123:    */   }
/* 124:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     auo
 * JD-Core Version:    0.7.0.1
 */