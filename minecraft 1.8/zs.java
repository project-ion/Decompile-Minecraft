/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class zs
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private acq a;
/*  7:   */   private agp b;
/*  8:   */   private int c;
/*  9:   */   
/* 10:   */   public zs(acq paramacq)
/* 11:   */   {
/* 12:15 */     this.a = paramacq;
/* 13:16 */     a(3);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean a()
/* 17:   */   {
/* 18:21 */     if (!this.a.o.w()) {
/* 19:22 */       return false;
/* 20:   */     }
/* 21:24 */     if (this.a.bb().nextInt(8000) != 0) {
/* 22:25 */       return false;
/* 23:   */     }
/* 24:27 */     this.b = ((agp)this.a.o.a(agp.class, this.a.aQ().b(6.0D, 2.0D, 6.0D), this.a));
/* 25:28 */     return this.b != null;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public boolean b()
/* 29:   */   {
/* 30:33 */     return this.c > 0;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void c()
/* 34:   */   {
/* 35:38 */     this.c = 400;
/* 36:39 */     this.a.a(true);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void d()
/* 40:   */   {
/* 41:44 */     this.a.a(false);
/* 42:45 */     this.b = null;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void e()
/* 46:   */   {
/* 47:50 */     this.a.p().a(this.b, 30.0F, 30.0F);
/* 48:51 */     this.c -= 1;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zs
 * JD-Core Version:    0.7.0.1
 */