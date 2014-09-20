/*   1:    */ public enum cyc
/*   2:    */ {
/*   3:    */   private final String c;
/*   4:    */   
/*   5:    */   private cyc(String paramString)
/*   6:    */   {
/*   7: 95 */     this.c = paramString;
/*   8:    */   }
/*   9:    */   
/*  10:    */   public static cyc a(String paramString)
/*  11:    */   {
/*  12: 99 */     for (cyc localcyc : ) {
/*  13:100 */       if (localcyc.c.equals(paramString)) {
/*  14:101 */         return localcyc;
/*  15:    */       }
/*  16:    */     }
/*  17:104 */     return null;
/*  18:    */   }
/*  19:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cyc
 * JD-Core Version:    0.7.0.1
 */