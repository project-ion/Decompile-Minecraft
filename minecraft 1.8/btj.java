/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ import org.lwjgl.opengl.GL11;
/*    3:     */ 
/*    4:     */ class btj
/*    5:     */   implements Callable
/*    6:     */ {
/*    7:     */   btj(bsu parambsu) {}
/*    8:     */   
/*    9:     */   public String a()
/*   10:     */   {
/*   11:2191 */     return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
/*   12:     */   }
/*   13:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     btj
 * JD-Core Version:    0.7.0.1
 */