/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class aky
/*  4:   */   extends alq
/*  5:   */ {
/*  6:   */   public aky()
/*  7:   */   {
/*  8:10 */     this.h = 16;
/*  9:11 */     a(akf.l);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 13:   */   {
/* 14:16 */     if (!paramahd.by.d) {
/* 15:17 */       paramamj.b -= 1;
/* 16:   */     }
/* 17:19 */     paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 18:20 */     if (!paramaqu.D) {
/* 19:21 */       paramaqu.d(new ahs(paramaqu, paramahd));
/* 20:   */     }
/* 21:23 */     paramahd.b(ty.J[alq.b(this)]);
/* 22:24 */     return paramamj;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aky
 * JD-Core Version:    0.7.0.1
 */