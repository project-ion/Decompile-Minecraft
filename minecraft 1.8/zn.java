/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public abstract class zn
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private final xu c;
/*  7:   */   private final double d;
/*  8:   */   protected int a;
/*  9:   */   private int e;
/* 10:   */   private int f;
/* 11:19 */   protected dt b = dt.a;
/* 12:   */   private boolean g;
/* 13:   */   private int h;
/* 14:   */   
/* 15:   */   public zn(xu paramxu, double paramDouble, int paramInt)
/* 16:   */   {
/* 17:25 */     this.c = paramxu;
/* 18:26 */     this.d = paramDouble;
/* 19:27 */     this.h = paramInt;
/* 20:28 */     a(5);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean a()
/* 24:   */   {
/* 25:33 */     if (this.a > 0)
/* 26:   */     {
/* 27:34 */       this.a -= 1;
/* 28:35 */       return false;
/* 29:   */     }
/* 30:37 */     this.a = (200 + this.c.bb().nextInt(200));
/* 31:38 */     return g();
/* 32:   */   }
/* 33:   */   
/* 34:   */   public boolean b()
/* 35:   */   {
/* 36:43 */     return (this.e >= -this.f) && (this.e <= 1200) && (a(this.c.o, this.b));
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void c()
/* 40:   */   {
/* 41:48 */     this.c.s().a(this.b.n() + 0.5D, this.b.o() + 1, this.b.p() + 0.5D, this.d);
/* 42:49 */     this.e = 0;
/* 43:50 */     this.f = (this.c.bb().nextInt(this.c.bb().nextInt(1200) + 1200) + 1200);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void d() {}
/* 47:   */   
/* 48:   */   public void e()
/* 49:   */   {
/* 50:59 */     if (this.c.c(this.b.a()) > 1.0D)
/* 51:   */     {
/* 52:60 */       this.g = false;
/* 53:61 */       this.e += 1;
/* 54:62 */       if (this.e % 40 == 0) {
/* 55:63 */         this.c.s().a(this.b.n() + 0.5D, this.b.o() + 1, this.b.p() + 0.5D, this.d);
/* 56:   */       }
/* 57:   */     }
/* 58:   */     else
/* 59:   */     {
/* 60:66 */       this.g = true;
/* 61:67 */       this.e -= 1;
/* 62:   */     }
/* 63:   */   }
/* 64:   */   
/* 65:   */   protected boolean f()
/* 66:   */   {
/* 67:72 */     return this.g;
/* 68:   */   }
/* 69:   */   
/* 70:   */   private boolean g()
/* 71:   */   {
/* 72:76 */     int i = this.h;
/* 73:77 */     int j = 1;
/* 74:78 */     dt localdt1 = new dt(this.c);
/* 75:80 */     for (int k = 0; k <= 1; k = k > 0 ? -k : 1 - k) {
/* 76:81 */       for (int m = 0; m < i; m++) {
/* 77:82 */         for (int n = 0; n <= m; n = n > 0 ? -n : 1 - n) {
/* 78:84 */           for (int i1 = (n < m) && (n > -m) ? m : 0; i1 <= m; i1 = i1 > 0 ? -i1 : 1 - i1)
/* 79:   */           {
/* 80:86 */             dt localdt2 = localdt1.a(n, k - 1, i1);
/* 81:87 */             if ((this.c.d(localdt2)) && (a(this.c.o, localdt2)))
/* 82:   */             {
/* 83:88 */               this.b = localdt2;
/* 84:89 */               return true;
/* 85:   */             }
/* 86:   */           }
/* 87:   */         }
/* 88:   */       }
/* 89:   */     }
/* 90:96 */     return false;
/* 91:   */   }
/* 92:   */   
/* 93:   */   protected abstract boolean a(aqu paramaqu, dt paramdt);
/* 94:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zn
 * JD-Core Version:    0.7.0.1
 */