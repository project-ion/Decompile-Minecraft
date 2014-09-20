/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class csj
/*  4:   */   implements csq
/*  5:   */ {
/*  6:   */   public void a(adb paramadb, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/*  7:   */   {
/*  8:16 */     if (paramadb.bw <= 0) {
/*  9:17 */       return;
/* 10:   */     }
/* 11:20 */     ckx localckx = ckx.a();
/* 12:21 */     civ localciv = localckx.c();
/* 13:   */     
/* 14:23 */     bss.a();
/* 15:24 */     float f1 = (paramadb.bw + paramFloat3) / 200.0F;
/* 16:25 */     float f2 = 0.0F;
/* 17:26 */     if (f1 > 0.8F) {
/* 18:27 */       f2 = (f1 - 0.8F) / 0.2F;
/* 19:   */     }
/* 20:30 */     Random localRandom = new Random(432L);
/* 21:31 */     cjm.x();
/* 22:32 */     cjm.j(7425);
/* 23:33 */     cjm.l();
/* 24:34 */     cjm.b(770, 1);
/* 25:35 */     cjm.c();
/* 26:36 */     cjm.o();
/* 27:37 */     cjm.a(false);
/* 28:38 */     cjm.E();
/* 29:39 */     cjm.b(0.0F, -1.0F, -2.0F);
/* 30:40 */     for (int i = 0; i < (f1 + f1 * f1) / 2.0F * 60.0F; i++)
/* 31:   */     {
/* 32:41 */       cjm.b(localRandom.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
/* 33:42 */       cjm.b(localRandom.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
/* 34:43 */       cjm.b(localRandom.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
/* 35:44 */       cjm.b(localRandom.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
/* 36:45 */       cjm.b(localRandom.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
/* 37:46 */       cjm.b(localRandom.nextFloat() * 360.0F + f1 * 90.0F, 0.0F, 0.0F, 1.0F);
/* 38:47 */       localciv.a(6);
/* 39:48 */       float f3 = localRandom.nextFloat() * 20.0F + 5.0F + f2 * 10.0F;
/* 40:49 */       float f4 = localRandom.nextFloat() * 2.0F + 1.0F + f2 * 2.0F;
/* 41:50 */       localciv.a(16777215, (int)(255.0F * (1.0F - f2)));
/* 42:51 */       localciv.b(0.0D, 0.0D, 0.0D);
/* 43:52 */       localciv.a(16711935, 0);
/* 44:53 */       localciv.b(-0.866D * f4, f3, -0.5F * f4);
/* 45:54 */       localciv.b(0.866D * f4, f3, -0.5F * f4);
/* 46:55 */       localciv.b(0.0D, f3, 1.0F * f4);
/* 47:56 */       localciv.b(-0.866D * f4, f3, -0.5F * f4);
/* 48:57 */       localckx.b();
/* 49:   */     }
/* 50:59 */     cjm.F();
/* 51:60 */     cjm.a(true);
/* 52:61 */     cjm.p();
/* 53:62 */     cjm.k();
/* 54:63 */     cjm.j(7424);
/* 55:64 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 56:65 */     cjm.w();
/* 57:66 */     cjm.d();
/* 58:67 */     bss.b();
/* 59:   */   }
/* 60:   */   
/* 61:   */   public boolean b()
/* 62:   */   {
/* 63:72 */     return false;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     csj
 * JD-Core Version:    0.7.0.1
 */