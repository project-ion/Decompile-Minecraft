/*  1:   */ import net.minecraft.realms.Realms;
/*  2:   */ import net.minecraft.realms.RealmsServerPing;
/*  3:   */ import net.minecraft.realms.RealmsServerStatusPinger;
/*  4:   */ import org.apache.logging.log4j.Logger;
/*  5:   */ 
/*  6:   */ public class daw
/*  7:   */   implements nm
/*  8:   */ {
/*  9:35 */   private boolean e = false;
/* 10:   */   
/* 11:   */   public daw(RealmsServerStatusPinger paramRealmsServerStatusPinger, RealmsServerPing paramRealmsServerPing, gr paramgr, String paramString) {}
/* 12:   */   
/* 13:   */   public void a(no paramno)
/* 14:   */   {
/* 15:38 */     np localnp = paramno.a();
/* 16:40 */     if (localnp.b() != null) {
/* 17:41 */       this.a.nrOfPlayers = String.valueOf(localnp.b().b());
/* 18:   */     }
/* 19:44 */     this.b.a(new nw(Realms.currentTimeMillis()));
/* 20:45 */     this.e = true;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(nn paramnn)
/* 24:   */   {
/* 25:50 */     this.b.a(new hy("Finished"));
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(ho paramho)
/* 29:   */   {
/* 30:55 */     if (!this.e) {
/* 31:56 */       RealmsServerStatusPinger.access$000().error("Can't ping " + this.c + ": " + paramho.c());
/* 32:   */     }
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     daw
 * JD-Core Version:    0.7.0.1
 */