/*  1:   */ public class aov
/*  2:   */ {
/*  3:10 */   private String[][] a = { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
/*  4:33 */   private Object[][] b = { { aty.f, aty.e, amk.j, amk.i, amk.k }, { amk.o, amk.s, amk.b, amk.w, amk.D }, { amk.n, amk.r, amk.a, amk.v, amk.C }, { amk.p, amk.t, amk.c, amk.x, amk.E }, { amk.I, amk.J, amk.K, amk.L, amk.M } };
/*  5:   */   
/*  6:   */   public void a(aop paramaop)
/*  7:   */   {
/*  8:43 */     for (int i = 0; i < this.b[0].length; i++)
/*  9:   */     {
/* 10:44 */       Object localObject = this.b[0][i];
/* 11:46 */       for (int j = 0; j < this.b.length - 1; j++)
/* 12:   */       {
/* 13:47 */         alq localalq = (alq)this.b[(j + 1)][i];
/* 14:48 */         paramaop.a(new amj(localalq), new Object[] { this.a[j], Character.valueOf('#'), amk.y, Character.valueOf('X'), localObject });
/* 15:   */       }
/* 16:   */     }
/* 17:57 */     paramaop.a(new amj(amk.be), new Object[] { " #", "# ", Character.valueOf('#'), amk.j });
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aov
 * JD-Core Version:    0.7.0.1
 */