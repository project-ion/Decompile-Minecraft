/*  1:   */ public class aae
/*  2:   */   extends zb
/*  3:   */ {
/*  4:   */   aep a;
/*  5:   */   xm b;
/*  6:   */   
/*  7:   */   public aae(aep paramaep)
/*  8:   */   {
/*  9:12 */     this.a = paramaep;
/* 10:13 */     a(1);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean a()
/* 14:   */   {
/* 15:18 */     xm localxm = this.a.u();
/* 16:19 */     return (this.a.ck() > 0) || ((localxm != null) && (this.a.h(localxm) < 9.0D));
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void c()
/* 20:   */   {
/* 21:24 */     this.a.s().n();
/* 22:25 */     this.b = this.a.u();
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void d()
/* 26:   */   {
/* 27:30 */     this.b = null;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void e()
/* 31:   */   {
/* 32:35 */     if (this.b == null)
/* 33:   */     {
/* 34:36 */       this.a.a(-1);
/* 35:37 */       return;
/* 36:   */     }
/* 37:40 */     if (this.a.h(this.b) > 49.0D)
/* 38:   */     {
/* 39:41 */       this.a.a(-1);
/* 40:42 */       return;
/* 41:   */     }
/* 42:45 */     if (!this.a.t().a(this.b))
/* 43:   */     {
/* 44:46 */       this.a.a(-1);
/* 45:47 */       return;
/* 46:   */     }
/* 47:50 */     this.a.a(1);
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aae
 * JD-Core Version:    0.7.0.1
 */