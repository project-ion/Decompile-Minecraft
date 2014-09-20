/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bcg
/*   4:    */   extends atr
/*   5:    */ {
/*   6: 19 */   public static final bev a = bev.a("color", akv.class);
/*   7:    */   
/*   8:    */   protected bcg()
/*   9:    */   {
/*  10: 22 */     super(bof.r);
/*  11: 23 */     j(this.L.b().a(a, akv.a));
/*  12: 24 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*  13: 25 */     a(true);
/*  14: 26 */     a(akf.c);
/*  15: 27 */     b(0);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean c()
/*  19:    */   {
/*  20: 32 */     return false;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean d()
/*  24:    */   {
/*  25: 37 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void h()
/*  29:    */   {
/*  30: 42 */     b(0);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void a(ard paramard, dt paramdt)
/*  34:    */   {
/*  35: 47 */     b(0);
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected void b(int paramInt)
/*  39:    */   {
/*  40: 51 */     int i = 0;
/*  41: 52 */     float f = 1 * (1 + i) / 16.0F;
/*  42: 53 */     a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  46:    */   {
/*  47: 58 */     return (super.c(paramaqu, paramdt)) && (d(paramaqu, paramdt));
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  51:    */   {
/*  52: 63 */     e(paramaqu, paramdt, parambec);
/*  53:    */   }
/*  54:    */   
/*  55:    */   private boolean e(aqu paramaqu, dt paramdt, bec parambec)
/*  56:    */   {
/*  57: 67 */     if (!d(paramaqu, paramdt))
/*  58:    */     {
/*  59: 68 */       b(paramaqu, paramdt, parambec, 0);
/*  60: 69 */       paramaqu.g(paramdt);
/*  61: 70 */       return false;
/*  62:    */     }
/*  63: 72 */     return true;
/*  64:    */   }
/*  65:    */   
/*  66:    */   private boolean d(aqu paramaqu, dt paramdt)
/*  67:    */   {
/*  68: 76 */     return !paramaqu.d(paramdt.b());
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/*  72:    */   {
/*  73: 81 */     if (paramej == ej.b) {
/*  74: 82 */       return true;
/*  75:    */     }
/*  76: 84 */     return super.a(paramard, paramdt, paramej);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public int a(bec parambec)
/*  80:    */   {
/*  81: 89 */     return ((akv)parambec.b(a)).a();
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  85:    */   {
/*  86: 94 */     for (int i = 0; i < 16; i++) {
/*  87: 95 */       paramList.add(new amj(paramalq, 1, i));
/*  88:    */     }
/*  89:    */   }
/*  90:    */   
/*  91:    */   public bec a(int paramInt)
/*  92:    */   {
/*  93:101 */     return P().a(a, akv.b(paramInt));
/*  94:    */   }
/*  95:    */   
/*  96:    */   public int c(bec parambec)
/*  97:    */   {
/*  98:107 */     return ((akv)parambec.b(a)).a();
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected bed e()
/* 102:    */   {
/* 103:112 */     return new bed(this, new bex[] { a });
/* 104:    */   }
/* 105:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcg
 * JD-Core Version:    0.7.0.1
 */