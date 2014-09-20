/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ import org.lwjgl.input.Mouse;
/*    3:     */ 
/*    4:     */ class cjk
/*    5:     */   implements Callable
/*    6:     */ {
/*    7:     */   cjk(cji paramcji, int paramInt1, int paramInt2) {}
/*    8:     */   
/*    9:     */   public String a()
/*   10:     */   {
/*   11:1035 */     return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Mouse.getX()), Integer.valueOf(Mouse.getY()) });
/*   12:     */   }
/*   13:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cjk
 * JD-Core Version:    0.7.0.1
 */