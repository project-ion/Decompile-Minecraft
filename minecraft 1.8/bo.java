/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bo
/*  5:   */   extends z
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:19 */     return "difficulty";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:24 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ae paramae)
/* 18:   */   {
/* 19:29 */     return "commands.difficulty.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 23:   */   {
/* 24:34 */     if (paramArrayOfString.length <= 0) {
/* 25:35 */       throw new dp("commands.difficulty.usage", new Object[0]);
/* 26:   */     }
/* 27:38 */     vt localvt = e(paramArrayOfString[0]);
/* 28:39 */     MinecraftServer.M().a(localvt);
/* 29:   */     
/* 30:41 */     a(paramae, this, "commands.difficulty.success", new Object[] { new hz(localvt.b(), new Object[0]) });
/* 31:   */   }
/* 32:   */   
/* 33:   */   protected vt e(String paramString)
/* 34:   */   {
/* 35:45 */     if ((paramString.equalsIgnoreCase("peaceful")) || (paramString.equalsIgnoreCase("p"))) {
/* 36:46 */       return vt.a;
/* 37:   */     }
/* 38:47 */     if ((paramString.equalsIgnoreCase("easy")) || (paramString.equalsIgnoreCase("e"))) {
/* 39:48 */       return vt.b;
/* 40:   */     }
/* 41:49 */     if ((paramString.equalsIgnoreCase("normal")) || (paramString.equalsIgnoreCase("n"))) {
/* 42:50 */       return vt.c;
/* 43:   */     }
/* 44:51 */     if ((paramString.equalsIgnoreCase("hard")) || (paramString.equalsIgnoreCase("h"))) {
/* 45:52 */       return vt.d;
/* 46:   */     }
/* 47:54 */     return vt.a(a(paramString, 0, 3));
/* 48:   */   }
/* 49:   */   
/* 50:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 51:   */   {
/* 52:61 */     if (paramArrayOfString.length == 1) {
/* 53:62 */       return a(paramArrayOfString, new String[] { "peaceful", "easy", "normal", "hard" });
/* 54:   */     }
/* 55:65 */     return null;
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bo
 * JD-Core Version:    0.7.0.1
 */