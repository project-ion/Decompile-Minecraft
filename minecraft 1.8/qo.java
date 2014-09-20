/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class qo
/*   4:    */   implements Callable
/*   5:    */ {
/*   6:    */   qo(qn paramqn, int paramInt) {}
/*   7:    */   
/*   8:    */   public String a()
/*   9:    */   {
/*  10:130 */     String str = "Once per " + this.a + " ticks";
/*  11:131 */     if (this.a == 2147483647) {
/*  12:132 */       str = "Maximum (" + str + ")";
/*  13:    */     }
/*  14:134 */     return str;
/*  15:    */   }
/*  16:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     qo
 * JD-Core Version:    0.7.0.1
 */