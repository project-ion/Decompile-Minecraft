/*   1:    */ public class yz
/*   2:    */   extends zb
/*   3:    */ {
/*   4:    */   private xx d;
/*   5:    */   private xm e;
/*   6:    */   aqu a;
/*   7:    */   private double f;
/*   8:    */   private aaz g;
/*   9:    */   private int h;
/*  10:    */   float b;
/*  11:    */   float c;
/*  12:    */   private boolean i;
/*  13:    */   
/*  14:    */   public yz(xx paramxx, double paramDouble, float paramFloat1, float paramFloat2)
/*  15:    */   {
/*  16: 25 */     this.d = paramxx;
/*  17: 26 */     this.a = paramxx.o;
/*  18: 27 */     this.f = paramDouble;
/*  19: 28 */     this.g = paramxx.s();
/*  20: 29 */     this.c = paramFloat1;
/*  21: 30 */     this.b = paramFloat2;
/*  22: 31 */     a(3);
/*  23: 33 */     if (!(paramxx.s() instanceof aay)) {
/*  24: 34 */       throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean a()
/*  29:    */   {
/*  30: 40 */     xm localxm = this.d.cm();
/*  31: 41 */     if (localxm == null) {
/*  32: 42 */       return false;
/*  33:    */     }
/*  34: 44 */     if (this.d.cl()) {
/*  35: 45 */       return false;
/*  36:    */     }
/*  37: 47 */     if (this.d.h(localxm) < this.c * this.c) {
/*  38: 48 */       return false;
/*  39:    */     }
/*  40: 50 */     this.e = localxm;
/*  41: 51 */     return true;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean b()
/*  45:    */   {
/*  46: 56 */     return (!this.g.m()) && (this.d.h(this.e) > this.b * this.b) && (!this.d.cl());
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void c()
/*  50:    */   {
/*  51: 61 */     this.h = 0;
/*  52: 62 */     this.i = ((aay)this.d.s()).e();
/*  53: 63 */     ((aay)this.d.s()).a(false);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void d()
/*  57:    */   {
/*  58: 68 */     this.e = null;
/*  59: 69 */     this.g.n();
/*  60: 70 */     ((aay)this.d.s()).a(true);
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void e()
/*  64:    */   {
/*  65: 75 */     this.d.p().a(this.e, 10.0F, this.d.bP());
/*  66: 76 */     if (this.d.cl()) {
/*  67: 77 */       return;
/*  68:    */     }
/*  69: 80 */     if (--this.h > 0) {
/*  70: 81 */       return;
/*  71:    */     }
/*  72: 83 */     this.h = 10;
/*  73: 85 */     if (this.g.a(this.e, this.f)) {
/*  74: 86 */       return;
/*  75:    */     }
/*  76: 88 */     if (this.d.cb()) {
/*  77: 89 */       return;
/*  78:    */     }
/*  79: 91 */     if (this.d.h(this.e) < 144.0D) {
/*  80: 92 */       return;
/*  81:    */     }
/*  82: 96 */     int j = uv.c(this.e.s) - 2;
/*  83: 97 */     int k = uv.c(this.e.u) - 2;
/*  84: 98 */     int m = uv.c(this.e.aQ().b);
/*  85: 99 */     for (int n = 0; n <= 4; n++) {
/*  86:100 */       for (int i1 = 0; i1 <= 4; i1++) {
/*  87:101 */         if ((n < 1) || (i1 < 1) || (n > 3) || (i1 > 3)) {
/*  88:104 */           if ((aqu.a(this.a, new dt(j + n, m - 1, k + i1))) && (!this.a.p(new dt(j + n, m, k + i1)).c().d()) && (!this.a.p(new dt(j + n, m + 1, k + i1)).c().d()))
/*  89:    */           {
/*  90:105 */             this.d.b(j + n + 0.5F, m, k + i1 + 0.5F, this.d.y, this.d.z);
/*  91:106 */             this.g.n();
/*  92:107 */             return;
/*  93:    */           }
/*  94:    */         }
/*  95:    */       }
/*  96:    */     }
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     yz
 * JD-Core Version:    0.7.0.1
 */