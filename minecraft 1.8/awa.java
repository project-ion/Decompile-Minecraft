/*   1:    */ import com.google.common.collect.Collections2;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import java.util.Collection;
/*   4:    */ 
/*   5:    */ public enum awa
/*   6:    */   implements va
/*   7:    */ {
/*   8:    */   private static final awa[][] k;
/*   9:    */   private final awc l;
/*  10:    */   private final int m;
/*  11:    */   private final String n;
/*  12:    */   private final String o;
/*  13:    */   
/*  14:    */   static
/*  15:    */   {
/*  16:103 */     k = new awa[awc.values().length][];
/*  17:105 */     for (awc localawc : awc.values())
/*  18:    */     {
/*  19:106 */       Collection localCollection = Collections2.filter(Lists.newArrayList(values()), new awb(localawc));
/*  20:    */       
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25:    */ 
/*  26:113 */       k[localawc.ordinal()] = ((awa[])localCollection.toArray(new awa[localCollection.size()]));
/*  27:    */     }
/*  28:    */   }
/*  29:    */   
/*  30:    */   private awa(awc paramawc, int paramInt, String paramString)
/*  31:    */   {
/*  32:118 */     this(paramawc, paramInt, paramString, paramString);
/*  33:    */   }
/*  34:    */   
/*  35:    */   private awa(awc paramawc, int paramInt, String paramString1, String paramString2)
/*  36:    */   {
/*  37:122 */     this.l = paramawc;
/*  38:123 */     this.m = paramInt;
/*  39:124 */     this.n = paramString1;
/*  40:125 */     this.o = paramString2;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public awc a()
/*  44:    */   {
/*  45:129 */     return this.l;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public int b()
/*  49:    */   {
/*  50:133 */     return this.m;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public static awa a(awc paramawc, int paramInt)
/*  54:    */   {
/*  55:141 */     awa[] arrayOfawa = k[paramawc.ordinal()];
/*  56:142 */     if ((paramInt < 0) || (paramInt >= arrayOfawa.length)) {
/*  57:143 */       paramInt = 0;
/*  58:    */     }
/*  59:145 */     return arrayOfawa[paramInt];
/*  60:    */   }
/*  61:    */   
/*  62:    */   public static awa[] a(awc paramawc)
/*  63:    */   {
/*  64:149 */     return k[paramawc.ordinal()];
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String toString()
/*  68:    */   {
/*  69:154 */     return this.n;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String l()
/*  73:    */   {
/*  74:159 */     return this.n;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String d()
/*  78:    */   {
/*  79:163 */     return this.o;
/*  80:    */   }
/*  81:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     awa
 * JD-Core Version:    0.7.0.1
 */