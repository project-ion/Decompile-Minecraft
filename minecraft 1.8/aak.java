/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class aak
/*  4:   */   extends aaw
/*  5:   */ {
/*  6:   */   acq a;
/*  7:   */   xm b;
/*  8:   */   
/*  9:   */   public aak(acq paramacq)
/* 10:   */   {
/* 11:12 */     super(paramacq, false, true);
/* 12:13 */     this.a = paramacq;
/* 13:14 */     a(1);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean a()
/* 17:   */   {
/* 18:19 */     abi localabi = this.a.n();
/* 19:20 */     if (localabi == null) {
/* 20:21 */       return false;
/* 21:   */     }
/* 22:23 */     this.b = localabi.b(this.a);
/* 23:24 */     if (!a(this.b, false))
/* 24:   */     {
/* 25:26 */       if (this.e.bb().nextInt(20) == 0)
/* 26:   */       {
/* 27:27 */         this.b = localabi.c(this.a);
/* 28:28 */         return a(this.b, false);
/* 29:   */       }
/* 30:30 */       return false;
/* 31:   */     }
/* 32:32 */     return true;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void c()
/* 36:   */   {
/* 37:38 */     this.a.d(this.b);
/* 38:39 */     super.c();
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aak
 * JD-Core Version:    0.7.0.1
 */