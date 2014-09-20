/*  1:   */ public class bqd
/*  2:   */ {
/*  3:   */   private byte a;
/*  4:   */   private byte b;
/*  5:   */   private byte c;
/*  6:   */   private byte d;
/*  7:   */   
/*  8:   */   public bqd(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
/*  9:   */   {
/* 10:10 */     this.a = paramByte1;
/* 11:11 */     this.b = paramByte2;
/* 12:12 */     this.c = paramByte3;
/* 13:13 */     this.d = paramByte4;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public bqd(bqd parambqd)
/* 17:   */   {
/* 18:17 */     this.a = parambqd.a;
/* 19:18 */     this.b = parambqd.b;
/* 20:19 */     this.c = parambqd.c;
/* 21:20 */     this.d = parambqd.d;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public byte a()
/* 25:   */   {
/* 26:24 */     return this.a;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public byte b()
/* 30:   */   {
/* 31:32 */     return this.b;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public byte c()
/* 35:   */   {
/* 36:40 */     return this.c;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public byte d()
/* 40:   */   {
/* 41:48 */     return this.d;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public boolean equals(Object paramObject)
/* 45:   */   {
/* 46:57 */     if (this == paramObject) {
/* 47:58 */       return true;
/* 48:   */     }
/* 49:60 */     if (!(paramObject instanceof bqd)) {
/* 50:61 */       return false;
/* 51:   */     }
/* 52:64 */     bqd localbqd = (bqd)paramObject;
/* 53:66 */     if (this.a != localbqd.a) {
/* 54:67 */       return false;
/* 55:   */     }
/* 56:69 */     if (this.d != localbqd.d) {
/* 57:70 */       return false;
/* 58:   */     }
/* 59:72 */     if (this.b != localbqd.b) {
/* 60:73 */       return false;
/* 61:   */     }
/* 62:75 */     if (this.c != localbqd.c) {
/* 63:76 */       return false;
/* 64:   */     }
/* 65:79 */     return true;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public int hashCode()
/* 69:   */   {
/* 70:84 */     int i = this.a;
/* 71:85 */     i = 31 * i + this.b;
/* 72:86 */     i = 31 * i + this.c;
/* 73:87 */     i = 31 * i + this.d;
/* 74:88 */     return i;
/* 75:   */   }
/* 76:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bqd
 * JD-Core Version:    0.7.0.1
 */