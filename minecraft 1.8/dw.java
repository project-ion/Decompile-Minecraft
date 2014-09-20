/*   1:    */ import java.util.Iterator;
/*   2:    */ 
/*   3:    */ final class dw
/*   4:    */   implements Iterable
/*   5:    */ {
/*   6:    */   dw(dt paramdt1, dt paramdt2) {}
/*   7:    */   
/*   8:    */   public Iterator iterator()
/*   9:    */   {
/*  10:244 */     return new dx(this);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     dw
 * JD-Core Version:    0.7.0.1
 */