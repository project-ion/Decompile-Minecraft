/*   1:    */ public enum axa
/*   2:    */   implements va
/*   3:    */ {
/*   4:    */   private static final axa[] n;
/*   5:    */   private final int o;
/*   6:    */   private final String p;
/*   7:    */   
/*   8:    */   static
/*   9:    */   {
/*  10: 85 */     n = new axa[16];
/*  11: 87 */     for (axa localaxa : values()) {
/*  12: 88 */       n[localaxa.a()] = localaxa;
/*  13:    */     }
/*  14:    */   }
/*  15:    */   
/*  16:    */   private axa(int paramInt, String paramString)
/*  17:    */   {
/*  18: 93 */     this.o = paramInt;
/*  19: 94 */     this.p = paramString;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int a()
/*  23:    */   {
/*  24: 98 */     return this.o;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String toString()
/*  28:    */   {
/*  29:107 */     return this.p;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static axa a(int paramInt)
/*  33:    */   {
/*  34:111 */     if ((paramInt < 0) || (paramInt >= n.length)) {
/*  35:112 */       paramInt = 0;
/*  36:    */     }
/*  37:114 */     axa localaxa = n[paramInt];
/*  38:115 */     return localaxa == null ? n[0] : localaxa;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String l()
/*  42:    */   {
/*  43:120 */     return this.p;
/*  44:    */   }
/*  45:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axa
 * JD-Core Version:    0.7.0.1
 */