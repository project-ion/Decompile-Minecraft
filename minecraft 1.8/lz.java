/*  1:   */ public class lz
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   
/*  7:   */   public lz() {}
/*  8:   */   
/*  9:   */   public lz(int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:16 */     this.a = paramInt1;
/* 12:17 */     this.b = paramInt2;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(ls paramls)
/* 16:   */   {
/* 17:22 */     paramls.a(this);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(hd paramhd)
/* 21:   */   {
/* 22:27 */     this.a = paramhd.readByte();
/* 23:28 */     this.b = paramhd.readByte();
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void b(hd paramhd)
/* 27:   */   {
/* 28:33 */     paramhd.writeByte(this.a);
/* 29:34 */     paramhd.writeByte(this.b);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int a()
/* 33:   */   {
/* 34:38 */     return this.a;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int b()
/* 38:   */   {
/* 39:42 */     return this.b;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     lz
 * JD-Core Version:    0.7.0.1
 */