/*  1:   */ public class cxx
/*  2:   */   extends cxu
/*  3:   */ {
/*  4:   */   private final ahd k;
/*  5:   */   private final adx l;
/*  6:   */   
/*  7:   */   public cxx(ahd paramahd, adx paramadx)
/*  8:   */   {
/*  9:16 */     super(new oa("minecraft:minecart.inside"));
/* 10:   */     
/* 11:18 */     this.k = paramahd;
/* 12:19 */     this.l = paramadx;
/* 13:   */     
/* 14:21 */     this.i = cyf.a;
/* 15:22 */     this.g = true;
/* 16:23 */     this.h = 0;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void c()
/* 20:   */   {
/* 21:28 */     if ((this.l.I) || (!this.k.av()) || (this.k.m != this.l))
/* 22:   */     {
/* 23:29 */       this.j = true;
/* 24:30 */       return;
/* 25:   */     }
/* 26:33 */     float f = uv.a(this.l.v * this.l.v + this.l.x * this.l.x);
/* 27:34 */     if (f >= 0.01D) {
/* 28:35 */       this.b = (0.0F + uv.a(f, 0.0F, 1.0F) * 0.75F);
/* 29:   */     } else {
/* 30:37 */       this.b = 0.0F;
/* 31:   */     }
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cxx
 * JD-Core Version:    0.7.0.1
 */