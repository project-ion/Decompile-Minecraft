/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bcb
/*  4:   */   extends auc
/*  5:   */ {
/*  6:   */   protected bcb()
/*  7:   */   {
/*  8:21 */     float f1 = 0.5F;
/*  9:22 */     float f2 = 0.015625F;
/* 10:23 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/* 11:24 */     a(akf.c);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/* 15:   */   {
/* 16:29 */     if ((paramwv == null) || (!(paramwv instanceof adu))) {
/* 17:30 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 18:   */     }
/* 19:   */   }
/* 20:   */   
/* 21:   */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/* 22:   */   {
/* 23:37 */     return new brt(paramdt.n() + this.B, paramdt.o() + this.C, paramdt.p() + this.D, paramdt.n() + this.E, paramdt.o() + this.F, paramdt.p() + this.G);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int F()
/* 27:   */   {
/* 28:42 */     return 7455580;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public int h(bec parambec)
/* 32:   */   {
/* 33:47 */     return 7455580;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a(ard paramard, dt paramdt, int paramInt)
/* 37:   */   {
/* 38:52 */     return 2129968;
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected boolean c(atr paramatr)
/* 42:   */   {
/* 43:57 */     return paramatr == aty.j;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public boolean f(aqu paramaqu, dt paramdt, bec parambec)
/* 47:   */   {
/* 48:62 */     if ((paramdt.o() < 0) || (paramdt.o() >= 256)) {
/* 49:63 */       return false;
/* 50:   */     }
/* 51:65 */     bec localbec = paramaqu.p(paramdt.b());
/* 52:66 */     return (localbec.c().r() == bof.h) && (((Integer)localbec.b(axl.b)).intValue() == 0);
/* 53:   */   }
/* 54:   */   
/* 55:   */   public int c(bec parambec)
/* 56:   */   {
/* 57:71 */     return 0;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcb
 * JD-Core Version:    0.7.0.1
 */