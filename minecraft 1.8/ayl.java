/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class ayl
/*   5:    */   extends awq
/*   6:    */ {
/*   7: 21 */   public static final bet b = bet.a("seamless");
/*   8: 22 */   public static final bev M = bev.a("variant", aym.class);
/*   9:    */   
/*  10:    */   public ayl()
/*  11:    */   {
/*  12: 25 */     super(bof.e);
/*  13: 26 */     bec localbec = this.L.b();
/*  14: 27 */     if (j()) {
/*  15: 28 */       localbec = localbec.a(b, Boolean.valueOf(false));
/*  16:    */     } else {
/*  17: 30 */       localbec = localbec.a(a, awr.b);
/*  18:    */     }
/*  19: 32 */     j(localbec.a(M, aym.a));
/*  20: 33 */     a(akf.b);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  24:    */   {
/*  25: 39 */     return alq.a(aty.cP);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public alq b(aqu paramaqu, dt paramdt)
/*  29:    */   {
/*  30: 44 */     return alq.a(aty.cP);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String b(int paramInt)
/*  34:    */   {
/*  35: 49 */     return super.a() + "." + aym.a(paramInt).c();
/*  36:    */   }
/*  37:    */   
/*  38:    */   public bex l()
/*  39:    */   {
/*  40: 54 */     return M;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Object a(amj paramamj)
/*  44:    */   {
/*  45: 59 */     return aym.a(paramamj.i() & 0x7);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  49:    */   {
/*  50: 64 */     if (paramalq == alq.a(aty.cO)) {
/*  51: 65 */       return;
/*  52:    */     }
/*  53: 68 */     for (aym localaym : aym.values()) {
/*  54: 69 */       paramList.add(new amj(paramalq, 1, localaym.a()));
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public bec a(int paramInt)
/*  59:    */   {
/*  60: 75 */     bec localbec = P().a(M, aym.a(paramInt & 0x7));
/*  61: 77 */     if (j()) {
/*  62: 78 */       localbec = localbec.a(b, Boolean.valueOf((paramInt & 0x8) != 0));
/*  63:    */     } else {
/*  64: 80 */       localbec = localbec.a(a, (paramInt & 0x8) == 0 ? awr.b : awr.a);
/*  65:    */     }
/*  66: 83 */     return localbec;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public int c(bec parambec)
/*  70:    */   {
/*  71: 88 */     int i = 0;
/*  72:    */     
/*  73: 90 */     i |= ((aym)parambec.b(M)).a();
/*  74: 92 */     if (j())
/*  75:    */     {
/*  76: 93 */       if (((Boolean)parambec.b(b)).booleanValue()) {
/*  77: 94 */         i |= 0x8;
/*  78:    */       }
/*  79:    */     }
/*  80: 97 */     else if (parambec.b(a) == awr.a) {
/*  81: 98 */       i |= 0x8;
/*  82:    */     }
/*  83:102 */     return i;
/*  84:    */   }
/*  85:    */   
/*  86:    */   protected bed e()
/*  87:    */   {
/*  88:107 */     if (j()) {
/*  89:108 */       return new bed(this, new bex[] { b, M });
/*  90:    */     }
/*  91:111 */     return new bed(this, new bex[] { a, M });
/*  92:    */   }
/*  93:    */   
/*  94:    */   public int a(bec parambec)
/*  95:    */   {
/*  96:116 */     return ((aym)parambec.b(M)).a();
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayl
 * JD-Core Version:    0.7.0.1
 */