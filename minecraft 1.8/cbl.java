/*  1:   */ import java.net.Authenticator;
/*  2:   */ import java.net.PasswordAuthentication;
/*  3:   */ 
/*  4:   */ public final class cbl
/*  5:   */   extends Authenticator
/*  6:   */ {
/*  7:   */   public cbl(String paramString1, String paramString2) {}
/*  8:   */   
/*  9:   */   protected PasswordAuthentication getPasswordAuthentication()
/* 10:   */   {
/* 11:75 */     return new PasswordAuthentication(this.a, this.b.toCharArray());
/* 12:   */   }
/* 13:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cbl
 * JD-Core Version:    0.7.0.1
 */