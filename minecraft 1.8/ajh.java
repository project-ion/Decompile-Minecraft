/*  1:   */ public class ajh
/*  2:   */   extends wa
/*  3:   */ {
/*  4:   */   private bda a;
/*  5:   */   
/*  6:   */   public ajh()
/*  7:   */   {
/*  8:14 */     super("container.enderchest", false, 27);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(bda parambda)
/* 12:   */   {
/* 13:18 */     this.a = parambda;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(fv paramfv)
/* 17:   */   {
/* 18:22 */     for (int i = 0; i < n_(); i++) {
/* 19:23 */       a(i, null);
/* 20:   */     }
/* 21:25 */     for (i = 0; i < paramfv.c(); i++)
/* 22:   */     {
/* 23:26 */       fn localfn = paramfv.b(i);
/* 24:27 */       int j = localfn.d("Slot") & 0xFF;
/* 25:28 */       if ((j >= 0) && (j < n_())) {
/* 26:29 */         a(j, amj.a(localfn));
/* 27:   */       }
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public fv h()
/* 32:   */   {
/* 33:35 */     fv localfv = new fv();
/* 34:36 */     for (int i = 0; i < n_(); i++)
/* 35:   */     {
/* 36:37 */       amj localamj = a(i);
/* 37:38 */       if (localamj != null)
/* 38:   */       {
/* 39:39 */         fn localfn = new fn();
/* 40:40 */         localfn.a("Slot", (byte)i);
/* 41:41 */         localamj.b(localfn);
/* 42:42 */         localfv.a(localfn);
/* 43:   */       }
/* 44:   */     }
/* 45:45 */     return localfv;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public boolean a(ahd paramahd)
/* 49:   */   {
/* 50:50 */     if ((this.a != null) && (!this.a.a(paramahd))) {
/* 51:51 */       return false;
/* 52:   */     }
/* 53:53 */     return super.a(paramahd);
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void b(ahd paramahd)
/* 57:   */   {
/* 58:58 */     if (this.a != null) {
/* 59:59 */       this.a.b();
/* 60:   */     }
/* 61:61 */     super.b(paramahd);
/* 62:   */   }
/* 63:   */   
/* 64:   */   public void c(ahd paramahd)
/* 65:   */   {
/* 66:66 */     if (this.a != null) {
/* 67:67 */       this.a.d();
/* 68:   */     }
/* 69:69 */     super.c(paramahd);
/* 70:70 */     this.a = null;
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajh
 * JD-Core Version:    0.7.0.1
 */