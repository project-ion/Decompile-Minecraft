/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class biq
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private final bec a;
/*  7:   */   
/*  8:   */   public biq(bbi parambbi)
/*  9:   */   {
/* 10:17 */     this.a = aty.H.P().a(bbh.a, parambbi);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 14:   */   {
/* 15:   */     atr localatr;
/* 16:24 */     while ((((localatr = paramaqu.p(paramdt).c()).r() == bof.a) || (localatr.r() == bof.j)) && (paramdt.o() > 0)) {
/* 17:25 */       paramdt = paramdt.b();
/* 18:   */     }
/* 19:28 */     for (int i = 0; i < 128; i++)
/* 20:   */     {
/* 21:29 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 22:30 */       if ((paramaqu.d(localdt)) && 
/* 23:31 */         (aty.H.f(paramaqu, localdt, this.a))) {
/* 24:32 */         paramaqu.a(localdt, this.a, 2);
/* 25:   */       }
/* 26:   */     }
/* 27:37 */     return true;
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     biq
 * JD-Core Version:    0.7.0.1
 */