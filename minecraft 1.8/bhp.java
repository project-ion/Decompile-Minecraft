/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public abstract class bhp
/*  4:   */ {
/*  5:   */   private final boolean a;
/*  6:   */   
/*  7:   */   public bhp()
/*  8:   */   {
/*  9:14 */     this(false);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public bhp(boolean paramBoolean)
/* 13:   */   {
/* 14:18 */     this.a = paramBoolean;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public abstract boolean b(aqu paramaqu, Random paramRandom, dt paramdt);
/* 18:   */   
/* 19:   */   public void e() {}
/* 20:   */   
/* 21:   */   protected void a(aqu paramaqu, dt paramdt, atr paramatr)
/* 22:   */   {
/* 23:29 */     a(paramaqu, paramdt, paramatr, 0);
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected void a(aqu paramaqu, dt paramdt, atr paramatr, int paramInt)
/* 27:   */   {
/* 28:34 */     a(paramaqu, paramdt, paramatr.a(paramInt));
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected void a(aqu paramaqu, dt paramdt, bec parambec)
/* 32:   */   {
/* 33:38 */     if (this.a) {
/* 34:39 */       paramaqu.a(paramdt, parambec, 3);
/* 35:   */     } else {
/* 36:41 */       paramaqu.a(paramdt, parambec, 2);
/* 37:   */     }
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhp
 * JD-Core Version:    0.7.0.1
 */