/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class ayg
/*   5:    */   extends axg
/*   6:    */ {
/*   7: 20 */   public static final bev P = bev.a("variant", ayx.class, new ayh());
/*   8:    */   
/*   9:    */   public ayg()
/*  10:    */   {
/*  11: 31 */     j(this.L.b().a(P, ayx.e).a(b, Boolean.valueOf(true)).a(a, Boolean.valueOf(true)));
/*  12:    */   }
/*  13:    */   
/*  14:    */   protected void a(aqu paramaqu, dt paramdt, bec parambec, int paramInt)
/*  15:    */   {
/*  16: 36 */     if ((parambec.b(P) == ayx.f) && (paramaqu.s.nextInt(paramInt) == 0)) {
/*  17: 37 */       a(paramaqu, paramdt, new amj(amk.e, 1, 0));
/*  18:    */     }
/*  19:    */   }
/*  20:    */   
/*  21:    */   public int a(bec parambec)
/*  22:    */   {
/*  23: 43 */     return ((ayx)parambec.b(P)).a();
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int j(aqu paramaqu, dt paramdt)
/*  27:    */   {
/*  28: 48 */     bec localbec = paramaqu.p(paramdt);
/*  29: 49 */     return localbec.c().c(localbec) & 0x3;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  33:    */   {
/*  34: 54 */     paramList.add(new amj(paramalq, 1, 0));
/*  35: 55 */     paramList.add(new amj(paramalq, 1, 1));
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected amj i(bec parambec)
/*  39:    */   {
/*  40: 60 */     return new amj(alq.a(this), 1, ((ayx)parambec.b(P)).a() - 4);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public bec a(int paramInt)
/*  44:    */   {
/*  45: 65 */     return P().a(P, b(paramInt)).a(a, Boolean.valueOf((paramInt & 0x4) == 0)).a(b, Boolean.valueOf((paramInt & 0x8) > 0));
/*  46:    */   }
/*  47:    */   
/*  48:    */   public int c(bec parambec)
/*  49:    */   {
/*  50: 73 */     int i = 0;
/*  51:    */     
/*  52: 75 */     i |= ((ayx)parambec.b(P)).a() - 4;
/*  53: 77 */     if (!((Boolean)parambec.b(a)).booleanValue()) {
/*  54: 78 */       i |= 0x4;
/*  55:    */     }
/*  56: 81 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/*  57: 82 */       i |= 0x8;
/*  58:    */     }
/*  59: 85 */     return i;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public ayx b(int paramInt)
/*  63:    */   {
/*  64: 90 */     return ayx.a((paramInt & 0x3) + 4);
/*  65:    */   }
/*  66:    */   
/*  67:    */   protected bed e()
/*  68:    */   {
/*  69: 95 */     return new bed(this, new bex[] { P, b, a });
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void a(aqu paramaqu, ahd paramahd, dt paramdt, bec parambec, bcm parambcm)
/*  73:    */   {
/*  74:100 */     if ((!paramaqu.D) && (paramahd.bY() != null) && (paramahd.bY().b() == amk.be))
/*  75:    */     {
/*  76:101 */       paramahd.b(ty.H[atr.a(this)]);
/*  77:    */       
/*  78:    */ 
/*  79:104 */       a(paramaqu, paramdt, new amj(alq.a(this), 1, ((ayx)parambec.b(P)).a() - 4));
/*  80:105 */       return;
/*  81:    */     }
/*  82:108 */     super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/*  83:    */   }
/*  84:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayg
 * JD-Core Version:    0.7.0.1
 */