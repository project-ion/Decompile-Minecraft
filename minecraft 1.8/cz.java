/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class cz
/*  5:   */   extends z
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:20 */     return "testfor";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:25 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ae paramae)
/* 18:   */   {
/* 19:30 */     return "commands.testfor.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 23:   */   {
/* 24:35 */     if (paramArrayOfString.length < 1) {
/* 25:36 */       throw new dp("commands.testfor.usage", new Object[0]);
/* 26:   */     }
/* 27:39 */     wv localwv = b(paramae, paramArrayOfString[0]);
/* 28:40 */     fn localfn1 = null;
/* 29:41 */     if (paramArrayOfString.length >= 2) {
/* 30:   */       try
/* 31:   */       {
/* 32:43 */         localfn1 = gg.a(a(paramArrayOfString, 1));
/* 33:   */       }
/* 34:   */       catch (gf localgf)
/* 35:   */       {
/* 36:45 */         throw new di("commands.testfor.tagError", new Object[] { localgf.getMessage() });
/* 37:   */       }
/* 38:   */     }
/* 39:49 */     if (localfn1 != null)
/* 40:   */     {
/* 41:50 */       fn localfn2 = new fn();
/* 42:51 */       localwv.e(localfn2);
/* 43:52 */       if (!cy.a(localfn1, localfn2, true)) {
/* 44:53 */         throw new di("commands.testfor.failure", new Object[] { localwv.d_() });
/* 45:   */       }
/* 46:   */     }
/* 47:57 */     a(paramae, this, "commands.testfor.success", new Object[] { localwv.d_() });
/* 48:   */   }
/* 49:   */   
/* 50:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 51:   */   {
/* 52:62 */     return paramInt == 0;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 56:   */   {
/* 57:68 */     if (paramArrayOfString.length == 1) {
/* 58:69 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 59:   */     }
/* 60:71 */     return null;
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cz
 * JD-Core Version:    0.7.0.1
 */