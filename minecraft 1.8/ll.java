/*  1:   */ public class ll
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private aqu a;
/*  5:   */   private dt b;
/*  6:   */   private ho[] c;
/*  7:   */   
/*  8:   */   public ll() {}
/*  9:   */   
/* 10:   */   public ll(aqu paramaqu, dt paramdt, ho[] paramArrayOfho)
/* 11:   */   {
/* 12:20 */     this.a = paramaqu;
/* 13:21 */     this.b = paramdt;
/* 14:22 */     this.c = new ho[] { paramArrayOfho[0], paramArrayOfho[1], paramArrayOfho[2], paramArrayOfho[3] };
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(hd paramhd)
/* 18:   */   {
/* 19:29 */     this.b = paramhd.c();
/* 20:30 */     this.c = new ho[4];
/* 21:31 */     for (int i = 0; i < 4; i++) {
/* 22:32 */       this.c[i] = paramhd.d();
/* 23:   */     }
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void b(hd paramhd)
/* 27:   */   {
/* 28:38 */     paramhd.a(this.b);
/* 29:39 */     for (int i = 0; i < 4; i++) {
/* 30:40 */       paramhd.a(this.c[i]);
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a(ik paramik)
/* 35:   */   {
/* 36:46 */     paramik.a(this);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public dt a()
/* 40:   */   {
/* 41:50 */     return this.b;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public ho[] b()
/* 45:   */   {
/* 46:54 */     return this.c;
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ll
 * JD-Core Version:    0.7.0.1
 */