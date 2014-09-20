/*  1:   */ public class cxv
/*  2:   */   extends cxu
/*  3:   */ {
/*  4:   */   private final afg k;
/*  5:   */   
/*  6:   */   public cxv(afg paramafg)
/*  7:   */   {
/*  8:15 */     super(new oa("minecraft:mob.guardian.attack"));
/*  9:   */     
/* 10:17 */     this.k = paramafg;
/* 11:   */     
/* 12:19 */     this.i = cyf.a;
/* 13:20 */     this.g = true;
/* 14:21 */     this.h = 0;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void c()
/* 18:   */   {
/* 19:26 */     if ((this.k.I) || (!this.k.cn()))
/* 20:   */     {
/* 21:27 */       this.j = true;
/* 22:28 */       return;
/* 23:   */     }
/* 24:31 */     this.d = ((float)this.k.s);
/* 25:32 */     this.e = ((float)this.k.t);
/* 26:33 */     this.f = ((float)this.k.u);
/* 27:   */     
/* 28:35 */     float f = this.k.p(0.0F);
/* 29:36 */     this.b = (0.0F + 1.0F * f * f);
/* 30:37 */     this.c = (0.7F + 0.5F * f);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cxv
 * JD-Core Version:    0.7.0.1
 */