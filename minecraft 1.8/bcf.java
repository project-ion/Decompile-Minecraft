/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class bcf
/*   5:    */   extends awq
/*   6:    */ {
/*   7: 19 */   public static final bev b = bev.a("variant", ayx.class);
/*   8:    */   
/*   9:    */   public bcf()
/*  10:    */   {
/*  11: 22 */     super(bof.d);
/*  12: 23 */     bec localbec = this.L.b();
/*  13: 24 */     if (!j()) {
/*  14: 25 */       localbec = localbec.a(a, awr.b);
/*  15:    */     }
/*  16: 27 */     j(localbec.a(b, ayx.a));
/*  17: 28 */     a(akf.b);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  21:    */   {
/*  22: 34 */     return alq.a(aty.bM);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public alq b(aqu paramaqu, dt paramdt)
/*  26:    */   {
/*  27: 39 */     return alq.a(aty.bM);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String b(int paramInt)
/*  31:    */   {
/*  32: 44 */     return super.a() + "." + ayx.a(paramInt).c();
/*  33:    */   }
/*  34:    */   
/*  35:    */   public bex l()
/*  36:    */   {
/*  37: 49 */     return b;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public Object a(amj paramamj)
/*  41:    */   {
/*  42: 54 */     return ayx.a(paramamj.i() & 0x7);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  46:    */   {
/*  47: 59 */     if (paramalq == alq.a(aty.bL)) {
/*  48: 60 */       return;
/*  49:    */     }
/*  50: 63 */     for (ayx localayx : ayx.values()) {
/*  51: 64 */       paramList.add(new amj(paramalq, 1, localayx.a()));
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public bec a(int paramInt)
/*  56:    */   {
/*  57: 70 */     bec localbec = P().a(b, ayx.a(paramInt & 0x7));
/*  58: 72 */     if (!j()) {
/*  59: 73 */       localbec = localbec.a(a, (paramInt & 0x8) == 0 ? awr.b : awr.a);
/*  60:    */     }
/*  61: 76 */     return localbec;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public int c(bec parambec)
/*  65:    */   {
/*  66: 81 */     int i = 0;
/*  67:    */     
/*  68: 83 */     i |= ((ayx)parambec.b(b)).a();
/*  69: 85 */     if ((!j()) && (parambec.b(a) == awr.a)) {
/*  70: 86 */       i |= 0x8;
/*  71:    */     }
/*  72: 89 */     return i;
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected bed e()
/*  76:    */   {
/*  77: 94 */     if (j()) {
/*  78: 95 */       return new bed(this, new bex[] { b });
/*  79:    */     }
/*  80: 98 */     return new bed(this, new bex[] { a, b });
/*  81:    */   }
/*  82:    */   
/*  83:    */   public int a(bec parambec)
/*  84:    */   {
/*  85:103 */     return ((ayx)parambec.b(b)).a();
/*  86:    */   }
/*  87:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcf
 * JD-Core Version:    0.7.0.1
 */