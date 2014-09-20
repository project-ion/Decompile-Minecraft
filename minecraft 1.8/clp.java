/*   1:    */ public enum clp
/*   2:    */ {
/*   3:    */   protected final ej[] g;
/*   4:    */   protected final float h;
/*   5:    */   protected final boolean i;
/*   6:    */   protected final cls[] j;
/*   7:    */   protected final cls[] k;
/*   8:    */   protected final cls[] l;
/*   9:    */   protected final cls[] m;
/*  10:    */   private static final clp[] n;
/*  11:    */   
/*  12:    */   static
/*  13:    */   {
/*  14:564 */     n = new clp[6];
/*  15:    */     
/*  16:    */ 
/*  17:567 */     n[ej.a.a()] = a;
/*  18:568 */     n[ej.b.a()] = b;
/*  19:569 */     n[ej.c.a()] = c;
/*  20:570 */     n[ej.d.a()] = d;
/*  21:571 */     n[ej.e.a()] = e;
/*  22:572 */     n[ej.f.a()] = f;
/*  23:    */   }
/*  24:    */   
/*  25:    */   private clp(ej[] paramArrayOfej, float paramFloat, boolean paramBoolean, cls[] paramArrayOfcls1, cls[] paramArrayOfcls2, cls[] paramArrayOfcls3, cls[] paramArrayOfcls4)
/*  26:    */   {
/*  27:576 */     this.g = paramArrayOfej;
/*  28:577 */     this.h = paramFloat;
/*  29:578 */     this.i = paramBoolean;
/*  30:579 */     this.j = paramArrayOfcls1;
/*  31:580 */     this.k = paramArrayOfcls2;
/*  32:581 */     this.l = paramArrayOfcls3;
/*  33:582 */     this.m = paramArrayOfcls4;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public static clp a(ej paramej)
/*  37:    */   {
/*  38:586 */     return n[paramej.a()];
/*  39:    */   }
/*  40:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     clp
 * JD-Core Version:    0.7.0.1
 */