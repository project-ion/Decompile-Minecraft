/*  1:   */ import java.security.PublicKey;
/*  2:   */ 
/*  3:   */ public class ne
/*  4:   */   implements id
/*  5:   */ {
/*  6:   */   private String a;
/*  7:   */   private PublicKey b;
/*  8:   */   private byte[] c;
/*  9:   */   
/* 10:   */   public ne() {}
/* 11:   */   
/* 12:   */   public ne(String paramString, PublicKey paramPublicKey, byte[] paramArrayOfByte)
/* 13:   */   {
/* 14:20 */     this.a = paramString;
/* 15:21 */     this.b = paramPublicKey;
/* 16:22 */     this.c = paramArrayOfByte;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(hd paramhd)
/* 20:   */   {
/* 21:27 */     this.a = paramhd.c(20);
/* 22:28 */     this.b = ug.a(paramhd.a());
/* 23:29 */     this.c = paramhd.a();
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void b(hd paramhd)
/* 27:   */   {
/* 28:34 */     paramhd.a(this.a);
/* 29:35 */     paramhd.a(this.b.getEncoded());
/* 30:36 */     paramhd.a(this.c);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void a(nc paramnc)
/* 34:   */   {
/* 35:41 */     paramnc.a(this);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String a()
/* 39:   */   {
/* 40:45 */     return this.a;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public PublicKey b()
/* 44:   */   {
/* 45:49 */     return this.b;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public byte[] c()
/* 49:   */   {
/* 50:53 */     return this.c;
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ne
 * JD-Core Version:    0.7.0.1
 */