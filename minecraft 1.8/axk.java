/*   1:    */ public enum axk
/*   2:    */   implements va
/*   3:    */ {
/*   4:    */   private static final axk[] i;
/*   5:    */   private final int j;
/*   6:    */   private final String k;
/*   7:    */   private final ej l;
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11:260 */     i = new axk[values().length];
/*  12:262 */     for (axk localaxk : values()) {
/*  13:263 */       i[localaxk.a()] = localaxk;
/*  14:    */     }
/*  15:    */   }
/*  16:    */   
/*  17:    */   private axk(int paramInt, String paramString, ej paramej)
/*  18:    */   {
/*  19:268 */     this.j = paramInt;
/*  20:269 */     this.k = paramString;
/*  21:270 */     this.l = paramej;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a()
/*  25:    */   {
/*  26:274 */     return this.j;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public ej c()
/*  30:    */   {
/*  31:282 */     return this.l;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String toString()
/*  35:    */   {
/*  36:287 */     return this.k;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static axk a(int paramInt)
/*  40:    */   {
/*  41:291 */     if ((paramInt < 0) || (paramInt >= i.length)) {
/*  42:292 */       paramInt = 0;
/*  43:    */     }
/*  44:294 */     return i[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public static axk a(ej paramej1, ej paramej2)
/*  48:    */   {
/*  49:298 */     switch (axj.a[paramej1.ordinal()])
/*  50:    */     {
/*  51:    */     case 1: 
/*  52:300 */       switch (axj.c[paramej2.k().ordinal()])
/*  53:    */       {
/*  54:    */       case 1: 
/*  55:302 */         return a;
/*  56:    */       case 2: 
/*  57:304 */         return h;
/*  58:    */       }
/*  59:306 */       throw new IllegalArgumentException("Invalid entityFacing " + paramej2 + " for facing " + paramej1);
/*  60:    */     case 2: 
/*  61:309 */       switch (axj.c[paramej2.k().ordinal()])
/*  62:    */       {
/*  63:    */       case 1: 
/*  64:311 */         return g;
/*  65:    */       case 2: 
/*  66:313 */         return f;
/*  67:    */       }
/*  68:315 */       throw new IllegalArgumentException("Invalid entityFacing " + paramej2 + " for facing " + paramej1);
/*  69:    */     case 3: 
/*  70:318 */       return e;
/*  71:    */     case 4: 
/*  72:320 */       return d;
/*  73:    */     case 5: 
/*  74:322 */       return c;
/*  75:    */     case 6: 
/*  76:324 */       return b;
/*  77:    */     }
/*  78:327 */     throw new IllegalArgumentException("Invalid facing: " + paramej1);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String l()
/*  82:    */   {
/*  83:332 */     return this.k;
/*  84:    */   }
/*  85:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axk
 * JD-Core Version:    0.7.0.1
 */