/*  1:   */ public class mu
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private dt a;
/*  5:   */   private ho[] b;
/*  6:   */   
/*  7:   */   public mu() {}
/*  8:   */   
/*  9:   */   public mu(dt paramdt, ho[] paramArrayOfho)
/* 10:   */   {
/* 11:18 */     this.a = paramdt;
/* 12:19 */     this.b = new ho[] { paramArrayOfho[0], paramArrayOfho[1], paramArrayOfho[2], paramArrayOfho[3] };
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(hd paramhd)
/* 16:   */   {
/* 17:26 */     this.a = paramhd.c();
/* 18:27 */     this.b = new ho[4];
/* 19:28 */     for (int i = 0; i < 4; i++) {
/* 20:29 */       this.b[i] = paramhd.d();
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void b(hd paramhd)
/* 25:   */   {
/* 26:35 */     paramhd.a(this.a);
/* 27:36 */     for (int i = 0; i < 4; i++) {
/* 28:37 */       paramhd.a(this.b[i]);
/* 29:   */     }
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(ls paramls)
/* 33:   */   {
/* 34:43 */     paramls.a(this);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public dt a()
/* 38:   */   {
/* 39:47 */     return this.a;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public ho[] b()
/* 43:   */   {
/* 44:51 */     return this.b;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     mu
 * JD-Core Version:    0.7.0.1
 */