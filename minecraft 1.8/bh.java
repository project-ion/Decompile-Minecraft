/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bh
/*  5:   */   extends z
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:19 */     return "me";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:24 */     return 0;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ae paramae)
/* 18:   */   {
/* 19:29 */     return "commands.me.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 23:   */   {
/* 24:34 */     if (paramArrayOfString.length <= 0) {
/* 25:35 */       throw new dp("commands.me.usage", new Object[0]);
/* 26:   */     }
/* 27:38 */     ho localho = b(paramae, paramArrayOfString, 0, !(paramae instanceof ahd));
/* 28:39 */     MinecraftServer.M().an().a(new hz("chat.type.emote", new Object[] { paramae.e_(), localho }));
/* 29:   */   }
/* 30:   */   
/* 31:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 32:   */   {
/* 33:45 */     return a(paramArrayOfString, MinecraftServer.M().I());
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bh
 * JD-Core Version:    0.7.0.1
 */