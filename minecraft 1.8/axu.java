/*   1:    */ public enum axu
/*   2:    */   implements va
/*   3:    */ {
/*   4:    */   private static final axu[] g;
/*   5:    */   private final int h;
/*   6:    */   private final String i;
/*   7:    */   private final String j;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:144 */     g = new axu[values().length];
/*  12:146 */     for (axu localaxu : values()) {
/*  13:147 */       g[localaxu.a()] = localaxu;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private axu(int paramInt, String paramString)
/*  18:    */   {
/*  19:152 */     this(paramInt, paramString, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   private axu(int paramInt, String paramString1, String paramString2)
/*  23:    */   {
/*  24:156 */     this.h = paramInt;
/*  25:157 */     this.i = paramString1;
/*  26:158 */     this.j = paramString2;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a()
/*  30:    */   {
/*  31:162 */     return this.h;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36:171 */     return this.i;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static axu a(int paramInt)
/*  40:    */   {
/*  41:175 */     if ((paramInt < 0) || (paramInt >= g.length)) {
/*  42:176 */       paramInt = 0;
/*  43:    */     }
/*  44:178 */     return g[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String l()
/*  48:    */   {
/*  49:183 */     return this.i;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String c()
/*  53:    */   {
/*  54:187 */     return this.j;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public static axu a(bec parambec)
/*  58:    */   {
/*  59:193 */     for (axu localaxu : ) {
/*  60:194 */       if (parambec == localaxu.d()) {
/*  61:195 */         return localaxu;
/*  62:    */       }
/*  63:    */     }
/*  64:199 */     return a;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public abstract bec d();
/*  68:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axu
 * JD-Core Version:    0.7.0.1
 */