/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhu
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private final atr a;
/*  7:   */   private final boolean b;
/*  8:   */   
/*  9:   */   public bhu(atr paramatr, boolean paramBoolean)
/* 10:   */   {
/* 11:16 */     this.a = paramatr;
/* 12:17 */     this.b = paramBoolean;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 16:   */   {
/* 17:22 */     if (paramaqu.p(paramdt.a()).c() != aty.aV) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:25 */     if ((paramaqu.p(paramdt).c().r() != bof.a) && (paramaqu.p(paramdt).c() != aty.aV)) {
/* 21:26 */       return false;
/* 22:   */     }
/* 23:29 */     int i = 0;
/* 24:30 */     if (paramaqu.p(paramdt.e()).c() == aty.aV) {
/* 25:31 */       i++;
/* 26:   */     }
/* 27:33 */     if (paramaqu.p(paramdt.f()).c() == aty.aV) {
/* 28:34 */       i++;
/* 29:   */     }
/* 30:36 */     if (paramaqu.p(paramdt.c()).c() == aty.aV) {
/* 31:37 */       i++;
/* 32:   */     }
/* 33:39 */     if (paramaqu.p(paramdt.d()).c() == aty.aV) {
/* 34:40 */       i++;
/* 35:   */     }
/* 36:42 */     if (paramaqu.p(paramdt.b()).c() == aty.aV) {
/* 37:43 */       i++;
/* 38:   */     }
/* 39:46 */     int j = 0;
/* 40:47 */     if (paramaqu.d(paramdt.e())) {
/* 41:48 */       j++;
/* 42:   */     }
/* 43:50 */     if (paramaqu.d(paramdt.f())) {
/* 44:51 */       j++;
/* 45:   */     }
/* 46:53 */     if (paramaqu.d(paramdt.c())) {
/* 47:54 */       j++;
/* 48:   */     }
/* 49:56 */     if (paramaqu.d(paramdt.d())) {
/* 50:57 */       j++;
/* 51:   */     }
/* 52:59 */     if (paramaqu.d(paramdt.b())) {
/* 53:60 */       j++;
/* 54:   */     }
/* 55:63 */     if (((!this.b) && (i == 4) && (j == 1)) || (i == 5))
/* 56:   */     {
/* 57:64 */       paramaqu.a(paramdt, this.a.P(), 2);
/* 58:65 */       paramaqu.a(this.a, paramdt, paramRandom);
/* 59:   */     }
/* 60:68 */     return true;
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bhu
 * JD-Core Version:    0.7.0.1
 */