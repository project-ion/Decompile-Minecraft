/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class auv
/*   5:    */   extends atg
/*   6:    */ {
/*   7: 27 */   public static final bew a = bew.a("power", 0, 15);
/*   8:    */   private final boolean b;
/*   9:    */   
/*  10:    */   public auv(boolean paramBoolean)
/*  11:    */   {
/*  12: 32 */     super(bof.d);
/*  13: 33 */     this.b = paramBoolean;
/*  14:    */     
/*  15: 35 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  16: 36 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
/*  17: 37 */     a(akf.d);
/*  18:    */     
/*  19: 39 */     c(0.2F);
/*  20: 40 */     a(f);
/*  21: 41 */     c("daylightDetector");
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a(ard paramard, dt paramdt)
/*  25:    */   {
/*  26: 46 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a(ard paramard, dt paramdt, bec parambec, ej paramej)
/*  30:    */   {
/*  31: 51 */     return ((Integer)parambec.b(a)).intValue();
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void d(aqu paramaqu, dt paramdt)
/*  35:    */   {
/*  36: 55 */     if (paramaqu.t.o()) {
/*  37: 56 */       return;
/*  38:    */     }
/*  39: 59 */     bec localbec = paramaqu.p(paramdt);
/*  40: 60 */     int i = paramaqu.b(arf.a, paramdt) - paramaqu.ab();
/*  41: 61 */     float f1 = paramaqu.d(1.0F);
/*  42:    */     
/*  43:    */ 
/*  44: 64 */     float f2 = f1 < 3.141593F ? 0.0F : 6.283186F;
/*  45: 65 */     f1 += (f2 - f1) * 0.2F;
/*  46:    */     
/*  47: 67 */     i = Math.round(i * uv.b(f1));
/*  48: 68 */     i = uv.a(i, 0, 15);
/*  49: 70 */     if (this.b) {
/*  50: 71 */       i = 15 - i;
/*  51:    */     }
/*  52: 74 */     if (((Integer)localbec.b(a)).intValue() != i) {
/*  53: 75 */       paramaqu.a(paramdt, localbec.a(a, Integer.valueOf(i)), 3);
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  58:    */   {
/*  59: 81 */     if (paramahd.cm())
/*  60:    */     {
/*  61: 82 */       if (paramaqu.D) {
/*  62: 83 */         return true;
/*  63:    */       }
/*  64: 85 */       if (this.b)
/*  65:    */       {
/*  66: 86 */         paramaqu.a(paramdt, aty.cl.P().a(a, parambec.b(a)), 4);
/*  67: 87 */         aty.cl.d(paramaqu, paramdt);
/*  68:    */       }
/*  69:    */       else
/*  70:    */       {
/*  71: 89 */         paramaqu.a(paramdt, aty.cm.P().a(a, parambec.b(a)), 4);
/*  72: 90 */         aty.cm.d(paramaqu, paramdt);
/*  73:    */       }
/*  74: 92 */       return true;
/*  75:    */     }
/*  76: 94 */     return super.a(paramaqu, paramdt, parambec, paramahd, paramej, paramFloat1, paramFloat2, paramFloat3);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  80:    */   {
/*  81:100 */     return alq.a(aty.cl);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public alq b(aqu paramaqu, dt paramdt)
/*  85:    */   {
/*  86:105 */     return alq.a(aty.cl);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public boolean d()
/*  90:    */   {
/*  91:114 */     return false;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public boolean c()
/*  95:    */   {
/*  96:119 */     return false;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public int b()
/* 100:    */   {
/* 101:124 */     return 3;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean g()
/* 105:    */   {
/* 106:129 */     return true;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public bcm a(aqu paramaqu, int paramInt)
/* 110:    */   {
/* 111:134 */     return new bcw();
/* 112:    */   }
/* 113:    */   
/* 114:    */   public bec a(int paramInt)
/* 115:    */   {
/* 116:139 */     return P().a(a, Integer.valueOf(paramInt));
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int c(bec parambec)
/* 120:    */   {
/* 121:144 */     return ((Integer)parambec.b(a)).intValue();
/* 122:    */   }
/* 123:    */   
/* 124:    */   protected bed e()
/* 125:    */   {
/* 126:149 */     return new bed(this, new bex[] { a });
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void a(alq paramalq, akf paramakf, List paramList)
/* 130:    */   {
/* 131:154 */     if (!this.b) {
/* 132:157 */       super.a(paramalq, paramakf, paramList);
/* 133:    */     }
/* 134:    */   }
/* 135:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     auv
 * JD-Core Version:    0.7.0.1
 */