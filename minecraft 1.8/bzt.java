/*  1:   */ import java.net.UnknownHostException;
/*  2:   */ 
/*  3:   */ class bzt
/*  4:   */   implements Runnable
/*  5:   */ {
/*  6:   */   bzt(bzs parambzs) {}
/*  7:   */   
/*  8:   */   public void run()
/*  9:   */   {
/* 10:   */     try
/* 11:   */     {
/* 12:73 */       bzs.b(this.a).g().a(bzs.a(this.a));
/* 13:   */     }
/* 14:   */     catch (UnknownHostException localUnknownHostException)
/* 15:   */     {
/* 16:75 */       bzs.a(this.a).e = -1L;
/* 17:76 */       bzs.a(this.a).d = (a.e + "Can't resolve hostname");
/* 18:   */     }
/* 19:   */     catch (Exception localException)
/* 20:   */     {
/* 21:78 */       bzs.a(this.a).e = -1L;
/* 22:79 */       bzs.a(this.a).d = (a.e + "Can't connect to server.");
/* 23:   */     }
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bzt
 * JD-Core Version:    0.7.0.1
 */