/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class axs
/*  5:   */   extends atr
/*  6:   */ {
/*  7:20 */   public static final bev a = bev.a("variant", axu.class);
/*  8:   */   
/*  9:   */   public axs()
/* 10:   */   {
/* 11:23 */     super(bof.B);
/* 12:24 */     j(this.L.b().a(a, axu.a));
/* 13:25 */     c(0.0F);
/* 14:26 */     a(akf.c);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int a(Random paramRandom)
/* 18:   */   {
/* 19:31 */     return 0;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public static boolean d(bec parambec)
/* 23:   */   {
/* 24:35 */     atr localatr = parambec.c();
/* 25:   */     
/* 26:37 */     return (parambec == aty.b.P().a(bba.a, bbb.a)) || (localatr == aty.e) || (localatr == aty.bf);
/* 27:   */   }
/* 28:   */   
/* 29:   */   protected amj i(bec parambec)
/* 30:   */   {
/* 31:42 */     switch (axt.a[((axu)parambec.b(a)).ordinal()])
/* 32:   */     {
/* 33:   */     case 1: 
/* 34:44 */       return new amj(aty.e);
/* 35:   */     case 2: 
/* 36:46 */       return new amj(aty.bf);
/* 37:   */     case 3: 
/* 38:48 */       return new amj(aty.bf, 1, bbd.b.a());
/* 39:   */     case 4: 
/* 40:50 */       return new amj(aty.bf, 1, bbd.c.a());
/* 41:   */     case 5: 
/* 42:52 */       return new amj(aty.bf, 1, bbd.d.a());
/* 43:   */     }
/* 44:54 */     return new amj(aty.b);
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt)
/* 48:   */   {
/* 49:60 */     if ((!paramaqu.D) && (paramaqu.Q().b("doTileDrops")))
/* 50:   */     {
/* 51:61 */       aft localaft = new aft(paramaqu);
/* 52:62 */       localaft.b(paramdt.n() + 0.5D, paramdt.o(), paramdt.p() + 0.5D, 0.0F, 0.0F);
/* 53:63 */       paramaqu.d(localaft);
/* 54:   */       
/* 55:65 */       localaft.y();
/* 56:   */     }
/* 57:   */   }
/* 58:   */   
/* 59:   */   public int j(aqu paramaqu, dt paramdt)
/* 60:   */   {
/* 61:71 */     bec localbec = paramaqu.p(paramdt);
/* 62:72 */     return localbec.c().c(localbec);
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void a(alq paramalq, akf paramakf, List paramList)
/* 66:   */   {
/* 67:77 */     for (axu localaxu : ) {
/* 68:78 */       paramList.add(new amj(paramalq, 1, localaxu.a()));
/* 69:   */     }
/* 70:   */   }
/* 71:   */   
/* 72:   */   public bec a(int paramInt)
/* 73:   */   {
/* 74:84 */     return P().a(a, axu.a(paramInt));
/* 75:   */   }
/* 76:   */   
/* 77:   */   public int c(bec parambec)
/* 78:   */   {
/* 79:90 */     return ((axu)parambec.b(a)).a();
/* 80:   */   }
/* 81:   */   
/* 82:   */   protected bed e()
/* 83:   */   {
/* 84:95 */     return new bed(this, new bex[] { a });
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     axs
 * JD-Core Version:    0.7.0.1
 */