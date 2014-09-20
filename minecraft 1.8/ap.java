/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class ap
/*   4:    */   implements Predicate
/*   5:    */ {
/*   6:    */   ap(String paramString, boolean paramBoolean) {}
/*   7:    */   
/*   8:    */   public boolean a(wv paramwv)
/*   9:    */   {
/*  10:249 */     if (!(paramwv instanceof xm)) {
/*  11:250 */       return false;
/*  12:    */     }
/*  13:253 */     xm localxm = (xm)paramwv;
/*  14:254 */     bsf localbsf = localxm.bN();
/*  15:255 */     String str = localbsf == null ? "" : localbsf.b();
/*  16:256 */     return str.equals(this.a) != this.b;
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ap
 * JD-Core Version:    0.7.0.1
 */