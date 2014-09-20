/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public abstract class act
/*  4:   */   extends xn
/*  5:   */   implements wt
/*  6:   */ {
/*  7:   */   public act(aqu paramaqu)
/*  8:   */   {
/*  9:20 */     super(paramaqu);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean aX()
/* 13:   */   {
/* 14:26 */     return true;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean bQ()
/* 18:   */   {
/* 19:31 */     return true;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean bR()
/* 23:   */   {
/* 24:36 */     return this.o.a(aQ(), this);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public int w()
/* 28:   */   {
/* 29:41 */     return 120;
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected boolean C()
/* 33:   */   {
/* 34:46 */     return true;
/* 35:   */   }
/* 36:   */   
/* 37:   */   protected int b(ahd paramahd)
/* 38:   */   {
/* 39:51 */     return 1 + this.o.s.nextInt(3);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void K()
/* 43:   */   {
/* 44:56 */     int i = aA();
/* 45:   */     
/* 46:58 */     super.K();
/* 47:60 */     if ((ai()) && (!V()))
/* 48:   */     {
/* 49:61 */       h(--i);
/* 50:62 */       if (aA() == -20)
/* 51:   */       {
/* 52:63 */         h(0);
/* 53:64 */         a(wh.f, 2.0F);
/* 54:   */       }
/* 55:   */     }
/* 56:   */     else
/* 57:   */     {
/* 58:67 */       h(300);
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public boolean aK()
/* 63:   */   {
/* 64:74 */     return false;
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     act
 * JD-Core Version:    0.7.0.1
 */