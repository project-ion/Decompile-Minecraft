/*  1:   */ import com.google.common.base.Predicates;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bhn
/*  5:   */   extends bhp
/*  6:   */ {
/*  7:15 */   private static final beq a = beq.a(aty.m).a(bab.a, Predicates.equalTo(bac.a));
/*  8:16 */   private final bec b = aty.U.P().a(bbf.M, bbg.b).a(awq.a, awr.b);
/*  9:17 */   private final bec c = aty.A.P();
/* 10:18 */   private final bec d = aty.i.P();
/* 11:   */   
/* 12:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 13:   */   {
/* 14:22 */     while ((paramaqu.d(paramdt)) && (paramdt.o() > 2)) {
/* 15:23 */       paramdt = paramdt.b();
/* 16:   */     }
/* 17:26 */     if (!a.a(paramaqu.p(paramdt))) {
/* 18:27 */       return false;
/* 19:   */     }
/* 20:   */     int k;
/* 21:31 */     for (int i = -2; i <= 2; i++) {
/* 22:32 */       for (k = -2; k <= 2; k++) {
/* 23:33 */         if ((paramaqu.d(paramdt.a(i, -1, k))) && (paramaqu.d(paramdt.a(i, -2, k)))) {
/* 24:34 */           return false;
/* 25:   */         }
/* 26:   */       }
/* 27:   */     }
/* 28:40 */     for (i = -1; i <= 0; i++) {
/* 29:41 */       for (k = -2; k <= 2; k++) {
/* 30:42 */         for (int n = -2; n <= 2; n++) {
/* 31:43 */           paramaqu.a(paramdt.a(k, i, n), this.c, 2);
/* 32:   */         }
/* 33:   */       }
/* 34:   */     }
/* 35:49 */     paramaqu.a(paramdt, this.d, 2);
/* 36:50 */     for (ej localej : en.a) {
/* 37:51 */       paramaqu.a(paramdt.a(localej), this.d, 2);
/* 38:   */     }
/* 39:   */     int m;
/* 40:55 */     for (int j = -2; j <= 2; j++) {
/* 41:56 */       for (m = -2; m <= 2; m++) {
/* 42:57 */         if ((j == -2) || (j == 2) || (m == -2) || (m == 2)) {
/* 43:58 */           paramaqu.a(paramdt.a(j, 1, m), this.c, 2);
/* 44:   */         }
/* 45:   */       }
/* 46:   */     }
/* 47:63 */     paramaqu.a(paramdt.a(2, 1, 0), this.b, 2);
/* 48:64 */     paramaqu.a(paramdt.a(-2, 1, 0), this.b, 2);
/* 49:65 */     paramaqu.a(paramdt.a(0, 1, 2), this.b, 2);
/* 50:66 */     paramaqu.a(paramdt.a(0, 1, -2), this.b, 2);
/* 51:69 */     for (j = -1; j <= 1; j++) {
/* 52:70 */       for (m = -1; m <= 1; m++) {
/* 53:71 */         if ((j == 0) && (m == 0)) {
/* 54:72 */           paramaqu.a(paramdt.a(j, 4, m), this.c, 2);
/* 55:   */         } else {
/* 56:74 */           paramaqu.a(paramdt.a(j, 4, m), this.b, 2);
/* 57:   */         }
/* 58:   */       }
/* 59:   */     }
/* 60:80 */     for (j = 1; j <= 3; j++)
/* 61:   */     {
/* 62:81 */       paramaqu.a(paramdt.a(-1, j, -1), this.c, 2);
/* 63:82 */       paramaqu.a(paramdt.a(-1, j, 1), this.c, 2);
/* 64:83 */       paramaqu.a(paramdt.a(1, j, -1), this.c, 2);
/* 65:84 */       paramaqu.a(paramdt.a(1, j, 1), this.c, 2);
/* 66:   */     }
/* 67:87 */     return true;
/* 68:   */   }
/* 69:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhn
 * JD-Core Version:    0.7.0.1
 */