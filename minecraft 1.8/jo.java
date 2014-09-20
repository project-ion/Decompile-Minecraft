/*  1:   */ public class jo
/*  2:   */   implements id
/*  3:   */ {
/*  4:26 */   public static final String[] a = { "tile.bed.notValid" };
/*  5:   */   private int b;
/*  6:   */   private float c;
/*  7:   */   
/*  8:   */   public jo() {}
/*  9:   */   
/* 10:   */   public jo(int paramInt, float paramFloat)
/* 11:   */   {
/* 12:38 */     this.b = paramInt;
/* 13:39 */     this.c = paramFloat;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(hd paramhd)
/* 17:   */   {
/* 18:44 */     this.b = paramhd.readUnsignedByte();
/* 19:45 */     this.c = paramhd.readFloat();
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void b(hd paramhd)
/* 23:   */   {
/* 24:50 */     paramhd.writeByte(this.b);
/* 25:51 */     paramhd.writeFloat(this.c);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(ik paramik)
/* 29:   */   {
/* 30:56 */     paramik.a(this);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public int a()
/* 34:   */   {
/* 35:60 */     return this.b;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public float b()
/* 39:   */   {
/* 40:64 */     return this.c;
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     jo
 * JD-Core Version:    0.7.0.1
 */