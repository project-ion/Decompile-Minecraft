/*   1:    */ public class ate
/*   2:    */   extends atb
/*   3:    */ {
/*   4:    */   public ate()
/*   5:    */   {
/*   6:120 */     j(this.L.b().a(a, ej.c));
/*   7:    */   }
/*   8:    */   
/*   9:    */   public void a(ard paramard, dt paramdt)
/*  10:    */   {
/*  11:125 */     ej localej = (ej)paramard.p(paramdt).b(a);
/*  12:    */     
/*  13:127 */     float f1 = 0.0F;
/*  14:128 */     float f2 = 0.78125F;
/*  15:129 */     float f3 = 0.0F;
/*  16:130 */     float f4 = 1.0F;
/*  17:    */     
/*  18:132 */     float f5 = 0.125F;
/*  19:    */     
/*  20:134 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  21:136 */     switch (atc.a[localej.ordinal()])
/*  22:    */     {
/*  23:    */     case 1: 
/*  24:    */     default: 
/*  25:139 */       a(f3, f1, 1.0F - f5, f4, f2, 1.0F);
/*  26:140 */       break;
/*  27:    */     case 2: 
/*  28:142 */       a(f3, f1, 0.0F, f4, f2, f5);
/*  29:143 */       break;
/*  30:    */     case 3: 
/*  31:145 */       a(1.0F - f5, f1, f3, 1.0F, f2, f4);
/*  32:146 */       break;
/*  33:    */     case 4: 
/*  34:148 */       a(0.0F, f1, f3, f5, f2, f4);
/*  35:    */     }
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  39:    */   {
/*  40:155 */     ej localej = (ej)parambec.b(a);
/*  41:157 */     if (!paramaqu.p(paramdt.a(localej.d())).c().r().a())
/*  42:    */     {
/*  43:158 */       b(paramaqu, paramdt, parambec, 0);
/*  44:159 */       paramaqu.g(paramdt);
/*  45:    */     }
/*  46:162 */     super.a(paramaqu, paramdt, parambec, paramatr);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public bec a(int paramInt)
/*  50:    */   {
/*  51:167 */     ej localej = ej.a(paramInt);
/*  52:168 */     if (localej.k() == el.b) {
/*  53:169 */       localej = ej.c;
/*  54:    */     }
/*  55:171 */     return P().a(a, localej);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public int c(bec parambec)
/*  59:    */   {
/*  60:176 */     return ((ej)parambec.b(a)).a();
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected bed e()
/*  64:    */   {
/*  65:181 */     return new bed(this, new bex[] { a });
/*  66:    */   }
/*  67:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ate
 * JD-Core Version:    0.7.0.1
 */