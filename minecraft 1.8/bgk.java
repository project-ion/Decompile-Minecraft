/*  1:   */ public class bgk
/*  2:   */ {
/*  3:11 */   private final short[] a = new short[65536];
/*  4:12 */   private final bec b = aty.a.P();
/*  5:   */   
/*  6:   */   public bec a(int paramInt1, int paramInt2, int paramInt3)
/*  7:   */   {
/*  8:15 */     int i = paramInt1 << 12 | paramInt3 << 8 | paramInt2;
/*  9:16 */     return a(i);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public bec a(int paramInt)
/* 13:   */   {
/* 14:21 */     if ((paramInt < 0) || (paramInt >= this.a.length)) {
/* 15:22 */       throw new IndexOutOfBoundsException("The coordinate is out of range");
/* 16:   */     }
/* 17:25 */     bec localbec = (bec)atr.d.a(this.a[paramInt]);
/* 18:27 */     if (localbec != null) {
/* 19:28 */       return localbec;
/* 20:   */     }
/* 21:30 */     return this.b;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(int paramInt1, int paramInt2, int paramInt3, bec parambec)
/* 25:   */   {
/* 26:35 */     int i = paramInt1 << 12 | paramInt3 << 8 | paramInt2;
/* 27:   */     
/* 28:37 */     a(i, parambec);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(int paramInt, bec parambec)
/* 32:   */   {
/* 33:42 */     if ((paramInt < 0) || (paramInt >= this.a.length)) {
/* 34:43 */       throw new IndexOutOfBoundsException("The coordinate is out of range");
/* 35:   */     }
/* 36:46 */     this.a[paramInt] = ((short)atr.d.b(parambec));
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bgk
 * JD-Core Version:    0.7.0.1
 */