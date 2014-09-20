/*  1:   */ public class aol
/*  2:   */   implements aoo
/*  3:   */ {
/*  4:   */   public boolean a(ain paramain, aqu paramaqu)
/*  5:   */   {
/*  6:13 */     int i = 0;
/*  7:14 */     Object localObject = null;
/*  8:16 */     for (int j = 0; j < paramain.n_(); j++)
/*  9:   */     {
/* 10:17 */       amj localamj = paramain.a(j);
/* 11:18 */       if (localamj != null) {
/* 12:22 */         if (localamj.b() == amk.bd)
/* 13:   */         {
/* 14:23 */           if (localObject != null) {
/* 15:24 */             return false;
/* 16:   */           }
/* 17:26 */           localObject = localamj;
/* 18:   */         }
/* 19:27 */         else if (localamj.b() == amk.bV)
/* 20:   */         {
/* 21:28 */           i++;
/* 22:   */         }
/* 23:   */         else
/* 24:   */         {
/* 25:30 */           return false;
/* 26:   */         }
/* 27:   */       }
/* 28:   */     }
/* 29:34 */     return (localObject != null) && (i > 0);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public amj a(ain paramain)
/* 33:   */   {
/* 34:40 */     int i = 0;
/* 35:41 */     Object localObject = null;
/* 36:43 */     for (int j = 0; j < paramain.n_(); j++)
/* 37:   */     {
/* 38:44 */       amj localamj2 = paramain.a(j);
/* 39:45 */       if (localamj2 != null) {
/* 40:49 */         if (localamj2.b() == amk.bd)
/* 41:   */         {
/* 42:50 */           if (localObject != null) {
/* 43:51 */             return null;
/* 44:   */           }
/* 45:53 */           localObject = localamj2;
/* 46:   */         }
/* 47:54 */         else if (localamj2.b() == amk.bV)
/* 48:   */         {
/* 49:55 */           i++;
/* 50:   */         }
/* 51:   */         else
/* 52:   */         {
/* 53:57 */           return null;
/* 54:   */         }
/* 55:   */       }
/* 56:   */     }
/* 57:61 */     if ((localObject == null) || (i < 1)) {
/* 58:62 */       return null;
/* 59:   */     }
/* 60:65 */     amj localamj1 = new amj(amk.bd, i + 1, localObject.i());
/* 61:66 */     if (localObject.s()) {
/* 62:67 */       localamj1.c(localObject.q());
/* 63:   */     }
/* 64:69 */     return localamj1;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public int a()
/* 68:   */   {
/* 69:74 */     return 9;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public amj b()
/* 73:   */   {
/* 74:80 */     return null;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public amj[] b(ain paramain)
/* 78:   */   {
/* 79:85 */     amj[] arrayOfamj = new amj[paramain.n_()];
/* 80:87 */     for (int i = 0; i < arrayOfamj.length; i++)
/* 81:   */     {
/* 82:88 */       amj localamj = paramain.a(i);
/* 83:89 */       if ((localamj != null) && (localamj.b().r())) {
/* 84:90 */         arrayOfamj[i] = new amj(localamj.b().q());
/* 85:   */       }
/* 86:   */     }
/* 87:94 */     return arrayOfamj;
/* 88:   */   }
/* 89:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aol
 * JD-Core Version:    0.7.0.1
 */