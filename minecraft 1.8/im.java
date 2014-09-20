/*  1:   */ public class im
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   private int d;
/*  8:   */   private int e;
/*  9:   */   
/* 10:   */   public im() {}
/* 11:   */   
/* 12:   */   public im(xk paramxk)
/* 13:   */   {
/* 14:23 */     this.a = paramxk.F();
/* 15:24 */     this.b = uv.c(paramxk.s * 32.0D);
/* 16:25 */     this.c = uv.c(paramxk.t * 32.0D);
/* 17:26 */     this.d = uv.c(paramxk.u * 32.0D);
/* 18:27 */     this.e = paramxk.j();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(hd paramhd)
/* 22:   */   {
/* 23:32 */     this.a = paramhd.e();
/* 24:33 */     this.b = paramhd.readInt();
/* 25:34 */     this.c = paramhd.readInt();
/* 26:35 */     this.d = paramhd.readInt();
/* 27:36 */     this.e = paramhd.readShort();
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void b(hd paramhd)
/* 31:   */   {
/* 32:41 */     paramhd.b(this.a);
/* 33:42 */     paramhd.writeInt(this.b);
/* 34:43 */     paramhd.writeInt(this.c);
/* 35:44 */     paramhd.writeInt(this.d);
/* 36:45 */     paramhd.writeShort(this.e);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void a(ik paramik)
/* 40:   */   {
/* 41:50 */     paramik.a(this);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public int a()
/* 45:   */   {
/* 46:54 */     return this.a;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public int b()
/* 50:   */   {
/* 51:58 */     return this.b;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public int c()
/* 55:   */   {
/* 56:62 */     return this.c;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public int d()
/* 60:   */   {
/* 61:66 */     return this.d;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public int e()
/* 65:   */   {
/* 66:70 */     return this.e;
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     im
 * JD-Core Version:    0.7.0.1
 */