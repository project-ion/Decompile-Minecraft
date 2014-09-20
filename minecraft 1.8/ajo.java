/*  1:   */ import com.google.common.base.Predicates;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ final class ajo
/*  5:   */   extends eg
/*  6:   */ {
/*  7:   */   protected amj b(dz paramdz, amj paramamj)
/*  8:   */   {
/*  9:40 */     dt localdt = paramdz.d().a(ave.b(paramdz.f()));
/* 10:   */     
/* 11:42 */     int i = localdt.n();
/* 12:43 */     int j = localdt.o();
/* 13:44 */     int k = localdt.p();
/* 14:45 */     brt localbrt = new brt(i, j, k, i + 1, j + 1, k + 1);
/* 15:46 */     List localList = paramdz.i().a(xm.class, localbrt, Predicates.and(xe.d, new xj(paramamj)));
/* 16:48 */     if (localList.size() > 0)
/* 17:   */     {
/* 18:49 */       xm localxm = (xm)localList.get(0);
/* 19:50 */       int m = (localxm instanceof ahd) ? 1 : 0;
/* 20:51 */       int n = xn.c(paramamj);
/* 21:52 */       amj localamj = paramamj.k();
/* 22:53 */       localamj.b = 1;
/* 23:54 */       localxm.c(n - m, localamj);
/* 24:55 */       if ((localxm instanceof xn)) {
/* 25:56 */         ((xn)localxm).a(n, 2.0F);
/* 26:   */       }
/* 27:58 */       paramamj.b -= 1;
/* 28:59 */       return paramamj;
/* 29:   */     }
/* 30:61 */     return super.b(paramdz, paramamj);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajo
 * JD-Core Version:    0.7.0.1
 */