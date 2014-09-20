/*  1:   */ public class cdr
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   private cdy a;
/*  5:   */   private cdy b;
/*  6:   */   private cdy c;
/*  7:   */   
/*  8:   */   public cdr(float paramFloat, boolean paramBoolean)
/*  9:   */   {
/* 10:16 */     this.b = new cdy(this, "glass");
/* 11:17 */     this.b.a(0, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/* 12:   */     
/* 13:19 */     this.a = new cdy(this, "cube");
/* 14:20 */     this.a.a(32, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/* 15:22 */     if (paramBoolean)
/* 16:   */     {
/* 17:23 */       this.c = new cdy(this, "base");
/* 18:24 */       this.c.a(0, 16).a(-6.0F, 0.0F, -6.0F, 12, 4, 12);
/* 19:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(wv paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 23:   */   {
/* 24:30 */     cjm.E();
/* 25:31 */     cjm.a(2.0F, 2.0F, 2.0F);
/* 26:32 */     cjm.b(0.0F, -0.5F, 0.0F);
/* 27:33 */     if (this.c != null) {
/* 28:34 */       this.c.a(paramFloat6);
/* 29:   */     }
/* 30:36 */     cjm.b(paramFloat2, 0.0F, 1.0F, 0.0F);
/* 31:37 */     cjm.b(0.0F, 0.8F + paramFloat3, 0.0F);
/* 32:38 */     cjm.b(60.0F, 0.7071F, 0.0F, 0.7071F);
/* 33:39 */     this.b.a(paramFloat6);
/* 34:40 */     float f = 0.875F;
/* 35:41 */     cjm.a(f, f, f);
/* 36:42 */     cjm.b(60.0F, 0.7071F, 0.0F, 0.7071F);
/* 37:43 */     cjm.b(paramFloat2, 0.0F, 1.0F, 0.0F);
/* 38:44 */     this.b.a(paramFloat6);
/* 39:45 */     cjm.a(f, f, f);
/* 40:46 */     cjm.b(60.0F, 0.7071F, 0.0F, 0.7071F);
/* 41:47 */     cjm.b(paramFloat2, 0.0F, 1.0F, 0.0F);
/* 42:48 */     this.a.a(paramFloat6);
/* 43:49 */     cjm.F();
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cdr
 * JD-Core Version:    0.7.0.1
 */