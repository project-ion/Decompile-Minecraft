/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class cp
/*  5:   */   extends z
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:17 */     return "spawnpoint";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:22 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ae paramae)
/* 18:   */   {
/* 19:27 */     return "commands.spawnpoint.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 23:   */   {
/* 24:32 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length < 4)) {
/* 25:33 */       throw new dp("commands.spawnpoint.usage", new Object[0]);
/* 26:   */     }
/* 27:36 */     qw localqw = paramArrayOfString.length > 0 ? a(paramae, paramArrayOfString[0]) : b(paramae);
/* 28:37 */     dt localdt = paramArrayOfString.length > 3 ? a(paramae, paramArrayOfString, 1, true) : localqw.c();
/* 29:38 */     if (localqw.o != null)
/* 30:   */     {
/* 31:39 */       localqw.a(localdt, true);
/* 32:40 */       a(paramae, this, "commands.spawnpoint.success", new Object[] { localqw.d_(), Integer.valueOf(localdt.n()), Integer.valueOf(localdt.o()), Integer.valueOf(localdt.p()) });
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 37:   */   {
/* 38:47 */     if (paramArrayOfString.length == 1) {
/* 39:48 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 40:   */     }
/* 41:49 */     if ((paramArrayOfString.length > 1) && (paramArrayOfString.length <= 4)) {
/* 42:50 */       return a(paramArrayOfString, 1, paramdt);
/* 43:   */     }
/* 44:53 */     return null;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 48:   */   {
/* 49:58 */     return paramInt == 0;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cp
 * JD-Core Version:    0.7.0.1
 */