/*  1:   */ public class iv
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private dt a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   private atr d;
/*  8:   */   
/*  9:   */   public iv() {}
/* 10:   */   
/* 11:   */   public iv(dt paramdt, atr paramatr, int paramInt1, int paramInt2)
/* 12:   */   {
/* 13:21 */     this.a = paramdt;
/* 14:22 */     this.b = paramInt1;
/* 15:23 */     this.c = paramInt2;
/* 16:24 */     this.d = paramatr;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(hd paramhd)
/* 20:   */   {
/* 21:29 */     this.a = paramhd.c();
/* 22:30 */     this.b = paramhd.readUnsignedByte();
/* 23:31 */     this.c = paramhd.readUnsignedByte();
/* 24:32 */     this.d = atr.c(paramhd.e() & 0xFFF);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void b(hd paramhd)
/* 28:   */   {
/* 29:37 */     paramhd.a(this.a);
/* 30:38 */     paramhd.writeByte(this.b);
/* 31:39 */     paramhd.writeByte(this.c);
/* 32:40 */     paramhd.b(atr.a(this.d) & 0xFFF);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void a(ik paramik)
/* 36:   */   {
/* 37:45 */     paramik.a(this);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public dt a()
/* 41:   */   {
/* 42:49 */     return this.a;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int b()
/* 46:   */   {
/* 47:53 */     return this.b;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public int c()
/* 51:   */   {
/* 52:57 */     return this.c;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public atr d()
/* 56:   */   {
/* 57:61 */     return this.d;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     iv
 * JD-Core Version:    0.7.0.1
 */