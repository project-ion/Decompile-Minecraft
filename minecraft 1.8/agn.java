/*  1:   */ public class agn
/*  2:   */   implements aqb
/*  3:   */ {
/*  4:   */   private aje a;
/*  5:   */   private ahd b;
/*  6:   */   private aqd c;
/*  7:   */   private ho d;
/*  8:   */   
/*  9:   */   public agn(ahd paramahd, ho paramho)
/* 10:   */   {
/* 11:20 */     this.b = paramahd;
/* 12:21 */     this.d = paramho;
/* 13:22 */     this.a = new aje(paramahd, this);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public ahd u_()
/* 17:   */   {
/* 18:31 */     return this.b;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a_(ahd paramahd) {}
/* 22:   */   
/* 23:   */   public aqd b_(ahd paramahd)
/* 24:   */   {
/* 25:40 */     return this.c;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(aqd paramaqd)
/* 29:   */   {
/* 30:45 */     this.c = paramaqd;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void a(aqc paramaqc)
/* 34:   */   {
/* 35:50 */     paramaqc.g();
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void a_(amj paramamj) {}
/* 39:   */   
/* 40:   */   public ho e_()
/* 41:   */   {
/* 42:59 */     if (this.d != null) {
/* 43:60 */       return this.d;
/* 44:   */     }
/* 45:62 */     return new hz("entity.Villager.name", new Object[0]);
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     agn
 * JD-Core Version:    0.7.0.1
 */