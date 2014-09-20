/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class azl
/*  4:   */   extends atr
/*  5:   */ {
/*  6:20 */   public static final bev a = bev.a("variant", azn.class);
/*  7:   */   
/*  8:   */   public azl()
/*  9:   */   {
/* 10:23 */     super(bof.e);
/* 11:24 */     j(this.L.b().a(a, azn.a));
/* 12:25 */     a(akf.b);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/* 16:   */   {
/* 17:30 */     if (paramInt == azn.c.a())
/* 18:   */     {
/* 19:31 */       switch (azm.a[paramej.k().ordinal()])
/* 20:   */       {
/* 21:   */       case 1: 
/* 22:33 */         return P().a(a, azn.e);
/* 23:   */       case 2: 
/* 24:35 */         return P().a(a, azn.d);
/* 25:   */       }
/* 26:38 */       return P().a(a, azn.c);
/* 27:   */     }
/* 28:42 */     if (paramInt == azn.b.a()) {
/* 29:43 */       return P().a(a, azn.b);
/* 30:   */     }
/* 31:46 */     return P().a(a, azn.a);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int a(bec parambec)
/* 35:   */   {
/* 36:51 */     azn localazn = (azn)parambec.b(a);
/* 37:52 */     if ((localazn == azn.d) || (localazn == azn.e)) {
/* 38:53 */       return azn.c.a();
/* 39:   */     }
/* 40:56 */     return localazn.a();
/* 41:   */   }
/* 42:   */   
/* 43:   */   protected amj i(bec parambec)
/* 44:   */   {
/* 45:61 */     azn localazn = (azn)parambec.b(a);
/* 46:62 */     if ((localazn == azn.d) || (localazn == azn.e)) {
/* 47:63 */       return new amj(alq.a(this), 1, azn.c.a());
/* 48:   */     }
/* 49:65 */     return super.i(parambec);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void a(alq paramalq, akf paramakf, List paramList)
/* 53:   */   {
/* 54:70 */     paramList.add(new amj(paramalq, 1, azn.a.a()));
/* 55:71 */     paramList.add(new amj(paramalq, 1, azn.b.a()));
/* 56:72 */     paramList.add(new amj(paramalq, 1, azn.c.a()));
/* 57:   */   }
/* 58:   */   
/* 59:   */   public boh g(bec parambec)
/* 60:   */   {
/* 61:77 */     return boh.p;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public bec a(int paramInt)
/* 65:   */   {
/* 66:82 */     return P().a(a, azn.a(paramInt));
/* 67:   */   }
/* 68:   */   
/* 69:   */   public int c(bec parambec)
/* 70:   */   {
/* 71:88 */     return ((azn)parambec.b(a)).a();
/* 72:   */   }
/* 73:   */   
/* 74:   */   protected bed e()
/* 75:   */   {
/* 76:93 */     return new bed(this, new bex[] { a });
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     azl
 * JD-Core Version:    0.7.0.1
 */