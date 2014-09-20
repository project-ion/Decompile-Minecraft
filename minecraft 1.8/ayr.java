/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class ayr
/*  4:   */   extends axm
/*  5:   */ {
/*  6:14 */   public static final bev b = bev.a("variant", ayx.class, new ays());
/*  7:   */   
/*  8:   */   public ayr()
/*  9:   */   {
/* 10:22 */     j(this.L.b().a(b, ayx.a).a(a, axo.b));
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(alq paramalq, akf paramakf, List paramList)
/* 14:   */   {
/* 15:27 */     paramList.add(new amj(paramalq, 1, ayx.a.a()));
/* 16:28 */     paramList.add(new amj(paramalq, 1, ayx.b.a()));
/* 17:29 */     paramList.add(new amj(paramalq, 1, ayx.c.a()));
/* 18:30 */     paramList.add(new amj(paramalq, 1, ayx.d.a()));
/* 19:   */   }
/* 20:   */   
/* 21:   */   public bec a(int paramInt)
/* 22:   */   {
/* 23:35 */     bec localbec = P().a(b, ayx.a((paramInt & 0x3) % 4));
/* 24:38 */     switch (paramInt & 0xC)
/* 25:   */     {
/* 26:   */     case 0: 
/* 27:40 */       localbec = localbec.a(a, axo.b);
/* 28:41 */       break;
/* 29:   */     case 4: 
/* 30:43 */       localbec = localbec.a(a, axo.a);
/* 31:44 */       break;
/* 32:   */     case 8: 
/* 33:46 */       localbec = localbec.a(a, axo.c);
/* 34:47 */       break;
/* 35:   */     default: 
/* 36:49 */       localbec = localbec.a(a, axo.d);
/* 37:   */     }
/* 38:53 */     return localbec;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int c(bec parambec)
/* 42:   */   {
/* 43:58 */     int i = 0;
/* 44:   */     
/* 45:60 */     i |= ((ayx)parambec.b(b)).a();
/* 46:62 */     switch (ayt.a[((axo)parambec.b(a)).ordinal()])
/* 47:   */     {
/* 48:   */     case 1: 
/* 49:64 */       i |= 0x4;
/* 50:65 */       break;
/* 51:   */     case 2: 
/* 52:67 */       i |= 0x8;
/* 53:68 */       break;
/* 54:   */     case 3: 
/* 55:70 */       i |= 0xC;
/* 56:   */     }
/* 57:74 */     return i;
/* 58:   */   }
/* 59:   */   
/* 60:   */   protected bed e()
/* 61:   */   {
/* 62:79 */     return new bed(this, new bex[] { b, a });
/* 63:   */   }
/* 64:   */   
/* 65:   */   protected amj i(bec parambec)
/* 66:   */   {
/* 67:84 */     return new amj(alq.a(this), 1, ((ayx)parambec.b(b)).a());
/* 68:   */   }
/* 69:   */   
/* 70:   */   public int a(bec parambec)
/* 71:   */   {
/* 72:89 */     return ((ayx)parambec.b(b)).a();
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayr
 * JD-Core Version:    0.7.0.1
 */