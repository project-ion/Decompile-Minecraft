/*  1:   */ public class anb
/*  2:   */   extends all
/*  3:   */ {
/*  4:   */   private atr b;
/*  5:   */   private atr c;
/*  6:   */   
/*  7:   */   public anb(int paramInt, float paramFloat, atr paramatr1, atr paramatr2)
/*  8:   */   {
/*  9:14 */     super(paramInt, paramFloat, false);
/* 10:   */     
/* 11:16 */     this.b = paramatr1;
/* 12:17 */     this.c = paramatr2;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 16:   */   {
/* 17:22 */     if (paramej != ej.b) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:26 */     if (!paramahd.a(paramdt.a(paramej), paramej, paramamj)) {
/* 21:27 */       return false;
/* 22:   */     }
/* 23:30 */     if ((paramaqu.p(paramdt).c() == this.c) && (paramaqu.d(paramdt.a())))
/* 24:   */     {
/* 25:31 */       paramaqu.a(paramdt.a(), this.b.P());
/* 26:32 */       paramamj.b -= 1;
/* 27:33 */       return true;
/* 28:   */     }
/* 29:35 */     return false;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     anb
 * JD-Core Version:    0.7.0.1
 */