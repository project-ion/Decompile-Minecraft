/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class alj
/*  4:   */   extends alq
/*  5:   */ {
/*  6:   */   public alj()
/*  7:   */   {
/*  8:13 */     d(64);
/*  9:14 */     c(1);
/* 10:15 */     a(akf.i);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean v_()
/* 14:   */   {
/* 15:20 */     return true;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean e()
/* 19:   */   {
/* 20:25 */     return true;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 24:   */   {
/* 25:30 */     if (paramahd.bE != null)
/* 26:   */     {
/* 27:31 */       int i = paramahd.bE.l();
/* 28:32 */       paramamj.a(i, paramahd);
/* 29:33 */       paramahd.bv();
/* 30:   */     }
/* 31:   */     else
/* 32:   */     {
/* 33:35 */       paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 34:36 */       if (!paramaqu.D) {
/* 35:37 */         paramaqu.d(new ado(paramaqu, paramahd));
/* 36:   */       }
/* 37:39 */       paramahd.bv();
/* 38:40 */       paramahd.b(ty.J[alq.b(this)]);
/* 39:   */     }
/* 40:42 */     return paramamj;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public boolean f_(amj paramamj)
/* 44:   */   {
/* 45:47 */     return super.f_(paramamj);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int b()
/* 49:   */   {
/* 50:52 */     return 1;
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     alj
 * JD-Core Version:    0.7.0.1
 */