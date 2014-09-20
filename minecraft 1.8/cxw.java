/*  1:   */ public class cxw
/*  2:   */   extends cxu
/*  3:   */ {
/*  4:   */   private final adx k;
/*  5:15 */   private float l = 0.0F;
/*  6:   */   
/*  7:   */   public cxw(adx paramadx)
/*  8:   */   {
/*  9:18 */     super(new oa("minecraft:minecart.base"));
/* 10:   */     
/* 11:20 */     this.k = paramadx;
/* 12:21 */     this.g = true;
/* 13:22 */     this.h = 0;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void c()
/* 17:   */   {
/* 18:27 */     if (this.k.I)
/* 19:   */     {
/* 20:28 */       this.j = true;
/* 21:29 */       return;
/* 22:   */     }
/* 23:32 */     this.d = ((float)this.k.s);
/* 24:33 */     this.e = ((float)this.k.t);
/* 25:34 */     this.f = ((float)this.k.u);
/* 26:   */     
/* 27:36 */     float f = uv.a(this.k.v * this.k.v + this.k.x * this.k.x);
/* 28:37 */     if (f >= 0.01D)
/* 29:   */     {
/* 30:38 */       this.l = uv.a(this.l + 0.0025F, 0.0F, 1.0F);
/* 31:   */       
/* 32:40 */       this.b = (0.0F + uv.a(f, 0.0F, 0.5F) * 0.7F);
/* 33:   */     }
/* 34:   */     else
/* 35:   */     {
/* 36:42 */       this.l = 0.0F;
/* 37:43 */       this.b = 0.0F;
/* 38:   */     }
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cxw
 * JD-Core Version:    0.7.0.1
 */