/*  1:   */ public class cdi
/*  2:   */ {
/*  3:   */   public brw a;
/*  4:   */   public float b;
/*  5:   */   public float c;
/*  6:   */   
/*  7:   */   public cdi(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
/*  8:   */   {
/*  9:11 */     this(new brw(paramFloat1, paramFloat2, paramFloat3), paramFloat4, paramFloat5);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public cdi a(float paramFloat1, float paramFloat2)
/* 13:   */   {
/* 14:15 */     return new cdi(this, paramFloat1, paramFloat2);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public cdi(cdi paramcdi, float paramFloat1, float paramFloat2)
/* 18:   */   {
/* 19:19 */     this.a = paramcdi.a;
/* 20:20 */     this.b = paramFloat1;
/* 21:21 */     this.c = paramFloat2;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public cdi(brw parambrw, float paramFloat1, float paramFloat2)
/* 25:   */   {
/* 26:25 */     this.a = parambrw;
/* 27:26 */     this.b = paramFloat1;
/* 28:27 */     this.c = paramFloat2;
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cdi
 * JD-Core Version:    0.7.0.1
 */