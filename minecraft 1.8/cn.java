/*  1:   */ import java.util.List;
/*  2:   */ import net.minecraft.server.MinecraftServer;
/*  3:   */ 
/*  4:   */ public class cn
/*  5:   */   extends z
/*  6:   */ {
/*  7:   */   public String c()
/*  8:   */   {
/*  9:17 */     return "setworldspawn";
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a()
/* 13:   */   {
/* 14:22 */     return 2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public String c(ae paramae)
/* 18:   */   {
/* 19:27 */     return "commands.setworldspawn.usage";
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ae paramae, String[] paramArrayOfString)
/* 23:   */   {
/* 24:   */     dt localdt;
/* 25:33 */     if (paramArrayOfString.length == 0) {
/* 26:34 */       localdt = b(paramae).c();
/* 27:35 */     } else if ((paramArrayOfString.length == 3) && (paramae.e() != null)) {
/* 28:36 */       localdt = a(paramae, paramArrayOfString, 0, true);
/* 29:   */     } else {
/* 30:38 */       throw new dp("commands.setworldspawn.usage", new Object[0]);
/* 31:   */     }
/* 32:41 */     paramae.e().B(localdt);
/* 33:42 */     MinecraftServer.M().an().a(new lh(localdt));
/* 34:43 */     a(paramae, this, "commands.setworldspawn.success", new Object[] { Integer.valueOf(localdt.n()), Integer.valueOf(localdt.o()), Integer.valueOf(localdt.p()) });
/* 35:   */   }
/* 36:   */   
/* 37:   */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 38:   */   {
/* 39:49 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length <= 3)) {
/* 40:50 */       return a(paramArrayOfString, 0, paramdt);
/* 41:   */     }
/* 42:52 */     return null;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cn
 * JD-Core Version:    0.7.0.1
 */