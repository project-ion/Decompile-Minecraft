/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bax
/*  4:   */   extends axl
/*  5:   */ {
/*  6:   */   protected bax(bof parambof)
/*  7:   */   {
/*  8:14 */     super(parambof);
/*  9:   */     
/* 10:16 */     a(false);
/* 11:17 */     if (parambof == bof.i) {
/* 12:18 */       a(true);
/* 13:   */     }
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/* 17:   */   {
/* 18:24 */     if (!e(paramaqu, paramdt, parambec)) {
/* 19:25 */       f(paramaqu, paramdt, parambec);
/* 20:   */     }
/* 21:   */   }
/* 22:   */   
/* 23:   */   private void f(aqu paramaqu, dt paramdt, bec parambec)
/* 24:   */   {
/* 25:30 */     avn localavn = a(this.J);
/* 26:31 */     paramaqu.a(paramdt, localavn.P().a(b, parambec.b(b)), 2);
/* 27:32 */     paramaqu.a(paramdt, localavn, a(paramaqu));
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/* 31:   */   {
/* 32:37 */     if (this.J != bof.i) {
/* 33:38 */       return;
/* 34:   */     }
/* 35:41 */     if (!paramaqu.Q().b("doFireTick")) {
/* 36:42 */       return;
/* 37:   */     }
/* 38:45 */     int i = paramRandom.nextInt(3);
/* 39:46 */     if (i > 0)
/* 40:   */     {
/* 41:47 */       dt localdt1 = paramdt;
/* 42:49 */       for (int k = 0; k < i; k++)
/* 43:   */       {
/* 44:50 */         localdt1 = localdt1.a(paramRandom.nextInt(3) - 1, 1, paramRandom.nextInt(3) - 1);
/* 45:51 */         atr localatr = paramaqu.p(localdt1).c();
/* 46:52 */         if (localatr.J == bof.a)
/* 47:   */         {
/* 48:53 */           if (e(paramaqu, localdt1)) {
/* 49:54 */             paramaqu.a(localdt1, aty.ab.P());
/* 50:   */           }
/* 51:   */         }
/* 52:57 */         else if (localatr.J.c()) {
/* 53:58 */           return;
/* 54:   */         }
/* 55:   */       }
/* 56:   */     }
/* 57:   */     else
/* 58:   */     {
/* 59:62 */       for (int j = 0; j < 3; j++)
/* 60:   */       {
/* 61:63 */         dt localdt2 = paramdt.a(paramRandom.nextInt(3) - 1, 0, paramRandom.nextInt(3) - 1);
/* 62:64 */         if ((paramaqu.d(localdt2.a())) && (m(paramaqu, localdt2))) {
/* 63:65 */           paramaqu.a(localdt2.a(), aty.ab.P());
/* 64:   */         }
/* 65:   */       }
/* 66:   */     }
/* 67:   */   }
/* 68:   */   
/* 69:   */   protected boolean e(aqu paramaqu, dt paramdt)
/* 70:   */   {
/* 71:72 */     for (ej localej : ) {
/* 72:73 */       if (m(paramaqu, paramdt.a(localej))) {
/* 73:74 */         return true;
/* 74:   */       }
/* 75:   */     }
/* 76:77 */     return false;
/* 77:   */   }
/* 78:   */   
/* 79:   */   private boolean m(aqu paramaqu, dt paramdt)
/* 80:   */   {
/* 81:81 */     return paramaqu.p(paramdt).c().r().h();
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bax
 * JD-Core Version:    0.7.0.1
 */