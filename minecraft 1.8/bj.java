/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class bj
/*  5:   */   extends z
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:21 */     return "entitydata";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:26 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ae paramae)
/* 18:   */   {
/* 19:31 */     return "commands.entitydata.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 23:   */   {
/* 24:36 */     if (paramArrayOfString.length < 2) {
/* 25:37 */       throw new dp("commands.entitydata.usage", new Object[0]);
/* 26:   */     }
/* 27:40 */     wv localwv = b(paramae, paramArrayOfString[0]);
/* 28:41 */     if ((localwv instanceof ahd)) {
/* 29:42 */       throw new di("commands.entitydata.noPlayers", new Object[] { localwv.e_() });
/* 30:   */     }
/* 31:45 */     fn localfn1 = new fn();
/* 32:46 */     localwv.e(localfn1);
/* 33:47 */     fn localfn2 = (fn)localfn1.b();
/* 34:   */     fn localfn3;
/* 35:   */     try
/* 36:   */     {
/* 37:51 */       localfn3 = gg.a(a(paramae, paramArrayOfString, 1).c());
/* 38:   */     }
/* 39:   */     catch (gf localgf)
/* 40:   */     {
/* 41:53 */       throw new di("commands.entitydata.tagError", new Object[] { localgf.getMessage() });
/* 42:   */     }
/* 43:56 */     localfn3.o("UUIDMost");
/* 44:57 */     localfn3.o("UUIDLeast");
/* 45:   */     
/* 46:59 */     localfn1.a(localfn3);
/* 47:61 */     if (localfn1.equals(localfn2)) {
/* 48:62 */       throw new di("commands.entitydata.failed", new Object[] { localfn1.toString() });
/* 49:   */     }
/* 50:65 */     localwv.f(localfn1);
/* 51:   */     
/* 52:67 */     a(paramae, this, "commands.entitydata.success", new Object[] { localfn1.toString() });
/* 53:   */   }
/* 54:   */   
/* 55:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 56:   */   {
/* 57:73 */     if (paramArrayOfString.length == 1) {
/* 58:74 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 59:   */     }
/* 60:76 */     return null;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 64:   */   {
/* 65:81 */     return paramInt == 0;
/* 66:   */   }
/* 67:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bj
 * JD-Core Version:    0.7.0.1
 */