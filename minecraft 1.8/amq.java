/*  1:   */ final class amq
/*  2:   */   extends eg
/*  3:   */ {
/*  4:15 */   private final eg b = new eg();
/*  5:   */   
/*  6:   */   public amj b(dz paramdz, amj paramamj)
/*  7:   */   {
/*  8:19 */     ej localej = ave.b(paramdz.f());
/*  9:20 */     aqu localaqu = paramdz.i();
/* 10:   */     
/* 11:   */ 
/* 12:   */ 
/* 13:24 */     double d1 = paramdz.a() + localej.g() * 1.125D;
/* 14:25 */     double d2 = Math.floor(paramdz.b()) + localej.h();
/* 15:26 */     double d3 = paramdz.c() + localej.i() * 1.125D;
/* 16:   */     
/* 17:28 */     dt localdt = paramdz.d().a(localej);
/* 18:29 */     bec localbec = localaqu.p(localdt);
/* 19:30 */     atl localatl1 = (localbec.c() instanceof ati) ? (atl)localbec.b(((ati)localbec.c()).l()) : atl.a;
/* 20:   */     double d4;
/* 21:33 */     if (ati.d(localbec))
/* 22:   */     {
/* 23:34 */       if (localatl1.c()) {
/* 24:35 */         d4 = 0.6D;
/* 25:   */       } else {
/* 26:37 */         d4 = 0.1D;
/* 27:   */       }
/* 28:   */     }
/* 29:39 */     else if ((localbec.c().r() == bof.a) && (ati.d(localaqu.p(localdt.b()))))
/* 30:   */     {
/* 31:40 */       localObject = localaqu.p(localdt.b());
/* 32:41 */       atl localatl2 = (((bec)localObject).c() instanceof ati) ? (atl)((bec)localObject).b(((ati)((bec)localObject).c()).l()) : atl.a;
/* 33:42 */       if ((localej == ej.a) || (!localatl2.c())) {
/* 34:43 */         d4 = -0.9D;
/* 35:   */       } else {
/* 36:45 */         d4 = -0.4D;
/* 37:   */       }
/* 38:   */     }
/* 39:   */     else
/* 40:   */     {
/* 41:48 */       return this.b.a(paramdz, paramamj);
/* 42:   */     }
/* 43:51 */     Object localObject = adx.a(localaqu, d1, d2 + d4, d3, amp.a((amp)paramamj.b()));
/* 44:52 */     if (paramamj.s()) {
/* 45:53 */       ((adx)localObject).a(paramamj.q());
/* 46:   */     }
/* 47:55 */     localaqu.d((wv)localObject);
/* 48:   */     
/* 49:57 */     paramamj.a(1);
/* 50:58 */     return paramamj;
/* 51:   */   }
/* 52:   */   
/* 53:   */   protected void a(dz paramdz)
/* 54:   */   {
/* 55:63 */     paramdz.i().b(1000, paramdz.d(), 0);
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     amq
 * JD-Core Version:    0.7.0.1
 */