/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class axc
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 57 */   public static final bet a = bet.a("has_record");
/*   7:    */   
/*   8:    */   protected axc()
/*   9:    */   {
/*  10: 60 */     super(bof.d);
/*  11: 61 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/*  12: 62 */     a(akf.c);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  16:    */   {
/*  17: 67 */     if (((Boolean)parambec.b(a)).booleanValue())
/*  18:    */     {
/*  19: 68 */       e(paramaqu, paramdt, parambec);
/*  20:    */       
/*  21: 70 */       parambec = parambec.a(a, Boolean.valueOf(false));
/*  22: 71 */       paramaqu.a(paramdt, parambec, 2);
/*  23: 72 */       return true;
/*  24:    */     }
/*  25: 75 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, amj paramamj)
/*  29:    */   {
/*  30: 79 */     if (paramaqu.D) {
/*  31: 80 */       return;
/*  32:    */     }
/*  33: 83 */     bcm localbcm = paramaqu.s(paramdt);
/*  34: 84 */     if (!(localbcm instanceof axd)) {
/*  35: 85 */       return;
/*  36:    */     }
/*  37: 88 */     ((axd)localbcm).a(new amj(paramamj.b(), 1, paramamj.i()));
/*  38: 89 */     paramaqu.a(paramdt, parambec.a(a, Boolean.valueOf(true)), 2);
/*  39:    */   }
/*  40:    */   
/*  41:    */   private void e(aqu paramaqu, dt paramdt, bec parambec)
/*  42:    */   {
/*  43: 93 */     if (paramaqu.D) {
/*  44: 94 */       return;
/*  45:    */     }
/*  46: 97 */     bcm localbcm = paramaqu.s(paramdt);
/*  47: 98 */     if (!(localbcm instanceof axd)) {
/*  48: 99 */       return;
/*  49:    */     }
/*  50:102 */     axd localaxd = (axd)localbcm;
/*  51:103 */     amj localamj1 = localaxd.a();
/*  52:104 */     if (localamj1 == null) {
/*  53:105 */       return;
/*  54:    */     }
/*  55:108 */     paramaqu.b(1005, paramdt, 0);
/*  56:109 */     paramaqu.a(paramdt, null);
/*  57:110 */     localaxd.a(null);
/*  58:    */     
/*  59:112 */     float f = 0.7F;
/*  60:113 */     double d1 = paramaqu.s.nextFloat() * f + (1.0F - f) * 0.5D;
/*  61:114 */     double d2 = paramaqu.s.nextFloat() * f + (1.0F - f) * 0.2D + 0.6D;
/*  62:115 */     double d3 = paramaqu.s.nextFloat() * f + (1.0F - f) * 0.5D;
/*  63:    */     
/*  64:117 */     amj localamj2 = localamj1.k();
/*  65:    */     
/*  66:119 */     adw localadw = new adw(paramaqu, paramdt.n() + d1, paramdt.o() + d2, paramdt.p() + d3, localamj2);
/*  67:120 */     localadw.p();
/*  68:121 */     paramaqu.d(localadw);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/*  72:    */   {
/*  73:128 */     e(paramaqu, paramdt, parambec);
/*  74:129 */     super.b(paramaqu, paramdt, parambec);
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/*  78:    */   {
/*  79:134 */     if (paramaqu.D) {
/*  80:135 */       return;
/*  81:    */     }
/*  82:137 */     super.a(paramaqu, paramdt, parambec, paramFloat, 0);
/*  83:    */   }
/*  84:    */   
/*  85:    */   public bcm a(aqu paramaqu, int paramInt)
/*  86:    */   {
/*  87:142 */     return new axd();
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean N()
/*  91:    */   {
/*  92:147 */     return true;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public int l(aqu paramaqu, dt paramdt)
/*  96:    */   {
/*  97:152 */     bcm localbcm = paramaqu.s(paramdt);
/*  98:153 */     if ((localbcm instanceof axd))
/*  99:    */     {
/* 100:154 */       amj localamj = ((axd)localbcm).a();
/* 101:156 */       if (localamj != null) {
/* 102:158 */         return alq.b(localamj.b()) + 1 - alq.b(amk.cq);
/* 103:    */       }
/* 104:    */     }
/* 105:162 */     return 0;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public int b()
/* 109:    */   {
/* 110:167 */     return 3;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public bec a(int paramInt)
/* 114:    */   {
/* 115:172 */     return P().a(a, Boolean.valueOf(paramInt > 0));
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int c(bec parambec)
/* 119:    */   {
/* 120:178 */     return ((Boolean)parambec.b(a)).booleanValue() ? 1 : 0;
/* 121:    */   }
/* 122:    */   
/* 123:    */   protected bed e()
/* 124:    */   {
/* 125:183 */     return new bed(this, new bex[] { a });
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axc
 * JD-Core Version:    0.7.0.1
 */