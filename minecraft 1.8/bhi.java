/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhi
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private auc a;
/*  7:   */   
/*  8:   */   public bhi(auc paramauc)
/*  9:   */   {
/* 10:14 */     this.a = paramauc;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 14:   */   {
/* 15:19 */     for (int i = 0; i < 64; i++)
/* 16:   */     {
/* 17:20 */       dt localdt = paramdt.a(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 18:21 */       if ((paramaqu.d(localdt)) && ((!paramaqu.t.o()) || (localdt.o() < 255)) && 
/* 19:22 */         (this.a.f(paramaqu, localdt, this.a.P()))) {
/* 20:23 */         paramaqu.a(localdt, this.a.P(), 2);
/* 21:   */       }
/* 22:   */     }
/* 23:28 */     return true;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhi
 * JD-Core Version:    0.7.0.1
 */