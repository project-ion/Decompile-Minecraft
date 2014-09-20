/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ahu
/*  4:   */   extends ahr
/*  5:   */ {
/*  6:   */   public ahu(aqu paramaqu)
/*  7:   */   {
/*  8:12 */     super(paramaqu);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public ahu(aqu paramaqu, xm paramxm)
/* 12:   */   {
/* 13:16 */     super(paramaqu, paramxm);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public ahu(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 17:   */   {
/* 18:20 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected float m()
/* 22:   */   {
/* 23:25 */     return 0.07F;
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected float j()
/* 27:   */   {
/* 28:30 */     return 0.7F;
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected float l()
/* 32:   */   {
/* 33:35 */     return -20.0F;
/* 34:   */   }
/* 35:   */   
/* 36:   */   protected void a(bru parambru)
/* 37:   */   {
/* 38:40 */     if (!this.o.D)
/* 39:   */     {
/* 40:41 */       this.o.b(2002, new dt(this), 0);
/* 41:   */       
/* 42:43 */       int i = 3 + this.o.s.nextInt(5) + this.o.s.nextInt(5);
/* 43:44 */       while (i > 0)
/* 44:   */       {
/* 45:45 */         int j = xk.a(i);
/* 46:46 */         i -= j;
/* 47:47 */         this.o.d(new xk(this.o, this.s, this.t, this.u, j));
/* 48:   */       }
/* 49:50 */       J();
/* 50:   */     }
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ahu
 * JD-Core Version:    0.7.0.1
 */