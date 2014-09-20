/*  1:   */ public class anj
/*  2:   */   extends aju
/*  3:   */ {
/*  4:   */   public anj(atr paramatr)
/*  5:   */   {
/*  6:13 */     super(paramatr);
/*  7:   */     
/*  8:15 */     d(0);
/*  9:16 */     a(true);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 13:   */   {
/* 14:21 */     if (paramamj.b == 0) {
/* 15:22 */       return false;
/* 16:   */     }
/* 17:24 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 18:25 */       return false;
/* 19:   */     }
/* 20:28 */     bec localbec1 = paramaqu.p(paramdt);
/* 21:29 */     atr localatr = localbec1.c();
/* 22:31 */     if ((localatr != this.a) && (paramej != ej.b))
/* 23:   */     {
/* 24:32 */       paramdt = paramdt.a(paramej);
/* 25:33 */       localbec1 = paramaqu.p(paramdt);
/* 26:34 */       localatr = localbec1.c();
/* 27:   */     }
/* 28:37 */     if (localatr == this.a)
/* 29:   */     {
/* 30:38 */       int i = ((Integer)localbec1.b(bao.a)).intValue();
/* 31:40 */       if (i <= 7)
/* 32:   */       {
/* 33:41 */         bec localbec2 = localbec1.a(bao.a, Integer.valueOf(i + 1));
/* 34:42 */         if ((paramaqu.b(this.a.a(paramaqu, paramdt, localbec2))) && (paramaqu.a(paramdt, localbec2, 2)))
/* 35:   */         {
/* 36:43 */           paramaqu.a(paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, this.a.H.b(), (this.a.H.d() + 1.0F) / 2.0F, this.a.H.e() * 0.8F);
/* 37:44 */           paramamj.b -= 1;
/* 38:45 */           return true;
/* 39:   */         }
/* 40:   */       }
/* 41:   */     }
/* 42:50 */     return super.a(paramamj, paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int a(int paramInt)
/* 46:   */   {
/* 47:55 */     return paramInt;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     anj
 * JD-Core Version:    0.7.0.1
 */