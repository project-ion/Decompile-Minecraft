/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class bbf
/*   5:    */   extends awq
/*   6:    */ {
/*   7: 21 */   public static final bet b = bet.a("seamless");
/*   8: 22 */   public static final bev M = bev.a("variant", bbg.class);
/*   9:    */   
/*  10:    */   public bbf()
/*  11:    */   {
/*  12: 25 */     super(bof.e);
/*  13: 26 */     bec localbec = this.L.b();
/*  14: 27 */     if (j()) {
/*  15: 28 */       localbec = localbec.a(b, Boolean.valueOf(false));
/*  16:    */     } else {
/*  17: 30 */       localbec = localbec.a(a, awr.b);
/*  18:    */     }
/*  19: 32 */     j(localbec.a(M, bbg.a));
/*  20: 33 */     a(akf.b);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  24:    */   {
/*  25: 39 */     return alq.a(aty.U);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public alq b(aqu paramaqu, dt paramdt)
/*  29:    */   {
/*  30: 44 */     return alq.a(aty.U);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String b(int paramInt)
/*  34:    */   {
/*  35: 49 */     return super.a() + "." + bbg.a(paramInt).c();
/*  36:    */   }
/*  37:    */   
/*  38:    */   public bex l()
/*  39:    */   {
/*  40: 54 */     return M;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Object a(amj paramamj)
/*  44:    */   {
/*  45: 59 */     return bbg.a(paramamj.i() & 0x7);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  49:    */   {
/*  50: 64 */     if (paramalq == alq.a(aty.T)) {
/*  51: 65 */       return;
/*  52:    */     }
/*  53: 68 */     for (bbg localbbg : bbg.values()) {
/*  54: 69 */       if (localbbg != bbg.c) {
/*  55: 72 */         paramList.add(new amj(paramalq, 1, localbbg.a()));
/*  56:    */       }
/*  57:    */     }
/*  58:    */   }
/*  59:    */   
/*  60:    */   public bec a(int paramInt)
/*  61:    */   {
/*  62: 78 */     bec localbec = P().a(M, bbg.a(paramInt & 0x7));
/*  63: 80 */     if (j()) {
/*  64: 81 */       localbec = localbec.a(b, Boolean.valueOf((paramInt & 0x8) != 0));
/*  65:    */     } else {
/*  66: 83 */       localbec = localbec.a(a, (paramInt & 0x8) == 0 ? awr.b : awr.a);
/*  67:    */     }
/*  68: 86 */     return localbec;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public int c(bec parambec)
/*  72:    */   {
/*  73: 91 */     int i = 0;
/*  74:    */     
/*  75: 93 */     i |= ((bbg)parambec.b(M)).a();
/*  76: 95 */     if (j())
/*  77:    */     {
/*  78: 96 */       if (((Boolean)parambec.b(b)).booleanValue()) {
/*  79: 97 */         i |= 0x8;
/*  80:    */       }
/*  81:    */     }
/*  82:100 */     else if (parambec.b(a) == awr.a) {
/*  83:101 */       i |= 0x8;
/*  84:    */     }
/*  85:105 */     return i;
/*  86:    */   }
/*  87:    */   
/*  88:    */   protected bed e()
/*  89:    */   {
/*  90:110 */     if (j()) {
/*  91:111 */       return new bed(this, new bex[] { b, M });
/*  92:    */     }
/*  93:114 */     return new bed(this, new bex[] { a, M });
/*  94:    */   }
/*  95:    */   
/*  96:    */   public int a(bec parambec)
/*  97:    */   {
/*  98:119 */     return ((bbg)parambec.b(M)).a();
/*  99:    */   }
/* 100:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbf
 * JD-Core Version:    0.7.0.1
 */