/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ajz
/*  4:   */   extends alq
/*  5:   */ {
/*  6:11 */   public static final String[] a = { "pulling_0", "pulling_1", "pulling_2" };
/*  7:   */   
/*  8:   */   public ajz()
/*  9:   */   {
/* 10:20 */     this.h = 1;
/* 11:21 */     d(384);
/* 12:22 */     a(akf.j);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(amj paramamj, aqu paramaqu, ahd paramahd, int paramInt)
/* 16:   */   {
/* 17:27 */     int i = (paramahd.by.d) || (aph.a(apf.y.B, paramamj) > 0) ? 1 : 0;
/* 18:29 */     if ((i != 0) || (paramahd.bg.b(amk.g)))
/* 19:   */     {
/* 20:30 */       int j = d(paramamj) - paramInt;
/* 21:31 */       float f = j / 20.0F;
/* 22:32 */       f = (f * f + f * 2.0F) / 3.0F;
/* 23:33 */       if (f < 0.1D) {
/* 24:34 */         return;
/* 25:   */       }
/* 26:36 */       if (f > 1.0F) {
/* 27:37 */         f = 1.0F;
/* 28:   */       }
/* 29:40 */       ahj localahj = new ahj(paramaqu, paramahd, f * 2.0F);
/* 30:41 */       if (f == 1.0F) {
/* 31:42 */         localahj.a(true);
/* 32:   */       }
/* 33:44 */       int k = aph.a(apf.v.B, paramamj);
/* 34:45 */       if (k > 0) {
/* 35:46 */         localahj.b(localahj.j() + k * 0.5D + 0.5D);
/* 36:   */       }
/* 37:48 */       int m = aph.a(apf.w.B, paramamj);
/* 38:49 */       if (m > 0) {
/* 39:50 */         localahj.a(m);
/* 40:   */       }
/* 41:52 */       if (aph.a(apf.x.B, paramamj) > 0) {
/* 42:53 */         localahj.e(100);
/* 43:   */       }
/* 44:55 */       paramamj.a(1, paramahd);
/* 45:   */       
/* 46:57 */       paramaqu.a(paramahd, "random.bow", 1.0F, 1.0F / (g.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
/* 47:58 */       if (i != 0) {
/* 48:59 */         localahj.a = 2;
/* 49:   */       } else {
/* 50:61 */         paramahd.bg.a(amk.g);
/* 51:   */       }
/* 52:63 */       paramahd.b(ty.J[alq.b(this)]);
/* 53:64 */       if (!paramaqu.D) {
/* 54:65 */         paramaqu.d(localahj);
/* 55:   */       }
/* 56:   */     }
/* 57:   */   }
/* 58:   */   
/* 59:   */   public amj b(amj paramamj, aqu paramaqu, ahd paramahd)
/* 60:   */   {
/* 61:72 */     return paramamj;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public int d(amj paramamj)
/* 65:   */   {
/* 66:77 */     return 72000;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public ano e(amj paramamj)
/* 70:   */   {
/* 71:82 */     return ano.e;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 75:   */   {
/* 76:87 */     if ((paramahd.by.d) || (paramahd.bg.b(amk.g))) {
/* 77:88 */       paramahd.a(paramamj, d(paramamj));
/* 78:   */     }
/* 79:90 */     return paramamj;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public int b()
/* 83:   */   {
/* 84:95 */     return 1;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajz
 * JD-Core Version:    0.7.0.1
 */