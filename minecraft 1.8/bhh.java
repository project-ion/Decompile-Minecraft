/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bhh
/*  5:   */   extends bhp
/*  6:   */ {
/*  7:   */   private final List a;
/*  8:   */   private final int b;
/*  9:   */   
/* 10:   */   public bhh(List paramList, int paramInt)
/* 11:   */   {
/* 12:20 */     this.a = paramList;
/* 13:21 */     this.b = paramInt;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 17:   */   {
/* 18:   */     atr localatr;
/* 19:27 */     while ((((localatr = paramaqu.p(paramdt).c()).r() == bof.a) || (localatr.r() == bof.j)) && (paramdt.o() > 1)) {
/* 20:28 */       paramdt = paramdt.b();
/* 21:   */     }
/* 22:31 */     if (paramdt.o() < 1) {
/* 23:32 */       return false;
/* 24:   */     }
/* 25:34 */     paramdt = paramdt.a();
/* 26:36 */     for (int i = 0; i < 4; i++)
/* 27:   */     {
/* 28:37 */       dt localdt1 = paramdt.a(paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(3) - paramRandom.nextInt(3), paramRandom.nextInt(4) - paramRandom.nextInt(4));
/* 29:39 */       if ((paramaqu.d(localdt1)) && (aqu.a(paramaqu, localdt1.b())))
/* 30:   */       {
/* 31:40 */         paramaqu.a(localdt1, aty.ae.P(), 2);
/* 32:   */         
/* 33:42 */         bcm localbcm = paramaqu.s(localdt1);
/* 34:43 */         if ((localbcm instanceof bcr)) {
/* 35:44 */           vl.a(paramRandom, this.a, (bcr)localbcm, this.b);
/* 36:   */         }
/* 37:47 */         dt localdt2 = localdt1.f();
/* 38:48 */         dt localdt3 = localdt1.e();
/* 39:49 */         dt localdt4 = localdt1.c();
/* 40:50 */         dt localdt5 = localdt1.d();
/* 41:51 */         if ((paramaqu.d(localdt3)) && (aqu.a(paramaqu, localdt3.b()))) {
/* 42:52 */           paramaqu.a(localdt3, aty.aa.P(), 2);
/* 43:   */         }
/* 44:54 */         if ((paramaqu.d(localdt2)) && (aqu.a(paramaqu, localdt2.b()))) {
/* 45:55 */           paramaqu.a(localdt2, aty.aa.P(), 2);
/* 46:   */         }
/* 47:57 */         if ((paramaqu.d(localdt4)) && (aqu.a(paramaqu, localdt4.b()))) {
/* 48:58 */           paramaqu.a(localdt4, aty.aa.P(), 2);
/* 49:   */         }
/* 50:60 */         if ((paramaqu.d(localdt5)) && (aqu.a(paramaqu, localdt5.b()))) {
/* 51:61 */           paramaqu.a(localdt5, aty.aa.P(), 2);
/* 52:   */         }
/* 53:63 */         return true;
/* 54:   */       }
/* 55:   */     }
/* 56:67 */     return false;
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhh
 * JD-Core Version:    0.7.0.1
 */