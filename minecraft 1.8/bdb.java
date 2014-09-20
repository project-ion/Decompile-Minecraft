/*  1:   */ public class bdb
/*  2:   */   extends bcm
/*  3:   */ {
/*  4:   */   private alq a;
/*  5:   */   private int f;
/*  6:   */   
/*  7:   */   public bdb() {}
/*  8:   */   
/*  9:   */   public bdb(alq paramalq, int paramInt)
/* 10:   */   {
/* 11:19 */     this.a = paramalq;
/* 12:20 */     this.f = paramInt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void b(fn paramfn)
/* 16:   */   {
/* 17:25 */     super.b(paramfn);
/* 18:26 */     oa localoa = (oa)alq.e.c(this.a);
/* 19:27 */     paramfn.a("Item", localoa == null ? "" : localoa.toString());
/* 20:28 */     paramfn.a("Data", this.f);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(fn paramfn)
/* 24:   */   {
/* 25:33 */     super.a(paramfn);
/* 26:34 */     if (paramfn.b("Item", 8)) {
/* 27:35 */       this.a = alq.d(paramfn.j("Item"));
/* 28:   */     } else {
/* 29:38 */       this.a = alq.b(paramfn.f("Item"));
/* 30:   */     }
/* 31:40 */     this.f = paramfn.f("Data");
/* 32:   */   }
/* 33:   */   
/* 34:   */   public id x_()
/* 35:   */   {
/* 36:45 */     fn localfn = new fn();
/* 37:46 */     b(localfn);
/* 38:   */     
/* 39:48 */     localfn.o("Item");
/* 40:49 */     localfn.a("Item", alq.b(this.a));
/* 41:50 */     return new iu(this.c, 5, localfn);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void a(alq paramalq, int paramInt)
/* 45:   */   {
/* 46:54 */     this.a = paramalq;
/* 47:55 */     this.f = paramInt;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public alq b()
/* 51:   */   {
/* 52:59 */     return this.a;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public int c()
/* 56:   */   {
/* 57:63 */     return this.f;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bdb
 * JD-Core Version:    0.7.0.1
 */