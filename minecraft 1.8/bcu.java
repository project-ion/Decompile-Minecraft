/*  1:   */ import io.netty.buffer.ByteBuf;
/*  2:   */ 
/*  3:   */ class bcu
/*  4:   */   extends aqf
/*  5:   */ {
/*  6:   */   bcu(bct parambct) {}
/*  7:   */   
/*  8:   */   public dt c()
/*  9:   */   {
/* 10:18 */     return this.a.c;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public brw d()
/* 14:   */   {
/* 15:23 */     return new brw(this.a.c.n() + 0.5D, this.a.c.o() + 0.5D, this.a.c.p() + 0.5D);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public aqu e()
/* 19:   */   {
/* 20:28 */     return this.a.z();
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(String paramString)
/* 24:   */   {
/* 25:33 */     super.a(paramString);
/* 26:34 */     this.a.o_();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void h()
/* 30:   */   {
/* 31:39 */     this.a.z().h(this.a.c);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int i()
/* 35:   */   {
/* 36:44 */     return 0;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void a(ByteBuf paramByteBuf)
/* 40:   */   {
/* 41:49 */     paramByteBuf.writeInt(this.a.c.n());
/* 42:50 */     paramByteBuf.writeInt(this.a.c.o());
/* 43:51 */     paramByteBuf.writeInt(this.a.c.p());
/* 44:   */   }
/* 45:   */   
/* 46:   */   public wv f()
/* 47:   */   {
/* 48:56 */     return null;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcu
 * JD-Core Version:    0.7.0.1
 */