/*  1:   */ public class ark
/*  2:   */   implements Comparable
/*  3:   */ {
/*  4:   */   private static long d;
/*  5:   */   private final atr e;
/*  6:   */   public final dt a;
/*  7:   */   public long b;
/*  8:   */   public int c;
/*  9:12 */   private long f = d++;
/* 10:   */   
/* 11:   */   public ark(dt paramdt, atr paramatr)
/* 12:   */   {
/* 13:15 */     this.a = paramdt;
/* 14:16 */     this.e = paramatr;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean equals(Object paramObject)
/* 18:   */   {
/* 19:20 */     if ((paramObject instanceof ark))
/* 20:   */     {
/* 21:21 */       ark localark = (ark)paramObject;
/* 22:22 */       return (this.a.equals(localark.a)) && (atr.a(this.e, localark.e));
/* 23:   */     }
/* 24:24 */     return false;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public int hashCode()
/* 28:   */   {
/* 29:28 */     return this.a.hashCode();
/* 30:   */   }
/* 31:   */   
/* 32:   */   public ark a(long paramLong)
/* 33:   */   {
/* 34:32 */     this.b = paramLong;
/* 35:33 */     return this;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void a(int paramInt)
/* 39:   */   {
/* 40:37 */     this.c = paramInt;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int a(ark paramark)
/* 44:   */   {
/* 45:42 */     if (this.b < paramark.b) {
/* 46:43 */       return -1;
/* 47:   */     }
/* 48:45 */     if (this.b > paramark.b) {
/* 49:46 */       return 1;
/* 50:   */     }
/* 51:48 */     if (this.c != paramark.c) {
/* 52:49 */       return this.c - paramark.c;
/* 53:   */     }
/* 54:51 */     if (this.f < paramark.f) {
/* 55:52 */       return -1;
/* 56:   */     }
/* 57:54 */     if (this.f > paramark.f) {
/* 58:55 */       return 1;
/* 59:   */     }
/* 60:57 */     return 0;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String toString()
/* 64:   */   {
/* 65:61 */     return atr.a(this.e) + ": " + this.a + ", " + this.b + ", " + this.c + ", " + this.f;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public atr a()
/* 69:   */   {
/* 70:65 */     return this.e;
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ark
 * JD-Core Version:    0.7.0.1
 */