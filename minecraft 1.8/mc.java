/*  1:   */ import java.io.IOException;
/*  2:   */ 
/*  3:   */ public class mc
/*  4:   */   implements id
/*  5:   */ {
/*  6:   */   private String a;
/*  7:   */   private hd b;
/*  8:   */   
/*  9:   */   public mc() {}
/* 10:   */   
/* 11:   */   public mc(String paramString, hd paramhd)
/* 12:   */   {
/* 13:29 */     this.a = paramString;
/* 14:30 */     this.b = paramhd;
/* 15:32 */     if (paramhd.writerIndex() > 32767) {
/* 16:33 */       throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
/* 17:   */     }
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(hd paramhd)
/* 21:   */   {
/* 22:39 */     this.a = paramhd.c(20);
/* 23:40 */     int i = paramhd.readableBytes();
/* 24:41 */     if ((i < 0) || (i > 32767)) {
/* 25:42 */       throw new IOException("Payload may not be larger than 32767 bytes");
/* 26:   */     }
/* 27:44 */     this.b = new hd(paramhd.readBytes(i));
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void b(hd paramhd)
/* 31:   */   {
/* 32:49 */     paramhd.a(this.a);
/* 33:50 */     paramhd.writeBytes(this.b);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(ls paramls)
/* 37:   */   {
/* 38:55 */     paramls.a(this);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String a()
/* 42:   */   {
/* 43:59 */     return this.a;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public hd b()
/* 47:   */   {
/* 48:63 */     return this.b;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     mc
 * JD-Core Version:    0.7.0.1
 */