/*  1:   */ public class art
/*  2:   */ {
/*  3:11 */   private static final arx a = new aru();
/*  4:17 */   private static final arx b = new arv();
/*  5:23 */   private static final arx c = new arw();
/*  6:   */   
/*  7:   */   private static int a(ard paramard, dt paramdt, arx paramarx)
/*  8:   */   {
/*  9:31 */     int i = 0;
/* 10:32 */     int j = 0;
/* 11:33 */     int k = 0;
/* 12:35 */     for (dy localdy : dt.b(paramdt.a(-1, 0, -1), paramdt.a(1, 0, 1)))
/* 13:   */     {
/* 14:36 */       int m = paramarx.a(paramard.b(localdy), localdy);
/* 15:   */       
/* 16:38 */       i += ((m & 0xFF0000) >> 16);
/* 17:39 */       j += ((m & 0xFF00) >> 8);
/* 18:40 */       k += (m & 0xFF);
/* 19:   */     }
/* 20:43 */     return (i / 9 & 0xFF) << 16 | (j / 9 & 0xFF) << 8 | k / 9 & 0xFF;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public static int a(ard paramard, dt paramdt)
/* 24:   */   {
/* 25:47 */     return a(paramard, paramdt, a);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public static int b(ard paramard, dt paramdt)
/* 29:   */   {
/* 30:51 */     return a(paramard, paramdt, b);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public static int c(ard paramard, dt paramdt)
/* 34:   */   {
/* 35:55 */     return a(paramard, paramdt, c);
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     art
 * JD-Core Version:    0.7.0.1
 */