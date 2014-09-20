/*  1:   */ public class bmr
/*  2:   */   extends bqc
/*  3:   */ {
/*  4:   */   private fn b;
/*  5:   */   
/*  6:   */   public bmr(String paramString)
/*  7:   */   {
/*  8:11 */     super(paramString);
/*  9:12 */     this.b = new fn();
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(fn paramfn)
/* 13:   */   {
/* 14:17 */     this.b = paramfn.m("Features");
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void b(fn paramfn)
/* 18:   */   {
/* 19:22 */     paramfn.a("Features", this.b);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(fn paramfn, int paramInt1, int paramInt2)
/* 23:   */   {
/* 24:30 */     this.b.a(b(paramInt1, paramInt2), paramfn);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public static String b(int paramInt1, int paramInt2)
/* 28:   */   {
/* 29:34 */     return "[" + paramInt1 + "," + paramInt2 + "]";
/* 30:   */   }
/* 31:   */   
/* 32:   */   public fn a()
/* 33:   */   {
/* 34:38 */     return this.b;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bmr
 * JD-Core Version:    0.7.0.1
 */