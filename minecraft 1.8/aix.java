/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class aix
/*  4:   */   extends aib
/*  5:   */ {
/*  6:   */   private final vq a;
/*  7:   */   
/*  8:   */   public aix(ahb paramahb, vq paramvq, ahd paramahd)
/*  9:   */   {
/* 10:14 */     this.a = paramvq;
/* 11:15 */     paramvq.b(paramahd);
/* 12:16 */     int i = 51;
/* 13:18 */     for (int j = 0; j < paramvq.n_(); j++) {
/* 14:19 */       a(new ajk(paramvq, j, 44 + j * 18, 20));
/* 15:   */     }
/* 16:22 */     for (j = 0; j < 3; j++) {
/* 17:23 */       for (int k = 0; k < 9; k++) {
/* 18:24 */         a(new ajk(paramahb, k + j * 9 + 9, 8 + k * 18, j * 18 + i));
/* 19:   */       }
/* 20:   */     }
/* 21:27 */     for (j = 0; j < 9; j++) {
/* 22:28 */       a(new ajk(paramahb, j, 8 + j * 18, 58 + i));
/* 23:   */     }
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean a(ahd paramahd)
/* 27:   */   {
/* 28:34 */     return this.a.a(paramahd);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public amj b(ahd paramahd, int paramInt)
/* 32:   */   {
/* 33:40 */     amj localamj1 = null;
/* 34:41 */     ajk localajk = (ajk)this.c.get(paramInt);
/* 35:42 */     if ((localajk != null) && (localajk.e()))
/* 36:   */     {
/* 37:43 */       amj localamj2 = localajk.d();
/* 38:44 */       localamj1 = localamj2.k();
/* 39:46 */       if (paramInt < this.a.n_())
/* 40:   */       {
/* 41:47 */         if (!a(localamj2, this.a.n_(), this.c.size(), true)) {
/* 42:48 */           return null;
/* 43:   */         }
/* 44:   */       }
/* 45:51 */       else if (!a(localamj2, 0, this.a.n_(), false)) {
/* 46:52 */         return null;
/* 47:   */       }
/* 48:55 */       if (localamj2.b == 0) {
/* 49:56 */         localajk.d(null);
/* 50:   */       } else {
/* 51:58 */         localajk.f();
/* 52:   */       }
/* 53:   */     }
/* 54:61 */     return localamj1;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void b(ahd paramahd)
/* 58:   */   {
/* 59:66 */     super.b(paramahd);
/* 60:67 */     this.a.c(paramahd);
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aix
 * JD-Core Version:    0.7.0.1
 */