/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bp
/*  5:   */   extends z
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:24 */     return "gamemode";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:29 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ae paramae)
/* 18:   */   {
/* 19:34 */     return "commands.gamemode.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 23:   */   {
/* 24:39 */     if (paramArrayOfString.length <= 0) {
/* 25:40 */       throw new dp("commands.gamemode.usage", new Object[0]);
/* 26:   */     }
/* 27:43 */     arc localarc = h(paramae, paramArrayOfString[0]);
/* 28:44 */     qw localqw = paramArrayOfString.length >= 2 ? a(paramae, paramArrayOfString[1]) : b(paramae);
/* 29:   */     
/* 30:46 */     localqw.a(localarc);
/* 31:47 */     localqw.O = 0.0F;
/* 32:48 */     if (paramae.e().Q().b("sendCommandFeedback")) {
/* 33:49 */       localqw.a(new hz("gameMode.changed", new Object[0]));
/* 34:   */     }
/* 35:52 */     hz localhz = new hz("gameMode." + localarc.b(), new Object[0]);
/* 36:53 */     if (localqw != paramae) {
/* 37:54 */       a(paramae, this, 1, "commands.gamemode.success.other", new Object[] { localqw.d_(), localhz });
/* 38:   */     } else {
/* 39:56 */       a(paramae, this, 1, "commands.gamemode.success.self", new Object[] { localhz });
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   protected arc h(ae paramae, String paramString)
/* 44:   */   {
/* 45:61 */     if ((paramString.equalsIgnoreCase(arc.b.b())) || (paramString.equalsIgnoreCase("s"))) {
/* 46:62 */       return arc.b;
/* 47:   */     }
/* 48:63 */     if ((paramString.equalsIgnoreCase(arc.c.b())) || (paramString.equalsIgnoreCase("c"))) {
/* 49:64 */       return arc.c;
/* 50:   */     }
/* 51:65 */     if ((paramString.equalsIgnoreCase(arc.d.b())) || (paramString.equalsIgnoreCase("a"))) {
/* 52:66 */       return arc.d;
/* 53:   */     }
/* 54:67 */     if ((paramString.equalsIgnoreCase(arc.e.b())) || (paramString.equalsIgnoreCase("sp"))) {
/* 55:68 */       return arc.e;
/* 56:   */     }
/* 57:70 */     return arb.a(a(paramString, 0, arc.values().length - 2));
/* 58:   */   }
/* 59:   */   
/* 60:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 61:   */   {
/* 62:77 */     if (paramArrayOfString.length == 1) {
/* 63:78 */       return a(paramArrayOfString, new String[] { "survival", "creative", "adventure", "spectator" });
/* 64:   */     }
/* 65:79 */     if (paramArrayOfString.length == 2) {
/* 66:80 */       return a(paramArrayOfString, d());
/* 67:   */     }
/* 68:83 */     return null;
/* 69:   */   }
/* 70:   */   
/* 71:   */   protected String[] d()
/* 72:   */   {
/* 73:87 */     return MinecraftServer.M().I();
/* 74:   */   }
/* 75:   */   
/* 76:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 77:   */   {
/* 78:92 */     return paramInt == 1;
/* 79:   */   }
/* 80:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bp
 * JD-Core Version:    0.7.0.1
 */