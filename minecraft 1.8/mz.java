/*  1:   */ public class mz
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private String b;
/*  6:   */   private int c;
/*  7:   */   private gy d;
/*  8:   */   
/*  9:   */   public mz() {}
/* 10:   */   
/* 11:   */   public mz(int paramInt1, String paramString, int paramInt2, gy paramgy)
/* 12:   */   {
/* 13:24 */     this.a = paramInt1;
/* 14:25 */     this.b = paramString;
/* 15:26 */     this.c = paramInt2;
/* 16:27 */     this.d = paramgy;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(hd paramhd)
/* 20:   */   {
/* 21:32 */     this.a = paramhd.e();
/* 22:33 */     this.b = paramhd.c(255);
/* 23:34 */     this.c = paramhd.readUnsignedShort();
/* 24:35 */     this.d = gy.a(paramhd.e());
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void b(hd paramhd)
/* 28:   */   {
/* 29:40 */     paramhd.b(this.a);
/* 30:41 */     paramhd.a(this.b);
/* 31:42 */     paramhd.writeShort(this.c);
/* 32:43 */     paramhd.b(this.d.a());
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void a(na paramna)
/* 36:   */   {
/* 37:48 */     paramna.a(this);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public gy a()
/* 41:   */   {
/* 42:52 */     return this.d;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int b()
/* 46:   */   {
/* 47:56 */     return this.a;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     mz
 * JD-Core Version:    0.7.0.1
 */