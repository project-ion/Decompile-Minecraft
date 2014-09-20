/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import dav;
/*  4:   */ import gr;
/*  5:   */ import org.apache.logging.log4j.LogManager;
/*  6:   */ import org.apache.logging.log4j.Logger;
/*  7:   */ 
/*  8:   */ public class RealmsConnect
/*  9:   */ {
/* 10:18 */   private static final Logger LOGGER = ;
/* 11:   */   private final RealmsScreen onlineScreen;
/* 12:21 */   private volatile boolean aborted = false;
/* 13:   */   private gr connection;
/* 14:   */   
/* 15:   */   public RealmsConnect(RealmsScreen paramRealmsScreen)
/* 16:   */   {
/* 17:25 */     this.onlineScreen = paramRealmsScreen;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void connect(String paramString, int paramInt)
/* 21:   */   {
/* 22:29 */     new dav(this, "Realms-connect-task", paramString, paramInt).start();
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void abort()
/* 26:   */   {
/* 27:74 */     this.aborted = true;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void tick()
/* 31:   */   {
/* 32:78 */     if (this.connection != null) {
/* 33:79 */       if (this.connection.g()) {
/* 34:80 */         this.connection.a();
/* 35:   */       } else {
/* 36:82 */         this.connection.l();
/* 37:   */       }
/* 38:   */     }
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsConnect
 * JD-Core Version:    0.7.0.1
 */