/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class cq
/*  4:   */   extends z
/*  5:   */ {
/*  6:   */   public boolean a(ae paramae)
/*  7:   */   {
/*  8:14 */     return (MinecraftServer.M().S()) || (super.a(paramae));
/*  9:   */   }
/* 10:   */   
/* 11:   */   public String c()
/* 12:   */   {
/* 13:19 */     return "seed";
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int a()
/* 17:   */   {
/* 18:24 */     return 2;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String c(ae paramae)
/* 22:   */   {
/* 23:29 */     return "commands.seed.usage";
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 27:   */   {
/* 28:34 */     qt localqt = (paramae instanceof ahd) ? ((ahd)paramae).o : MinecraftServer.M().a(0);
/* 29:35 */     paramae.a(new hz("commands.seed.success", new Object[] { Long.valueOf(localqt.J()) }));
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cq
 * JD-Core Version:    0.7.0.1
 */