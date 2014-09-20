/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class az
/*  5:   */   extends z
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:22 */     return "clear";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public String c(ae paramae)
/* 13:   */   {
/* 14:27 */     return "commands.clear.usage";
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int a()
/* 18:   */   {
/* 19:32 */     return 2;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 23:   */   {
/* 24:37 */     qw localqw = paramArrayOfString.length == 0 ? b(paramae) : a(paramae, paramArrayOfString[0]);
/* 25:38 */     alq localalq = paramArrayOfString.length >= 2 ? f(paramae, paramArrayOfString[1]) : null;
/* 26:39 */     int i = paramArrayOfString.length >= 3 ? a(paramArrayOfString[2], -1) : -1;
/* 27:40 */     int j = paramArrayOfString.length >= 4 ? a(paramArrayOfString[3], -1) : -1;
/* 28:   */     
/* 29:42 */     fn localfn = null;
/* 30:43 */     if (paramArrayOfString.length >= 5) {
/* 31:   */       try
/* 32:   */       {
/* 33:45 */         localfn = gg.a(a(paramArrayOfString, 4));
/* 34:   */       }
/* 35:   */       catch (gf localgf)
/* 36:   */       {
/* 37:47 */         throw new di("commands.clear.tagError", new Object[] { localgf.getMessage() });
/* 38:   */       }
/* 39:   */     }
/* 40:51 */     if ((paramArrayOfString.length >= 2) && (localalq == null)) {
/* 41:52 */       throw new di("commands.clear.failure", new Object[] { localqw.d_() });
/* 42:   */     }
/* 43:55 */     int k = localqw.bg.a(localalq, i, j, localfn);
/* 44:56 */     localqw.bh.b();
/* 45:57 */     if (!localqw.by.d) {
/* 46:58 */       localqw.o();
/* 47:   */     }
/* 48:61 */     paramae.a(ag.d, k);
/* 49:62 */     if (k == 0) {
/* 50:63 */       throw new di("commands.clear.failure", new Object[] { localqw.d_() });
/* 51:   */     }
/* 52:66 */     if (j == 0) {
/* 53:67 */       paramae.a(new hz("commands.clear.testing", new Object[] { localqw.d_(), Integer.valueOf(k) }));
/* 54:   */     } else {
/* 55:69 */       a(paramae, this, "commands.clear.success", new Object[] { localqw.d_(), Integer.valueOf(k) });
/* 56:   */     }
/* 57:   */   }
/* 58:   */   
/* 59:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 60:   */   {
/* 61:76 */     if (paramArrayOfString.length == 1) {
/* 62:77 */       return a(paramArrayOfString, d());
/* 63:   */     }
/* 64:79 */     if (paramArrayOfString.length == 2) {
/* 65:80 */       return a(paramArrayOfString, alq.e.c());
/* 66:   */     }
/* 67:83 */     return null;
/* 68:   */   }
/* 69:   */   
/* 70:   */   protected String[] d()
/* 71:   */   {
/* 72:87 */     return MinecraftServer.M().I();
/* 73:   */   }
/* 74:   */   
/* 75:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 76:   */   {
/* 77:92 */     return paramInt == 0;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     az
 * JD-Core Version:    0.7.0.1
 */