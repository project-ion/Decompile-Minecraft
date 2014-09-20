/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhm
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:   */     atr localatr;
/*  9:18 */     while ((((localatr = paramaqu.p(paramdt).c()).r() == bof.a) || (localatr.r() == bof.j)) && (paramdt.o() > 0)) {
/* 10:19 */       paramdt = paramdt.b();
/* 11:   */     }
/* 12:22 */     for (int i = 0; i < 4; i++)
/* 13:   */     {
/* 14:23 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 15:24 */       if ((paramaqu.d(localdt)) && 
/* 16:25 */         (aty.I.f(paramaqu, localdt, aty.I.P()))) {
/* 17:26 */         paramaqu.a(localdt, aty.I.P(), 2);
/* 18:   */       }
/* 19:   */     }
/* 20:31 */     return true;
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhm
 * JD-Core Version:    0.7.0.1
 */