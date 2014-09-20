/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bid
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:13 */     for (int i = 0; i < 64; i++)
/*  9:   */     {
/* 10:14 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 11:15 */       if ((aty.bk.c(paramaqu, localdt)) && (paramaqu.p(localdt.b()).c() == aty.c)) {
/* 12:16 */         paramaqu.a(localdt, aty.bk.P(), 2);
/* 13:   */       }
/* 14:   */     }
/* 15:20 */     return true;
/* 16:   */   }
/* 17:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bid
 * JD-Core Version:    0.7.0.1
 */