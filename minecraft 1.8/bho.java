/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bho
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private avk a;
/*  7:   */   
/*  8:   */   public void a(avk paramavk)
/*  9:   */   {
/* 10:18 */     this.a = paramavk;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 14:   */   {
/* 15:23 */     boolean bool = false;
/* 16:25 */     for (int i = 0; i < 64; i++)
/* 17:   */     {
/* 18:26 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 19:27 */       if ((paramaqu.d(localdt)) && ((!paramaqu.t.o()) || (localdt.o() < 254)) && 
/* 20:28 */         (aty.cF.c(paramaqu, localdt)))
/* 21:   */       {
/* 22:29 */         aty.cF.a(paramaqu, localdt, this.a, 2);
/* 23:30 */         bool = true;
/* 24:   */       }
/* 25:   */     }
/* 26:35 */     return bool;
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bho
 * JD-Core Version:    0.7.0.1
 */