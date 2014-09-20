/*   1:    */ class byq
/*   2:    */   extends byr
/*   3:    */ {
/*   4:    */   private final int p;
/*   5:    */   private final int q;
/*   6:    */   
/*   7:    */   public byq(byn parambyn, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*   8:    */   {
/*   9:234 */     super(paramInt1, paramInt2, paramInt3, byl.a, 0 + wp.a[paramInt4].f() % 8 * 18, 198 + wp.a[paramInt4].f() / 8 * 18);
/*  10:235 */     this.p = paramInt4;
/*  11:236 */     this.q = paramInt5;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public void b(int paramInt1, int paramInt2)
/*  15:    */   {
/*  16:241 */     String str = cwc.a(wp.a[this.p].a(), new Object[0]);
/*  17:244 */     if ((this.q >= 3) && (this.p != wp.l.H)) {
/*  18:245 */       str = str + " II";
/*  19:    */     }
/*  20:248 */     byn.a(this.o, str, paramInt1, paramInt2);
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     byq
 * JD-Core Version:    0.7.0.1
 */