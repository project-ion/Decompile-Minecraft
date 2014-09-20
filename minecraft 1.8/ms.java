/*  1:   */ public class ms
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   
/*  6:   */   public ms() {}
/*  7:   */   
/*  8:   */   public ms(int paramInt)
/*  9:   */   {
/* 10:15 */     this.a = paramInt;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(hd paramhd)
/* 14:   */   {
/* 15:20 */     this.a = paramhd.readShort();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void b(hd paramhd)
/* 19:   */   {
/* 20:25 */     paramhd.writeShort(this.a);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(ls paramls)
/* 24:   */   {
/* 25:30 */     paramls.a(this);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public int a()
/* 29:   */   {
/* 30:34 */     return this.a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ms
 * JD-Core Version:    0.7.0.1
 */