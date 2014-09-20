/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class asr
/*  4:   */   extends asl
/*  5:   */ {
/*  6:   */   public asr(int paramInt, arm paramarm)
/*  7:   */   {
/*  8:61 */     super(paramInt, paramarm);
/*  9:   */     
/* 10:63 */     this.as.A = 2;
/* 11:64 */     this.as.B = 2;
/* 12:65 */     this.as.C = 5;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(aqu paramaqu, Random paramRandom, bgk parambgk, int paramInt1, int paramInt2, double paramDouble)
/* 16:   */   {
/* 17:70 */     this.ak = aty.c.P();
/* 18:71 */     this.al = aty.d.P();
/* 19:72 */     if (paramDouble > 1.75D)
/* 20:   */     {
/* 21:73 */       this.ak = aty.b.P();
/* 22:74 */       this.al = aty.b.P();
/* 23:   */     }
/* 24:75 */     else if (paramDouble > -0.5D)
/* 25:   */     {
/* 26:76 */       this.ak = aty.d.P().a(avc.a, avd.b);
/* 27:   */     }
/* 28:78 */     b(paramaqu, paramRandom, parambgk, paramInt1, paramInt2, paramDouble);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(aqu paramaqu, Random paramRandom, dt paramdt)
/* 32:   */   {
/* 33:83 */     this.as.a(paramaqu, paramRandom, this, paramdt);
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     asr
 * JD-Core Version:    0.7.0.1
 */