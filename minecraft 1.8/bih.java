/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bih
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  7:   */   {
/*  8:15 */     for (int i = 0; i < 64; i++)
/*  9:   */     {
/* 10:16 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 11:18 */       if ((paramaqu.d(localdt)) && (paramaqu.p(localdt.b()).c() == aty.c) && 
/* 12:19 */         (aty.aU.c(paramaqu, localdt))) {
/* 13:20 */         paramaqu.a(localdt, aty.aU.P().a(azk.N, en.a.a(paramRandom)), 2);
/* 14:   */       }
/* 15:   */     }
/* 16:25 */     return true;
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bih
 * JD-Core Version:    0.7.0.1
 */