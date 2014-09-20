/*  1:   */ public enum akv
/*  2:   */   implements va
/*  3:   */ {
/*  4:   */   private static final akv[] q;
/*  5:   */   private static final akv[] r;
/*  6:   */   private final int s;
/*  7:   */   private final int t;
/*  8:   */   private final String u;
/*  9:   */   private final String v;
/* 10:   */   private final boh w;
/* 11:   */   private final a x;
/* 12:   */   
/* 13:   */   static
/* 14:   */   {
/* 15:36 */     q = new akv[values().length];
/* 16:37 */     r = new akv[values().length];
/* 17:39 */     for (akv localakv : values())
/* 18:   */     {
/* 19:40 */       q[localakv.a()] = localakv;
/* 20:41 */       r[localakv.b()] = localakv;
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   private akv(int paramInt1, int paramInt2, String paramString1, String paramString2, boh paramboh, a parama)
/* 25:   */   {
/* 26:46 */     this.s = paramInt1;
/* 27:47 */     this.t = paramInt2;
/* 28:48 */     this.u = paramString1;
/* 29:49 */     this.v = paramString2;
/* 30:50 */     this.w = paramboh;
/* 31:51 */     this.x = parama;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int a()
/* 35:   */   {
/* 36:55 */     return this.s;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public int b()
/* 40:   */   {
/* 41:59 */     return this.t;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String d()
/* 45:   */   {
/* 46:67 */     return this.v;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public boh e()
/* 50:   */   {
/* 51:71 */     return this.w;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public static akv a(int paramInt)
/* 55:   */   {
/* 56:79 */     if ((paramInt < 0) || (paramInt >= r.length)) {
/* 57:80 */       paramInt = 0;
/* 58:   */     }
/* 59:82 */     return r[paramInt];
/* 60:   */   }
/* 61:   */   
/* 62:   */   public static akv b(int paramInt)
/* 63:   */   {
/* 64:86 */     if ((paramInt < 0) || (paramInt >= q.length)) {
/* 65:87 */       paramInt = 0;
/* 66:   */     }
/* 67:89 */     return q[paramInt];
/* 68:   */   }
/* 69:   */   
/* 70:   */   public String toString()
/* 71:   */   {
/* 72:94 */     return this.v;
/* 73:   */   }
/* 74:   */   
/* 75:   */   public String l()
/* 76:   */   {
/* 77:99 */     return this.u;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     akv
 * JD-Core Version:    0.7.0.1
 */