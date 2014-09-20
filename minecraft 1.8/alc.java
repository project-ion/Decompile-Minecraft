/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class alc
/*  4:   */   extends alq
/*  5:   */ {
/*  6:   */   public alc()
/*  7:   */   {
/*  8:10 */     this.h = 16;
/*  9:11 */     a(akf.f);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 13:   */   {
/* 14:16 */     if (paramahd.by.d) {
/* 15:17 */       return paramamj;
/* 16:   */     }
/* 17:20 */     paramamj.b -= 1;
/* 18:21 */     paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 19:22 */     if (!paramaqu.D) {
/* 20:23 */       paramaqu.d(new aht(paramaqu, paramahd));
/* 21:   */     }
/* 22:25 */     paramahd.b(ty.J[alq.b(this)]);
/* 23:26 */     return paramamj;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     alc
 * JD-Core Version:    0.7.0.1
 */