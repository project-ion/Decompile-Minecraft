/*   1:    */ import java.util.EnumSet;
/*   2:    */ import java.util.Set;
/*   3:    */ 
/*   4:    */ public enum ij
/*   5:    */ {
/*   6:    */   private int f;
/*   7:    */   
/*   8:    */   private ij(int paramInt)
/*   9:    */   {
/*  10: 91 */     this.f = paramInt;
/*  11:    */   }
/*  12:    */   
/*  13:    */   private int a()
/*  14:    */   {
/*  15: 95 */     return 1 << this.f;
/*  16:    */   }
/*  17:    */   
/*  18:    */   private boolean b(int paramInt)
/*  19:    */   {
/*  20: 99 */     return (paramInt & a()) == a();
/*  21:    */   }
/*  22:    */   
/*  23:    */   public static Set a(int paramInt)
/*  24:    */   {
/*  25:103 */     EnumSet localEnumSet = EnumSet.noneOf(ij.class);
/*  26:105 */     for (ij localij : values()) {
/*  27:106 */       if (localij.b(paramInt)) {
/*  28:107 */         localEnumSet.add(localij);
/*  29:    */       }
/*  30:    */     }
/*  31:111 */     return localEnumSet;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static int a(Set paramSet)
/*  35:    */   {
/*  36:115 */     int i = 0;
/*  37:117 */     for (ij localij : paramSet) {
/*  38:118 */       i |= localij.a();
/*  39:    */     }
/*  40:121 */     return i;
/*  41:    */   }
/*  42:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ij
 * JD-Core Version:    0.7.0.1
 */