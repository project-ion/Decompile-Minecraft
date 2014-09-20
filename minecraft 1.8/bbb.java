/*   1:    */ public enum bbb
/*   2:    */   implements va
/*   3:    */ {
/*   4:    */   private static final bbb[] h;
/*   5:    */   private final int i;
/*   6:    */   private final String j;
/*   7:    */   private final String k;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 78 */     h = new bbb[values().length];
/*  12: 80 */     for (bbb localbbb : values()) {
/*  13: 81 */       h[localbbb.a()] = localbbb;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private bbb(int paramInt, String paramString)
/*  18:    */   {
/*  19: 86 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private bbb(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24: 90 */     this.i = paramInt;
/*  25: 91 */     this.j = paramString1;
/*  26: 92 */     this.k = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a()
/*  30:    */   {
/*  31: 96 */     return this.i;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36:105 */     return this.j;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static bbb a(int paramInt)
/*  40:    */   {
/*  41:109 */     if ((paramInt < 0) || (paramInt >= h.length)) {
/*  42:110 */       paramInt = 0;
/*  43:    */     }
/*  44:112 */     return h[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String l()
/*  48:    */   {
/*  49:117 */     return this.j;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String c()
/*  53:    */   {
/*  54:121 */     return this.k;
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbb
 * JD-Core Version:    0.7.0.1
 */