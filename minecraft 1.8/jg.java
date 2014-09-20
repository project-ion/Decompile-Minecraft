/*  1:   */ public class jg
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   
/*  8:   */   public jg() {}
/*  9:   */   
/* 10:   */   public jg(int paramInt1, int paramInt2, int paramInt3)
/* 11:   */   {
/* 12:19 */     this.a = paramInt1;
/* 13:20 */     this.b = paramInt2;
/* 14:21 */     this.c = paramInt3;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(ik paramik)
/* 18:   */   {
/* 19:26 */     paramik.a(this);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(hd paramhd)
/* 23:   */   {
/* 24:31 */     this.a = paramhd.readUnsignedByte();
/* 25:32 */     this.b = paramhd.readShort();
/* 26:33 */     this.c = paramhd.readShort();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void b(hd paramhd)
/* 30:   */   {
/* 31:39 */     paramhd.writeByte(this.a);
/* 32:40 */     paramhd.writeShort(this.b);
/* 33:41 */     paramhd.writeShort(this.c);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a()
/* 37:   */   {
/* 38:45 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int b()
/* 42:   */   {
/* 43:49 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int c()
/* 47:   */   {
/* 48:53 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     jg
 * JD-Core Version:    0.7.0.1
 */