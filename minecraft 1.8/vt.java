/*  1:   */ public enum vt
/*  2:   */ {
/*  3:   */   private static final vt[] e;
/*  4:   */   private final int f;
/*  5:   */   private final String g;
/*  6:   */   
/*  7:   */   private vt(int paramInt, String paramString)
/*  8:   */   {
/*  9:14 */     this.f = paramInt;
/* 10:15 */     this.g = paramString;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public int a()
/* 14:   */   {
/* 15:19 */     return this.f;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public static vt a(int paramInt)
/* 19:   */   {
/* 20:23 */     return e[(paramInt % e.length)];
/* 21:   */   }
/* 22:   */   
/* 23:   */   static
/* 24:   */   {
/* 25: 9 */     e = new vt[values().length];
/* 26:27 */     for (vt localvt : values()) {
/* 27:28 */       e[localvt.f] = localvt;
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String b()
/* 32:   */   {
/* 33:33 */     return this.g;
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     vt
 * JD-Core Version:    0.7.0.1
 */