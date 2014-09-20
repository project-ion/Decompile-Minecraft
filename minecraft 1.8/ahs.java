/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ahs
/*  4:   */   extends ahr
/*  5:   */ {
/*  6:   */   public ahs(aqu paramaqu)
/*  7:   */   {
/*  8:14 */     super(paramaqu);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public ahs(aqu paramaqu, xm paramxm)
/* 12:   */   {
/* 13:18 */     super(paramaqu, paramxm);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public ahs(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 17:   */   {
/* 18:22 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected void a(bru parambru)
/* 22:   */   {
/* 23:27 */     if (parambru.d != null) {
/* 24:28 */       parambru.d.a(wh.a(this, n()), 0.0F);
/* 25:   */     }
/* 26:30 */     if ((!this.o.D) && (this.V.nextInt(8) == 0))
/* 27:   */     {
/* 28:31 */       int i = 1;
/* 29:32 */       if (this.V.nextInt(32) == 0) {
/* 30:33 */         i = 4;
/* 31:   */       }
/* 32:35 */       for (int j = 0; j < i; j++)
/* 33:   */       {
/* 34:36 */         abr localabr = new abr(this.o);
/* 35:37 */         localabr.b(-24000);
/* 36:   */         
/* 37:39 */         localabr.b(this.s, this.t, this.u, this.y, 0.0F);
/* 38:40 */         this.o.d(localabr);
/* 39:   */       }
/* 40:   */     }
/* 41:44 */     double d = 0.08D;
/* 42:45 */     for (int k = 0; k < 8; k++) {
/* 43:46 */       this.o.a(ew.K, this.s, this.t, this.u, (this.V.nextFloat() - 0.5D) * 0.08D, (this.V.nextFloat() - 0.5D) * 0.08D, (this.V.nextFloat() - 0.5D) * 0.08D, new int[] { alq.b(amk.aP) });
/* 44:   */     }
/* 45:49 */     if (!this.o.D) {
/* 46:50 */       J();
/* 47:   */     }
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahs
 * JD-Core Version:    0.7.0.1
 */