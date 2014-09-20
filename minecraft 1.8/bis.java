/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bis
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:16 */     while (paramdt.o() < 128)
/*  9:   */     {
/* 10:17 */       if (paramaqu.d(paramdt)) {
/* 11:19 */         for (ej localej : en.a.a()) {
/* 12:20 */           if (aty.bn.a(paramaqu, paramdt, localej))
/* 13:   */           {
/* 14:21 */             bec localbec = aty.bn.P().a(bbv.b, Boolean.valueOf(localej == ej.c)).a(bbv.M, Boolean.valueOf(localej == ej.f)).a(bbv.N, Boolean.valueOf(localej == ej.d)).a(bbv.O, Boolean.valueOf(localej == ej.e));
/* 15:   */             
/* 16:   */ 
/* 17:   */ 
/* 18:   */ 
/* 19:   */ 
/* 20:27 */             paramaqu.a(paramdt, localbec, 2);
/* 21:28 */             break;
/* 22:   */           }
/* 23:   */         }
/* 24:   */       } else {
/* 25:32 */         paramdt = paramdt.a(paramRandom.nextInt(4) - paramRandom.nextInt(4), 0, paramRandom.nextInt(4) - paramRandom.nextInt(4));
/* 26:   */       }
/* 27:34 */       paramdt = paramdt.a();
/* 28:   */     }
/* 29:37 */     return true;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bis
 * JD-Core Version:    0.7.0.1
 */