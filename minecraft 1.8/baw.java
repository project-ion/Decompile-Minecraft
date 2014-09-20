/*  1:   */ public class baw
/*  2:   */   extends bai
/*  3:   */ {
/*  4:10 */   public static final bew a = bew.a("rotation", 0, 15);
/*  5:   */   
/*  6:   */   public baw()
/*  7:   */   {
/*  8:13 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 12:   */   {
/* 13:18 */     if (!paramaqu.p(paramdt.b()).c().r().a())
/* 14:   */     {
/* 15:19 */       b(paramaqu, paramdt, parambec, 0);
/* 16:20 */       paramaqu.g(paramdt);
/* 17:   */     }
/* 18:23 */     super.a(paramaqu, paramdt, parambec, paramatr);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public bec a(int paramInt)
/* 22:   */   {
/* 23:28 */     return P().a(a, Integer.valueOf(paramInt));
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int c(bec parambec)
/* 27:   */   {
/* 28:34 */     return ((Integer)parambec.b(a)).intValue();
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected bed e()
/* 32:   */   {
/* 33:39 */     return new bed(this, new bex[] { a });
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     baw
 * JD-Core Version:    0.7.0.1
 */