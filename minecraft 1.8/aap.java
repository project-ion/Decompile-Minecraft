/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ class aap
/*  4:   */   implements Predicate
/*  5:   */ {
/*  6:   */   aap(aao paramaao) {}
/*  7:   */   
/*  8:   */   public boolean a(wv paramwv)
/*  9:   */   {
/* 10:44 */     if (!(paramwv instanceof ahd)) {
/* 11:45 */       return false;
/* 12:   */     }
/* 13:47 */     double d = this.a.f();
/* 14:49 */     if (paramwv.aw()) {
/* 15:50 */       d *= 0.800000011920929D;
/* 16:   */     }
/* 17:52 */     if (paramwv.ay())
/* 18:   */     {
/* 19:53 */       float f = ((ahd)paramwv).bX();
/* 20:54 */       if (f < 0.1F) {
/* 21:55 */         f = 0.1F;
/* 22:   */       }
/* 23:57 */       d *= 0.7F * f;
/* 24:   */     }
/* 25:59 */     if (paramwv.g(aao.a(this.a)) > d) {
/* 26:60 */       return false;
/* 27:   */     }
/* 28:62 */     return aaw.a(aao.a(this.a), (xm)paramwv, false, true);
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aap
 * JD-Core Version:    0.7.0.1
 */