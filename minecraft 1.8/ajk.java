/*   1:    */ public class ajk
/*   2:    */ {
/*   3:    */   private final int a;
/*   4:    */   public final vq d;
/*   5:    */   public int e;
/*   6:    */   public int f;
/*   7:    */   public int g;
/*   8:    */   
/*   9:    */   public ajk(vq paramvq, int paramInt1, int paramInt2, int paramInt3)
/*  10:    */   {
/*  11: 17 */     this.d = paramvq;
/*  12: 18 */     this.a = paramInt1;
/*  13: 19 */     this.f = paramInt2;
/*  14: 20 */     this.g = paramInt3;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(amj paramamj1, amj paramamj2)
/*  18:    */   {
/*  19: 24 */     if ((paramamj1 == null) || (paramamj2 == null)) {
/*  20: 25 */       return;
/*  21:    */     }
/*  22: 27 */     if (paramamj1.b() != paramamj2.b()) {
/*  23: 28 */       return;
/*  24:    */     }
/*  25: 30 */     int i = paramamj2.b - paramamj1.b;
/*  26: 31 */     if (i > 0) {
/*  27: 32 */       a(paramamj1, i);
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected void a(amj paramamj, int paramInt) {}
/*  32:    */   
/*  33:    */   protected void c(amj paramamj) {}
/*  34:    */   
/*  35:    */   public void a(ahd paramahd, amj paramamj)
/*  36:    */   {
/*  37: 65 */     f();
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean a(amj paramamj)
/*  41:    */   {
/*  42: 69 */     return true;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public amj d()
/*  46:    */   {
/*  47: 73 */     return this.d.a(this.a);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean e()
/*  51:    */   {
/*  52: 77 */     return d() != null;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void d(amj paramamj)
/*  56:    */   {
/*  57: 81 */     this.d.a(this.a, paramamj);
/*  58: 82 */     f();
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void f()
/*  62:    */   {
/*  63: 86 */     this.d.o_();
/*  64:    */   }
/*  65:    */   
/*  66:    */   public int a()
/*  67:    */   {
/*  68: 90 */     return this.d.p_();
/*  69:    */   }
/*  70:    */   
/*  71:    */   public int b(amj paramamj)
/*  72:    */   {
/*  73: 94 */     return a();
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String c()
/*  77:    */   {
/*  78: 99 */     return null;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public amj a(int paramInt)
/*  82:    */   {
/*  83:103 */     return this.d.a(this.a, paramInt);
/*  84:    */   }
/*  85:    */   
/*  86:    */   public boolean a(vq paramvq, int paramInt)
/*  87:    */   {
/*  88:107 */     return (paramvq == this.d) && (paramInt == this.a);
/*  89:    */   }
/*  90:    */   
/*  91:    */   public boolean a(ahd paramahd)
/*  92:    */   {
/*  93:111 */     return true;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean b()
/*  97:    */   {
/*  98:115 */     return true;
/*  99:    */   }
/* 100:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajk
 * JD-Core Version:    0.7.0.1
 */