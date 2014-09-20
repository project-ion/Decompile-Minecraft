/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ import net.minecraft.client.ClientBrandRetriever;
/*   3:    */ 
/*   4:    */ class cym
/*   5:    */   implements Callable
/*   6:    */ {
/*   7:    */   cym(cyk paramcyk) {}
/*   8:    */   
/*   9:    */   public String a()
/*  10:    */   {
/*  11:231 */     String str = ClientBrandRetriever.getClientModName();
/*  12:232 */     if (!str.equals("vanilla")) {
/*  13:233 */       return "Definitely; Client brand changed to '" + str + "'";
/*  14:    */     }
/*  15:236 */     str = this.a.getServerModName();
/*  16:237 */     if (!str.equals("vanilla")) {
/*  17:238 */       return "Definitely; Server brand changed to '" + str + "'";
/*  18:    */     }
/*  19:241 */     if (bsu.class.getSigners() == null) {
/*  20:242 */       return "Very likely; Jar signature invalidated";
/*  21:    */     }
/*  22:244 */     return "Probably not. Jar signature remains and both client + server brands are untouched.";
/*  23:    */   }
/*  24:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cym
 * JD-Core Version:    0.7.0.1
 */