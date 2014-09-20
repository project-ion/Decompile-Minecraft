/*   1:    */ public enum ayx
/*   2:    */   implements va
/*   3:    */ {
/*   4:    */   private static final ayx[] g;
/*   5:    */   private final int h;
/*   6:    */   private final String i;
/*   7:    */   private final String j;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 66 */     g = new ayx[values().length];
/*  12: 68 */     for (ayx localayx : values()) {
/*  13: 69 */       g[localayx.a()] = localayx;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private ayx(int paramInt, String paramString)
/*  18:    */   {
/*  19: 74 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private ayx(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24: 78 */     this.h = paramInt;
/*  25: 79 */     this.i = paramString1;
/*  26: 80 */     this.j = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a()
/*  30:    */   {
/*  31: 84 */     return this.h;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36: 93 */     return this.i;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static ayx a(int paramInt)
/*  40:    */   {
/*  41: 97 */     if ((paramInt < 0) || (paramInt >= g.length)) {
/*  42: 98 */       paramInt = 0;
/*  43:    */     }
/*  44:100 */     return g[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String l()
/*  48:    */   {
/*  49:105 */     return this.i;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String c()
/*  53:    */   {
/*  54:109 */     return this.j;
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayx
 * JD-Core Version:    0.7.0.1
 */