/*  1:   */ public class ahn
/*  2:   */   extends ahl
/*  3:   */ {
/*  4:12 */   public int e = 1;
/*  5:   */   
/*  6:   */   public ahn(aqu paramaqu)
/*  7:   */   {
/*  8:15 */     super(paramaqu);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public ahn(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 12:   */   {
/* 13:19 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public ahn(aqu paramaqu, xm paramxm, double paramDouble1, double paramDouble2, double paramDouble3)
/* 17:   */   {
/* 18:23 */     super(paramaqu, paramxm, paramDouble1, paramDouble2, paramDouble3);
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected void a(bru parambru)
/* 22:   */   {
/* 23:28 */     if (!this.o.D)
/* 24:   */     {
/* 25:29 */       if (parambru.d != null)
/* 26:   */       {
/* 27:30 */         parambru.d.a(wh.a(this, this.a), 6.0F);
/* 28:31 */         a(this.a, parambru.d);
/* 29:   */       }
/* 30:33 */       boolean bool = this.o.Q().b("mobGriefing");
/* 31:34 */       this.o.a(null, this.s, this.t, this.u, this.e, bool, bool);
/* 32:35 */       J();
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void b(fn paramfn)
/* 37:   */   {
/* 38:41 */     super.b(paramfn);
/* 39:42 */     paramfn.a("ExplosionPower", this.e);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a(fn paramfn)
/* 43:   */   {
/* 44:47 */     super.a(paramfn);
/* 45:48 */     if (paramfn.b("ExplosionPower", 99)) {
/* 46:49 */       this.e = paramfn.f("ExplosionPower");
/* 47:   */     }
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahn
 * JD-Core Version:    0.7.0.1
 */