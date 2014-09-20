/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class avc
/*  4:   */   extends atr
/*  5:   */ {
/*  6:19 */   public static final bev a = bev.a("variant", avd.class);
/*  7:20 */   public static final bet b = bet.a("snowy");
/*  8:   */   
/*  9:   */   protected avc()
/* 10:   */   {
/* 11:23 */     super(bof.c);
/* 12:24 */     j(this.L.b().a(a, avd.a).a(b, Boolean.valueOf(false)));
/* 13:25 */     a(akf.b);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public bec a(bec parambec, ard paramard, dt paramdt)
/* 17:   */   {
/* 18:30 */     if (parambec.b(a) == avd.c)
/* 19:   */     {
/* 20:31 */       atr localatr = paramard.p(paramdt.a()).c();
/* 21:32 */       parambec = parambec.a(b, Boolean.valueOf((localatr == aty.aJ) || (localatr == aty.aH)));
/* 22:   */     }
/* 23:34 */     return parambec;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(alq paramalq, akf paramakf, List paramList)
/* 27:   */   {
/* 28:39 */     paramList.add(new amj(this, 1, avd.a.a()));
/* 29:40 */     paramList.add(new amj(this, 1, avd.b.a()));
/* 30:41 */     paramList.add(new amj(this, 1, avd.c.a()));
/* 31:   */   }
/* 32:   */   
/* 33:   */   public int j(aqu paramaqu, dt paramdt)
/* 34:   */   {
/* 35:46 */     bec localbec = paramaqu.p(paramdt);
/* 36:47 */     if (localbec.c() != this) {
/* 37:48 */       return 0;
/* 38:   */     }
/* 39:50 */     return ((avd)localbec.b(a)).a();
/* 40:   */   }
/* 41:   */   
/* 42:   */   public bec a(int paramInt)
/* 43:   */   {
/* 44:55 */     return P().a(a, avd.a(paramInt));
/* 45:   */   }
/* 46:   */   
/* 47:   */   public int c(bec parambec)
/* 48:   */   {
/* 49:61 */     return ((avd)parambec.b(a)).a();
/* 50:   */   }
/* 51:   */   
/* 52:   */   protected bed e()
/* 53:   */   {
/* 54:66 */     return new bed(this, new bex[] { a, b });
/* 55:   */   }
/* 56:   */   
/* 57:   */   public int a(bec parambec)
/* 58:   */   {
/* 59:71 */     avd localavd = (avd)parambec.b(a);
/* 60:72 */     if (localavd == avd.c) {
/* 61:73 */       localavd = avd.a;
/* 62:   */     }
/* 63:75 */     return localavd.a();
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avc
 * JD-Core Version:    0.7.0.1
 */