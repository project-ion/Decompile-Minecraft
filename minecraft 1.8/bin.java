/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bin
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private atr a;
/*  7:   */   
/*  8:   */   public bin(atr paramatr)
/*  9:   */   {
/* 10:15 */     this.a = paramatr;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 14:   */   {
/* 15:20 */     if (paramaqu.p(paramdt.a()).c() != aty.b) {
/* 16:21 */       return false;
/* 17:   */     }
/* 18:23 */     if (paramaqu.p(paramdt.b()).c() != aty.b) {
/* 19:24 */       return false;
/* 20:   */     }
/* 21:27 */     if ((paramaqu.p(paramdt).c().r() != bof.a) && (paramaqu.p(paramdt).c() != aty.b)) {
/* 22:28 */       return false;
/* 23:   */     }
/* 24:31 */     int i = 0;
/* 25:32 */     if (paramaqu.p(paramdt.e()).c() == aty.b) {
/* 26:33 */       i++;
/* 27:   */     }
/* 28:35 */     if (paramaqu.p(paramdt.f()).c() == aty.b) {
/* 29:36 */       i++;
/* 30:   */     }
/* 31:38 */     if (paramaqu.p(paramdt.c()).c() == aty.b) {
/* 32:39 */       i++;
/* 33:   */     }
/* 34:41 */     if (paramaqu.p(paramdt.d()).c() == aty.b) {
/* 35:42 */       i++;
/* 36:   */     }
/* 37:45 */     int j = 0;
/* 38:46 */     if (paramaqu.d(paramdt.e())) {
/* 39:47 */       j++;
/* 40:   */     }
/* 41:49 */     if (paramaqu.d(paramdt.f())) {
/* 42:50 */       j++;
/* 43:   */     }
/* 44:52 */     if (paramaqu.d(paramdt.c())) {
/* 45:53 */       j++;
/* 46:   */     }
/* 47:55 */     if (paramaqu.d(paramdt.d())) {
/* 48:56 */       j++;
/* 49:   */     }
/* 50:59 */     if ((i == 3) && (j == 1))
/* 51:   */     {
/* 52:60 */       paramaqu.a(paramdt, this.a.P(), 2);
/* 53:61 */       paramaqu.a(this.a, paramdt, paramRandom);
/* 54:   */     }
/* 55:64 */     return true;
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bin
 * JD-Core Version:    0.7.0.1
 */