/*  1:   */ public class bbo
/*  2:   */   extends atr
/*  3:   */ {
/*  4:   */   protected boolean Q;
/*  5:   */   
/*  6:   */   protected bbo(bof parambof, boolean paramBoolean)
/*  7:   */   {
/*  8:12 */     super(parambof);
/*  9:13 */     this.Q = paramBoolean;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean c()
/* 13:   */   {
/* 14:18 */     return false;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a(ard paramard, dt paramdt, ej paramej)
/* 18:   */   {
/* 19:23 */     if ((!this.Q) && (paramard.p(paramdt).c() == this)) {
/* 20:24 */       return false;
/* 21:   */     }
/* 22:27 */     return super.a(paramard, paramdt, paramej);
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbo
 * JD-Core Version:    0.7.0.1
 */