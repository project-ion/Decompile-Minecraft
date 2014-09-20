/*  1:   */ public class jb
/*  2:   */ {
/*  3:   */   private final short b;
/*  4:   */   private final bec c;
/*  5:   */   
/*  6:   */   public jb(ja paramja, short paramShort, bec parambec)
/*  7:   */   {
/*  8:65 */     this.b = paramShort;
/*  9:66 */     this.c = parambec;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public jb(ja paramja, short paramShort, bfh parambfh)
/* 13:   */   {
/* 14:70 */     this.b = paramShort;
/* 15:71 */     this.c = parambfh.g(a());
/* 16:   */   }
/* 17:   */   
/* 18:   */   public dt a()
/* 19:   */   {
/* 20:75 */     return new dt(ja.a(this.a).a(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
/* 21:   */   }
/* 22:   */   
/* 23:   */   public short b()
/* 24:   */   {
/* 25:79 */     return this.b;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public bec c()
/* 29:   */   {
/* 30:83 */     return this.c;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     jb
 * JD-Core Version:    0.7.0.1
 */