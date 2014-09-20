/*  1:   */ import java.security.PrivateKey;
/*  2:   */ import java.security.PublicKey;
/*  3:   */ import javax.crypto.SecretKey;
/*  4:   */ 
/*  5:   */ public class nj
/*  6:   */   implements id
/*  7:   */ {
/*  8:13 */   private byte[] a = new byte[0];
/*  9:14 */   private byte[] b = new byte[0];
/* 10:   */   
/* 11:   */   public nj() {}
/* 12:   */   
/* 13:   */   public nj(SecretKey paramSecretKey, PublicKey paramPublicKey, byte[] paramArrayOfByte)
/* 14:   */   {
/* 15:21 */     this.a = ug.a(paramPublicKey, paramSecretKey.getEncoded());
/* 16:22 */     this.b = ug.a(paramPublicKey, paramArrayOfByte);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(hd paramhd)
/* 20:   */   {
/* 21:27 */     this.a = paramhd.a();
/* 22:28 */     this.b = paramhd.a();
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void b(hd paramhd)
/* 26:   */   {
/* 27:33 */     paramhd.a(this.a);
/* 28:34 */     paramhd.a(this.b);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(nh paramnh)
/* 32:   */   {
/* 33:39 */     paramnh.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public SecretKey a(PrivateKey paramPrivateKey)
/* 37:   */   {
/* 38:43 */     return ug.a(paramPrivateKey, this.a);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public byte[] b(PrivateKey paramPrivateKey)
/* 42:   */   {
/* 43:47 */     if (paramPrivateKey == null) {
/* 44:48 */       return this.b;
/* 45:   */     }
/* 46:50 */     return ug.b(paramPrivateKey, this.b);
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     nj
 * JD-Core Version:    0.7.0.1
 */