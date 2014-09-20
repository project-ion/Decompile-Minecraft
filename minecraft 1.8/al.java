/*   1:    */ import com.google.common.collect.ComparisonChain;
/*   2:    */ import java.util.Comparator;
/*   3:    */ 
/*   4:    */ final class al
/*   5:    */   implements Comparator
/*   6:    */ {
/*   7:    */   al(dt paramdt) {}
/*   8:    */   
/*   9:    */   public int a(wv paramwv1, wv paramwv2)
/*  10:    */   {
/*  11:456 */     return ComparisonChain.start().compare(paramwv1.b(this.a), paramwv2.b(this.a)).result();
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     al
 * JD-Core Version:    0.7.0.1
 */