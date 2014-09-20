/*  1:   */ public class la
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private amj c;
/*  7:   */   
/*  8:   */   public la() {}
/*  9:   */   
/* 10:   */   public la(int paramInt1, int paramInt2, amj paramamj)
/* 11:   */   {
/* 12:18 */     this.a = paramInt1;
/* 13:19 */     this.b = paramInt2;
/* 14:20 */     this.c = (paramamj == null ? null : paramamj.k());
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(hd paramhd)
/* 18:   */   {
/* 19:25 */     this.a = paramhd.e();
/* 20:26 */     this.b = paramhd.readShort();
/* 21:27 */     this.c = paramhd.i();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void b(hd paramhd)
/* 25:   */   {
/* 26:32 */     paramhd.b(this.a);
/* 27:33 */     paramhd.writeShort(this.b);
/* 28:34 */     paramhd.a(this.c);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ik paramik)
/* 32:   */   {
/* 33:39 */     paramik.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public amj a()
/* 37:   */   {
/* 38:43 */     return this.c;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int b()
/* 42:   */   {
/* 43:47 */     return this.a;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int c()
/* 47:   */   {
/* 48:51 */     return this.b;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     la
 * JD-Core Version:    0.7.0.1
 */