/*  1:   */ public class ajv
/*  2:   */   extends alq
/*  3:   */ {
/*  4:   */   private atr a;
/*  5:   */   
/*  6:   */   public ajv(atr paramatr)
/*  7:   */   {
/*  8:16 */     this.a = paramatr;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 12:   */   {
/* 13:21 */     bec localbec1 = paramaqu.p(paramdt);
/* 14:22 */     atr localatr = localbec1.c();
/* 15:23 */     if ((localatr == aty.aH) && (((Integer)localbec1.b(bao.a)).intValue() < 1)) {
/* 16:24 */       paramej = ej.b;
/* 17:25 */     } else if (!localatr.f(paramaqu, paramdt)) {
/* 18:26 */       paramdt = paramdt.a(paramej);
/* 19:   */     }
/* 20:29 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 21:30 */       return false;
/* 22:   */     }
/* 23:32 */     if (paramamj.b == 0) {
/* 24:33 */       return false;
/* 25:   */     }
/* 26:36 */     if (paramaqu.a(this.a, paramdt, false, paramej, null, paramamj))
/* 27:   */     {
/* 28:37 */       bec localbec2 = this.a.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, 0, paramahd);
/* 29:38 */       if (paramaqu.a(paramdt, localbec2, 3))
/* 30:   */       {
/* 31:39 */         localbec2 = paramaqu.p(paramdt);
/* 32:43 */         if (localbec2.c() == this.a)
/* 33:   */         {
/* 34:44 */           aju.a(paramaqu, paramdt, paramamj);
/* 35:45 */           localbec2.c().a(paramaqu, paramdt, localbec2, paramahd, paramamj);
/* 36:   */         }
/* 37:47 */         paramaqu.a(paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, this.a.H.b(), (this.a.H.d() + 1.0F) / 2.0F, this.a.H.e() * 0.8F);
/* 38:48 */         paramamj.b -= 1;
/* 39:49 */         return true;
/* 40:   */       }
/* 41:   */     }
/* 42:52 */     return false;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajv
 * JD-Core Version:    0.7.0.1
 */