/*  1:   */ public abstract class atg
/*  2:   */   extends atr
/*  3:   */   implements avs
/*  4:   */ {
/*  5:   */   protected atg(bof parambof)
/*  6:   */   {
/*  7:11 */     super(parambof);
/*  8:12 */     this.A = true;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int b()
/* 12:   */   {
/* 13:17 */     return -1;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 17:   */   {
/* 18:22 */     super.b(paramaqu, paramdt, parambec);
/* 19:23 */     paramaqu.t(paramdt);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, int paramInt1, int paramInt2)
/* 23:   */   {
/* 24:28 */     super.a(paramaqu, paramdt, parambec, paramInt1, paramInt2);
/* 25:   */     
/* 26:30 */     bcm localbcm = paramaqu.s(paramdt);
/* 27:31 */     if (localbcm == null) {
/* 28:32 */       return false;
/* 29:   */     }
/* 30:34 */     return localbcm.c(paramInt1, paramInt2);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     atg
 * JD-Core Version:    0.7.0.1
 */