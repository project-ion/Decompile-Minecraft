/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class abf
/*  4:   */ {
/*  5:12 */   private static brw a = new brw(0.0D, 0.0D, 0.0D);
/*  6:   */   
/*  7:   */   public static brw a(xu paramxu, int paramInt1, int paramInt2)
/*  8:   */   {
/*  9:15 */     return c(paramxu, paramInt1, paramInt2, null);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public static brw a(xu paramxu, int paramInt1, int paramInt2, brw parambrw)
/* 13:   */   {
/* 14:19 */     a = parambrw.a(paramxu.s, paramxu.t, paramxu.u);
/* 15:20 */     return c(paramxu, paramInt1, paramInt2, a);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public static brw b(xu paramxu, int paramInt1, int paramInt2, brw parambrw)
/* 19:   */   {
/* 20:24 */     a = new brw(paramxu.s, paramxu.t, paramxu.u).d(parambrw);
/* 21:25 */     return c(paramxu, paramInt1, paramInt2, a);
/* 22:   */   }
/* 23:   */   
/* 24:   */   private static brw c(xu paramxu, int paramInt1, int paramInt2, brw parambrw)
/* 25:   */   {
/* 26:29 */     Random localRandom = paramxu.bb();
/* 27:30 */     int i = 0;
/* 28:31 */     int j = 0;int k = 0;int m = 0;
/* 29:32 */     float f1 = -99999.0F;
/* 30:   */     int n;
/* 31:35 */     if (paramxu.ci())
/* 32:   */     {
/* 33:36 */       double d1 = paramxu.cf().c(uv.c(paramxu.s), uv.c(paramxu.t), uv.c(paramxu.u)) + 4.0D;
/* 34:37 */       double d2 = paramxu.cg() + paramInt1;
/* 35:38 */       n = d1 < d2 * d2 ? 1 : 0;
/* 36:   */     }
/* 37:   */     else
/* 38:   */     {
/* 39:40 */       n = 0;
/* 40:   */     }
/* 41:44 */     for (int i1 = 0; i1 < 10; i1++)
/* 42:   */     {
/* 43:45 */       int i2 = localRandom.nextInt(2 * paramInt1 + 1) - paramInt1;
/* 44:46 */       int i3 = localRandom.nextInt(2 * paramInt2 + 1) - paramInt2;
/* 45:47 */       int i4 = localRandom.nextInt(2 * paramInt1 + 1) - paramInt1;
/* 46:49 */       if ((parambrw == null) || (i2 * parambrw.a + i4 * parambrw.c >= 0.0D))
/* 47:   */       {
/* 48:53 */         if ((paramxu.ci()) && (paramInt1 > 1))
/* 49:   */         {
/* 50:54 */           localdt = paramxu.cf();
/* 51:55 */           if (paramxu.s > localdt.n()) {
/* 52:56 */             i2 -= localRandom.nextInt(paramInt1 / 2);
/* 53:   */           } else {
/* 54:58 */             i2 += localRandom.nextInt(paramInt1 / 2);
/* 55:   */           }
/* 56:60 */           if (paramxu.u > localdt.p()) {
/* 57:61 */             i4 -= localRandom.nextInt(paramInt1 / 2);
/* 58:   */           } else {
/* 59:63 */             i4 += localRandom.nextInt(paramInt1 / 2);
/* 60:   */           }
/* 61:   */         }
/* 62:67 */         i2 += uv.c(paramxu.s);
/* 63:68 */         i3 += uv.c(paramxu.t);
/* 64:69 */         i4 += uv.c(paramxu.u);
/* 65:   */         
/* 66:71 */         dt localdt = new dt(i2, i3, i4);
/* 67:73 */         if ((n == 0) || (paramxu.d(localdt)))
/* 68:   */         {
/* 69:76 */           float f2 = paramxu.a(localdt);
/* 70:77 */           if (f2 > f1)
/* 71:   */           {
/* 72:78 */             f1 = f2;
/* 73:79 */             j = i2;
/* 74:80 */             k = i3;
/* 75:81 */             m = i4;
/* 76:82 */             i = 1;
/* 77:   */           }
/* 78:   */         }
/* 79:   */       }
/* 80:   */     }
/* 81:85 */     if (i != 0) {
/* 82:86 */       return new brw(j, k, m);
/* 83:   */     }
/* 84:89 */     return null;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     abf
 * JD-Core Version:    0.7.0.1
 */