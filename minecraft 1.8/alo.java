/*  1:   */ public class alo
/*  2:   */   extends alq
/*  3:   */ {
/*  4:   */   protected ami a;
/*  5:   */   
/*  6:   */   public alo(ami paramami)
/*  7:   */   {
/*  8:17 */     this.a = paramami;
/*  9:18 */     this.h = 1;
/* 10:19 */     d(paramami.a());
/* 11:20 */     a(akf.i);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 15:   */   {
/* 16:25 */     if (!paramahd.a(paramdt.a(paramej), paramej, paramamj)) {
/* 17:26 */       return false;
/* 18:   */     }
/* 19:29 */     bec localbec = paramaqu.p(paramdt);
/* 20:30 */     atr localatr = localbec.c();
/* 21:32 */     if ((paramej != ej.a) && (paramaqu.p(paramdt.a()).c().r() == bof.a))
/* 22:   */     {
/* 23:33 */       if (localatr == aty.c) {
/* 24:34 */         return a(paramamj, paramahd, paramaqu, paramdt, aty.ak.P());
/* 25:   */       }
/* 26:35 */       if (localatr == aty.d) {
/* 27:36 */         switch (alp.a[((avd)localbec.b(avc.a)).ordinal()])
/* 28:   */         {
/* 29:   */         case 1: 
/* 30:38 */           return a(paramamj, paramahd, paramaqu, paramdt, aty.ak.P());
/* 31:   */         case 2: 
/* 32:40 */           return a(paramamj, paramahd, paramaqu, paramdt, aty.d.P().a(avc.a, avd.a));
/* 33:   */         }
/* 34:   */       }
/* 35:   */     }
/* 36:45 */     return false;
/* 37:   */   }
/* 38:   */   
/* 39:   */   protected boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, bec parambec)
/* 40:   */   {
/* 41:49 */     paramaqu.a(paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, parambec.c().H.c(), (parambec.c().H.d() + 1.0F) / 2.0F, parambec.c().H.e() * 0.8F);
/* 42:51 */     if (paramaqu.D) {
/* 43:52 */       return true;
/* 44:   */     }
/* 45:54 */     paramaqu.a(paramdt, parambec);
/* 46:55 */     paramamj.a(1, paramahd);
/* 47:   */     
/* 48:57 */     return true;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public boolean v_()
/* 52:   */   {
/* 53:62 */     return true;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String g()
/* 57:   */   {
/* 58:66 */     return this.a.toString();
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     alo
 * JD-Core Version:    0.7.0.1
 */