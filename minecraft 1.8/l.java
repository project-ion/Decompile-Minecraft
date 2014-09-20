/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ final class l
/*   4:    */   implements Callable
/*   5:    */ {
/*   6:    */   l(int paramInt) {}
/*   7:    */   
/*   8:    */   public String a()
/*   9:    */   {
/*  10:180 */     if (this.a < 0) {
/*  11:181 */       return "Unknown? (Got " + this.a + ")";
/*  12:    */     }
/*  13:183 */     String str = String.format("%4s", new Object[] { Integer.toBinaryString(this.a) }).replace(" ", "0");
/*  14:    */     
/*  15:    */ 
/*  16:186 */     return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[] { Integer.valueOf(this.a), str });
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     l
 * JD-Core Version:    0.7.0.1
 */