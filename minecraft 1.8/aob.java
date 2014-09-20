/*  1:   */ public class aob
/*  2:   */ {
/*  3: 8 */   private String[][] a = { { "XXX", "X X" }, { "X X", "XXX", "XXX" }, { "XXX", "X X", "X X" }, { "X X", "X X" } };
/*  4:30 */   private alq[][] b = { { amk.aF, amk.j, amk.i, amk.k }, { amk.Q, amk.Y, amk.ac, amk.ag }, { amk.R, amk.Z, amk.ad, amk.ah }, { amk.S, amk.aa, amk.ae, amk.ai }, { amk.T, amk.ab, amk.af, amk.aj } };
/*  5:   */   
/*  6:   */   public void a(aop paramaop)
/*  7:   */   {
/*  8:39 */     for (int i = 0; i < this.b[0].length; i++)
/*  9:   */     {
/* 10:40 */       alq localalq1 = this.b[0][i];
/* 11:42 */       for (int j = 0; j < this.b.length - 1; j++)
/* 12:   */       {
/* 13:43 */         alq localalq2 = this.b[(j + 1)][i];
/* 14:44 */         paramaop.a(new amj(localalq2), new Object[] { this.a[j], Character.valueOf('X'), localalq1 });
/* 15:   */       }
/* 16:   */     }
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aob
 * JD-Core Version:    0.7.0.1
 */