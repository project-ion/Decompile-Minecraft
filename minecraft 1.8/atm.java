/*  1:   */ import com.google.common.util.concurrent.ListeningExecutorService;
/*  2:   */ 
/*  3:   */ public class atm
/*  4:   */   extends atg
/*  5:   */ {
/*  6:   */   public atm()
/*  7:   */   {
/*  8:21 */     super(bof.s);
/*  9:22 */     c(3.0F);
/* 10:23 */     a(akf.f);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public bcm a(aqu paramaqu, int paramInt)
/* 14:   */   {
/* 15:28 */     return new bck();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 19:   */   {
/* 20:33 */     if (paramaqu.D) {
/* 21:34 */       return true;
/* 22:   */     }
/* 23:37 */     bcm localbcm = paramaqu.s(paramdt);
/* 24:38 */     if ((localbcm instanceof bck)) {
/* 25:39 */       paramahd.a((bck)localbcm);
/* 26:   */     }
/* 27:42 */     return true;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public boolean c()
/* 31:   */   {
/* 32:47 */     return false;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public boolean d()
/* 36:   */   {
/* 37:52 */     return false;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public int b()
/* 41:   */   {
/* 42:57 */     return 3;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm, amj paramamj)
/* 46:   */   {
/* 47:62 */     super.a(paramaqu, paramdt, parambec, paramxm, paramamj);
/* 48:64 */     if (paramamj.s())
/* 49:   */     {
/* 50:65 */       bcm localbcm = paramaqu.s(paramdt);
/* 51:66 */       if ((localbcm instanceof bck)) {
/* 52:67 */         ((bck)localbcm).a(paramamj.q());
/* 53:   */       }
/* 54:   */     }
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 58:   */   {
/* 59:74 */     bcm localbcm = paramaqu.s(paramdt);
/* 60:75 */     if ((localbcm instanceof bck))
/* 61:   */     {
/* 62:76 */       ((bck)localbcm).m();
/* 63:77 */       paramaqu.c(paramdt, this, 1, 0);
/* 64:   */     }
/* 65:   */   }
/* 66:   */   
/* 67:   */   public aql k()
/* 68:   */   {
/* 69:83 */     return aql.c;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public static void d(aqu paramaqu, dt paramdt)
/* 73:   */   {
/* 74:87 */     ui.a.submit(new atn(paramaqu, paramdt));
/* 75:   */   }
/* 76:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     atm
 * JD-Core Version:    0.7.0.1
 */