/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class auc
/*  4:   */   extends atr
/*  5:   */ {
/*  6:   */   protected auc(bof parambof)
/*  7:   */   {
/*  8:16 */     super(parambof);
/*  9:17 */     a(true);
/* 10:18 */     float f = 0.2F;
/* 11:19 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
/* 12:20 */     a(akf.c);
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected auc()
/* 16:   */   {
/* 17:24 */     this(bof.k);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean c(aqu paramaqu, dt paramdt)
/* 21:   */   {
/* 22:29 */     return (super.c(paramaqu, paramdt)) && (c(paramaqu.p(paramdt.b()).c()));
/* 23:   */   }
/* 24:   */   
/* 25:   */   protected boolean c(atr paramatr)
/* 26:   */   {
/* 27:33 */     return (paramatr == aty.c) || (paramatr == aty.d) || (paramatr == aty.ak);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 31:   */   {
/* 32:38 */     super.a(paramaqu, paramdt, parambec, paramatr);
/* 33:39 */     e(paramaqu, paramdt, parambec);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 37:   */   {
/* 38:44 */     e(paramaqu, paramdt, parambec);
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void e(aqu paramaqu, dt paramdt, bec parambec)
/* 42:   */   {
/* 43:48 */     if (!f(paramaqu, paramdt, parambec))
/* 44:   */     {
/* 45:49 */       b(paramaqu, paramdt, parambec, 0);
/* 46:50 */       paramaqu.a(paramdt, aty.a.P(), 3);
/* 47:   */     }
/* 48:   */   }
/* 49:   */   
/* 50:   */   public boolean f(aqu paramaqu, dt paramdt, bec parambec)
/* 51:   */   {
/* 52:55 */     return c(paramaqu.p(paramdt.b()).c());
/* 53:   */   }
/* 54:   */   
/* 55:   */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/* 56:   */   {
/* 57:61 */     return null;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public boolean c()
/* 61:   */   {
/* 62:66 */     return false;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public boolean d()
/* 66:   */   {
/* 67:71 */     return false;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public aql k()
/* 71:   */   {
/* 72:76 */     return aql.c;
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     auc
 * JD-Core Version:    0.7.0.1
 */