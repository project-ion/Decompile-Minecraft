/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class ce
/*  4:   */   extends z
/*  5:   */ {
/*  6:   */   public String c()
/*  7:   */   {
/*  8:12 */     return "publish";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String c(ae paramae)
/* 12:   */   {
/* 13:17 */     return "commands.publish.usage";
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 17:   */   {
/* 18:22 */     String str = MinecraftServer.M().a(arc.b, false);
/* 19:23 */     if (str != null) {
/* 20:24 */       a(paramae, this, "commands.publish.started", new Object[] { str });
/* 21:   */     } else {
/* 22:26 */       a(paramae, this, "commands.publish.failed", new Object[0]);
/* 23:   */     }
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ce
 * JD-Core Version:    0.7.0.1
 */