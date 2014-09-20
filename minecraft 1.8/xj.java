/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ public class xj
/*  4:   */   implements Predicate
/*  5:   */ {
/*  6:   */   private final amj a;
/*  7:   */   
/*  8:   */   public xj(amj paramamj)
/*  9:   */   {
/* 10:42 */     this.a = paramamj;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean a(wv paramwv)
/* 14:   */   {
/* 15:47 */     if (!paramwv.ai()) {
/* 16:48 */       return false;
/* 17:   */     }
/* 18:50 */     if (!(paramwv instanceof xm)) {
/* 19:51 */       return false;
/* 20:   */     }
/* 21:53 */     xm localxm = (xm)paramwv;
/* 22:54 */     if (localxm.p(xn.c(this.a)) != null) {
/* 23:55 */       return false;
/* 24:   */     }
/* 25:58 */     if ((localxm instanceof xn)) {
/* 26:59 */       return ((xn)localxm).bX();
/* 27:   */     }
/* 28:60 */     if ((localxm instanceof adi)) {
/* 29:61 */       return true;
/* 30:   */     }
/* 31:62 */     if ((localxm instanceof ahd)) {
/* 32:63 */       return true;
/* 33:   */     }
/* 34:66 */     return false;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     xj
 * JD-Core Version:    0.7.0.1
 */