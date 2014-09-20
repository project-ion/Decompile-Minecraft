/*  1:   */ public abstract class axm
/*  2:   */   extends baa
/*  3:   */ {
/*  4:18 */   public static final bev a = bev.a("axis", axo.class);
/*  5:   */   
/*  6:   */   public axm()
/*  7:   */   {
/*  8:21 */     super(bof.d);
/*  9:22 */     a(akf.b);
/* 10:23 */     c(2.0F);
/* 11:24 */     a(f);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 15:   */   {
/* 16:29 */     int i = 4;
/* 17:30 */     int j = i + 1;
/* 18:32 */     if (!paramaqu.a(paramdt.a(-j, -j, -j), paramdt.a(j, j, j))) {
/* 19:33 */       return;
/* 20:   */     }
/* 21:36 */     for (dt localdt : dt.a(paramdt.a(-i, -i, -i), paramdt.a(i, i, i)))
/* 22:   */     {
/* 23:37 */       bec localbec = paramaqu.p(localdt);
/* 24:38 */       if ((localbec.c().r() == bof.j) && 
/* 25:39 */         (!((Boolean)localbec.b(axg.b)).booleanValue())) {
/* 26:40 */         paramaqu.a(localdt, localbec.a(axg.b, Boolean.valueOf(true)), 4);
/* 27:   */       }
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 32:   */   {
/* 33:51 */     return super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm).a(a, axo.a(paramej.k()));
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axm
 * JD-Core Version:    0.7.0.1
 */