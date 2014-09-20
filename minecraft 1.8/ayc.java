/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ayc
/*  4:   */   extends atr
/*  5:   */ {
/*  6:18 */   public static final bet a = bet.a("snowy");
/*  7:   */   
/*  8:   */   protected ayc()
/*  9:   */   {
/* 10:23 */     super(bof.b);
/* 11:24 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/* 12:25 */     a(true);
/* 13:26 */     a(akf.b);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public bec a(bec parambec, ard paramard, dt paramdt)
/* 17:   */   {
/* 18:31 */     atr localatr = paramard.p(paramdt.a()).c();
/* 19:32 */     return parambec.a(a, Boolean.valueOf((localatr == aty.aJ) || (localatr == aty.aH)));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 23:   */   {
/* 24:37 */     if (paramaqu.D) {
/* 25:38 */       return;
/* 26:   */     }
/* 27:41 */     if ((paramaqu.l(paramdt.a()) < 4) && (paramaqu.p(paramdt.a()).c().n() > 2))
/* 28:   */     {
/* 29:42 */       paramaqu.a(paramdt, aty.d.P().a(avc.a, avd.a));
/* 30:43 */       return;
/* 31:   */     }
/* 32:46 */     if (paramaqu.l(paramdt.a()) >= 9) {
/* 33:47 */       for (int i = 0; i < 4; i++)
/* 34:   */       {
/* 35:48 */         dt localdt = paramdt.a(paramRandom.nextInt(3) - 1, paramRandom.nextInt(5) - 3, paramRandom.nextInt(3) - 1);
/* 36:49 */         bec localbec = paramaqu.p(localdt);
/* 37:50 */         atr localatr = paramaqu.p(localdt.a()).c();
/* 38:51 */         if ((localbec.c() == aty.d) && (localbec.b(avc.a) == avd.a) && (paramaqu.l(localdt.a()) >= 4) && (localatr.n() <= 2)) {
/* 39:52 */           paramaqu.a(localdt, P());
/* 40:   */         }
/* 41:   */       }
/* 42:   */     }
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void c(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 46:   */   {
/* 47:60 */     super.c(paramaqu, paramdt, parambec, paramRandom);
/* 48:61 */     if (paramRandom.nextInt(10) == 0) {
/* 49:62 */       paramaqu.a(ew.w, paramdt.n() + paramRandom.nextFloat(), paramdt.o() + 1.1F, paramdt.p() + paramRandom.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 50:   */     }
/* 51:   */   }
/* 52:   */   
/* 53:   */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 54:   */   {
/* 55:69 */     return aty.d.a(aty.d.P().a(avc.a, avd.a), paramRandom, paramInt);
/* 56:   */   }
/* 57:   */   
/* 58:   */   public int c(bec parambec)
/* 59:   */   {
/* 60:74 */     return 0;
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected bed e()
/* 64:   */   {
/* 65:79 */     return new bed(this, new bex[] { a });
/* 66:   */   }
/* 67:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayc
 * JD-Core Version:    0.7.0.1
 */