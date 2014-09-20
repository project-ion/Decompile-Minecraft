/*  1:   */ public class jt
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private dt b;
/*  6:   */   private int c;
/*  7:   */   private boolean d;
/*  8:   */   
/*  9:   */   public jt() {}
/* 10:   */   
/* 11:   */   public jt(int paramInt1, dt paramdt, int paramInt2, boolean paramBoolean)
/* 12:   */   {
/* 13:21 */     this.a = paramInt1;
/* 14:22 */     this.b = paramdt;
/* 15:23 */     this.c = paramInt2;
/* 16:24 */     this.d = paramBoolean;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(hd paramhd)
/* 20:   */   {
/* 21:29 */     this.a = paramhd.readInt();
/* 22:30 */     this.b = paramhd.c();
/* 23:31 */     this.c = paramhd.readInt();
/* 24:32 */     this.d = paramhd.readBoolean();
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void b(hd paramhd)
/* 28:   */   {
/* 29:37 */     paramhd.writeInt(this.a);
/* 30:38 */     paramhd.a(this.b);
/* 31:39 */     paramhd.writeInt(this.c);
/* 32:40 */     paramhd.writeBoolean(this.d);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void a(ik paramik)
/* 36:   */   {
/* 37:45 */     paramik.a(this);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public boolean a()
/* 41:   */   {
/* 42:49 */     return this.d;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int b()
/* 46:   */   {
/* 47:53 */     return this.a;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public int c()
/* 51:   */   {
/* 52:57 */     return this.c;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public dt d()
/* 56:   */   {
/* 57:61 */     return this.b;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     jt
 * JD-Core Version:    0.7.0.1
 */