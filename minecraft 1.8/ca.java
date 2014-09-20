/*  1:   */ import java.util.List;
/*  2:   */ import java.util.regex.Matcher;
/*  3:   */ import java.util.regex.Pattern;
/*  4:   */ import net.minecraft.server.MinecraftServer;
/*  5:   */ 
/*  6:   */ public class ca
/*  7:   */   extends z
/*  8:   */ {
/*  9:   */   public String c()
/* 10:   */   {
/* 11:18 */     return "pardon-ip";
/* 12:   */   }
/* 13:   */   
/* 14:   */   public int a()
/* 15:   */   {
/* 16:23 */     return 3;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public boolean a(ae paramae)
/* 20:   */   {
/* 21:28 */     return (MinecraftServer.M().an().j().b()) && (super.a(paramae));
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String c(ae paramae)
/* 25:   */   {
/* 26:33 */     return "commands.unbanip.usage";
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 30:   */   {
/* 31:38 */     if ((paramArrayOfString.length != 1) || (paramArrayOfString[0].length() <= 1)) {
/* 32:39 */       throw new dp("commands.unbanip.usage", new Object[0]);
/* 33:   */     }
/* 34:42 */     Matcher localMatcher = aw.a.matcher(paramArrayOfString[0]);
/* 35:43 */     if (localMatcher.matches())
/* 36:   */     {
/* 37:44 */       MinecraftServer.M().an().j().c(paramArrayOfString[0]);
/* 38:45 */       a(paramae, this, "commands.unbanip.success", new Object[] { paramArrayOfString[0] });
/* 39:   */     }
/* 40:   */     else
/* 41:   */     {
/* 42:47 */       throw new dl("commands.unbanip.invalid", new Object[0]);
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 47:   */   {
/* 48:54 */     if (paramArrayOfString.length == 1) {
/* 49:55 */       return a(paramArrayOfString, MinecraftServer.M().an().j().a());
/* 50:   */     }
/* 51:58 */     return null;
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ca
 * JD-Core Version:    0.7.0.1
 */