/*  1:   */ public class mn
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private mo b;
/*  6:   */   private int c;
/*  7:   */   
/*  8:   */   public mn() {}
/*  9:   */   
/* 10:   */   public mn(wv paramwv, mo parammo)
/* 11:   */   {
/* 12:18 */     this(paramwv, parammo, 0);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public mn(wv paramwv, mo parammo, int paramInt)
/* 16:   */   {
/* 17:22 */     this.a = paramwv.F();
/* 18:23 */     this.b = parammo;
/* 19:24 */     this.c = paramInt;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(hd paramhd)
/* 23:   */   {
/* 24:29 */     this.a = paramhd.e();
/* 25:30 */     this.b = ((mo)paramhd.a(mo.class));
/* 26:31 */     this.c = paramhd.e();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void b(hd paramhd)
/* 30:   */   {
/* 31:36 */     paramhd.b(this.a);
/* 32:37 */     paramhd.a(this.b);
/* 33:38 */     paramhd.b(this.c);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(ls paramls)
/* 37:   */   {
/* 38:43 */     paramls.a(this);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public mo b()
/* 42:   */   {
/* 43:51 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int c()
/* 47:   */   {
/* 48:55 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     mn
 * JD-Core Version:    0.7.0.1
 */