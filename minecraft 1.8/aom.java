/*  1:   */ public class aom
/*  2:   */   extends aos
/*  3:   */ {
/*  4:   */   public aom()
/*  5:   */   {
/*  6:14 */     super(3, 3, new amj[] { new amj(amk.aK), new amj(amk.aK), new amj(amk.aK), new amj(amk.aK), new amj(amk.bd, 0, 32767), new amj(amk.aK), new amj(amk.aK), new amj(amk.aK), new amj(amk.aK) }, new amj(amk.bV, 0, 0));
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(ain paramain, aqu paramaqu)
/* 10:   */   {
/* 11:26 */     if (!super.a(paramain, paramaqu)) {
/* 12:27 */       return false;
/* 13:   */     }
/* 14:29 */     Object localObject = null;
/* 15:31 */     for (int i = 0; (i < paramain.n_()) && (localObject == null); i++)
/* 16:   */     {
/* 17:32 */       amj localamj = paramain.a(i);
/* 18:33 */       if ((localamj != null) && (localamj.b() == amk.bd)) {
/* 19:34 */         localObject = localamj;
/* 20:   */       }
/* 21:   */     }
/* 22:38 */     if (localObject == null) {
/* 23:39 */       return false;
/* 24:   */     }
/* 25:41 */     bqe localbqe = amk.bd.a(localObject, paramaqu);
/* 26:42 */     if (localbqe == null) {
/* 27:43 */       return false;
/* 28:   */     }
/* 29:45 */     return localbqe.e < 4;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public amj a(ain paramain)
/* 33:   */   {
/* 34:51 */     Object localObject = null;
/* 35:53 */     for (int i = 0; (i < paramain.n_()) && (localObject == null); i++)
/* 36:   */     {
/* 37:54 */       amj localamj = paramain.a(i);
/* 38:55 */       if ((localamj != null) && (localamj.b() == amk.bd)) {
/* 39:56 */         localObject = localamj;
/* 40:   */       }
/* 41:   */     }
/* 42:60 */     localObject = ((amj)localObject).k();
/* 43:61 */     ((amj)localObject).b = 1;
/* 44:63 */     if (((amj)localObject).o() == null) {
/* 45:64 */       ((amj)localObject).d(new fn());
/* 46:   */     }
/* 47:66 */     ((amj)localObject).o().a("map_is_scaling", true);
/* 48:   */     
/* 49:68 */     return localObject;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aom
 * JD-Core Version:    0.7.0.1
 */