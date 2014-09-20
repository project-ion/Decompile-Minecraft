/*  1:   */ public class axd
/*  2:   */   extends bcm
/*  3:   */ {
/*  4:   */   private amj a;
/*  5:   */   
/*  6:   */   public void a(fn paramfn)
/*  7:   */   {
/*  8:29 */     super.a(paramfn);
/*  9:31 */     if (paramfn.b("RecordItem", 10)) {
/* 10:32 */       a(amj.a(paramfn.m("RecordItem")));
/* 11:33 */     } else if (paramfn.f("Record") > 0) {
/* 12:34 */       a(new amj(alq.b(paramfn.f("Record")), 1, 0));
/* 13:   */     }
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void b(fn paramfn)
/* 17:   */   {
/* 18:40 */     super.b(paramfn);
/* 19:42 */     if (a() != null) {
/* 20:43 */       paramfn.a("RecordItem", a().b(new fn()));
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   public amj a()
/* 25:   */   {
/* 26:48 */     return this.a;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(amj paramamj)
/* 30:   */   {
/* 31:52 */     this.a = paramamj;
/* 32:53 */     o_();
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axd
 * JD-Core Version:    0.7.0.1
 */