/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class cu
/*  4:   */   extends z
/*  5:   */ {
/*  6:   */   public String c()
/*  7:   */   {
/*  8:11 */     return "stop";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String c(ae paramae)
/* 12:   */   {
/* 13:16 */     return "commands.stop.usage";
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 17:   */   {
/* 18:21 */     if (MinecraftServer.M().c != null) {
/* 19:22 */       a(paramae, this, "commands.stop.start", new Object[0]);
/* 20:   */     }
/* 21:24 */     MinecraftServer.M().u();
/* 22:   */   }
/* 23:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cu
 * JD-Core Version:    0.7.0.1
 */