/*  1:   */ public class akz
/*  2:   */   extends ake
/*  3:   */ {
/*  4:   */   protected akz()
/*  5:   */   {
/*  6:10 */     a(akf.f);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 10:   */   {
/* 11:15 */     amj localamj = new amj(amk.bd, 1, paramaqu.b("map"));
/* 12:   */     
/* 13:17 */     String str = "map_" + localamj.i();
/* 14:18 */     bqe localbqe = new bqe(str);
/* 15:19 */     paramaqu.a(str, localbqe);
/* 16:   */     
/* 17:21 */     localbqe.e = 0;
/* 18:22 */     localbqe.a(paramahd.s, paramahd.u, localbqe.e);
/* 19:23 */     localbqe.d = ((byte)paramaqu.t.q());
/* 20:   */     
/* 21:25 */     localbqe.c();
/* 22:   */     
/* 23:27 */     paramamj.b -= 1;
/* 24:28 */     if (paramamj.b <= 0) {
/* 25:29 */       return localamj;
/* 26:   */     }
/* 27:31 */     if (!paramahd.bg.a(localamj.k())) {
/* 28:32 */       paramahd.a(localamj, false);
/* 29:   */     }
/* 30:35 */     paramahd.b(ty.J[alq.b(this)]);
/* 31:   */     
/* 32:37 */     return paramamj;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     akz
 * JD-Core Version:    0.7.0.1
 */