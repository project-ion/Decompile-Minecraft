/*   1:    */ public enum bcj
/*   2:    */ {
/*   3:    */   private String N;
/*   4:    */   private String O;
/*   5:201 */   private String[] P = new String[3];
/*   6:    */   private amj Q;
/*   7:    */   
/*   8:    */   private bcj(String paramString1, String paramString2)
/*   9:    */   {
/*  10:205 */     this.N = paramString1;
/*  11:206 */     this.O = paramString2;
/*  12:    */   }
/*  13:    */   
/*  14:    */   private bcj(String paramString1, String paramString2, amj paramamj)
/*  15:    */   {
/*  16:210 */     this(paramString1, paramString2);
/*  17:211 */     this.Q = paramamj;
/*  18:    */   }
/*  19:    */   
/*  20:    */   private bcj(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
/*  21:    */   {
/*  22:215 */     this(paramString1, paramString2);
/*  23:216 */     this.P[0] = paramString3;
/*  24:217 */     this.P[1] = paramString4;
/*  25:218 */     this.P[2] = paramString5;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String a()
/*  29:    */   {
/*  30:222 */     return this.N;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String b()
/*  34:    */   {
/*  35:226 */     return this.O;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String[] c()
/*  39:    */   {
/*  40:230 */     return this.P;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean d()
/*  44:    */   {
/*  45:234 */     return (this.Q != null) || (this.P[0] != null);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean e()
/*  49:    */   {
/*  50:238 */     return this.Q != null;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public amj f()
/*  54:    */   {
/*  55:242 */     return this.Q;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public static bcj a(String paramString)
/*  59:    */   {
/*  60:247 */     for (bcj localbcj : ) {
/*  61:248 */       if (localbcj.O.equals(paramString)) {
/*  62:249 */         return localbcj;
/*  63:    */       }
/*  64:    */     }
/*  65:252 */     return null;
/*  66:    */   }
/*  67:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcj
 * JD-Core Version:    0.7.0.1
 */