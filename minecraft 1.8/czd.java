/*   1:    */ import java.net.URL;
/*   2:    */ import java.net.URLConnection;
/*   3:    */ import java.net.URLStreamHandler;
/*   4:    */ 
/*   5:    */ final class czd
/*   6:    */   extends URLStreamHandler
/*   7:    */ {
/*   8:    */   czd(oa paramoa) {}
/*   9:    */   
/*  10:    */   protected URLConnection openConnection(URL paramURL)
/*  11:    */   {
/*  12:397 */     return new cze(this, paramURL);
/*  13:    */   }
/*  14:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     czd
 * JD-Core Version:    0.7.0.1
 */