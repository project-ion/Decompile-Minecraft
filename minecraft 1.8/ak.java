/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class ak
/*   4:    */   implements Predicate
/*   5:    */ {
/*   6:    */   ak(brt parambrt) {}
/*   7:    */   
/*   8:    */   public boolean a(wv paramwv)
/*   9:    */   {
/*  10:407 */     if ((paramwv.s < this.a.a) || (paramwv.t < this.a.b) || (paramwv.u < this.a.c)) {
/*  11:408 */       return false;
/*  12:    */     }
/*  13:410 */     if ((paramwv.s >= this.a.d) || (paramwv.t >= this.a.e) || (paramwv.u >= this.a.f)) {
/*  14:411 */       return false;
/*  15:    */     }
/*  16:413 */     return true;
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ak
 * JD-Core Version:    0.7.0.1
 */