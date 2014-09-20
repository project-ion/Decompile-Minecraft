/*  1:   */ public class aow
/*  2:   */ {
/*  3: 9 */   private String[][] a = { { "X", "X", "#" } };
/*  4:17 */   private Object[][] b = { { aty.f, aty.e, amk.j, amk.i, amk.k }, { amk.m, amk.q, amk.l, amk.u, amk.B } };
/*  5:   */   
/*  6:   */   public void a(aop paramaop)
/*  7:   */   {
/*  8:23 */     for (int i = 0; i < this.b[0].length; i++)
/*  9:   */     {
/* 10:24 */       Object localObject = this.b[0][i];
/* 11:26 */       for (int j = 0; j < this.b.length - 1; j++)
/* 12:   */       {
/* 13:27 */         alq localalq = (alq)this.b[(j + 1)][i];
/* 14:28 */         paramaop.a(new amj(localalq), new Object[] { this.a[j], Character.valueOf('#'), amk.y, Character.valueOf('X'), localObject });
/* 15:   */       }
/* 16:   */     }
/* 17:37 */     paramaop.a(new amj(amk.f, 1), new Object[] { " #X", "# X", " #X", Character.valueOf('X'), amk.F, Character.valueOf('#'), amk.y });
/* 18:   */     
/* 19:   */ 
/* 20:   */ 
/* 21:   */ 
/* 22:   */ 
/* 23:   */ 
/* 24:   */ 
/* 25:   */ 
/* 26:46 */     paramaop.a(new amj(amk.g, 4), new Object[] { "X", "#", "Y", Character.valueOf('Y'), amk.G, Character.valueOf('X'), amk.ak, Character.valueOf('#'), amk.y });
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aow
 * JD-Core Version:    0.7.0.1
 */