/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class ajq
/*  5:   */   extends alq
/*  6:   */ {
/*  7:   */   public ajq()
/*  8:   */   {
/*  9:20 */     a(akf.c);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 13:   */   {
/* 14:25 */     if (paramej == ej.a) {
/* 15:26 */       return false;
/* 16:   */     }
/* 17:29 */     boolean bool = paramaqu.p(paramdt).c().f(paramaqu, paramdt);
/* 18:30 */     dt localdt1 = bool ? paramdt : paramdt.a(paramej);
/* 19:31 */     if (!paramahd.a(localdt1, paramej, paramamj)) {
/* 20:32 */       return false;
/* 21:   */     }
/* 22:35 */     dt localdt2 = localdt1.a();
/* 23:36 */     int i = (!paramaqu.d(localdt1)) && (!paramaqu.p(localdt1).c().f(paramaqu, localdt1)) ? 1 : 0;
/* 24:37 */     i |= ((!paramaqu.d(localdt2)) && (!paramaqu.p(localdt2).c().f(paramaqu, localdt2)) ? 1 : 0);
/* 25:38 */     if (i != 0) {
/* 26:39 */       return false;
/* 27:   */     }
/* 28:42 */     double d1 = localdt1.n();
/* 29:43 */     double d2 = localdt1.o();
/* 30:44 */     double d3 = localdt1.p();
/* 31:   */     
/* 32:46 */     List localList = paramaqu.b(null, brt.a(d1, d2, d3, d1 + 1.0D, d2 + 2.0D, d3 + 1.0D));
/* 33:47 */     if (localList.size() > 0) {
/* 34:48 */       return false;
/* 35:   */     }
/* 36:51 */     if (!paramaqu.D)
/* 37:   */     {
/* 38:52 */       paramaqu.g(localdt1);
/* 39:53 */       paramaqu.g(localdt2);
/* 40:   */       
/* 41:55 */       adi localadi = new adi(paramaqu, d1 + 0.5D, d2, d3 + 0.5D);
/* 42:56 */       float f = uv.d((uv.g(paramahd.y - 180.0F) + 22.5F) / 45.0F) * 45.0F;
/* 43:57 */       localadi.b(d1 + 0.5D, d2, d3 + 0.5D, f, 0.0F);
/* 44:58 */       a(localadi, paramaqu.s);
/* 45:59 */       fn localfn1 = paramamj.o();
/* 46:60 */       if ((localfn1 != null) && (localfn1.b("EntityTag", 10)))
/* 47:   */       {
/* 48:61 */         fn localfn2 = new fn();
/* 49:62 */         localadi.d(localfn2);
/* 50:63 */         localfn2.a(localfn1.m("EntityTag"));
/* 51:64 */         localadi.f(localfn2);
/* 52:   */       }
/* 53:66 */       paramaqu.d(localadi);
/* 54:   */     }
/* 55:68 */     paramamj.b -= 1;
/* 56:69 */     return true;
/* 57:   */   }
/* 58:   */   
/* 59:   */   private void a(adi paramadi, Random paramRandom)
/* 60:   */   {
/* 61:78 */     fa localfa1 = paramadi.s();
/* 62:79 */     float f1 = paramRandom.nextFloat() * 5.0F;
/* 63:80 */     float f2 = paramRandom.nextFloat() * 20.0F - 10.0F;
/* 64:81 */     fa localfa2 = new fa(localfa1.b() + f1, localfa1.c() + f2, localfa1.d());
/* 65:82 */     paramadi.a(localfa2);
/* 66:   */     
/* 67:84 */     localfa1 = paramadi.t();
/* 68:85 */     f1 = paramRandom.nextFloat() * 10.0F - 5.0F;
/* 69:86 */     localfa2 = new fa(localfa1.b(), localfa1.c() + f1, localfa1.d());
/* 70:87 */     paramadi.b(localfa2);
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajq
 * JD-Core Version:    0.7.0.1
 */