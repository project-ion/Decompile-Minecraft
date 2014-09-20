/*   1:    */ import java.io.InputStream;
/*   2:    */ import java.net.URL;
/*   3:    */ import java.net.URLConnection;
/*   4:    */ 
/*   5:    */ class cze
/*   6:    */   extends URLConnection
/*   7:    */ {
/*   8:    */   cze(czd paramczd, URL paramURL)
/*   9:    */   {
/*  10:397 */     super(paramURL);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void connect() {}
/*  14:    */   
/*  15:    */   public InputStream getInputStream()
/*  16:    */   {
/*  17:405 */     return bsu.z().O().a(this.a.a).b();
/*  18:    */   }
/*  19:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cze
 * JD-Core Version:    0.7.0.1
 */