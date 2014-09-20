/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class tk
/*   4:    */   extends tq
/*   5:    */ {
/*   6:    */   public final int a;
/*   7:    */   public final int b;
/*   8:    */   public final tk c;
/*   9:    */   private final String k;
/*  10:    */   private tm l;
/*  11:    */   public final amj d;
/*  12:    */   private boolean m;
/*  13:    */   
/*  14:    */   public tk(String paramString1, String paramString2, int paramInt1, int paramInt2, alq paramalq, tk paramtk)
/*  15:    */   {
/*  16: 20 */     this(paramString1, paramString2, paramInt1, paramInt2, new amj(paramalq), paramtk);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public tk(String paramString1, String paramString2, int paramInt1, int paramInt2, atr paramatr, tk paramtk)
/*  20:    */   {
/*  21: 24 */     this(paramString1, paramString2, paramInt1, paramInt2, new amj(paramatr), paramtk);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public tk(String paramString1, String paramString2, int paramInt1, int paramInt2, amj paramamj, tk paramtk)
/*  25:    */   {
/*  26: 28 */     super(paramString1, new hz("achievement." + paramString2, new Object[0]));
/*  27: 29 */     this.d = paramamj;
/*  28:    */     
/*  29: 31 */     this.k = ("achievement." + paramString2 + ".desc");
/*  30: 32 */     this.a = paramInt1;
/*  31: 33 */     this.b = paramInt2;
/*  32: 35 */     if (paramInt1 < tl.a) {
/*  33: 36 */       tl.a = paramInt1;
/*  34:    */     }
/*  35: 38 */     if (paramInt2 < tl.b) {
/*  36: 39 */       tl.b = paramInt2;
/*  37:    */     }
/*  38: 41 */     if (paramInt1 > tl.c) {
/*  39: 42 */       tl.c = paramInt1;
/*  40:    */     }
/*  41: 44 */     if (paramInt2 > tl.d) {
/*  42: 45 */       tl.d = paramInt2;
/*  43:    */     }
/*  44: 47 */     this.c = paramtk;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public tk a()
/*  48:    */   {
/*  49: 52 */     this.f = true;
/*  50: 53 */     return this;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public tk b()
/*  54:    */   {
/*  55: 57 */     this.m = true;
/*  56: 58 */     return this;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public tk c()
/*  60:    */   {
/*  61: 63 */     super.h();
/*  62:    */     
/*  63: 65 */     tl.e.add(this);
/*  64:    */     
/*  65: 67 */     return this;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean d()
/*  69:    */   {
/*  70: 72 */     return true;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public ho e()
/*  74:    */   {
/*  75: 77 */     ho localho = super.e();
/*  76: 78 */     localho.b().a(g() ? a.f : a.k);
/*  77: 79 */     return localho;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public tk a(Class paramClass)
/*  81:    */   {
/*  82: 84 */     return (tk)super.b(paramClass);
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String f()
/*  86:    */   {
/*  87: 88 */     if (this.l != null) {
/*  88: 89 */       return this.l.a(fi.a(this.k));
/*  89:    */     }
/*  90: 91 */     return fi.a(this.k);
/*  91:    */   }
/*  92:    */   
/*  93:    */   public tk a(tm paramtm)
/*  94:    */   {
/*  95: 95 */     this.l = paramtm;
/*  96: 96 */     return this;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public boolean g()
/* 100:    */   {
/* 101:100 */     return this.m;
/* 102:    */   }
/* 103:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     tk
 * JD-Core Version:    0.7.0.1
 */