/*  1:   */ public class aqm
/*  2:   */ {
/*  3:   */   public final int a;
/*  4:   */   public final int b;
/*  5:   */   
/*  6:   */   public aqm(int paramInt1, int paramInt2)
/*  7:   */   {
/*  8:10 */     this.a = paramInt1;
/*  9:11 */     this.b = paramInt2;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public static long a(int paramInt1, int paramInt2)
/* 13:   */   {
/* 14:15 */     return paramInt1 & 0xFFFFFFFF | (paramInt2 & 0xFFFFFFFF) << 32;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int hashCode()
/* 18:   */   {
/* 19:24 */     int i = 1664525 * this.a + 1013904223;
/* 20:25 */     int j = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
/* 21:26 */     return i ^ j;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public boolean equals(Object paramObject)
/* 25:   */   {
/* 26:31 */     if (this == paramObject) {
/* 27:32 */       return true;
/* 28:   */     }
/* 29:35 */     if ((paramObject instanceof aqm))
/* 30:   */     {
/* 31:36 */       aqm localaqm = (aqm)paramObject;
/* 32:   */       
/* 33:38 */       return (this.a == localaqm.a) && (this.b == localaqm.b);
/* 34:   */     }
/* 35:41 */     return false;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public int a()
/* 39:   */   {
/* 40:55 */     return (this.a << 4) + 8;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int b()
/* 44:   */   {
/* 45:59 */     return (this.b << 4) + 8;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int c()
/* 49:   */   {
/* 50:63 */     return this.a << 4;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int d()
/* 54:   */   {
/* 55:67 */     return this.b << 4;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public int e()
/* 59:   */   {
/* 60:71 */     return (this.a << 4) + 15;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public int f()
/* 64:   */   {
/* 65:75 */     return (this.b << 4) + 15;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public dt a(int paramInt1, int paramInt2, int paramInt3)
/* 69:   */   {
/* 70:79 */     return new dt((this.a << 4) + paramInt1, paramInt2, (this.b << 4) + paramInt3);
/* 71:   */   }
/* 72:   */   
/* 73:   */   public dt a(int paramInt)
/* 74:   */   {
/* 75:83 */     return new dt(a(), paramInt, b());
/* 76:   */   }
/* 77:   */   
/* 78:   */   public String toString()
/* 79:   */   {
/* 80:87 */     return "[" + this.a + ", " + this.b + "]";
/* 81:   */   }
/* 82:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aqm
 * JD-Core Version:    0.7.0.1
 */