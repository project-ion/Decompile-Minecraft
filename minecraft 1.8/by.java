/*  1:   */ import com.google.gson.JsonParseException;
/*  2:   */ import java.util.List;
/*  3:   */ import net.minecraft.server.MinecraftServer;
/*  4:   */ import org.apache.commons.lang3.exception.ExceptionUtils;
/*  5:   */ 
/*  6:   */ public class by
/*  7:   */   extends z
/*  8:   */ {
/*  9:   */   public String c()
/* 10:   */   {
/* 11:22 */     return "tellraw";
/* 12:   */   }
/* 13:   */   
/* 14:   */   public int a()
/* 15:   */   {
/* 16:27 */     return 2;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public String c(ae paramae)
/* 20:   */   {
/* 21:32 */     return "commands.tellraw.usage";
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 25:   */   {
/* 26:37 */     if (paramArrayOfString.length < 2) {
/* 27:38 */       throw new dp("commands.tellraw.usage", new Object[0]);
/* 28:   */     }
/* 29:41 */     qw localqw = a(paramae, paramArrayOfString[0]);
/* 30:42 */     String str = a(paramArrayOfString, 1);
/* 31:   */     try
/* 32:   */     {
/* 33:45 */       ho localho = hp.a(str);
/* 34:46 */       localqw.a(hq.a(paramae, localho, localqw));
/* 35:   */     }
/* 36:   */     catch (JsonParseException localJsonParseException)
/* 37:   */     {
/* 38:48 */       Throwable localThrowable = ExceptionUtils.getRootCause(localJsonParseException);
/* 39:49 */       throw new dl("commands.tellraw.jsonException", new Object[] { localThrowable == null ? "" : localThrowable.getMessage() });
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 44:   */   {
/* 45:56 */     if (paramArrayOfString.length == 1) {
/* 46:57 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 47:   */     }
/* 48:60 */     return null;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 52:   */   {
/* 53:65 */     return paramInt == 0;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     by
 * JD-Core Version:    0.7.0.1
 */