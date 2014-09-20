/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import com.google.common.collect.Lists;
/*  4:   */ import daw;
/*  5:   */ import gr;
/*  6:   */ import gy;
/*  7:   */ import hy;
/*  8:   */ import java.net.InetAddress;
/*  9:   */ import java.util.Collections;
/* 10:   */ import java.util.Iterator;
/* 11:   */ import java.util.List;
/* 12:   */ import mz;
/* 13:   */ import nx;
/* 14:   */ import org.apache.logging.log4j.LogManager;
/* 15:   */ import org.apache.logging.log4j.Logger;
/* 16:   */ 
/* 17:   */ public class RealmsServerStatusPinger
/* 18:   */ {
/* 19:20 */   private static final Logger LOGGER = ;
/* 20:22 */   private final List connections = Collections.synchronizedList(Lists.newArrayList());
/* 21:   */   
/* 22:   */   public void pingServer(String paramString, RealmsServerPing paramRealmsServerPing)
/* 23:   */   {
/* 24:25 */     if ((paramString == null) || (paramString.startsWith("0.0.0.0")) || (paramString.isEmpty())) {
/* 25:26 */       return;
/* 26:   */     }
/* 27:29 */     RealmsServerAddress localRealmsServerAddress = RealmsServerAddress.parseString(paramString);
/* 28:30 */     gr localgr = gr.a(InetAddress.getByName(localRealmsServerAddress.getHost()), localRealmsServerAddress.getPort());
/* 29:   */     
/* 30:32 */     this.connections.add(localgr);
/* 31:   */     
/* 32:34 */     localgr.a(new daw(this, paramRealmsServerPing, localgr, paramString));
/* 33:   */     try
/* 34:   */     {
/* 35:67 */       localgr.a(new mz(RealmsSharedConstants.NETWORK_PROTOCOL_VERSION, localRealmsServerAddress.getHost(), localRealmsServerAddress.getPort(), gy.c));
/* 36:68 */       localgr.a(new nx());
/* 37:   */     }
/* 38:   */     catch (Throwable localThrowable)
/* 39:   */     {
/* 40:70 */       LOGGER.error(localThrowable);
/* 41:   */     }
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void tick()
/* 45:   */   {
/* 46:75 */     synchronized (this.connections)
/* 47:   */     {
/* 48:76 */       Iterator localIterator = this.connections.iterator();
/* 49:77 */       while (localIterator.hasNext())
/* 50:   */       {
/* 51:78 */         gr localgr = (gr)localIterator.next();
/* 52:80 */         if (localgr.g())
/* 53:   */         {
/* 54:81 */           localgr.a();
/* 55:   */         }
/* 56:   */         else
/* 57:   */         {
/* 58:83 */           localIterator.remove();
/* 59:84 */           localgr.l();
/* 60:   */         }
/* 61:   */       }
/* 62:   */     }
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void removeAll()
/* 66:   */   {
/* 67:91 */     synchronized (this.connections)
/* 68:   */     {
/* 69:92 */       Iterator localIterator = this.connections.iterator();
/* 70:93 */       while (localIterator.hasNext())
/* 71:   */       {
/* 72:94 */         gr localgr = (gr)localIterator.next();
/* 73:96 */         if (localgr.g())
/* 74:   */         {
/* 75:97 */           localIterator.remove();
/* 76:98 */           localgr.a(new hy("Cancelled"));
/* 77:   */         }
/* 78:   */       }
/* 79:   */     }
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsServerStatusPinger
 * JD-Core Version:    0.7.0.1
 */