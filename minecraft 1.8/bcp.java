/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bcp
/*   4:    */   implements Callable
/*   5:    */ {
/*   6:    */   bcp(bcm parambcm) {}
/*   7:    */   
/*   8:    */   public String a()
/*   9:    */   {
/*  10:211 */     bec localbec = this.a.b.p(this.a.c);
/*  11:212 */     int i = localbec.c().c(localbec);
/*  12:213 */     if (i < 0) {
/*  13:214 */       return "Unknown? (Got " + i + ")";
/*  14:    */     }
/*  15:216 */     String str = String.format("%4s", new Object[] { Integer.toBinaryString(i) }).replace(" ", "0");
/*  16:    */     
/*  17:    */ 
/*  18:219 */     return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[] { Integer.valueOf(i), str });
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcp
 * JD-Core Version:    0.7.0.1
 */