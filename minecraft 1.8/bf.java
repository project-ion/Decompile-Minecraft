/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class bf
/*  4:   */   extends bp
/*  5:   */ {
/*  6:   */   public String c()
/*  7:   */   {
/*  8:14 */     return "defaultgamemode";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String c(ae paramae)
/* 12:   */   {
/* 13:19 */     return "commands.defaultgamemode.usage";
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 17:   */   {
/* 18:24 */     if (paramArrayOfString.length <= 0) {
/* 19:25 */       throw new dp("commands.defaultgamemode.usage", new Object[0]);
/* 20:   */     }
/* 21:28 */     arc localarc = h(paramae, paramArrayOfString[0]);
/* 22:29 */     a(localarc);
/* 23:   */     
/* 24:31 */     a(paramae, this, "commands.defaultgamemode.success", new Object[] { new hz("gameMode." + localarc.b(), new Object[0]) });
/* 25:   */   }
/* 26:   */   
/* 27:   */   protected void a(arc paramarc)
/* 28:   */   {
/* 29:35 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 30:36 */     localMinecraftServer.a(paramarc);
/* 31:38 */     if (localMinecraftServer.av()) {
/* 32:39 */       for (qw localqw : MinecraftServer.M().an().e)
/* 33:   */       {
/* 34:40 */         localqw.a(paramarc);
/* 35:41 */         localqw.O = 0.0F;
/* 36:   */       }
/* 37:   */     }
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bf
 * JD-Core Version:    0.7.0.1
 */