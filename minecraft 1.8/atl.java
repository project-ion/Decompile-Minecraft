/*   1:    */ public enum atl
/*   2:    */   implements va
/*   3:    */ {
/*   4:    */   private static final atl[] k;
/*   5:    */   private final int l;
/*   6:    */   private final String m;
/*   7:    */   
/*   8:    */   static
/*   9:    */   {
/*  10:515 */     k = new atl[values().length];
/*  11:517 */     for (atl localatl : values()) {
/*  12:518 */       k[localatl.a()] = localatl;
/*  13:    */     }
/*  14:    */   }
/*  15:    */   
/*  16:    */   private atl(int paramInt, String paramString)
/*  17:    */   {
/*  18:523 */     this.l = paramInt;
/*  19:524 */     this.m = paramString;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int a()
/*  23:    */   {
/*  24:528 */     return this.l;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String toString()
/*  28:    */   {
/*  29:537 */     return this.m;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public boolean c()
/*  33:    */   {
/*  34:541 */     return (this == e) || (this == c) || (this == f) || (this == d);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public static atl a(int paramInt)
/*  38:    */   {
/*  39:545 */     if ((paramInt < 0) || (paramInt >= k.length)) {
/*  40:546 */       paramInt = 0;
/*  41:    */     }
/*  42:548 */     return k[paramInt];
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String l()
/*  46:    */   {
/*  47:553 */     return this.m;
/*  48:    */   }
/*  49:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     atl
 * JD-Core Version:    0.7.0.1
 */