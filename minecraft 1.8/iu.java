/*  1:   */ public class iu
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private dt a;
/*  5:   */   private int b;
/*  6:   */   private fn c;
/*  7:   */   
/*  8:   */   public iu() {}
/*  9:   */   
/* 10:   */   public iu(dt paramdt, int paramInt, fn paramfn)
/* 11:   */   {
/* 12:28 */     this.a = paramdt;
/* 13:29 */     this.b = paramInt;
/* 14:30 */     this.c = paramfn;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(hd paramhd)
/* 18:   */   {
/* 19:35 */     this.a = paramhd.c();
/* 20:36 */     this.b = paramhd.readUnsignedByte();
/* 21:37 */     this.c = paramhd.h();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void b(hd paramhd)
/* 25:   */   {
/* 26:42 */     paramhd.a(this.a);
/* 27:43 */     paramhd.writeByte((byte)this.b);
/* 28:44 */     paramhd.a(this.c);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ik paramik)
/* 32:   */   {
/* 33:49 */     paramik.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public dt a()
/* 37:   */   {
/* 38:53 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int b()
/* 42:   */   {
/* 43:57 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public fn c()
/* 47:   */   {
/* 48:61 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     iu
 * JD-Core Version:    0.7.0.1
 */