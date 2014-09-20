/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class auw
/*  4:   */   extends auc
/*  5:   */ {
/*  6:   */   protected auw()
/*  7:   */   {
/*  8:19 */     super(bof.l);
/*  9:20 */     float f = 0.4F;
/* 10:21 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
/* 11:   */   }
/* 12:   */   
/* 13:   */   protected boolean c(atr paramatr)
/* 14:   */   {
/* 15:26 */     return (paramatr == aty.m) || (paramatr == aty.cz) || (paramatr == aty.cu) || (paramatr == aty.d);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean f(aqu paramaqu, dt paramdt)
/* 19:   */   {
/* 20:31 */     return true;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 24:   */   {
/* 25:37 */     return null;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(aqu paramaqu, ahd paramahd, dt paramdt, bec parambec, bcm parambcm)
/* 29:   */   {
/* 30:42 */     if ((paramaqu.D) || (paramahd.bY() == null) || (paramahd.bY().b() != amk.be))
/* 31:   */     {
/* 32:43 */       super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/* 33:   */     }
/* 34:   */     else
/* 35:   */     {
/* 36:45 */       paramahd.b(ty.H[atr.a(this)]);
/* 37:   */       
/* 38:47 */       a(paramaqu, paramdt, new amj(aty.I, 1, 0));
/* 39:   */     }
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     auw
 * JD-Core Version:    0.7.0.1
 */