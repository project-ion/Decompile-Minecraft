/*  1:   */ public class ajg
/*  2:   */   extends ajk
/*  3:   */ {
/*  4:   */   private final aje a;
/*  5:   */   private ahd b;
/*  6:   */   private int c;
/*  7:   */   private final aqb h;
/*  8:   */   
/*  9:   */   public ajg(ahd paramahd, aqb paramaqb, aje paramaje, int paramInt1, int paramInt2, int paramInt3)
/* 10:   */   {
/* 11:16 */     super(paramaje, paramInt1, paramInt2, paramInt3);
/* 12:17 */     this.b = paramahd;
/* 13:18 */     this.h = paramaqb;
/* 14:19 */     this.a = paramaje;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a(amj paramamj)
/* 18:   */   {
/* 19:24 */     return false;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public amj a(int paramInt)
/* 23:   */   {
/* 24:29 */     if (e()) {
/* 25:30 */       this.c += Math.min(paramInt, d().b);
/* 26:   */     }
/* 27:32 */     return super.a(paramInt);
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected void a(amj paramamj, int paramInt)
/* 31:   */   {
/* 32:37 */     this.c += paramInt;
/* 33:38 */     c(paramamj);
/* 34:   */   }
/* 35:   */   
/* 36:   */   protected void c(amj paramamj)
/* 37:   */   {
/* 38:43 */     paramamj.a(this.b.o, this.b, this.c);
/* 39:44 */     this.c = 0;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a(ahd paramahd, amj paramamj)
/* 43:   */   {
/* 44:49 */     c(paramamj);
/* 45:   */     
/* 46:51 */     aqc localaqc = this.a.i();
/* 47:52 */     if (localaqc != null)
/* 48:   */     {
/* 49:53 */       amj localamj1 = this.a.a(0);
/* 50:54 */       amj localamj2 = this.a.a(1);
/* 51:57 */       if ((a(localaqc, localamj1, localamj2)) || (a(localaqc, localamj2, localamj1)))
/* 52:   */       {
/* 53:58 */         this.h.a(localaqc);
/* 54:59 */         paramahd.b(ty.G);
/* 55:61 */         if ((localamj1 != null) && (localamj1.b <= 0)) {
/* 56:62 */           localamj1 = null;
/* 57:   */         }
/* 58:64 */         if ((localamj2 != null) && (localamj2.b <= 0)) {
/* 59:65 */           localamj2 = null;
/* 60:   */         }
/* 61:67 */         this.a.a(0, localamj1);
/* 62:68 */         this.a.a(1, localamj2);
/* 63:   */       }
/* 64:   */     }
/* 65:   */   }
/* 66:   */   
/* 67:   */   private boolean a(aqc paramaqc, amj paramamj1, amj paramamj2)
/* 68:   */   {
/* 69:74 */     amj localamj1 = paramaqc.a();
/* 70:75 */     amj localamj2 = paramaqc.b();
/* 71:77 */     if ((paramamj1 != null) && (paramamj1.b() == localamj1.b()))
/* 72:   */     {
/* 73:78 */       if ((localamj2 != null) && (paramamj2 != null) && (localamj2.b() == paramamj2.b()))
/* 74:   */       {
/* 75:79 */         paramamj1.b -= localamj1.b;
/* 76:80 */         paramamj2.b -= localamj2.b;
/* 77:81 */         return true;
/* 78:   */       }
/* 79:82 */       if ((localamj2 == null) && (paramamj2 == null))
/* 80:   */       {
/* 81:83 */         paramamj1.b -= localamj1.b;
/* 82:84 */         return true;
/* 83:   */       }
/* 84:   */     }
/* 85:87 */     return false;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajg
 * JD-Core Version:    0.7.0.1
 */