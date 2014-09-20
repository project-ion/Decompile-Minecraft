/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class ajw
/*  4:   */   extends alq
/*  5:   */ {
/*  6:   */   public ajw()
/*  7:   */   {
/*  8:19 */     this.h = 1;
/*  9:20 */     a(akf.e);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 13:   */   {
/* 14:25 */     float f1 = 1.0F;
/* 15:   */     
/* 16:27 */     float f2 = paramahd.B + (paramahd.z - paramahd.B) * f1;
/* 17:28 */     float f3 = paramahd.A + (paramahd.y - paramahd.A) * f1;
/* 18:   */     
/* 19:30 */     double d1 = paramahd.p + (paramahd.s - paramahd.p) * f1;
/* 20:31 */     double d2 = paramahd.q + (paramahd.t - paramahd.q) * f1 + paramahd.aR();
/* 21:32 */     double d3 = paramahd.r + (paramahd.u - paramahd.r) * f1;
/* 22:   */     
/* 23:34 */     brw localbrw1 = new brw(d1, d2, d3);
/* 24:   */     
/* 25:36 */     float f4 = uv.b(-f3 * 0.01745329F - 3.141593F);
/* 26:37 */     float f5 = uv.a(-f3 * 0.01745329F - 3.141593F);
/* 27:38 */     float f6 = -uv.b(-f2 * 0.01745329F);
/* 28:39 */     float f7 = uv.a(-f2 * 0.01745329F);
/* 29:   */     
/* 30:41 */     float f8 = f5 * f6;
/* 31:42 */     float f9 = f7;
/* 32:43 */     float f10 = f4 * f6;
/* 33:   */     
/* 34:45 */     double d4 = 5.0D;
/* 35:46 */     brw localbrw2 = localbrw1.b(f8 * d4, f9 * d4, f10 * d4);
/* 36:47 */     bru localbru = paramaqu.a(localbrw1, localbrw2, true);
/* 37:48 */     if (localbru == null) {
/* 38:49 */       return paramamj;
/* 39:   */     }
/* 40:53 */     brw localbrw3 = paramahd.d(f1);
/* 41:54 */     int i = 0;
/* 42:55 */     float f11 = 1.0F;
/* 43:56 */     List localList = paramaqu.b(paramahd, paramahd.aQ().a(localbrw3.a * d4, localbrw3.b * d4, localbrw3.c * d4).b(f11, f11, f11));
/* 44:   */     Object localObject;
/* 45:57 */     for (int j = 0; j < localList.size(); j++)
/* 46:   */     {
/* 47:58 */       localObject = (wv)localList.get(j);
/* 48:59 */       if (((wv)localObject).ad())
/* 49:   */       {
/* 50:63 */         float f12 = ((wv)localObject).ao();
/* 51:64 */         brt localbrt = ((wv)localObject).aQ().b(f12, f12, f12);
/* 52:65 */         if (localbrt.a(localbrw1)) {
/* 53:66 */           i = 1;
/* 54:   */         }
/* 55:   */       }
/* 56:   */     }
/* 57:69 */     if (i != 0) {
/* 58:70 */       return paramamj;
/* 59:   */     }
/* 60:73 */     if (localbru.a == brv.b)
/* 61:   */     {
/* 62:74 */       dt localdt = localbru.a();
/* 63:75 */       if (paramaqu.p(localdt).c() == aty.aH) {
/* 64:76 */         localdt = localdt.b();
/* 65:   */       }
/* 66:79 */       localObject = new adu(paramaqu, localdt.n() + 0.5F, localdt.o() + 1.0F, localdt.p() + 0.5F);
/* 67:80 */       ((adu)localObject).y = (((uv.c(paramahd.y * 4.0F / 360.0F + 0.5D) & 0x3) - 1) * 90);
/* 68:81 */       if (!paramaqu.a((wv)localObject, ((adu)localObject).aQ().b(-0.1D, -0.1D, -0.1D)).isEmpty()) {
/* 69:82 */         return paramamj;
/* 70:   */       }
/* 71:84 */       if (!paramaqu.D) {
/* 72:85 */         paramaqu.d((wv)localObject);
/* 73:   */       }
/* 74:87 */       if (!paramahd.by.d) {
/* 75:88 */         paramamj.b -= 1;
/* 76:   */       }
/* 77:90 */       paramahd.b(ty.J[alq.b(this)]);
/* 78:   */     }
/* 79:93 */     return paramamj;
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajw
 * JD-Core Version:    0.7.0.1
 */