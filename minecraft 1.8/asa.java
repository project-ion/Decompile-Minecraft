/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class asa
/*  5:   */   extends arm
/*  6:   */ {
/*  7:   */   public asa(int paramInt)
/*  8:   */   {
/*  9:12 */     super(paramInt);
/* 10:   */     
/* 11:   */ 
/* 12:15 */     this.au.clear();
/* 13:16 */     this.ak = aty.m.P();
/* 14:17 */     this.al = aty.m.P();
/* 15:   */     
/* 16:19 */     this.as.A = -999;
/* 17:20 */     this.as.D = 2;
/* 18:21 */     this.as.F = 50;
/* 19:22 */     this.as.G = 10;
/* 20:   */     
/* 21:24 */     this.au.clear();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(aqu paramaqu, Random paramRandom, dt paramdt)
/* 25:   */   {
/* 26:29 */     super.a(paramaqu, paramRandom, paramdt);
/* 27:31 */     if (paramRandom.nextInt(1000) == 0)
/* 28:   */     {
/* 29:32 */       int i = paramRandom.nextInt(16) + 8;
/* 30:33 */       int j = paramRandom.nextInt(16) + 8;
/* 31:34 */       dt localdt = paramaqu.m(paramdt.a(i, 0, j)).a();
/* 32:   */       
/* 33:36 */       new bhn().b(paramaqu, paramRandom, localdt);
/* 34:   */     }
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     asa
 * JD-Core Version:    0.7.0.1
 */